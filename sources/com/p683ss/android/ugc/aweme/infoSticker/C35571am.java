package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.am */
final /* synthetic */ class C35571am implements C0199s {

    /* renamed from: a */
    private final SearchInfoStickerPresenter f91424a;

    C35571am(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f91424a = searchInfoStickerPresenter;
    }

    public final void onChanged(Object obj) {
        C37721a aVar = (C37721a) obj;
        this.f91424a.mo73944b(aVar.f96126b, (ProviderEffectModel) aVar.f96125a, false);
    }
}
