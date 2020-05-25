package com.p683ss.android.ugc.aweme.livewallpaper.egl;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.e */
public class C36218e {

    /* renamed from: e */
    private static int f92705e = 12375;

    /* renamed from: f */
    private static int f92706f = 12374;

    /* renamed from: a */
    protected C36217d f92707a;

    /* renamed from: b */
    private Object f92708b;

    /* renamed from: c */
    private int f92709c = -1;

    /* renamed from: d */
    private int f92710d = -1;

    /* renamed from: d */
    public final void mo74985d() {
        C36217d dVar = this.f92707a;
        dVar.f92704a.mo74973c(this.f92708b);
    }

    /* renamed from: e */
    public final boolean mo74986e() {
        C36217d dVar = this.f92707a;
        return dVar.f92704a.mo74974d(this.f92708b);
    }

    /* renamed from: a */
    public final int mo74979a() {
        if (this.f92709c < 0) {
            return this.f92707a.mo74976a(this.f92708b, f92705e);
        }
        return this.f92709c;
    }

    /* renamed from: b */
    public final int mo74983b() {
        if (this.f92710d < 0) {
            return this.f92707a.mo74976a(this.f92708b, f92706f);
        }
        return this.f92710d;
    }

    /* renamed from: c */
    public final void mo74984c() {
        C36217d dVar = this.f92707a;
        dVar.f92704a.mo74970a(this.f92708b);
        this.f92708b = null;
        this.f92709c = -1;
        this.f92710d = -1;
    }

    protected C36218e(C36217d dVar) {
        this.f92707a = dVar;
    }

    /* renamed from: a */
    public final void mo74981a(long j) {
        C36217d dVar = this.f92707a;
        dVar.f92704a.mo74971a(this.f92708b, j);
    }

    /* renamed from: a */
    public final void mo74982a(Object obj) {
        if (this.f92708b == null) {
            this.f92708b = this.f92707a.f92704a.mo74972b(obj);
            return;
        }
        throw new IllegalStateException("surface already created");
    }

    /* renamed from: a */
    public final void mo74980a(int i, int i2) {
        if (this.f92708b == null) {
            this.f92708b = this.f92707a.f92704a.mo74968a(i, i2);
            this.f92709c = i;
            this.f92710d = i2;
            return;
        }
        throw new IllegalStateException("surface already created");
    }
}
