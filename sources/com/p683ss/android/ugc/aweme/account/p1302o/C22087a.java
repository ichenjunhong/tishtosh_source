package com.p683ss.android.ugc.aweme.account.p1302o;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.o.a */
public final class C22087a {

    /* renamed from: a */
    public static String f59595a = "";

    /* renamed from: b */
    public static String f59596b = "";

    /* renamed from: c */
    public static final C22088a f59597c = new C22088a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$a */
    public static final class C22088a {
        private C22088a() {
        }

        public /* synthetic */ C22088a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m54865a(String str) {
            C52711k.m112240b(str, "<set-?>");
            C22087a.f59596b = str;
        }

        /* renamed from: a */
        public static void m54866a(boolean z, String str, boolean z2, int i) {
            C23088c a = C23088c.m56631a().mo47819a("success", Boolean.valueOf(z));
            String str2 = "error_desc";
            if (str == null) {
                str = "";
            }
            JSONObject b = a.mo47824a(str2, str).mo47819a("has_sim_card", Boolean.valueOf(z2)).mo47822a("google_availability", Integer.valueOf(i)).mo47825b();
            boolean z3 = !z;
            C52711k.m112236a((Object) b, "json");
            C22089b.m54868a("sms_auto_fill", z3 ? 1 : 0, b);
        }
    }

    /* renamed from: a */
    public static final String m54861a() {
        return f59596b;
    }

    /* renamed from: a */
    public static final void m54862a(String str) {
        f59595a = str;
    }

    /* renamed from: a */
    public static final void m54863a(boolean z, String str, boolean z2, int i) {
        C22088a.m54866a(z, str, z2, i);
    }

    /* renamed from: b */
    public static final void m54864b(String str) {
        f59596b = str;
    }
}
