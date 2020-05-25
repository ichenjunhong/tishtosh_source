package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.LocationCellBViewHolder_ViewBinding */
public class LocationCellBViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocationCellBViewHolder f78255a;

    public void unbind() {
        LocationCellBViewHolder locationCellBViewHolder = this.f78255a;
        if (locationCellBViewHolder != null) {
            this.f78255a = null;
            locationCellBViewHolder.mAvHeadView = null;
            locationCellBViewHolder.mTvLocation = null;
            locationCellBViewHolder.txtDistance = null;
            locationCellBViewHolder.mTvName = null;
            locationCellBViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LocationCellBViewHolder_ViewBinding(LocationCellBViewHolder locationCellBViewHolder, View view) {
        this.f78255a = locationCellBViewHolder;
        locationCellBViewHolder.mAvHeadView = (SmartAvatarImageView) Utils.findRequiredViewAsType(view, R.id.hi, "field 'mAvHeadView'", SmartAvatarImageView.class);
        locationCellBViewHolder.mTvLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.bi7, "field 'mTvLocation'", TextView.class);
        locationCellBViewHolder.txtDistance = (TextView) Utils.findRequiredViewAsType(view, R.id.dkc, "field 'txtDistance'", TextView.class);
        locationCellBViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, R.id.aw5, "field 'mTvName'", TextView.class);
        locationCellBViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.cxc, "field 'tagLayout'", TagLayout.class);
    }
}
