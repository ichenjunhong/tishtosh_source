package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductViewHolder */
public class PoiDcdProductViewHolder extends C1352v {
    public RemoteImageView mImage;
    public TextView mName;
    public TextView mPrice;
    public TextView mSalesPromotion;
    public TextView mSubmitButton;

    public PoiDcdProductViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }
}
