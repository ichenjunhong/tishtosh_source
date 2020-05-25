package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.a */
public abstract class C29434a implements C29460v {

    /* renamed from: a */
    public long f77068a;

    /* renamed from: b */
    byte[] f77069b;

    /* renamed from: c */
    private byte[] f77070c;

    protected C29434a() {
    }

    /* renamed from: c */
    public final byte[] mo59509c() {
        return mo59507a();
    }

    /* renamed from: d */
    public final C29471z mo59510d() {
        return mo59508b();
    }

    /* renamed from: b */
    public final C29471z mo59508b() {
        if (this.f77070c == null) {
            m69409f();
        }
        return new C29471z(this.f77070c.length);
    }

    /* renamed from: a */
    public final byte[] mo59507a() {
        if (this.f77070c == null) {
            m69409f();
        }
        if (this.f77070c == null) {
            return null;
        }
        byte[] bArr = new byte[this.f77070c.length];
        System.arraycopy(this.f77070c, 0, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: f */
    private void m69409f() {
        if (this.f77069b != null) {
            this.f77070c = new byte[(this.f77069b.length + 5)];
            this.f77070c[0] = 1;
            System.arraycopy(C29468x.m69518a(this.f77068a), 0, this.f77070c, 1, 4);
            System.arraycopy(this.f77069b, 0, this.f77070c, 5, this.f77069b.length);
        }
    }

    /* renamed from: a */
    public final void mo59506a(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 >= 5) {
            byte b = bArr[i];
            if (b == 1) {
                this.f77068a = C29468x.m69519b(bArr, i + 1);
                int i3 = i2 - 5;
                this.f77069b = new byte[i3];
                System.arraycopy(bArr, i + 5, this.f77069b, 0, i3);
                this.f77070c = null;
                return;
            }
            StringBuilder sb = new StringBuilder("Unsupported version [");
            sb.append(b);
            sb.append("] for UniCode path extra data.");
            throw new ZipException(sb.toString());
        }
        throw new ZipException("UniCode path extra data must have at least 5 bytes.");
    }
}
