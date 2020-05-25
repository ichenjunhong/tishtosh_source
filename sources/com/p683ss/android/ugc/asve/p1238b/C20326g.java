package com.p683ss.android.ugc.asve.p1238b;

import com.p683ss.android.vesdk.VECameraSettings.CAMERA_TYPE;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.g */
public final class C20326g {
    /* renamed from: a */
    public static final CAMERA_TYPE m50103a(C20323e eVar) {
        C52711k.m112240b(eVar, "$this$toVECameraType");
        switch (C20327h.f55821a[eVar.ordinal()]) {
            case 1:
                return CAMERA_TYPE.NULL;
            case 2:
                return CAMERA_TYPE.TYPE1;
            case 3:
                return CAMERA_TYPE.TYPE2;
            case 4:
                return CAMERA_TYPE.TYPE_CHRYCamera;
            case 5:
                return CAMERA_TYPE.TYPE_Mi;
            case 6:
                return CAMERA_TYPE.TYPE_Oppo;
            case 7:
                return CAMERA_TYPE.TYPE_CamKit;
            case 8:
                return CAMERA_TYPE.TYPE_Vivo;
            default:
                throw new C52775l();
        }
    }
}
