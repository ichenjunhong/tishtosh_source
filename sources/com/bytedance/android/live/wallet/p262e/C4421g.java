package com.bytedance.android.live.wallet.p262e;

import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.wallet.C4383d;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C4466e;
import java.util.HashMap;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.wallet.e.g */
public final class C4421g implements C4383d {

    /* renamed from: a */
    private long f12067a;

    /* renamed from: b */
    private long f12068b;

    /* renamed from: b */
    public final int mo10211b() {
        return 10002;
    }

    /* renamed from: a */
    public final C2201v<C4177d<C4466e>> mo10210a() {
        HashMap hashMap = new HashMap();
        hashMap.put("package_id", String.valueOf(this.f12067a));
        hashMap.put("anchor_id", String.valueOf(this.f12068b));
        return ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).buyWard(hashMap);
    }

    public C4421g(long j, long j2) {
        this.f12067a = j;
        this.f12068b = j2;
    }
}
