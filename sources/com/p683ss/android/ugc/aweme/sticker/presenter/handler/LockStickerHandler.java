package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39610bo;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p683ss.android.ugc.aweme.sticker.C46049k;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Collection;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.LockStickerHandler */
public final class LockStickerHandler implements C0183j, C46256q, C46340k {

    /* renamed from: a */
    public boolean f116818a;

    /* renamed from: b */
    public final AppCompatActivity f116819b;

    /* renamed from: c */
    private Effect f116820c;

    /* renamed from: d */
    private int f116821d = -1;

    /* renamed from: e */
    private boolean f116822e;

    /* renamed from: f */
    private C46049k f116823f;

    /* renamed from: g */
    private boolean f116824g;

    /* renamed from: h */
    private final OnUnlockShareFinishListener f116825h = new C46303a(this);

    /* renamed from: i */
    private final C46354l f116826i;

    /* renamed from: j */
    private final C52671b<C45816b<?>, C52860x> f116827j;

    /* renamed from: k */
    private final C52670a<C52860x> f116828k;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.LockStickerHandler$a */
    public static final class C46303a implements OnUnlockShareFinishListener {

        /* renamed from: a */
        final /* synthetic */ LockStickerHandler f116829a;

        public final void onShareAppFailed() {
            C39629l.m88232a().mo58565C().mo80684a(this.f116829a.f116819b);
        }

        C46303a(LockStickerHandler lockStickerHandler) {
            this.f116829a = lockStickerHandler;
        }

        public final void onShareAppSucceed(Effect effect) {
            C52711k.m112240b(effect, "effect");
            this.f116829a.f116818a = true;
        }

        public final void onVKShareSucceed(Effect effect) {
            C52711k.m112240b(effect, "effect");
            this.f116829a.mo93034b();
        }
    }

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
    }

    public final void cl_() {
        m100563d();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        if (this.f116818a) {
            mo93034b();
        }
    }

    /* renamed from: c */
    private final void m100562c() {
        String str;
        C39610bo C = C39629l.m88232a().mo58565C();
        if (this.f116822e) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        this.f116823f = C.mo80682a(str, this.f116819b, this.f116820c, this.f116825h, true, true);
    }

    /* renamed from: b */
    public final void mo93034b() {
        String str;
        C39610bo C = C39629l.m88232a().mo58565C();
        Context context = this.f116819b;
        if (this.f116822e) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        C.mo80685a(context, str, this.f116820c);
        this.f116828k.invoke();
        Effect effect = this.f116820c;
        if (effect != null) {
            this.f116827j.invoke(C45858a.m99692a(effect, this.f116821d, (C45815a) null, (StickerWrapper) null, (Bundle) null, (C45874b) null, (C45875c) null, 62, (Object) null));
        }
        this.f116818a = false;
        this.f116822e = false;
    }

    /* renamed from: d */
    private final void m100563d() {
        boolean z;
        if (this.f116824g) {
            C39527aa x = C39629l.m88232a().mo58593x();
            if (x.mo74282b() && !TextUtils.isEmpty(x.mo74283c())) {
                C0794k a = m100561a(this.f116826i);
                Effect effect = (Effect) a.f2711a;
                Integer num = (Integer) a.f2712b;
                if (effect != null) {
                    List a2 = C46059g.m100061a((Context) this.f116819b, x.mo74283c());
                    Collection collection = a2;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !a2.contains(effect.getEffectId()) && C46059g.m100087k(effect)) {
                        C46059g.m100064a((Context) this.f116819b, x.mo74283c(), effect.getEffectId());
                        this.f116820c = effect;
                        if (num == null) {
                            C52711k.m112234a();
                        }
                        this.f116821d = num.intValue();
                        m100562c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        this.f116824g = true;
        m100563d();
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        this.f116824g = false;
    }

    /* renamed from: a */
    private static C0794k<Effect, Integer> m100561a(C46354l lVar) {
        List a = C45924b.m99852a(lVar.mo92973a().mo92537i());
        C0794k<Effect, Integer> kVar = new C0794k<>(null, Integer.valueOf(-1));
        if (a.isEmpty()) {
            return kVar;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            CategoryEffectModel a2 = C45924b.m99850a(lVar.mo92973a().mo92537i(), ((EffectCategoryModel) a.get(i)).getKey(), false);
            if (a2 != null) {
                List effects = a2.getEffects();
                C52711k.m112236a((Object) effects, "effectModel.effects");
                int size2 = effects.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Effect effect = (Effect) a2.getEffects().get(i2);
                    if (C46059g.m100085i(effect)) {
                        return new C0794k<>(effect, Integer.valueOf(i2));
                    }
                }
                continue;
            }
        }
        return kVar;
    }

    /* renamed from: a */
    public final C46316b mo93033a(C46317c cVar, C46341a aVar) {
        C52711k.m112240b(cVar, "session");
        C52711k.m112240b(aVar, "chain");
        if (cVar instanceof C46315a) {
            C46315a aVar2 = (C46315a) cVar;
            if (C46059g.m100087k(aVar2.f116852a)) {
                C46316b a = aVar.mo93036a(C46315a.m100611a(aVar2.f116852a, aVar2.f116853b, aVar2.f116854c, true, aVar2.f116856e));
                this.f116820c = aVar2.f116852a;
                this.f116822e = true;
                m100562c();
                return a;
            }
        }
        return aVar.mo93036a(cVar);
    }

    public LockStickerHandler(AppCompatActivity appCompatActivity, C46354l lVar, C52671b<? super C45816b<?>, C52860x> bVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "onUseEffect");
        C52711k.m112240b(aVar, "onHideStickerView");
        this.f116819b = appCompatActivity;
        this.f116826i = lVar;
        this.f116827j = bVar;
        this.f116828k = aVar;
        this.f116819b.getLifecycle().mo324a(this);
    }
}
