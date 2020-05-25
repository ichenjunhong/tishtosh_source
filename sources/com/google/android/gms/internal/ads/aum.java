package com.google.android.gms.internal.ads;

import com.C2240a;
import java.security.InvalidKeyException;

final class aum extends aun {
    aum(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo29552a() {
        return 12;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int[] mo29553a(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            aun.m34182a(iArr2, this.f41369a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(C2240a.m6772a("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }
}
