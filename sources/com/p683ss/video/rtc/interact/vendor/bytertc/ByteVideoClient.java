package com.p683ss.video.rtc.interact.vendor.bytertc;

import com.p683ss.video.rtc.engine.utils.ExtVideoFrame;
import com.p683ss.video.rtc.interact.model.CommonType.FrameFormat;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.render.ImageFrame;
import com.p683ss.video.rtc.interact.render.crop.ImageProcessorManager;
import com.p683ss.video.rtc.interact.video.VideoCallback;
import com.p683ss.video.rtc.interact.video.VideoClient;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoClientStatisic;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.video.rtc.interact.vendor.bytertc.ByteVideoClient */
public class ByteVideoClient implements VideoClientStatisic {
    public ByteVideoCallback mCallback;
    private VideoClientFactory mFactory;
    public ImageProcessorManager mFrameCropManager;
    private FrameFormat mFrameFormat;
    public int mInputHeight;
    public int mInputWidth;
    private VideoClient mParent;
    public float[] mTransform = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    public VideoQuality mVideoQuality;

    /* renamed from: com.ss.video.rtc.interact.vendor.bytertc.ByteVideoClient$2 */
    static /* synthetic */ class C517122 {

        /* renamed from: $SwitchMap$com$ss$video$rtc$interact$model$CommonType$FrameFormat */
        static final /* synthetic */ int[] f128982xe7e79ca1 = new int[FrameFormat.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.video.rtc.interact.model.CommonType$FrameFormat[] r0 = com.p683ss.video.rtc.interact.model.CommonType.FrameFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f128982xe7e79ca1 = r0
                int[] r0 = f128982xe7e79ca1     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.video.rtc.interact.model.CommonType$FrameFormat r1 = com.p683ss.video.rtc.interact.model.CommonType.FrameFormat.TEXTURE_OES     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f128982xe7e79ca1     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.video.rtc.interact.model.CommonType$FrameFormat r1 = com.p683ss.video.rtc.interact.model.CommonType.FrameFormat.TEXTURE_2D     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.vendor.bytertc.ByteVideoClient.C517122.<clinit>():void");
        }
    }

    /* renamed from: com.ss.video.rtc.interact.vendor.bytertc.ByteVideoClient$ByteVideoCallback */
    public interface ByteVideoCallback {
        boolean updateVideoFrame(ExtVideoFrame extVideoFrame);
    }

    public int getInputHeight() {
        return this.mInputHeight;
    }

    public int getInputWidth() {
        return this.mInputWidth;
    }

    public void start() {
        this.mParent.start();
    }

    public void stop() {
        this.mParent.stop();
    }

    public float getAvgVpsElapse() {
        if (this.mFrameCropManager == null) {
            return -1.0f;
        }
        return this.mFrameCropManager.getAvgVpsElapse();
    }

    public int getPixelFormat() {
        if (C517122.f128982xe7e79ca1[this.mFrameFormat.ordinal()] != 1) {
            return 10;
        }
        return 11;
    }

    public void prepare() {
        this.mParent = this.mFactory.create();
        this.mParent.prepare(new VideoCallback() {
            public boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
                if (ByteVideoClient.this.mInputWidth == 0) {
                    ByteVideoClient.this.mInputWidth = i2;
                }
                if (ByteVideoClient.this.mInputHeight == 0) {
                    ByteVideoClient.this.mInputHeight = i3;
                }
                if (ByteVideoClient.this.mFrameCropManager == null) {
                    if (eGLContext2 != null) {
                        ByteVideoClient.this.mFrameCropManager = new ImageProcessorManager(eGLContext2, ByteVideoClient.this.mVideoQuality.getWidth(), ByteVideoClient.this.mVideoQuality.getHeight());
                    } else if (eGLContext != null) {
                        ByteVideoClient.this.mFrameCropManager = new ImageProcessorManager(eGLContext, ByteVideoClient.this.mVideoQuality.getWidth(), ByteVideoClient.this.mVideoQuality.getHeight());
                    }
                }
                ImageFrame imageFrame = new ImageFrame(i, i2, i3, ByteVideoClient.this.mTransform);
                if (ByteVideoClient.this.mFrameCropManager != null) {
                    imageFrame = ByteVideoClient.this.mFrameCropManager.pushImageFrame(imageFrame);
                }
                ExtVideoFrame extVideoFrame = new ExtVideoFrame();
                extVideoFrame.format = ByteVideoClient.this.getPixelFormat();
                extVideoFrame.timeStamp = j * TimeUnit.MILLISECONDS.toNanos(1);
                extVideoFrame.stride = imageFrame.getWidth();
                extVideoFrame.height = imageFrame.getHeight();
                extVideoFrame.eglContext11 = eGLContext;
                extVideoFrame.eglContext14 = eGLContext2;
                extVideoFrame.textureID = imageFrame.getTextureID();
                extVideoFrame.syncMode = false;
                extVideoFrame.transform = imageFrame.getTransfromMatrix();
                return ByteVideoClient.this.mCallback.updateVideoFrame(extVideoFrame);
            }

            public boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j, ByteBuffer byteBuffer) {
                if (ByteVideoClient.this.mInputWidth == 0) {
                    ByteVideoClient.this.mInputWidth = i2;
                }
                if (ByteVideoClient.this.mInputHeight == 0) {
                    ByteVideoClient.this.mInputHeight = i3;
                }
                if (ByteVideoClient.this.mFrameCropManager == null) {
                    if (eGLContext2 != null) {
                        ByteVideoClient.this.mFrameCropManager = new ImageProcessorManager(eGLContext2, ByteVideoClient.this.mVideoQuality.getWidth(), ByteVideoClient.this.mVideoQuality.getHeight());
                    } else if (eGLContext != null) {
                        ByteVideoClient.this.mFrameCropManager = new ImageProcessorManager(eGLContext, ByteVideoClient.this.mVideoQuality.getWidth(), ByteVideoClient.this.mVideoQuality.getHeight());
                    }
                }
                ImageFrame imageFrame = new ImageFrame(i, i2, i3, ByteVideoClient.this.mTransform);
                if (ByteVideoClient.this.mFrameCropManager != null) {
                    imageFrame = ByteVideoClient.this.mFrameCropManager.pushImageFrame(imageFrame);
                }
                ExtVideoFrame extVideoFrame = new ExtVideoFrame();
                extVideoFrame.format = ByteVideoClient.this.getPixelFormat();
                extVideoFrame.timeStamp = j * TimeUnit.MILLISECONDS.toNanos(1);
                extVideoFrame.stride = imageFrame.getWidth();
                extVideoFrame.height = imageFrame.getHeight();
                extVideoFrame.eglContext11 = eGLContext;
                extVideoFrame.eglContext14 = eGLContext2;
                extVideoFrame.textureID = imageFrame.getTextureID();
                extVideoFrame.syncMode = false;
                extVideoFrame.transform = imageFrame.getTransfromMatrix();
                extVideoFrame.videoFrameExtendedData = byteBuffer;
                return ByteVideoClient.this.mCallback.updateVideoFrame(extVideoFrame);
            }
        });
    }

    public void release() {
        this.mFactory.destroy(this.mParent);
        if (this.mFrameCropManager != null) {
            this.mFrameCropManager.destroy();
        }
        this.mParent = null;
    }

    public ByteVideoClient(VideoClientFactory videoClientFactory, FrameFormat frameFormat, VideoQuality videoQuality, ByteVideoCallback byteVideoCallback) {
        this.mFactory = videoClientFactory;
        this.mFrameFormat = frameFormat;
        this.mCallback = byteVideoCallback;
        this.mVideoQuality = videoQuality;
    }
}
