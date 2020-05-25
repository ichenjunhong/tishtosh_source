package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.poi.widget.PoiLabelsLayout;
import com.p683ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p683ss.android.ugc.aweme.poi.widget.TextAppendViewLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter_ViewBinding */
public class PoiDetailHeaderInfoPresenter_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDetailHeaderInfoPresenter f99367a;

    public void unbind() {
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = this.f99367a;
        if (poiDetailHeaderInfoPresenter != null) {
            this.f99367a = null;
            poiDetailHeaderInfoPresenter.mPoiName = null;
            poiDetailHeaderInfoPresenter.mPoiPrice = null;
            poiDetailHeaderInfoPresenter.mPoiVisitor = null;
            poiDetailHeaderInfoPresenter.mPoiRating = null;
            poiDetailHeaderInfoPresenter.mPoiRatingBar = null;
            poiDetailHeaderInfoPresenter.mPoiRatingTxt = null;
            poiDetailHeaderInfoPresenter.mPoiCollectImg = null;
            poiDetailHeaderInfoPresenter.mPoiCollectLayout = null;
            poiDetailHeaderInfoPresenter.mPoiSubType = null;
            poiDetailHeaderInfoPresenter.mPoiDetails = null;
            poiDetailHeaderInfoPresenter.mPoiRatingLayout = null;
            poiDetailHeaderInfoPresenter.mLocalLayout = null;
            poiDetailHeaderInfoPresenter.mPoiNameLayout = null;
            poiDetailHeaderInfoPresenter.mPoiCollectContent = null;
            poiDetailHeaderInfoPresenter.mPoiOpenTimeTxt = null;
            poiDetailHeaderInfoPresenter.mNewLineLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDetailHeaderInfoPresenter_ViewBinding(PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter, View view) {
        this.f99367a = poiDetailHeaderInfoPresenter;
        poiDetailHeaderInfoPresenter.mPoiName = (TextView) Utils.findRequiredViewAsType(view, R.id.bzz, "field 'mPoiName'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiPrice = (TextView) Utils.findRequiredViewAsType(view, R.id.c05, "field 'mPoiPrice'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiVisitor = (TextView) Utils.findRequiredViewAsType(view, R.id.c0a, "field 'mPoiVisitor'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiRating = Utils.findRequiredView(view, R.id.c06, "field 'mPoiRating'");
        poiDetailHeaderInfoPresenter.mPoiRatingBar = (RatingBar) Utils.findRequiredViewAsType(view, R.id.c07, "field 'mPoiRatingBar'", RatingBar.class);
        poiDetailHeaderInfoPresenter.mPoiRatingTxt = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c09, "field 'mPoiRatingTxt'", DmtTextView.class);
        poiDetailHeaderInfoPresenter.mPoiCollectImg = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.bzt, "field 'mPoiCollectImg'", CheckableImageView.class);
        poiDetailHeaderInfoPresenter.mPoiCollectLayout = Utils.findRequiredView(view, R.id.bzu, "field 'mPoiCollectLayout'");
        poiDetailHeaderInfoPresenter.mPoiSubType = (TextView) Utils.findRequiredViewAsType(view, R.id.c0_, "field 'mPoiSubType'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiDetails = (PoiLabelsLayout) Utils.findRequiredViewAsType(view, R.id.bzw, "field 'mPoiDetails'", PoiLabelsLayout.class);
        poiDetailHeaderInfoPresenter.mPoiRatingLayout = Utils.findRequiredView(view, R.id.c08, "field 'mPoiRatingLayout'");
        poiDetailHeaderInfoPresenter.mLocalLayout = Utils.findRequiredView(view, R.id.bzy, "field 'mLocalLayout'");
        poiDetailHeaderInfoPresenter.mPoiNameLayout = Utils.findRequiredView(view, R.id.c0c, "field 'mPoiNameLayout'");
        poiDetailHeaderInfoPresenter.mPoiCollectContent = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.bzv, "field 'mPoiCollectContent'", DmtTextView.class);
        poiDetailHeaderInfoPresenter.mPoiOpenTimeTxt = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c0d, "field 'mPoiOpenTimeTxt'", DmtTextView.class);
        poiDetailHeaderInfoPresenter.mNewLineLayout = (TextAppendViewLayout) Utils.findRequiredViewAsType(view, R.id.emy, "field 'mNewLineLayout'", TextAppendViewLayout.class);
    }
}
