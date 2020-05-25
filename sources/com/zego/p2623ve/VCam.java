package com.zego.p2623ve;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.zego.p2623ve.CameraAvailabilityCallback.Listener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zego.ve.VCam */
public class VCam {
    int mAreaSize;
    int mBackCameraId = -1;
    private Camera mCam;
    private CameraInfo mCamInfo;
    private Object mCameraAvailabilityCallback;
    private Context mContext;
    float mExposureCompensation;
    int mExposureMode = -1;
    float mExposurePointX;
    float mExposurePointY;
    int mFPSMode;
    int mFocusMode = -1;
    float mFocusPointX;
    float mFocusPointY;
    int mFrameRate = 15;
    int mFrontCameraId = -1;
    int mHeight = 480;
    boolean mIsFocusing;
    boolean mNeedHack;
    int mSceneMode = 0;
    public long mThis;
    int mUseCameraId = -1;
    boolean mUseFaceDetection;
    int mWidth = 640;
    private Matrix matrix = new Matrix();

    static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    static float clamp2(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static native void onCameraAvailable(long j);

    public static native void onCameraUnavailable(long j);

    /* access modifiers changed from: 0000 */
    public int getBackCameraId() {
        return this.mBackCameraId;
    }

    /* access modifiers changed from: 0000 */
    public int getFramerate() {
        return this.mFrameRate;
    }

    /* access modifiers changed from: 0000 */
    public int getFrontCameraId() {
        return this.mFrontCameraId;
    }

    /* access modifiers changed from: 0000 */
    public int getHeight() {
        return this.mHeight;
    }

    /* access modifiers changed from: 0000 */
    public int getWidth() {
        return this.mWidth;
    }

    private boolean isSupportCameraAvailabilityCallback() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean checkPermission() {
        return PermissionChecker.checkSelfPermission(this.mContext, "android.permission.CAMERA");
    }

    /* access modifiers changed from: 0000 */
    public int getFront() {
        if (this.mCamInfo == null || this.mCamInfo.facing != 1) {
            return 0;
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public int getOrientation() {
        if (this.mCamInfo != null) {
            return this.mCamInfo.orientation;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean isSamsung() {
        return "samsung".equals(Build.MANUFACTURER.toLowerCase());
    }

    /* access modifiers changed from: 0000 */
    public int releaseCam() {
        if (isSupportCameraAvailabilityCallback()) {
            unregisterCameraAvailabilityCallback();
        }
        if (this.mCam != null) {
            this.mCam.release();
            this.mCam = null;
        }
        this.mCamInfo = null;
        this.mUseCameraId = -1;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int stopCam() {
        if (this.mCam != null) {
            if (this.mUseFaceDetection) {
                this.mCam.stopFaceDetection();
            }
            this.mCam.stopPreview();
            try {
                this.mCam.setPreviewTexture(null);
            } catch (IOException unused) {
            }
        }
        return 0;
    }

    private void registerCameraAvailabilityCallback() {
        if (this.mContext != null) {
            try {
                CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
                this.mCameraAvailabilityCallback = new CameraAvailabilityCallback(new Listener() {
                    public void onCameraAvailable(String str) {
                        StringBuilder sb = new StringBuilder("trace interruption this: ");
                        sb.append(VCam.this);
                        sb.append(", cameraId: ");
                        sb.append(str);
                        sb.append(" available, mUseCameraId: ");
                        sb.append(VCam.this.mUseCameraId);
                        Log.m111994i("vcap", sb.toString());
                        VCam.onCameraAvailable(VCam.this.mThis);
                    }

                    public void onCameraUnavailable(String str) {
                        StringBuilder sb = new StringBuilder("trace interruption this: ");
                        sb.append(VCam.this);
                        sb.append(", cameraId: ");
                        sb.append(str);
                        sb.append(" unavailable, mUseCameraId: ");
                        sb.append(VCam.this.mUseCameraId);
                        Log.m111994i("vcap", sb.toString());
                        VCam.onCameraUnavailable(VCam.this.mThis);
                    }
                });
                cameraManager.registerAvailabilityCallback((CameraAvailabilityCallback) this.mCameraAvailabilityCallback, null);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("registerCameraAvailabilityCallback failed, ");
                sb.append(th);
                Log.m111992e("vcap", sb.toString());
            }
        }
    }

    private void unregisterCameraAvailabilityCallback() {
        if (this.mContext != null) {
            try {
                ((CameraManager) this.mContext.getSystemService("camera")).unregisterAvailabilityCallback((CameraAvailabilityCallback) this.mCameraAvailabilityCallback);
                this.mCameraAvailabilityCallback = null;
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("unregisterCameraAvailabilityCallback failed, ");
                sb.append(th);
                Log.m111992e("vcap", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int closeTorch() {
        boolean z;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (parameters.getSupportedFlashModes().contains("off")) {
            z = true;
            try {
                parameters.setFlashMode("off");
            } catch (Exception unused) {
            }
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        try {
            this.mCam.setParameters(parameters);
        } catch (Exception unused2) {
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int getMaxZoomRatio() {
        if (this.mCam == null) {
            return 100;
        }
        Parameters parameters = this.mCam.getParameters();
        if (!parameters.isZoomSupported()) {
            return 100;
        }
        List zoomRatios = parameters.getZoomRatios();
        if (zoomRatios.size() == 0) {
            return 100;
        }
        return ((Integer) zoomRatios.get(parameters.getMaxZoom())).intValue();
    }

    /* access modifiers changed from: 0000 */
    public int openTorch() {
        boolean z;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (parameters.getSupportedFlashModes().contains("torch")) {
            z = true;
            try {
                parameters.setFlashMode("torch");
            } catch (Exception unused) {
            }
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        try {
            this.mCam.setParameters(parameters);
        } catch (Exception unused2) {
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void enumerateCamera() {
        CameraInfo cameraInfo = new CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0 && this.mBackCameraId == -1) {
                this.mBackCameraId = i;
            }
            if (cameraInfo.facing == 1 && this.mFrontCameraId == -1) {
                this.mFrontCameraId = i;
            }
        }
        StringBuilder sb = new StringBuilder("trace interruption enumerateCamera this: ");
        sb.append(this);
        sb.append(", mFrontCameraId: ");
        sb.append(this.mFrontCameraId);
        sb.append(", mBackCameraId: ");
        sb.append(this.mBackCameraId);
        Log.m111994i("vcap", sb.toString());
    }

    private String GetCameraString(int i) {
        if (i == this.mFrontCameraId) {
            return "front camera";
        }
        return "back camera";
    }

    /* access modifiers changed from: 0000 */
    public int setSurfaceTexture(SurfaceTexture surfaceTexture) {
        if (this.mCam == null) {
            return -1;
        }
        try {
            this.mCam.setPreviewTexture(surfaceTexture);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int setExposureCompensation(float f) {
        this.mExposureCompensation = f;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (doSetExposureCompensation(f, parameters) != 0) {
            return -1;
        }
        try {
            this.mCam.setParameters(parameters);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int setExposureMode(int i) {
        this.mExposureMode = i;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (doSetExposureMode(this.mExposureMode, parameters) != 0) {
            return -1;
        }
        try {
            this.mCam.setParameters(parameters);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int setFocusMode(int i) {
        this.mFocusMode = i;
        if (this.mCam == null) {
            return -1;
        }
        this.mCam.cancelAutoFocus();
        Parameters parameters = this.mCam.getParameters();
        int doSetFocusMode = doSetFocusMode(this.mFocusMode, parameters);
        if (doSetFocusMode >= 0) {
            if (!this.mUseFaceDetection) {
                doSetFocusPoint(this.mFocusPointX, this.mFocusPointY, parameters);
            }
        } else if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(null);
        }
        try {
            this.mCam.setParameters(parameters);
            if (doSetFocusMode > 0) {
                this.mIsFocusing = true;
                this.mCam.autoFocus(new AutoFocusCallback() {
                    public void onAutoFocus(boolean z, Camera camera) {
                        VCam.this.mIsFocusing = false;
                        camera.cancelAutoFocus();
                    }
                });
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setZoomFactor(float f) {
        if (this.mCam != null) {
            Parameters parameters = this.mCam.getParameters();
            if (parameters.isZoomSupported()) {
                List zoomRatios = parameters.getZoomRatios();
                if (zoomRatios.size() != 0) {
                    int i = (int) (f * 100.0f);
                    int i2 = 0;
                    if (i != 100) {
                        int i3 = 1;
                        while (true) {
                            if (i3 >= zoomRatios.size()) {
                                break;
                            } else if (((Integer) zoomRatios.get(i3)).intValue() >= i) {
                                i2 = i3;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    parameters.setZoom(i2);
                    try {
                        this.mCam.setParameters(parameters);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int startCam(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Parameters parameters = this.mCam.getParameters();
        if (getFront() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mCam.getParameters().getMaxNumDetectedFaces() <= 0 || !z2 || !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.mUseFaceDetection = z3;
        List supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            String str = "auto";
            if (1 == this.mSceneMode) {
                if (supportedSceneModes.contains("party")) {
                    str = "party";
                } else if (supportedSceneModes.contains("night")) {
                    str = "night";
                }
            } else if (2 == this.mSceneMode) {
                if (supportedSceneModes.contains("night")) {
                    str = "night";
                }
            } else if (z2 && supportedSceneModes.contains("portrait")) {
                str = "portrait";
            } else if (!z2) {
                if (supportedSceneModes.contains("action")) {
                    str = "action";
                } else if (supportedSceneModes.contains("sports")) {
                    str = "sports";
                }
            }
            try {
                parameters.setSceneMode(str);
                StringBuilder sb = new StringBuilder("vcap: set scene mode ");
                sb.append(str);
                Log.m111994i("vcap", sb.toString());
                z4 = true;
            } catch (Exception unused) {
                str = "auto";
                Log.m111992e("vcap", "vcap: set scene mode failed");
                z4 = false;
            }
            if (!z4 && supportedSceneModes.contains(str)) {
                try {
                    parameters.setSceneMode(str);
                    StringBuilder sb2 = new StringBuilder("vcap: set scene mode ");
                    sb2.append(str);
                    Log.m111994i("vcap", sb2.toString());
                } catch (Exception unused2) {
                    Log.m111992e("vcap", "vcap: set scene mode failed");
                }
            }
        }
        this.mIsFocusing = false;
        this.mCam.startPreview();
        this.mCam.cancelAutoFocus();
        if (this.mUseFaceDetection) {
            this.mCam.startFaceDetection();
        }
        int doSetFocusMode = doSetFocusMode(this.mFocusMode, parameters);
        if (doSetFocusMode >= 0) {
            if (!this.mUseFaceDetection) {
                doSetFocusPoint(this.mFocusPointX, this.mFocusPointY, parameters);
            }
        } else if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(null);
        }
        if (doSetExposureMode(this.mExposureMode, parameters) == 0 && !this.mUseFaceDetection) {
            doSetExposurePoint(this.mExposurePointX, this.mExposurePointY, parameters);
        }
        try {
            this.mCam.setParameters(parameters);
        } catch (Exception unused3) {
        }
        if (doSetFocusMode > 0) {
            this.mIsFocusing = true;
            this.mCam.autoFocus(new AutoFocusCallback() {
                public void onAutoFocus(boolean z, Camera camera) {
                    VCam.this.mIsFocusing = false;
                    camera.cancelAutoFocus();
                }
            });
        }
        return 0;
    }

    public int setContext(long j, Context context) {
        this.mThis = j;
        this.mContext = context;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int setSize(int i, int i2) {
        if (i < i2) {
            this.mWidth = i2;
            this.mHeight = i;
        } else {
            this.mWidth = i;
            this.mHeight = i2;
        }
        this.mNeedHack = false;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int doSetExposureCompensation(float f, Parameters parameters) {
        float f2;
        int minExposureCompensation = parameters.getMinExposureCompensation() * -1;
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (f < 0.0f) {
            f2 = (float) minExposureCompensation;
        } else {
            f2 = (float) maxExposureCompensation;
        }
        try {
            parameters.setExposureCompensation((int) (f2 * f));
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int doSetExposureMode(int i, Parameters parameters) {
        if (i == -1) {
            return 0;
        }
        if (!parameters.isAutoExposureLockSupported()) {
            return -1;
        }
        if (i == 0) {
            try {
                parameters.setAutoExposureLock(false);
            } catch (Exception unused) {
            }
        } else if (i == 1) {
            parameters.setAutoExposureLock(true);
        }
        doSetExposureCompensation(this.mExposureCompensation, parameters);
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int setExposurePoint(float f, float f2) {
        this.mExposurePointX = f;
        this.mExposurePointY = f2;
        if (this.mCam == null || this.mUseFaceDetection) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        doSetExposurePoint(f, f2, parameters);
        try {
            this.mCam.setParameters(parameters);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int setFocusPoint(float f, float f2) {
        this.mFocusPointX = f;
        this.mFocusPointY = f2;
        if (this.mCam == null || this.mUseFaceDetection || this.mIsFocusing) {
            return -1;
        }
        setFocusMode(0);
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int setRate(int i, int i2) {
        this.mFPSMode = i2;
        if (this.mFPSMode == 0) {
            return 0;
        }
        if (this.mFPSMode == 1) {
            i = 30;
        }
        this.mFrameRate = i;
        if (this.mCam != null) {
            Parameters parameters = this.mCam.getParameters();
            updateRate(i, parameters);
            try {
                this.mCam.setParameters(parameters);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    private Rect calculateArea(float f, float f2) {
        float f3 = (((float) this.mAreaSize) / ((float) this.mWidth)) * 2.0f;
        float f4 = (((float) this.mAreaSize) / ((float) this.mHeight)) * 2.0f;
        float clamp2 = clamp2(f - (f3 / 2.0f), -1.0f, 1.0f - f3);
        float clamp22 = clamp2(f2 - (f4 / 2.0f), -1.0f, 1.0f - f4);
        return new Rect(clamp((int) (clamp2 * 1000.0f), -1000, 1000), clamp((int) (clamp22 * 1000.0f), -1000, 1000), clamp((int) ((clamp2 + f3) * 1000.0f), -1000, 1000), clamp((int) ((clamp22 + f4) * 1000.0f), -1000, 1000));
    }

    /* access modifiers changed from: 0000 */
    public int doSetFocusMode(int i, Parameters parameters) {
        String str;
        boolean z;
        boolean z2;
        switch (i) {
            case 0:
                str = "auto";
                break;
            case 1:
                str = "infinity";
                break;
            case 2:
                str = "macro";
                break;
            case 3:
                str = "fixed";
                break;
            case 4:
                str = "edof";
                break;
            case 5:
                str = "continuous-video";
                break;
            case 6:
                str = "continuous-picture";
                break;
            default:
                str = "continuous-picture";
                break;
        }
        List supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            if (supportedFocusModes.contains(str)) {
                try {
                    parameters.setFocusMode(str);
                    StringBuilder sb = new StringBuilder("vcap: set focus mode ");
                    sb.append(str);
                    Log.m111994i("vcap", sb.toString());
                } catch (Exception unused) {
                    Log.m111992e("vcap", "vcap: set focus mode failed");
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = (String) supportedFocusModes.get(0);
                try {
                    parameters.setFocusMode(str);
                } catch (Exception unused2) {
                }
                z = true;
            }
        } else {
            z = false;
        }
        if (!z) {
            Log.m111994i("vcap", "vcap: focus mode left unset");
            return -1;
        }
        if (str == "auto" || str == "macro" || str == "continuous-picture" || str == "continuous-video") {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int updateRate(int i, Parameters parameters) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            int i2 = this.mFrameRate * 1000;
            int i3 = 0;
            int i4 = 0;
            for (int[] iArr : supportedPreviewFpsRange) {
                if (iArr[1] >= i2) {
                    if (i3 < i2 || iArr[1] < i3 || (iArr[1] == i3 && iArr[0] > i4)) {
                        i4 = iArr[0];
                        i3 = iArr[1];
                    }
                } else if (iArr[1] > i3 || (iArr[1] == i3 && iArr[0] > i4)) {
                    int i5 = iArr[0];
                    i4 = i5;
                    i3 = iArr[1];
                }
            }
            if (i3 != 0) {
                parameters.setPreviewFpsRange(i4, i3);
            }
        }
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        if (iArr2[0] == iArr2[1]) {
            this.mFrameRate = iArr2[0] / 1000;
        } else {
            this.mFrameRate = (iArr2[1] / 2) / 1000;
        }
        StringBuilder sb = new StringBuilder("real fps:| ");
        sb.append(iArr2[0]);
        sb.append("|");
        sb.append(iArr2[1]);
        sb.append("|");
        Log.m111994i("vcap", sb.toString());
        return 0;
    }

    public int createCam(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9 = i;
        if (i9 == -1) {
            return -1;
        }
        this.mSceneMode = i2;
        if (this.mCam != null) {
            return 0;
        }
        this.mCamInfo = new CameraInfo();
        try {
            this.mCam = Camera.open(i);
            Camera.getCameraInfo(i9, this.mCamInfo);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("trace interruption open ");
            sb.append(GetCameraString(i));
            sb.append(" failed, ");
            sb.append(e);
            Log.m111992e("vcap", sb.toString());
            this.mCam = null;
        }
        this.mUseCameraId = i9;
        if (this.mCam == null) {
            try {
                this.mCam = Camera.open();
            } catch (RuntimeException e2) {
                StringBuilder sb2 = new StringBuilder("trace interruption open ");
                sb2.append(GetCameraString(this.mBackCameraId));
                sb2.append(" failed, ");
                sb2.append(e2);
                Log.m111992e("vcap", sb2.toString());
                this.mCam = null;
            }
            if (this.mCam == null) {
                return -1;
            }
            Camera.getCameraInfo(this.mBackCameraId, this.mCamInfo);
            this.mUseCameraId = this.mBackCameraId;
        }
        Parameters parameters = this.mCam.getParameters();
        Size preferredPreviewSizeForVideo = parameters.getPreferredPreviewSizeForVideo();
        if (this.mWidth < 720 || this.mSceneMode == 0) {
            z = false;
        } else {
            z = true;
        }
        List<Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes == null) {
            supportedVideoSizes = parameters.getSupportedPreviewSizes();
        }
        if (supportedVideoSizes != null) {
            i5 = 0;
            i4 = 0;
            for (Size size : supportedVideoSizes) {
                if (size.width * size.height > i5 * i4 && (size.width * 3 == size.height * 4 || size.width * 9 == size.height * 16)) {
                    i5 = size.width;
                    i4 = size.height;
                }
            }
            i6 = 0;
            i3 = 0;
            for (Size size2 : supportedVideoSizes) {
                if (size2.width % 16 == 0 && size2.height % 16 == 0 && (!z || size2.width * preferredPreviewSizeForVideo.height == size2.height * preferredPreviewSizeForVideo.width)) {
                    if (size2.width < this.mWidth || size2.height < this.mHeight) {
                        if (size2.width >= this.mWidth) {
                            if (i6 < this.mWidth || i3 < this.mHeight) {
                                if (i6 < this.mWidth && i3 < this.mHeight) {
                                    i6 = size2.width;
                                    i3 = size2.height;
                                } else if (i6 >= this.mWidth && size2.height > i3) {
                                    i6 = size2.width;
                                    i3 = size2.height;
                                } else if (size2.width * size2.height > i6 * i3) {
                                    i6 = size2.width;
                                    i3 = size2.height;
                                }
                            }
                        } else if (size2.height >= this.mHeight && (i6 < this.mWidth || i3 < this.mHeight)) {
                            if (i6 < this.mWidth && i3 < this.mHeight) {
                                i6 = size2.width;
                                i3 = size2.height;
                            } else if (i3 >= this.mHeight && size2.width > i6) {
                                i6 = size2.width;
                                i3 = size2.height;
                            } else if (size2.width * size2.height > i6 * i3) {
                                i6 = size2.width;
                                i3 = size2.height;
                            }
                        }
                    } else if (i6 < this.mWidth || i3 < this.mHeight) {
                        i6 = size2.width;
                        i3 = size2.height;
                    } else if (size2.width * size2.height < i6 * i3) {
                        i6 = size2.width;
                        i3 = size2.height;
                    }
                }
            }
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (i6 * i3 != 0) {
            parameters.setPreviewSize(i6, i3);
            this.mWidth = i6;
            this.mHeight = i3;
        } else if (i5 * i4 != 0) {
            parameters.setPreviewSize(i5, i4);
            this.mWidth = i5;
            this.mHeight = i4;
        } else {
            parameters.setPreviewSize(320, 240);
            this.mWidth = 320;
            this.mHeight = 240;
        }
        if ((!Build.MANUFACTURER.equals("Xiaomi") || !Build.MODEL.equals("MI 4LTE") || VERSION.SDK_INT > 19) && !this.mNeedHack) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && preferredPreviewSizeForVideo != null) {
            parameters.setPreviewSize(preferredPreviewSizeForVideo.width, preferredPreviewSizeForVideo.height);
            this.mWidth = preferredPreviewSizeForVideo.width;
            this.mHeight = preferredPreviewSizeForVideo.height;
        }
        StringBuilder sb3 = new StringBuilder("vcap: preview size -- perferred:");
        if (preferredPreviewSizeForVideo == null) {
            i7 = 0;
        } else {
            i7 = preferredPreviewSizeForVideo.width;
        }
        sb3.append(i7);
        sb3.append("x");
        if (preferredPreviewSizeForVideo == null) {
            i8 = 0;
        } else {
            i8 = preferredPreviewSizeForVideo.height;
        }
        sb3.append(i8);
        sb3.append(", candidate:");
        sb3.append(i6);
        sb3.append("x");
        sb3.append(i3);
        sb3.append(", preview:");
        sb3.append(this.mWidth);
        sb3.append("x");
        sb3.append(this.mHeight);
        if (this.mFPSMode != 0) {
            updateRate(this.mFrameRate, parameters);
        }
        parameters.setRecordingHint(z);
        try {
            this.mCam.setParameters(parameters);
            Parameters parameters2 = this.mCam.getParameters();
            this.mWidth = parameters2.getPreviewSize().width;
            this.mHeight = parameters2.getPreviewSize().height;
            this.mAreaSize = this.mWidth / 10;
            if (isSupportCameraAvailabilityCallback()) {
                registerCameraAvailabilityCallback();
            }
            return 0;
        } catch (Exception unused) {
            this.mCam.release();
            this.mCam = null;
            if (this.mNeedHack) {
                return -1;
            }
            this.mNeedHack = true;
            return createCam(i9, this.mSceneMode);
        }
    }

    /* access modifiers changed from: 0000 */
    public int doSetExposurePoint(float f, float f2, Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() == 0) {
            return -1;
        }
        Rect calculateArea = calculateArea(f, f2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Area(calculateArea, 800));
        try {
            parameters.setMeteringAreas(arrayList);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int doSetFocusPoint(float f, float f2, Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() == 0) {
            return -1;
        }
        Rect calculateArea = calculateArea(f, f2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Area(calculateArea, 800));
        try {
            parameters.setFocusAreas(arrayList);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }
}
