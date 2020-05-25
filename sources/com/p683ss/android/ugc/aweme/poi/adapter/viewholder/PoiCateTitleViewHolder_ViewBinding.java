package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder_ViewBinding */
public class PoiCateTitleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCateTitleViewHolder f99343a;

    public void unbind() {
        PoiCateTitleViewHolder poiCateTitleViewHolder = this.f99343a;
        if (poiCateTitleViewHolder != null) {
            this.f99343a = null;
            poiCateTitleViewHolder.mTxtTitle = null;
            poiCateTitleViewHolder.mMoreTxt = null;
            poiCateTitleViewHolder.mMoreArrow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCateTitleViewHolder_ViewBinding(PoiCateTitleViewHolder poiCateTitleViewHolder, View view) {
        this.f99343a = poiCateTitleViewHolder;
        poiCateTitleViewHolder.mTxtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.bz9, "field 'mTxtTitle'", TextView.class);
        poiCateTitleViewHolder.mMoreTxt = Utils.findRequiredView(view, R.id.bz7, "field 'mMoreTxt'");
        poiCateTitleViewHolder.mMoreArrow = Utils.findRequiredView(view, R.id.bz8, "field 'mMoreArrow'");
    }
}
