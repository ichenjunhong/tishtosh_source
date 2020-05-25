package com.p683ss.android.ugc.aweme.discover.p1645g;

import com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28338q;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28114c;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28115d;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import java.util.HashMap;
import java.util.Map;
import p001a.C0013i;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.n */
public final class C28136n {

    /* renamed from: a */
    public static final Map<C28338q, C52847n<C28338q, C0013i<C28334m>>> f73883a = new HashMap();

    /* renamed from: b */
    public static final boolean f73884b = C41457i.f105090b.mo84197a();

    /* renamed from: c */
    public static long f73885c;

    /* renamed from: d */
    public static int f73886d;

    /* renamed from: e */
    public static int f73887e;

    /* renamed from: f */
    public static final C28136n f73888f = new C28136n();

    private C28136n() {
    }

    /* renamed from: a */
    public static boolean m66997a() {
        return f73884b;
    }

    /* renamed from: c */
    public static void m67001c() {
        f73886d++;
    }

    /* renamed from: b */
    public static boolean m66999b() {
        if (f73886d <= 0 || f73887e != f73886d) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m66998b(C28338q qVar) {
        C52711k.m112240b(qVar, "request");
        f73883a.remove(qVar);
    }

    /* renamed from: a */
    public final C52847n<C28338q, C0013i<C28334m>> mo56561a(C28338q qVar) {
        C52711k.m112240b(qVar, "request");
        C52847n<C28338q, C0013i<C28334m>> c = m67000c(qVar);
        m66998b(qVar);
        return c;
    }

    /* renamed from: c */
    private static C52847n<C28338q, C0013i<C28334m>> m67000c(C28338q qVar) {
        C52711k.m112240b(qVar, "request");
        C52847n<C28338q, C0013i<C28334m>> nVar = (C52847n) f73883a.get(qVar);
        if (nVar == null) {
            return null;
        }
        C28114c a = C28116e.m66923a(qVar.f74392a);
        if (!C52711k.m112239a((Object) a, (Object) C28115d.m66921a())) {
            a.f73836q = 1;
        }
        return nVar;
    }
}
