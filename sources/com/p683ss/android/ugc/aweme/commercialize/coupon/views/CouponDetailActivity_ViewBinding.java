package com.p683ss.android.ugc.aweme.commercialize.coupon.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity_ViewBinding */
public class CouponDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CouponDetailActivity f67976a;

    /* renamed from: b */
    private View f67977b;

    /* renamed from: c */
    private View f67978c;

    /* renamed from: d */
    private View f67979d;

    /* renamed from: e */
    private View f67980e;

    /* renamed from: f */
    private View f67981f;

    /* renamed from: g */
    private View f67982g;

    /* renamed from: h */
    private View f67983h;

    /* renamed from: i */
    private View f67984i;

    public void unbind() {
        CouponDetailActivity couponDetailActivity = this.f67976a;
        if (couponDetailActivity != null) {
            this.f67976a = null;
            couponDetailActivity.mStatusView = null;
            couponDetailActivity.headImageIv = null;
            couponDetailActivity.headImageIvBg = null;
            couponDetailActivity.avatarImageView = null;
            couponDetailActivity.merchantNameTv = null;
            couponDetailActivity.titleView = null;
            couponDetailActivity.couponNumberTv = null;
            couponDetailActivity.couponNumberTitleTv = null;
            couponDetailActivity.couponStatusTv = null;
            couponDetailActivity.validEndTimeTv = null;
            couponDetailActivity.merchantMoreBtn = null;
            couponDetailActivity.merchantPoiList = null;
            couponDetailActivity.merchantPosition = null;
            couponDetailActivity.merchantContact = null;
            couponDetailActivity.merchantDetail = null;
            couponDetailActivity.mQRCodeIV = null;
            couponDetailActivity.mBRCodeIV = null;
            couponDetailActivity.couponRate = null;
            couponDetailActivity.couponUseBt = null;
            couponDetailActivity.couponDivideView = null;
            couponDetailActivity.couponNumberFL = null;
            couponDetailActivity.couponListBt = null;
            couponDetailActivity.mMerchantDetail = null;
            couponDetailActivity.mOutBox = null;
            couponDetailActivity.mDragLayout = null;
            couponDetailActivity.mCloseBtn = null;
            this.f67977b.setOnClickListener(null);
            this.f67977b = null;
            this.f67978c.setOnClickListener(null);
            this.f67978c = null;
            this.f67979d.setOnClickListener(null);
            this.f67979d = null;
            this.f67980e.setOnClickListener(null);
            this.f67980e = null;
            this.f67981f.setOnClickListener(null);
            this.f67981f = null;
            this.f67982g.setOnClickListener(null);
            this.f67982g = null;
            this.f67983h.setOnClickListener(null);
            this.f67983h = null;
            this.f67984i.setOnClickListener(null);
            this.f67984i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CouponDetailActivity_ViewBinding(final CouponDetailActivity couponDetailActivity, View view) {
        this.f67976a = couponDetailActivity;
        couponDetailActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        couponDetailActivity.headImageIv = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.anp, "field 'headImageIv'", RemoteImageView.class);
        couponDetailActivity.headImageIvBg = (ImageView) Utils.findRequiredViewAsType(view, R.id.anq, "field 'headImageIvBg'", ImageView.class);
        couponDetailActivity.avatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.i0, "field 'avatarImageView'", AvatarImageView.class);
        couponDetailActivity.merchantNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.blb, "field 'merchantNameTv'", TextView.class);
        couponDetailActivity.titleView = (TextView) Utils.findRequiredViewAsType(view, R.id.d1l, "field 'titleView'", TextView.class);
        couponDetailActivity.couponNumberTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a1v, "field 'couponNumberTv'", TextView.class);
        couponDetailActivity.couponNumberTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a1u, "field 'couponNumberTitleTv'", TextView.class);
        couponDetailActivity.couponStatusTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a1y, "field 'couponStatusTv'", TextView.class);
        couponDetailActivity.validEndTimeTv = (TextView) Utils.findRequiredViewAsType(view, R.id.do8, "field 'validEndTimeTv'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.aw2, "field 'merchantMoreBtn' and method 'onClick'");
        couponDetailActivity.merchantMoreBtn = findRequiredView;
        this.f67977b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.aw3, "field 'merchantPoiList' and method 'onClick'");
        couponDetailActivity.merchantPoiList = findRequiredView2;
        this.f67978c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.aw4, "field 'merchantPosition' and method 'onClick'");
        couponDetailActivity.merchantPosition = findRequiredView3;
        this.f67979d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.aw0, "field 'merchantContact' and method 'onClick'");
        couponDetailActivity.merchantContact = findRequiredView4;
        this.f67980e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.aw1, "field 'merchantDetail' and method 'onClick'");
        couponDetailActivity.merchantDetail = findRequiredView5;
        this.f67981f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        couponDetailActivity.mQRCodeIV = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.c7j, "field 'mQRCodeIV'", RemoteImageView.class);
        couponDetailActivity.mBRCodeIV = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.mr, "field 'mBRCodeIV'", RemoteImageView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.a1w, "field 'couponRate' and method 'onClick'");
        couponDetailActivity.couponRate = (DmtTextView) Utils.castView(findRequiredView6, R.id.a1w, "field 'couponRate'", DmtTextView.class);
        this.f67982g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, R.id.a20, "field 'couponUseBt' and method 'onClick'");
        couponDetailActivity.couponUseBt = (DmtTextView) Utils.castView(findRequiredView7, R.id.a20, "field 'couponUseBt'", DmtTextView.class);
        this.f67983h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        couponDetailActivity.couponDivideView = Utils.findRequiredView(view, R.id.a1o, "field 'couponDivideView'");
        couponDetailActivity.couponNumberFL = Utils.findRequiredView(view, R.id.a1t, "field 'couponNumberFL'");
        couponDetailActivity.couponListBt = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.a1s, "field 'couponListBt'", LinearLayout.class);
        couponDetailActivity.mMerchantDetail = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dbv, "field 'mMerchantDetail'", DmtTextView.class);
        couponDetailActivity.mOutBox = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ent, "field 'mOutBox'", ViewGroup.class);
        couponDetailActivity.mDragLayout = Utils.findRequiredView(view, R.id.a8q, "field 'mDragLayout'");
        couponDetailActivity.mCloseBtn = Utils.findRequiredView(view, R.id.e9l, "field 'mCloseBtn'");
        View findRequiredView8 = Utils.findRequiredView(view, R.id.im, "method 'onClick'");
        this.f67984i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
    }
}
