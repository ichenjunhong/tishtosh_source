package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout.C30722a;
import com.p683ss.android.ugc.aweme.feed.utils.C31212u;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bc */
final /* synthetic */ class C30064bc implements C30722a {

    /* renamed from: a */
    private final BaseFeedPageParams f78479a;

    /* renamed from: b */
    private final Context f78480b;

    C30064bc(BaseFeedPageParams baseFeedPageParams, Context context) {
        this.f78479a = baseFeedPageParams;
        this.f78480b = context;
    }

    /* renamed from: a */
    public final void mo60340a(float f, float f2) {
        BaseFeedPageParams baseFeedPageParams = this.f78479a;
        Context context = this.f78480b;
        if (!C47915gg.m103651b() && !C23794bh.m58390d().mo47103a()) {
            if (C31212u.m72893a(baseFeedPageParams.eventType == null ? "" : baseFeedPageParams.eventType)) {
                C30340i iVar = new C30340i(true, baseFeedPageParams.awemeFromPage, f, f2, context.hashCode());
                C47718bf.m103288a(iVar);
            }
        }
    }
}
