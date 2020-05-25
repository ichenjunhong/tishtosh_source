package com.p683ss.android.ugc.aweme.requesttask.p2116a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.a.a */
public final class C41237a implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        if (C33194e.m76279d().canFetchFollowListIdle()) {
            return C35897g.IDLE;
        }
        return C35897g.NORMAL;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        C33194e.m76279d().fetchFollowList();
    }
}
