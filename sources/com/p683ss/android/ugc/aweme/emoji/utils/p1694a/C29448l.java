package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.l */
public final class C29448l implements C29437c {

    /* renamed from: a */
    private static final C29471z f77100a = new C29471z(44225);

    /* renamed from: b */
    private byte[] f77101b;

    /* renamed from: c */
    private byte[] f77102c;

    /* renamed from: e */
    public final C29471z mo59512e() {
        return f77100a;
    }

    /* renamed from: c */
    public final byte[] mo59509c() {
        return C29435aa.m69418a(this.f77101b);
    }

    /* renamed from: d */
    public final C29471z mo59510d() {
        int i;
        if (this.f77101b == null) {
            i = 0;
        } else {
            i = this.f77101b.length;
        }
        return new C29471z(i);
    }

    /* renamed from: a */
    public final byte[] mo59507a() {
        if (this.f77102c == null) {
            return mo59509c();
        }
        return C29435aa.m69418a(this.f77102c);
    }

    /* renamed from: b */
    public final C29471z mo59508b() {
        if (this.f77102c == null) {
            return mo59510d();
        }
        return new C29471z(this.f77102c.length);
    }

    /* renamed from: a */
    public final void mo59506a(byte[] bArr, int i, int i2) {
        this.f77101b = new byte[i2];
        System.arraycopy(bArr, i, this.f77101b, 0, i2);
    }

    /* renamed from: b */
    public final void mo59513b(byte[] bArr, int i, int i2) {
        this.f77102c = new byte[i2];
        System.arraycopy(bArr, i, this.f77102c, 0, i2);
        if (this.f77101b == null) {
            mo59506a(bArr, i, i2);
        }
    }
}
