package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.p1534a.C25540a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.BusinessGoodsPublishSettingItem.C44900a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45455t;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l */
public final class C45192l implements IAVPublishExtension<GoodsPublishModel> {

    /* renamed from: a */
    public BusinessGoodsPublishSettingItem f114334a;

    /* renamed from: b */
    BusinessGoodsPublishModel f114335b;

    /* renamed from: c */
    public ExtensionDataRepo f114336c;

    /* renamed from: d */
    public ExtensionMisc f114337d;

    /* renamed from: e */
    private AVPublishContentType f114338e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$a */
    static final class C45193a extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45192l f114339a;

        C45193a(C45192l lVar) {
            this.f114339a = lVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f114339a.mo91487a(BusinessGoodsPublishModel.toObj((String) obj));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$b */
    static final class C45194b implements C44900a {

        /* renamed from: a */
        final /* synthetic */ C45192l f114340a;

        C45194b(C45192l lVar) {
            this.f114340a = lVar;
        }

        /* renamed from: a */
        public final void mo91046a(boolean z) {
            C45192l.m98679a(this.f114340a).getLocationState().setValue(Boolean.valueOf(!z));
            C45192l.m98679a(this.f114340a).getLinkState().setValue(Boolean.valueOf(!z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$c */
    static final class C45195c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45192l f114341a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114342b;

        /* renamed from: c */
        final /* synthetic */ Fragment f114343c;

        C45195c(C45192l lVar, ExtensionMisc extensionMisc, Fragment fragment) {
            this.f114341a = lVar;
            this.f114342b = extensionMisc;
            this.f114343c = fragment;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            String str2 = null;
            if (!this.f114341a.mo91486a().f113683j) {
                if (C52711k.m112239a((Object) (Boolean) this.f114342b.getExtensionDataRepo().isPoiAdd().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context = this.f114343c.getContext();
                    Context context2 = this.f114343c.getContext();
                    if (context2 != null) {
                        str = context2.getString(R.string.aaq);
                    } else {
                        str = null;
                    }
                    C9432q.m18676a(context, str);
                }
                if (C52711k.m112239a((Object) (Boolean) this.f114342b.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114342b.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114342b.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context3 = this.f114343c.getContext();
                    Context context4 = this.f114343c.getContext();
                    if (context4 != null) {
                        str2 = context4.getString(R.string.dq_);
                    }
                    C9432q.m18676a(context3, str2);
                }
                return;
            }
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            if (TextUtils.isEmpty(curUser.getBindPhone())) {
                C20854a.m53165e().bindMobile(this.f114343c.getActivity(), "", null, null);
                return;
            }
            C25539a.m62079a().tryCheckRealName(this.f114343c.getActivity(), "video_post_page", "click_add_product", new C25540a(this) {

                /* renamed from: a */
                final /* synthetic */ C45195c f114344a;

                {
                    this.f114344a = r1;
                }
            });
            this.f114341a.mo91486a().mo91092a(false);
            SharePrefCache.inst().setShowAddBusinessGoodsDot(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$d */
    static final class C45197d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45192l f114345a;

        C45197d(C45192l lVar) {
            this.f114345a = lVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45192l lVar = this.f114345a;
                C52711k.m112236a((Object) bool, "it");
                lVar.mo91488a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$e */
    static final class C45198e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45192l f114346a;

        C45198e(C45192l lVar) {
            this.f114346a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f114346a.mo91489b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$f */
    public static final class C45199f implements GoodsPublishModel {

        /* renamed from: a */
        final /* synthetic */ C45192l f114347a;

        public final String getGoodsDraftId() {
            boolean z;
            if (this.f114347a.f114335b != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            BusinessGoodsPublishModel businessGoodsPublishModel = this.f114347a.f114335b;
            if (businessGoodsPublishModel != null) {
                return businessGoodsPublishModel.draftId;
            }
            return null;
        }

        C45199f(C45192l lVar) {
            this.f114347a = lVar;
        }
    }

    public final String getName() {
        return "GoodsPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
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

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
    }

    public final /* synthetic */ Object provideExtensionData() {
        return new C45199f(this);
    }

    public final void onEnterChildrenMode() {
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f114334a;
        if (businessGoodsPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        businessGoodsPublishSettingItem.setVisibility(8);
    }

    /* renamed from: a */
    public final BusinessGoodsPublishSettingItem mo91486a() {
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f114334a;
        if (businessGoodsPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        return businessGoodsPublishSettingItem;
    }

    /* renamed from: b */
    public final void mo91489b() {
        String str;
        BusinessGoodsPublishModel businessGoodsPublishModel = this.f114335b;
        if (businessGoodsPublishModel != null) {
            str = businessGoodsPublishModel.videoPath;
        } else {
            str = null;
        }
        C45455t.m99052a(str);
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f114334a;
        if (businessGoodsPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        businessGoodsPublishSettingItem.setBusinessGoodsInfo(new BusinessGoodsPublishModel("", ""));
        ExtensionDataRepo extensionDataRepo = this.f114336c;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        C0198r isGoodsAdd = extensionDataRepo.isGoodsAdd();
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem2 = this.f114334a;
        if (businessGoodsPublishSettingItem2 == null) {
            C52711k.m112237a("delegate");
        }
        isGoodsAdd.setValue(Boolean.valueOf(businessGoodsPublishSettingItem2.f113630a));
        this.f114335b = null;
        mo91488a(true);
    }

    /* renamed from: c */
    private final boolean m98681c() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        ExtensionMisc extensionMisc = this.f114337d;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        C39592a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo78634c();
        } else {
            str = null;
        }
        C26109ad a = C26109ad.m63393a(str);
        C52711k.m112236a((Object) a, "PublishExtensionModel\n  …                        )");
        if (a.f68924f != null) {
            return false;
        }
        AVPublishContentType aVPublishContentType = this.f114338e;
        if (aVPublishContentType == null) {
            C52711k.m112237a("contentType");
        }
        if (C52711k.m112239a((Object) aVPublishContentType.getContentType(), (Object) AVPublishContentType.Photo.getContentType())) {
            List b = AnchorListManager.f67772d.mo52758b();
            if (b == null) {
                return false;
            }
            Iterable<C25626g> iterable = b;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (C25626g gVar : iterable) {
                if (gVar.f67830a == C25600a.SHOP.getTYPE()) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    return true;
                }
            }
            return false;
        }
        List b2 = AnchorListManager.f67772d.mo52758b();
        if (b2 != null && b2.size() == 1) {
            Iterable iterable2 = b2;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C25626g) it.next()).f67830a == C25600a.SHOP.getTYPE()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final /* synthetic */ ExtensionDataRepo m98679a(C45192l lVar) {
        ExtensionDataRepo extensionDataRepo = lVar.f114336c;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    /* renamed from: a */
    private final void m98680a(String str) {
        BusinessGoodsPublishModel businessGoodsPublishModel = this.f114335b;
        if (businessGoodsPublishModel != null) {
            businessGoodsPublishModel.videoPath = str;
            C45455t.m99050a(businessGoodsPublishModel);
        }
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
        ExtensionDataRepo extensionDataRepo = this.f114336c;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        if (C52711k.m112239a((Object) (Boolean) extensionDataRepo.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(false))) {
            m98680a(publishOutput.getCreationId());
        }
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
        ExtensionDataRepo extensionDataRepo = this.f114336c;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        if (C52711k.m112239a((Object) (Boolean) extensionDataRepo.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(false))) {
            m98680a(publishOutput.getCreationId());
        }
    }

    /* renamed from: a */
    public final void mo91488a(boolean z) {
        if (z) {
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f114334a;
            if (businessGoodsPublishSettingItem == null) {
                C52711k.m112237a("delegate");
            }
            businessGoodsPublishSettingItem.setAlpha(1.0f);
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem2 = this.f114334a;
            if (businessGoodsPublishSettingItem2 == null) {
                C52711k.m112237a("delegate");
            }
            businessGoodsPublishSettingItem2.setEnable(true);
            return;
        }
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem3 = this.f114334a;
        if (businessGoodsPublishSettingItem3 == null) {
            C52711k.m112237a("delegate");
        }
        businessGoodsPublishSettingItem3.setAlpha(0.5f);
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem4 = this.f114334a;
        if (businessGoodsPublishSettingItem4 == null) {
            C52711k.m112237a("delegate");
        }
        businessGoodsPublishSettingItem4.setEnable(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r4 != null) goto L_0x0048;
     */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAsyncGoodsInfoEvent(com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b r4) {
        /*
            r3 = this;
            boolean r0 = r3.m98681c()
            if (r0 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r4 = r4.f67806a
            if (r4 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel r0 = new com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel     // Catch:{ Exception -> 0x0043 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = r4.getAnchorContent()     // Catch:{ Exception -> 0x0043 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "shop_draft_id"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = r4.getTitle()     // Catch:{ Exception -> 0x0043 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0043 }
            r3.f114335b = r0     // Catch:{ Exception -> 0x0043 }
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r0 = r3.f114334a     // Catch:{ Exception -> 0x0043 }
            if (r0 != 0) goto L_0x0031
            java.lang.String r1 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)     // Catch:{ Exception -> 0x0043 }
        L_0x0031:
            com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel r1 = r3.f114335b     // Catch:{ Exception -> 0x0043 }
            r0.setBusinessGoodsInfo(r1)     // Catch:{ Exception -> 0x0043 }
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r0 = r3.f114334a     // Catch:{ Exception -> 0x0043 }
            if (r0 != 0) goto L_0x003f
            java.lang.String r1 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)     // Catch:{ Exception -> 0x0043 }
        L_0x003f:
            r1 = 0
            r0.mo91092a(r1)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            if (r4 != 0) goto L_0x0048
        L_0x0045:
            r3.mo91489b()
        L_0x0048:
            return
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45192l.onAsyncGoodsInfoEvent(com.ss.android.ugc.aweme.commercialize.anchor.b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91487a(com.p683ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel r15) {
        /*
            r14 = this;
            boolean r0 = r14.m98681c()
            r1 = 0
            if (r0 != 0) goto L_0x00a9
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f67772d
            java.util.List r0 = r0.mo52758b()
            r2 = 1
            if (r0 == 0) goto L_0x004b
            int r3 = r0.size()
            if (r3 <= r2) goto L_0x004b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0025
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0046
        L_0x0025:
            java.util.Iterator r0 = r0.iterator()
        L_0x0029:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.commercialize.anchor.g r3 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r3
            int r3 = r3.f67830a
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SHOP
            int r4 = r4.getTYPE()
            if (r3 != r4) goto L_0x0041
            r3 = 1
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 == 0) goto L_0x0029
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x004b
            r0 = 1
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x00a9
            if (r15 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r14.f114336c
            if (r0 != 0) goto L_0x0059
            java.lang.String r1 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0059:
            android.arch.lifecycle.r r1 = r0.getUpdateAnchor()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r13 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
            com.ss.android.ugc.aweme.commercialize.anchor.a r3 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SHOP
            int r4 = r3.getTYPE()
            com.google.gson.f r3 = new com.google.gson.f
            r3.<init>()
            java.lang.String r5 = "shop_draft_id"
            java.lang.String r6 = r15.draftId
            d.n r5 = p2628d.C52856t.m112465a(r5, r6)
            java.util.Map r5 = p2628d.p2629a.C52550ab.m112042a(r5)
            java.lang.String r5 = r3.mo34889b(r5)
            java.lang.String r3 = "Gson().toJson(mapOf(\n   …                       ))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r3)
            java.lang.String r6 = r15.title
            r7 = 0
            android.arch.lifecycle.r r15 = r0.getWithStarAtlasOrderGoods()
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r15 = p2628d.p2639f.p2641b.C52711k.m112239a(r15, r0)
            if (r15 == 0) goto L_0x0098
            r2 = 999(0x3e7, float:1.4E-42)
        L_0x0098:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 0
            r10 = 0
            r11 = 104(0x68, float:1.46E-43)
            r12 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.setValue(r13)
            return
        L_0x00a9:
            r14.f114335b = r15
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r0 = r14.f114334a
            if (r0 != 0) goto L_0x00b4
            java.lang.String r2 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00b4:
            r0.setBusinessGoodsInfo(r15)
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r0 = r14.f114334a
            if (r0 != 0) goto L_0x00c0
            java.lang.String r2 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00c0:
            r0.mo91092a(r1)
            if (r15 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r15 = r14.f114336c
            if (r15 != 0) goto L_0x00ce
            java.lang.String r0 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00ce:
            d.f.a.a r15 = r15.getResetLinkAction()
            r15.invoke()
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r15 = r14.f114336c
            if (r15 != 0) goto L_0x00de
            java.lang.String r0 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00de:
            d.f.a.a r15 = r15.getResetPoiAction()
            r15.invoke()
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r15 = r14.f114336c
            if (r15 != 0) goto L_0x00ee
            java.lang.String r0 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00ee:
            android.arch.lifecycle.r r15 = r15.getLinkState()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r15.setValue(r0)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r15 = r14.f114336c
            if (r15 != 0) goto L_0x0102
            java.lang.String r0 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0102:
            android.arch.lifecycle.r r15 = r15.getLocationState()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r15.setValue(r0)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45192l.mo91487a(com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel):void");
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.support.p030v4.app.Fragment r4, android.widget.LinearLayout r5, android.os.Bundle r6, com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType r7, com.p683ss.android.ugc.aweme.services.publish.PublishOutput r8, com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc r9, com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r10) {
        /*
            r3 = this;
            java.lang.String r6 = "fragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            java.lang.String r6 = "extensionWidgetContainer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
            java.lang.String r6 = "contentType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r6)
            java.lang.String r6 = "publishOutput"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r6)
            java.lang.String r6 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r6)
            java.lang.String r6 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r6)
            r3.f114338e = r7
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r3)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r9.getExtensionDataRepo()
            r3.f114336c = r6
            r3.f114337d = r9
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r3.f114336c
            if (r6 != 0) goto L_0x0034
            java.lang.String r7 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0034:
            com.ss.android.ugc.aweme.shortvideo.ui.l$a r7 = new com.ss.android.ugc.aweme.shortvideo.ui.l$a
            r7.<init>(r3)
            d.f.a.b r7 = (p2628d.p2639f.p2640a.C52671b) r7
            r6.setRestoreGoodsPublishModel(r7)
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r6 = new com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem
            android.content.Context r7 = r5.getContext()
            r10 = 0
            r6.<init>(r7, r10)
            android.content.Context r7 = r5.getContext()
            r0 = 1112539136(0x42500000, float:52.0)
            float r7 = com.bytedance.common.utility.C9432q.m18687b(r7, r0)
            int r7 = (int) r7
            r0 = r6
            android.view.View r0 = (android.view.View) r0
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r7)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r5.addView(r0, r1)
            r5 = 16
            r6.setGravity(r5)
            r5 = 0
            r6.setOrientation(r5)
            r3.f114334a = r6
            java.lang.String r6 = r8.getFilePath()
            com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel r6 = com.p683ss.android.ugc.aweme.shortvideo.util.C45455t.m99053b(r6)
            if (r6 == 0) goto L_0x0080
            java.lang.String r7 = r8.getCreationId()
            r6.videoPath = r7
            r3.mo91487a(r6)
            goto L_0x008b
        L_0x0080:
            java.lang.String r6 = r8.getCreationId()
            com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel r6 = com.p683ss.android.ugc.aweme.shortvideo.util.C45455t.m99053b(r6)
            r3.mo91487a(r6)
        L_0x008b:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r6 = r3.f114334a
            if (r6 != 0) goto L_0x0094
            java.lang.String r7 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0094:
            com.ss.android.ugc.aweme.shortvideo.ui.l$b r7 = new com.ss.android.ugc.aweme.shortvideo.ui.l$b
            r7.<init>(r3)
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem$a r7 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.BusinessGoodsPublishSettingItem.C44900a) r7
            r6.setStateChangeCB(r7)
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            r6.hasCommerceVideoRights()
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r6 = r3.f114334a
            if (r6 != 0) goto L_0x00ae
            java.lang.String r7 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00ae:
            boolean r7 = r3.m98681c()
            r8 = 8
            if (r7 == 0) goto L_0x00b8
            r7 = 0
            goto L_0x00ba
        L_0x00b8:
            r7 = 8
        L_0x00ba:
            r6.setVisibility(r7)
            com.ss.android.ugc.aweme.port.in.bc$a r6 = r9.getPublishExtensionDataContainer()
            if (r6 == 0) goto L_0x00c7
            java.lang.String r10 = r6.mo78634c()
        L_0x00c7:
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r10)
            java.lang.String r7 = "PublishExtensionModel.fr…taContainer?.publishData)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo r6 = r6.f68924f
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r7 = r3.f114334a
            if (r7 != 0) goto L_0x00db
            java.lang.String r10 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x00db:
            r7.setVisibility(r8)
            r7 = 1
            if (r6 == 0) goto L_0x0135
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r3.f114336c
            if (r6 != 0) goto L_0x00ea
            java.lang.String r8 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x00ea:
            android.arch.lifecycle.r r6 = r6.getLocationState()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r6.setValue(r8)
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r6 = r3.f114334a
            if (r6 != 0) goto L_0x00fe
            java.lang.String r8 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x00fe:
            r6.f113630a = r7
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r3.f114336c
            if (r6 != 0) goto L_0x0109
            java.lang.String r8 = "extensionDataRepo"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0109:
            android.arch.lifecycle.r r6 = r6.isGoodsAdd()
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r8 = r3.f114334a
            if (r8 != 0) goto L_0x0116
            java.lang.String r10 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0116:
            boolean r8 = r8.f113630a
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r6.setValue(r8)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r9.getExtensionDataRepo()
            r6.getResetLinkAction()
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r9.getExtensionDataRepo()
            android.arch.lifecycle.r r6 = r6.getLinkState()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r6.setValue(r8)
        L_0x0135:
            com.ss.android.ugc.aweme.app.SharePrefCache r6 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r8 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            com.ss.android.ugc.aweme.app.bf r6 = r6.getShowAddBusinessGoodsDot()
            if (r6 == 0) goto L_0x0163
            java.lang.Object r6 = r6.mo47782d()
            java.lang.String r8 = "needShowDot.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0156
            goto L_0x0163
        L_0x0156:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r6 = r3.f114334a
            if (r6 != 0) goto L_0x015f
            java.lang.String r7 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x015f:
            r6.mo91092a(r5)
            goto L_0x016f
        L_0x0163:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r5 = r3.f114334a
            if (r5 != 0) goto L_0x016c
            java.lang.String r6 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x016c:
            r5.mo91092a(r7)
        L_0x016f:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r5 = r3.f114334a
            if (r5 != 0) goto L_0x0178
            java.lang.String r6 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0178:
            com.ss.android.ugc.aweme.shortvideo.ui.l$c r6 = new com.ss.android.ugc.aweme.shortvideo.ui.l$c
            r6.<init>(r3, r9, r4)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r5 = r9.getExtensionDataRepo()
            android.arch.lifecycle.r r5 = r5.getGoodsState()
            android.arch.lifecycle.k r4 = (android.arch.lifecycle.C0184k) r4
            com.ss.android.ugc.aweme.shortvideo.ui.l$d r6 = new com.ss.android.ugc.aweme.shortvideo.ui.l$d
            r6.<init>(r3)
            android.arch.lifecycle.s r6 = (android.arch.lifecycle.C0199s) r6
            r5.observe(r4, r6)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r4 = r9.getExtensionDataRepo()
            com.ss.android.ugc.aweme.shortvideo.ui.l$e r5 = new com.ss.android.ugc.aweme.shortvideo.ui.l$e
            r5.<init>(r3)
            d.f.a.a r5 = (p2628d.p2639f.p2640a.C52670a) r5
            r4.setResetGoodsAction(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45192l.onCreate(android.support.v4.app.Fragment, android.widget.LinearLayout, android.os.Bundle, com.ss.android.ugc.aweme.services.publish.AVPublishContentType, com.ss.android.ugc.aweme.services.publish.PublishOutput, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback):void");
    }
}
