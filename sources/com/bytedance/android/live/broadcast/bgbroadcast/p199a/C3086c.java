package com.bytedance.android.live.broadcast.bgbroadcast.p199a;

import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.c */
final /* synthetic */ class C3086c implements Runnable {

    /* renamed from: a */
    private final C3084a f9030a;

    C3086c(C3084a aVar) {
        this.f9030a = aVar;
    }

    public final void run() {
        C4204a.m10421a(this.f9030a.f9024b, (int) R.string.es2);
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", "2");
        C8049c.m15979a().mo14202a("livesdk_anchor_network_error", hashMap, new Object[0]);
    }
}
