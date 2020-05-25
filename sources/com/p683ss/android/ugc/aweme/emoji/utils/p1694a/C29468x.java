package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.x */
public final class C29468x implements Cloneable {

    /* renamed from: b */
    public static final C29468x f77162b = new C29468x(33639248);

    /* renamed from: c */
    public static final C29468x f77163c = new C29468x(67324752);

    /* renamed from: d */
    public static final C29468x f77164d = new C29468x(134695760);

    /* renamed from: e */
    static final C29468x f77165e = new C29468x(4294967295L);

    /* renamed from: a */
    public final long f77166a;

    public final int hashCode() {
        return (int) this.f77166a;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipLong value: ");
        sb.append(this.f77166a);
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo59558a() {
        return m69518a(this.f77166a);
    }

    private C29468x(long j) {
        this.f77166a = j;
    }

    /* renamed from: a */
    public static long m69516a(byte[] bArr) {
        return m69519b(bArr, 0);
    }

    /* renamed from: a */
    public static byte[] m69518a(long j) {
        byte[] bArr = new byte[4];
        m69517a(j, bArr, 0);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C29468x) || this.f77166a != ((C29468x) obj).f77166a) {
            return false;
        }
        return true;
    }

    public C29468x(byte[] bArr, int i) {
        this.f77166a = m69519b(bArr, i);
    }

    /* renamed from: a */
    public final void mo59557a(byte[] bArr, int i) {
        m69517a(this.f77166a, bArr, i);
    }

    /* renamed from: b */
    public static long m69519b(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] << 24)) & 4278190080L) + ((long) ((bArr[i + 2] << 16) & 16711680)) + ((long) ((bArr[i + 1] << 8) & 65280)) + ((long) (bArr[i] & 255));
    }

    /* renamed from: a */
    public static void m69517a(long j, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (255 & j));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((65280 & j) >> 8));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((16711680 & j) >> 16));
        bArr[i4] = (byte) ((int) ((j & 4278190080L) >> 24));
    }
}
