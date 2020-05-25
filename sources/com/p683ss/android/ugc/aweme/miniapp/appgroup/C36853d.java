package com.p683ss.android.ugc.aweme.miniapp.appgroup;

import java.util.HashSet;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.d */
public final class C36853d {

    /* renamed from: a */
    public static final C36853d f94190a = new C36853d();

    /* renamed from: b */
    private static HashSet<C36854a> f94191b = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.d$a */
    public interface C36854a {
    }

    private C36853d() {
    }

    /* renamed from: a */
    public static boolean m82920a(C36854a aVar) {
        C52711k.m112240b(aVar, "listener");
        return f94191b.add(aVar);
    }

    /* renamed from: b */
    public static boolean m82921b(C36854a aVar) {
        C52711k.m112240b(aVar, "listener");
        return f94191b.remove(aVar);
    }
}
