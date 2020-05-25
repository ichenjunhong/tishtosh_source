package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0167d[] f388a;

    CompositeGeneratedAdaptersObserver(C0167d[] dVarArr) {
        this.f388a = dVarArr;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        C0197q qVar = new C0197q();
        for (C0167d a : this.f388a) {
            a.mo313a(kVar, aVar, false, qVar);
        }
        for (C0167d a2 : this.f388a) {
            a2.mo313a(kVar, aVar, true, qVar);
        }
    }
}
