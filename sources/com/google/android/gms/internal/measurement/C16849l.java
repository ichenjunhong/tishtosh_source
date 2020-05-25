package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C15098l;
import com.google.android.gms.common.internal.C15464q;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.google.android.gms.internal.measurement.l */
public final class C16849l extends C16860r {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final C16536ag f47303a;

    public C16849l(C16862t tVar, C16864v vVar) {
        super(tVar);
        C15464q.m32123a(vVar);
        this.f47303a = new C16536ag(tVar, vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
        this.f47303a.mo32517s();
    }

    /* renamed from: a */
    public final long mo32470a(C16865w wVar) {
        mo32516r();
        C15464q.m32123a(wVar);
        C15098l.m31266b();
        long a = this.f47303a.mo31783a(wVar, true);
        if (a == 0) {
            this.f47303a.mo31786a(wVar);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo32472a(C16564bh bhVar) {
        C15464q.m32123a(bhVar);
        mo32516r();
        mo32494b("Hit delivery requested", bhVar);
        mo32509j().mo27845a((Runnable) new C16857o(this, bhVar));
    }

    /* renamed from: a */
    public final void mo32471a(C16557ba baVar) {
        mo32516r();
        mo32509j().mo27845a((Runnable) new C16858p(this, baVar));
    }

    /* renamed from: b */
    public final void mo32474b() {
        mo32516r();
        Context g = mo32506g();
        if (!C16577bu.m39573a(g) || !C16578bv.m39574a(g)) {
            mo32471a((C16557ba) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(g, "com.google.android.gms.analytics.AnalyticsService"));
        if (g == null || !(g instanceof Context) || !C40895d.m90464a(g, intent)) {
            g.startService(intent);
        }
    }

    /* renamed from: c */
    public final void mo32475c() {
        mo32516r();
        C15098l.m31266b();
        C16536ag agVar = this.f47303a;
        C15098l.m31266b();
        agVar.mo32516r();
        agVar.mo32493b("Service disconnected");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo32476d() {
        C15098l.m31266b();
        this.f47303a.mo31791e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo32477e() {
        C15098l.m31266b();
        this.f47303a.mo31790d();
    }

    /* renamed from: a */
    public final void mo32473a(String str, Runnable runnable) {
        C15464q.m32126a(str, (Object) "campaign param can't be empty");
        mo32509j().mo27845a((Runnable) new C16856n(this, str, runnable));
    }
}
