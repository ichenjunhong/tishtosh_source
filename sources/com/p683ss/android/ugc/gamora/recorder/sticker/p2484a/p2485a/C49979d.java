package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import android.app.Activity;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46291c;
import com.p683ss.android.ugc.aweme.sticker.types.game.C46546a;
import com.p683ss.android.ugc.aweme.sticker.types.game.C46562k;
import com.p683ss.android.ugc.aweme.utils.C47675ap;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C49996b;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50002h;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import com.ss.android.ugc.trill.R;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.d */
public final class C49979d implements C12356a, C49996b {

    /* renamed from: a */
    public final AppCompatActivity f125217a = ((AppCompatActivity) mo23370j().mo23373a(AppCompatActivity.class, (String) null));

    /* renamed from: b */
    public final C45004a f125218b = ((C45004a) mo23370j().mo23373a(C45004a.class, (String) null));

    /* renamed from: c */
    public final C42451a f125219c = ((C42451a) mo23370j().mo23373a(C42451a.class, (String) null));

    /* renamed from: d */
    public final C49683a f125220d = ((C49683a) mo23370j().mo23373a(C49683a.class, (String) null));

    /* renamed from: e */
    public final ShortVideoContext f125221e = ((ShortVideoContext) mo23370j().mo23373a(ShortVideoContext.class, (String) null));

    /* renamed from: f */
    private final C12361b f125222f;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.d$a */
    static final class C49980a extends C52712l implements C52670a<C46562k> {

        /* renamed from: a */
        final /* synthetic */ C49979d f125223a;

        /* renamed from: b */
        final /* synthetic */ C50048n f125224b;

        /* renamed from: c */
        final /* synthetic */ C46291c f125225c;

        /* renamed from: d */
        final /* synthetic */ C50002h f125226d;

        C49980a(C49979d dVar, C50048n nVar, C46291c cVar, C50002h hVar) {
            this.f125223a = dVar;
            this.f125224b = nVar;
            this.f125225c = cVar;
            this.f125226d = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            AppCompatActivity appCompatActivity = this.f125223a.f125217a;
            C50207b a = C47675ap.m103187a((Activity) this.f125223a.f125217a);
            if (a != null) {
                ASCameraView M = this.f125223a.f125218b.mo91307M();
                FrameLayout frameLayout = (FrameLayout) this.f125223a.f125217a.findViewById(R.id.b7w);
                C49977c cVar = new C49977c(this.f125223a.f125217a, this.f125223a.f125218b, this.f125223a.f125219c, this.f125223a.f125220d, this.f125224b, this.f125223a.f125221e, this.f125225c, this.f125226d);
                return C46546a.m101022a(appCompatActivity, a, M, frameLayout, cVar);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.d$b */
    static final class C49981b extends C52712l implements C52670a<C46562k> {

        /* renamed from: a */
        final /* synthetic */ C49979d f125227a;

        /* renamed from: b */
        final /* synthetic */ C50048n f125228b;

        /* renamed from: c */
        final /* synthetic */ C46291c f125229c;

        /* renamed from: d */
        final /* synthetic */ C50002h f125230d;

        C49981b(C49979d dVar, C50048n nVar, C46291c cVar, C50002h hVar) {
            this.f125227a = dVar;
            this.f125228b = nVar;
            this.f125229c = cVar;
            this.f125230d = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            AppCompatActivity appCompatActivity = this.f125227a.f125217a;
            C50207b a = C47675ap.m103187a((Activity) this.f125227a.f125217a);
            if (a != null) {
                ASCameraView M = this.f125227a.f125218b.mo91307M();
                FrameLayout frameLayout = (FrameLayout) this.f125227a.f125217a.findViewById(R.id.b7w);
                C49977c cVar = new C49977c(this.f125227a.f125217a, this.f125227a.f125218b, this.f125227a.f125219c, this.f125227a.f125220d, this.f125228b, this.f125227a.f125221e, this.f125229c, this.f125230d);
                return C46546a.m101022a(appCompatActivity, a, M, frameLayout, cVar);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f125222f;
    }

    public C49979d(C12361b bVar) {
        C52711k.m112240b(bVar, "diContainer");
        this.f125222f = bVar;
    }

    /* renamed from: a */
    public final LegacyGameStickerHandler mo97779a(C50048n nVar, C50002h hVar, C46291c cVar) {
        C52711k.m112240b(nVar, "stickerApiComponent");
        C52711k.m112240b(hVar, "state");
        C52711k.m112240b(cVar, "stickerLoader");
        return new LegacyGameStickerHandler(this.f125217a, C52732g.m112285a(new C49981b(this, nVar, cVar, hVar)));
    }

    /* renamed from: b */
    public final GameStickerHandler mo97780b(C50048n nVar, C50002h hVar, C46291c cVar) {
        C52711k.m112240b(nVar, "stickerApiComponent");
        C52711k.m112240b(hVar, "state");
        C52711k.m112240b(cVar, "stickerLoader");
        return new GameStickerHandler(this.f125217a, C52732g.m112285a(new C49980a(this, nVar, cVar, hVar)));
    }
}
