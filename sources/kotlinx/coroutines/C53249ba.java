package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53305b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ba */
public abstract class C53249ba extends C53360z {

    /* renamed from: b */
    private long f131872b;

    /* renamed from: c */
    private boolean f131873c;

    /* renamed from: d */
    private C53305b<C53224au<?>> f131874d;

    /* renamed from: c */
    private static long m113132c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo110845h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo110840c() {
        return mo110844g();
    }

    /* renamed from: f */
    public final boolean mo110843f() {
        if (this.f131872b >= m113132c(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo110844g() {
        C53305b<C53224au<?>> bVar = this.f131874d;
        if (bVar != null) {
            return bVar.mo110899a();
        }
        return true;
    }

    /* renamed from: b */
    public long mo110838b() {
        if (!mo110842e()) {
            return Long.MAX_VALUE;
        }
        return mo110841d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo110841d() {
        C53305b<C53224au<?>> bVar = this.f131874d;
        if (bVar != null && !bVar.mo110899a()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: e */
    public final boolean mo110842e() {
        C53305b<C53224au<?>> bVar = this.f131874d;
        if (bVar == null) {
            return false;
        }
        C53224au auVar = (C53224au) bVar.mo110900b();
        if (auVar == null) {
            return false;
        }
        auVar.run();
        return true;
    }

    /* renamed from: a */
    public final void mo110837a(boolean z) {
        this.f131872b += m113132c(z);
        if (!z) {
            this.f131873c = true;
        }
    }

    /* renamed from: a */
    public final void mo110836a(C53224au<?> auVar) {
        C52711k.m112240b(auVar, "task");
        C53305b<C53224au<?>> bVar = this.f131874d;
        if (bVar == null) {
            bVar = new C53305b<>();
            this.f131874d = bVar;
        }
        bVar.mo110898a(auVar);
    }

    /* renamed from: b */
    public final void mo110839b(boolean z) {
        boolean z2;
        this.f131872b -= m113132c(z);
        if (this.f131872b <= 0) {
            if (this.f131872b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f131873c) {
                    mo110845h();
                }
                return;
            }
            throw new IllegalStateException("Extra decrementUseCount".toString());
        }
    }
}
