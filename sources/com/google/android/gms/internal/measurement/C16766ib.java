package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ib */
final class C16766ib implements C16774ij {

    /* renamed from: a */
    private C16774ij[] f47137a;

    C16766ib(C16774ij... ijVarArr) {
        this.f47137a = ijVarArr;
    }

    /* renamed from: a */
    public final boolean mo32224a(Class<?> cls) {
        for (C16774ij a : this.f47137a) {
            if (a.mo32224a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C16773ii mo32225b(Class<?> cls) {
        C16774ij[] ijVarArr;
        for (C16774ij ijVar : this.f47137a) {
            if (ijVar.mo32224a(cls)) {
                return ijVar.mo32225b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
