package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.C15369c;

/* renamed from: com.google.android.gms.internal.measurement.s */
public final class C16861s {

    /* renamed from: a */
    public static final String f47331a = String.valueOf(C15369c.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");

    /* renamed from: b */
    public static final String f47332b;

    static {
        String str = "ma";
        String valueOf = String.valueOf(f47331a);
        f47332b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
