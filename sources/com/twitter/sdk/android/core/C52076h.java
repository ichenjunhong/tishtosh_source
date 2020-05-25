package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.internal.p2618b.C52106b;
import com.twitter.sdk.android.core.internal.p2618b.C52108d;
import com.twitter.sdk.android.core.internal.p2618b.C52109e;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.h */
public final class C52076h<T extends C52188j> implements C52189k<T> {

    /* renamed from: a */
    private final C52106b f129658a;

    /* renamed from: b */
    private final C52109e<T> f129659b;

    /* renamed from: c */
    private final ConcurrentHashMap<Long, T> f129660c;

    /* renamed from: d */
    private final ConcurrentHashMap<Long, C52108d<T>> f129661d;

    /* renamed from: e */
    private final C52108d<T> f129662e;

    /* renamed from: f */
    private final AtomicReference<T> f129663f;

    /* renamed from: g */
    private final String f129664g;

    /* renamed from: h */
    private volatile boolean f129665h;

    /* renamed from: c */
    private void m111399c() {
        if (this.f129665h) {
            m111400d();
        }
    }

    /* renamed from: a */
    public final T mo108768a() {
        m111399c();
        return (C52188j) this.f129663f.get();
    }

    /* renamed from: b */
    public final Map<Long, T> mo108771b() {
        m111399c();
        return Collections.unmodifiableMap(this.f129660c);
    }

    /* renamed from: d */
    private synchronized void m111400d() {
        if (this.f129665h) {
            C52108d<T> dVar = this.f129662e;
            C52188j jVar = (C52188j) dVar.f129713b.mo108764a(dVar.f129712a.mo108807a().getString(dVar.f129714c, null));
            if (jVar != null) {
                m111397a(jVar.f129902b, jVar, false);
            }
            for (Entry entry : this.f129658a.mo108807a().getAll().entrySet()) {
                if (((String) entry.getKey()).startsWith(this.f129664g)) {
                    C52188j jVar2 = (C52188j) this.f129659b.mo108764a((String) entry.getValue());
                    if (jVar2 != null) {
                        m111397a(jVar2.f129902b, jVar2, false);
                    }
                }
            }
            this.f129665h = false;
        }
    }

    /* renamed from: c */
    private String m111398c(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f129664g);
        sb.append("_");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final T mo108769a(long j) {
        m111399c();
        return (C52188j) this.f129660c.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo108770a(T t) {
        if (t != null) {
            m111399c();
            m111397a(t.f129902b, t, true);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }

    /* renamed from: b */
    public final void mo108772b(long j) {
        m111399c();
        if (this.f129663f.get() != null && ((C52188j) this.f129663f.get()).f129902b == 0) {
            synchronized (this) {
                this.f129663f.set(null);
                this.f129662e.mo108810a();
            }
        }
        this.f129660c.remove(Long.valueOf(0));
        C52108d dVar = (C52108d) this.f129661d.remove(Long.valueOf(0));
        if (dVar != null) {
            dVar.mo108810a();
        }
    }

    /* renamed from: a */
    private void m111397a(long j, T t, boolean z) {
        this.f129660c.put(Long.valueOf(j), t);
        C52108d dVar = (C52108d) this.f129661d.get(Long.valueOf(j));
        if (dVar == null) {
            dVar = new C52108d(this.f129658a, this.f129659b, m111398c(j));
            this.f129661d.putIfAbsent(Long.valueOf(j), dVar);
        }
        dVar.mo108811a(t);
        C52188j jVar = (C52188j) this.f129663f.get();
        if (jVar == null || jVar.f129902b == j || z) {
            synchronized (this) {
                this.f129663f.compareAndSet(jVar, t);
                this.f129662e.mo108811a(t);
            }
        }
    }

    public C52076h(C52106b bVar, C52109e<T> eVar, String str, String str2) {
        this(bVar, eVar, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new C52108d(bVar, eVar, str), str2);
    }

    private C52076h(C52106b bVar, C52109e<T> eVar, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, C52108d<T>> concurrentHashMap2, C52108d<T> dVar, String str) {
        this.f129665h = true;
        this.f129658a = bVar;
        this.f129659b = eVar;
        this.f129660c = concurrentHashMap;
        this.f129661d = concurrentHashMap2;
        this.f129662e = dVar;
        this.f129663f = new AtomicReference<>();
        this.f129664g = str;
    }
}
