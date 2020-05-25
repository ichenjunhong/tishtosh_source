package com.p683ss.android.ugc.asve.p1238b;

import com.p683ss.android.vesdk.VECameraSettings.CAMERA_HW_LEVEL;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.c */
public final class C20321c {
    /* renamed from: a */
    public static final CAMERA_HW_LEVEL m50101a(C20318a aVar) {
        C52711k.m112240b(aVar, "$this$toVECameraHWLevel");
        switch (C20322d.f55818a[aVar.ordinal()]) {
            case 1:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
            case 2:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LIMITED;
            case 3:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_FULL;
            case 4:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEVEL_3;
            default:
                throw new C52775l();
        }
    }
}
