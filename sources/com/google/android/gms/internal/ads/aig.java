package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15464q;
import java.lang.ref.WeakReference;

@C16299uq
public final class aig {

    /* renamed from: a */
    static int f40587a;

    /* renamed from: e */
    private static int f40588e;

    /* renamed from: b */
    public bgz f40589b;

    /* renamed from: c */
    public bhy f40590c;

    /* renamed from: d */
    public bhh f40591d;

    /* renamed from: f */
    private ail f40592f;

    /* renamed from: g */
    private final aij f40593g = new aij(this);

    /* renamed from: h */
    private final aim f40594h = new aim(this);

    /* renamed from: i */
    private final aii f40595i = new aii(this);

    public aig() {
        C15464q.m32132b("ExoPlayer must be created on the main UI thread.");
        if (abv.m32495a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("AdExoPlayerHelper initialize ");
            sb.append(valueOf);
            abv.m32494a(sb.toString());
        }
        f40587a++;
        this.f40589b = new bhc(2, 2500, 5000);
        this.f40589b.mo30148a((bhb) this.f40593g);
    }

    /* renamed from: a */
    public static int m32996a() {
        return f40588e;
    }

    /* renamed from: a */
    public final boolean mo28966a(bii bii) {
        if (this.f40589b == null) {
            return false;
        }
        bhy bhy = new bhy(bii, 1, 0, acd.f40245a, this.f40594h, -1);
        this.f40590c = bhy;
        this.f40591d = new bhh(bii, acd.f40245a, this.f40595i);
        this.f40589b.mo30150a(this.f40590c, this.f40591d);
        f40588e++;
        return true;
    }

    /* renamed from: b */
    public final void mo28967b() {
        if (this.f40589b != null) {
            this.f40589b.mo30154d();
            this.f40589b = null;
            f40588e--;
        }
    }

    /* renamed from: a */
    public final synchronized void mo28964a(ail ail) {
        this.f40592f = ail;
    }

    /* renamed from: c */
    public final synchronized void mo28968c() {
        this.f40592f = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m32998a(String str, String str2) {
        if (this.f40592f != null) {
            this.f40592f.mo28978a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo28965a(bhb bhb, bic bic, bhk bhk) {
        this.f40593g.f40598a = new WeakReference<>(bhb);
        this.f40594h.f40601a = new WeakReference<>(bic);
        this.f40595i.f40596a = new WeakReference<>(bhk);
    }

    public final void finalize() throws Throwable {
        f40587a--;
        if (abv.m32495a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("AdExoPlayerHelper finalize ");
            sb.append(valueOf);
            abv.m32494a(sb.toString());
        }
    }
}
