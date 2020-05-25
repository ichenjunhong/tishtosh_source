package com.p683ss.android.ugc.aweme.policy;

import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.policy.d */
final /* synthetic */ class C39501d implements Callable {

    /* renamed from: a */
    private final int f101050a;

    C39501d(int i) {
        this.f101050a = i;
    }

    public final Object call() {
        String valueOf = String.valueOf(this.f101050a);
        HashMap hashMap = new HashMap();
        hashMap.put(C42311c.f106863g, valueOf);
        NetUtil.putCommonParams(hashMap, true);
        PolicyApi.f101040a.checkPolicyVersion(hashMap).get();
        return null;
    }
}
