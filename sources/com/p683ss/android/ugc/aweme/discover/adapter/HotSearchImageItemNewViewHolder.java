package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import com.p683ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageItemNewViewHolder */
public class HotSearchImageItemNewViewHolder extends C1352v {

    /* renamed from: a */
    LogPbBean f72848a;

    /* renamed from: b */
    public String f72849b;

    /* renamed from: c */
    public C28482ak f72850c;
    RemoteImageView mImageView;
    View mMaskView;
    HotSearchTitleTextView mTitleView;

    public HotSearchImageItemNewViewHolder(View view, String str, C28482ak akVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72849b = str;
        this.f72850c = akVar;
    }
}
