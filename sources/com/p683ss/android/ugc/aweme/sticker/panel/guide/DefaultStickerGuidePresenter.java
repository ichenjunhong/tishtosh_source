package com.p683ss.android.ugc.aweme.sticker.panel.guide;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter */
public class DefaultStickerGuidePresenter implements IStickerGuidePresenter {

    /* renamed from: a */
    private FrameLayout f116507a;

    /* renamed from: b */
    private C46185e f116508b;

    /* renamed from: c */
    private C46187f f116509c;

    /* renamed from: d */
    private Effect f116510d;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void hide() {
        if (this.f116508b != null) {
            this.f116508b.mo88287a(true);
        }
    }

    /* renamed from: a */
    public final void mo92859a(C0184k kVar) {
        kVar.getLifecycle().mo324a(this);
    }

    public DefaultStickerGuidePresenter(FrameLayout frameLayout) {
        this(new C46176b(), frameLayout);
    }

    /* renamed from: a */
    public final void mo92860a(Effect effect) {
        if (this.f116508b != null) {
            this.f116508b.mo88287a(false);
        }
        if (effect == null || (effect.equals(this.f116510d) && !effect.getTypes().contains("Game2DV2"))) {
            this.f116510d = effect;
            return;
        }
        this.f116510d = effect;
        this.f116508b = this.f116509c.mo92888a(effect);
        this.f116508b.mo88286a(this.f116507a);
    }

    private DefaultStickerGuidePresenter(C46187f fVar, FrameLayout frameLayout) {
        this.f116507a = frameLayout;
        this.f116509c = fVar;
    }
}
