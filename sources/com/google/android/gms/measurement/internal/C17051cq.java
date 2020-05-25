package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.cq */
public final class C17051cq extends C17076do {

    /* renamed from: a */
    protected C17050cp f48119a;

    /* renamed from: b */
    public volatile C17050cp f48120b;

    /* renamed from: c */
    C17050cp f48121c;

    /* renamed from: d */
    public final Map<Activity, C17050cp> f48122d = new C0777a();

    /* renamed from: e */
    private C17050cp f48123e;

    /* renamed from: f */
    private String f48124f;

    public C17051cq(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo32997t() {
        return false;
    }

    /* renamed from: v */
    public final C17050cp mo33021v() {
        mo33068C();
        mo32840c();
        return this.f48119a;
    }

    /* renamed from: w */
    public final C17050cp mo33022w() {
        return this.f48120b;
    }

    /* renamed from: a */
    public final void mo33019a(Activity activity, C17050cp cpVar, boolean z) {
        C17050cp cpVar2 = this.f48120b == null ? this.f48121c : this.f48120b;
        if (cpVar.f48116b == null) {
            cpVar = new C17050cp(cpVar.f48115a, m41393a(activity.getClass().getCanonicalName()), cpVar.f48117c);
        }
        this.f48121c = this.f48120b;
        this.f48120b = cpVar;
        mo32853p().mo32912a((Runnable) new C17052cr(this, z, cpVar2, cpVar));
    }

    /* renamed from: a */
    public static void m41394a(C17050cp cpVar, Bundle bundle, boolean z) {
        if (bundle == null || cpVar == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && cpVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
            return;
        }
        if (cpVar.f48115a != null) {
            bundle.putString("_sn", cpVar.f48115a);
        } else {
            bundle.remove("_sn");
        }
        bundle.putString("_sc", cpVar.f48116b);
        bundle.putLong("_si", cpVar.f48117c);
    }

    /* renamed from: a */
    public final void mo33020a(String str, C17050cp cpVar) {
        mo32840c();
        synchronized (this) {
            if (this.f48124f == null || this.f48124f.equals(str) || cpVar != null) {
                this.f48124f = str;
                this.f48123e = cpVar;
            }
        }
    }

    /* renamed from: a */
    public static String m41393a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17050cp mo33018a(Activity activity) {
        C15464q.m32123a(activity);
        C17050cp cpVar = (C17050cp) this.f48122d.get(activity);
        if (cpVar != null) {
            return cpVar;
        }
        C17050cp cpVar2 = new C17050cp(null, m41393a(activity.getClass().getCanonicalName()), mo32852o().mo33153f());
        this.f48122d.put(activity, cpVar2);
        return cpVar2;
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
    static /* synthetic */ void m41395a(C17051cq cqVar, C17050cp cpVar, boolean z) {
        cqVar.mo32841d().mo32835a(cqVar.mo32849l().mo28524b());
        if (cqVar.mo32847j().mo33076a(cpVar.f48118d, z)) {
            cpVar.f48118d = false;
        }
    }
}
