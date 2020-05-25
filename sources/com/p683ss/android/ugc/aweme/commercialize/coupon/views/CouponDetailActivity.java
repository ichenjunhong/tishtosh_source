package com.p683ss.android.ugc.aweme.commercialize.coupon.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25686a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25675a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25677b;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25681e;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25682f;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25683g;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25685h;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity */
public class CouponDetailActivity extends AmeSSActivity implements C25681e, C25682f {

    /* renamed from: a */
    private C25677b f67964a;
    AvatarImageView avatarImageView;

    /* renamed from: b */
    private C25685h f67965b;

    /* renamed from: c */
    private C25687b f67966c;
    View couponDivideView;
    LinearLayout couponListBt;
    View couponNumberFL;
    TextView couponNumberTitleTv;
    TextView couponNumberTv;
    DmtTextView couponRate;
    TextView couponStatusTv;
    DmtTextView couponUseBt;

    /* renamed from: d */
    private int f67967d;

    /* renamed from: e */
    private String f67968e = "";

    /* renamed from: f */
    private String f67969f = "";

    /* renamed from: g */
    private String f67970g = "";

    /* renamed from: h */
    private boolean f67971h;
    RemoteImageView headImageIv;
    ImageView headImageIvBg;

    /* renamed from: i */
    private int f67972i;

    /* renamed from: j */
    private boolean f67973j;

    /* renamed from: k */
    private String f67974k = "";

    /* renamed from: l */
    private boolean f67975l;
    RemoteImageView mBRCodeIV;
    View mCloseBtn;
    View mDragLayout;
    DmtTextView mMerchantDetail;
    ViewGroup mOutBox;
    RemoteImageView mQRCodeIV;
    DmtStatusView mStatusView;
    View merchantContact;
    View merchantDetail;
    View merchantMoreBtn;
    TextView merchantNameTv;
    View merchantPoiList;
    View merchantPosition;
    TextView titleView;
    TextView validEndTimeTv;

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a0_).init();
    }

    public void onDestroy() {
        C47718bf.m103291d(this);
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        if (this.f67975l) {
            PoiServiceImpl.createIPoiServicebyMonsterPlugin().releaseLive();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f67975l) {
            PoiServiceImpl.createIPoiServicebyMonsterPlugin().pauseLive();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f67975l) {
            PoiServiceImpl.createIPoiServicebyMonsterPlugin().resumeLive();
        }
    }

    public void finish() {
        if (this.f67973j && this.f67972i != -1) {
            Intent intent = new Intent();
            intent.putExtra("coupon_list_position", this.f67972i);
            intent.putExtra("coupon_info", this.f67966c);
            setResult(-1, intent);
        }
        super.finish();
    }

    /* renamed from: c */
    private void m62247c() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "coupon_detail");
        hashMap.put("previous_page", this.f67970g);
        hashMap.put("coupon_code", this.f67966c.getCodeId());
        hashMap.put("poi_id", this.f67966c.validPoiId);
        PoiServiceImpl.createIPoiServicebyMonsterPlugin().showPoiRateDialog(this, this.f67966c.validPoiId, this.f67966c.validPoiName, this.f67966c.getCodeId(), Integer.valueOf(this.f67966c.objectType), "", String.valueOf(this.f67966c.getCouponId()), hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo52894a() {
        if (this.f67967d == 0 || TextUtils.isEmpty(this.f67968e)) {
            if (isViewValid()) {
                this.mStatusView.mo19214h();
            }
            return;
        }
        this.f67964a.mo52826a(this.f67967d, this.f67968e);
    }

    /* renamed from: b */
    private void m62245b() {
        if (this.f67966c.getStatus() == C25686a.StatusValid.value) {
            this.couponStatusTv.setVisibility(8);
            if (this.mQRCodeIV.getVisibility() == 0) {
                this.mQRCodeIV.setImageAlpha(NormalGiftView.ALPHA_255);
            }
            if (this.mBRCodeIV.getVisibility() == 0) {
                this.mBRCodeIV.setImageAlpha(NormalGiftView.ALPHA_255);
            }
        } else {
            this.couponStatusTv.setText(C25668a.m62225a(this, this.f67966c.getStatus(), false));
            this.couponStatusTv.setVisibility(0);
            this.couponNumberTv.setTextColor(getResources().getColor(R.color.k5));
            if (this.mBRCodeIV.getVisibility() == 0) {
                this.mBRCodeIV.setImageAlpha(87);
                LayoutParams layoutParams = (LayoutParams) this.mBRCodeIV.getLayoutParams();
                layoutParams.topMargin = C23728o.m58241a(12.0d);
                this.mBRCodeIV.setLayoutParams(layoutParams);
            }
            if (this.mQRCodeIV.getVisibility() == 0) {
                this.mQRCodeIV.setImageAlpha(87);
                if (this.mBRCodeIV.getVisibility() == 8) {
                    LayoutParams layoutParams2 = (LayoutParams) this.mQRCodeIV.getLayoutParams();
                    layoutParams2.topMargin = C23728o.m58241a(8.0d);
                    this.mQRCodeIV.setLayoutParams(layoutParams2);
                }
            }
            if (m62244a(this.f67966c)) {
                this.couponUseBt.setClickable(false);
                this.couponUseBt.setBackgroundResource(R.drawable.wo);
                LayoutParams layoutParams3 = (LayoutParams) this.couponNumberFL.getLayoutParams();
                layoutParams3.topMargin = C23728o.m58241a(4.0d);
                this.couponNumberFL.setLayoutParams(layoutParams3);
            }
        }
    }

    /* renamed from: a */
    private static boolean m62244a(C25687b bVar) {
        if (bVar.getCouponType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo52830a(User user) {
        IIMService a = C33194e.m76277a(false);
        if (C33194e.m76264a() && a != null) {
            a.startChat((Context) this, C33194e.m76261a(user));
        }
    }

    /* renamed from: a */
    private static String m62243a(String str) {
        char[] charArray;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : str.toCharArray()) {
            if (i % 4 == 0) {
                sb.append(" ");
            }
            sb.append(c);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: b */
    private void m62246b(String str) {
        C26890h.m65011a("click_coupon_link", C23089d.m56640a().mo47829a("enter_from", "coupon_detail").mo47829a("previous_page", "coupon_detail").mo47829a("destination", str).mo47829a("source_type", C25668a.m62226a(this.f67966c)).f61491a);
    }

    @C53771m
    public void onEvent(C50823c cVar) {
        Object obj = cVar.f127698c;
        if (obj != null && (obj instanceof CouponMessage)) {
            CouponMessage couponMessage = (CouponMessage) obj;
            if (couponMessage != null && couponMessage.msgType == 1 && TextUtils.equals(this.f67966c.getCodeId(), couponMessage.codeId)) {
                this.f67973j = true;
                this.f67966c.setStatus(C25686a.StatusRedeemed.value);
                m62245b();
            }
        }
    }

    /* renamed from: a */
    public final void mo52829a(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo19214h();
        }
    }

    public void onClick(View view) {
        if (this.f67966c != null) {
            String valueOf = String.valueOf(this.f67966c.getUserId());
            int id = view.getId();
            if (id == R.id.im) {
                finish();
            } else if (id == R.id.aw2) {
                UserProfileActivity.m89408a((Context) this, valueOf, this.f67966c.getSecUid(), "coupon");
                m62246b("others_homepage");
            } else if (id == R.id.aw0) {
                this.f67965b.mo52833a(valueOf);
                m62246b("message");
            } else if (id == R.id.aw1) {
                m62246b("coupon_desc");
                C26540w.m64223a((Context) this, this.f67966c.getDetailUrl(), "", true, null);
            } else if (id == R.id.aw3) {
                if (!C9376b.m18558a((Collection<T>) this.f67966c.getPoiList())) {
                    m62246b("coupon_restaurant");
                    if (this.f67966c.getPoiList().size() == 1) {
                        SmartRouter.buildRoute((Context) this, "//poi/detail").withParam("poi_bundle", (Serializable) new C39129m().mo79718a((String) this.f67966c.getPoiList().get(0)).mo79729k("click_coupon_restaurant").mo79726h("coupon_detail").mo79713a()).open();
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("poi_coupon_id", this.f67967d);
                    bundle.putString("poi_coupon_code_id", this.f67968e);
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().openPoiCouponScopeActivity(this, bundle);
                }
            } else if (id == R.id.a20) {
                m62246b("use_now_h5");
                C26540w.m64223a((Context) this, this.f67966c.getUsePageLink(), getString(R.string.ak2), true, null);
            } else if (id == R.id.aw4) {
                m62246b("store_h5");
                C26540w.m64223a((Context) this, this.f67966c.getStorePageLink(), "", true, null);
            } else if (id == R.id.a1w && this.f67966c != null) {
                m62247c();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ay);
        ButterKnife.bind((Activity) this);
        C10722c a = C48190g.m104428a(this, new C25704b(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        this.mStatusView.setBuilder(C10719a.m21676a((Context) this).mo19224a((int) R.string.bx4).mo19234c((View) dmtDefaultView));
        this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.mh));
        ((C13833a) this.headImageIv.getHierarchy()).mo25899a(C13837e.m28114b((float) C23728o.m58241a(8.0d), (float) C23728o.m58241a(8.0d), 0.0f, 0.0f));
        C47795d.m103429a(this.merchantPoiList);
        C47795d.m103429a(this.merchantContact);
        C47795d.m103429a(this.merchantDetail);
        C47795d.m103429a(this.merchantMoreBtn);
        this.f67964a = new C25677b(new C25675a(), this);
        this.f67965b = new C25685h(new C25683g(), this);
        try {
            this.f67967d = Integer.parseInt(getIntent().getStringExtra("coupon_id"));
        } catch (Exception unused) {
        }
        this.f67968e = getIntent().getStringExtra("code_id");
        if (!this.mStatusView.f28645b) {
            this.mStatusView.mo19212f();
        }
        this.f67969f = getIntent().getStringExtra("enter_from");
        this.f67970g = getIntent().getStringExtra("previous_page");
        this.f67972i = getIntent().getIntExtra("coupon_list_position", -1);
        this.f67974k = getIntent().getStringExtra("auto_rate");
        this.f67975l = getIntent().getBooleanExtra("from_live", false);
        mo52894a();
        C47718bf.m103290c(this);
        if (this.f67975l) {
            PoiServiceImpl.createIPoiServicebyMonsterPlugin().bindLive(this, this.mOutBox, this.mDragLayout, this.mCloseBtn);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x0237  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52828a(com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25688c r12) {
        /*
            r11 = this;
            boolean r0 = r11.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r11.mStatusView
            r1 = 1
            r0.mo19208c(r1)
            if (r12 != 0) goto L_0x0019
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r12 = r11.mStatusView
            r12.mo19214h()
            r12 = 0
            r11.f67966c = r12
            goto L_0x023a
        L_0x0019:
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r12 = r12.f67956a
            r11.f67966c = r12
            if (r12 != 0) goto L_0x0026
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r12 = r11.mStatusView
            r12.mo19214h()
            goto L_0x023a
        L_0x0026:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.headImageIv
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r12.getHeadImageUrl()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r2)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r11.avatarImageView
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r12.getLogoImageUrl()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r2)
            boolean r0 = r12.isDefaultHeadImage()
            r2 = 0
            r3 = 8
            if (r0 == 0) goto L_0x0047
            android.widget.ImageView r0 = r11.headImageIvBg
            r0.setVisibility(r3)
            goto L_0x004c
        L_0x0047:
            android.widget.ImageView r0 = r11.headImageIvBg
            r0.setVisibility(r2)
        L_0x004c:
            android.widget.TextView r0 = r11.titleView
            java.lang.String r4 = r12.getTitle()
            r0.setText(r4)
            android.widget.TextView r0 = r11.merchantNameTv
            java.lang.String r4 = r12.getMerchantName()
            r0.setText(r4)
            android.widget.TextView r0 = r11.validEndTimeTv
            android.content.res.Resources r4 = r11.getResources()
            r5 = 2132543492(0x7f1c0804, float:2.0740119E38)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = r12.getValidEnd()
            r6[r2] = r7
            java.lang.String r4 = r4.getString(r5, r6)
            r0.setText(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.mMerchantDetail
            int r4 = r12.getPayType()
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.commercialize.coupon.model.e[] r6 = com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25690e.values()
            int r7 = r6.length
            r8 = 0
        L_0x0084:
            if (r8 >= r7) goto L_0x0092
            r9 = r6[r8]
            int r10 = r9.getValue()
            if (r10 != r4) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            int r8 = r8 + 1
            goto L_0x0084
        L_0x0092:
            com.ss.android.ugc.aweme.commercialize.coupon.model.e r9 = com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25690e.FREE_COUPON
        L_0x0094:
            int[] r4 = com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a.C256691.f67888b
            int r6 = r9.ordinal()
            r4 = r4[r6]
            switch(r4) {
                case 1: goto L_0x00ac;
                case 2: goto L_0x00a0;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x00b7
        L_0x00a0:
            android.content.res.Resources r4 = r11.getResources()
            r5 = 2132543478(0x7f1c07f6, float:2.074009E38)
            java.lang.String r5 = r4.getString(r5)
            goto L_0x00b7
        L_0x00ac:
            android.content.res.Resources r4 = r11.getResources()
            r5 = 2132543466(0x7f1c07ea, float:2.0740066E38)
            java.lang.String r5 = r4.getString(r5)
        L_0x00b7:
            r0.setText(r5)
            android.view.View r0 = r11.merchantPosition
            java.lang.String r4 = r12.getStorePageLink()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 8
            goto L_0x00ca
        L_0x00c9:
            r4 = 0
        L_0x00ca:
            r0.setVisibility(r4)
            boolean r0 = r12.canCouponRate()
            if (r0 == 0) goto L_0x00d9
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.couponRate
            r0.setVisibility(r2)
            goto L_0x00de
        L_0x00d9:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.couponRate
            r0.setVisibility(r3)
        L_0x00de:
            boolean r0 = m62244a(r12)
            r4 = 4625196817309499392(0x4030000000000000, double:16.0)
            if (r0 == 0) goto L_0x0134
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mBRCodeIV
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mQRCodeIV
            r0.setVisibility(r3)
            int r0 = r12.getStatus()
            com.ss.android.ugc.aweme.commercialize.coupon.model.a r6 = com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25686a.StatusRedeemed
            int r6 = r6.value
            if (r0 != r6) goto L_0x0100
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.couponUseBt
            r0.setVisibility(r3)
            goto L_0x0105
        L_0x0100:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.couponUseBt
            r0.setVisibility(r2)
        L_0x0105:
            android.view.View r0 = r11.couponDivideView
            r0.setVisibility(r3)
            android.view.View r0 = r11.couponNumberFL
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r6 = 2131886346(0x7f12010a, float:1.9407268E38)
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23729p.m58247a(r11, r6)
            r0.topMargin = r6
            android.view.View r6 = r11.couponNumberFL
            r6.setLayoutParams(r0)
            android.widget.LinearLayout r0 = r11.couponListBt
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r4 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            r0.topMargin = r4
            android.widget.LinearLayout r4 = r11.couponListBt
            r4.setLayoutParams(r0)
            goto L_0x0188
        L_0x0134:
            java.lang.String r0 = r12.getCodabarImageUrl()
            if (r0 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mBRCodeIV
            r0.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mBRCodeIV
            java.lang.String r6 = r12.getCodabarImageUrl()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r6)
        L_0x0148:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r12.getQrCodeUrl()
            if (r0 == 0) goto L_0x0188
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mQRCodeIV
            r0.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mBRCodeIV
            int r0 = r0.getVisibility()
            if (r0 != r3) goto L_0x017f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mQRCodeIV
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r6 = 4641944578423783424(0x406b800000000000, double:220.0)
            int r8 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r6)
            r0.width = r8
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r6)
            r0.height = r6
            int r4 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            r0.topMargin = r4
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r11.mQRCodeIV
            r4.setLayoutParams(r0)
        L_0x017f:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r11.mQRCodeIV
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r12.getQrCodeUrl()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r4)
        L_0x0188:
            int r0 = r12.getCouponSource()
            if (r0 != 0) goto L_0x0190
            r0 = 1
            goto L_0x0191
        L_0x0190:
            r0 = 0
        L_0x0191:
            if (r0 == 0) goto L_0x01b1
            android.view.View r0 = r11.merchantMoreBtn
            r0.setVisibility(r2)
            android.view.View r0 = r11.merchantPoiList
            java.util.List r4 = r12.getPoiList()
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r4 == 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r3 = 0
        L_0x01a6:
            r0.setVisibility(r3)
            android.view.View r0 = r11.merchantContact
            r0.setVisibility(r2)
            android.view.View r0 = r11.merchantDetail
            goto L_0x021a
        L_0x01b1:
            int r0 = r12.getCouponSource()
            if (r0 != r1) goto L_0x01bf
            int r0 = r12.getCouponType()
            if (r0 != 0) goto L_0x01bf
            r0 = 1
            goto L_0x01c0
        L_0x01bf:
            r0 = 0
        L_0x01c0:
            if (r0 == 0) goto L_0x01ec
            android.view.View r0 = r11.merchantMoreBtn
            r0.setVisibility(r3)
            android.view.View r0 = r11.merchantPoiList
            r0.setVisibility(r3)
            android.view.View r0 = r11.merchantContact
            r0.setVisibility(r3)
            android.view.View r0 = r11.merchantDetail
            java.lang.String r4 = r12.getDetailUrl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01df
            r2 = 8
        L_0x01df:
            r0.setVisibility(r2)
            android.widget.TextView r0 = r11.couponNumberTv
            java.lang.String r12 = r12.getCode()
            r0.setText(r12)
            goto L_0x022a
        L_0x01ec:
            int r0 = r12.getCouponSource()
            if (r0 != r1) goto L_0x01fa
            int r0 = r12.getCouponType()
            if (r0 != r1) goto L_0x01fa
            r0 = 1
            goto L_0x01fb
        L_0x01fa:
            r0 = 0
        L_0x01fb:
            if (r0 == 0) goto L_0x022a
            android.view.View r0 = r11.merchantMoreBtn
            r0.setVisibility(r3)
            android.view.View r0 = r11.merchantPoiList
            r0.setVisibility(r3)
            android.view.View r0 = r11.merchantContact
            r0.setVisibility(r3)
            android.view.View r0 = r11.merchantDetail
            java.lang.String r4 = r12.getDetailUrl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x021a
            r2 = 8
        L_0x021a:
            r0.setVisibility(r2)
            android.widget.TextView r0 = r11.couponNumberTv
            java.lang.String r12 = r12.getCode()
            java.lang.String r12 = m62243a(r12)
            r0.setText(r12)
        L_0x022a:
            r11.m62245b()
            java.lang.String r12 = r11.f67974k
            java.lang.String r0 = "1"
            boolean r12 = android.text.TextUtils.equals(r12, r0)
            if (r12 == 0) goto L_0x023a
            r11.m62247c()
        L_0x023a:
            boolean r12 = r11.f67971h
            if (r12 != 0) goto L_0x0295
            java.lang.String r12 = r11.f67969f
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0295
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r12 = r11.f67966c
            if (r12 == 0) goto L_0x0295
            java.lang.String r12 = "click_coupon"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r11.f67969f
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = r11.f67969f
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.lang.String r2 = "coupon_id"
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r3 = r11.f67966c
            int r3 = r3.getCouponId()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r2, r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "click_message"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.lang.String r2 = "coupon_type"
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r3 = r11.f67966c
            int r3 = r3.getStatus()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a.m62225a(r11, r3, r1)
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r1)
            java.lang.String r1 = "source_type"
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r2 = r11.f67966c
            java.lang.String r2 = com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a.m62226a(r2)
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r12, r0)
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity.mo52828a(com.ss.android.ugc.aweme.commercialize.coupon.model.c):void");
    }
}
