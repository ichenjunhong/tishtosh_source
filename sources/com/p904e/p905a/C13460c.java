package com.p904e.p905a;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;

/* renamed from: com.e.a.c */
public class C13460c {

    /* renamed from: a */
    private static final String f35053a = "c";

    /* renamed from: a */
    public static void m27126a(Builder builder, CameraCharacteristics cameraCharacteristics, boolean z) {
        boolean z2;
        if (builder != null) {
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            boolean z3 = true;
            if (iArr == null || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr2 == null || iArr2.length == 0 || (iArr2.length == 1 && iArr2[0] == 0)) {
                z3 = false;
            }
            if (z2) {
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(z ? 1 : 0));
            }
            if (z3) {
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            }
        }
    }
}
