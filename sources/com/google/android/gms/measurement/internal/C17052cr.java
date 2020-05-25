package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cr */
final class C17052cr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f48125a;

    /* renamed from: b */
    private final /* synthetic */ C17050cp f48126b;

    /* renamed from: c */
    private final /* synthetic */ C17050cp f48127c;

    /* renamed from: d */
    private final /* synthetic */ C17051cq f48128d;

    C17052cr(C17051cq cqVar, boolean z, C17050cp cpVar, C17050cp cpVar2) {
        this.f48128d = cqVar;
        this.f48125a = z;
        this.f48126b = cpVar;
        this.f48127c = cpVar2;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.f48128d.mo32856s().mo33292l(this.f48128d.mo32843f().mo33353v())) {
            z = this.f48125a && this.f48128d.f48119a != null;
            if (z) {
                C17051cq.m41395a(this.f48128d, this.f48128d.f48119a, true);
            }
        } else {
            if (this.f48125a && this.f48128d.f48119a != null) {
                C17051cq.m41395a(this.f48128d, this.f48128d.f48119a, true);
            }
            z = false;
        }
        if (this.f48126b == null || this.f48126b.f48117c != this.f48127c.f48117c || !C17102em.m41671c(this.f48126b.f48116b, this.f48127c.f48116b) || !C17102em.m41671c(this.f48126b.f48115a, this.f48127c.f48115a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            C17051cq.m41394a(this.f48127c, bundle, true);
            if (this.f48126b != null) {
                if (this.f48126b.f48115a != null) {
                    bundle.putString("_pn", this.f48126b.f48115a);
                }
                bundle.putString("_pc", this.f48126b.f48116b);
                bundle.putLong("_pi", this.f48126b.f48117c);
            }
            if (this.f48128d.mo32856s().mo33292l(this.f48128d.mo32843f().mo33353v()) && z) {
                long w = this.f48128d.mo32847j().mo33079w();
                if (w > 0) {
                    this.f48128d.mo32852o().mo33142a(bundle, w);
                }
            }
            C17038cd e = this.f48128d.mo32842e();
            e.mo32840c();
            e.mo32990a("auto", "_vs", e.mo32849l().mo28523a(), bundle);
        }
        this.f48128d.f48119a = this.f48127c;
        this.f48128d.mo32844g().mo33026a(this.f48127c);
    }
}
