package com.p683ss.android.ugc.asve.p1238b;

import com.p683ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.m */
public final class C20334m {
    /* renamed from: a */
    public static final CAMERA_FACING_ID m50106a(C20331k kVar) {
        C52711k.m112240b(kVar, "$this$toVEFacingID");
        switch (C20335n.f55827a[kVar.ordinal()]) {
            case 1:
                return CAMERA_FACING_ID.FACING_BACK;
            case 2:
                return CAMERA_FACING_ID.FACING_FRONT;
            case 3:
                return CAMERA_FACING_ID.FACING_WIDE_ANGLE;
            default:
                throw new C52775l();
        }
    }
}
