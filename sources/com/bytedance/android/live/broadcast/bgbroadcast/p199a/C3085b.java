package com.bytedance.android.live.broadcast.bgbroadcast.p199a;

import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.b */
final /* synthetic */ class C3085b implements Runnable {

    /* renamed from: a */
    private final C3084a f9029a;

    C3085b(C3084a aVar) {
        this.f9029a = aVar;
    }

    public final void run() {
        C4204a.m10421a(this.f9029a.f9024b, (int) R.string.epm);
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", "1");
        C8049c.m15979a().mo14202a("livesdk_anchor_network_error", hashMap, new Object[0]);
    }
}
