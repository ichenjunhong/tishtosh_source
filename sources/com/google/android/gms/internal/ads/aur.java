package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

public final class aur implements C15614apm {

    /* renamed from: a */
    private static final byte[] f41373a = new byte[0];

    /* renamed from: b */
    private final ECPrivateKey f41374b;

    /* renamed from: c */
    private final aut f41375c;

    /* renamed from: d */
    private final String f41376d;

    /* renamed from: e */
    private final byte[] f41377e;

    /* renamed from: f */
    private final avb f41378f;

    /* renamed from: g */
    private final auq f41379g;

    public aur(ECPrivateKey eCPrivateKey, byte[] bArr, String str, avb avb, auq auq) throws GeneralSecurityException {
        this.f41374b = eCPrivateKey;
        this.f41375c = new aut(eCPrivateKey);
        this.f41377e = bArr;
        this.f41376d = str;
        this.f41378f = avb;
        this.f41379g = auq;
    }
}
