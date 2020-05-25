package com.google.android.gms.internal.ads;

final class awt extends awy {

    /* renamed from: b */
    private final int f41473b;

    /* renamed from: c */
    private final int f41474c;

    awt(byte[] bArr, int i, int i2) {
        super(bArr);
        m34292b(i, i + i2, bArr.length);
        this.f41473b = i;
        this.f41474c = i2;
    }

    public final byte zzfi(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f41477a[this.f41473b + i];
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
    public final byte mo29609a(int i) {
        return this.f41477a[this.f41473b + i];
    }

    public final int size() {
        return this.f41474c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29631a() {
        return this.f41473b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29613a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f41477a, mo29631a(), bArr, 0, i3);
    }
}
