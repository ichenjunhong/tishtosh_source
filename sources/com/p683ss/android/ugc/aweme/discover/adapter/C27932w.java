package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.w */
final /* synthetic */ class C27932w implements OnClickListener {

    /* renamed from: a */
    private final HotVideoViewHolder f73354a;

    C27932w(HotVideoViewHolder hotVideoViewHolder) {
        this.f73354a = hotVideoViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        HotVideoViewHolder hotVideoViewHolder = this.f73354a;
        C26890h.m65011a("enter_hot_search_video_board", C23089d.m56640a().mo47829a("enter_from", "discovery").mo47829a("enter_method", "click_hot_search_video_today").f61491a);
        hotVideoViewHolder.mo56188a();
    }
}
