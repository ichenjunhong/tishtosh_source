package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fx */
final class C16696fx extends C16702gc {

    /* renamed from: b */
    private final int f46940b;

    /* renamed from: c */
    private final int f46941c;

    C16696fx(byte[] bArr, int i, int i2) {
        super(bArr);
        m39866b(i, i + i2, bArr.length);
        this.f46940b = i;
        this.f46941c = i2;
    }

    public final byte zzam(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f46952a[this.f46940b + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte mo32014a(int i) {
        return this.f46952a[this.f46940b + i];
    }

    public final int size() {
        return this.f46941c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo32033a() {
        return this.f46940b;
    }
}
