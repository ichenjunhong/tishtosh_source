package com.bytedance.android.live.wallet.p262e;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.wallet.api.C4295a;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.wallet.e.a */
public final class C4406a implements C4295a {
    /* renamed from: a */
    public final C2201v<CheckOrderOriginalResult> mo10069a(String str) {
        return ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).queryOrder(str).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
    }
}
