package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.o */
public class C29452o implements C29437c {

    /* renamed from: a */
    static final C29471z f77109a = new C29471z(1);

    /* renamed from: g */
    private static final byte[] f77110g = new byte[0];

    /* renamed from: b */
    public C29455r f77111b;

    /* renamed from: c */
    public C29455r f77112c;

    /* renamed from: d */
    public C29455r f77113d;

    /* renamed from: e */
    public C29468x f77114e;

    /* renamed from: f */
    byte[] f77115f;

    /* renamed from: e */
    public final C29471z mo59512e() {
        return f77109a;
    }

    /* renamed from: d */
    public final C29471z mo59510d() {
        int i;
        if (this.f77111b != null) {
            i = 16;
        } else {
            i = 0;
        }
        return new C29471z(i);
    }

    /* renamed from: b */
    public final C29471z mo59508b() {
        int i;
        int i2;
        int i3 = 8;
        int i4 = 0;
        if (this.f77111b != null) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f77112c != null) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        int i5 = i + i2;
        if (this.f77113d == null) {
            i3 = 0;
        }
        int i6 = i5 + i3;
        if (this.f77114e != null) {
            i4 = 4;
        }
        return new C29471z(i6 + i4);
    }

    /* renamed from: c */
    public final byte[] mo59509c() {
        if (this.f77111b == null && this.f77112c == null) {
            return f77110g;
        }
        if (this.f77111b == null || this.f77112c == null) {
            throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
        }
        byte[] bArr = new byte[16];
        m69467a(bArr);
        return bArr;
    }

    /* renamed from: a */
    public final byte[] mo59507a() {
        byte[] bArr = new byte[mo59508b().f77201a];
        int a = m69467a(bArr);
        if (this.f77113d != null) {
            System.arraycopy(this.f77113d.mo59527a(), 0, bArr, a, 8);
            a += 8;
        }
        if (this.f77114e != null) {
            System.arraycopy(this.f77114e.mo59558a(), 0, bArr, a, 4);
        }
        return bArr;
    }

    /* renamed from: a */
    private int m69467a(byte[] bArr) {
        int i;
        if (this.f77111b != null) {
            System.arraycopy(this.f77111b.mo59527a(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        if (this.f77112c == null) {
            return i;
        }
        System.arraycopy(this.f77112c.mo59527a(), 0, bArr, i, 8);
        return i + 8;
    }

    /* renamed from: a */
    public final void mo59506a(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            if (i2 >= 16) {
                this.f77111b = new C29455r(bArr, i);
                int i3 = i + 8;
                this.f77112c = new C29455r(bArr, i3);
                int i4 = i3 + 8;
                int i5 = i2 - 16;
                if (i5 >= 8) {
                    this.f77113d = new C29455r(bArr, i4);
                    i4 += 8;
                    i5 -= 8;
                }
                if (i5 >= 4) {
                    this.f77114e = new C29468x(bArr, i4);
                }
                return;
            }
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
    }

    /* renamed from: b */
    public final void mo59513b(byte[] bArr, int i, int i2) throws ZipException {
        this.f77115f = new byte[i2];
        System.arraycopy(bArr, i, this.f77115f, 0, i2);
        if (i2 >= 28) {
            mo59506a(bArr, i, i2);
        } else if (i2 == 24) {
            this.f77111b = new C29455r(bArr, i);
            int i3 = i + 8;
            this.f77112c = new C29455r(bArr, i3);
            this.f77113d = new C29455r(bArr, i3 + 8);
        } else {
            if (i2 % 8 == 4) {
                this.f77114e = new C29468x(bArr, (i + i2) - 4);
            }
        }
    }
}
