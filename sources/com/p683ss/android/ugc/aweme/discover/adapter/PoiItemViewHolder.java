package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29663e;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FollowFeedTagGroup;
import com.p683ss.android.ugc.aweme.poi.C39040b;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.model.C39110ap;
import com.p683ss.android.ugc.aweme.poi.model.C39122f;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder */
public class PoiItemViewHolder implements C39040b {

    /* renamed from: a */
    C39054d f72885a;

    /* renamed from: b */
    private Context f72886b;
    ViewGroup mPoiCouponContainer;
    DmtTextView mPoiCouponDesc;
    DmtTextView mPoiDistance;
    SmartImageView mPoiImg;
    ImageView mPoiImgPlaceHolder;
    DmtTextView mPoiName;
    FollowFeedTagGroup mPoiNameWithServiceLayout;
    DmtTextView mPoiOption;
    DmtTextView mPoiPerPrice;
    DmtTextView mPoiRankDesc;
    DmtTextView mPoiSpuOverDate;
    DmtTextView mPoiType;
    View mSecondCutLine;
    View spaceView;

    /* renamed from: a */
    private void m66451a() {
        this.mPoiPerPrice.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int i;
                Layout layout = PoiItemViewHolder.this.mPoiPerPrice.getLayout();
                if (layout != null) {
                    int ellipsisCount = layout.getEllipsisCount(PoiItemViewHolder.this.mPoiPerPrice.getLineCount() - 1);
                    DmtTextView dmtTextView = PoiItemViewHolder.this.mPoiPerPrice;
                    if (ellipsisCount > 0) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    dmtTextView.setVisibility(i);
                    PoiItemViewHolder.this.mPoiPerPrice.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    /* renamed from: a */
    private void m66452a(List<C39110ap> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            if (this.mPoiNameWithServiceLayout.getChildCount() > 1) {
                this.mPoiNameWithServiceLayout.removeViews(1, this.mPoiNameWithServiceLayout.getChildCount() - 1);
            }
            for (C39110ap urlModel : list) {
                UrlModel urlModel2 = urlModel.getUrlModel();
                if (urlModel2 != null) {
                    LayoutParams layoutParams = new LayoutParams((int) C9432q.m18687b(this.f72886b, 12.0f), (int) C9432q.m18687b(this.f72886b, 12.0f));
                    layoutParams.leftMargin = (int) C9432q.m18687b(this.f72886b, 6.0f);
                    layoutParams.topMargin = (int) C9432q.m18687b(this.f72886b, 1.0f);
                    RemoteImageView remoteImageView = new RemoteImageView(this.f72886b);
                    remoteImageView.setLayoutParams(layoutParams);
                    C23515d.m57669a(remoteImageView, urlModel2);
                    this.mPoiNameWithServiceLayout.addView(remoteImageView, layoutParams);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m66453a(C39122f fVar) {
        if (!C36272l.m81898e()) {
            return false;
        }
        CityBean e = C30228f.m70981e();
        if (e == null) {
            return false;
        }
        if (!TextUtils.isEmpty(fVar.cityCode) && TextUtils.equals(fVar.cityCode, e.code)) {
            return true;
        }
        if (TextUtils.isEmpty(fVar.city) || TextUtils.isEmpty(e.name)) {
            return false;
        }
        if (fVar.city.contains(e.name) || e.name.contains(fVar.city)) {
            return true;
        }
        return false;
    }

    public PoiItemViewHolder(View view, C39054d dVar) {
        this.f72886b = view.getContext();
        this.f72885a = dVar;
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo56195a(int i, C29663e eVar) {
        SimplePoiInfoStruct simplePoiInfoStruct = eVar.f77547i;
        if (simplePoiInfoStruct != null) {
            if (!C9376b.m18558a((Collection<T>) eVar.f77548j)) {
                simplePoiInfoStruct.setCover((UrlModel) eVar.f77548j.get(0));
            }
            simplePoiInfoStruct.setPoiSpuStatusDesc(eVar.f77544f);
            if (eVar.f77539a == 2) {
                simplePoiInfoStruct.setPoiSpuOverDate(1);
            }
            if (!C9376b.m18558a((Collection<T>) eVar.f77549k)) {
                simplePoiInfoStruct.setPoiServiceFlags(eVar.f77549k);
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(eVar.f77546h);
            sb.append(']');
            sb.append(eVar.f77543e);
            simplePoiInfoStruct.setPoiName(sb.toString());
        } else {
            simplePoiInfoStruct = null;
        }
        mo56196a(-1, simplePoiInfoStruct);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0341  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56196a(int r14, com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r15) {
        /*
            r13 = this;
            if (r15 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 8
            r1 = 0
            if (r14 != 0) goto L_0x000e
            android.view.View r14 = r13.spaceView
            r14.setVisibility(r1)
            goto L_0x0013
        L_0x000e:
            android.view.View r14 = r13.spaceView
            r14.setVisibility(r0)
        L_0x0013:
            com.ss.android.ugc.aweme.base.model.UrlModel r14 = r15.getCover()
            if (r14 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.base.model.UrlModel r14 = r15.getCover()
            java.util.List r14 = r14.getUrlList()
            boolean r14 = com.bytedance.common.utility.p522b.C9376b.m18558a(r14)
            if (r14 == 0) goto L_0x0028
            goto L_0x0051
        L_0x0028:
            com.ss.android.ugc.aweme.base.model.UrlModel r14 = r15.getCover()
            com.ss.android.ugc.aweme.base.k r14 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r14)
            com.bytedance.lighten.a.t r14 = com.bytedance.lighten.p766a.C12203q.m24645a(r14)
            r2 = 288(0x120, float:4.04E-43)
            r3 = 192(0xc0, float:2.69E-43)
            com.bytedance.lighten.a.t r14 = r14.mo23111a(r2, r3)
            java.lang.String r2 = "PoiItemViewHolder"
            com.bytedance.lighten.a.t r14 = r14.mo23118a(r2)
            com.bytedance.lighten.loader.SmartImageView r2 = r13.mPoiImg
            com.bytedance.lighten.a.t r14 = r14.mo23116a(r2)
            r14.mo23121a()
            android.widget.ImageView r14 = r13.mPoiImgPlaceHolder
            r14.setVisibility(r0)
            goto L_0x005e
        L_0x0051:
            com.bytedance.lighten.loader.SmartImageView r14 = r13.mPoiImg
            r2 = 2131821826(0x7f110502, float:1.9276406E38)
            r14.setImageResource(r2)
            android.widget.ImageView r14 = r13.mPoiImgPlaceHolder
            r14.setVisibility(r1)
        L_0x005e:
            boolean r14 = r15.isPoiSpuOverDate()
            if (r14 == 0) goto L_0x007b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiSpuOverDate
            r14.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiSpuOverDate
            java.lang.String r2 = r15.getPoiSpuStatusDesc()
            r14.setText(r2)
            com.bytedance.lighten.loader.SmartImageView r14 = r13.mPoiImg
            r2 = 1051595899(0x3eae147b, float:0.34)
            r14.setAlpha(r2)
            goto L_0x0087
        L_0x007b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiSpuOverDate
            r14.setVisibility(r0)
            com.bytedance.lighten.loader.SmartImageView r14 = r13.mPoiImg
            r2 = 1065353216(0x3f800000, float:1.0)
            r14.setAlpha(r2)
        L_0x0087:
            java.lang.String r14 = r15.getPoiName()
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 != 0) goto L_0x00a0
            android.content.Context r2 = r13.f72886b
            java.util.List r3 = r15.getPositionInName()
            android.text.SpannableString r14 = com.p683ss.android.ugc.aweme.base.utils.C23710a.m58189a(r2, r14, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r13.mPoiName
            r2.setText(r14)
        L_0x00a0:
            java.lang.String r14 = r15.getPoiRankDesc()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x00ce
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiRankDesc
            r14.setVisibility(r0)
            java.lang.String r14 = r15.getOptionName()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x00c8
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiOption
            java.lang.String r2 = r15.getOptionName()
            r14.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiOption
            r14.setVisibility(r1)
            goto L_0x00e6
        L_0x00c8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiOption
            r14.setVisibility(r0)
            goto L_0x00e6
        L_0x00ce:
            android.view.View r14 = r13.mSecondCutLine
            r14.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiOption
            r14.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiRankDesc
            r14.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiRankDesc
            java.lang.String r2 = r15.getPoiRankDesc()
            r14.setText(r2)
        L_0x00e6:
            double r2 = r15.getCost()
            int r14 = (int) r2
            r2 = 1
            if (r14 != 0) goto L_0x00f4
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiPerPrice
            r14.setVisibility(r0)
            goto L_0x012b
        L_0x00f4:
            android.content.Context r3 = r13.f72886b
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2132547543(0x7f1c17d7, float:2.0748335E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r4[r1] = r14
            java.lang.String r14 = com.C2240a.m6772a(r3, r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mPoiPerPrice
            r3.setText(r14)
            r13.m66451a()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiOption
            int r14 = r14.getVisibility()
            if (r14 != 0) goto L_0x012b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiPerPrice
            int r14 = r14.getVisibility()
            if (r14 != 0) goto L_0x012b
            android.view.View r14 = r13.mSecondCutLine
            r14.setVisibility(r1)
            goto L_0x0130
        L_0x012b:
            android.view.View r14 = r13.mSecondCutLine
            r14.setVisibility(r0)
        L_0x0130:
            com.ss.android.ugc.aweme.poi.model.f r14 = r15.getPoiAddress()
            if (r14 == 0) goto L_0x0161
            com.ss.android.ugc.aweme.poi.model.f r14 = r15.getPoiAddress()
            boolean r14 = m66453a(r14)
            if (r14 != 0) goto L_0x0161
            java.lang.String r14 = r15.getCity()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x0151
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            r14.setVisibility(r0)
            goto L_0x01e6
        L_0x0151:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            java.lang.String r3 = r15.getCity()
            r14.setText(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            r14.setVisibility(r1)
            goto L_0x01e6
        L_0x0161:
            com.ss.android.ugc.aweme.poi.d r14 = r13.f72885a
            if (r14 == 0) goto L_0x01c8
            com.ss.android.ugc.aweme.poi.d r14 = r13.f72885a
            boolean r14 = r14.isValid()
            if (r14 == 0) goto L_0x01c8
            java.lang.String r14 = r15.getLatitude()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x01c8
            java.lang.String r14 = r15.getLongitude()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x0182
            goto L_0x01c8
        L_0x0182:
            com.ss.android.ugc.aweme.poi.d r14 = r13.f72885a
            double r5 = r14.latitude
            com.ss.android.ugc.aweme.poi.d r14 = r13.f72885a
            double r7 = r14.longitude
            java.lang.String r14 = r15.getLatitude()
            java.lang.Double r14 = java.lang.Double.valueOf(r14)
            double r3 = r14.doubleValue()
            java.lang.String r14 = r15.getLongitude()
            java.lang.Double r14 = java.lang.Double.valueOf(r14)
            double r9 = r14.doubleValue()
            com.ss.android.ugc.aweme.poi.service.IPoiService r14 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r14 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r14
            double[] r14 = r14.wgs84togcj02(r9, r3)
            r9 = r14[r2]
            r11 = r14[r1]
            com.ss.android.ugc.aweme.poi.service.IPoiService r14 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            r3 = r14
            com.ss.android.ugc.aweme.poi.service.IPoiService r3 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r3
            android.content.Context r4 = r13.f72886b
            java.lang.String r14 = r3.distanceStrMore(r4, r5, r7, r9, r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mPoiDistance
            r3.setText(r14)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            r14.setVisibility(r1)
            goto L_0x01e6
        L_0x01c8:
            java.lang.String r14 = r15.getCity()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x01d8
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            r14.setVisibility(r0)
            goto L_0x01e6
        L_0x01d8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            java.lang.String r3 = r15.getCity()
            r14.setText(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            r14.setVisibility(r1)
        L_0x01e6:
            java.lang.String r14 = r15.getBusinessAreaName()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0209
            android.content.Context r14 = r13.f72886b
            java.lang.String r3 = r15.getBusinessAreaName()
            java.util.List r4 = r15.getPositionInAddress()
            android.text.SpannableString r14 = com.p683ss.android.ugc.aweme.base.utils.C23710a.m58189a(r14, r3, r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mPoiType
            r3.setText(r14)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiType
            r14.setVisibility(r1)
            goto L_0x020e
        L_0x0209:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiType
            r14.setVisibility(r0)
        L_0x020e:
            java.lang.String r14 = r15.getPoiVoucher()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x023b
            com.ss.android.ugc.aweme.poi.service.IPoiService r14 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r14 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r14
            java.util.List r3 = r15.getVoucherReleaseAreas()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.feed.C30228f.m70982f()
            boolean r14 = r14.needShowCouponInfo(r3, r4)
            if (r14 == 0) goto L_0x023b
            android.view.ViewGroup r14 = r13.mPoiCouponContainer
            r14.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiCouponDesc
            java.lang.String r0 = r15.getPoiVoucher()
            r14.setText(r0)
            goto L_0x0240
        L_0x023b:
            android.view.ViewGroup r14 = r13.mPoiCouponContainer
            r14.setVisibility(r0)
        L_0x0240:
            boolean r14 = r15.isPoiSpuOverDate()
            if (r14 == 0) goto L_0x02b3
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiName
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131820588(0x7f11002c, float:1.9273895E38)
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiPerPrice
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiRankDesc
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiOption
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiType
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiCouponDesc
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            goto L_0x0322
        L_0x02b3:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiName
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131822059(0x7f1105eb, float:1.9276879E38)
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiPerPrice
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131822063(0x7f1105ef, float:1.9276887E38)
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiRankDesc
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiOption
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiType
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiDistance
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r13.mPoiCouponDesc
            android.content.Context r0 = r13.f72886b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
        L_0x0322:
            java.util.List r14 = r15.getPoiServiceFlags()
            boolean r14 = com.bytedance.common.utility.p522b.C9376b.m18558a(r14)
            if (r14 == 0) goto L_0x0341
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagGroup r14 = r13.mPoiNameWithServiceLayout
            int r14 = r14.getChildCount()
            if (r14 <= r2) goto L_0x0348
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagGroup r14 = r13.mPoiNameWithServiceLayout
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagGroup r15 = r13.mPoiNameWithServiceLayout
            int r15 = r15.getChildCount()
            int r15 = r15 - r2
            r14.removeViews(r2, r15)
            return
        L_0x0341:
            java.util.List r14 = r15.getPoiServiceFlags()
            r13.m66452a(r14)
        L_0x0348:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder.mo56196a(int, com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct):void");
    }
}
