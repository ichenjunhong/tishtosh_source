package org.webrtc;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.bytedance.realx.RXVideoSurfaceController;
import com.bytedance.realx.base.RXLogging;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14.Context;
import org.webrtc.EncodedImage.FrameType;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.CodecSpecificInfo;
import org.webrtc.VideoEncoder.ScaleMode;
import org.webrtc.VideoEncoder.ScalingSettings;
import org.webrtc.VideoEncoder.Settings;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;

class HardwareVideoEncoder implements VideoEncoder {
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private Callback callback;
    private MediaCodecWrapper codec;
    private final RXVideoCodecDesc codecDesc;
    private final String codecName;
    private ByteBuffer configBuffer;
    private final ThreadChecker encodeThreadChecker = new ThreadChecker();
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private final ThreadChecker outputThreadChecker = new ThreadChecker();
    public volatile boolean running;
    private ScaleMode scaleMode;
    private Settings settings;
    private final Context sharedContext;
    private volatile Exception shutdownException;
    private final Integer surfaceColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;

    enum YuvFormat {
        I420 {
            /* access modifiers changed from: 0000 */
            public final void fillBuffer(ByteBuffer byteBuffer, Buffer buffer) {
                I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            /* access modifiers changed from: 0000 */
            public final void fillBuffer(ByteBuffer byteBuffer, Buffer buffer) {
                I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract void fillBuffer(ByteBuffer byteBuffer, Buffer buffer);

        static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            StringBuilder sb = new StringBuilder("Unsupported colorFormat: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private Thread createOutputThread() {
        return new Thread("video_encoded_thread") {
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private boolean canUseSurface() {
        if (this.sharedContext == null || this.surfaceColorFormat == null) {
            return false;
        }
        return true;
    }

    public VideoCodecStatus requestKeyFrame() {
        requestKeyFrame(System.currentTimeMillis());
        return VideoCodecStatus.OK;
    }

    public ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            if (this.codecDesc.getStandard() == RXVideoCodecStandard.VP8) {
                return new ScalingSettings(29, 95);
            }
            if (this.codecDesc.getStandard() == RXVideoCodecStandard.VP8) {
                return new ScalingSettings(24, 37);
            }
        }
        return ScalingSettings.OFF;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.m25467d("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            RXLogging.m25469e("HardwareVideoEncoder", "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            RXLogging.m25469e("HardwareVideoEncoder", "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        RXLogging.m25467d("HardwareVideoEncoder", "Release on output thread done");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoCodecStatus release() {
        /*
            r3 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r3.encodeThreadChecker
            r0.checkIsOnValidThread()
            java.lang.Thread r0 = r3.outputThread
            if (r0 == 0) goto L_0x0030
            r0 = 0
            r3.running = r0
            java.lang.Thread r0 = r3.outputThread
            r1 = 5000(0x1388, double:2.4703E-320)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r0, r1)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder release timeout"
            com.bytedance.realx.base.RXLogging.m25468e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.TIMEOUT
            goto L_0x0032
        L_0x0020:
            java.lang.Exception r0 = r3.shutdownException
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder release exception"
            java.lang.Exception r2 = r3.shutdownException
            com.bytedance.realx.base.RXLogging.m25469e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            goto L_0x0032
        L_0x0030:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
        L_0x0032:
            org.webrtc.GlRectDrawer r1 = r3.textureDrawer
            r1.release()
            org.webrtc.VideoFrameDrawer r1 = r3.videoFrameDrawer
            r1.release()
            org.webrtc.EglBase14 r1 = r3.textureEglBase
            r2 = 0
            if (r1 == 0) goto L_0x0048
            org.webrtc.EglBase14 r1 = r3.textureEglBase
            r1.release()
            r3.textureEglBase = r2
        L_0x0048:
            android.view.Surface r1 = r3.textureInputSurface
            if (r1 == 0) goto L_0x0053
            android.view.Surface r1 = r3.textureInputSurface
            r1.release()
            r3.textureInputSurface = r2
        L_0x0053:
            r3.codec = r2
            r3.outputThread = r2
            org.webrtc.ThreadUtils$ThreadChecker r1 = r3.encodeThreadChecker
            r1.detachThread()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.release():org.webrtc.VideoCodecStatus");
    }

    private VideoCodecStatus initEncodeInternal() {
        Integer num;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            if (this.useSurfaceMode) {
                num = this.surfaceColorFormat;
            } else {
                num = this.yuvColorFormat;
            }
            int intValue = num.intValue();
            try {
                RXVideoCodecStandard standard = this.codecDesc.getStandard();
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(standard.mimeType(), this.width, this.height);
                createVideoFormat.setInteger("bitrate", this.settings.targetBps);
                createVideoFormat.setInteger("bitrate-mode", 1);
                createVideoFormat.setInteger("color-format", intValue);
                createVideoFormat.setInteger("frame-rate", this.settings.targetFps);
                createVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                createVideoFormat.setInteger("max-bframes", 0);
                if (standard == RXVideoCodecStandard.H264) {
                    RXVideoCodecProfile profile = this.codecDesc.getProfile();
                    switch (profile) {
                        case ProfileHigh:
                        case ProfileConstrainedHigh:
                            RXLogging.m25471w("HardwareVideoEncoder", "setting high profile ");
                            createVideoFormat.setInteger("profile", 8);
                            createVideoFormat.setInteger("level", UnReadVideoExperiment.BROWSE_RECORD_LIST);
                            break;
                        case ProfileBaseline:
                        case ProfileConstrainedBaseline:
                        case ProfileMain:
                            RXLogging.m25471w("HardwareVideoEncoder", "setting baseline profile ");
                            createVideoFormat.setInteger("profile", 1);
                            createVideoFormat.setInteger("level", UnReadVideoExperiment.BROWSE_RECORD_LIST);
                            break;
                        default:
                            String str = "HardwareVideoEncoder";
                            StringBuilder sb = new StringBuilder("Unknown profile level id: ");
                            sb.append(profile);
                            sb.append("default to baseline profile");
                            RXLogging.m25471w(str, sb.toString());
                            createVideoFormat.setInteger("profile", 1);
                            createVideoFormat.setInteger("level", UnReadVideoExperiment.BROWSE_RECORD_LIST);
                            break;
                    }
                }
                StringBuilder sb2 = new StringBuilder("Format: ");
                sb2.append(createVideoFormat);
                RXLogging.m25468e("HardwareVideoEncoder", sb2.toString());
                this.codec.configure(createVideoFormat, null, null, 1);
                if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    RXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
                } else if (this.useSurfaceMode) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    this.textureEglBase = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    this.textureEglBase.createSurface(this.textureInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                this.outputThread = createOutputThread();
                this.outputThread.start();
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                RXLogging.m25469e("HardwareVideoEncoder", "initEncodeInternal failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder("Cannot create media encoder ");
            sb3.append(this.codecName);
            RXLogging.m25469e("HardwareVideoEncoder", sb3.toString(), e2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverEncodedImage() {
        ByteBuffer byteBuffer;
        FrameType frameType;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, LeakDetectorInstaller.MAX_POLL_TIME);
            if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.codec.getOutputFormat();
                StringBuilder sb = new StringBuilder("output format changed: ");
                sb.append(outputFormat.toString());
                RXLogging.m25467d("HardwareVideoEncoder", sb.toString());
            } else if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer == -3 || dequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = this.codec.getOutputBuffers()[dequeueOutputBuffer];
                    byteBuffer2.position(bufferInfo.offset);
                    byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                    if ((bufferInfo.flags & 2) != 0) {
                        StringBuilder sb2 = new StringBuilder("Config frame generated. Offset: ");
                        sb2.append(bufferInfo.offset);
                        sb2.append(". Size: ");
                        sb2.append(bufferInfo.size);
                        RXLogging.m25467d("HardwareVideoEncoder", sb2.toString());
                        this.configBuffer = ByteBuffer.allocateDirect(bufferInfo.size);
                        this.configBuffer.put(byteBuffer2);
                    } else {
                        boolean z = true;
                        if ((bufferInfo.flags & 1) == 0) {
                            z = false;
                        }
                        if (z) {
                            RXLogging.m25467d("HardwareVideoEncoder", "Sync frame generated");
                        }
                        if (!z || this.codecDesc.getStandard() != RXVideoCodecStandard.H264) {
                            byteBuffer = byteBuffer2.slice();
                        } else {
                            StringBuilder sb3 = new StringBuilder("Prepending config frame of size ");
                            sb3.append(this.configBuffer.capacity());
                            sb3.append(" to output buffer with offset ");
                            sb3.append(bufferInfo.offset);
                            sb3.append(", size ");
                            sb3.append(bufferInfo.size);
                            RXLogging.m25467d("HardwareVideoEncoder", sb3.toString());
                            byteBuffer = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                            this.configBuffer.rewind();
                            byteBuffer.put(this.configBuffer);
                            byteBuffer.put(byteBuffer2);
                            byteBuffer.rewind();
                        }
                        if (z) {
                            frameType = FrameType.VideoFrameKey;
                        } else {
                            frameType = FrameType.VideoFrameDelta;
                        }
                        this.callback.onEncodedFrame(EncodedImage.builder().setEncodedWidth(this.width).setEncodedHeight(this.height).setCaptureTimeNs(bufferInfo.presentationTimeUs * 1000).setBuffer(byteBuffer).setFrameType(frameType).createEncodedImage(), new CodecSpecificInfo());
                    }
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("should not be here: index:");
                sb4.append(dequeueOutputBuffer);
                RXLogging.m25468e("HardwareVideoEncoder", sb4.toString());
            }
        } catch (Exception e) {
            RXLogging.m25469e("HardwareVideoEncoder", "deliverOutput failed", e);
        }
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.forcedKeyFrameNs <= 0 || j <= this.lastKeyFrameNs + this.forcedKeyFrameNs) {
            return false;
        }
        return true;
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m25469e("HardwareVideoEncoder", "encodeTexture failed", e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (Exception e) {
            RXLogging.m25469e("HardwareVideoEncoder", "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus updateBitrate(int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m25469e("HardwareVideoEncoder", "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    /* access modifiers changed from: protected */
    public void fillInputBuffer(ByteBuffer byteBuffer, Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    public VideoCodecStatus setRateAllocation(int i, int i2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        updateBitrate(i);
        return VideoCodecStatus.OK;
    }

    public VideoCodecStatus encode(VideoFrame videoFrame, boolean z) {
        boolean z2;
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        Buffer buffer = videoFrame.getBuffer();
        boolean z3 = buffer instanceof TextureBuffer;
        int width2 = videoFrame.getBuffer().getWidth();
        int height2 = videoFrame.getBuffer().getHeight();
        if (!canUseSurface() || !z3) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != this.useSurfaceMode) {
            VideoCodecStatus resetCodec = resetCodec(width2, height2, z2);
            if (resetCodec != VideoCodecStatus.OK) {
                return resetCodec;
            }
        }
        if (z) {
            RXLogging.m25467d("HardwareVideoEncoder", "***** Request key frame ****");
        }
        if (z || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int height3 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
        if (this.useSurfaceMode) {
            this.textureEglBase.makeCurrent();
            videoCodecStatus = encodeTextureBuffer(videoFrame);
        } else {
            videoCodecStatus = encodeByteBuffer(videoFrame, buffer, height3);
        }
        return videoCodecStatus;
    }

    public VideoCodecStatus initEncode(Settings settings2, Callback callback2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback2;
        this.automaticResizeOn = true;
        this.width = settings2.width;
        this.height = settings2.height;
        this.scaleMode = settings2.scaleMode;
        if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            RXLogging.m25468e("HardwareVideoEncoder", "using pass surface mode");
            this.useSurfaceMode = true;
        } else {
            this.useSurfaceMode = canUseSurface();
        }
        this.settings = settings2;
        StringBuilder sb = new StringBuilder("initEncode: ");
        sb.append(this.width);
        sb.append(" x ");
        sb.append(this.height);
        sb.append(". @ ");
        sb.append(settings2.targetBps);
        sb.append("kbps. Fps: ");
        sb.append(settings2.targetFps);
        sb.append(" Use surface mode: ");
        sb.append(this.useSurfaceMode);
        RXLogging.m25467d("HardwareVideoEncoder", sb.toString());
        return initEncodeInternal();
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long timestampNs = videoFrame.getTimestampNs() / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                RXLogging.m25467d("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (Exception e) {
                    RXLogging.m25469e("HardwareVideoEncoder", "queueInputBuffer failed", e);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Exception e2) {
                RXLogging.m25469e("HardwareVideoEncoder", "getInputBuffers failed", e2);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e3) {
            RXLogging.m25469e("HardwareVideoEncoder", "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, RXVideoCodecDesc rXVideoCodecDesc, Integer num, Integer num2, int i, int i2, Context context) {
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
        this.codecName = str;
        this.codecDesc = rXVideoCodecDesc;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i2);
        this.sharedContext = context;
        this.encodeThreadChecker.detachThread();
    }
}
