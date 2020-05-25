package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class auh implements avn {

    /* renamed from: a */
    private final SecretKeySpec f41360a;

    /* renamed from: b */
    private final int f41361b;

    /* renamed from: c */
    private final int f41362c = ((Cipher) avd.f41420a.mo29568a("AES/CTR/NoPadding")).getBlockSize();

    public auh(byte[] bArr, int i) throws GeneralSecurityException {
        avu.m34236a(bArr.length);
        this.f41360a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f41362c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f41361b = i;
    }

    /* renamed from: a */
    public final byte[] mo29551a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - this.f41361b) {
            byte[] bArr2 = new byte[(this.f41361b + bArr.length)];
            byte[] a = avr.m34234a(this.f41361b);
            System.arraycopy(a, 0, bArr2, 0, this.f41361b);
            int length = bArr.length;
            int i = this.f41361b;
            Cipher cipher = (Cipher) avd.f41420a.mo29568a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.f41362c];
            System.arraycopy(a, 0, bArr3, 0, this.f41361b);
            cipher.init(1, this.f41360a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i2 = Integer.MAX_VALUE - this.f41361b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
