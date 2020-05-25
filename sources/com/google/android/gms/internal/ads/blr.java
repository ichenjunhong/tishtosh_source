package com.google.android.gms.internal.ads;

public abstract class blr implements bmm, bmn {

    /* renamed from: a */
    public bmo f42858a;

    /* renamed from: b */
    public int f42859b;

    /* renamed from: c */
    brr f42860c;

    /* renamed from: d */
    long f42861d;

    /* renamed from: e */
    boolean f42862e = true;

    /* renamed from: f */
    boolean f42863f;

    /* renamed from: g */
    private final int f42864g;

    /* renamed from: h */
    private int f42865h;

    public blr(int i) {
        this.f42864g = i;
    }

    /* renamed from: a */
    public void mo30342a(int i, Object obj) throws blt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30344a(long j, boolean z) throws blt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30346a(boolean z) throws blt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30347a(zzlg[] zzlgArr, long j) throws blt {
    }

    /* renamed from: b */
    public final bmn mo30349b() {
        return this;
    }

    /* renamed from: c */
    public btm mo30350c() {
        return null;
    }

    /* renamed from: l */
    public int mo30359l() throws blt {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo30360m() throws blt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo30361n() throws blt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo30362o() {
    }

    /* renamed from: a */
    public final int mo30339a() {
        return this.f42864g;
    }

    /* renamed from: a */
    public final void mo30341a(int i) {
        this.f42859b = i;
    }

    /* renamed from: d */
    public final int mo30351d() {
        return this.f42865h;
    }

    /* renamed from: a */
    public final void mo30345a(bmo bmo, zzlg[] zzlgArr, brr brr, long j, boolean z, long j2) throws blt {
        bti.m36701b(this.f42865h == 0);
        this.f42858a = bmo;
        this.f42865h = 1;
        mo30346a(z);
        mo30348a(zzlgArr, brr, j2);
        mo30344a(j, z);
    }

    /* renamed from: e */
    public final void mo30352e() throws blt {
        boolean z = true;
        if (this.f42865h != 1) {
            z = false;
        }
        bti.m36701b(z);
        this.f42865h = 2;
        mo30360m();
    }

    /* renamed from: a */
    public final void mo30348a(zzlg[] zzlgArr, brr brr, long j) throws blt {
        bti.m36701b(!this.f42863f);
        this.f42860c = brr;
        this.f42862e = false;
        this.f42861d = j;
        mo30347a(zzlgArr, j);
    }

    /* renamed from: f */
    public final brr mo30353f() {
        return this.f42860c;
    }

    /* renamed from: g */
    public final boolean mo30354g() {
        return this.f42862e;
    }

    /* renamed from: h */
    public final void mo30355h() {
        this.f42863f = true;
    }

    /* renamed from: i */
    public final boolean mo30356i() {
        return this.f42863f;
    }

    /* renamed from: a */
    public final void mo30343a(long j) throws blt {
        this.f42863f = false;
        this.f42862e = false;
        mo30344a(j, false);
    }

    /* renamed from: j */
    public final void mo30357j() throws blt {
        bti.m36701b(this.f42865h == 2);
        this.f42865h = 1;
        mo30361n();
    }

    /* renamed from: k */
    public final void mo30358k() {
        boolean z = true;
        if (this.f42865h != 1) {
            z = false;
        }
        bti.m36701b(z);
        this.f42865h = 0;
        this.f42860c = null;
        this.f42863f = false;
        mo30362o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30340a(bmh bmh, boc boc, boolean z) {
        int a = this.f42860c.mo30595a(bmh, boc, z);
        if (a == -4) {
            if (boc.mo30481c()) {
                this.f42862e = true;
                if (this.f42863f) {
                    return -4;
                }
                return -3;
            }
            boc.f43183d += this.f42861d;
        } else if (a == -5) {
            zzlg zzlg = bmh.f42966a;
            if (zzlg.f46265o != Long.MAX_VALUE) {
                bmh.f42966a = zzlg.mo31601a(zzlg.f46265o + this.f42861d);
            }
        }
        return a;
    }
}
