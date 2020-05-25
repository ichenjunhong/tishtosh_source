package com.p683ss.ugc.aweme.performance.core.monitor;

import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51535d;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.b */
public final class C51531b {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C51535d> f128719a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static ConcurrentHashMap<String, Integer> f128720b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static int f128721c = 1;

    /* renamed from: d */
    public static final C51531b f128722d = new C51531b();

    private C51531b() {
    }

    /* renamed from: a */
    public static C51535d m110665a(String str) {
        C52711k.m112240b(str, "key");
        return (C51535d) f128719a.get(str);
    }
}
