package com.bytedance.jedi.p725a.p743m;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.jedi.a.m.n */
public final class C11778n<T> {

    /* renamed from: a */
    public final ConcurrentHashMap<String, WeakReference<T>> f31275a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final ReferenceQueue<T> f31276b = new ReferenceQueue<>();
}
