package com.p683ss.android.ugc.aweme.profile.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.ProfileCoverViewHolder_ViewBinding */
public class ProfileCoverViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverViewHolder f101421a;

    public void unbind() {
        ProfileCoverViewHolder profileCoverViewHolder = this.f101421a;
        if (profileCoverViewHolder != null) {
            this.f101421a = null;
            profileCoverViewHolder.mCoverImage = null;
            profileCoverViewHolder.mSelectBtn = null;
            profileCoverViewHolder.mUnselectedText = null;
            profileCoverViewHolder.mSelectedImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverViewHolder_ViewBinding(ProfileCoverViewHolder profileCoverViewHolder, View view) {
        this.f101421a = profileCoverViewHolder;
        profileCoverViewHolder.mCoverImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.azj, "field 'mCoverImage'", RemoteImageView.class);
        profileCoverViewHolder.mSelectBtn = Utils.findRequiredView(view, R.id.ahj, "field 'mSelectBtn'");
        profileCoverViewHolder.mUnselectedText = (TextView) Utils.findRequiredViewAsType(view, R.id.di3, "field 'mUnselectedText'", TextView.class);
        profileCoverViewHolder.mSelectedImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.b44, "field 'mSelectedImage'", ImageView.class);
    }
}
