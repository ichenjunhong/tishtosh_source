package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FollowFeedTagGroup;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder_ViewBinding */
public class PoiItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiItemViewHolder f72888a;

    public void unbind() {
        PoiItemViewHolder poiItemViewHolder = this.f72888a;
        if (poiItemViewHolder != null) {
            this.f72888a = null;
            poiItemViewHolder.spaceView = null;
            poiItemViewHolder.mPoiImg = null;
            poiItemViewHolder.mPoiImgPlaceHolder = null;
            poiItemViewHolder.mPoiName = null;
            poiItemViewHolder.mPoiPerPrice = null;
            poiItemViewHolder.mPoiRankDesc = null;
            poiItemViewHolder.mPoiOption = null;
            poiItemViewHolder.mSecondCutLine = null;
            poiItemViewHolder.mPoiType = null;
            poiItemViewHolder.mPoiDistance = null;
            poiItemViewHolder.mPoiCouponContainer = null;
            poiItemViewHolder.mPoiCouponDesc = null;
            poiItemViewHolder.mPoiNameWithServiceLayout = null;
            poiItemViewHolder.mPoiSpuOverDate = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiItemViewHolder_ViewBinding(PoiItemViewHolder poiItemViewHolder, View view) {
        this.f72888a = poiItemViewHolder;
        poiItemViewHolder.spaceView = Utils.findRequiredView(view, R.id.cqc, "field 'spaceView'");
        poiItemViewHolder.mPoiImg = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.c0x, "field 'mPoiImg'", SmartImageView.class);
        poiItemViewHolder.mPoiImgPlaceHolder = (ImageView) Utils.findRequiredViewAsType(view, R.id.c0z, "field 'mPoiImgPlaceHolder'", ImageView.class);
        poiItemViewHolder.mPoiName = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c19, "field 'mPoiName'", DmtTextView.class);
        poiItemViewHolder.mPoiPerPrice = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c1b, "field 'mPoiPerPrice'", DmtTextView.class);
        poiItemViewHolder.mPoiRankDesc = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c1h, "field 'mPoiRankDesc'", DmtTextView.class);
        poiItemViewHolder.mPoiOption = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c1_, "field 'mPoiOption'", DmtTextView.class);
        poiItemViewHolder.mSecondCutLine = Utils.findRequiredView(view, R.id.cjz, "field 'mSecondCutLine'");
        poiItemViewHolder.mPoiType = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c36, "field 'mPoiType'", DmtTextView.class);
        poiItemViewHolder.mPoiDistance = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c0q, "field 'mPoiDistance'", DmtTextView.class);
        poiItemViewHolder.mPoiCouponContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.a1m, "field 'mPoiCouponContainer'", ViewGroup.class);
        poiItemViewHolder.mPoiCouponDesc = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.a1n, "field 'mPoiCouponDesc'", DmtTextView.class);
        poiItemViewHolder.mPoiNameWithServiceLayout = (FollowFeedTagGroup) Utils.findRequiredViewAsType(view, R.id.epi, "field 'mPoiNameWithServiceLayout'", FollowFeedTagGroup.class);
        poiItemViewHolder.mPoiSpuOverDate = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.epv, "field 'mPoiSpuOverDate'", DmtTextView.class);
    }
}
