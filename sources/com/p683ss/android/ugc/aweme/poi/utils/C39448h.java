package com.p683ss.android.ugc.aweme.poi.utils;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.poi.experiment.AutoPlayLiveExperiment;
import com.p683ss.android.ugc.aweme.poi.experiment.PoiAnchorEnhanceExperiment;
import com.p683ss.android.ugc.aweme.poi.experiment.PoiAreaFilterExperiment;
import com.p683ss.android.ugc.aweme.poi.experiment.UseInjectionJsbExperiment;
import com.p683ss.android.ugc.aweme.poi.experiment.UseLocationSdkExperiment;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.h */
public final class C39448h {
    /* renamed from: a */
    public static boolean m87714a() {
        if (C10181b.m20511a().mo18168a(UseLocationSdkExperiment.class, true, "use_location_sdk", 31744, 0) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m87715b() {
        if (C10181b.m20511a().mo18168a(UseLocationSdkExperiment.class, true, "use_location_sdk", 31744, 0) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m87716c() {
        if (C10181b.m20511a().mo18168a(AutoPlayLiveExperiment.class, true, "poi_nearby_live_stream", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m87717d() {
        if (C10181b.m20511a().mo18168a(UseInjectionJsbExperiment.class, true, "use_injection_jsb", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m87718e() {
        if (C10181b.m20511a().mo18168a(PoiAreaFilterExperiment.class, true, "poi_city_tag_optimize", 31744, 0) != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static int m87719f() {
        return C10181b.m20511a().mo18168a(PoiAnchorEnhanceExperiment.class, true, "poi_limited_distance", 31744, 0);
    }
}
