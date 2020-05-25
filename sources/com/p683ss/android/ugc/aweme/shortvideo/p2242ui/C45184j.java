package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
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
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.GamePublishModel;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45088a;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j */
public final class C45184j implements IAVPublishExtension<GamePublishModel> {

    /* renamed from: d */
    public static final C45185a f114321d = new C45185a(null);

    /* renamed from: a */
    public C45190k f114322a;

    /* renamed from: b */
    public Fragment f114323b;

    /* renamed from: c */
    public ExtensionMisc f114324c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j$a */
    public static final class C45185a {
        private C45185a() {
        }

        public /* synthetic */ C45185a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j$b */
    static final class C45186b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f114325a;

        /* renamed from: b */
        final /* synthetic */ C45184j f114326b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f114327c;

        C45186b(C25626g gVar, C45184j jVar, ExtensionMisc extensionMisc) {
            this.f114325a = gVar;
            this.f114326b = jVar;
            this.f114327c = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("add_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47826a("business_type", this.f114325a.f67830a).f61491a);
            if (C45184j.m98674a(this.f114326b).f113683j) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f114327c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData != null) {
                    Integer source = anchorTransData.getSource();
                    if (source != null && source.intValue() == 999) {
                        C10691a.m21545b(C45184j.m98674a(this.f114326b).getContext(), C45184j.m98674a(this.f114326b).getContext().getString(R.string.dq_)).mo19066a();
                        return;
                    } else if (C36811b.m82845a(anchorTransData.getSource())) {
                        return;
                    }
                }
                C36811b.m82841a(C45184j.m98674a(this.f114326b).getContext(), C25600a.GAME);
            } else if (C52711k.m112239a((Object) (Boolean) this.f114327c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114327c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114327c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114327c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10691a.m21545b(C45184j.m98674a(this.f114326b).getContext(), C45184j.m98674a(this.f114326b).getContext().getString(R.string.dq_)).mo19066a();
            } else {
                C10691a.m21545b(C45184j.m98674a(this.f114326b).getContext(), C45184j.m98674a(this.f114326b).getContext().getString(R.string.aka, new Object[]{C45184j.m98674a(this.f114326b).getContext().getString(R.string.g0k)})).mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j$c */
    static final class C45187c<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45184j f114328a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114329b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j$c$a */
        static final class C45188a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45187c f114330a;

            C45188a(C45187c cVar) {
                this.f114330a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C45184j jVar = this.f114330a.f114328a;
                ExtensionMisc extensionMisc = this.f114330a.f114329b;
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
                C45190k kVar = jVar.f114322a;
                if (kVar == null) {
                    C52711k.m112237a("delegate");
                }
                kVar.mo91483a();
                jVar.mo91481a(true);
                extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                return C52860x.f131107a;
            }
        }

        C45187c(C45184j jVar, ExtensionMisc extensionMisc) {
            this.f114328a = jVar;
            this.f114329b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    C45184j.m98674a(this.f114328a).mo91483a();
                } else {
                    C45190k a = C45184j.m98674a(this.f114328a);
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
                    a.mo91484a(urlModel, str, str2, i, new C45188a(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j$d */
    static final class C45189d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45184j f114331a;

        C45189d(C45184j jVar) {
            this.f114331a = jVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45184j jVar = this.f114331a;
                C52711k.m112236a((Object) bool, "it");
                jVar.mo91481a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "GamePublishExtension";
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
        return new GamePublishModel();
    }

    public final void onEnterChildrenMode() {
        C45190k kVar = this.f114322a;
        if (kVar == null) {
            C52711k.m112237a("delegate");
        }
        kVar.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98675a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f114324c
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
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.GAME
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45184j.m98675a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ C45190k m98674a(C45184j jVar) {
        C45190k kVar = jVar.f114322a;
        if (kVar == null) {
            C52711k.m112237a("delegate");
        }
        return kVar;
    }

    /* renamed from: a */
    public final void mo91481a(boolean z) {
        if (z) {
            C45190k kVar = this.f114322a;
            if (kVar == null) {
                C52711k.m112237a("delegate");
            }
            kVar.setAlpha(1.0f);
            C45190k kVar2 = this.f114322a;
            if (kVar2 == null) {
                C52711k.m112237a("delegate");
            }
            kVar2.setEnable(true);
            C45190k kVar3 = this.f114322a;
            if (kVar3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = kVar3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C45190k kVar4 = this.f114322a;
        if (kVar4 == null) {
            C52711k.m112237a("delegate");
        }
        kVar4.setAlpha(0.5f);
        C45190k kVar5 = this.f114322a;
        if (kVar5 == null) {
            C52711k.m112237a("delegate");
        }
        kVar5.setEnable(false);
        C45190k kVar6 = this.f114322a;
        if (kVar6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = kVar6.getLeftDrawableView();
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
        this.f114324c = extensionMisc;
        this.f114323b = fragment;
        C45190k kVar = new C45190k(linearLayout.getContext());
        linearLayout.addView(kVar, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        kVar.setGravity(16);
        kVar.setOrientation(0);
        int i = 8;
        kVar.setVisibility(8);
        this.f114322a = kVar;
        C0184k kVar2 = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar2, new C45187c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar2, new C45189d(this));
        C45190k kVar3 = this.f114322a;
        if (kVar3 == null) {
            C52711k.m112237a("delegate");
        }
        if (m98675a()) {
            i = 0;
        }
        kVar3.setVisibility(i);
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.GAME.getTYPE()) {
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
                C45190k kVar4 = this.f114322a;
                if (kVar4 == null) {
                    C52711k.m112237a("delegate");
                }
                kVar4.setOnClickListener(new C45186b(gVar, this, extensionMisc));
            }
        }
    }
}
