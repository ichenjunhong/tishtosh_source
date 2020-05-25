package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.ChallengeViewHolder_ViewBinding */
public class ChallengeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChallengeViewHolder f64956a;

    public void unbind() {
        ChallengeViewHolder challengeViewHolder = this.f64956a;
        if (challengeViewHolder != null) {
            this.f64956a = null;
            challengeViewHolder.mTitleView = null;
            challengeViewHolder.mDescView = null;
            challengeViewHolder.mJoinCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChallengeViewHolder_ViewBinding(ChallengeViewHolder challengeViewHolder, View view) {
        this.f64956a = challengeViewHolder;
        challengeViewHolder.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        challengeViewHolder.mDescView = (TextView) Utils.findRequiredViewAsType(view, R.id.a4e, "field 'mDescView'", TextView.class);
        challengeViewHolder.mJoinCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.b5q, "field 'mJoinCountView'", TextView.class);
        challengeViewHolder.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
