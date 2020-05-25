package com.google.android.gms.internal.ads;

final class aza implements azi {

    /* renamed from: a */
    private azi[] f41655a;

    aza(azi... aziArr) {
        this.f41655a = aziArr;
    }

    /* renamed from: a */
    public final boolean mo29818a(Class<?> cls) {
        for (azi a : this.f41655a) {
            if (a.mo29818a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final azh mo29819b(Class<?> cls) {
        azi[] aziArr;
        for (azi azi : this.f41655a) {
            if (azi.mo29818a(cls)) {
                return azi.mo29819b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
