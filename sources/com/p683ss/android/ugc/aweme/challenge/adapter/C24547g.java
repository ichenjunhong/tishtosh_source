package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.challenge.model.Segment;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.g */
public final class C24547g extends C26840g<SearchChallenge> {
    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new SearchAwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rt, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        SearchAwemeViewHolder searchAwemeViewHolder = (SearchAwemeViewHolder) vVar;
        SearchChallenge searchChallenge = (SearchChallenge) this.f70670n.get(i);
        if (searchChallenge != null) {
            searchAwemeViewHolder.f64957a = searchChallenge;
            Challenge challenge = searchAwemeViewHolder.f64957a.challenge;
            if (challenge != null) {
                if (!searchAwemeViewHolder.f64957a.isFake || TextUtils.isEmpty(challenge.getChallengeName())) {
                    if (challenge != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
                        SpannableString spannableString = new SpannableString(challenge.getChallengeName());
                        if (searchAwemeViewHolder.f64957a.segments != null) {
                            for (Segment segment : searchAwemeViewHolder.f64957a.segments) {
                                if (segment != null) {
                                    spannableString = searchAwemeViewHolder.mo50299a(spannableString, segment.begin, segment.end + 1);
                                }
                            }
                        }
                        searchAwemeViewHolder.mTitleView.setText(spannableString);
                    }
                    if (TextUtils.isEmpty(challenge.getDesc())) {
                        searchAwemeViewHolder.mTitleView.setPadding(0, 0, 0, searchAwemeViewHolder.margin);
                        searchAwemeViewHolder.mDescView.setVisibility(8);
                    } else {
                        searchAwemeViewHolder.mTitleView.setPadding(0, 0, 0, 0);
                        searchAwemeViewHolder.mDescView.setVisibility(0);
                        searchAwemeViewHolder.mDescView.setText(challenge.getDesc());
                    }
                    searchAwemeViewHolder.mJoinCountView.setText(searchAwemeViewHolder.itemView.getResources().getString(R.string.bu1, new Object[]{C33095b.m76068a((long) challenge.getUserCount())}));
                } else {
                    SpannableString spannableString2 = new SpannableString(challenge.getChallengeName());
                    searchAwemeViewHolder.mTitleView.setText(searchAwemeViewHolder.mo50299a(spannableString2, 0, spannableString2.length()));
                    searchAwemeViewHolder.mDescView.setText(R.string.b6b);
                    searchAwemeViewHolder.mJoinCountView.setText(R.string.b9c);
                }
            }
        }
    }
}
