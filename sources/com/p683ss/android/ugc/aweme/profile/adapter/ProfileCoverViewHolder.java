package com.p683ss.android.ugc.aweme.profile.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.ProfileCoverViewHolder */
public class ProfileCoverViewHolder extends C1352v {
    RemoteImageView mCoverImage;
    View mSelectBtn;
    ImageView mSelectedImage;
    TextView mUnselectedText;

    public ProfileCoverViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }
}
