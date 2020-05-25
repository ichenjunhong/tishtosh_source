package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.an */
final /* synthetic */ class C35572an implements C0199s {

    /* renamed from: a */
    private final SearchInfoStickerPresenter f91425a;

    C35572an(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f91425a = searchInfoStickerPresenter;
    }

    public final void onChanged(Object obj) {
        C37721a aVar = (C37721a) obj;
        this.f91425a.mo73941a(aVar.f96126b, (ProviderEffectModel) aVar.f96125a, true);
    }
}
