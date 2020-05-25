package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class aus implements apn {

    /* renamed from: a */
    private static final byte[] f41380a = new byte[0];

    /* renamed from: b */
    private final auu f41381b;

    /* renamed from: c */
    private final String f41382c;

    /* renamed from: d */
    private final byte[] f41383d;

    /* renamed from: e */
    private final avb f41384e;

    /* renamed from: f */
    private final auq f41385f;

    public aus(ECPublicKey eCPublicKey, byte[] bArr, String str, avb avb, auq auq) throws GeneralSecurityException {
        auy.m34203a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f41381b = new auu(eCPublicKey);
        this.f41383d = bArr;
        this.f41382c = str;
        this.f41384e = avb;
        this.f41385f = auq;
    }

    /* renamed from: a */
    public final byte[] mo29444a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        auv a = this.f41381b.mo29557a(this.f41382c, this.f41383d, bArr2, this.f41385f.mo29466a(), this.f41384e);
        auq auq = this.f41385f;
        byte[] bArr4 = null;
        if (a.f41389b == null) {
            bArr3 = null;
        } else {
            bArr3 = a.f41389b.mo29570a();
        }
        byte[] a2 = auq.mo29467a(bArr3).mo29441a(bArr, f41380a);
        if (a.f41388a != null) {
            bArr4 = a.f41388a.mo29570a();
        }
        return ByteBuffer.allocate(bArr4.length + a2.length).put(bArr4).put(a2).array();
    }
}
