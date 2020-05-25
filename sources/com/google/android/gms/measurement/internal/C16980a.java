package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.common.util.C15514e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C16980a extends C17053cs {

    /* renamed from: a */
    final Map<String, Long> f47854a = new C0777a();

    /* renamed from: b */
    final Map<String, Integer> f47855b = new C0777a();

    /* renamed from: c */
    long f47856c;

    public C16980a(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32836a(long j, C17050cp cpVar) {
        if (cpVar == null) {
            mo32854q().f48453j.mo33376a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo32854q().f48453j.mo33377a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C17051cq.m41394a(cpVar, bundle, true);
            mo32842e().mo32991a("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32837a(String str, long j, C17050cp cpVar) {
        if (cpVar == null) {
            mo32854q().f48453j.mo33376a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo32854q().f48453j.mo33377a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C17051cq.m41394a(cpVar, bundle, true);
            mo32842e().mo32991a("am", "_xu", bundle);
        }
    }

    /* renamed from: a */
    public final void mo32835a(long j) {
        C17050cp v = mo32845h().mo33021v();
        for (String str : this.f47854a.keySet()) {
            mo32837a(str, j - ((Long) this.f47854a.get(str)).longValue(), v);
        }
        if (!this.f47854a.isEmpty()) {
            mo32836a(j - this.f47856c, v);
        }
        mo32839b(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo32839b(long j) {
        for (String put : this.f47854a.keySet()) {
            this.f47854a.put(put, Long.valueOf(j));
        }
        if (!this.f47854a.isEmpty()) {
            this.f47856c = j;
        }
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
}
