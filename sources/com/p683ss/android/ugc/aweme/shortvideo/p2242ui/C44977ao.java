package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45088a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ao */
public final class C44977ao implements IAVPublishExtension<SeedPublishModel> {

    /* renamed from: c */
    public static final C44978a f113911c = new C44978a(null);

    /* renamed from: a */
    public SeedingPublishSettingItem f113912a;

    /* renamed from: b */
    ExtensionMisc f113913b;

    /* renamed from: d */
    private String f113914d;

    /* renamed from: e */
    private String f113915e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ao$a */
    public static final class C44978a {
        private C44978a() {
        }

        public /* synthetic */ C44978a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ao$b */
    static final class C44979b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f113916a;

        /* renamed from: b */
        final /* synthetic */ C44977ao f113917b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f113918c;

        C44979b(C25626g gVar, C44977ao aoVar, ExtensionMisc extensionMisc) {
            this.f113916a = gVar;
            this.f113917b = aoVar;
            this.f113918c = extensionMisc;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
            if (r10 == null) goto L_0x00be;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
                java.lang.String r10 = "add_label"
                com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                r0.<init>()
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_post_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "business_type"
                com.ss.android.ugc.aweme.commercialize.anchor.g r2 = r9.f113916a
                int r2 = r2.f67830a
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r0)
                com.ss.android.ugc.aweme.shortvideo.ui.ao r10 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r10 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r10)
                boolean r10 = r10.f113683j
                r0 = 2132549428(0x7f1c1f34, float:2.0752158E38)
                r1 = 1
                if (r10 == 0) goto L_0x00e6
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r10 = r9.f113918c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r10 = r10.getExtensionDataRepo()
                android.arch.lifecycle.r r10 = r10.getUpdateAnchor()
                java.lang.Object r10 = r10.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r10 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r10
                if (r10 == 0) goto L_0x007b
                java.lang.Integer r2 = r10.getSource()
                if (r2 != 0) goto L_0x0048
                goto L_0x0070
            L_0x0048:
                int r2 = r2.intValue()
                r3 = 999(0x3e7, float:1.4E-42)
                if (r2 != r3) goto L_0x0070
                com.ss.android.ugc.aweme.shortvideo.ui.ao r10 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r10 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r10)
                android.content.Context r10 = r10.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.ao r1 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r1)
                android.content.Context r1 = r1.getContext()
                java.lang.String r0 = r1.getString(r0)
                com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r10, r0)
                r10.mo19066a()
                return
            L_0x0070:
                java.lang.Integer r10 = r10.getSource()
                boolean r10 = com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82845a(r10)
                if (r10 == 0) goto L_0x007b
                return
            L_0x007b:
                com.ss.android.ugc.aweme.shortvideo.ui.ao r10 = r9.f113917b
                r0 = 0
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0095 }
                java.lang.String r3 = "SettingsReader.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x0095 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs r2 = r2.getAwemeFeConf()     // Catch:{ a -> 0x0095 }
                java.lang.String r3 = "SettingsReader.get().awemeFeConf"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x0095 }
                java.lang.String r2 = r2.getSeedLabel()     // Catch:{ a -> 0x0095 }
                goto L_0x0096
            L_0x0095:
                r2 = r0
            L_0x0096:
                r3 = r2
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x00a1
                java.lang.String r2 = "aweme://webview/?url=https%3A%2F%2Fffh.jinritemai.com%2Ffalcon%2Fe_commerce%2Frn%2Fseed_label%2F%3Fstatus_bar_color%3Dffffff%26status_font_dark%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3Dffffff%26video_title%3Dvideo_title_placeholder&status_bar_color=ffffff&status_font_dark=1&hide_nav_bar=1&loading_bgcolor=ffffff&video_title=video_title_placeholder&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_lyon_seed_label%26bundle%3Dindex.js%26module_name%3Dpage_seed_label%26status_bar_color%3Dffffff%26status_font_dark%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3Dffffff%26video_title%3Dvideo_title_placeholder"
            L_0x00a1:
                r3 = r2
                if (r3 == 0) goto L_0x00c8
                java.lang.String r4 = "video_title_placeholder"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r10 = r10.f113913b
                if (r10 != 0) goto L_0x00af
                java.lang.String r0 = "extensionMisc"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x00af:
                com.ss.android.ugc.aweme.port.in.bc$a r10 = r10.getPublishExtensionDataContainer()
                if (r10 == 0) goto L_0x00be
                java.lang.String r10 = r10.mo78635d()
                if (r10 != 0) goto L_0x00bc
                goto L_0x00be
            L_0x00bc:
                r5 = r10
                goto L_0x00c1
            L_0x00be:
                java.lang.String r10 = ""
                goto L_0x00bc
            L_0x00c1:
                r6 = 0
                r7 = 4
                r8 = 0
                java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r3, r4, r5, r6, r7, r8)
            L_0x00c8:
                com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.ab.CommerceBulletExperiment> r3 = com.p683ss.android.ugc.aweme.commerce.service.p1535ab.CommerceBulletExperiment.class
                r4 = 1
                java.lang.String r5 = "commerce_hybrid_use_bullet"
                r6 = 31744(0x7c00, float:4.4483E-41)
                r7 = 0
                int r10 = r2.mo18168a(r3, r4, r5, r6, r7)
                if (r10 != r1) goto L_0x00de
                java.lang.String r0 = com.p683ss.android.ugc.aweme.bullet.utils.C24348b.m59717b(r0)
            L_0x00de:
                com.ss.android.ugc.aweme.router.w r10 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
                r10.mo83861a(r0)
                return
            L_0x00e6:
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r10 = r9.f113918c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r10 = r10.getExtensionDataRepo()
                android.arch.lifecycle.r r10 = r10.getWithStarAtlasAnchor()
                java.lang.Object r10 = r10.getValue()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r2)
                if (r10 != 0) goto L_0x0184
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r10 = r9.f113918c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r10 = r10.getExtensionDataRepo()
                android.arch.lifecycle.r r10 = r10.getWithStarAtlasOrderGoods()
                java.lang.Object r10 = r10.getValue()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r2)
                if (r10 != 0) goto L_0x0184
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r10 = r9.f113918c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r10 = r10.getExtensionDataRepo()
                android.arch.lifecycle.r r10 = r10.getWithStarAtlasOrderLink()
                java.lang.Object r10 = r10.getValue()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r2)
                if (r10 != 0) goto L_0x0184
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r10 = r9.f113918c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r10 = r10.getExtensionDataRepo()
                android.arch.lifecycle.r r10 = r10.getWithStarAtlasOrderPoi()
                java.lang.Object r10 = r10.getValue()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r2)
                if (r10 == 0) goto L_0x014f
                goto L_0x0184
            L_0x014f:
                com.ss.android.ugc.aweme.shortvideo.ui.ao r10 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r10 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r10)
                android.content.Context r10 = r10.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.ao r0 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r0 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r0)
                android.content.Context r0 = r0.getContext()
                r2 = 2132543501(0x7f1c080d, float:2.0740137E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                com.ss.android.ugc.aweme.shortvideo.ui.ao r4 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r4 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r4)
                android.content.Context r4 = r4.getContext()
                r5 = 2132543115(0x7f1c068b, float:2.0739354E38)
                java.lang.String r4 = r4.getString(r5)
                r1[r3] = r4
                java.lang.String r0 = r0.getString(r2, r1)
                com.bytedance.common.utility.C9432q.m18676a(r10, r0)
                return
            L_0x0184:
                com.ss.android.ugc.aweme.shortvideo.ui.ao r10 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r10 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r10)
                android.content.Context r10 = r10.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.ao r1 = r9.f113917b
                com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98329a(r1)
                android.content.Context r1 = r1.getContext()
                java.lang.String r0 = r1.getString(r0)
                com.bytedance.common.utility.C9432q.m18676a(r10, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.C44979b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ao$c */
    static final class C44980c<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C44977ao f113919a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f113920b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ao$c$a */
        static final class C44981a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C44980c f113921a;

            C44981a(C44980c cVar) {
                this.f113921a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C44977ao aoVar = this.f113921a.f113919a;
                C39592a publishExtensionDataContainer = this.f113921a.f113920b.getPublishExtensionDataContainer();
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
                SeedingPublishSettingItem seedingPublishSettingItem = aoVar.f113912a;
                if (seedingPublishSettingItem == null) {
                    C52711k.m112237a("delegate");
                }
                seedingPublishSettingItem.mo91115a();
                aoVar.mo91270a(true);
                this.f113921a.f113920b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                this.f113921a.f113920b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                this.f113921a.f113920b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                return C52860x.f131107a;
            }
        }

        C44980c(C44977ao aoVar, ExtensionMisc extensionMisc) {
            this.f113919a = aoVar;
            this.f113920b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    C44977ao.m98329a(this.f113919a).mo91115a();
                } else {
                    SeedingPublishSettingItem a = C44977ao.m98329a(this.f113919a);
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
                    a.mo91116a(urlModel, str, i, anchorTag, new C44981a(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ao$d */
    static final class C44982d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44977ao f113922a;

        C44982d(C44977ao aoVar) {
            this.f113922a = aoVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C44977ao aoVar = this.f113922a;
                C52711k.m112236a((Object) bool, "it");
                aoVar.mo91270a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "SeedingPublishExtension";
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

    public final void onEnterChildrenMode() {
        SeedingPublishSettingItem seedingPublishSettingItem = this.f113912a;
        if (seedingPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        seedingPublishSettingItem.setVisibility(8);
    }

    public final /* synthetic */ Object provideExtensionData() {
        String str;
        ExtensionMisc extensionMisc = this.f113913b;
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
        SeedPublishModel seedPublishModel = new SeedPublishModel();
        seedPublishModel.setSeedId(a.f68939u);
        seedPublishModel.setSeedName(a.f68940v);
        seedPublishModel.setReferSeedId(a.f68941w);
        seedPublishModel.setReferSeedName(a.f68942x);
        seedPublishModel.setDataType(a.f68943y);
        return seedPublishModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98330a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f113913b
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
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SEEDING
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.m98330a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ SeedingPublishSettingItem m98329a(C44977ao aoVar) {
        SeedingPublishSettingItem seedingPublishSettingItem = aoVar.f113912a;
        if (seedingPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        return seedingPublishSettingItem;
    }

    /* renamed from: a */
    public final void mo91270a(boolean z) {
        if (z) {
            SeedingPublishSettingItem seedingPublishSettingItem = this.f113912a;
            if (seedingPublishSettingItem == null) {
                C52711k.m112237a("delegate");
            }
            seedingPublishSettingItem.setAlpha(1.0f);
            SeedingPublishSettingItem seedingPublishSettingItem2 = this.f113912a;
            if (seedingPublishSettingItem2 == null) {
                C52711k.m112237a("delegate");
            }
            seedingPublishSettingItem2.setEnable(true);
            SeedingPublishSettingItem seedingPublishSettingItem3 = this.f113912a;
            if (seedingPublishSettingItem3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = seedingPublishSettingItem3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        SeedingPublishSettingItem seedingPublishSettingItem4 = this.f113912a;
        if (seedingPublishSettingItem4 == null) {
            C52711k.m112237a("delegate");
        }
        seedingPublishSettingItem4.setAlpha(0.5f);
        SeedingPublishSettingItem seedingPublishSettingItem5 = this.f113912a;
        if (seedingPublishSettingItem5 == null) {
            C52711k.m112237a("delegate");
        }
        seedingPublishSettingItem5.setEnable(false);
        SeedingPublishSettingItem seedingPublishSettingItem6 = this.f113912a;
        if (seedingPublishSettingItem6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = seedingPublishSettingItem6.getLeftDrawableView();
        C52711k.m112236a((Object) leftDrawableView2, "delegate.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAsyncGoodsSeedInfoEvent(com.p683ss.android.ugc.aweme.p1706fe.method.C29906l r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "broadCastEvent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            org.json.JSONObject r2 = r1.f78045b
            if (r2 == 0) goto L_0x00cf
            org.json.JSONObject r3 = r1.f78045b
            java.lang.String r4 = "eventName"
            boolean r3 = r3.has(r4)
            r4 = 1
            if (r3 == 0) goto L_0x0034
            org.json.JSONObject r3 = r1.f78045b
            java.lang.String r5 = "eventName"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "asyncGoodsSeedAnchorInfo"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r5)
            if (r3 == 0) goto L_0x0034
            org.json.JSONObject r3 = r1.f78045b
            java.lang.String r5 = "data"
            boolean r3 = r3.has(r5)
            if (r3 == 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            r5 = 0
            if (r3 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r5
        L_0x003a:
            if (r2 != 0) goto L_0x003e
            goto L_0x00cf
        L_0x003e:
            org.json.JSONObject r2 = r1.f78045b     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = "data"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = "draft_id"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x007b }
            org.json.JSONObject r1 = r1.f78045b     // Catch:{ Exception -> 0x0079 }
            java.lang.String r3 = "data"
            org.json.JSONObject r1 = r1.getJSONObject(r3)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r3 = "seed"
            org.json.JSONObject r1 = r1.getJSONObject(r3)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r3 = "title"
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r6 = "seed_tag"
            java.lang.String r6 = r1.getString(r6)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r5 = "seed_id"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x007e }
            r0.f113914d = r5     // Catch:{ Exception -> 0x007e }
            java.lang.String r5 = "title"
            java.lang.String r1 = r1.getString(r5)     // Catch:{ Exception -> 0x007e }
            r0.f113915e = r1     // Catch:{ Exception -> 0x007e }
            goto L_0x007e
        L_0x0077:
            r6 = r5
            goto L_0x007e
        L_0x0079:
            r3 = r5
            goto L_0x007d
        L_0x007b:
            r2 = r5
            r3 = r2
        L_0x007d:
            r6 = r3
        L_0x007e:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r1 = r0.f113913b
            if (r1 != 0) goto L_0x0087
            java.lang.String r5 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0087:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r1 = r1.getExtensionDataRepo()
            android.arch.lifecycle.r r1 = r1.getUpdateAnchor()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r5 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
            com.ss.android.ugc.aweme.commercialize.anchor.a r7 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SEEDING
            int r8 = r7.getTYPE()
            com.google.gson.f r7 = new com.google.gson.f
            r7.<init>()
            java.lang.String r9 = "shop_seeding_draft_id"
            if (r2 != 0) goto L_0x00a2
            java.lang.String r2 = ""
        L_0x00a2:
            d.n r2 = p2628d.C52856t.m112465a(r9, r2)
            java.util.Map r2 = p2628d.p2629a.C52550ab.m112042a(r2)
            java.lang.String r9 = r7.mo34889b(r2)
            java.lang.String r2 = "Gson().toJson(mapOf(\n   …?: \"\")\n                ))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
            if (r3 != 0) goto L_0x00b7
            java.lang.String r3 = ""
        L_0x00b7:
            r10 = r3
            if (r6 != 0) goto L_0x00bc
            java.lang.String r6 = ""
        L_0x00bc:
            r11 = r6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r13 = 0
            r14 = 0
            r15 = 96
            r16 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.setValue(r5)
            return
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao.onAsyncGoodsSeedInfoEvent(com.ss.android.ugc.aweme.fe.method.l):void");
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
        this.f113913b = extensionMisc;
        Context context = linearLayout.getContext();
        C52711k.m112236a((Object) context, "container.context");
        SeedingPublishSettingItem seedingPublishSettingItem = new SeedingPublishSettingItem(context, null);
        linearLayout.addView(seedingPublishSettingItem, new LayoutParams(-1, (int) C20141b.m49696a(linearLayout.getContext(), 52.0f)));
        seedingPublishSettingItem.setGravity(16);
        seedingPublishSettingItem.setOrientation(0);
        int i = 8;
        seedingPublishSettingItem.setVisibility(8);
        this.f113912a = seedingPublishSettingItem;
        SeedingPublishSettingItem seedingPublishSettingItem2 = this.f113912a;
        if (seedingPublishSettingItem2 == null) {
            C52711k.m112237a("delegate");
        }
        if (m98330a()) {
            i = 0;
        }
        seedingPublishSettingItem2.setVisibility(i);
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar, new C44980c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar, new C44982d(this));
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.SEEDING.getTYPE()) {
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
                SeedingPublishSettingItem seedingPublishSettingItem3 = this.f113912a;
                if (seedingPublishSettingItem3 == null) {
                    C52711k.m112237a("delegate");
                }
                seedingPublishSettingItem3.setOnClickListener(new C44979b(gVar, this, extensionMisc));
            }
        }
    }
}
