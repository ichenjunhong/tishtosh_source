package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder_ViewBinding */
public class PoiDcdProductInfoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDcdProductInfoViewHolder f99358a;

    public void unbind() {
        PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder = this.f99358a;
        if (poiDcdProductInfoViewHolder != null) {
            this.f99358a = null;
            poiDcdProductInfoViewHolder.mTitle = null;
            poiDcdProductInfoViewHolder.mAllProduct = null;
            poiDcdProductInfoViewHolder.mAllProductContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDcdProductInfoViewHolder_ViewBinding(PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder, View view) {
        this.f99358a = poiDcdProductInfoViewHolder;
        poiDcdProductInfoViewHolder.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.awl, "field 'mTitle'", TextView.class);
        poiDcdProductInfoViewHolder.mAllProduct = (TextView) Utils.findRequiredViewAsType(view, R.id.awe, "field 'mAllProduct'", TextView.class);
        poiDcdProductInfoViewHolder.mAllProductContainer = Utils.findRequiredView(view, R.id.awd, "field 'mAllProductContainer'");
    }
}
