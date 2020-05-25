package com.p683ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.app.c */
public final class C23057c {

    /* renamed from: a */
    public static final String f61423a = f61423a;

    /* renamed from: b */
    public static final String f61424b = f61424b;

    /* renamed from: c */
    public static final String f61425c = f61425c;

    /* renamed from: d */
    public static final C23058a f61426d = new C23058a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.c$a */
    public static final class C23058a {
        private C23058a() {
        }

        /* renamed from: a */
        public static String m56585a() {
            return C23057c.f61424b;
        }

        /* renamed from: c */
        private static String m56586c() {
            return C23057c.f61423a;
        }

        /* renamed from: b */
        public final String mo47787b() {
            StringBuilder sb = new StringBuilder();
            sb.append(m56585a());
            sb.append(C11010c.m22289j());
            return sb.toString();
        }

        public /* synthetic */ C23058a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo47786a(String str) {
            C52711k.m112240b(str, "url");
            if (C9431p.m18664a(str)) {
                return str;
            }
            try {
                Uri parse = Uri.parse(str);
                C52711k.m112236a((Object) parse, "uri");
                String scheme = parse.getScheme();
                String b = mo47787b();
                if (C52711k.m112239a((Object) m56586c(), (Object) scheme) || C52711k.m112239a((Object) C23057c.f61425c, (Object) scheme)) {
                    str = C52830p.m112400a(str, scheme, b, false);
                }
            } catch (Exception unused) {
            }
            return str;
        }

        /* renamed from: b */
        public final boolean mo47788b(String str) {
            C52711k.m112240b(str, "scheme");
            if (C9431p.m18664a(str)) {
                return false;
            }
            if (C52711k.m112239a((Object) m56586c(), (Object) str)) {
                return true;
            }
            String b = mo47787b();
            if (C9431p.m18664a(b) || !C52711k.m112239a((Object) b, (Object) str)) {
                return false;
            }
            return true;
        }
    }
}
