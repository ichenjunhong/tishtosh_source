package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.UpLoadRecoverItemViewHolder_ViewBinding */
public class UpLoadRecoverItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UpLoadRecoverItemViewHolder f96621a;

    public void unbind() {
        UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = this.f96621a;
        if (upLoadRecoverItemViewHolder != null) {
            this.f96621a = null;
            upLoadRecoverItemViewHolder.mCoverImage = null;
            upLoadRecoverItemViewHolder.mTextView = null;
            upLoadRecoverItemViewHolder.mProgressBar = null;
            upLoadRecoverItemViewHolder.mIvClose = null;
            upLoadRecoverItemViewHolder.mIvRefresh = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpLoadRecoverItemViewHolder_ViewBinding(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder, View view) {
        this.f96621a = upLoadRecoverItemViewHolder;
        upLoadRecoverItemViewHolder.mCoverImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.a25, "field 'mCoverImage'", RemoteImageView.class);
        upLoadRecoverItemViewHolder.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dlv, "field 'mTextView'", TextView.class);
        upLoadRecoverItemViewHolder.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.dlx, "field 'mProgressBar'", ProgressBar.class);
        upLoadRecoverItemViewHolder.mIvClose = (ImageView) Utils.findRequiredViewAsType(view, R.id.az9, "field 'mIvClose'", ImageView.class);
        upLoadRecoverItemViewHolder.mIvRefresh = (ImageView) Utils.findRequiredViewAsType(view, R.id.b3i, "field 'mIvRefresh'", ImageView.class);
    }
}
