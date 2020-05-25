package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder.C27772a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28082h.C28083a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.c */
public final class C28074c extends C28083a implements C27772a {
    public C28074c(C27859bf<?> bfVar) {
        C52711k.m112240b(bfVar, "adapter");
        super(bfVar);
    }

    /* renamed from: a */
    public final C1352v mo56493a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        SearchChallengeViewHolder a = SearchChallengeViewHolder.m66464a(viewGroup, this, null);
        C52711k.m112236a((Object) a, "SearchChallengeViewHolde…reate(parent, this, null)");
        a.f72946g = "search_for_you_list";
        return a;
    }

    /* renamed from: a */
    public final void mo56213a(Challenge challenge, int i) {
        C52711k.m112240b(challenge, "challenge");
        C26890h.m65011a("enter_tag_detail", C23089d.m56640a().mo47829a("enter_from", "search_for_you_list").mo47829a("tag_id", challenge.getCid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(challenge.getRequestId())).mo47826a("order", mo56496a((Object) challenge)).f61491a);
    }

    /* renamed from: a */
    public final void mo56494a(List<? extends Object> list, int i, C1352v vVar, List<Object> list2) {
        C52711k.m112240b(list, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list2, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            SuggestChallenge suggestChallenge = (SuggestChallenge) obj;
            SearchChallengeViewHolder searchChallengeViewHolder = (SearchChallengeViewHolder) vVar;
            String str = "";
            if (suggestChallenge != null && suggestChallenge.challenge != null) {
                searchChallengeViewHolder.f72945f = str;
                searchChallengeViewHolder.f72943d = suggestChallenge.challenge;
                searchChallengeViewHolder.mTvPartCnt.setText(searchChallengeViewHolder.itemView.getContext().getString(R.string.zk, new Object[]{C33095b.m76068a(searchChallengeViewHolder.f72943d.getDisplayCount())}));
                searchChallengeViewHolder.mTvChallengeName.setText(searchChallengeViewHolder.f72943d.getChallengeName());
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge");
    }
}
