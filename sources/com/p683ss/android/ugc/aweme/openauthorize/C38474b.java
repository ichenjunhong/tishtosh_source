package com.p683ss.android.ugc.aweme.openauthorize;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.b */
public final class C38474b {

    /* renamed from: a */
    public static final String f97891a = f97891a;

    /* renamed from: b */
    public static final String f97892b = f97892b;

    /* renamed from: c */
    public static final int f97893c = 1;

    /* renamed from: d */
    public static final int f97894d = 2;

    /* renamed from: e */
    public static final C38475a f97895e = new C38475a(null);

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.b$a */
    public static final class C38475a {
        private C38475a() {
        }

        public /* synthetic */ C38475a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo78384a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            String str7 = C38474b.f97892b;
            C23088c a = C23088c.m56631a();
            if (i2 != 0) {
                C23088c a2 = a.mo47822a("error_code", Integer.valueOf(i2)).mo47824a("error_desc", str);
                String str8 = "client_key";
                if (str2 == null) {
                    str2 = "";
                }
                a2.mo47824a(str8, str2);
            }
            a.mo47824a("opensdk_name", str3).mo47824a("opensdk_version", str4).mo47824a("commonsdk_name", str5).mo47824a("commsdk_version", str6);
            JSONObject b = a.mo47825b();
            C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
            C23569o.m57776a(str7, i, b);
        }
    }
}
