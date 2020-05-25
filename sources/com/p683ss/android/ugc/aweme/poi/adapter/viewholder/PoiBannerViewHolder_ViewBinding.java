package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder_ViewBinding */
public class PoiBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiBannerViewHolder f99332a;

    public void unbind() {
        PoiBannerViewHolder poiBannerViewHolder = this.f99332a;
        if (poiBannerViewHolder != null) {
            this.f99332a = null;
            poiBannerViewHolder.mSdCover = null;
            poiBannerViewHolder.mWaterMark = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiBannerViewHolder_ViewBinding(PoiBannerViewHolder poiBannerViewHolder, View view) {
        this.f99332a = poiBannerViewHolder;
        poiBannerViewHolder.mSdCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ci1, "field 'mSdCover'", RemoteImageView.class);
        poiBannerViewHolder.mWaterMark = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.du0, "field 'mWaterMark'", DmtTextView.class);
    }
}
