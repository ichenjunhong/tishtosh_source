package com.p683ss.android.ugc.aweme.p1807im.sdk.arch;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.Widget */
public class Widget implements C0183j, C0184k {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f86256a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: b */
    private boolean f86257b;

    /* renamed from: c */
    private final C52668f f86258c = C52732g.m112285a(new C33248a(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.Widget$a */
    static final class C33248a extends C52712l implements C52670a<C0185l> {

        /* renamed from: a */
        final /* synthetic */ Widget f86259a;

        C33248a(Widget widget) {
            this.f86259a = widget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0185l(this.f86259a);
        }
    }

    /* renamed from: c */
    private final C0185l mo73253c() {
        return (C0185l) this.f86258c.getValue();
    }

    /* renamed from: a */
    public void mo70590a() {
    }

    /* renamed from: b */
    public void mo70591b() {
    }

    public C0176h getLifecycle() {
        return mo73253c();
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void create() {
        this.f86257b = false;
        mo73253c().mo332a(C0177a.ON_CREATE);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void destroy() {
        this.f86257b = true;
        mo73253c().mo332a(C0177a.ON_DESTROY);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void pause() {
        mo70591b();
        mo73253c().mo332a(C0177a.ON_PAUSE);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void resume() {
        mo70590a();
        mo73253c().mo332a(C0177a.ON_RESUME);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void start() {
        mo73253c().mo332a(C0177a.ON_START);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void stop() {
        mo73253c().mo332a(C0177a.ON_STOP);
    }
}
