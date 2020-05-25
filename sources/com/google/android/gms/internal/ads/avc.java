package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class avc implements apg {

    /* renamed from: a */
    private final avn f41417a;

    /* renamed from: b */
    private final apt f41418b;

    /* renamed from: c */
    private final int f41419c;

    public avc(avn avn, apt apt, int i) {
        this.f41417a = avn;
        this.f41418b = apt;
        this.f41419c = i;
    }

    /* renamed from: a */
    public final byte[] mo29441a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f41417a.mo29551a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return aul.m34176a(a, this.f41418b.mo29460a(aul.m34176a(bArr2, a, copyOf)));
    }
}
