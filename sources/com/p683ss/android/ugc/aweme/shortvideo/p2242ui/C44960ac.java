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
import com.p683ss.android.ugc.aweme.services.publish.PostPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45088a;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ac */
public final class C44960ac implements IAVPublishExtension<PostPublishModel> {

    /* renamed from: a */
    public C44965ad f113879a;

    /* renamed from: b */
    private Fragment f113880b;

    /* renamed from: c */
    private ExtensionMisc f113881c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ac$a */
    static final class C44961a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f113882a;

        /* renamed from: b */
        final /* synthetic */ C44960ac f113883b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f113884c;

        /* renamed from: d */
        final /* synthetic */ Fragment f113885d;

        C44961a(C25626g gVar, C44960ac acVar, ExtensionMisc extensionMisc, Fragment fragment) {
            this.f113882a = gVar;
            this.f113883b = acVar;
            this.f113884c = extensionMisc;
            this.f113885d = fragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
            if (r7 == null) goto L_0x00a3;
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
                com.ss.android.ugc.aweme.commercialize.anchor.g r2 = r6.f113882a
                int r2 = r2.f67830a
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
                com.ss.android.ugc.aweme.shortvideo.ui.ac r7 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r7)
                boolean r7 = r7.f113683j
                r0 = 0
                r1 = 2132549428(0x7f1c1f34, float:2.0752158E38)
                r2 = 1
                if (r7 == 0) goto L_0x00b1
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f113884c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getUpdateAnchor()
                java.lang.Object r7 = r7.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r7 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r7
                if (r7 == 0) goto L_0x00a3
                java.lang.Integer r3 = r7.getSource()
                if (r3 != 0) goto L_0x0049
                goto L_0x0071
            L_0x0049:
                int r3 = r3.intValue()
                r4 = 999(0x3e7, float:1.4E-42)
                if (r3 != r4) goto L_0x0071
                com.ss.android.ugc.aweme.shortvideo.ui.ac r7 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r7)
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.ac r0 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r0 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r0)
                android.content.Context r0 = r0.getContext()
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r7, r0)
                r7.mo19066a()
                return
            L_0x0071:
                java.lang.Integer r1 = r7.getSource()
                boolean r1 = com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82845a(r1)
                if (r1 == 0) goto L_0x007c
                return
            L_0x007c:
                int r1 = r7.getBusinessType()
                com.ss.android.ugc.aweme.commercialize.anchor.a r3 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ARTICLE
                int r3 = r3.getTYPE()
                if (r1 != r3) goto L_0x0089
                r0 = 1
            L_0x0089:
                if (r0 == 0) goto L_0x008d
                r0 = r7
                goto L_0x008e
            L_0x008d:
                r0 = 0
            L_0x008e:
                if (r0 == 0) goto L_0x00a1
                android.support.v4.app.Fragment r1 = r6.f113885d
                android.content.Context r1 = r1.getContext()
                java.lang.String r0 = r0.getAnchorContent()
                com.ss.android.ugc.aweme.commercialize.anchor.b.a$a r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.m62149a(r0)
                com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.m62150a(r1, r0)
            L_0x00a1:
                if (r7 != 0) goto L_0x00b0
            L_0x00a3:
                android.support.v4.app.Fragment r7 = r6.f113885d
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.commercialize.anchor.g r0 = r6.f113882a
                java.lang.String r0 = r0.f67833d
                com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.m62151a(r7, r0)
            L_0x00b0:
                return
            L_0x00b1:
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f113884c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasAnchor()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r3)
                if (r7 != 0) goto L_0x014e
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f113884c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasOrderGoods()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r3)
                if (r7 != 0) goto L_0x014e
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f113884c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasOrderLink()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r3)
                if (r7 != 0) goto L_0x014e
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r6.f113884c
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getWithStarAtlasOrderPoi()
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r3)
                if (r7 == 0) goto L_0x011a
                goto L_0x014e
            L_0x011a:
                com.ss.android.ugc.aweme.shortvideo.ui.ac r7 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r7)
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.ac r1 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r1)
                android.content.Context r1 = r1.getContext()
                r3 = 2132543501(0x7f1c080d, float:2.0740137E38)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.ss.android.ugc.aweme.shortvideo.ui.ac r4 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r4 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r4)
                android.content.Context r4 = r4.getContext()
                r5 = 2132543590(0x7f1c0866, float:2.0740317E38)
                java.lang.String r4 = r4.getString(r5)
                r2[r0] = r4
                java.lang.String r0 = r1.getString(r3, r2)
                com.bytedance.common.utility.C9432q.m18676a(r7, r0)
                return
            L_0x014e:
                com.ss.android.ugc.aweme.shortvideo.ui.ac r7 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r7 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r7)
                android.content.Context r7 = r7.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.ac r0 = r6.f113883b
                com.ss.android.ugc.aweme.shortvideo.ui.ad r0 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98309a(r0)
                android.content.Context r0 = r0.getContext()
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.common.utility.C9432q.m18676a(r7, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.C44961a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ac$b */
    static final class C44962b<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C44960ac f113886a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f113887b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ac$b$a */
        static final class C44963a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C44962b f113888a;

            C44963a(C44962b bVar) {
                this.f113888a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C44960ac acVar = this.f113888a.f113886a;
                C39592a publishExtensionDataContainer = this.f113888a.f113887b.getPublishExtensionDataContainer();
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
                C44965ad adVar = acVar.f113879a;
                if (adVar == null) {
                    C52711k.m112237a("delegate");
                }
                adVar.mo91252a();
                acVar.mo91250a(true);
                this.f113888a.f113887b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                this.f113888a.f113887b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                this.f113888a.f113887b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                return C52860x.f131107a;
            }
        }

        C44962b(C44960ac acVar, ExtensionMisc extensionMisc) {
            this.f113886a = acVar;
            this.f113887b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    C44960ac.m98309a(this.f113886a).mo91252a();
                } else {
                    C44965ad a = C44960ac.m98309a(this.f113886a);
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
                    a.mo91253a(urlModel, str, str2, i, new C44963a(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ac$c */
    static final class C44964c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44960ac f113889a;

        C44964c(C44960ac acVar) {
            this.f113889a = acVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C44960ac acVar = this.f113889a;
                C52711k.m112236a((Object) bool, "it");
                acVar.mo91250a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "PostPublishExtension";
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
        return new PostPublishModel();
    }

    public final void onEnterChildrenMode() {
        C44965ad adVar = this.f113879a;
        if (adVar == null) {
            C52711k.m112237a("delegate");
        }
        adVar.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98310a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f113881c
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
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ARTICLE
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac.m98310a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ C44965ad m98309a(C44960ac acVar) {
        C44965ad adVar = acVar.f113879a;
        if (adVar == null) {
            C52711k.m112237a("delegate");
        }
        return adVar;
    }

    /* renamed from: a */
    public final void mo91250a(boolean z) {
        if (z) {
            C44965ad adVar = this.f113879a;
            if (adVar == null) {
                C52711k.m112237a("delegate");
            }
            adVar.setAlpha(1.0f);
            C44965ad adVar2 = this.f113879a;
            if (adVar2 == null) {
                C52711k.m112237a("delegate");
            }
            adVar2.setEnable(true);
            C44965ad adVar3 = this.f113879a;
            if (adVar3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = adVar3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C44965ad adVar4 = this.f113879a;
        if (adVar4 == null) {
            C52711k.m112237a("delegate");
        }
        adVar4.setAlpha(0.5f);
        C44965ad adVar5 = this.f113879a;
        if (adVar5 == null) {
            C52711k.m112237a("delegate");
        }
        adVar5.setEnable(false);
        C44965ad adVar6 = this.f113879a;
        if (adVar6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = adVar6.getLeftDrawableView();
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
        this.f113880b = fragment;
        this.f113881c = extensionMisc;
        C44965ad adVar = new C44965ad(linearLayout.getContext());
        linearLayout.addView(adVar, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        adVar.setGravity(16);
        adVar.setOrientation(0);
        int i = 8;
        adVar.setVisibility(8);
        this.f113879a = adVar;
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar, new C44962b(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar, new C44964c(this));
        C44965ad adVar2 = this.f113879a;
        if (adVar2 == null) {
            C52711k.m112237a("delegate");
        }
        if (m98310a()) {
            i = 0;
        }
        adVar2.setVisibility(i);
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.ARTICLE.getTYPE()) {
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
                C44965ad adVar3 = this.f113879a;
                if (adVar3 == null) {
                    C52711k.m112237a("delegate");
                }
                adVar3.setOnClickListener(new C44961a(gVar, this, extensionMisc, fragment));
            }
        }
    }
}
