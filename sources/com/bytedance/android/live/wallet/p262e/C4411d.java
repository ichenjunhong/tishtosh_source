package com.bytedance.android.live.wallet.p262e;

import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.wallet.C4383d;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C4466e;
import java.util.HashMap;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.wallet.e.d */
public final class C4411d implements C4383d {

    /* renamed from: a */
    long f12054a;

    /* renamed from: b */
    long f12055b;

    /* renamed from: b */
    public final int mo10211b() {
        return 10001;
    }

    /* renamed from: a */
    public final C2201v<C4177d<C4466e>> mo10210a() {
        HashMap hashMap = new HashMap();
        hashMap.put("campaign_id", String.valueOf(this.f12054a));
        hashMap.put("item_id", String.valueOf(this.f12055b));
        return ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).buyPackage(hashMap);
    }

    public C4411d(long j, long j2) {
        this.f12054a = j;
        this.f12055b = j2;
    }
}
