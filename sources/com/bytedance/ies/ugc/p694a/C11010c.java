package com.bytedance.ies.ugc.p694a;

import android.app.Application;
import android.content.Context;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.ies.ugc.a.c */
public final class C11010c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f29552a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11010c.class), "STRING_APP_NAME", "getSTRING_APP_NAME()Ljava/lang/String;"))};

    /* renamed from: b */
    public static volatile boolean f29553b;

    /* renamed from: c */
    public static volatile Application f29554c;

    /* renamed from: d */
    public static volatile String f29555d;

    /* renamed from: e */
    public static volatile Integer f29556e;

    /* renamed from: f */
    public static volatile String f29557f;

    /* renamed from: g */
    public static volatile C11013c f29558g;

    /* renamed from: h */
    public static volatile String f29559h;

    /* renamed from: i */
    public static volatile C11011a f29560i;

    /* renamed from: j */
    public static volatile String f29561j;

    /* renamed from: k */
    public static volatile String f29562k;

    /* renamed from: l */
    public static volatile C11006a f29563l = new C11006a();

    /* renamed from: m */
    public static volatile int f29564m;

    /* renamed from: n */
    public static volatile int f29565n = -1;

    /* renamed from: o */
    public static volatile String f29566o = "";

    /* renamed from: p */
    public static volatile String f29567p = "";

    /* renamed from: q */
    public static volatile String f29568q = "";

    /* renamed from: r */
    public static volatile String f29569r = "";

    /* renamed from: s */
    public static volatile String f29570s = "unknown";

    /* renamed from: t */
    public static volatile String f29571t;

    /* renamed from: u */
    public static final C11010c f29572u = new C11010c();

    /* renamed from: v */
    private static final C52668f f29573v = C52732g.m112285a(C11012b.f29578a);

    /* renamed from: w */
    private static String f29574w = "";

    /* renamed from: com.bytedance.ies.ugc.a.c$a */
    public static final class C11011a {

        /* renamed from: a */
        public volatile long f29575a;

        /* renamed from: b */
        public volatile String f29576b;

        /* renamed from: c */
        public volatile long f29577c;

        public C11011a() {
            this(0, null, 0, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C11011a) {
                    C11011a aVar = (C11011a) obj;
                    if ((this.f29575a == aVar.f29575a) && C52711k.m112239a((Object) this.f29576b, (Object) aVar.f29576b)) {
                        if (this.f29577c == aVar.f29577c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f29575a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f29576b;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            long j2 = this.f29577c;
            return hashCode + ((int) ((j2 >>> 32) ^ j2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BussinessVersionInfo(versionCode=");
            sb.append(this.f29575a);
            sb.append(", versionName=");
            sb.append(this.f29576b);
            sb.append(", updateVersionCode=");
            sb.append(this.f29577c);
            sb.append(")");
            return sb.toString();
        }

        public C11011a(long j, String str, long j2) {
            C52711k.m112240b(str, "versionName");
            this.f29575a = j;
            this.f29576b = str;
            this.f29577c = j2;
        }

        private /* synthetic */ C11011a(long j, String str, long j2, int i, C52707g gVar) {
            this(-1, "", -1);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.a.c$b */
    static final class C11012b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C11012b f29578a = new C11012b();

        C11012b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11010c cVar = C11010c.f29572u;
            Integer num = C11010c.f29556e;
            if (num != null) {
                String a = C11010c.m22281a(num.intValue());
                if (a != null) {
                    return a;
                }
            }
            C11010c cVar2 = C11010c.f29572u;
            String str = C11010c.f29555d;
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.a.c$c */
    public static final class C11013c {

        /* renamed from: a */
        public volatile long f29579a;

        /* renamed from: b */
        public volatile String f29580b;

        public C11013c() {
            this(0, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C11013c) {
                    C11013c cVar = (C11013c) obj;
                    if (!(this.f29579a == cVar.f29579a) || !C52711k.m112239a((Object) this.f29580b, (Object) cVar.f29580b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f29579a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f29580b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VersionInfo(versionCode=");
            sb.append(this.f29579a);
            sb.append(", versionName=");
            sb.append(this.f29580b);
            sb.append(")");
            return sb.toString();
        }

        public C11013c(long j, String str) {
            C52711k.m112240b(str, "versionName");
            this.f29579a = j;
            this.f29580b = str;
        }

        private /* synthetic */ C11013c(long j, String str, int i, C52707g gVar) {
            this(-1, "");
        }
    }

    private C11010c() {
    }

    /* renamed from: b */
    public static final C11006a m22282b() {
        return f29563l;
    }

    /* renamed from: j */
    public static int m22289j() {
        return f29565n;
    }

    /* renamed from: k */
    public static String m22290k() {
        return f29566o;
    }

    /* renamed from: l */
    public static String m22291l() {
        return f29567p;
    }

    /* renamed from: m */
    public static int m22292m() {
        return f29564m;
    }

    /* renamed from: p */
    public static String m22295p() {
        return f29570s;
    }

    /* renamed from: q */
    public static String m22296q() {
        return f29571t;
    }

    /* renamed from: a */
    public static Context m22280a() {
        Application application = f29554c;
        if (application == null) {
            C52711k.m112237a("context");
        }
        return application;
    }

    /* renamed from: d */
    public static String m22283d() {
        String str = f29557f;
        if (str == null) {
            C52711k.m112237a("appName");
        }
        return str;
    }

    /* renamed from: e */
    public static String m22284e() {
        String str = f29562k;
        if (str == null) {
            C52711k.m112237a("releaseBuild");
        }
        return str;
    }

    /* renamed from: f */
    public static String m22285f() {
        String str = f29561j;
        if (str == null) {
            C52711k.m112237a("feedbackAppKey");
        }
        return str;
    }

    /* renamed from: g */
    public static long m22286g() {
        C11011a aVar = f29560i;
        if (aVar == null) {
            C52711k.m112237a("bussinessVersionInfo");
        }
        return aVar.f29577c;
    }

    /* renamed from: h */
    public static long m22287h() {
        C11011a aVar = f29560i;
        if (aVar == null) {
            C52711k.m112237a("bussinessVersionInfo");
        }
        return aVar.f29575a;
    }

    /* renamed from: i */
    public static String m22288i() {
        C11011a aVar = f29560i;
        if (aVar == null) {
            C52711k.m112237a("bussinessVersionInfo");
        }
        return aVar.f29576b;
    }

    /* renamed from: n */
    public static long m22293n() {
        C11013c cVar = f29558g;
        if (cVar == null) {
            C52711k.m112237a("versionInfo");
        }
        return cVar.f29579a;
    }

    /* renamed from: o */
    public static String m22294o() {
        C11013c cVar = f29558g;
        if (cVar == null) {
            C52711k.m112237a("versionInfo");
        }
        return cVar.f29580b;
    }

    /* renamed from: c */
    public final String mo19896c() {
        return (String) f29573v.getValue();
    }

    /* renamed from: a */
    public static String m22281a(int i) {
        try {
            Application application = f29554c;
            if (application == null) {
                C52711k.m112237a("context");
            }
            String string = application.getString(i);
            C52711k.m112236a((Object) string, "context.getString(resId)");
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }
}
