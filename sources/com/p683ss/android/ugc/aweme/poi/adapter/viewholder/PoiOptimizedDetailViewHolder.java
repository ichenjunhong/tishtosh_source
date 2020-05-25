package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25686a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38976g;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.model.C39120d;
import com.p683ss.android.ugc.aweme.poi.model.C39132p;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39389l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39407s;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiNoticeActivity.C39266a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39312e;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39314g;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.PoiAdLayout;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.PoiCouponLayout;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import com.p683ss.android.ugc.aweme.poi.utils.C39442c;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.poi.utils.C39468x;
import com.p683ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.p683ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.p683ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.p683ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder */
public class PoiOptimizedDetailViewHolder extends C1352v {

    /* renamed from: a */
    public Context f99368a;

    /* renamed from: b */
    PoiDetail f99369b;

    /* renamed from: c */
    public C39389l f99370c = new C39389l();

    /* renamed from: d */
    public C39067g f99371d;

    /* renamed from: e */
    private PoiStruct f99372e;

    /* renamed from: f */
    private double f99373f;

    /* renamed from: g */
    private double f99374g;

    /* renamed from: h */
    private C36282r f99375h;

    /* renamed from: i */
    private double f99376i;

    /* renamed from: j */
    private double f99377j;

    /* renamed from: k */
    private C11079a f99378k;

    /* renamed from: l */
    private C38999a f99379l;

    /* renamed from: m */
    private C38976g f99380m;
    protected View mActMore;
    protected View mActsLayout;
    protected PoiActsFlipperView mActsView;
    protected HorizontalBusinessComponentLayout mBusinessComponent;
    protected CompoundDrawableAndTextLayout mDetailDesc;
    protected View mDetailDescLayout;
    protected View mMerchantActsLayout;
    protected CompoundDrawableAndTextLayout mMerchantActsView;
    protected View mMerchantMore;
    protected View mPhone;
    protected View mPhoneDivider;
    protected View mPhoneLayout;
    protected PoiAdLayout mPoiAdLayout;
    protected CompoundDrawableAndTextLayout mPoiAddr;
    protected View mPoiAddrDivider;
    protected View mPoiAddrLayout;
    protected View mPoiCollectLayout;
    protected View mPoiContentLayout;
    protected PoiCouponLayout mPoiCouponLayout;
    protected TextView mPoiDistance;
    protected PoiHeaderLayout mPoiHeaderLayout;
    protected CompoundDrawableAndTextLayout mPoiQueue;
    protected View mPoiQueueDivider;
    protected CompoundDrawableAndTextLayout mPoiRank;
    protected View mPoiRankLayout;
    protected CompoundDrawableAndTextLayout mPoiReserve;
    protected View mPoiReserveAndQueueDivider;
    protected View mPoiReserveAndQueueLayout;
    protected View mRankMore;

    /* renamed from: a */
    public final void mo79154a() {
        if (this.mActsView != null) {
            this.mActsView.mo80443a();
        }
    }

    /* renamed from: c */
    public final void mo79158c() {
        m86833e();
        this.mPoiDistance.setVisibility(8);
    }

    /* renamed from: h */
    private boolean m86836h() {
        if (C9431p.m18664a(this.f99369b.getPhone())) {
            return false;
        }
        this.mPhone.setVisibility(0);
        this.mPhoneDivider.setVisibility(0);
        return true;
    }

    /* renamed from: j */
    private void m86838j() {
        String poiRank = this.f99369b.getPoiRank();
        if (!C9431p.m18664a(poiRank)) {
            m86839k();
            this.mPoiRankLayout.setVisibility(0);
            this.mPoiRank.setText(poiRank);
        }
    }

    /* renamed from: n */
    private void m86842n() {
        String desc = this.f99369b.getDesc();
        if (!C9431p.m18664a(desc)) {
            this.mDetailDescLayout.setVisibility(0);
            this.mDetailDesc.setText(desc);
        }
    }

    /* renamed from: b */
    public final void mo79157b() {
        if (this.mActsView != null) {
            PoiActsFlipperView poiActsFlipperView = this.mActsView;
            if (!poiActsFlipperView.isFlipping() && poiActsFlipperView.f100936a.size() >= 2) {
                poiActsFlipperView.showNext();
                poiActsFlipperView.startFlipping();
            }
        }
    }

    /* renamed from: e */
    private boolean m86833e() {
        if (!C39462r.m87773a(this.f99373f, this.f99374g) || !C39462r.m87773a(this.f99376i, this.f99377j) || !C39468x.m87786a(this.f99372e, this.f99375h)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m86834f() {
        mo79158c();
        this.mPoiAddr.mo80435a(this.f99372e, R.drawable.dks);
        C39462r.m87771a(this.mPoiAddrLayout, this.mPoiAddr.getTextView().getText(), this.f99368a, R.string.h1w, "poi_address", this.f99369b, this.f99371d.getPreviousPage());
    }

    /* renamed from: d */
    private void m86832d() {
        this.f99375h = C36286a.m81925a().mo75120b(null);
        if (this.f99375h != null) {
            C36286a.m81925a().mo75121b();
            try {
                this.f99376i = this.f99375h.getLatitude();
                this.f99377j = this.f99375h.getLongitude();
                if (!this.f99375h.isGaode()) {
                    double[] a = C39440a.m87681a(this.f99377j, this.f99376i);
                    this.f99377j = a[0];
                    this.f99376i = a[1];
                }
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }

    /* renamed from: g */
    private void m86835g() {
        boolean z;
        this.mPoiHeaderLayout.mo80450a(this.f99369b);
        if (this.mPoiAddrLayout.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        m86834f();
        m86838j();
        m86842n();
        m86840l();
        boolean h = m86836h();
        m86841m();
        List acts = this.f99369b.getActs();
        if (!C9376b.m18558a((Collection<T>) acts)) {
            this.mActsLayout.setVisibility(0);
            this.mActsView.mo80444a(acts, this.f99371d);
            if (z) {
                this.mActsLayout.setPadding(0, (int) C9432q.m18687b(this.f99368a, 7.0f), 0, 0);
            }
            z = false;
        }
        boolean i = m86837i();
        if (z) {
            z = !i;
        }
        if (z) {
            this.mPoiAddrDivider.setVisibility(8);
        }
        if (h) {
            this.mPhoneLayout.setVisibility(0);
        }
        this.mRankMore.setVisibility(0);
        this.mActMore.setVisibility(0);
        this.mMerchantMore.setVisibility(0);
    }

    /* renamed from: i */
    private boolean m86837i() {
        String merchantActTitle = this.f99369b.getMerchantActTitle();
        if (TextUtils.isEmpty(merchantActTitle)) {
            return false;
        }
        this.mMerchantActsLayout.setVisibility(0);
        this.mMerchantActsView.setText(merchantActTitle);
        C39452l.m87730a(this.f99371d, "merchant_event_show", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("previous_page", this.f99371d.getPreviousPage()).mo47829a("poi_id", this.f99371d.getPoiId()).mo47829a("merchant_event_id", this.f99369b.getMerchantActId()));
        return true;
    }

    /* renamed from: k */
    private void m86839k() {
        String str;
        C39132p poiRankBundle = this.f99369b.getPoiRankBundle();
        if (poiRankBundle != null) {
            if (poiRankBundle.classOption != null) {
                str = poiRankBundle.classOption.getName();
            } else {
                str = "";
            }
            C39452l.m87730a(this.f99371d, "leaderboard_bar_show", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("previous_page", this.f99371d.getPreviousPage()).mo47829a("rank_index", String.valueOf(poiRankBundle.rankValue)).mo47829a("poi_channel", this.f99369b.getBackendType()).mo47829a("sub_class", str).mo47829a("city_info", C23198ae.m56845a()).mo47829a("district_code", poiRankBundle.districtCode).mo47829a("poi_id", this.f99369b.poiStruct.poiId));
        }
    }

    /* renamed from: l */
    private void m86840l() {
        boolean z;
        if (!this.f99369b.isEnterprise()) {
            String bookUrl = this.f99369b.getBookUrl();
            String queueUrl = this.f99369b.getQueueUrl();
            boolean z2 = true;
            if (!TextUtils.isEmpty(bookUrl)) {
                this.mPoiReserve.setVisibility(0);
                this.mPoiReserve.setTextRes(R.string.csp);
                this.mPoiReserve.setOnClickListener(new C39022j(this));
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(queueUrl)) {
                this.mPoiQueue.setVisibility(0);
                this.mPoiQueue.setTextRes(R.string.crx);
                this.mPoiQueue.setOnClickListener(new C39023k(this));
                if (z) {
                    this.mPoiQueueDivider.setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z || z2) {
                this.mPoiReserveAndQueueLayout.setVisibility(0);
                this.mPoiReserveAndQueueDivider.setVisibility(0);
            }
        }
    }

    /* renamed from: m */
    private void m86841m() {
        String str;
        C39120d poiActivityInfo = this.f99369b.getPoiActivityInfo();
        if (poiActivityInfo == null) {
            if (!TextUtils.isEmpty(this.f99371d.getActivityId())) {
                C10691a.m21542b(this.f99368a, (int) R.string.ajp).mo19066a();
            }
            return;
        }
        if (this.f99369b.poiExtension != null) {
            str = String.valueOf(this.f99369b.poiExtension.source);
        } else {
            str = "";
        }
        this.mPoiAdLayout.mo80121a(poiActivityInfo.getAdCard(), str, this.f99371d);
        if (poiActivityInfo.getCouponInfo() != null && !TextUtils.isEmpty(this.f99371d.getActivityId()) && !TextUtils.equals(String.valueOf(poiActivityInfo.getCouponInfo().getActivityId()), this.f99371d.getActivityId())) {
            C10691a.m21542b(this.f99368a, (int) R.string.ajp).mo19066a();
        }
        if (this.f99378k instanceof C39312e) {
            this.mPoiCouponLayout.mo80123a(poiActivityInfo.getCouponInfo(), (C39312e) this.f99378k, this.f99372e.getVoucherReleaseAreas(), this.f99371d);
        }
    }

    /* renamed from: a */
    public final void mo79155a(C25687b bVar) {
        PoiCouponLayout poiCouponLayout = this.mPoiCouponLayout;
        if (bVar != null && poiCouponLayout.f100467a != null) {
            if (bVar.getStatus() == C25686a.StatusRedeemed.value) {
                poiCouponLayout.f100467a.setText(poiCouponLayout.getContext().getString(R.string.ajh));
            } else {
                poiCouponLayout.f100467a.setText(poiCouponLayout.getContext().getString(R.string.aju));
            }
            poiCouponLayout.setOnClickListener(new C39314g(poiCouponLayout, bVar));
        }
    }

    /* renamed from: a */
    public final void mo79156a(PoiDetail poiDetail) {
        if (poiDetail != null && this.f99369b == null) {
            this.f99369b = poiDetail;
            this.f99372e = poiDetail.getPoiStruct();
            if (this.f99372e != null) {
                this.f99371d.setPoiId(this.f99372e.poiId);
                this.f99371d.setPoiType(this.f99372e.getTypeCode());
                this.f99371d.setBackendType(this.f99372e.getBackendTypeCode());
                this.f99371d.setPoiCity(this.f99372e.getCityCode());
                if (TextUtils.isEmpty(poiDetail.getAddress())) {
                    this.mPoiAddrLayout.setVisibility(8);
                } else {
                    this.mPoiAddr.setVisibility(0);
                    if (!C9431p.m18664a(this.f99372e.getPoiLatitude()) && !C9431p.m18664a(this.f99372e.getPoiLongitude())) {
                        try {
                            m86832d();
                            this.f99373f = Double.parseDouble(this.f99372e.getPoiLatitude());
                            this.f99374g = Double.parseDouble(this.f99372e.getPoiLongitude());
                            double[] a = C39442c.m87696a(this.f99373f, this.f99374g);
                            this.f99373f = a[0];
                            this.f99374g = a[1];
                        } catch (Exception e) {
                            C32458a.m75143a(e);
                        }
                    }
                    this.mPoiDistance.setVisibility(8);
                    String address = poiDetail.getAddress();
                    String str = "";
                    if (m86833e()) {
                        StringBuilder sb = new StringBuilder(" | ");
                        sb.append(C39442c.m87700c(this.f99368a, this.f99373f, this.f99374g, this.f99376i, this.f99377j));
                        str = sb.toString();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(address);
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb3);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f99368a.getResources().getColor(R.color.aw1)), 0, address.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f99368a.getResources().getColor(R.color.aw1)), address.length(), sb3.length(), 33);
                    this.mPoiAddr.getTextView().setText(spannableStringBuilder);
                }
            } else {
                this.mPoiAddrLayout.setVisibility(8);
            }
            m86835g();
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        int id = view.getId();
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(this.f99371d.getAwemeId());
        if (id == R.id.c02) {
            C39443d.m87708c(this.f99368a, rawAdAwemeById, this.f99371d.getPoiId());
            C39462r.m87769a(this.f99368a, this.f99369b.getPhone(), "poi_page", "click_button", this.f99371d);
        } else if (id == R.id.bzs) {
            C39452l.m87735a("click_address", "click", this.f99371d);
            if (this.f99379l != null) {
                this.f99379l.mo79150a(true);
            }
            C39443d.m87702a(this.f99368a, rawAdAwemeById, "address", this.f99371d.getPoiId());
        } else if (id != R.id.bzu) {
            if (id == R.id.bzm) {
                if (this.f99369b != null) {
                    C39452l.m87730a(this.f99371d, "click_poi_introduction", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("previous_page", this.f99371d.getPreviousPage()).mo47829a("poi_id", this.f99369b.getPoiId()));
                    StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/douyin_falcon/poi/detail/?poi_id=");
                    sb.append(this.f99369b.getPoiId());
                    String sb2 = sb.toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("title", this.f99369b.getDesc());
                    bundle.putBoolean("hide_nav_bar", false);
                    bundle.putBoolean("hide_status_bar", false);
                    bundle.putBoolean("show_closeall", false);
                    C39460p.m87761a(this.f99368a, sb2, bundle);
                }
            } else if (id == R.id.c0l) {
                long poiRankClassCode = this.f99369b.getPoiRankClassCode();
                C39132p poiRankBundle = this.f99369b.getPoiRankBundle();
                if (!(poiRankClassCode == -1 || poiRankBundle == null)) {
                    if (poiRankBundle.classOption != null) {
                        str2 = poiRankBundle.classOption.getName();
                    } else {
                        str2 = "";
                    }
                    C39452l.m87730a(this.f99371d, "enter_poi_leaderboard", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("city_info", C23198ae.m56845a()).mo47829a("enter_method", "click_leaderboard_bar").mo47829a("poi_channel", this.f99369b.getBackendType()).mo47829a("sub_class", str2).mo47829a("district_code", poiRankBundle.districtCode).mo47829a("poi_id", this.f99371d.getPoiId()));
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("poi_rank", poiRankBundle);
                    bundle2.putString("enter_from", "poi_page");
                    bundle2.putString("enter_method", "click_leaderboard_bar");
                    bundle2.putString("district_code", poiRankBundle.districtCode);
                    C39407s.m87632a(this.f99368a, bundle2);
                }
            } else if (id == R.id.bzh) {
                if (this.f99380m == null) {
                    this.f99380m = new C38976g(this.f99371d, "poi_page", 0, this.f99369b.getBackendType());
                }
                this.mActsView.mo80443a();
                this.f99380m.mo79131a(this.f99368a, this.mActsView.getCurrentItem(), this.mActsView.getCurrentPosition());
            } else if (id == R.id.c17) {
                Context context = this.f99368a;
                if (this.f99372e != null) {
                    str = this.f99372e.poiName;
                } else {
                    str = "";
                }
                C39266a.m87280a(context, str, this.f99369b.getMerchantAct());
                C39452l.m87730a(this.f99371d, "merchant_event_click", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("previous_page", this.f99371d.getPreviousPage()).mo47829a("poi_id", this.f99371d.getPoiId()).mo47829a("merchant_event_id", this.f99369b.getMerchantActId()));
            }
        } else if (!C32800a.m75679a(this.mPoiCollectLayout)) {
            this.f99370c.mo80356a(view, false);
        }
    }

    public PoiOptimizedDetailViewHolder(C11079a aVar, C38999a aVar2, View view) {
        super(view);
        this.f99378k = aVar;
        this.f99368a = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f99379l = aVar2;
        this.mPoiHeaderLayout.mo80449a(aVar, aVar2, this.f99370c, null);
    }
}
