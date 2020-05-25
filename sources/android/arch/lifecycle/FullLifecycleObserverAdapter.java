package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f389a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f389a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        switch (aVar) {
            case ON_CREATE:
                return;
            case ON_START:
                return;
            case ON_RESUME:
                return;
            case ON_PAUSE:
                return;
            case ON_STOP:
                return;
            case ON_DESTROY:
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
