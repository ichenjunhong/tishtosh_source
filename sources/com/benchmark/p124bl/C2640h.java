package com.benchmark.p124bl;

import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.benchmark.bl.h */
final /* synthetic */ class C2640h implements C0011g {

    /* renamed from: a */
    private final Runnable f8075a;

    C2640h(Runnable runnable) {
        this.f8075a = runnable;
    }

    public final Object then(C0013i iVar) {
        Runnable runnable = this.f8075a;
        if (iVar.mo26b() && ((Boolean) iVar.mo34e()).booleanValue() && runnable != null) {
            runnable.run();
        }
        return null;
    }
}
