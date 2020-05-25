package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39405q;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.j */
final /* synthetic */ class C39022j implements OnClickListener {

    /* renamed from: a */
    private final PoiOptimizedDetailViewHolder f99453a;

    C39022j(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f99453a = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f99453a;
        C39443d.m87702a(poiOptimizedDetailViewHolder.f99368a, C23324d.m57378a().getRawAdAwemeById(poiOptimizedDetailViewHolder.f99371d.getAwemeId()), "reserve", poiOptimizedDetailViewHolder.f99371d.getPoiId());
        C39405q.f100788a = "poi_page";
        if (!C20854a.m53167g().isLogin()) {
            C27965f.m66722a((Activity) poiOptimizedDetailViewHolder.f99368a, "poi_page", "click_poi_puscene_reserve", (C23505g) new C39021i(poiOptimizedDetailViewHolder));
        } else {
            C39019h.m86857a(poiOptimizedDetailViewHolder.f99368a, poiOptimizedDetailViewHolder.f99369b.getBookUrl(), poiOptimizedDetailViewHolder.f99368a.getResources().getString(R.string.csp));
        }
    }
}
