package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder_ViewBinding */
public class PoiCateMoreViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCateMoreViewHolder f99338a;

    public void unbind() {
        PoiCateMoreViewHolder poiCateMoreViewHolder = this.f99338a;
        if (poiCateMoreViewHolder != null) {
            this.f99338a = null;
            poiCateMoreViewHolder.mTxtMore = null;
            poiCateMoreViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCateMoreViewHolder_ViewBinding(PoiCateMoreViewHolder poiCateMoreViewHolder, View view) {
        this.f99338a = poiCateMoreViewHolder;
        poiCateMoreViewHolder.mTxtMore = (TextView) Utils.findRequiredViewAsType(view, R.id.bz7, "field 'mTxtMore'", TextView.class);
        poiCateMoreViewHolder.mDivider = Utils.findRequiredView(view, R.id.bz6, "field 'mDivider'");
    }
}
