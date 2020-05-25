package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.C17150c;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.ah */
final class C15251ah extends C17150c {

    /* renamed from: a */
    private final WeakReference<C15244aa> f39367a;

    C15251ah(C15244aa aaVar) {
        this.f39367a = new WeakReference<>(aaVar);
    }

    /* renamed from: a */
    public final void mo28166a(zaj zaj) {
        C15244aa aaVar = (C15244aa) this.f39367a.get();
        if (aaVar != null) {
            aaVar.f39335a.mo28186a((C15266aw) new C15252ai(this, aaVar, aaVar, zaj));
        }
    }
}
