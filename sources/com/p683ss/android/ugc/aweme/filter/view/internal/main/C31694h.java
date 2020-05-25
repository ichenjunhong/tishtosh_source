package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31659g;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.h */
public final class C31694h implements C31659g {

    /* renamed from: a */
    public C31697b f82774a;

    /* renamed from: b */
    public final C2189f<Boolean> f82775b;

    /* renamed from: c */
    public final View f82776c;

    /* renamed from: d */
    private final C31723o f82777d;

    /* renamed from: e */
    private C31696a f82778e;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.h$a */
    enum C31696a {
        NONE,
        SHOW,
        HIDE
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.h$b */
    enum C31697b {
        UNKNOWN,
        SHOWING,
        SHOWN,
        HIDING,
        HIDE
    }

    /* renamed from: e */
    public final C2201v<Boolean> mo64569e() {
        C2201v<Boolean> e = this.f82775b.mo6542e();
        C52711k.m112236a((Object) e, "showHideSubject.hide()");
        return e;
    }

    /* renamed from: b */
    public final void mo64566b() {
        this.f82774a = C31697b.UNKNOWN;
        this.f82776c.setVisibility(0);
        this.f82775b.onNext(Boolean.valueOf(true));
    }

    /* renamed from: d */
    public final void mo64568d() {
        this.f82774a = C31697b.HIDE;
        this.f82776c.setVisibility(8);
        this.f82775b.onNext(Boolean.valueOf(false));
    }

    /* renamed from: f */
    public final void mo64589f() {
        if (this.f82778e == C31696a.SHOW) {
            mo64565a();
        } else if (this.f82778e == C31696a.HIDE) {
            mo64567c();
        }
        this.f82778e = C31696a.NONE;
    }

    /* renamed from: a */
    public final void mo64565a() {
        if (this.f82777d != null) {
            switch (C31698i.f82790a[this.f82774a.ordinal()]) {
                case 1:
                case 2:
                    this.f82778e = C31696a.NONE;
                    return;
                case 3:
                    this.f82778e = C31696a.SHOW;
                    return;
                default:
                    this.f82774a = C31697b.SHOWING;
                    this.f82777d.mo50219a((C24454d) new C24453c());
                    return;
            }
        } else {
            mo64566b();
        }
    }

    /* renamed from: c */
    public final void mo64567c() {
        if (this.f82777d != null) {
            switch (C31698i.f82791b[this.f82774a.ordinal()]) {
                case 1:
                case 2:
                    this.f82778e = C31696a.NONE;
                    return;
                case 3:
                    this.f82778e = C31696a.HIDE;
                    return;
                default:
                    this.f82774a = C31697b.HIDING;
                    this.f82777d.mo50223b(new C24453c());
                    return;
            }
        } else {
            mo64568d();
        }
    }

    public C31694h(View view, View view2) {
        C31723o oVar;
        C52711k.m112240b(view, "target");
        this.f82776c = view;
        if (view2 != null) {
            oVar = new C31723o(view2, 0, 2, null);
        } else {
            oVar = null;
        }
        this.f82777d = oVar;
        this.f82774a = C31697b.UNKNOWN;
        this.f82778e = C31696a.NONE;
        C2180b l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create()");
        this.f82775b = l;
        C31723o oVar2 = this.f82777d;
        if (oVar2 != null) {
            oVar2.mo50220a((C24458h) new C24459a(this) {

                /* renamed from: a */
                final /* synthetic */ C31694h f82779a;

                /* renamed from: b */
                public final void mo50221b() {
                    this.f82779a.f82774a = C31697b.SHOWN;
                    this.f82779a.mo64589f();
                }

                /* renamed from: a */
                public final void mo50217a() {
                    this.f82779a.f82776c.setVisibility(0);
                    this.f82779a.f82775b.onNext(Boolean.valueOf(true));
                }

                /* renamed from: d */
                public final void mo50225d() {
                    this.f82779a.f82774a = C31697b.HIDE;
                    this.f82779a.f82776c.setVisibility(8);
                    this.f82779a.f82775b.onNext(Boolean.valueOf(false));
                    this.f82779a.mo64589f();
                }

                {
                    this.f82779a = r1;
                }
            });
        }
    }
}
