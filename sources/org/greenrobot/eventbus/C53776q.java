package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.q */
final class C53776q {

    /* renamed from: a */
    final Object f133387a;

    /* renamed from: b */
    final C53773o f133388b;

    /* renamed from: c */
    volatile boolean f133389c = true;

    public final int hashCode() {
        return this.f133387a.hashCode() + this.f133388b.f133373f.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53776q)) {
            return false;
        }
        C53776q qVar = (C53776q) obj;
        if (this.f133387a != qVar.f133387a || !this.f133388b.equals(qVar.f133388b)) {
            return false;
        }
        return true;
    }

    C53776q(Object obj, C53773o oVar) {
        this.f133387a = obj;
        this.f133388b = oVar;
    }
}
