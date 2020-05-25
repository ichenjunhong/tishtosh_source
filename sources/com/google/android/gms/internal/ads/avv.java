package com.google.android.gms.internal.ads;

import com.C2240a;
import java.security.InvalidKeyException;
import java.util.Arrays;

final class avv extends aun {
    avv(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo29552a() {
        return 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int[] mo29553a(int[] iArr, int i) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            aun.m34182a(iArr3, this.f41369a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            aun.m34180a(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            aun.m34182a(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(C2240a.m6772a("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }
}
