package com.p683ss.android.ugc.aweme.account.p1302o;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.o.e */
public final class C22095e {

    /* renamed from: a */
    public static final String f59608a = f59608a;

    /* renamed from: b */
    public static final String f59609b = f59609b;

    /* renamed from: c */
    public static final String f59610c = f59610c;

    /* renamed from: d */
    public static final C22096a f59611d = new C22096a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.o.e$a */
    public static final class C22096a {
        private C22096a() {
        }

        public /* synthetic */ C22096a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo46199a(int i, Integer num, String str) {
            C22089b.m54868a(C22095e.f59610c, i, m54895a(num, str, ""));
        }

        /* renamed from: a */
        private static JSONObject m54895a(Integer num, String str, String str2) {
            C52711k.m112240b(str2, "scene");
            C23088c a = C23088c.m56631a();
            if (num == null || num.intValue() != 0) {
                a.mo47822a("error_code", num).mo47824a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo47824a("extra", str2);
            }
            JSONObject b = a.mo47825b();
            C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public final void mo46200a(int i, String str, int i2, String str2) {
            C52711k.m112240b(str, "scene");
            C22089b.m54868a(C22095e.f59609b, i, m54895a(Integer.valueOf(i2), str2, str));
        }
    }

    /* renamed from: a */
    public static final void m54894a(int i, String str, int i2, String str2) {
        f59611d.mo46200a(i, str, i2, str2);
    }
}
