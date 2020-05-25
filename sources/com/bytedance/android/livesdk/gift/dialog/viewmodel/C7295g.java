package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.GiftManager.C7190a;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.g */
final /* synthetic */ class C7295g implements C7190a {

    /* renamed from: a */
    private final GiftViewModel f19867a;

    C7295g(GiftViewModel giftViewModel) {
        this.f19867a = giftViewModel;
    }

    /* renamed from: a */
    public final void mo13389a(long j) {
        GiftViewModel giftViewModel = this.f19867a;
        giftViewModel.f19825b.f19859i = j;
        giftViewModel.f19824a.postValue(giftViewModel.f19825b);
    }
}
