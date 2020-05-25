package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BasePanel */
public abstract class BasePanel implements C0183j, C0184k {

    /* renamed from: r */
    static final /* synthetic */ C52767h[] f86424r = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BasePanel.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: a */
    private boolean f86425a;

    /* renamed from: b */
    private final C52668f f86426b = C52732g.m112285a(new C33324a(this));

    /* renamed from: s */
    public boolean f86427s;

    /* renamed from: t */
    public final C0184k f86428t;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BasePanel$a */
    static final class C33324a extends C52712l implements C52670a<C0185l> {

        /* renamed from: a */
        final /* synthetic */ BasePanel f86429a;

        C33324a(BasePanel basePanel) {
            this.f86429a = basePanel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0185l(this.f86429a);
        }
    }

    /* renamed from: a */
    private final C0185l mo70646a() {
        return (C0185l) this.f86426b.getValue();
    }

    public C0176h getLifecycle() {
        return mo70646a();
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.f86425a = false;
        mo70646a().mo332a(C0177a.ON_CREATE);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        mo70646a().mo332a(C0177a.ON_DESTROY);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        this.f86427s = false;
        mo70646a().mo332a(C0177a.ON_PAUSE);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.f86427s = true;
        mo70646a().mo332a(C0177a.ON_RESUME);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public void onStart() {
        mo70646a().mo332a(C0177a.ON_START);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        this.f86425a = true;
        mo70646a().mo332a(C0177a.ON_STOP);
    }

    public BasePanel(C0184k kVar) {
        C52711k.m112240b(kVar, "parent");
        this.f86428t = kVar;
    }
}
