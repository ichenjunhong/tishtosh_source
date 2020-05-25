package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.p2189a;

import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.C46185e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a */
public final class C43348a implements C43352d {

    /* renamed from: a */
    private C46185e f109607a;

    /* renamed from: b */
    private Effect f109608b;

    /* renamed from: c */
    private final FrameLayout f109609c;

    /* renamed from: d */
    private final C43351c f109610d;

    /* renamed from: a */
    public final void mo88283a() {
        C46185e eVar = this.f109607a;
        if (eVar != null) {
            eVar.mo88287a(true);
        }
    }

    public C43348a(FrameLayout frameLayout) {
        this(frameLayout, new C43349b(null));
    }

    /* renamed from: a */
    public final void mo88284a(Effect effect) {
        C46185e eVar = this.f109607a;
        if (eVar != null) {
            eVar.mo88287a(false);
        }
        if (effect != null && !C52711k.m112239a((Object) effect, (Object) this.f109608b)) {
            this.f109608b = effect;
            this.f109607a = this.f109610d.mo88285a(effect);
            C46185e eVar2 = this.f109607a;
            if (eVar2 != null) {
                eVar2.mo88286a(this.f109609c);
            }
        }
    }

    private C43348a(FrameLayout frameLayout, C43351c cVar) {
        C52711k.m112240b(cVar, "mFactory");
        this.f109609c = frameLayout;
        this.f109610d = cVar;
    }
}
