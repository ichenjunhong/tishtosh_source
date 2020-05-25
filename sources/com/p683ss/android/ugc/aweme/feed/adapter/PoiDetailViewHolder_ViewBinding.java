package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.PoiDetailViewHolder_ViewBinding */
public class PoiDetailViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDetailViewHolder f78258a;

    public void unbind() {
        PoiDetailViewHolder poiDetailViewHolder = this.f78258a;
        if (poiDetailViewHolder != null) {
            this.f78258a = null;
            poiDetailViewHolder.txtDesc = null;
            poiDetailViewHolder.txtLikeCount = null;
            poiDetailViewHolder.authorAvatar = null;
            poiDetailViewHolder.txtAuthorName = null;
            poiDetailViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDetailViewHolder_ViewBinding(PoiDetailViewHolder poiDetailViewHolder, View view) {
        this.f78258a = poiDetailViewHolder;
        poiDetailViewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.a4e, "field 'txtDesc'", TextView.class);
        poiDetailViewHolder.txtLikeCount = (TextView) Utils.findRequiredViewAsType(view, R.id.baj, "field 'txtLikeCount'", TextView.class);
        poiDetailViewHolder.authorAvatar = (SmartCircleImageView) Utils.findRequiredViewAsType(view, R.id.h1, "field 'authorAvatar'", SmartCircleImageView.class);
        poiDetailViewHolder.txtAuthorName = (TextView) Utils.findRequiredViewAsType(view, R.id.h3, "field 'txtAuthorName'", TextView.class);
        poiDetailViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.cxc, "field 'tagLayout'", TagLayout.class);
    }
}
