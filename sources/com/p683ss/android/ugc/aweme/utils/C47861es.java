package com.p683ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.es */
public final class C47861es<T> extends C0198r<T> {

    /* renamed from: a */
    private WeakReference<C0184k> f120424a;

    /* renamed from: a */
    public final void mo95074a(C0184k kVar, C0199s<T> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        WeakReference<C0184k> weakReference = this.f120424a;
        if (weakReference != null) {
            C0184k kVar2 = (C0184k) weakReference.get();
            if (kVar2 != null) {
                removeObservers(kVar2);
            }
        }
        this.f120424a = new WeakReference<>(kVar);
        observe(kVar, sVar);
    }
}
