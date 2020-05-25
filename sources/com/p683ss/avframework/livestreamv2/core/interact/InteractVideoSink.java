package com.p683ss.avframework.livestreamv2.core.interact;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.avframework.buffer.GlTextureFrameBuffer;
import com.p683ss.avframework.buffer.TextureBufferImpl;
import com.p683ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p683ss.avframework.livestreamv2.IInputVideoStream;
import com.p683ss.avframework.livestreamv2.RenderView;
import com.p683ss.avframework.livestreamv2.core.ILayerControl;
import com.p683ss.avframework.livestreamv2.core.ILayerControl.ILayer;
import com.p683ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt;
import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.InteractEngine.SEIListener;
import com.p683ss.avframework.livestreamv2.core.LiveCore;
import com.p683ss.avframework.mixer.VideoMixer;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;
import com.p683ss.avframework.opengl.GLThreadManager;
import com.p683ss.avframework.opengl.GlRenderDrawer;
import com.p683ss.avframework.opengl.RendererCommon;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.ThreadUtils;
import com.p683ss.video.rtc.interact.model.CommonType.VideoOutputFormat;
import com.p683ss.video.rtc.interact.video.VideoSink;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink */
class InteractVideoSink implements ToI420Interface, VideoSink {
    public final InteractEngineBuilder mBuilder;
    private GlRenderDrawer mGlDrawer;
    protected int mHeight;
    private String mInteractId;
    private IInputVideoStream mOutVideoStream;
    private boolean mRelease;
    public ILayer mRenderLayer;
    private RenderView mRenderSink;
    private final int mRtcId;
    private SEIListener mSEIListener;
    private ByteBuffer mSeiBuffer;
    private boolean mSupportTexture;
    private GlTextureFrameBuffer mTextureFrameBuffer;
    public View mView;
    protected int mWidth;
    private ByteBuffer mYuvBuffer;
    private int[] mYuvTex = {0, 0, 0};

    public String getInteractId() {
        return this.mInteractId;
    }

    /* access modifiers changed from: 0000 */
    public IInputVideoStream getOutVideoStream() {
        return this.mOutVideoStream;
    }

    public EGLContext getEglContext() {
        if (!this.mSupportTexture) {
            return null;
        }
        return GLThreadManager.getEGLContext();
    }

    public long getEglContextNativeHandle() {
        if (!this.mSupportTexture) {
            return 0;
        }
        return GLThreadManager.getNativeEGLContext();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$release$0$InteractVideoSink() {
        AVLog.ioi("InteractVideoSink", "Release Yuv texture on InteractVideoSink.");
        releaseTextureOnGlThread();
    }

    private void releaseTextureOnGlThread() {
        releaseYuvTexturesOnGlThread();
        if (this.mGlDrawer != null) {
            this.mGlDrawer.release();
            this.mGlDrawer = null;
        }
        if (this.mTextureFrameBuffer != null) {
            this.mTextureFrameBuffer.release();
            this.mTextureFrameBuffer = null;
        }
    }

    private void releaseYuvTexturesOnGlThread() {
        if (this.mYuvTex[0] > 0) {
            GLES20.glDeleteTextures(this.mYuvTex.length, this.mYuvTex, 0);
            for (int i = 0; i < this.mYuvTex.length; i++) {
                this.mYuvTex[i] = 0;
            }
        }
    }

    public SurfaceView getSurfaceView() {
        if (this.mView != null && (this.mView instanceof SurfaceView)) {
            return (SurfaceView) this.mView;
        }
        return null;
    }

    public TextureView getTextureView() {
        if (this.mView != null && (this.mView instanceof TextureView)) {
            return (TextureView) this.mView;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void release() {
        this.mRelease = true;
        ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), (Runnable) new InteractVideoSink$$Lambda$0(this));
        if (this.mRenderSink != null) {
            this.mRenderSink.release();
            this.mRenderSink = null;
        }
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.stop();
            this.mOutVideoStream.release();
            this.mOutVideoStream = null;
        }
        if (this.mRenderLayer != null) {
            this.mRenderLayer.dispose();
            this.mRenderLayer = null;
        }
    }

    public I420Buffer toI420(TextureBuffer textureBuffer) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    private void createTexture(int i, int i2) {
        ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), (Runnable) new InteractVideoSink$$Lambda$2(this, i, i2));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$createTexture$2$InteractVideoSink(int i, int i2) {
        if (!this.mRelease) {
            if (this.mGlDrawer == null) {
                this.mGlDrawer = new GlRenderDrawer();
            }
            if (this.mTextureFrameBuffer != null) {
                this.mTextureFrameBuffer.setSize(i, i2);
            } else {
                this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
                this.mTextureFrameBuffer.setSize(i, i2);
            }
            int i3 = (i + 1) >> 1;
            int i4 = (i2 + 1) >> 1;
            releaseYuvTexturesOnGlThread();
            this.mYuvTex[0] = genTextureWithInit(33984, i, i2);
            this.mYuvTex[1] = genTextureWithInit(33985, i3, i4);
            this.mYuvTex[2] = genTextureWithInit(33986, i3, i4);
            this.mWidth = i;
            this.mHeight = i2;
        }
    }

    private int genTextureWithInit(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
        return iArr[0];
    }

    private boolean loadYuvAndDraw(ByteBuffer byteBuffer, int i, int i2, VideoOutputFormat videoOutputFormat) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.mTextureFrameBuffer == null || this.mGlDrawer == null || this.mYuvTex[0] <= 0) {
            return atomicBoolean.get();
        }
        Handler mainGlHandle = GLThreadManager.getMainGlHandle();
        InteractVideoSink$$Lambda$1 interactVideoSink$$Lambda$1 = new InteractVideoSink$$Lambda$1(this, byteBuffer, i, i2, videoOutputFormat, atomicBoolean);
        ThreadUtils.invokeAtFrontUninterruptibly(mainGlHandle, (Runnable) interactVideoSink$$Lambda$1);
        return atomicBoolean.get();
    }

    InteractVideoSink(final String str, boolean z, InteractEngine interactEngine, SEIListener sEIListener) {
        this.mInteractId = str;
        this.mSupportTexture = z;
        this.mBuilder = interactEngine.getBuilder();
        this.mRtcId = interactEngine.queryRtcId(str);
        this.mSEIListener = sEIListener;
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore != null && this.mBuilder.isClientMixer()) {
            this.mOutVideoStream = liveCore.createInputVideoStream();
            this.mOutVideoStream.start();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mBuilder.getWorkThreadHandler(), (Runnable) new Runnable() {
            public void run() {
                if (InteractVideoSink.this.mBuilder.isSingleViewMode()) {
                    LiveCore liveCore = InteractVideoSink.this.mBuilder.getLiveCore();
                    if (liveCore != null) {
                        ILayerControl layerControl = liveCore.getLayerControl();
                        if (layerControl != null) {
                            InteractVideoSink.this.mRenderLayer = layerControl.createLayer(str, null, InteractVideoSink.this.mBuilder.getLiveCoreBuilder().getVideoCaptureWidth(), InteractVideoSink.this.mBuilder.getLiveCoreBuilder().getVideoCaptureHeight());
                        }
                    }
                } else if (InteractVideoSink.this.mBuilder.isUsingTextureView()) {
                    InteractVideoSink.this.mView = new TextureView(InteractVideoSink.this.mBuilder.getLiveCoreBuilder().getContext());
                } else {
                    InteractVideoSink.this.mView = new SurfaceView(InteractVideoSink.this.mBuilder.getLiveCoreBuilder().getContext());
                }
            }
        });
        if (this.mView != null) {
            this.mRenderSink = new RenderView(this.mView);
        }
    }

    private void updateTexSubImage(int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$loadYuvAndDraw$1$InteractVideoSink(ByteBuffer byteBuffer, int i, int i2, VideoOutputFormat videoOutputFormat, AtomicBoolean atomicBoolean) {
        if (!this.mRelease) {
            int i3 = i * i2;
            if (byteBuffer.capacity() >= (i3 * 3) / 2 && videoOutputFormat == VideoOutputFormat.PIXEL_FORMAT_I420) {
                int i4 = i3 / 4;
                byteBuffer.position(0);
                byteBuffer.limit(i3);
                ByteBuffer slice = byteBuffer.slice();
                byteBuffer.position(i3);
                int i5 = i3 + i4;
                byteBuffer.limit(i5);
                ByteBuffer slice2 = byteBuffer.slice();
                byteBuffer.position(i5);
                byteBuffer.limit(i5 + i4);
                updateI420Image(this.mYuvTex, i, i2, slice, slice2, byteBuffer.slice(), null);
                this.mTextureFrameBuffer.setSize(i, i2);
                GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
                this.mGlDrawer.drawYuv(this.mYuvTex, RendererCommon.identityMatrix(), RendererCommon.identityMatrix(), 0, 0, i, i2);
                GLES20.glFinish();
                GLES20.glBindFramebuffer(36160, 0);
                atomicBoolean.set(true);
            }
        }
    }

    public void onByteBufferVideoFrame(ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i, int i2, int i3, long j) {
        onByteBufferVideoFrame(byteBuffer, videoOutputFormat, i, i2, i3, j, null);
    }

    public void onTextureVideoFrame(int i, VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j) {
        onTextureVideoFrame(i, videoOutputFormat, i2, i3, fArr, i4, j, null);
    }

    private void drawYuvAndRender(ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i, int i2, int i3, long j, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        VideoOutputFormat videoOutputFormat2 = videoOutputFormat;
        int i4 = i;
        int i5 = i2;
        if (loadYuvAndDraw(byteBuffer, i, i2, videoOutputFormat)) {
            GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
            if (glTextureFrameBuffer != null) {
                onTextureVideoFrame(glTextureFrameBuffer.getTextureId(), VideoOutputFormat.TEXTURE_2D, i, i2, null, i3, j, byteBuffer2);
            }
        }
    }

    private void updateI420Image(int[] iArr, int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int[] iArr2) {
        int i3 = (i + 1) >> 1;
        int i4 = (i2 + 1) >> 1;
        updateTexSubImage(33984, iArr[0], i, i2, byteBuffer);
        int i5 = i3;
        int i6 = i4;
        updateTexSubImage(33985, iArr[1], i5, i6, byteBuffer2);
        updateTexSubImage(33986, iArr[2], i5, i6, byteBuffer3);
    }

    public void onByteBufferVideoFrame(ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i, int i2, int i3, long j, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3;
        int i4 = i;
        int i5 = i2;
        if (!(this.mGlDrawer != null && i4 == this.mWidth && i5 == this.mHeight)) {
            createTexture(i, i2);
        }
        if (!byteBuffer.isDirect()) {
            if (this.mYuvBuffer == null) {
                this.mYuvBuffer = ByteBuffer.allocateDirect(byteBuffer.capacity());
            } else if (this.mYuvBuffer.capacity() < byteBuffer.capacity()) {
                this.mYuvBuffer = ByteBuffer.allocateDirect(byteBuffer.capacity());
            }
            ByteBuffer byteBuffer4 = byteBuffer;
            this.mYuvBuffer.put(byteBuffer);
            this.mYuvBuffer.position(0);
            this.mYuvBuffer.limit(byteBuffer.capacity());
            byteBuffer3 = this.mYuvBuffer.slice();
        } else {
            byteBuffer3 = byteBuffer;
        }
        drawYuvAndRender(byteBuffer3, videoOutputFormat, i, i2, i3, j, byteBuffer2);
    }

    public void onTextureVideoFrame(int i, VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j, ByteBuffer byteBuffer) {
        int i5;
        Matrix matrix;
        Matrix convertMatrixToAndroidGraphicsMatrix;
        int i6 = i4;
        ByteBuffer byteBuffer2 = byteBuffer;
        RenderView renderView = this.mRenderSink;
        ILayerExt iLayerExt = (ILayerExt) this.mRenderLayer;
        if (byteBuffer2 != null && !byteBuffer.isDirect()) {
            if (this.mSeiBuffer == null) {
                this.mSeiBuffer = ByteBuffer.allocateDirect(byteBuffer.capacity());
            } else if (this.mSeiBuffer.capacity() < byteBuffer.capacity()) {
                this.mSeiBuffer = ByteBuffer.allocateDirect(byteBuffer.capacity());
            }
            byteBuffer.rewind();
            this.mSeiBuffer.position(0);
            this.mSeiBuffer.limit(this.mSeiBuffer.capacity());
            this.mSeiBuffer.put(byteBuffer2);
            byteBuffer.rewind();
            this.mSeiBuffer.flip();
            byteBuffer2 = this.mSeiBuffer.slice();
        }
        ByteBuffer byteBuffer3 = byteBuffer2;
        SEIListener sEIListener = this.mSEIListener;
        if (sEIListener != null) {
            sEIListener.onReceiveSEI(this.mRtcId, this.mInteractId, i, i2, i3, fArr, i4, j, byteBuffer3);
        }
        if (renderView != null) {
            if (fArr == null) {
                convertMatrixToAndroidGraphicsMatrix = new Matrix();
            } else {
                convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
            }
            Matrix matrix2 = convertMatrixToAndroidGraphicsMatrix;
            matrix2.preTranslate(0.0f, 0.5f);
            matrix2.preScale(1.0f, -1.0f);
            matrix2.preTranslate(0.0f, -0.5f);
            RenderView renderView2 = renderView;
            i5 = i6;
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i2, i3, Type.RGB, i, matrix2, (ToI420Interface) this, (Runnable) new Runnable() {
                public void run() {
                }
            });
            renderView2.onFrame(new VideoFrame(textureBufferImpl, i5, 1000000 * j));
        } else {
            i5 = i6;
            if (iLayerExt != null) {
                VideoMixerTexture videoMixerTexture = new VideoMixerTexture(i2, i3, NormalGiftView.ALPHA_180, VideoMixer.TEXTURE_TYPE_2D, new int[]{i, 0, 0}, null);
                iLayerExt.renderFrame(videoMixerTexture);
            }
        }
        IInputVideoStream iInputVideoStream = this.mOutVideoStream;
        if (iInputVideoStream != null) {
            StringBuilder sb = new StringBuilder("onTextureVideoFrame from interact id ");
            sb.append(this.mInteractId);
            AVLog.logToIODevice2(4, "InteractVideoSink", sb.toString(), null, "InteractVideoSink.onTextureVideoFrame", 10000);
            if (fArr == null) {
                matrix = new Matrix();
            } else {
                matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
            }
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate((float) (i5 + NormalGiftView.ALPHA_180));
            matrix.preScale(-1.0f, 1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            iInputVideoStream.pushVideoFrame(i, false, i2, i3, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix), j * 1000);
        }
    }
}
