package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;
import java.util.List;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f400a;

    /* renamed from: b */
    private final C0157a f401b = C0156a.f403a.mo296b(this.f400a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f400a = obj;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        C0157a aVar2 = this.f401b;
        Object obj = this.f400a;
        C0157a.m367a((List) aVar2.f406a.get(aVar), kVar, aVar, obj);
        C0157a.m367a((List) aVar2.f406a.get(C0177a.ON_ANY), kVar, aVar, obj);
    }
}
