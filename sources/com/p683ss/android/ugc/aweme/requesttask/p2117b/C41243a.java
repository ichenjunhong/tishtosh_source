package com.p683ss.android.ugc.aweme.requesttask.p2117b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.preload.C30679e;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.b.a */
public final class C41243a implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.P0;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        C22574a.m55738f().mo46921b("feed_boot_to_feed_request", true);
        C22574a.m55738f().mo46917a("feed_request_to_network", true);
        if (C22574a.m55738f().f60703d) {
            C22574a.m55738f().mo46921b("feed_lego_add_to_request", false);
            C22574a.m55738f().mo46917a("feed_request_to_feed_api", false);
        }
        C30679e.m71957a().mo63255a(4).mo63253a();
    }
}
