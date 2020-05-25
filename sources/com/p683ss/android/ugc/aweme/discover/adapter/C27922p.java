package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.p */
final /* synthetic */ class C27922p implements OnClickListener {

    /* renamed from: a */
    private final HotSearchImageViewHolder f73339a;

    C27922p(HotSearchImageViewHolder hotSearchImageViewHolder) {
        this.f73339a = hotSearchImageViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        HotSearchImageViewHolder hotSearchImageViewHolder = this.f73339a;
        C26890h.m65011a("hot_search_icon", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("enter_from", hotSearchImageViewHolder.mo56183a()).mo47829a("enter_method", "click_hot_search").f61491a);
        hotSearchImageViewHolder.mo56185b();
    }
}
