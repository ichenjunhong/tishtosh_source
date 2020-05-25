package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder_ViewBinding */
public class PoiRecommendViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiRecommendViewHolder f99410a;

    public void unbind() {
        PoiRecommendViewHolder poiRecommendViewHolder = this.f99410a;
        if (poiRecommendViewHolder != null) {
            this.f99410a = null;
            poiRecommendViewHolder.mRecommendLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiRecommendViewHolder_ViewBinding(PoiRecommendViewHolder poiRecommendViewHolder, View view) {
        this.f99410a = poiRecommendViewHolder;
        poiRecommendViewHolder.mRecommendLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bzo, "field 'mRecommendLayout'", LinearLayout.class);
    }
}
