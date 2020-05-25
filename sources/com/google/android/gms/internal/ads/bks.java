package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bks extends IOException {

    /* renamed from: a */
    private final String f42817a;

    public bks(String str) {
        String str2 = "Unsupported URI scheme: ";
        String valueOf = String.valueOf(str);
        super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.f42817a = str;
    }
}
