package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder_ViewBinding */
public class FansCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FansCardViewHolder f103106a;

    public void unbind() {
        FansCardViewHolder fansCardViewHolder = this.f103106a;
        if (fansCardViewHolder != null) {
            this.f103106a = null;
            fansCardViewHolder.txtFansCount = null;
            fansCardViewHolder.ivFansPlatform = null;
            fansCardViewHolder.txtPlatform = null;
            fansCardViewHolder.ivDetailFans = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FansCardViewHolder_ViewBinding(FansCardViewHolder fansCardViewHolder, View view) {
        this.f103106a = fansCardViewHolder;
        fansCardViewHolder.txtFansCount = (TextView) Utils.findRequiredViewAsType(view, R.id.adp, "field 'txtFansCount'", TextView.class);
        fansCardViewHolder.ivFansPlatform = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.ae1, "field 'ivFansPlatform'", CircleImageView.class);
        fansCardViewHolder.txtPlatform = (TextView) Utils.findRequiredViewAsType(view, R.id.by9, "field 'txtPlatform'", TextView.class);
        fansCardViewHolder.ivDetailFans = (ImageView) Utils.findRequiredViewAsType(view, R.id.a4w, "field 'ivDetailFans'", ImageView.class);
    }
}
