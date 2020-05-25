package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.b */
public class C29436b implements C29460v, Cloneable {

    /* renamed from: e */
    private static final C29471z f77072e = new C29471z(30062);

    /* renamed from: a */
    public int f77073a;

    /* renamed from: b */
    public int f77074b;

    /* renamed from: c */
    public int f77075c;

    /* renamed from: d */
    public String f77076d = "";

    /* renamed from: f */
    private boolean f77077f;

    /* renamed from: g */
    private CRC32 f77078g = new CRC32();

    /* renamed from: e */
    public final C29471z mo59512e() {
        return f77072e;
    }

    /* renamed from: a */
    public final byte[] mo59507a() {
        return mo59509c();
    }

    /* renamed from: b */
    public final C29471z mo59508b() {
        return mo59510d();
    }

    /* renamed from: f */
    private boolean m69422f() {
        if (this.f77076d.length() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m69423g() {
        if (!this.f77077f || m69422f()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final C29471z mo59510d() {
        return new C29471z(this.f77076d.getBytes().length + 14);
    }

    public Object clone() {
        try {
            C29436b bVar = (C29436b) super.clone();
            bVar.f77078g = new CRC32();
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final byte[] mo59509c() {
        byte[] bArr = new byte[(mo59510d().f77201a - 4)];
        System.arraycopy(C29471z.m69538a(this.f77073a), 0, bArr, 0, 2);
        byte[] bytes = this.f77076d.getBytes();
        System.arraycopy(C29468x.m69518a((long) bytes.length), 0, bArr, 2, 4);
        System.arraycopy(C29471z.m69538a(this.f77074b), 0, bArr, 6, 2);
        System.arraycopy(C29471z.m69538a(this.f77075c), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f77078g.reset();
        this.f77078g.update(bArr);
        byte[] bArr2 = new byte[(bArr.length + 4)];
        System.arraycopy(C29468x.m69518a(this.f77078g.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    private int m69421a(int i) {
        int i2;
        if (m69422f()) {
            i2 = 40960;
        } else if (m69423g()) {
            i2 = 16384;
        } else {
            i2 = 32768;
        }
        return (i & 4095) | i2;
    }

    /* renamed from: a */
    public final void mo59506a(byte[] bArr, int i, int i2) throws ZipException {
        long b = C29468x.m69519b(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        boolean z = false;
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.f77078g.reset();
        this.f77078g.update(bArr2);
        long value = this.f77078g.getValue();
        if (b == value) {
            int a = C29471z.m69536a(bArr2, 0);
            byte[] bArr3 = new byte[((int) C29468x.m69519b(bArr2, 2))];
            this.f77074b = C29471z.m69536a(bArr2, 6);
            this.f77075c = C29471z.m69536a(bArr2, 8);
            if (bArr3.length == 0) {
                this.f77076d = "";
            } else {
                System.arraycopy(bArr2, 10, bArr3, 0, bArr3.length);
                this.f77076d = new String(bArr3);
            }
            if ((a & 16384) != 0) {
                z = true;
            }
            this.f77077f = z;
            this.f77073a = m69421a(this.f77073a);
            this.f77073a = m69421a(a);
            return;
        }
        StringBuilder sb = new StringBuilder("bad CRC checksum ");
        sb.append(Long.toHexString(b));
        sb.append(" instead of ");
        sb.append(Long.toHexString(value));
        throw new ZipException(sb.toString());
    }
}
