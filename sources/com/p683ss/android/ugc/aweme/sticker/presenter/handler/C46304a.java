package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46294c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.ARTextResultModule;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.C46530d;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.C46540m;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.C46541n.C46543b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.C46544o;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a */
public final class C46304a extends C46306b implements C46256q, C46294c {

    /* renamed from: a */
    private boolean f116830a;

    /* renamed from: b */
    private Effect f116831b;

    /* renamed from: c */
    private final C46544o f116832c = new C46544o(this.f116833d, this.f116834e, this.f116836g);

    /* renamed from: d */
    private final AppCompatActivity f116833d;

    /* renamed from: e */
    private final C46354l f116834e;

    /* renamed from: f */
    private final String f116835f;

    /* renamed from: g */
    private final C20489b f116836g;

    /* renamed from: h */
    private final C52670a<ViewGroup> f116837h;

    /* renamed from: i */
    private final C46543b f116838i;

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
    }

    public final void cl_() {
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f116831b = null;
        this.f116832c.mo93328a();
    }

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        this.f116830a = true;
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        this.f116830a = false;
        if (aVar == C46257a.AFTER_ANIMATE) {
            Effect effect = this.f116831b;
            if (effect != null) {
                this.f116832c.mo93330a(effect);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        Effect effect = aVar.f116852a;
        if (C46059g.m100082f(effect) || C46059g.m100084h(effect) || C46059g.m100083g(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        int i;
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        Effect effect = aVar.f116852a;
        this.f116831b = effect;
        C20489b bVar2 = this.f116836g;
        String a = C46530d.m100988a(this.f116833d);
        C52711k.m112236a((Object) a, "ARUtils.getLanguage(activity)");
        bVar2.mo43495b(a);
        if (C46059g.m100082f(effect) || C46059g.m100084h(effect)) {
            i = 0;
        } else {
            i = 1;
        }
        ViewGroup viewGroup = (ViewGroup) this.f116837h.invoke();
        if (viewGroup != null) {
            this.f116832c.mo93329a(i, this.f116838i, this.f116833d, viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo93021a(int i, int i2, int i3, String str) {
        if (i == 32 || i == 33) {
            if (!this.f116830a) {
                C0209x a = C0214z.m440a((FragmentActivity) this.f116833d).mo359a(ARTextResultModule.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ResultModule::class.java)");
                ((ARTextResultModule) a).mo93285a().postValue(new C46540m(i, i2, i3, str));
            } else {
                ((ARTextResultModule) C0214z.m440a((FragmentActivity) this.f116833d).mo359a(ARTextResultModule.class)).mo93286b().postValue(new C46540m(i, i2, i3, str));
            }
        }
        if (i == 17) {
            this.f116832c.mo93331b();
        }
    }

    public C46304a(AppCompatActivity appCompatActivity, C46354l lVar, String str, C20489b bVar, C52670a<? extends ViewGroup> aVar, C46543b bVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(bVar, "effectController");
        C52711k.m112240b(aVar, "textRootView");
        C52711k.m112240b(bVar2, "onEffectShow");
        this.f116833d = appCompatActivity;
        this.f116834e = lVar;
        this.f116835f = str;
        this.f116836g = bVar;
        this.f116837h = aVar;
        this.f116838i = bVar2;
    }
}
