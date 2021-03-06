package com.p683ss.video.rtc.engine.adapter;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import com.p683ss.video.rtc.engine.NativeFunctions;
import com.p683ss.video.rtc.engine.RtcEngine;
import com.p683ss.video.rtc.engine.mediaio.IFrameRender;
import com.p683ss.video.rtc.engine.mediaio.IVideoSink;
import com.p683ss.video.rtc.engine.utils.RtcRunnable;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrame.I420Buffer;

/* renamed from: com.ss.video.rtc.engine.adapter.VideoSinkAdapter */
public class VideoSinkAdapter implements IFrameRender, IVideoSink {
    private VideoFrameConverter frameConverter;
    private boolean hasInitialized;
    private boolean hasStarted;
    public IVideoSink mIVideoSinkImpl;
    private boolean mIsScreen;
    private boolean mIsStop = true;
    private boolean mIsVideoSinkInitialized;
    private RGBATextureGenHelper mRGBATextureGenHelper;
    private String mUid;
    private WorkerThread mWorkerThread;

    /* renamed from: com.ss.video.rtc.engine.adapter.VideoSinkAdapter$WorkerThread */
    class WorkerThread extends HandlerThread {
        private CountDownLatch mCountDownLatch = new CountDownLatch(1);
        public Handler mHandler;

        public void await() {
            try {
                this.mCountDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }

        public synchronized void start() {
            super.start();
        }

        /* access modifiers changed from: protected */
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.mHandler = new Handler(getLooper());
            this.mCountDownLatch.countDown();
        }

        public void post2Worker(Runnable runnable) {
            if (this.mHandler != null && isAlive()) {
                this.mHandler.post(runnable);
            }
        }

        public WorkerThread(String str) {
            super(str);
        }
    }

    public String getUid() {
        return this.mUid;
    }

    public IVideoSink getmIVideoSinkImpl() {
        return this.mIVideoSinkImpl;
    }

    public boolean isScreen() {
        return this.mIsScreen;
    }

    public int getBufferType() {
        return this.mIVideoSinkImpl.getBufferType();
    }

    public EGLContext getEGLContextHandle() {
        return this.mIVideoSinkImpl.getEGLContextHandle();
    }

    public int getPixelFormat() {
        return this.mIVideoSinkImpl.getPixelFormat();
    }

    public boolean isStop() {
        if (!this.hasStarted) {
            return true;
        }
        return false;
    }

    public boolean onInitialize() {
        if (this.mIVideoSinkImpl == null) {
            return false;
        }
        if (this.mIsVideoSinkInitialized) {
            this.hasInitialized = true;
        } else {
            this.hasInitialized = this.mIVideoSinkImpl.onInitialize();
        }
        return true;
    }

    public void onDispose() {
        if (!(this.mIsVideoSinkInitialized || this.mIVideoSinkImpl == null || RtcEngine.getNativeEngineHandler() == -1)) {
            NativeFunctions.nativeInvokeWorkerUninterruptibly(RtcEngine.getNativeEngineHandler(), new RtcRunnable() {
                public void run() {
                    try {
                        VideoSinkAdapter.this.mIVideoSinkImpl.onDispose();
                    } catch (Exception unused) {
                    }
                }
            });
        }
        this.hasStarted = false;
        this.hasInitialized = false;
    }

    public void onStop() {
        if (this.hasInitialized && this.mIVideoSinkImpl != null) {
            if (!this.mIsVideoSinkInitialized && RtcEngine.getNativeEngineHandler() != -1) {
                NativeFunctions.nativeInvokeWorkerUninterruptibly(RtcEngine.getNativeEngineHandler(), new RtcRunnable() {
                    public void run() {
                        try {
                            VideoSinkAdapter.this.mIVideoSinkImpl.onStop();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
            this.hasStarted = false;
            if (this.mWorkerThread != null) {
                this.mWorkerThread.quit();
            }
            this.mRGBATextureGenHelper.release();
            this.frameConverter = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoSinkAdapter{mIsStop=");
        sb.append(!this.hasStarted);
        sb.append("mUid=");
        sb.append(this.mUid);
        sb.append("mIsScreen=");
        sb.append(this.mIsScreen);
        sb.append('}');
        return sb.toString();
    }

    public boolean onStart() {
        if (!this.hasInitialized || this.mIVideoSinkImpl == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("VideoSinkAdapterWorker-");
        sb.append(this.mUid);
        this.mWorkerThread = new WorkerThread(sb.toString());
        this.mRGBATextureGenHelper = new RGBATextureGenHelper(getEGLContextHandle());
        this.frameConverter = new VideoFrameConverter();
        if (this.mIsVideoSinkInitialized) {
            this.hasStarted = true;
        } else {
            this.hasStarted = this.mIVideoSinkImpl.onStart();
        }
        if (this.hasStarted && !this.mWorkerThread.isAlive()) {
            this.mWorkerThread.start();
            this.mWorkerThread.await();
        }
        return this.hasStarted;
    }

    public void onVideoFrame(VideoFrame videoFrame) {
        I420Buffer i420Buffer;
        VideoFrame videoFrame2 = videoFrame;
        if (this.hasInitialized && this.hasStarted && this.mIVideoSinkImpl != null && this.mWorkerThread != null && this.mWorkerThread.isAlive()) {
            ByteBuffer extendedData = videoFrame.getExtendedData();
            long timestampNs = videoFrame.getTimestampNs();
            switch (getBufferType()) {
                case 0:
                    boolean z = true;
                    if (1 != getPixelFormat()) {
                        if (getPixelFormat() != 0) {
                            if (3 == getPixelFormat()) {
                                int width = videoFrame.getBuffer().getWidth();
                                int height = videoFrame.getBuffer().getHeight();
                                if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
                                    i420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
                                    z = false;
                                } else {
                                    i420Buffer = videoFrame.getBuffer().toI420();
                                    videoFrame.getBuffer().release();
                                }
                                byte[] bArr = new byte[i420Buffer.getDataY().capacity()];
                                i420Buffer.getDataY().get(bArr);
                                byte[] bArr2 = new byte[i420Buffer.getDataU().capacity()];
                                i420Buffer.getDataU().get(bArr2);
                                byte[] bArr3 = new byte[i420Buffer.getDataV().capacity()];
                                i420Buffer.getDataV().get(bArr3);
                                int strideY = i420Buffer.getStrideY();
                                int strideU = i420Buffer.getStrideU();
                                int strideV = i420Buffer.getStrideV();
                                if ((i420Buffer instanceof JavaI420Buffer) && z) {
                                    i420Buffer.release();
                                }
                                WorkerThread workerThread = this.mWorkerThread;
                                VideoSinkAdapter$$Lambda$3 videoSinkAdapter$$Lambda$3 = r0;
                                VideoSinkAdapter$$Lambda$3 videoSinkAdapter$$Lambda$32 = new VideoSinkAdapter$$Lambda$3(this, bArr, bArr2, bArr3, strideY, strideU, strideV, width, height, videoFrame, timestampNs, extendedData);
                                workerThread.post2Worker(videoSinkAdapter$$Lambda$3);
                                break;
                            }
                        } else {
                            ByteBufferHolder convert2YUV = this.frameConverter.convert2YUV(videoFrame2);
                            if (convert2YUV != null) {
                                WorkerThread workerThread2 = this.mWorkerThread;
                                VideoSinkAdapter$$Lambda$2 videoSinkAdapter$$Lambda$2 = new VideoSinkAdapter$$Lambda$2(this, convert2YUV, extendedData, videoFrame, timestampNs);
                                workerThread2.post2Worker(videoSinkAdapter$$Lambda$2);
                                return;
                            }
                        }
                    } else {
                        ByteBufferHolder convert2YUV2 = this.frameConverter.convert2YUV(videoFrame2);
                        if (convert2YUV2 != null) {
                            WorkerThread workerThread3 = this.mWorkerThread;
                            VideoSinkAdapter$$Lambda$1 videoSinkAdapter$$Lambda$1 = new VideoSinkAdapter$$Lambda$1(this, convert2YUV2, extendedData, videoFrame, timestampNs);
                            workerThread3.post2Worker(videoSinkAdapter$$Lambda$1);
                            return;
                        }
                    }
                    break;
                case 1:
                    ByteBufferHolder convert2YUV3 = this.frameConverter.convert2YUV(videoFrame2);
                    if (convert2YUV3 != null) {
                        WorkerThread workerThread4 = this.mWorkerThread;
                        VideoSinkAdapter$$Lambda$0 videoSinkAdapter$$Lambda$0 = new VideoSinkAdapter$$Lambda$0(this, convert2YUV3, videoFrame, extendedData, timestampNs);
                        workerThread4.post2Worker(videoSinkAdapter$$Lambda$0);
                        return;
                    }
                    break;
            }
        }
    }

    public VideoSinkAdapter(IVideoSink iVideoSink, String str, boolean z) {
        this.mIVideoSinkImpl = iVideoSink;
        this.mUid = str;
        this.mIsScreen = z;
    }

    public VideoSinkAdapter(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        this.mIVideoSinkImpl = iVideoSink;
        this.mUid = str;
        this.mIsScreen = z;
        this.mIsVideoSinkInitialized = z2;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onVideoFrame$1$VideoSinkAdapter(ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, VideoFrame videoFrame, long j) {
        consumeByteArrayFrame(byteBufferHolder.getArray(), byteBuffer, 0, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), j);
        byteBufferHolder.setPending(false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onVideoFrame$2$VideoSinkAdapter(ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, VideoFrame videoFrame, long j) {
        consumeByteBufferFrame(byteBufferHolder.getByteBuffer(), byteBuffer, 0, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), j);
        byteBufferHolder.setPending(false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onVideoFrame$0$VideoSinkAdapter(ByteBufferHolder byteBufferHolder, VideoFrame videoFrame, ByteBuffer byteBuffer, long j) {
        int convertYUVByteArray2Texture = this.mRGBATextureGenHelper.convertYUVByteArray2Texture(byteBufferHolder.getArray(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight());
        ByteBufferHolder byteBufferHolder2 = byteBufferHolder;
        byteBufferHolder.setPending(false);
        consumeTextureFrame(convertYUVByteArray2Texture, byteBuffer, 1, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), j, this.mRGBATextureGenHelper.getTransformMatrix());
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mIVideoSinkImpl != null) {
            this.mIVideoSinkImpl.consumeByteArrayFrame(bArr, byteBuffer, i, i2, i3, i4, j);
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        if (this.mIVideoSinkImpl != null) {
            this.mIVideoSinkImpl.consumeByteBufferFrame(byteBuffer, byteBuffer2, i, i2, i3, i4, j);
        }
    }

    public void consumeTextureFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (this.mIVideoSinkImpl != null) {
            this.mIVideoSinkImpl.consumeTextureFrame(i, byteBuffer, i2, i3, i4, i5, j, fArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onVideoFrame$3$VideoSinkAdapter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, VideoFrame videoFrame, long j, ByteBuffer byteBuffer) {
        consumeYUVByteArrayFrame(bArr, bArr2, bArr3, i, i2, i3, i4, i5, videoFrame.getRotation(), j, byteBuffer);
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, ByteBuffer byteBuffer) {
        if (this.mIVideoSinkImpl != null) {
            this.mIVideoSinkImpl.consumeYUVByteArrayFrame(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, j, byteBuffer);
        }
    }
}
