package com.bytedance.ies.bullet.p628b.p643i;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.bullet.b.i.s */
public final class C10424s {

    /* renamed from: com.bytedance.ies.bullet.b.i.s$a */
    public static final class C10425a extends C52712l implements C52682m<Uri, String, Boolean> {
        public C10425a() {
            super(2);
        }

        public final Boolean invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return Boolean.valueOf(C52711k.m112239a((Object) queryParameter, (Object) "1"));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$b */
    public static final class C10426b extends C52712l implements C52686q<Builder, String, Double, Builder> {
        public C10426b() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, Double d) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(d.doubleValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$c */
    public static final class C10427c extends C52712l implements C52682m<Uri, String, String> {
        public C10427c() {
            super(2);
        }

        public final String invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return queryParameter;
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$d */
    public static final class C10428d extends C52712l implements C52686q<Builder, String, String, Builder> {
        public C10428d() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, String str2) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String str3 = str2;
            if (str3 != null) {
                builder.appendQueryParameter(str, str3);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$e */
    public static final class C10429e extends C52712l implements C52682m<Uri, String, List<? extends String>> {
        public C10429e() {
            super(2);
        }

        public final List<? extends String> invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                return null;
            }
            return C52830p.m112452b((CharSequence) queryParameter, new String[]{","}, false, 0, 6, (Object) null);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$f */
    public static final class C10430f extends C52712l implements C52686q<Builder, String, List<? extends String>, Builder> {
        public C10430f() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, List<? extends String> list) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String a = C52575l.m112120a(list, ",", null, null, 0, null, null, 62, null);
            if (a != null) {
                builder.appendQueryParameter(str, a);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$g */
    public static final class C10431g extends C52712l implements C52682m<Uri, String, Uri> {
        public C10431g() {
            super(2);
        }

        public final Uri invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return Uri.parse(queryParameter);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$h */
    public static final class C10432h extends C52712l implements C52686q<Builder, String, Uri, Builder> {
        public C10432h() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, Uri uri) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(uri);
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$i */
    public static final class C10433i extends C52712l implements C52686q<Builder, String, Boolean, Builder> {
        public C10433i() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, Boolean bool) {
            String str2;
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            builder.appendQueryParameter(str, str2);
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$j */
    public static final class C10434j extends C52712l implements C52682m<Uri, String, Integer> {
        public C10434j() {
            super(2);
        }

        public final Integer invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return C52830p.m112395c(queryParameter);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$k */
    public static final class C10435k extends C52712l implements C52686q<Builder, String, Integer, Builder> {
        public C10435k() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, Integer num) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(num.intValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$l */
    public static final class C10436l extends C52712l implements C52682m<Uri, String, Long> {
        public C10436l() {
            super(2);
        }

        public final Long invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return C52830p.m112396d(queryParameter);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$m */
    public static final class C10437m extends C52712l implements C52686q<Builder, String, Long, Builder> {
        public C10437m() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, Long l) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(l.longValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$n */
    public static final class C10438n extends C52712l implements C52682m<Uri, String, Float> {
        public C10438n() {
            super(2);
        }

        public final Float invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return C52830p.m112391a(queryParameter);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$o */
    public static final class C10439o extends C52712l implements C52686q<Builder, String, Float, Builder> {
        public C10439o() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, Float f) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(f.floatValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$p */
    public static final class C10440p extends C52712l implements C52682m<Uri, String, Double> {
        public C10440p() {
            super(2);
        }

        public final Double invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return C52830p.m112392b(queryParameter);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$q */
    static final class C10441q extends C52712l implements C52682m<Uri, String, String> {

        /* renamed from: a */
        public static final C10441q f27842a = new C10441q();

        C10441q() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uri uri = (Uri) obj;
            String str = (String) obj2;
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            return uri.getAuthority();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$r */
    static final class C10442r extends C52712l implements C52686q<Builder, String, String, Builder> {

        /* renamed from: a */
        public static final C10442r f27843a = new C10442r();

        C10442r() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            Builder builder = (Builder) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C52711k.m112240b(str2, "value");
            builder.authority(str2);
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$s */
    static final class C10443s extends C52712l implements C52682m<Uri, String, String> {

        /* renamed from: a */
        public static final C10443s f27844a = new C10443s();

        C10443s() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uri uri = (Uri) obj;
            String str = (String) obj2;
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            return uri.getPath();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$t */
    static final class C10444t extends C52712l implements C52686q<Builder, String, String, Builder> {

        /* renamed from: a */
        public static final C10444t f27845a = new C10444t();

        C10444t() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            Builder builder = (Builder) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C52711k.m112240b(str2, "value");
            builder.path(str2);
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$u */
    static final class C10445u extends C52712l implements C52682m<Uri, String, List<String>> {

        /* renamed from: a */
        public static final C10445u f27846a = new C10445u();

        C10445u() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uri uri = (Uri) obj;
            String str = (String) obj2;
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            return uri.getPathSegments();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$v */
    static final class C10446v extends C52712l implements C52686q<Builder, String, List<? extends String>, Builder> {

        /* renamed from: a */
        public static final C10446v f27847a = new C10446v();

        C10446v() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            Builder builder = (Builder) obj;
            String str = (String) obj2;
            List<String> list = (List) obj3;
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C52711k.m112240b(list, "value");
            for (String appendPath : list) {
                builder.appendPath(appendPath);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$w */
    static final class C10447w extends C52712l implements C52682m<Uri, String, String> {

        /* renamed from: a */
        public static final C10447w f27848a = new C10447w();

        C10447w() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uri uri = (Uri) obj;
            String str = (String) obj2;
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            List pathSegments = uri.getPathSegments();
            if (pathSegments != null) {
                return (String) C52575l.m112140f(pathSegments);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$x */
    static final class C10448x extends C52712l implements C52686q<Builder, String, String, Builder> {

        /* renamed from: a */
        public static final C10448x f27849a = new C10448x();

        C10448x() {
            super(3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            if (r7 != null) goto L_0x0053;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
            /*
                r5 = this;
                android.net.Uri$Builder r6 = (android.net.Uri.Builder) r6
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r0 = "builder"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                java.lang.String r0 = "<anonymous parameter 1>"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                java.lang.String r7 = "value"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r7)
                android.net.Uri r7 = r6.build()
                r0 = 0
                r1 = 1
                r2 = 0
                if (r7 == 0) goto L_0x0052
                java.lang.String r7 = r7.getPath()
                if (r7 == 0) goto L_0x0052
                r3 = r7
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x002f
                r3 = 1
                goto L_0x0030
            L_0x002f:
                r3 = 0
            L_0x0030:
                if (r3 != 0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r7 = r2
            L_0x0034:
                if (r7 == 0) goto L_0x0052
                java.lang.String r3 = "/"
                r4 = 2
                boolean r3 = p2628d.p2650m.C52830p.m112411b(r7, r3, r0, r4, r2)
                if (r3 == 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r7 = r2
            L_0x0041:
                if (r7 == 0) goto L_0x0052
                int r3 = r7.length()
                d.j.c r3 = p2628d.p2647j.C52753d.m112320b(r1, r3)
                java.lang.String r7 = p2628d.p2650m.C52830p.m112431a(r7, r3)
                if (r7 == 0) goto L_0x0052
                goto L_0x0053
            L_0x0052:
                r7 = r2
            L_0x0053:
                r6.path(r8)
                if (r7 == 0) goto L_0x006b
                r8 = r7
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                int r8 = r8.length()
                if (r8 != 0) goto L_0x0062
                r0 = 1
            L_0x0062:
                if (r0 != 0) goto L_0x0065
                goto L_0x0066
            L_0x0065:
                r7 = r2
            L_0x0066:
                if (r7 == 0) goto L_0x006b
                r6.appendPath(r7)
            L_0x006b:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p628b.p643i.C10424s.C10448x.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$y */
    static final class C10449y extends C52712l implements C52682m<Uri, String, String> {

        /* renamed from: a */
        public static final C10449y f27850a = new C10449y();

        C10449y() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uri uri = (Uri) obj;
            String str = (String) obj2;
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            List pathSegments = uri.getPathSegments();
            if (pathSegments != null) {
                return (String) C52575l.m112144h(pathSegments);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.s$z */
    static final class C10450z extends C52712l implements C52686q<Builder, String, String, Builder> {

        /* renamed from: a */
        public static final C10450z f27851a = new C10450z();

        C10450z() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            Builder builder = (Builder) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C52711k.m112240b(str2, "value");
            builder.appendPath(str2);
            return builder;
        }
    }
}
