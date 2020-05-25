package com.p683ss.android.ugc.aweme.discover.adapter;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.widget.RankScrollView.C28973a;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ag */
public final /* synthetic */ class C27800ag implements C28973a {

    /* renamed from: a */
    private final RankingListCoverViewHolder f73047a;

    public C27800ag(RankingListCoverViewHolder rankingListCoverViewHolder) {
        this.f73047a = rankingListCoverViewHolder;
    }

    /* renamed from: a */
    public final void mo56240a(int i) {
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f73047a;
        if (!rankingListCoverViewHolder.f72897i && rankingListCoverViewHolder.f72896h && rankingListCoverViewHolder.f72890b != null && rankingListCoverViewHolder.f72890b.getVisibility() == 0 && rankingListCoverViewHolder.f72895g != null) {
            rankingListCoverViewHolder.f72890b.getGlobalVisibleRect(rankingListCoverViewHolder.f72895g);
            if (rankingListCoverViewHolder.f72895g.right < C23724k.m58224b(rankingListCoverViewHolder.itemView.getContext())) {
                rankingListCoverViewHolder.f72896h = false;
                C25560e eVar = new C25560e();
                eVar.f67569b = "discovery";
                C25539a.m62079a().logCommerceEvents("show_hot_list_entrance", eVar);
            }
        }
        if (!rankingListCoverViewHolder.f72897i && rankingListCoverViewHolder.f72909u && rankingListCoverViewHolder.f72899k != null && rankingListCoverViewHolder.f72899k.getVisibility() == 0 && rankingListCoverViewHolder.f72908t != null) {
            rankingListCoverViewHolder.f72899k.getGlobalVisibleRect(rankingListCoverViewHolder.f72908t);
            if (rankingListCoverViewHolder.f72908t.right < C23724k.m58224b(rankingListCoverViewHolder.itemView.getContext())) {
                rankingListCoverViewHolder.f72909u = false;
                C26890h.m65011a("show_brand_list_entrance", C23089d.m56640a().mo47829a("enter_from", "discovery").f61491a);
            }
        }
    }
}
