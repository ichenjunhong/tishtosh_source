package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.poi.widget.MerchantAvatarImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.GotCouponDialog_ViewBinding */
public class GotCouponDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GotCouponDialog f100456a;

    public void unbind() {
        GotCouponDialog gotCouponDialog = this.f100456a;
        if (gotCouponDialog != null) {
            this.f100456a = null;
            gotCouponDialog.headImageIv = null;
            gotCouponDialog.headImageIvBg = null;
            gotCouponDialog.vMask = null;
            gotCouponDialog.avatarImageView = null;
            gotCouponDialog.merchantNameTv = null;
            gotCouponDialog.tvCongrats = null;
            gotCouponDialog.tvISee = null;
            gotCouponDialog.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GotCouponDialog_ViewBinding(GotCouponDialog gotCouponDialog, View view) {
        this.f100456a = gotCouponDialog;
        gotCouponDialog.headImageIv = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.anp, "field 'headImageIv'", RemoteImageView.class);
        gotCouponDialog.headImageIvBg = (ImageView) Utils.findRequiredViewAsType(view, R.id.anq, "field 'headImageIvBg'", ImageView.class);
        gotCouponDialog.vMask = Utils.findRequiredView(view, R.id.do3, "field 'vMask'");
        gotCouponDialog.avatarImageView = (MerchantAvatarImageView) Utils.findRequiredViewAsType(view, R.id.i0, "field 'avatarImageView'", MerchantAvatarImageView.class);
        gotCouponDialog.merchantNameTv = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.blb, "field 'merchantNameTv'", DmtTextView.class);
        gotCouponDialog.tvCongrats = (TextView) Utils.findRequiredViewAsType(view, R.id.d8e, "field 'tvCongrats'", TextView.class);
        gotCouponDialog.tvISee = (TextView) Utils.findRequiredViewAsType(view, R.id.dah, "field 'tvISee'", TextView.class);
        gotCouponDialog.tvTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dhb, "field 'tvTitle'", DmtTextView.class);
    }
}
