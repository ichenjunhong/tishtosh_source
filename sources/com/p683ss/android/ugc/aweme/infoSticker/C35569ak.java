package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import com.p683ss.android.ugc.tools.view.p2509b.C50211c.C50213a;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ak */
final /* synthetic */ class C35569ak implements C50213a {

    /* renamed from: a */
    private final SearchInfoStickerPresenter f91422a;

    C35569ak(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f91422a = searchInfoStickerPresenter;
    }

    /* renamed from: a */
    public final void mo73964a() {
        SearchInfoStickerPresenter searchInfoStickerPresenter = this.f91422a;
        C0198r<Boolean> rVar = ((SearchInfoStickerViewModel) C0214z.m440a(searchInfoStickerPresenter.f91360a).mo359a(SearchInfoStickerViewModel.class)).f91373a;
        if (rVar.getValue() == null || !((Boolean) rVar.getValue()).booleanValue()) {
            int i = searchInfoStickerPresenter.f91365f;
            if (!searchInfoStickerPresenter.f91367h) {
                searchInfoStickerPresenter.f91361b.mo73969b(1);
                return;
            }
            C35635v.m80462a(searchInfoStickerPresenter.f91360a).mo73933a("giphy", i, 30).observe(searchInfoStickerPresenter, new C35571am(searchInfoStickerPresenter));
        } else {
            String b = searchInfoStickerPresenter.f91361b.mo73968b();
            if (!searchInfoStickerPresenter.f91367h) {
                searchInfoStickerPresenter.f91361b.mo73969b(1);
            } else {
                C35635v.m80462a(searchInfoStickerPresenter.f91360a).mo73936b(b, "giphy", searchInfoStickerPresenter.f91366g, 30).observe(searchInfoStickerPresenter, new C35573ao(searchInfoStickerPresenter));
            }
        }
    }
}
