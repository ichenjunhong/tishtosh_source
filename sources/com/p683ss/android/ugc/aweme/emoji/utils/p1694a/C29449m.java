package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.m */
public final class C29449m implements C29437c {

    /* renamed from: a */
    public C29471z f77103a;

    /* renamed from: b */
    private byte[] f77104b;

    /* renamed from: c */
    private byte[] f77105c;

    /* renamed from: e */
    public final C29471z mo59512e() {
        return this.f77103a;
    }

    /* renamed from: c */
    public final byte[] mo59509c() {
        return C29435aa.m69418a(this.f77104b);
    }

    /* renamed from: d */
    public final C29471z mo59510d() {
        return new C29471z(this.f77104b.length);
    }

    /* renamed from: a */
    public final byte[] mo59507a() {
        if (this.f77105c != null) {
            return C29435aa.m69418a(this.f77105c);
        }
        return mo59509c();
    }

    /* renamed from: b */
    public final C29471z mo59508b() {
        if (this.f77105c != null) {
            return new C29471z(this.f77105c.length);
        }
        return mo59510d();
    }

    /* renamed from: a */
    private void m69459a(byte[] bArr) {
        this.f77104b = C29435aa.m69418a(bArr);
    }

    /* renamed from: a */
    public final void mo59506a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        m69459a(bArr2);
    }

    /* renamed from: b */
    public final void mo59513b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f77105c = C29435aa.m69418a(bArr2);
        if (this.f77104b == null) {
            m69459a(bArr2);
        }
    }
}
