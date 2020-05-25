package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.internal.measurement.C16590cg;

/* renamed from: com.google.android.gms.measurement.internal.ds */
public final class C17080ds extends C17076do {

    /* renamed from: a */
    long f48210a = mo32849l().mo28524b();

    /* renamed from: b */
    long f48211b = this.f48210a;

    /* renamed from: c */
    final C17119fc f48212c = new C17081dt(this, this.f48052r);

    /* renamed from: d */
    final C17119fc f48213d = new C17082du(this, this.f48052r);

    /* renamed from: e */
    final C17119fc f48214e = new C17083dv(this, this.f48052r);

    /* renamed from: f */
    private Handler f48215f;

    C17080ds(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo32997t() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final void mo33078v() {
        synchronized (this) {
            if (this.f48215f == null) {
                this.f48215f = new C16590cg(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33074a(long j) {
        mo32840c();
        mo33078v();
        mo33075a(j, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33075a(long j, boolean z) {
        mo32840c();
        mo33078v();
        this.f48212c.mo33346c();
        this.f48213d.mo33346c();
        if (mo32856s().mo33287h(mo32843f().mo33353v()) || mo32856s().mo33288i(mo32843f().mo33353v())) {
            this.f48214e.mo33346c();
        }
        if (mo32855r().mo32865a(j)) {
            mo32855r().f47885n.mo32880a(true);
            mo32855r().f47887p.mo32883a(0);
        }
        if (mo32855r().f47885n.mo32881a()) {
            mo33077b(j);
            return;
        }
        this.f48213d.mo33344a(Math.max(0, 3600000 - mo32855r().f47887p.mo32882a()));
        if (z && mo32856s().mo33291k(mo32843f().mo33353v())) {
            mo32855r().f47886o.mo32883a(j);
            if (mo32856s().mo33287h(mo32843f().mo33353v()) || mo32856s().mo33288i(mo32843f().mo33353v())) {
                this.f48214e.mo33346c();
                this.f48214e.mo33344a(mo32855r().f47884m.mo32882a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33077b(long j) {
        mo32840c();
        mo32854q().f48453j.mo33377a("Session started, time", Long.valueOf(mo32849l().mo28524b()));
        Long l = null;
        Long valueOf = mo32856s().mo33287h(mo32843f().mo33353v()) ? Long.valueOf(j / 1000) : null;
        if (mo32856s().mo33288i(mo32843f().mo33353v())) {
            l = Long.valueOf(-1);
        }
        long j2 = j;
        mo32842e().mo32993a("auto", "_sid", (Object) valueOf, j2);
        mo32842e().mo32993a("auto", "_sno", (Object) l, j2);
        mo32855r().f47885n.mo32880a(false);
        Bundle bundle = new Bundle();
        if (mo32856s().mo33287h(mo32843f().mo33353v())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        mo32842e().mo32990a("auto", "_s", j, bundle);
        mo32855r().f47886o.mo32883a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final long mo33079w() {
        long b = mo32849l().mo28524b();
        long j = b - this.f48211b;
        this.f48211b = b;
        return j;
    }

    /* renamed from: a */
    public final boolean mo33076a(boolean z, boolean z2) {
        mo32840c();
        mo33068C();
        long b = mo32849l().mo28524b();
        mo32855r().f47886o.mo32883a(mo32849l().mo28523a());
        long j = b - this.f48210a;
        if (z || j >= 1000) {
            mo32855r().f47887p.mo32883a(j);
            mo32854q().f48453j.mo33377a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            C17051cq.m41394a(mo32845h().mo33021v(), bundle, true);
            if (mo32856s().mo33292l(mo32843f().mo33353v())) {
                if (mo32856s().mo33280d(mo32843f().mo33353v(), C17122h.f48380ap)) {
                    if (!z2) {
                        mo33079w();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    mo33079w();
                }
            }
            if (!mo32856s().mo33280d(mo32843f().mo33353v(), C17122h.f48380ap) || !z2) {
                mo32842e().mo32991a("auto", "_e", bundle);
            }
            this.f48210a = b;
            this.f48213d.mo33346c();
            this.f48213d.mo33344a(Math.max(0, 3600000 - mo32855r().f47887p.mo32882a()));
            return true;
        }
        mo32854q().f48453j.mo33377a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C16980a mo32841d() {
        return super.mo32841d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C17038cd mo32842e() {
        return super.mo32842e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C17127l mo32843f() {
        return super.mo32843f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C17055cu mo32844g() {
        return super.mo32844g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C17051cq mo32845h() {
        return super.mo32845h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C17129n mo32846i() {
        return super.mo32846i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C17080ds mo32847j() {
        return super.mo32847j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }

    /* renamed from: a */
    static /* synthetic */ void m41498a(C17080ds dsVar) {
        dsVar.mo32840c();
        dsVar.mo33076a(false, false);
        dsVar.mo32841d().mo32835a(dsVar.mo32849l().mo28524b());
    }
}
