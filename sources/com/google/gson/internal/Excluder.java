package com.google.gson.internal;

import com.google.gson.C17955b;
import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1076a.C17953d;
import com.google.gson.p1076a.C17954e;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements C18097x, Cloneable {

    /* renamed from: a */
    public static final Excluder f49919a = new Excluder();

    /* renamed from: b */
    public double f49920b = -1.0d;

    /* renamed from: c */
    public int f49921c = 136;

    /* renamed from: d */
    public boolean f49922d = true;

    /* renamed from: e */
    public boolean f49923e;

    /* renamed from: f */
    public List<C17955b> f49924f = Collections.emptyList();

    /* renamed from: g */
    public List<C17955b> f49925g = Collections.emptyList();

    /* renamed from: a */
    public final Excluder mo34914a() {
        Excluder b = clone();
        b.f49923e = true;
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    private boolean m44121a(C17953d dVar) {
        if (dVar == null || dVar.mo34830a() <= this.f49920b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m44125d(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo34919c(Class<?> cls) {
        if (!cls.isMemberClass() || m44125d(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m44122a(C17954e eVar) {
        if (eVar == null || eVar.mo34831a() > this.f49920b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m44124b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo34917a(Class<?> cls) {
        if (this.f49920b != -1.0d && !mo34916a((C17953d) cls.getAnnotation(C17953d.class), (C17954e) cls.getAnnotation(C17954e.class))) {
            return true;
        }
        if ((this.f49922d || !mo34919c(cls)) && !m44124b(cls)) {
            return false;
        }
        return true;
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        final boolean z;
        final boolean z2;
        Class<? super T> cls = aVar.f49842b;
        boolean a = mo34917a(cls);
        if (a || mo34918a(cls, true)) {
            z = true;
        } else {
            z = false;
        }
        if (a || mo34918a(cls, false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return null;
        }
        final C17971f fVar2 = fVar;
        final C17956a<T> aVar2 = aVar;
        C179811 r5 = new C18095w<T>() {

            /* renamed from: f */
            private C18095w<T> f49931f;

            /* renamed from: a */
            private C18095w<T> m44132a() {
                C18095w<T> wVar = this.f49931f;
                if (wVar != null) {
                    return wVar;
                }
                C18095w<T> a = fVar2.mo34878a((C18097x) Excluder.this, aVar2);
                this.f49931f = a;
                return a;
            }

            public final T read(C17958a aVar) throws IOException {
                if (!z2) {
                    return m44132a().read(aVar);
                }
                aVar.mo34851o();
                return null;
            }

            public final void write(C17961c cVar, T t) throws IOException {
                if (z) {
                    cVar.mo34870f();
                } else {
                    m44132a().write(cVar, t);
                }
            }
        };
        return r5;
    }

    /* renamed from: a */
    public boolean mo34916a(C17953d dVar, C17954e eVar) {
        if (!m44121a(dVar) || !m44122a(eVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo34918a(Class<?> cls, boolean z) {
        List<C17955b> list;
        if (z) {
            list = this.f49924f;
        } else {
            list = this.f49925g;
        }
        for (C17955b shouldSkipClass : list) {
            if (shouldSkipClass.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Excluder mo34915a(C17955b bVar, boolean z, boolean z2) {
        Excluder b = clone();
        if (z) {
            b.f49924f = new ArrayList(this.f49924f);
            b.f49924f.add(bVar);
        }
        if (z2) {
            b.f49925g = new ArrayList(this.f49925g);
            b.f49925g.add(bVar);
        }
        return b;
    }
}
