package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ao */
final /* synthetic */ class C35573ao implements C0199s {

    /* renamed from: a */
    private final SearchInfoStickerPresenter f91426a;

    C35573ao(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f91426a = searchInfoStickerPresenter;
    }

    public final void onChanged(Object obj) {
        C37721a aVar = (C37721a) obj;
        this.f91426a.mo73944b(aVar.f96126b, (ProviderEffectModel) aVar.f96125a, true);
    }
}
