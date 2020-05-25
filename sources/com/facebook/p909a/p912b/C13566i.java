package com.facebook.p909a.p912b;

import android.os.Bundle;
import com.C2240a;
import com.facebook.C14699w;
import com.facebook.internal.C14349t;
import com.facebook.p909a.C13581g.C13582a;
import com.facebook.p909a.C13589l;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.util.Locale;

/* renamed from: com.facebook.a.b.i */
class C13566i {

    /* renamed from: a */
    private static final String f35403a = C13566i.class.getCanonicalName();

    /* renamed from: b */
    private static final long[] f35404b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, FbUploadTokenTime.group0, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    C13566i() {
    }

    /* renamed from: a */
    private static void m27395a() {
        C14349t.m29408a(C14699w.APP_EVENTS, f35403a, "Clock skew detected");
    }

    /* renamed from: a */
    private static int m27394a(long j) {
        int i = 0;
        while (i < f35404b.length && f35404b[i] < j) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static void m27397a(String str, C13567j jVar, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", "Unclassified");
        C13589l lVar = new C13589l(str, str2, null);
        lVar.mo25408a("fb_mobile_activate_app", bundle);
        if (C13589l.m27423a() != C13582a.EXPLICIT_ONLY) {
            lVar.mo25410b();
        }
    }

    /* renamed from: a */
    public static void m27396a(String str, C13565h hVar, String str2) {
        String str3;
        Long valueOf = Long.valueOf(hVar.mo25386a() - hVar.f35398b.longValue());
        if (valueOf.longValue() < 0) {
            valueOf = Long.valueOf(0);
            m27395a();
        }
        Long valueOf2 = Long.valueOf(hVar.mo25387b());
        if (valueOf2.longValue() < 0) {
            m27395a();
            valueOf2 = Long.valueOf(0);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", hVar.f35399c);
        bundle.putString("fb_mobile_time_between_sessions", C2240a.m6773a(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m27394a(valueOf.longValue()))}));
        C13567j jVar = hVar.f35401e;
        if (jVar != null) {
            str3 = jVar.toString();
        } else {
            str3 = "Unclassified";
        }
        bundle.putString("fb_mobile_launch_source", str3);
        bundle.putLong("_logTime", hVar.f35398b.longValue() / 1000);
        double longValue = (double) valueOf2.longValue();
        Double.isNaN(longValue);
        new C13589l(str, str2, null).mo25407a("fb_mobile_deactivate_app", longValue / 1000.0d, bundle);
    }
}
