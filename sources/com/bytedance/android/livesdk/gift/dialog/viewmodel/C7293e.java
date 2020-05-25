package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.e */
final /* synthetic */ class C7293e implements C1710e {

    /* renamed from: a */
    private final GiftViewModel f19865a;

    C7293e(GiftViewModel giftViewModel) {
        this.f19865a = giftViewModel;
    }

    public final void accept(Object obj) {
        GiftViewModel giftViewModel = this.f19865a;
        Long l = (Long) obj;
        giftViewModel.f19825b.f19860j = l.longValue();
        giftViewModel.f19824a.postValue(giftViewModel.f19825b);
    }
}
