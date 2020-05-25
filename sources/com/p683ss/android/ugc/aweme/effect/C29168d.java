package com.p683ss.android.ugc.aweme.effect;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29198a;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29200c;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.effect.d */
public final class C29168d extends C12924i implements C29198a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f76436i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29168d.class), "effectHelper", "getEffectHelper()Lcom/ss/android/ugc/aweme/effect/VEEffectHelper;"))};

    /* renamed from: j */
    public static final C29169a f76437j = new C29169a(null);

    /* renamed from: k */
    private final C52668f f76438k = C52732g.m112285a(C29170b.f76439a);

    /* renamed from: com.ss.android.ugc.aweme.effect.d$a */
    public static final class C29169a {
        private C29169a() {
        }

        public /* synthetic */ C29169a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.d$b */
    static final class C29170b extends C52712l implements C52670a<C29094ad> {

        /* renamed from: a */
        public static final C29170b f76439a = new C29170b();

        C29170b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29094ad();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.d$c */
    static final class C29171c<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C29168d f76440a;

        C29171c(C29168d dVar) {
            this.f76440a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (((Integer) obj) != null) {
                this.f76440a.mo59046c().mo58967g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.d$d */
    static final class C29172d<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C29168d f76441a;

        C29172d(C29168d dVar) {
            this.f76441a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            this.f76441a.mo59046c().mo58979s();
        }
    }

    /* renamed from: c */
    public final C29094ad mo59046c() {
        return (C29094ad) this.f76438k.getValue();
    }

    /* renamed from: d */
    public final C12924i mo59047d() {
        return this;
    }

    /* renamed from: f */
    public final void mo59049f() {
        mo59046c().mo58976p();
    }

    /* renamed from: h */
    public final void mo59050h() {
        mo59046c().mo58977q();
    }

    /* renamed from: B */
    public final void mo24458B() {
        super.mo24458B();
        mo59046c().mo58963e();
    }

    /* renamed from: q */
    public final void mo24470q() {
        super.mo24470q();
        mo59046c().mo58965f();
    }

    /* renamed from: y */
    public final void mo24480y() {
        super.mo24480y();
        mo59046c().mo58961d();
    }

    /* renamed from: d */
    public final void mo59048d(int i) {
        mo59046c().mo58955b(i);
    }

    /* renamed from: a */
    public final void mo59045a(C29200c cVar) {
        C52711k.m112240b(cVar, "config");
        mo59046c().mo58945a(cVar);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        C29094ad c = mo59046c();
        Activity v = mo24477v();
        if (v != null) {
            C0184k kVar = this;
            c.mo58943a((FragmentActivity) v, kVar);
            mo59046c().mo58944a(mo24464b((int) R.id.chd));
            mo59046c().f76280P.mo58846d().observe(kVar, new C29171c(this));
            mo59046c().f76280P.mo58851i().observe(kVar, new C29172d(this));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ae0, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…effect, container, false)");
        return inflate;
    }
}
