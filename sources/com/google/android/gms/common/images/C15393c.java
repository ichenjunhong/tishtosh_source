package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.images.ImageManager.C15387a;
import com.google.android.gms.common.internal.C15462p;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.c */
public final class C15393c extends C15391a {

    /* renamed from: c */
    private WeakReference<C15387a> f39719c;

    public final int hashCode() {
        return C15462p.m32118a(this.f39716a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15393c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C15393c cVar = (C15393c) obj;
        C15387a aVar = (C15387a) this.f39719c.get();
        C15387a aVar2 = (C15387a) cVar.f39719c.get();
        return aVar2 != null && aVar != null && C15462p.m32120a(aVar2, aVar) && C15462p.m32120a(cVar.f39716a, this.f39716a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28342a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        this.f39719c.get();
    }
}
