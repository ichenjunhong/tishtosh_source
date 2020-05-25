package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.UpLoadItemViewHolder_ViewBinding */
public class UpLoadItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UpLoadItemViewHolder f96618a;

    public void unbind() {
        UpLoadItemViewHolder upLoadItemViewHolder = this.f96618a;
        if (upLoadItemViewHolder != null) {
            this.f96618a = null;
            upLoadItemViewHolder.mCoverImage = null;
            upLoadItemViewHolder.mTextView = null;
            upLoadItemViewHolder.mProgressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpLoadItemViewHolder_ViewBinding(UpLoadItemViewHolder upLoadItemViewHolder, View view) {
        this.f96618a = upLoadItemViewHolder;
        upLoadItemViewHolder.mCoverImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.a25, "field 'mCoverImage'", ImageView.class);
        upLoadItemViewHolder.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dlv, "field 'mTextView'", TextView.class);
        upLoadItemViewHolder.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.dlx, "field 'mProgressBar'", ProgressBar.class);
    }
}
