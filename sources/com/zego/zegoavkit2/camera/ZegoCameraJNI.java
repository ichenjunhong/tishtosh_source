package com.zego.zegoavkit2.camera;

final class ZegoCameraJNI {
    ZegoCameraJNI() {
    }

    static native float getCamMaxZoomFactor(int i);

    static native boolean setCamExposureCompensation(float f, int i);

    static native boolean setCamExposureMode(int i, int i2);

    static native boolean setCamExposurePoint(float f, float f2, int i);

    static native boolean setCamExposurePointInPreview(float f, float f2, int i);

    static native boolean setCamFocusMode(int i, int i2);

    static native boolean setCamFocusPoint(float f, float f2, int i);

    static native boolean setCamFocusPointInPreview(float f, float f2, int i);

    static native boolean setCamZoomFactor(float f, int i);
}
