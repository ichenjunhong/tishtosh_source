package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
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
import com.p683ss.android.ugc.aweme.services.publish.MicroAppPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45088a;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v */
public final class C45222v implements IAVPublishExtension<MicroAppPublishModel> {

    /* renamed from: a */
    public C45227w f114393a;

    /* renamed from: b */
    public Fragment f114394b;

    /* renamed from: c */
    public ExtensionMisc f114395c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$a */
    static final class C45223a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f114396a;

        /* renamed from: b */
        final /* synthetic */ C45222v f114397b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f114398c;

        C45223a(C25626g gVar, C45222v vVar, ExtensionMisc extensionMisc) {
            this.f114396a = gVar;
            this.f114397b = vVar;
            this.f114398c = extensionMisc;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x01c0, code lost:
            if (r7 == null) goto L_0x01c2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                java.lang.String r7 = "add_label"
                com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                r0.<init>()
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_post_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "business_type"
                com.ss.android.ugc.aweme.commercialize.anchor.g r2 = r6.f114396a
                int r2 = r2.f67830a
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
                com.ss.android.ugc.aweme.shortvideo.ui.v r7 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r7)
                boolean r7 = r7.f113683j
                r0 = 2132549428(0x7f1c1f34, float:2.0752158E38)
                if (r7 != 0) goto L_0x00f1
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f114398c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasAnchor()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                r1 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r2)
                if (r7 != 0) goto L_0x00d1
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f114398c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasOrderGoods()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r2)
                if (r7 != 0) goto L_0x00d1
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f114398c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasOrderLink()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r2)
                if (r7 != 0) goto L_0x00d1
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f114398c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasOrderPoi()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r2)
                if (r7 == 0) goto L_0x0098
                goto L_0x00d1
            L_0x0098:
                com.ss.android.ugc.aweme.shortvideo.ui.v r7 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r7)
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.v r0 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r0 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r0)
                android.content.Context r0 = r0.getContext()
                r2 = 2132543501(0x7f1c080d, float:2.0740137E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                com.ss.android.ugc.aweme.shortvideo.ui.v r4 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r4 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r4)
                android.content.Context r4 = r4.getContext()
                r5 = 2132543587(0x7f1c0863, float:2.0740311E38)
                java.lang.String r4 = r4.getString(r5)
                r1[r3] = r4
                java.lang.String r0 = r0.getString(r2, r1)
                com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r7, r0)
                r7.mo19066a()
                return
            L_0x00d1:
                com.ss.android.ugc.aweme.shortvideo.ui.v r7 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r7)
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.v r1 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r1)
                android.content.Context r1 = r1.getContext()
                java.lang.String r0 = r1.getString(r0)
                com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r7, r0)
                r7.mo19066a()
                return
            L_0x00f1:
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f114398c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getUpdateAnchor()
                java.lang.Object r7 = r7.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r7 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r7
                if (r7 == 0) goto L_0x01c2
                java.lang.Integer r1 = r7.getSource()
                if (r1 != 0) goto L_0x010a
                goto L_0x0132
            L_0x010a:
                int r1 = r1.intValue()
                r2 = 999(0x3e7, float:1.4E-42)
                if (r1 != r2) goto L_0x0132
                com.ss.android.ugc.aweme.shortvideo.ui.v r7 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r7)
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.v r1 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r1)
                android.content.Context r1 = r1.getContext()
                java.lang.String r0 = r1.getString(r0)
                com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r7, r0)
                r7.mo19066a()
                return
            L_0x0132:
                java.lang.Integer r0 = r7.getSource()
                boolean r0 = com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82845a(r0)
                if (r0 == 0) goto L_0x013d
                return
            L_0x013d:
                int r0 = r7.getBusinessType()
                com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_APP
                int r1 = r1.getTYPE()
                if (r0 != r1) goto L_0x01b1
                com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r0 = new com.ss.android.ugc.aweme.miniapp_api.model.b.b$a
                r0.<init>()
                java.lang.String r1 = "publish_page"
                com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r0 = r0.mo76222b(r1)
                java.lang.String r1 = "021017"
                com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r0 = r0.mo76223c(r1)
                com.ss.android.ugc.aweme.miniapp_api.model.b.b r0 = r0.mo76221a()
                com.google.gson.f r1 = new com.google.gson.f
                r1.<init>()
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r2 = r6.f114398c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r2.getExtensionDataRepo()
                android.arch.lifecycle.r r2 = r2.getUpdateAnchor()
                java.lang.Object r2 = r2.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r2 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r2
                if (r2 == 0) goto L_0x017a
                java.lang.String r2 = r2.getAnchorContent()
                goto L_0x017b
            L_0x017a:
                r2 = 0
            L_0x017b:
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.o> r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o.class
                java.lang.Object r1 = r1.mo34884a(r2, r3)
                com.ss.android.ugc.aweme.shortvideo.edit.o r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o) r1
                com.ss.android.ugc.aweme.miniapp_api.services.a r2 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
                java.lang.String r3 = "MiniAppServiceProxy.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r2 = r2.mo76294a()
                java.lang.String r3 = "microAppModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                java.lang.String r1 = r1.getSchema()
                java.lang.String r3 = "021017"
                java.lang.String r1 = r2.addScene(r1, r3)
                java.lang.String r1 = r2.setLaunchModeHostTask(r1)
                com.ss.android.ugc.aweme.shortvideo.ui.v r3 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r3 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r3)
                android.content.Context r3 = r3.getContext()
                r2.openMiniApp(r3, r1, r0)
                goto L_0x01c0
            L_0x01b1:
                com.ss.android.ugc.aweme.shortvideo.ui.v r0 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r0 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r0)
                android.content.Context r0 = r0.getContext()
                com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_APP
                com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82841a(r0, r1)
            L_0x01c0:
                if (r7 != 0) goto L_0x01d1
            L_0x01c2:
                com.ss.android.ugc.aweme.shortvideo.ui.v r7 = r6.f114397b
                com.ss.android.ugc.aweme.shortvideo.ui.w r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98701a(r7)
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.commercialize.anchor.a r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_APP
                com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82841a(r7, r0)
            L_0x01d1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.C45223a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$b */
    static final class C45224b<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45222v f114399a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114400b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$b$a */
        static final class C45225a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45224b f114401a;

            C45225a(C45224b bVar) {
                this.f114401a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C45222v vVar = this.f114401a.f114399a;
                ExtensionMisc extensionMisc = this.f114401a.f114400b;
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
                C45227w wVar = vVar.f114393a;
                if (wVar == null) {
                    C52711k.m112237a("delegate");
                }
                wVar.mo91504a();
                vVar.mo91502a(true);
                extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                return C52860x.f131107a;
            }
        }

        C45224b(C45222v vVar, ExtensionMisc extensionMisc) {
            this.f114399a = vVar;
            this.f114400b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    C45222v.m98701a(this.f114399a).mo91504a();
                } else {
                    C45227w a = C45222v.m98701a(this.f114399a);
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
                    String anchorTag = anchorTransData.getAnchorTag();
                    if (anchorTag == null) {
                        anchorTag = "";
                    }
                    String str2 = anchorTag;
                    Integer source2 = anchorTransData.getSource();
                    if (source2 != null) {
                        i = source2.intValue();
                    } else {
                        i = 0;
                    }
                    a.mo91505a(urlModel, str, str2, i, new C45225a(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$c */
    static final class C45226c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45222v f114402a;

        C45226c(C45222v vVar) {
            this.f114402a = vVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45222v vVar = this.f114402a;
                C52711k.m112236a((Object) bool, "it");
                vVar.mo91502a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "MicroAppPublishExtension";
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
        return new MicroAppPublishModel();
    }

    public final void onEnterChildrenMode() {
        C45227w wVar = this.f114393a;
        if (wVar == null) {
            C52711k.m112237a("delegate");
        }
        wVar.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98702a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f114395c
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
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_APP
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v.m98702a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ C45227w m98701a(C45222v vVar) {
        C45227w wVar = vVar.f114393a;
        if (wVar == null) {
            C52711k.m112237a("delegate");
        }
        return wVar;
    }

    /* renamed from: a */
    public final void mo91502a(boolean z) {
        if (z) {
            C45227w wVar = this.f114393a;
            if (wVar == null) {
                C52711k.m112237a("delegate");
            }
            wVar.setAlpha(1.0f);
            C45227w wVar2 = this.f114393a;
            if (wVar2 == null) {
                C52711k.m112237a("delegate");
            }
            wVar2.setEnable(true);
            C45227w wVar3 = this.f114393a;
            if (wVar3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = wVar3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C45227w wVar4 = this.f114393a;
        if (wVar4 == null) {
            C52711k.m112237a("delegate");
        }
        wVar4.setAlpha(0.5f);
        C45227w wVar5 = this.f114393a;
        if (wVar5 == null) {
            C52711k.m112237a("delegate");
        }
        wVar5.setEnable(false);
        C45227w wVar6 = this.f114393a;
        if (wVar6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = wVar6.getLeftDrawableView();
        C52711k.m112236a((Object) leftDrawableView2, "delegate.leftDrawableView");
        leftDrawableView2.setEnabled(false);
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
        this.f114395c = extensionMisc;
        this.f114394b = fragment;
        C45227w wVar = new C45227w(linearLayout.getContext());
        linearLayout.addView(wVar, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        wVar.setGravity(16);
        wVar.setOrientation(0);
        int i = 8;
        wVar.setVisibility(8);
        this.f114393a = wVar;
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar, new C45224b(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar, new C45226c(this));
        C45227w wVar2 = this.f114393a;
        if (wVar2 == null) {
            C52711k.m112237a("delegate");
        }
        if (m98702a()) {
            i = 0;
        }
        wVar2.setVisibility(i);
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.MICRO_APP.getTYPE()) {
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
                C45227w wVar3 = this.f114393a;
                if (wVar3 == null) {
                    C52711k.m112237a("delegate");
                }
                wVar3.setOnClickListener(new C45223a(gVar, this, extensionMisc));
            }
        }
    }
}
