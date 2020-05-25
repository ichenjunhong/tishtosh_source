package com.google.android.gms.internal.ads;

final class bmc {

    /* renamed from: a */
    public final bre f42936a;

    /* renamed from: b */
    public final Object f42937b;

    /* renamed from: c */
    public final int f42938c;

    /* renamed from: d */
    public final brr[] f42939d;

    /* renamed from: e */
    public final long f42940e;

    /* renamed from: f */
    public int f42941f;

    /* renamed from: g */
    public long f42942g;

    /* renamed from: h */
    public boolean f42943h;

    /* renamed from: i */
    public boolean f42944i;

    /* renamed from: j */
    public boolean f42945j;

    /* renamed from: k */
    public bmc f42946k;

    /* renamed from: l */
    public bsn f42947l;

    /* renamed from: m */
    private final boolean[] f42948m;

    /* renamed from: n */
    private final bmm[] f42949n;

    /* renamed from: o */
    private final bmn[] f42950o;

    /* renamed from: p */
    private final bsl f42951p;

    /* renamed from: q */
    private final bmj f42952q;

    /* renamed from: r */
    private final brg f42953r;

    /* renamed from: s */
    private bsn f42954s;

    public bmc(bmm[] bmmArr, bmn[] bmnArr, long j, bsl bsl, bmj bmj, brg brg, Object obj, int i, int i2, boolean z, long j2) {
        this.f42949n = bmmArr;
        this.f42950o = bmnArr;
        this.f42940e = j;
        this.f42951p = bsl;
        this.f42952q = bmj;
        this.f42953r = brg;
        this.f42937b = bti.m36697a(obj);
        this.f42938c = i;
        this.f42941f = i2;
        this.f42943h = z;
        this.f42942g = j2;
        this.f42939d = new brr[bmmArr.length];
        this.f42948m = new boolean[bmmArr.length];
        this.f42936a = brg.mo30598a(i2, bmj.mo29048d());
    }

    /* renamed from: a */
    public final long mo30390a() {
        return this.f42940e - this.f42942g;
    }

    /* renamed from: a */
    public final void mo30393a(int i, boolean z) {
        this.f42941f = i;
        this.f42943h = z;
    }

    /* renamed from: b */
    public final boolean mo30394b() {
        return this.f42944i && (!this.f42945j || this.f42936a.mo30584d() == Long.MIN_VALUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30395c() throws com.google.android.gms.internal.ads.blt {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.bsl r0 = r6.f42951p
            com.google.android.gms.internal.ads.bmn[] r1 = r6.f42950o
            com.google.android.gms.internal.ads.bre r2 = r6.f42936a
            com.google.android.gms.internal.ads.brx r2 = r2.mo30582b()
            com.google.android.gms.internal.ads.bsn r0 = r0.mo30656a(r1, r2)
            com.google.android.gms.internal.ads.bsn r1 = r6.f42954s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.bsk r5 = r0.f43780b
            int r5 = r5.f43775a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.mo30663a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.f42947l = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmc.mo30395c():boolean");
    }

    /* renamed from: a */
    public final long mo30391a(long j, boolean z) {
        return mo30392a(j, false, new boolean[this.f42949n.length]);
    }

    /* renamed from: a */
    public final long mo30392a(long j, boolean z, boolean[] zArr) {
        bsk bsk = this.f42947l.f43780b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= bsk.f43775a) {
                break;
            }
            boolean[] zArr2 = this.f42948m;
            if (z || !this.f42947l.mo30663a(this.f42954s, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long a = this.f42936a.mo30575a(bsk.mo30660a(), this.f42948m, this.f42939d, zArr, j);
        this.f42954s = this.f42947l;
        this.f42945j = false;
        for (int i2 = 0; i2 < this.f42939d.length; i2++) {
            if (this.f42939d[i2] != null) {
                bti.m36701b(bsk.mo30659a(i2) != null);
                this.f42945j = true;
            } else {
                bti.m36701b(bsk.mo30659a(i2) == null);
            }
        }
        this.f42952q.mo29041a(this.f42949n, this.f42947l.f43779a, bsk);
        return a;
    }

    /* renamed from: d */
    public final void mo30396d() {
        try {
            this.f42953r.mo30601a(this.f42936a);
        } catch (RuntimeException unused) {
        }
    }
}
