package com.google.android.gms.internal.ads;

public final class avm {

    /* renamed from: a */
    private final byte[] f41432a;

    /* renamed from: a */
    public static avm m34226a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new avm(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo29570a() {
        byte[] bArr = new byte[this.f41432a.length];
        System.arraycopy(this.f41432a, 0, bArr, 0, this.f41432a.length);
        return bArr;
    }

    private avm(byte[] bArr, int i, int i2) {
        this.f41432a = new byte[i2];
        System.arraycopy(bArr, 0, this.f41432a, 0, i2);
    }
}
