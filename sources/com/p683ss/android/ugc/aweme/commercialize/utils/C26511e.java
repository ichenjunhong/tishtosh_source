package com.p683ss.android.ugc.aweme.commercialize.utils;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.e */
public final class C26511e {

    /* renamed from: a */
    public static Set<String> f69832a;

    /* renamed from: b */
    public static Set<Long> f69833b;

    /* renamed from: c */
    public static long f69834c;

    /* renamed from: d */
    public static final C26511e f69835d = new C26511e();

    private C26511e() {
    }

    /* renamed from: a */
    public static final int m64101a() {
        return f69832a.size() + 1;
    }

    /* renamed from: b */
    public static final long m64103b() {
        if (f69834c != 0) {
            return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - f69834c);
        }
        return -1;
    }

    static {
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        C52711k.m112236a((Object) synchronizedSet, "Collections.synchronizedSet(mutableSetOf())");
        f69832a = synchronizedSet;
        Set<Long> synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        C52711k.m112236a((Object) synchronizedSet2, "Collections.synchronizedSet(mutableSetOf())");
        f69833b = synchronizedSet2;
    }

    /* renamed from: a */
    public static final void m64102a(int i) {
        if (i != 2) {
            f69832a.clear();
            f69833b.clear();
        }
    }
}
