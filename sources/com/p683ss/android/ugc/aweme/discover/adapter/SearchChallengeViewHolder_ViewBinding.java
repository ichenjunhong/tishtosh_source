package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder_ViewBinding */
public class SearchChallengeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchChallengeViewHolder f72959a;

    public void unbind() {
        SearchChallengeViewHolder searchChallengeViewHolder = this.f72959a;
        if (searchChallengeViewHolder != null) {
            this.f72959a = null;
            searchChallengeViewHolder.mTvChallengeName = null;
            searchChallengeViewHolder.mTvPartCnt = null;
            searchChallengeViewHolder.cardViewStub = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchChallengeViewHolder_ViewBinding(SearchChallengeViewHolder searchChallengeViewHolder, View view) {
        this.f72959a = searchChallengeViewHolder;
        searchChallengeViewHolder.mTvChallengeName = (TextView) Utils.findRequiredViewAsType(view, R.id.d7l, "field 'mTvChallengeName'", TextView.class);
        searchChallengeViewHolder.mTvPartCnt = (TextView) Utils.findRequiredViewAsType(view, R.id.dd8, "field 'mTvPartCnt'", TextView.class);
        searchChallengeViewHolder.cardViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.eu7, "field 'cardViewStub'", ViewStub.class);
    }
}
