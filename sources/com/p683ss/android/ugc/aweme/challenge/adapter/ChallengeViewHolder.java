package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24528b;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.ChallengeViewHolder */
public class ChallengeViewHolder extends C1352v {

    /* renamed from: a */
    public Challenge f64954a;
    TextView mDescView;
    TextView mJoinCountView;
    TextView mTitleView;
    int margin;

    public ChallengeViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ChallengeViewHolder.this.f64954a != null) {
                    C47718bf.m103288a(new C24528b(ChallengeViewHolder.this.f64954a));
                }
            }
        });
    }
}
