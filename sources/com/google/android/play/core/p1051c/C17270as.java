package com.google.android.play.core.p1051c;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.play.core.c.as */
final class C17270as extends C17269ar {

    /* renamed from: a */
    private byte[] f48742a;

    public C17270as(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f48742a = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f48742a;
    }
}
