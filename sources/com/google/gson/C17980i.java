package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.i */
public final class C17980i extends C18082l implements Iterable<C18082l> {

    /* renamed from: a */
    private final List<C18082l> f49918a = new ArrayList();

    /* renamed from: a */
    public final int mo34901a() {
        return this.f49918a.size();
    }

    public final int hashCode() {
        return this.f49918a.hashCode();
    }

    public final Iterator<C18082l> iterator() {
        return this.f49918a.iterator();
    }

    /* renamed from: b */
    public final Number mo34904b() {
        if (this.f49918a.size() == 1) {
            return ((C18082l) this.f49918a.get(0)).mo34904b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final String mo34905c() {
        if (this.f49918a.size() == 1) {
            return ((C18082l) this.f49918a.get(0)).mo34905c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final double mo34906d() {
        if (this.f49918a.size() == 1) {
            return ((C18082l) this.f49918a.get(0)).mo34906d();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final float mo34907e() {
        if (this.f49918a.size() == 1) {
            return ((C18082l) this.f49918a.get(0)).mo34907e();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public final long mo34909f() {
        if (this.f49918a.size() == 1) {
            return ((C18082l) this.f49918a.get(0)).mo34909f();
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public final int mo34910g() {
        if (this.f49918a.size() == 1) {
            return ((C18082l) this.f49918a.get(0)).mo34910g();
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final boolean mo34911h() {
        if (this.f49918a.size() == 1) {
            return ((C18082l) this.f49918a.get(0)).mo34911h();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final C18082l mo34902a(int i) {
        return (C18082l) this.f49918a.get(i);
    }

    /* renamed from: a */
    public final void mo34903a(C18082l lVar) {
        if (lVar == null) {
            lVar = C18084n.f50144a;
        }
        this.f49918a.add(lVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C17980i) && ((C17980i) obj).f49918a.equals(this.f49918a))) {
            return true;
        }
        return false;
    }
}
