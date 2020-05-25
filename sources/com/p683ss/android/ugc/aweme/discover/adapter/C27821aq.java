package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.HashTagSearchMultiInfoStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.aq */
public final class C27821aq extends C27818an<SearchChallenge> {
    /* renamed from: a */
    public final void mo50303a(List<SearchChallenge> list) {
        this.f73084g.mo84080a();
        super.mo50303a(list);
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        ((SearchChallengeViewHolder) vVar).mo56207a((SearchChallenge) this.f70670n.get(i), this.f73083f);
        this.f73084g.mo84081a(i, mo48636c());
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        SearchChallengeViewHolder searchChallengeViewHolder;
        if (C10181b.m20511a().mo18168a(HashTagSearchMultiInfoStyleExperiment.class, true, "hashtag_search_multi_info_style", 31744, 0) == 0) {
            searchChallengeViewHolder = SearchChallengeViewHolder.m66464a(viewGroup, null, "chanllenge_tab");
        } else {
            searchChallengeViewHolder = C27822ar.m66563b(viewGroup, null, "chanllenge_tab");
        }
        searchChallengeViewHolder.f72946g = "search_result";
        return searchChallengeViewHolder;
    }

    public C27821aq(C27797ad adVar, String str, C41406a aVar) {
        super(adVar, str, aVar);
    }
}
