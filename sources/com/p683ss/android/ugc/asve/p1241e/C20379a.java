package com.p683ss.android.ugc.asve.p1241e;

import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.context.PreviewSize;
import com.p683ss.android.ugc.asve.p1238b.C20321c;
import com.p683ss.android.ugc.asve.p1238b.C20326g;
import com.p683ss.android.ugc.asve.p1238b.C20334m;
import com.p683ss.android.vesdk.VECameraSettings;
import com.p683ss.android.vesdk.VECameraSettings.C50532a;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.a */
public final class C20379a {
    /* renamed from: a */
    private static final CAMERA_OUTPUT_MODE m50556a() {
        switch (C20315a.m50092a().mo43168v()) {
            case 1:
                return CAMERA_OUTPUT_MODE.SURFACE;
            case 2:
                return CAMERA_OUTPUT_MODE.FRAME;
            case 3:
                return CAMERA_OUTPUT_MODE.SURFACE_FRAME;
            default:
                return CAMERA_OUTPUT_MODE.SURFACE;
        }
    }

    /* renamed from: a */
    public static final VECameraSettings m50557a(C20355c cVar) {
        C52711k.m112240b(cVar, "$this$toCameraSettings");
        C50532a aVar = new C50532a();
        aVar.mo98524a(C20326g.m50103a(cVar.mo43110b()));
        aVar.mo98527b(cVar.mo43112d());
        aVar.mo98521a(C20334m.m50106a(cVar.mo43109a()));
        aVar.mo98522a(C20321c.m50101a(cVar.mo43111c()));
        aVar.mo98518a(cVar.mo43113e());
        aVar.mo98523a(m50556a());
        aVar.mo98526b(2);
        PreviewSize y = C20315a.m50092a().mo43171y();
        if (y != null) {
            aVar.mo98520a(y.getWidth(), y.getHeight());
        }
        VECameraSettings vECameraSettings = aVar.f126710a;
        C52711k.m112236a((Object) vECameraSettings, "VECameraSettings.Builder…)\n        }\n    }.build()");
        return vECameraSettings;
    }
}
