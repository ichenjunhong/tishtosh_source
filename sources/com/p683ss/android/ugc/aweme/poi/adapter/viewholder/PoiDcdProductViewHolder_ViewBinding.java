package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductViewHolder_ViewBinding */
public class PoiDcdProductViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDcdProductViewHolder f99359a;

    public void unbind() {
        PoiDcdProductViewHolder poiDcdProductViewHolder = this.f99359a;
        if (poiDcdProductViewHolder != null) {
            this.f99359a = null;
            poiDcdProductViewHolder.mImage = null;
            poiDcdProductViewHolder.mName = null;
            poiDcdProductViewHolder.mPrice = null;
            poiDcdProductViewHolder.mSalesPromotion = null;
            poiDcdProductViewHolder.mSubmitButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDcdProductViewHolder_ViewBinding(PoiDcdProductViewHolder poiDcdProductViewHolder, View view) {
        this.f99359a = poiDcdProductViewHolder;
        poiDcdProductViewHolder.mImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.awg, "field 'mImage'", RemoteImageView.class);
        poiDcdProductViewHolder.mName = (TextView) Utils.findRequiredViewAsType(view, R.id.awh, "field 'mName'", TextView.class);
        poiDcdProductViewHolder.mPrice = (TextView) Utils.findRequiredViewAsType(view, R.id.awi, "field 'mPrice'", TextView.class);
        poiDcdProductViewHolder.mSalesPromotion = (TextView) Utils.findRequiredViewAsType(view, R.id.awj, "field 'mSalesPromotion'", TextView.class);
        poiDcdProductViewHolder.mSubmitButton = (TextView) Utils.findRequiredViewAsType(view, R.id.awk, "field 'mSubmitButton'", TextView.class);
    }
}
