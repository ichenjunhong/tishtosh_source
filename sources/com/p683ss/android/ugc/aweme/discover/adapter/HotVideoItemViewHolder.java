package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1323ae.p1324a.C22467b;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoItemViewHolder */
public class HotVideoItemViewHolder extends C1352v {

    /* renamed from: a */
    C22467b<Aweme> f72867a;

    /* renamed from: b */
    Aweme f72868b;

    /* renamed from: c */
    private String f72869c;
    AnimatedImageView mCover;
    TextView mRank;
    TextView mText;

    public HotVideoItemViewHolder(View view, String str, C22467b<Aweme> bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72869c = str;
        this.f72867a = bVar;
    }
}
