package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.UpLoadRecoverItemViewHolder */
public class UpLoadRecoverItemViewHolder extends C1352v {

    /* renamed from: a */
    public FragmentActivity f96619a;
    RemoteImageView mCoverImage;
    public ImageView mIvClose;
    public ImageView mIvRefresh;
    public ProgressBar mProgressBar;
    public TextView mTextView;

    public UpLoadRecoverItemViewHolder(View view, FragmentActivity fragmentActivity) {
        super(view);
        this.f96619a = fragmentActivity;
        ButterKnife.bind((Object) this, view);
    }
}
