package com.p683ss.android.ugc.aweme.account.p1302o;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.o.c */
public final class C22091c {

    /* renamed from: a */
    public static final String f59602a = f59602a;

    /* renamed from: b */
    public static final String f59603b = f59603b;

    /* renamed from: c */
    public static final String f59604c = f59604c;

    /* renamed from: d */
    public static final C22092a f59605d = new C22092a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$a */
    public static final class C22092a {
        private C22092a() {
        }

        public /* synthetic */ C22092a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static JSONObject m54873a(int i, String str, String str2) {
            C23088c a = C23088c.m56631a();
            if (i != 0) {
                a.mo47822a("error_code", Integer.valueOf(i)).mo47824a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo47824a("scene", str2);
            }
            JSONObject b = a.mo47825b();
            C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public final void mo46192a(int i, String str, int i2, String str2) {
            C52711k.m112240b(str, "scene");
            C22089b.m54868a(C22091c.f59603b, i, m54873a(i2, str2, str));
        }

        /* renamed from: b */
        public final void mo46193b(int i, String str, int i2, String str2) {
            C52711k.m112240b(str, "scene");
            C22089b.m54868a(C22091c.f59604c, i, m54873a(i2, str2, str));
        }
    }

    /* renamed from: a */
    public static final void m54871a(int i, String str, int i2, String str2) {
        f59605d.mo46192a(i, str, i2, str2);
    }

    /* renamed from: b */
    public static final void m54872b(int i, String str, int i2, String str2) {
        f59605d.mo46193b(i, str, i2, str2);
    }
}
