package com.p683ss.android.ugc.effectmanager;

import com.p683ss.android.ugc.effectmanager.common.C48659h;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.effectmanager.m */
public final class C48906m {

    /* renamed from: a */
    final C48659h<C0013i<C48909o>> f123054a;

    /* renamed from: b */
    volatile C48904l f123055b;

    /* renamed from: a */
    public final synchronized C48904l mo96717a() {
        if (this.f123055b == null) {
            C0013i iVar = (C0013i) this.f123054a.mo96137a();
            try {
                iVar.mo36g();
                if (!iVar.mo33d()) {
                    this.f123055b = ((C48909o) iVar.mo34e()).mo96738a();
                    if (this.f123055b == null) {
                        throw new RuntimeException("config == null");
                    }
                } else {
                    throw new RuntimeException(iVar.mo35f());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f123055b;
    }

    public C48906m(C48659h<C0013i<C48909o>> hVar) {
        this.f123054a = hVar;
    }
}
