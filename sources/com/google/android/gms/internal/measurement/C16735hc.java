package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16741e;

/* renamed from: com.google.android.gms.internal.measurement.hc */
final class C16735hc implements C16774ij {

    /* renamed from: a */
    static final C16735hc f47085a = new C16735hc();

    private C16735hc() {
    }

    /* renamed from: a */
    public final boolean mo32224a(Class<?> cls) {
        return C16736hd.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final C16773ii mo32225b(Class<?> cls) {
        if (!C16736hd.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C16773ii) C16736hd.m40277a(cls.asSubclass(C16736hd.class)).mo31917a(C16741e.f47092c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
