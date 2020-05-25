package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.services.publish.CouponPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45088a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g */
public final class C45176g implements IAVPublishExtension<CouponPublishModel> {

    /* renamed from: b */
    public static final C45177a f114297b = new C45177a(null);

    /* renamed from: a */
    public CouponPublishSettingItem f114298a;

    /* renamed from: c */
    private ExtensionMisc f114299c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$a */
    public static final class C45177a {
        private C45177a() {
        }

        public /* synthetic */ C45177a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$b */
    static final class C45178b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f114300a;

        /* renamed from: b */
        final /* synthetic */ C45176g f114301b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f114302c;

        C45178b(C25626g gVar, C45176g gVar2, ExtensionMisc extensionMisc) {
            this.f114300a = gVar;
            this.f114301b = gVar2;
            this.f114302c = extensionMisc;
        }

        public final void onClick(View view) {
            Object obj;
            boolean z;
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("add_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47826a("business_type", this.f114300a.f67830a).f61491a);
            if (C45176g.m98662a(this.f114301b).f113683j) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f114302c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData != null) {
                    Integer source = anchorTransData.getSource();
                    if (source != null && source.intValue() == 999) {
                        C10691a.m21545b(C45176g.m98662a(this.f114301b).getContext(), C45176g.m98662a(this.f114301b).getContext().getString(R.string.dq_)).mo19066a();
                        return;
                    } else if (C36811b.m82845a(anchorTransData.getSource())) {
                        return;
                    }
                }
                C45176g gVar = this.f114301b;
                List b = AnchorListManager.f67772d.mo52758b();
                if (b != null) {
                    Iterator it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C25626g) obj).f67830a == C25600a.COUPON.getTYPE()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C25626g gVar2 = (C25626g) obj;
                    if (gVar2 != null) {
                        String str = gVar2.f67833d;
                        if (str != null) {
                            CouponPublishSettingItem couponPublishSettingItem = gVar.f114298a;
                            if (couponPublishSettingItem == null) {
                                C52711k.m112237a("delegate");
                            }
                            SmartRouter.buildRoute(couponPublishSettingItem.getContext(), str).withParam("need_bottom_out", true).withAnimation(R.anim.q, 0).open();
                        }
                    }
                }
            } else if (C52711k.m112239a((Object) (Boolean) this.f114302c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114302c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114302c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114302c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10691a.m21545b(C45176g.m98662a(this.f114301b).getContext(), C45176g.m98662a(this.f114301b).getContext().getString(R.string.dq_)).mo19066a();
            } else {
                C10691a.m21545b(C45176g.m98662a(this.f114301b).getContext(), C45176g.m98662a(this.f114301b).getContext().getString(R.string.aka, new Object[]{C45176g.m98662a(this.f114301b).getContext().getString(R.string.fwv)})).mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$c */
    static final class C45179c<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45176g f114303a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114304b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$c$a */
        static final class C45180a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45179c f114305a;

            C45180a(C45179c cVar) {
                this.f114305a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f114305a.f114303a.mo91476a(this.f114305a.f114304b);
                return C52860x.f131107a;
            }
        }

        C45179c(C45176g gVar, ExtensionMisc extensionMisc) {
            this.f114303a = gVar;
            this.f114304b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    C45176g.m98662a(this.f114303a).mo91047a();
                } else {
                    CouponPublishSettingItem a = C45176g.m98662a(this.f114303a);
                    UrlModel anchorIcon = anchorTransData.getAnchorIcon();
                    if (anchorIcon == null) {
                        anchorIcon = C45088a.m98613a(Integer.valueOf(anchorTransData.getBusinessType()));
                    }
                    UrlModel urlModel = anchorIcon;
                    String title = anchorTransData.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String str = title;
                    Integer source2 = anchorTransData.getSource();
                    if (source2 != null) {
                        i = source2.intValue();
                    } else {
                        i = 0;
                    }
                    String anchorTag = anchorTransData.getAnchorTag();
                    if (anchorTag == null) {
                        anchorTag = "";
                    }
                    a.mo91048a(urlModel, str, i, anchorTag, new C45180a(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$d */
    static final class C45181d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45176g f114306a;

        C45181d(C45176g gVar) {
            this.f114306a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45176g gVar = this.f114306a;
                C52711k.m112236a((Object) bool, "it");
                gVar.mo91477a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "CouponPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onCreateFinish() {
        DefaultImpls.onCreateFinish(this);
    }

    public final void onDestroy() {
        C47718bf.m103291d(this);
    }

    public final void onPublish(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
    }

    public final /* synthetic */ Object provideExtensionData() {
        return new CouponPublishModel();
    }

    public final void onEnterChildrenMode() {
        CouponPublishSettingItem couponPublishSettingItem = this.f114298a;
        if (couponPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        couponPublishSettingItem.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98663a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f114299c
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            com.ss.android.ugc.aweme.port.in.bc$a r0 = r0.getPublishExtensionDataContainer()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.mo78634c()
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            com.ss.android.ugc.aweme.commercialize.model.ad r0 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r0)
            java.lang.String r1 = "PublishExtensionModel\n  …                        )"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo r0 = r0.f68924f
            r1 = 0
            if (r0 == 0) goto L_0x0024
            return r1
        L_0x0024:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f67772d
            java.util.List r0 = r0.mo52758b()
            if (r0 == 0) goto L_0x0068
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L_0x0067
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0042
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0063
        L_0x0042:
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.commercialize.anchor.g r2 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r2
            int r2 = r2.f67830a
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.COUPON
            int r4 = r4.getTYPE()
            if (r2 != r4) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0067
            return r3
        L_0x0067:
            return r1
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45176g.m98663a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ CouponPublishSettingItem m98662a(C45176g gVar) {
        CouponPublishSettingItem couponPublishSettingItem = gVar.f114298a;
        if (couponPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        return couponPublishSettingItem;
    }

    /* renamed from: b */
    private final void m98664b(ExtensionMisc extensionMisc) {
        C39592a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            C26109ad a = C26109ad.m63393a(publishExtensionDataContainer.mo78634c());
            a.f68926h = C25600a.NO_TYPE.getTYPE();
            a.f68927i = "";
            a.f68928j = "";
            a.f68938t = "";
            a.f68939u = "";
            a.f68940v = "";
            publishExtensionDataContainer.mo78632a(C26109ad.m63394a(a));
        }
        CouponPublishSettingItem couponPublishSettingItem = this.f114298a;
        if (couponPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        couponPublishSettingItem.mo91047a();
    }

    /* renamed from: a */
    public final void mo91476a(ExtensionMisc extensionMisc) {
        m98664b(extensionMisc);
        mo91477a(true);
        extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
    }

    /* renamed from: a */
    public final void mo91477a(boolean z) {
        if (z) {
            CouponPublishSettingItem couponPublishSettingItem = this.f114298a;
            if (couponPublishSettingItem == null) {
                C52711k.m112237a("delegate");
            }
            couponPublishSettingItem.setAlpha(1.0f);
            CouponPublishSettingItem couponPublishSettingItem2 = this.f114298a;
            if (couponPublishSettingItem2 == null) {
                C52711k.m112237a("delegate");
            }
            couponPublishSettingItem2.setEnable(true);
            CouponPublishSettingItem couponPublishSettingItem3 = this.f114298a;
            if (couponPublishSettingItem3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = couponPublishSettingItem3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        CouponPublishSettingItem couponPublishSettingItem4 = this.f114298a;
        if (couponPublishSettingItem4 == null) {
            C52711k.m112237a("delegate");
        }
        couponPublishSettingItem4.setAlpha(0.5f);
        CouponPublishSettingItem couponPublishSettingItem5 = this.f114298a;
        if (couponPublishSettingItem5 == null) {
            C52711k.m112237a("delegate");
        }
        couponPublishSettingItem5.setEnable(false);
        CouponPublishSettingItem couponPublishSettingItem6 = this.f114298a;
        if (couponPublishSettingItem6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = couponPublishSettingItem6.getLeftDrawableView();
        C52711k.m112236a((Object) leftDrawableView2, "delegate.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r15 == null) goto L_0x0083;
     */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAsyncCouponInfoEvent(com.p683ss.android.ugc.aweme.p1706fe.method.C29906l r15) {
        /*
            r14 = this;
            java.lang.String r0 = "broadCastEvent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r0)
            org.json.JSONObject r0 = r15.f78045b
            if (r0 == 0) goto L_0x0098
            org.json.JSONObject r1 = r15.f78045b
            java.lang.String r2 = "eventName"
            java.lang.String r1 = r1.optString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "pick_coupon_anchor_content"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x002a
            org.json.JSONObject r1 = r15.f78045b
            java.lang.String r3 = "data"
            boolean r1 = r1.has(r3)
            if (r1 == 0) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            r3 = 0
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            if (r0 == 0) goto L_0x0098
            org.json.JSONObject r15 = r15.f78045b
            java.lang.String r0 = "data"
            org.json.JSONObject r15 = r15.optJSONObject(r0)
            java.lang.String r0 = "anchor_content"
            org.json.JSONObject r15 = r15.optJSONObject(r0)
            if (r15 == 0) goto L_0x0048
            java.lang.String r0 = "title"
            java.lang.String r3 = r15.optString(r0)
        L_0x0048:
            r7 = r3
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r15 = r14.f114299c
            if (r15 != 0) goto L_0x005b
            java.lang.String r0 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x005b:
            r14.mo91476a(r15)
            goto L_0x0098
        L_0x005f:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r14.f114299c
            if (r0 != 0) goto L_0x0068
            java.lang.String r1 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0068:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
            android.arch.lifecycle.r r0 = r0.getUpdateAnchor()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r1 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
            com.ss.android.ugc.aweme.commercialize.anchor.a r3 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.COUPON
            int r5 = r3.getTYPE()
            if (r15 == 0) goto L_0x0083
            java.lang.String r15 = r15.toString()
            if (r15 != 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r6 = r15
            goto L_0x0086
        L_0x0083:
            java.lang.String r15 = ""
            goto L_0x0081
        L_0x0086:
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r10 = 0
            r11 = 0
            r12 = 104(0x68, float:1.46E-43)
            r13 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.setValue(r1)
            return
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45176g.onAsyncCouponInfoEvent(com.ss.android.ugc.aweme.fe.method.l):void");
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        Object obj;
        boolean z;
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(linearLayout, "extensionWidgetContainer");
        C52711k.m112240b(aVPublishContentType, "contentType");
        C52711k.m112240b(publishOutput, "publishOutput");
        C52711k.m112240b(extensionMisc, "extensionMisc");
        C52711k.m112240b(callback, "callback");
        C47718bf.m103290c(this);
        this.f114299c = extensionMisc;
        Context context = linearLayout.getContext();
        C52711k.m112236a((Object) context, "container.context");
        CouponPublishSettingItem couponPublishSettingItem = new CouponPublishSettingItem(context, null);
        linearLayout.addView(couponPublishSettingItem, new LayoutParams(-1, (int) C20141b.m49696a(linearLayout.getContext(), 52.0f)));
        couponPublishSettingItem.setGravity(16);
        couponPublishSettingItem.setOrientation(0);
        int i = 8;
        couponPublishSettingItem.setVisibility(8);
        this.f114298a = couponPublishSettingItem;
        CouponPublishSettingItem couponPublishSettingItem2 = this.f114298a;
        if (couponPublishSettingItem2 == null) {
            C52711k.m112237a("delegate");
        }
        if (m98663a()) {
            i = 0;
        }
        couponPublishSettingItem2.setVisibility(i);
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar, new C45179c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar, new C45181d(this));
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.COUPON.getTYPE()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C25626g gVar = (C25626g) obj;
            if (gVar != null) {
                CouponPublishSettingItem couponPublishSettingItem3 = this.f114298a;
                if (couponPublishSettingItem3 == null) {
                    C52711k.m112237a("delegate");
                }
                couponPublishSettingItem3.setOnClickListener(new C45178b(gVar, this, extensionMisc));
            }
        }
    }
}
