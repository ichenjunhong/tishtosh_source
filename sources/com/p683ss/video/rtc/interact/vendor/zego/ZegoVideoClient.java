package com.p683ss.video.rtc.interact.vendor.zego;

import android.view.View;
import com.p683ss.video.rtc.interact.model.CommonType.FrameFormat;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.render.ImageFrame;
import com.p683ss.video.rtc.interact.render.crop.ImageProcessorManager;
import com.p683ss.video.rtc.interact.video.VideoCallback;
import com.p683ss.video.rtc.interact.video.VideoClient;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoClientStatisic;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice.Client;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient */
public class ZegoVideoClient extends ZegoVideoCaptureDevice implements VideoClientStatisic {
    public ZegoVideoCallback mCallback;
    public boolean mCheckSupportExtInfo;
    public Client mClient;
    private VideoClientFactory mFactory;
    public ImageProcessorManager mFrameCropManager;
    private FrameFormat mFrameFormat;
    public int mInputHeight;
    public int mInputWidth;
    private VideoClient mParent;
    public VideoQuality mVideoQuality;

    /* renamed from: com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient$2 */
    static /* synthetic */ class C517282 {

        /* renamed from: $SwitchMap$com$ss$video$rtc$interact$model$CommonType$FrameFormat */
        static final /* synthetic */ int[] f128983xe7e79ca1 = new int[FrameFormat.values().length];

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
                f128983xe7e79ca1 = r0
                int[] r0 = f128983xe7e79ca1     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.video.rtc.interact.model.CommonType$FrameFormat r1 = com.p683ss.video.rtc.interact.model.CommonType.FrameFormat.TEXTURE_OES     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f128983xe7e79ca1     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.video.rtc.interact.model.CommonType$FrameFormat r1 = com.p683ss.video.rtc.interact.model.CommonType.FrameFormat.TEXTURE_2D     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.C517282.<clinit>():void");
        }
    }

    /* renamed from: com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient$ZegoVideoCallback */
    public interface ZegoVideoCallback {
        void onVideoFrameRenderSuccess();
    }

    public int enableTorch(boolean z) {
        return 0;
    }

    public int getInputHeight() {
        return this.mInputHeight;
    }

    public int getInputWidth() {
        return this.mInputWidth;
    }

    public int setCaptureRotation(int i) {
        return 0;
    }

    public int setFrameRate(int i) {
        return 0;
    }

    public int setFrontCam(int i) {
        return 0;
    }

    public int setPowerlineFreq(int i) {
        return 0;
    }

    public int setResolution(int i, int i2) {
        return 0;
    }

    public int setView(View view) {
        return 0;
    }

    public int setViewMode(int i) {
        return 0;
    }

    public int setViewRotation(int i) {
        return 0;
    }

    public int startPreview() {
        return 0;
    }

    public int stopPreview() {
        return 0;
    }

    public int takeSnapshot() {
        return 0;
    }

    public int startCapture() {
        this.mParent.start();
        return 0;
    }

    public float getAvgVpsElapse() {
        if (this.mFrameCropManager == null) {
            return -1.0f;
        }
        return this.mFrameCropManager.getAvgVpsElapse();
    }

    public int stopCapture() {
        if (this.mFrameCropManager != null) {
            this.mFrameCropManager.destroy();
        }
        this.mParent.stop();
        return 0;
    }

    public synchronized void stopAndDeAllocate() {
        this.mFactory.destroy(this.mParent);
        this.mClient.destroy();
        this.mParent = null;
        this.mClient = null;
    }

    public int supportBufferType() {
        if (C517282.f128983xe7e79ca1[this.mFrameFormat.ordinal()] != 1) {
            return 8;
        }
        return 4;
    }

    public void setOnPushFrameSuccessListener(ZegoVideoCallback zegoVideoCallback) {
        this.mCallback = zegoVideoCallback;
    }

    public void allocateAndStart(Client client) {
        this.mClient = client;
        this.mClient.setFillMode(1);
        this.mParent = this.mFactory.create();
        this.mParent.prepare(new VideoCallback() {
            public boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
                if (ZegoVideoClient.this.mCheckSupportExtInfo) {
                    ZegoVideoClient.this.mCheckSupportExtInfo = false;
                }
                if (ZegoVideoClient.this.mInputWidth == 0) {
                    ZegoVideoClient.this.mInputWidth = i2;
                }
                if (ZegoVideoClient.this.mInputHeight == 0) {
                    ZegoVideoClient.this.mInputHeight = i3;
                }
                synchronized (ZegoVideoClient.this) {
                    if (ZegoVideoClient.this.mFrameCropManager == null) {
                        if (eGLContext2 != null) {
                            ZegoVideoClient.this.mFrameCropManager = new ImageProcessorManager(eGLContext2, ZegoVideoClient.this.mVideoQuality.getWidth(), ZegoVideoClient.this.mVideoQuality.getHeight());
                        } else if (eGLContext != null) {
                            ZegoVideoClient.this.mFrameCropManager = new ImageProcessorManager(eGLContext, ZegoVideoClient.this.mVideoQuality.getWidth(), ZegoVideoClient.this.mVideoQuality.getHeight());
                        }
                    }
                    ImageFrame imageFrame = new ImageFrame(i, i2, i3, ImageFrame.ANDROID_DEFAULT_TRANSFORM_MATRIX);
                    if (ZegoVideoClient.this.mFrameCropManager != null) {
                        imageFrame = ZegoVideoClient.this.mFrameCropManager.pushImageFrame(imageFrame);
                    }
                    if (ZegoVideoClient.this.mClient == null) {
                        return false;
                    }
                    ZegoVideoClient.this.mClient.onTextureCaptured(imageFrame.getTextureID(), imageFrame.getWidth(), imageFrame.getHeight(), (double) j);
                    if (ZegoVideoClient.this.mCallback != null) {
                        ZegoVideoClient.this.mCallback.onVideoFrameRenderSuccess();
                    }
                    return true;
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
                return true;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean updateVideoFrame(javax.microedition.khronos.egl.EGLContext r8, android.opengl.EGLContext r9, int r10, int r11, int r12, long r13, java.nio.ByteBuffer r15) {
                /*
                    r7 = this;
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r15 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this
                    boolean r15 = r15.mCheckSupportExtInfo
                    r0 = 1
                    if (r15 != 0) goto L_0x0012
                    java.lang.String r15 = "ZegoVideoClient"
                    java.lang.String r1 = "zego engine not support extend info"
                    com.p683ss.video.rtc.interact.utils.log.LogUtil.m110874w(r15, r1)
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r15 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this
                    r15.mCheckSupportExtInfo = r0
                L_0x0012:
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r15 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this
                    int r15 = r15.mInputWidth
                    if (r15 != 0) goto L_0x001c
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r15 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this
                    r15.mInputWidth = r11
                L_0x001c:
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r15 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this
                    int r15 = r15.mInputHeight
                    if (r15 != 0) goto L_0x0026
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r15 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this
                    r15.mInputHeight = r12
                L_0x0026:
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r15 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this
                    monitor-enter(r15)
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r1 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.render.crop.ImageProcessorManager r1 = r1.mFrameCropManager     // Catch:{ all -> 0x00a7 }
                    if (r1 != 0) goto L_0x0066
                    if (r9 == 0) goto L_0x004b
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r8 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.render.crop.ImageProcessorManager r1 = new com.ss.video.rtc.interact.render.crop.ImageProcessorManager     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r2 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.model.CommonType$VideoQuality r2 = r2.mVideoQuality     // Catch:{ all -> 0x00a7 }
                    int r2 = r2.getWidth()     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r3 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.model.CommonType$VideoQuality r3 = r3.mVideoQuality     // Catch:{ all -> 0x00a7 }
                    int r3 = r3.getHeight()     // Catch:{ all -> 0x00a7 }
                    r1.<init>(r9, r2, r3)     // Catch:{ all -> 0x00a7 }
                    r8.mFrameCropManager = r1     // Catch:{ all -> 0x00a7 }
                    goto L_0x0066
                L_0x004b:
                    if (r8 == 0) goto L_0x0066
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r9 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.render.crop.ImageProcessorManager r1 = new com.ss.video.rtc.interact.render.crop.ImageProcessorManager     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r2 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.model.CommonType$VideoQuality r2 = r2.mVideoQuality     // Catch:{ all -> 0x00a7 }
                    int r2 = r2.getWidth()     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r3 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.model.CommonType$VideoQuality r3 = r3.mVideoQuality     // Catch:{ all -> 0x00a7 }
                    int r3 = r3.getHeight()     // Catch:{ all -> 0x00a7 }
                    r1.<init>(r8, r2, r3)     // Catch:{ all -> 0x00a7 }
                    r9.mFrameCropManager = r1     // Catch:{ all -> 0x00a7 }
                L_0x0066:
                    com.ss.video.rtc.interact.render.ImageFrame r8 = new com.ss.video.rtc.interact.render.ImageFrame     // Catch:{ all -> 0x00a7 }
                    float[] r9 = com.p683ss.video.rtc.interact.render.ImageFrame.ANDROID_DEFAULT_TRANSFORM_MATRIX     // Catch:{ all -> 0x00a7 }
                    r8.<init>(r10, r11, r12, r9)     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r9 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.render.crop.ImageProcessorManager r9 = r9.mFrameCropManager     // Catch:{ all -> 0x00a7 }
                    if (r9 == 0) goto L_0x007b
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r9 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.render.crop.ImageProcessorManager r9 = r9.mFrameCropManager     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.render.ImageFrame r8 = r9.pushImageFrame(r8)     // Catch:{ all -> 0x00a7 }
                L_0x007b:
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r9 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.zego.zegoavkit2.ZegoVideoCaptureDevice$Client r9 = r9.mClient     // Catch:{ all -> 0x00a7 }
                    if (r9 != 0) goto L_0x0084
                    r8 = 0
                    monitor-exit(r15)     // Catch:{ all -> 0x00a7 }
                    return r8
                L_0x0084:
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r9 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.zego.zegoavkit2.ZegoVideoCaptureDevice$Client r1 = r9.mClient     // Catch:{ all -> 0x00a7 }
                    int r2 = r8.getTextureID()     // Catch:{ all -> 0x00a7 }
                    int r3 = r8.getWidth()     // Catch:{ all -> 0x00a7 }
                    int r4 = r8.getHeight()     // Catch:{ all -> 0x00a7 }
                    double r5 = (double) r13     // Catch:{ all -> 0x00a7 }
                    r1.onTextureCaptured(r2, r3, r4, r5)     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r8 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient$ZegoVideoCallback r8 = r8.mCallback     // Catch:{ all -> 0x00a7 }
                    if (r8 == 0) goto L_0x00a5
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient r8 = com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.this     // Catch:{ all -> 0x00a7 }
                    com.ss.video.rtc.interact.vendor.zego.ZegoVideoClient$ZegoVideoCallback r8 = r8.mCallback     // Catch:{ all -> 0x00a7 }
                    r8.onVideoFrameRenderSuccess()     // Catch:{ all -> 0x00a7 }
                L_0x00a5:
                    monitor-exit(r15)     // Catch:{ all -> 0x00a7 }
                    return r0
                L_0x00a7:
                    r8 = move-exception
                    monitor-exit(r15)     // Catch:{ all -> 0x00a7 }
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.C517271.updateVideoFrame(javax.microedition.khronos.egl.EGLContext, android.opengl.EGLContext, int, int, int, long, java.nio.ByteBuffer):boolean");
            }
        });
    }

    public ZegoVideoClient(VideoClientFactory videoClientFactory, FrameFormat frameFormat, VideoQuality videoQuality) {
        this.mFactory = videoClientFactory;
        this.mFrameFormat = frameFormat;
        this.mVideoQuality = videoQuality;
    }
}
