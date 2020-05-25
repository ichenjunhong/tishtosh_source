package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class aqk implements apg {

    /* renamed from: a */
    private static final byte[] f41219a = new byte[0];

    /* renamed from: b */
    private final atj f41220b;

    /* renamed from: c */
    private final apg f41221c;

    public aqk(atj atj, apg apg) {
        this.f41220b = atj;
        this.f41221c = apg;
    }

    /* renamed from: a */
    public final byte[] mo29441a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] f = apy.m33907b(this.f41220b).mo29580f();
        byte[] a = this.f41221c.mo29441a(f, f41219a);
        byte[] a2 = ((apg) apy.m33901a(this.f41220b.zzflw, awo.zzy(f), (Class) apy.m33900a(apg.class))).mo29441a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }
}
