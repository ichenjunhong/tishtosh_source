package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.c */
public final class C24538c extends C26840g<Challenge> {
    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new ChallengeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rt, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        ChallengeViewHolder challengeViewHolder = (ChallengeViewHolder) vVar;
        Challenge challenge = (Challenge) this.f70670n.get(i);
        if (challenge != null) {
            challengeViewHolder.f64954a = challenge;
            challengeViewHolder.mTitleView.setText(challengeViewHolder.f64954a.getChallengeName());
            if (TextUtils.isEmpty(challengeViewHolder.f64954a.getDesc())) {
                challengeViewHolder.mTitleView.setPadding(0, 0, 0, challengeViewHolder.margin);
                challengeViewHolder.mDescView.setVisibility(8);
            } else {
                challengeViewHolder.mTitleView.setPadding(0, 0, 0, 0);
                challengeViewHolder.mDescView.setVisibility(0);
                challengeViewHolder.mDescView.setText(challengeViewHolder.f64954a.getDesc());
            }
            challengeViewHolder.mJoinCountView.setText(challengeViewHolder.itemView.getResources().getString(R.string.bu0, new Object[]{C33095b.m76068a((long) challengeViewHolder.f64954a.getUserCount())}));
        }
    }
}
