package com.p683ss.ugc.aweme.performance.mainlooper.p2593a;

import com.p683ss.ugc.aweme.performance.mainlooper.monitor.p2594a.C51551a;
import java.util.LinkedList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.a.a */
public final class C51550a {

    /* renamed from: a */
    public static final C51550a f128765a = new C51550a();

    /* renamed from: b */
    private static LinkedList<C51551a> f128766b = new LinkedList<>();

    /* renamed from: c */
    private static final int f128767c = 4;

    private C51550a() {
    }

    /* renamed from: a */
    public final synchronized C51551a mo103731a() {
        C51551a aVar;
        aVar = (C51551a) f128766b.pollFirst();
        if (aVar == null) {
            aVar = new C51551a(null, 1, null);
        }
        return aVar;
    }

    /* renamed from: a */
    public final synchronized void mo103732a(C51551a aVar) {
        C52711k.m112240b(aVar, "logRunnable");
        if (f128766b.size() <= f128767c) {
            aVar.f128769b = "";
            f128766b.addLast(aVar);
        }
    }
}
