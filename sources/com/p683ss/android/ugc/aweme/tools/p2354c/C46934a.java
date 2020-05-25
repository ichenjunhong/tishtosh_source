package com.p683ss.android.ugc.aweme.tools.p2354c;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.c.a */
final class C46934a<V> extends FutureTask<V> implements Comparable<Object> {

    /* renamed from: a */
    private final Comparable<?> f118582a;

    public final int compareTo(Object obj) {
        C52711k.m112240b(obj, "other");
        if (obj instanceof C46934a) {
            obj = ((C46934a) obj).f118582a;
        }
        if (this.f118582a == null || obj == null) {
            return 0;
        }
        Comparable<?> comparable = this.f118582a;
        if (comparable != null) {
            return comparable.compareTo(obj);
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Comparable<kotlin.Any>");
    }

    public C46934a(Callable<V> callable, Comparable<?> comparable) {
        C52711k.m112240b(callable, "callable");
        super(callable);
        this.f118582a = comparable;
    }

    public C46934a(Runnable runnable, V v, Comparable<?> comparable) {
        C52711k.m112240b(runnable, "runnable");
        super(runnable, v);
        this.f118582a = comparable;
    }
}
