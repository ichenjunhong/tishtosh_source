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
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.MediumPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45088a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u */
public final class C45217u implements IAVPublishExtension<MediumPublishModel> {

    /* renamed from: a */
    public MediumPublishSettingItem f114384a;

    /* renamed from: b */
    private ExtensionMisc f114385b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$a */
    static final class C45218a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f114386a;

        /* renamed from: b */
        final /* synthetic */ C45217u f114387b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f114388c;

        C45218a(C25626g gVar, C45217u uVar, ExtensionMisc extensionMisc) {
            this.f114386a = gVar;
            this.f114387b = uVar;
            this.f114388c = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("add_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47826a("business_type", this.f114386a.f67830a).f61491a);
            if (C45217u.m98698a(this.f114387b).f113683j) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f114388c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData != null) {
                    Integer source = anchorTransData.getSource();
                    if (source != null && source.intValue() == 999) {
                        C10691a.m21545b(C45217u.m98698a(this.f114387b).getContext(), C45217u.m98698a(this.f114387b).getContext().getString(R.string.dq_)).mo19066a();
                        return;
                    } else if (C36811b.m82845a(anchorTransData.getSource())) {
                        return;
                    }
                }
                C45379ae.m98930a(C45217u.m98698a(this.f114387b).getContext());
            } else if (C52711k.m112239a((Object) (Boolean) this.f114388c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114388c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114388c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114388c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10691a.m21545b(C45217u.m98698a(this.f114387b).getContext(), C45217u.m98698a(this.f114387b).getContext().getString(R.string.dq_)).mo19066a();
            } else {
                C10691a.m21545b(C45217u.m98698a(this.f114387b).getContext(), C45217u.m98698a(this.f114387b).getContext().getString(R.string.aka, new Object[]{"影视综艺"})).mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$b */
    static final class C45219b<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45217u f114389a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114390b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$b$a */
        static final class C45220a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45219b f114391a;

            C45220a(C45219b bVar) {
                this.f114391a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C45217u uVar = this.f114391a.f114389a;
                ExtensionMisc extensionMisc = this.f114391a.f114390b;
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
                MediumPublishSettingItem mediumPublishSettingItem = uVar.f114384a;
                if (mediumPublishSettingItem == null) {
                    C52711k.m112237a("mediumPublishSettingItem");
                }
                mediumPublishSettingItem.mo91068a();
                uVar.mo91500a(true);
                extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                return C52860x.f131107a;
            }
        }

        C45219b(C45217u uVar, ExtensionMisc extensionMisc) {
            this.f114389a = uVar;
            this.f114390b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    C45217u.m98698a(this.f114389a).mo91068a();
                } else {
                    MediumPublishSettingItem a = C45217u.m98698a(this.f114389a);
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
                    a.mo91069a(urlModel, str, str2, i, new C45220a(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$c */
    static final class C45221c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45217u f114392a;

        C45221c(C45217u uVar) {
            this.f114392a = uVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45217u uVar = this.f114392a;
                C52711k.m112236a((Object) bool, "it");
                uVar.mo91500a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "MediumPublishExtension";
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
        return new MediumPublishModel();
    }

    public final void onEnterChildrenMode() {
        MediumPublishSettingItem mediumPublishSettingItem = this.f114384a;
        if (mediumPublishSettingItem == null) {
            C52711k.m112237a("mediumPublishSettingItem");
        }
        mediumPublishSettingItem.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98699a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f114385b
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
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MEDIUM
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45217u.m98699a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ MediumPublishSettingItem m98698a(C45217u uVar) {
        MediumPublishSettingItem mediumPublishSettingItem = uVar.f114384a;
        if (mediumPublishSettingItem == null) {
            C52711k.m112237a("mediumPublishSettingItem");
        }
        return mediumPublishSettingItem;
    }

    /* renamed from: a */
    public final void mo91500a(boolean z) {
        if (z) {
            MediumPublishSettingItem mediumPublishSettingItem = this.f114384a;
            if (mediumPublishSettingItem == null) {
                C52711k.m112237a("mediumPublishSettingItem");
            }
            mediumPublishSettingItem.setAlpha(1.0f);
            MediumPublishSettingItem mediumPublishSettingItem2 = this.f114384a;
            if (mediumPublishSettingItem2 == null) {
                C52711k.m112237a("mediumPublishSettingItem");
            }
            mediumPublishSettingItem2.setEnable(true);
            MediumPublishSettingItem mediumPublishSettingItem3 = this.f114384a;
            if (mediumPublishSettingItem3 == null) {
                C52711k.m112237a("mediumPublishSettingItem");
            }
            RemoteImageView leftDrawableView = mediumPublishSettingItem3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "mediumPublishSettingItem.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        MediumPublishSettingItem mediumPublishSettingItem4 = this.f114384a;
        if (mediumPublishSettingItem4 == null) {
            C52711k.m112237a("mediumPublishSettingItem");
        }
        mediumPublishSettingItem4.setAlpha(0.5f);
        MediumPublishSettingItem mediumPublishSettingItem5 = this.f114384a;
        if (mediumPublishSettingItem5 == null) {
            C52711k.m112237a("mediumPublishSettingItem");
        }
        mediumPublishSettingItem5.setEnable(false);
        MediumPublishSettingItem mediumPublishSettingItem6 = this.f114384a;
        if (mediumPublishSettingItem6 == null) {
            C52711k.m112237a("mediumPublishSettingItem");
        }
        RemoteImageView leftDrawableView2 = mediumPublishSettingItem6.getLeftDrawableView();
        C52711k.m112236a((Object) leftDrawableView2, "mediumPublishSettingItem.leftDrawableView");
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
        this.f114385b = extensionMisc;
        Context context = linearLayout.getContext();
        C52711k.m112236a((Object) context, "container.context");
        MediumPublishSettingItem mediumPublishSettingItem = new MediumPublishSettingItem(context, null);
        linearLayout.addView(mediumPublishSettingItem, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        mediumPublishSettingItem.setGravity(16);
        mediumPublishSettingItem.setOrientation(0);
        int i = 8;
        mediumPublishSettingItem.setVisibility(8);
        this.f114384a = mediumPublishSettingItem;
        MediumPublishSettingItem mediumPublishSettingItem2 = this.f114384a;
        if (mediumPublishSettingItem2 == null) {
            C52711k.m112237a("mediumPublishSettingItem");
        }
        if (m98699a()) {
            i = 0;
        }
        mediumPublishSettingItem2.setVisibility(i);
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar, new C45219b(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar, new C45221c(this));
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.MEDIUM.getTYPE()) {
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
                MediumPublishSettingItem mediumPublishSettingItem3 = this.f114384a;
                if (mediumPublishSettingItem3 == null) {
                    C52711k.m112237a("mediumPublishSettingItem");
                }
                mediumPublishSettingItem3.setOnClickListener(new C45218a(gVar, this, extensionMisc));
            }
        }
    }
}
