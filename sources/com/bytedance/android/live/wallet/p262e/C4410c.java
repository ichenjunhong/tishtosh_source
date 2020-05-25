package com.bytedance.android.live.wallet.p262e;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.wallet.api.C4298d;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.livesdkapi.p455i.C8814d;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.wallet.e.c */
public final class C4410c implements C4298d {
    /* renamed from: a */
    public final C2201v<C4177d<C8814d>> mo10071a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("data", str);
        hashMap.put("signature", str2);
        String str4 = "order_id";
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(str4, str3);
        return ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).googlePayVerify(hashMap).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
    }
}
