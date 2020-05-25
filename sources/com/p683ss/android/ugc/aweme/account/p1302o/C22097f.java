package com.p683ss.android.ugc.aweme.account.p1302o;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.o.f */
public final class C22097f {

    /* renamed from: a */
    public static final String f59612a = f59612a;

    /* renamed from: b */
    public static final String f59613b = f59613b;

    /* renamed from: c */
    public static final String f59614c = f59614c;

    /* renamed from: d */
    public static final C22098a f59615d = new C22098a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.o.f$a */
    public static final class C22098a {
        private C22098a() {
        }

        public /* synthetic */ C22098a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo46201a(int i, int i2, int i3, String str) {
            mo46202a(i, i2, i3, str, null);
        }

        /* renamed from: b */
        public final void mo46203b(int i, int i2, int i3, String str) {
            C22089b.m54868a(C22097f.f59614c, i, m54901a(i3, str, i2, "choose_dialog"));
        }

        /* renamed from: a */
        private static JSONObject m54901a(int i, String str, int i2, String str2) {
            C23088c a = C23088c.m56631a();
            if (i != 0) {
                a.mo47822a("error_code", Integer.valueOf(i)).mo47824a("error_desc", str);
            }
            a.mo47822a("send_type", Integer.valueOf(i2));
            if (str2 != null) {
                a.mo47824a("send_from", str2);
            }
            JSONObject b = a.mo47825b();
            C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public final void mo46202a(int i, int i2, int i3, String str, String str2) {
            C22089b.m54868a(C22097f.f59613b, i, m54901a(i3, str, i2, str2));
        }
    }

    /* renamed from: a */
    public static final void m54898a(int i, int i2, int i3, String str) {
        f59615d.mo46201a(i, i2, i3, str);
    }

    /* renamed from: a */
    public static final void m54899a(int i, int i2, int i3, String str, String str2) {
        f59615d.mo46202a(i, i2, i3, str, str2);
    }

    /* renamed from: b */
    public static final void m54900b(int i, int i2, int i3, String str) {
        f59615d.mo46203b(i, i2, i3, str);
    }
}
