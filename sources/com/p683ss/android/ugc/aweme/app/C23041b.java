package com.p683ss.android.ugc.aweme.app;

import android.app.Application;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.p1382aq.C23255y;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.b */
public final class C23041b {

    /* renamed from: a */
    public static boolean f61394a;

    /* renamed from: b */
    public static final C23042a f61395b = new C23042a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.b$a */
    public static final class C23042a {
        private C23042a() {
        }

        /* renamed from: a */
        private static boolean m56558a() {
            return C23041b.f61394a;
        }

        /* renamed from: a */
        private static void m56557a(boolean z) {
            C23041b.f61394a = false;
        }

        public /* synthetic */ C23042a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo47764a(String str, Uri uri, boolean z) {
            String str2;
            if (uri != null) {
                str2 = uri.getQueryParameter("gd_label");
            } else {
                str2 = null;
            }
            if (z) {
                String str3 = "";
                String str4 = "";
                if (uri != null) {
                    str4 = uri.getQueryParameter("push_id");
                } else {
                    str = str3;
                }
                C23859b b = C23859b.m58575b();
                Application a = C32463a.m75161a();
                C52711k.m112236a((Object) a, "AppProvider.getApp()");
                long c = b.mo49473c(a.getApplicationContext(), "red_point_count");
                C23255y a2 = new C23255y().mo48177a(str2);
                C23111k a3 = C23111k.m56679a();
                C52711k.m112236a((Object) a3, "AppLifeCircleCacheManager.getInstance()");
                C23255y d = a2.mo48181e(Integer.toString(a3.f61537b ? 1 : 0)).mo48180d(Long.toString(c));
                if (str == null) {
                    str = "";
                }
                C23255y c2 = d.mo48179c(str);
                if (str4 == null) {
                    str4 = "";
                }
                c2.mo48178b(str4).mo48076e();
                C23111k a4 = C23111k.m56679a();
                C52711k.m112236a((Object) a4, "AppLifeCircleCacheManager.getInstance()");
                a4.f61537b = false;
                return;
            }
            C23111k a5 = C23111k.m56679a();
            C52711k.m112236a((Object) a5, "AppLifeCircleCacheManager.getInstance()");
            a5.f61537b = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("land_position", str);
                C26890h.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName(str2).setJsonObject(jSONObject));
            } catch (Exception unused) {
            }
            if (m56558a()) {
                C26890h.m65011a(C23060d.f61428b, C23089d.m56640a().mo47829a("enter_to", str).mo47829a("url", String.valueOf(uri)).f61491a);
                m56557a(false);
            }
        }
    }

    /* renamed from: a */
    public static final void m56555a(String str, Uri uri, boolean z) {
        f61395b.mo47764a(str, uri, z);
    }

    /* renamed from: a */
    public static final void m56556a(boolean z) {
        f61394a = z;
    }
}
