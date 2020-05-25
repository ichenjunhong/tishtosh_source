package com.bytedance.realx.video.camera;

import com.bytedance.realx.RXNativeFunctions;
import com.bytedance.realx.base.RXLogging;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;
import org.webrtc.CameraVideoCapturer.CameraSwitchHandler;
import org.webrtc.CapturerObserver;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase$$CC;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;

public class RXVideoCaptureAndroid {
    private CapturerObserver localCapturerObserver = new CapturerObserver() {
        public void onCapturerStopped() {
            RXLogging.m25467d("RXVideoCaptureAndroid", "onCapturerStopped...");
        }

        public void onCapturerStarted(boolean z) {
            RXLogging.m25467d("RXVideoCaptureAndroid", "onCapturerStarted...");
        }

        public void onFrameCaptured(VideoFrame videoFrame) {
            RXLogging.m25467d("RXVideoCaptureAndroid", "onFrameCaptured, frame");
            if (videoFrame.getBuffer() instanceof TextureBuffer) {
                RXLogging.m25467d("RXVideoCaptureAndroid", "frame is TextureBuffer");
            } else if (videoFrame.getBuffer() instanceof I420Buffer) {
                RXLogging.m25467d("RXVideoCaptureAndroid", "frame is I420Buffer");
            }
            RXNativeFunctions.nativeOnFrameCaptured(RXVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
        }
    };
    private CameraEventsHandler mCameraEventsHandler;
    private int mHeight;
    public boolean mIsFrontCamera = true;
    private boolean mIsVideoCaptureInited;
    private boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private VideoCapturer mVideoCapturer;
    private int mWidth;

    public int getCameraFace() {
        if (this.mIsFrontCamera) {
            return 1;
        }
        return 0;
    }

    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        if (this.mSurfaceTextureHelper != null) {
            this.mSurfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
    }

    public void stopCapture() {
        RXLogging.m25467d("RXVideoCaptureAndroid", "stopCapture...");
        if (this.mVideoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                this.mVideoCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException unused) {
            }
        }
    }

    public void switchCamera() {
        if (this.mVideoCapturer != null && this.mIsVideoCaptureInited && (this.mVideoCapturer instanceof CameraVideoCapturer)) {
            this.mIsFrontCamera = !this.mIsFrontCamera;
            ((CameraVideoCapturer) this.mVideoCapturer).switchCamera(new CameraSwitchHandler() {
                public void onCameraSwitchError(String str) {
                }

                public void onCameraSwitchDone(boolean z) {
                    RXVideoCaptureAndroid.this.mIsFrontCamera = z;
                }
            });
        }
    }

    RXVideoCaptureAndroid(long j) {
        RXLogging.m25467d("RXVideoCaptureAndroid", "RXVideoCaptureAndroid Created...");
        this.mSurfaceTextureHelper = SurfaceTextureHelper.create("RXLocalCapturer", EglBase$$CC.create$$STATIC$$().getEglBaseContext());
        this.mNativeCaptureObserver = j;
    }

    private VideoCapturer createVideoCapturer(int i) {
        String[] deviceNames;
        try {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(true);
            for (String str : camera1Enumerator.getDeviceNames()) {
                if (camera1Enumerator.isFrontFacing(str) && i == 1) {
                    CameraVideoCapturer createCapturer = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler);
                    if (createCapturer != null) {
                        return createCapturer;
                    }
                }
                if (camera1Enumerator.isBackFacing(str) && i == 0) {
                    CameraVideoCapturer createCapturer2 = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler);
                    if (createCapturer2 != null) {
                        return createCapturer2;
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Create VideoCapture fail : ");
            sb.append(e.getMessage());
            RXLogging.m25467d("RXVideoCaptureAndroid", sb.toString());
            return null;
        }
    }

    private void startVideoCapture(int i, int i2, int i3) {
        RXLogging.m25467d("RXVideoCaptureAndroid", "startVideoCapture... ");
        if (this.mVideoCapturer != null) {
            try {
                this.mVideoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("VideoCapture startCapture fail : ");
                sb.append(e.getMessage());
                RXLogging.m25467d("RXVideoCaptureAndroid", sb.toString());
            }
        }
    }

    public void startCapture(int i, int i2, int i3) {
        RXLogging.m25467d("RXVideoCaptureAndroid", "startCapture...");
        this.mWidth = i;
        this.mHeight = i2;
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        this.mVideoCapturer = createVideoCapturer(1);
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.initialize(this.mSurfaceTextureHelper, ContextUtils.getApplicationContext(), this.localCapturerObserver);
        }
        this.mIsVideoCaptureInited = true;
        startVideoCapture(i, i2, i3);
    }
}
