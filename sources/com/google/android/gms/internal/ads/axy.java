package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15675e;

final class axy implements azi {

    /* renamed from: a */
    static final axy f41604a = new axy();

    private axy() {
    }

    /* renamed from: a */
    public final boolean mo29818a(Class<?> cls) {
        return axz.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final azh mo29819b(Class<?> cls) {
        if (!axz.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (azh) axz.m34712a(cls.asSubclass(axz.class)).mo28773a(C15675e.f41611c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
