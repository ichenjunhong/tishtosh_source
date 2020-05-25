package com.google.p1057b.p1059b;

import com.google.p1057b.p1060c.C17722w;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.b.b.f */
public abstract class C17453f<K, V> extends C17722w implements C17443b<K, V> {
    protected C17453f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C17443b<K, V> delegate();

    /* renamed from: a */
    public final ConcurrentMap<K, V> mo33773a() {
        return delegate().mo33773a();
    }

    /* renamed from: b */
    public final void mo33775b(Object obj) {
        delegate().mo33775b(obj);
    }

    /* renamed from: a */
    public final V mo33771a(Object obj) {
        return delegate().mo33771a(obj);
    }

    /* renamed from: a */
    public final void mo33774a(K k, V v) {
        delegate().mo33774a(k, v);
    }

    /* renamed from: a */
    public final V mo33772a(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().mo33772a(k, callable);
    }
}
