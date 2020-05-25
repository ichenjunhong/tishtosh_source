package com.google.p1057b.p1059b;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.b.b.b */
public interface C17443b<K, V> {
    /* renamed from: a */
    V mo33771a(Object obj);

    /* renamed from: a */
    V mo33772a(K k, Callable<? extends V> callable) throws ExecutionException;

    /* renamed from: a */
    ConcurrentMap<K, V> mo33773a();

    /* renamed from: a */
    void mo33774a(K k, V v);

    /* renamed from: b */
    void mo33775b(Object obj);
}
