package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18086p;
import com.google.gson.C18089s;
import com.google.gson.C18090t;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C17982a;
import com.google.gson.internal.C18072k;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends C18095w<T> {

    /* renamed from: a */
    final C17971f f49970a;

    /* renamed from: b */
    private final C18090t<T> f49971b;

    /* renamed from: c */
    private final C18081k<T> f49972c;

    /* renamed from: d */
    private final C17956a<T> f49973d;

    /* renamed from: e */
    private final C18097x f49974e;

    /* renamed from: f */
    private final C17996a f49975f = new C17996a<>();

    /* renamed from: g */
    private C18095w<T> f49976g;

    static final class SingleTypeFactory implements C18097x {

        /* renamed from: a */
        private final C17956a<?> f49977a;

        /* renamed from: b */
        private final boolean f49978b;

        /* renamed from: c */
        private final Class<?> f49979c;

        /* renamed from: d */
        private final C18090t<?> f49980d;

        /* renamed from: e */
        private final C18081k<?> f49981e;

        public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
            boolean z;
            if (this.f49977a == null) {
                z = this.f49979c.isAssignableFrom(aVar.f49842b);
            } else if (this.f49977a.equals(aVar) || (this.f49978b && this.f49977a.f49843c == aVar.f49842b)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(this.f49980d, this.f49981e, fVar, aVar, this);
            return treeTypeAdapter;
        }

        SingleTypeFactory(Object obj, C17956a<?> aVar, boolean z, Class<?> cls) {
            C18090t<?> tVar;
            boolean z2;
            C18081k<?> kVar = null;
            if (obj instanceof C18090t) {
                tVar = (C18090t) obj;
            } else {
                tVar = null;
            }
            this.f49980d = tVar;
            if (obj instanceof C18081k) {
                kVar = (C18081k) obj;
            }
            this.f49981e = kVar;
            if (this.f49980d == null && this.f49981e == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C17982a.m44134a(z2);
            this.f49977a = aVar;
            this.f49978b = z;
            this.f49979c = cls;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$a */
    final class C17996a implements C18080j, C18089s {
        private C17996a() {
        }

        /* renamed from: a */
        public final <R> R mo34940a(C18082l lVar, Type type) throws C18086p {
            return TreeTypeAdapter.this.f49970a.mo34882a(lVar, type);
        }
    }

    /* renamed from: a */
    private C18095w<T> m44163a() {
        C18095w<T> wVar = this.f49976g;
        if (wVar != null) {
            return wVar;
        }
        C18095w<T> a = this.f49970a.mo34878a(this.f49974e, this.f49973d);
        this.f49976g = a;
        return a;
    }

    public final T read(C17958a aVar) throws IOException {
        if (this.f49972c == null) {
            return m44163a().read(aVar);
        }
        C18082l a = C18072k.m44265a(aVar);
        if (a.mo35008l()) {
            return null;
        }
        return this.f49972c.mo9501a(a, this.f49973d.f49843c, this.f49975f);
    }

    /* renamed from: a */
    public static C18097x m44165a(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    /* renamed from: a */
    public static C18097x m44164a(C17956a<?> aVar, Object obj) {
        boolean z;
        if (aVar.f49843c == aVar.f49842b) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, aVar, z, null);
    }

    public final void write(C17961c cVar, T t) throws IOException {
        if (this.f49971b == null) {
            m44163a().write(cVar, t);
        } else if (t == null) {
            cVar.mo34870f();
        } else {
            C18072k.m44267a(this.f49971b.mo9500a(t, this.f49973d.f49843c, this.f49975f), cVar);
        }
    }

    public TreeTypeAdapter(C18090t<T> tVar, C18081k<T> kVar, C17971f fVar, C17956a<T> aVar, C18097x xVar) {
        this.f49971b = tVar;
        this.f49972c = kVar;
        this.f49970a = fVar;
        this.f49973d = aVar;
        this.f49974e = xVar;
    }
}
