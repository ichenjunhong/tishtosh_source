package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.HashTagSearchMultiInfoStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27822ar;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28587bo.C28588a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28598bu.C28600a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bs */
public final class C28595bs extends C28598bu<SearchChallenge> implements C28588a<SearchChallenge> {

    /* renamed from: a */
    public int f75112a;

    /* renamed from: i */
    private final boolean f75113i;

    /* renamed from: a */
    public final void mo58279a(C1352v vVar, C28540ba<SearchChallenge> baVar) {
        SearchChallengeViewHolder searchChallengeViewHolder = (SearchChallengeViewHolder) vVar;
        searchChallengeViewHolder.f72946g = "general_search";
        searchChallengeViewHolder.mo56207a((SearchChallenge) baVar.f74998a, baVar.f74999b.getKeyword());
        searchChallengeViewHolder.mo56270a(new C27797ad(true));
        searchChallengeViewHolder.f72948i = this.f75112a;
    }

    /* renamed from: a */
    public final void mo58287a(List<SearchChallenge> list, C41440e eVar, boolean z) {
        super.mo58287a(list, eVar, z);
        mo58293b(list, eVar, z);
    }

    /* renamed from: a */
    public final C1352v mo58278a(ViewGroup viewGroup, int i, C28540ba<SearchChallenge> baVar) {
        if (C10181b.m20511a().mo18168a(HashTagSearchMultiInfoStyleExperiment.class, true, "hashtag_search_multi_info_style", 31744, 0) != 0 || this.f75113i) {
            return C27822ar.m66563b(viewGroup, null, "challenge");
        }
        return SearchChallengeViewHolder.m66464a(viewGroup, null, "challenge");
    }

    public C28595bs(View view, Context context, boolean z, C28600a aVar) {
        super(view, context, aVar);
        this.f75113i = z;
        this.f75119d.setText(R.string.yw);
        mo58290a((C1322a) new C28587bo(this));
    }
}
