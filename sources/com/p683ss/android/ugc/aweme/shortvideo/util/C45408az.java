package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.os.Looper;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.agilelogger.C18816f;
import com.p683ss.android.agilelogger.p1135e.C18814b;
import com.p683ss.android.agilelogger.p1136f.C18817a.C18818a;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.az */
public final class C45408az {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114793a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45408az.class), "isLogEnable", "isLogEnable()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45408az.class), "tagWhiteList", "getTagWhiteList()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45408az.class), "printer", "getPrinter()Lcom/ss/android/agilelogger/printer/AndroidPrinter;"))};

    /* renamed from: b */
    public static final C45408az f114794b = new C45408az();

    /* renamed from: c */
    private static final C52668f f114795c = C52732g.m112285a(C45409a.f114798a);

    /* renamed from: d */
    private static final C52668f f114796d = C52732g.m112285a(C45411c.f114800a);

    /* renamed from: e */
    private static final C52668f f114797e = C52732g.m112285a(C45410b.f114799a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.az$a */
    static final class C45409a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C45409a f114798a = new C45409a();

        C45409a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C52711k.m112239a((Object) "__ies_tools_android_opt_test__", (Object) C11010c.m22295p()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.az$b */
    static final class C45410b extends C52712l implements C52670a<C18814b> {

        /* renamed from: a */
        public static final C45410b f114799a = new C45410b();

        C45410b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C18814b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.az$c */
    static final class C45411c extends C52712l implements C52670a<Set<String>> {

        /* renamed from: a */
        public static final C45411c f114800a = new C45411c();

        C45411c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m98978a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0042 A[Catch:{ NameNotFoundException -> 0x0058 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.Set<java.lang.String> m98978a() {
            /*
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                java.util.Set r0 = (java.util.Set) r0
                android.app.Application r1 = com.p683ss.android.ugc.aweme.framework.p1783d.C32463a.m75161a()     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r2 = "AppProvider.getApp()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ NameNotFoundException -> 0x0058 }
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0058 }
                android.app.Application r2 = com.p683ss.android.ugc.aweme.framework.p1783d.C32463a.m75161a()     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r3 = "AppProvider.getApp()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0058 }
                r3 = 128(0x80, float:1.794E-43)
                android.content.pm.ApplicationInfo r1 = com.p683ss.android.ugc.aweme.shortvideo.util.C45415ba.m98983a(r1, r2, r3)     // Catch:{ NameNotFoundException -> 0x0058 }
                android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r2 = "tools_opt_tag"
                java.lang.String r1 = r1.getString(r2)     // Catch:{ NameNotFoundException -> 0x0058 }
                r2 = r1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ NameNotFoundException -> 0x0058 }
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x003f
                int r2 = r2.length()     // Catch:{ NameNotFoundException -> 0x0058 }
                if (r2 != 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r2 = 0
                goto L_0x0040
            L_0x003f:
                r2 = 1
            L_0x0040:
                if (r2 != 0) goto L_0x0058
                r5 = r1
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r1 = ","
                r6[r3] = r1     // Catch:{ NameNotFoundException -> 0x0058 }
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                java.util.List r1 = p2628d.p2650m.C52830p.m112452b(r5, r6, r7, r8, r9, r10)     // Catch:{ NameNotFoundException -> 0x0058 }
                java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ NameNotFoundException -> 0x0058 }
                r0.addAll(r1)     // Catch:{ NameNotFoundException -> 0x0058 }
            L_0x0058:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.C45408az.C45411c.m98978a():java.util.Set");
        }
    }

    private C45408az() {
    }

    /* renamed from: a */
    private final boolean m98975a() {
        return ((Boolean) f114795c.getValue()).booleanValue();
    }

    /* renamed from: b */
    private final Set<String> m98976b() {
        return (Set) f114796d.getValue();
    }

    /* renamed from: c */
    private final C18814b m98977c() {
        return (C18814b) f114797e.getValue();
    }

    /* renamed from: a */
    public static final void m98974a(int i, String str, String str2) {
        C52711k.m112240b(str, "tag");
        C52711k.m112240b(str2, "message");
        if (f114794b.m98975a() && (!(!f114794b.m98976b().isEmpty()) || f114794b.m98976b().contains(str))) {
            Thread currentThread = Thread.currentThread();
            C52711k.m112236a((Object) currentThread, "Thread.currentThread()");
            int i2 = i;
            String str3 = str;
            C18816f a = C18816f.m45896a(i2, str3, "", currentThread.getId(), C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper()));
            a.f51991g = C18818a.MSG;
            a.f51992h = str2;
            f114794b.m98977c();
            C18814b.m45894a(a);
        }
    }
}
