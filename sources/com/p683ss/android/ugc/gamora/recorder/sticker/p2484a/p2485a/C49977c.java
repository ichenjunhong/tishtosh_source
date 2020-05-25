package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a.C43867a;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46291c;
import com.p683ss.android.ugc.aweme.sticker.types.game.p2329a.C46550a;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50002h;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.c */
final class C49977c implements C46550a {

    /* renamed from: a */
    public C31459g f125205a;

    /* renamed from: b */
    public final AppCompatActivity f125206b;

    /* renamed from: c */
    public final C42451a f125207c;

    /* renamed from: d */
    public final C49683a f125208d;

    /* renamed from: e */
    public final ShortVideoContext f125209e;

    /* renamed from: f */
    public final C50002h f125210f;

    /* renamed from: g */
    private final SafeHandler f125211g = new SafeHandler(this.f125206b);

    /* renamed from: h */
    private final C45004a f125212h;

    /* renamed from: i */
    private final C50048n f125213i;

    /* renamed from: j */
    private final C46291c f125214j;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.c$a */
    static final class C49978a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49977c f125215a;

        /* renamed from: b */
        final /* synthetic */ Effect f125216b;

        C49978a(C49977c cVar, Effect effect) {
            this.f125215a = cVar;
            this.f125216b = effect;
        }

        public final void run() {
            View findViewById = this.f125215a.f125206b.findViewById(R.id.c_v);
            C52711k.m112236a((Object) findViewById, "activity\n               …ord_root_scene_container)");
            findViewById.setVisibility(8);
            View findViewById2 = this.f125215a.f125206b.findViewById(R.id.b7w);
            C52711k.m112236a((Object) findViewById2, "activity\n               …>(R.id.layout_game_extra)");
            findViewById2.setVisibility(0);
            this.f125215a.mo97776a().mo90315e();
            this.f125215a.mo97777a(true);
            if (C23777a.m58348a()) {
                this.f125215a.f125207c.mo86558a(this.f125215a.f125209e.f107128u, true);
            }
            this.f125215a.mo97776a().mo90310a(false);
            if (!C23780d.m58365a()) {
                this.f125215a.f125207c.mo86579e(!this.f125216b.getTags().contains("disable_reshape"));
                this.f125215a.f125207c.mo86577d(!this.f125216b.getTags().contains("disable_smooth"));
            }
            C49977c cVar = this.f125215a;
            C43906h hVar = (C43906h) this.f125215a.f125208d.mo89445c();
            C52711k.m112236a((Object) hVar, "filterApiComponent.filterFunc");
            cVar.f125205a = hVar.mo89440e();
            this.f125216b.getTags().contains("disable_beautify_filter");
            this.f125215a.f125210f.mo97791a().mo7350a(new C43867a());
        }
    }

    /* renamed from: a */
    public final CameraModule mo97776a() {
        return this.f125212h.mo91303I();
    }

    /* renamed from: a */
    public final void mo97777a(boolean z) {
        if (!C23780d.m58365a()) {
            this.f125207c.mo86581g(z);
        }
    }

    /* renamed from: c */
    public final void mo93346c(Effect effect) {
        C52711k.m112240b(effect, "gameSticker");
        this.f125214j.mo93010a(effect, true);
    }

    /* renamed from: a */
    public final void mo93344a(Effect effect) {
        C52711k.m112240b(effect, "gameSticker");
        this.f125211g.post(new C49978a(this, effect));
    }

    /* renamed from: b */
    public final void mo93345b(Effect effect) {
        C52711k.m112240b(effect, "gameSticker");
        if (C45861d.m99711c(this.f125213i)) {
            this.f125210f.mo97792b().mo7350a(new C47336q(0));
        } else {
            this.f125210f.mo97792b().mo7350a(new C47336q(8));
        }
        View findViewById = this.f125206b.findViewById(R.id.c_v);
        C52711k.m112236a((Object) findViewById, "activity\n            .fi…ord_root_scene_container)");
        findViewById.setVisibility(0);
        View findViewById2 = this.f125206b.findViewById(R.id.b7w);
        C52711k.m112236a((Object) findViewById2, "activity\n               …>(R.id.layout_game_extra)");
        findViewById2.setVisibility(8);
        if (C44518a.m97421e(effect) && this.f125205a != null) {
            ((C43906h) this.f125208d.mo89445c()).mo89438a(this.f125205a);
        }
        mo97777a(false);
    }

    public C49977c(AppCompatActivity appCompatActivity, C45004a aVar, C42451a aVar2, C49683a aVar3, C50048n nVar, ShortVideoContext shortVideoContext, C46291c cVar, C50002h hVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(aVar, "cameraApi");
        C52711k.m112240b(aVar2, "beautyApi");
        C52711k.m112240b(aVar3, "filterApiComponent");
        C52711k.m112240b(nVar, "stickerApiComponent");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(cVar, "stickerLoader");
        C52711k.m112240b(hVar, "stickerHandledEventState");
        this.f125206b = appCompatActivity;
        this.f125212h = aVar;
        this.f125207c = aVar2;
        this.f125208d = aVar3;
        this.f125213i = nVar;
        this.f125209e = shortVideoContext;
        this.f125214j = cVar;
        this.f125210f = hVar;
    }
}
