package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.x */
final /* synthetic */ class C27933x implements OnClickListener {

    /* renamed from: a */
    private final HotVideoViewHolder f73355a;

    C27933x(HotVideoViewHolder hotVideoViewHolder) {
        this.f73355a = hotVideoViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        HotVideoViewHolder hotVideoViewHolder = this.f73355a;
        C26890h.m65011a("enter_hot_search_video_board", C23089d.m56640a().mo47829a("enter_from", "discovery").mo47829a("enter_method", "click_more").f61491a);
        hotVideoViewHolder.mo56188a();
    }
}
