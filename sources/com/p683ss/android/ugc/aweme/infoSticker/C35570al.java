package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.al */
final /* synthetic */ class C35570al implements C0199s {

    /* renamed from: a */
    private final SearchInfoStickerPresenter f91423a;

    C35570al(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f91423a = searchInfoStickerPresenter;
    }

    public final void onChanged(Object obj) {
        C37721a aVar = (C37721a) obj;
        this.f91423a.mo73941a(aVar.f96126b, (ProviderEffectModel) aVar.f96125a, false);
    }
}
