package com.bytedance.widget;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.widget.C13376b.C13378a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public class Widget implements C0183j, C0184k {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f34858a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Widget.class), "childWidgetManager", "getChildWidgetManager$widget_release()Lcom/bytedance/widget/WidgetManager;"))};

    /* renamed from: b */
    public C13373a f34859b;

    /* renamed from: c */
    public boolean f34860c;

    /* renamed from: d */
    protected ViewGroup f34861d;

    /* renamed from: e */
    public View f34862e;

    /* renamed from: f */
    public boolean f34863f = true;

    /* renamed from: g */
    private final C52668f f34864g = C52732g.m112285a(new C13372b(this));

    /* renamed from: h */
    private final C52668f f34865h = C52732g.m112285a(new C13371a(this));

    /* renamed from: com.bytedance.widget.Widget$a */
    static final class C13371a extends C52712l implements C52670a<C13376b> {

        /* renamed from: a */
        final /* synthetic */ Widget f34866a;

        C13371a(Widget widget) {
            this.f34866a = widget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C13378a.m26978a(this.f34866a.getLifecycle(), this.f34866a.mo25063o(), this.f34866a.f34862e);
        }
    }

    /* renamed from: com.bytedance.widget.Widget$b */
    static final class C13372b extends C52712l implements C52670a<C0185l> {

        /* renamed from: a */
        final /* synthetic */ Widget f34867a;

        C13372b(Widget widget) {
            this.f34867a = widget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0185l(this.f34867a);
        }
    }

    /* renamed from: p */
    private final C0185l mo52026p() {
        return (C0185l) this.f34864g.getValue();
    }

    /* renamed from: e */
    public int mo25056e() {
        return 0;
    }

    /* renamed from: g */
    public void mo25057g() {
        this.f34860c = false;
    }

    /* renamed from: j */
    public void mo25058j() {
    }

    /* renamed from: k */
    public void mo25059k() {
    }

    /* renamed from: l */
    public void mo25060l() {
    }

    /* renamed from: m */
    public void mo25061m() {
        this.f34860c = true;
    }

    public C0176h getLifecycle() {
        return mo52026p();
    }

    /* renamed from: b */
    public final ViewGroup mo25053b() {
        ViewGroup viewGroup = this.f34861d;
        if (viewGroup == null) {
            C52711k.m112237a("container");
        }
        return viewGroup;
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void create$widget_release() {
        mo25057g();
        mo52026p().mo332a(C0177a.ON_CREATE);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void destroy$widget_release() {
        mo25061m();
        mo52026p().mo332a(C0177a.ON_DESTROY);
    }

    /* renamed from: n */
    public final Object mo25062n() {
        return mo25063o().mo25072b();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void pause$widget_release() {
        mo25059k();
        mo52026p().mo332a(C0177a.ON_PAUSE);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void resume$widget_release() {
        mo25058j();
        mo52026p().mo332a(C0177a.ON_RESUME);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void start$widget_release() {
        mo52026p().mo332a(C0177a.ON_START);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void stop$widget_release() {
        mo25060l();
        mo52026p().mo332a(C0177a.ON_STOP);
    }

    /* renamed from: o */
    public final C13373a mo25063o() {
        C13373a aVar = this.f34859b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void mo25051a(View view) {
        C52711k.m112240b(view, "contentView");
        this.f34862e = view;
    }

    /* renamed from: a */
    public final void mo25052a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "containerView");
        this.f34861d = viewGroup;
    }
}
