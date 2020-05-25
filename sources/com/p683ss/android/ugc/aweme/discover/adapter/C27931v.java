package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.HotVideoItem;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.v */
final /* synthetic */ class C27931v implements OnClickListener {

    /* renamed from: a */
    private final HotVideoItemViewHolder f73351a;

    /* renamed from: b */
    private final int f73352b;

    /* renamed from: c */
    private final HotVideoItem f73353c;

    C27931v(HotVideoItemViewHolder hotVideoItemViewHolder, int i, HotVideoItem hotVideoItem) {
        this.f73351a = hotVideoItemViewHolder;
        this.f73352b = i;
        this.f73353c = hotVideoItem;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        HotVideoItemViewHolder hotVideoItemViewHolder = this.f73351a;
        int i = this.f73352b;
        HotVideoItem hotVideoItem = this.f73353c;
        C26890h.m65011a("hot_search_video_keyword", new C23089d().mo47829a("group_id", hotVideoItemViewHolder.f72868b.getAid()).mo47829a("author_id", hotVideoItemViewHolder.f72868b.getAuthorUid()).mo47829a("action_type", "click").mo47829a("enter_from", "discovery").mo47826a("order", i + 1).f61491a);
        hotVideoItemViewHolder.f72867a.mo46755a(hotVideoItem.getAweme(), i);
    }
}
