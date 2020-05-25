package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageItemNewViewHolder_ViewBinding */
public class HotSearchImageItemNewViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotSearchImageItemNewViewHolder f72854a;

    public void unbind() {
        HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder = this.f72854a;
        if (hotSearchImageItemNewViewHolder != null) {
            this.f72854a = null;
            hotSearchImageItemNewViewHolder.mImageView = null;
            hotSearchImageItemNewViewHolder.mMaskView = null;
            hotSearchImageItemNewViewHolder.mTitleView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotSearchImageItemNewViewHolder_ViewBinding(HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder, View view) {
        this.f72854a = hotSearchImageItemNewViewHolder;
        hotSearchImageItemNewViewHolder.mImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.azj, "field 'mImageView'", RemoteImageView.class);
        hotSearchImageItemNewViewHolder.mMaskView = Utils.findRequiredView(view, R.id.drg, "field 'mMaskView'");
        hotSearchImageItemNewViewHolder.mTitleView = (HotSearchTitleTextView) Utils.findRequiredViewAsType(view, R.id.dhb, "field 'mTitleView'", HotSearchTitleTextView.class);
    }
}
