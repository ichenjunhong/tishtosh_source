package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.PoiAdLayout;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.PoiCouponLayout;
import com.p683ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.p683ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.p683ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.p683ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder_ViewBinding */
public class PoiOptimizedDetailViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiOptimizedDetailViewHolder f99381a;

    /* renamed from: b */
    private View f99382b;

    /* renamed from: c */
    private View f99383c;

    /* renamed from: d */
    private View f99384d;

    /* renamed from: e */
    private View f99385e;

    /* renamed from: f */
    private View f99386f;

    /* renamed from: g */
    private View f99387g;

    /* renamed from: h */
    private View f99388h;

    public void unbind() {
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f99381a;
        if (poiOptimizedDetailViewHolder != null) {
            this.f99381a = null;
            poiOptimizedDetailViewHolder.mPoiAddrDivider = null;
            poiOptimizedDetailViewHolder.mPoiAddrLayout = null;
            poiOptimizedDetailViewHolder.mPoiDistance = null;
            poiOptimizedDetailViewHolder.mPhoneDivider = null;
            poiOptimizedDetailViewHolder.mPhone = null;
            poiOptimizedDetailViewHolder.mPhoneLayout = null;
            poiOptimizedDetailViewHolder.mDetailDescLayout = null;
            poiOptimizedDetailViewHolder.mDetailDesc = null;
            poiOptimizedDetailViewHolder.mPoiAddr = null;
            poiOptimizedDetailViewHolder.mPoiRank = null;
            poiOptimizedDetailViewHolder.mPoiRankLayout = null;
            poiOptimizedDetailViewHolder.mPoiContentLayout = null;
            poiOptimizedDetailViewHolder.mPoiCouponLayout = null;
            poiOptimizedDetailViewHolder.mPoiAdLayout = null;
            poiOptimizedDetailViewHolder.mPoiReserveAndQueueLayout = null;
            poiOptimizedDetailViewHolder.mPoiReserve = null;
            poiOptimizedDetailViewHolder.mPoiQueue = null;
            poiOptimizedDetailViewHolder.mPoiQueueDivider = null;
            poiOptimizedDetailViewHolder.mPoiReserveAndQueueDivider = null;
            poiOptimizedDetailViewHolder.mPoiCollectLayout = null;
            poiOptimizedDetailViewHolder.mBusinessComponent = null;
            poiOptimizedDetailViewHolder.mActsView = null;
            poiOptimizedDetailViewHolder.mActsLayout = null;
            poiOptimizedDetailViewHolder.mMerchantActsView = null;
            poiOptimizedDetailViewHolder.mMerchantActsLayout = null;
            poiOptimizedDetailViewHolder.mPoiHeaderLayout = null;
            poiOptimizedDetailViewHolder.mRankMore = null;
            poiOptimizedDetailViewHolder.mActMore = null;
            poiOptimizedDetailViewHolder.mMerchantMore = null;
            this.f99382b.setOnClickListener(null);
            this.f99382b = null;
            this.f99383c.setOnClickListener(null);
            this.f99383c = null;
            this.f99384d.setOnClickListener(null);
            this.f99384d = null;
            this.f99385e.setOnClickListener(null);
            this.f99385e = null;
            this.f99386f.setOnClickListener(null);
            this.f99386f = null;
            this.f99387g.setOnClickListener(null);
            this.f99387g = null;
            this.f99388h.setOnClickListener(null);
            this.f99388h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiOptimizedDetailViewHolder_ViewBinding(final PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder, View view) {
        this.f99381a = poiOptimizedDetailViewHolder;
        poiOptimizedDetailViewHolder.mPoiAddrDivider = Utils.findRequiredView(view, R.id.bzr, "field 'mPoiAddrDivider'");
        View findRequiredView = Utils.findRequiredView(view, R.id.bzs, "field 'mPoiAddrLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiAddrLayout = findRequiredView;
        this.f99382b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPoiDistance = (TextView) Utils.findRequiredViewAsType(view, R.id.bzx, "field 'mPoiDistance'", TextView.class);
        poiOptimizedDetailViewHolder.mPhoneDivider = Utils.findRequiredView(view, R.id.c03, "field 'mPhoneDivider'");
        View findRequiredView2 = Utils.findRequiredView(view, R.id.c02, "field 'mPhone' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPhone = findRequiredView2;
        this.f99383c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPhoneLayout = Utils.findRequiredView(view, R.id.c04, "field 'mPhoneLayout'");
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bzm, "field 'mDetailDescLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mDetailDescLayout = findRequiredView3;
        this.f99384d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mDetailDesc = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.bzl, "field 'mDetailDesc'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiAddr = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.bzp, "field 'mPoiAddr'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiRank = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.c0k, "field 'mPoiRank'", CompoundDrawableAndTextLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.c0l, "field 'mPoiRankLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiRankLayout = findRequiredView4;
        this.f99385e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPoiContentLayout = Utils.findRequiredView(view, R.id.bzk, "field 'mPoiContentLayout'");
        poiOptimizedDetailViewHolder.mPoiCouponLayout = (PoiCouponLayout) Utils.findRequiredViewAsType(view, R.id.bzd, "field 'mPoiCouponLayout'", PoiCouponLayout.class);
        poiOptimizedDetailViewHolder.mPoiAdLayout = (PoiAdLayout) Utils.findRequiredViewAsType(view, R.id.byn, "field 'mPoiAdLayout'", PoiAdLayout.class);
        poiOptimizedDetailViewHolder.mPoiReserveAndQueueLayout = Utils.findRequiredView(view, R.id.c0o, "field 'mPoiReserveAndQueueLayout'");
        poiOptimizedDetailViewHolder.mPoiReserve = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.epm, "field 'mPoiReserve'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiQueue = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.epn, "field 'mPoiQueue'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiQueueDivider = Utils.findRequiredView(view, R.id.epb, "field 'mPoiQueueDivider'");
        poiOptimizedDetailViewHolder.mPoiReserveAndQueueDivider = Utils.findRequiredView(view, R.id.c0p, "field 'mPoiReserveAndQueueDivider'");
        View findRequiredView5 = Utils.findRequiredView(view, R.id.bzu, "field 'mPoiCollectLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiCollectLayout = findRequiredView5;
        this.f99386f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mBusinessComponent = (HorizontalBusinessComponentLayout) Utils.findRequiredViewAsType(view, R.id.bzj, "field 'mBusinessComponent'", HorizontalBusinessComponentLayout.class);
        poiOptimizedDetailViewHolder.mActsView = (PoiActsFlipperView) Utils.findRequiredViewAsType(view, R.id.bzg, "field 'mActsView'", PoiActsFlipperView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.bzh, "field 'mActsLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mActsLayout = findRequiredView6;
        this.f99387g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mMerchantActsView = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.c16, "field 'mMerchantActsView'", CompoundDrawableAndTextLayout.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.c17, "field 'mMerchantActsLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mMerchantActsLayout = findRequiredView7;
        this.f99388h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPoiHeaderLayout = (PoiHeaderLayout) Utils.findRequiredViewAsType(view, R.id.c0w, "field 'mPoiHeaderLayout'", PoiHeaderLayout.class);
        poiOptimizedDetailViewHolder.mRankMore = Utils.findRequiredView(view, R.id.c0m, "field 'mRankMore'");
        poiOptimizedDetailViewHolder.mActMore = Utils.findRequiredView(view, R.id.bzi, "field 'mActMore'");
        poiOptimizedDetailViewHolder.mMerchantMore = Utils.findRequiredView(view, R.id.c18, "field 'mMerchantMore'");
    }
}
