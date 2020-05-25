package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.types.game.C46562k;
import p2628d.C52668f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler */
public final class LegacyGameStickerHandler extends C46306b implements C0183j {

    /* renamed from: a */
    public final C52668f<C46562k> f116816a;

    /* renamed from: b */
    private final C0184k f116817b;

    /* renamed from: a */
    public final void mo93028a() {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    private final void onDestroy() {
        if (this.f116816a.isInitialized()) {
            ((C46562k) this.f116816a.getValue()).mo93354e();
        }
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C44518a.m97420d(aVar.f116852a);
    }

    public LegacyGameStickerHandler(C0184k kVar, C52668f<? extends C46562k> fVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(fVar, "gameModule");
        this.f116817b = kVar;
        this.f116816a = fVar;
        this.f116817b.getLifecycle().mo324a(this);
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        ((C46562k) this.f116816a.getValue()).mo93350a(aVar.f116852a, null);
    }
}
