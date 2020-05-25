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
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.services.publish.WikiPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45088a;
import com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dh */
public final class C45165dh implements IAVPublishExtension<WikiPublishModel> {

    /* renamed from: a */
    public C45170di f114280a;

    /* renamed from: b */
    public ExtensionMisc f114281b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dh$a */
    static final class C45166a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f114282a;

        /* renamed from: b */
        final /* synthetic */ C45165dh f114283b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f114284c;

        /* renamed from: d */
        final /* synthetic */ Fragment f114285d;

        C45166a(C25626g gVar, C45165dh dhVar, ExtensionMisc extensionMisc, Fragment fragment) {
            this.f114282a = gVar;
            this.f114283b = dhVar;
            this.f114284c = extensionMisc;
            this.f114285d = fragment;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("add_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47826a("business_type", this.f114282a.f67830a).f61491a);
            if (this.f114283b.mo91470a().f113683j) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f114284c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData != null) {
                    Integer source = anchorTransData.getSource();
                    if (source != null && source.intValue() == 999) {
                        C10691a.m21545b(this.f114283b.mo91470a().getContext(), this.f114283b.mo91470a().getContext().getString(R.string.dq_)).mo19066a();
                        return;
                    } else if (C36811b.m82845a(anchorTransData.getSource())) {
                        return;
                    }
                }
                if (this.f114282a.f67830a != C25600a.WIKIPEDIA.getTYPE()) {
                    if (this.f114282a.f67830a == C25600a.YELP.getTYPE()) {
                        str = "Yelp";
                    } else {
                        str = "TripAdvisor";
                    }
                    Context context = this.f114283b.mo91470a().getContext();
                    C52711k.m112236a((Object) context, "delegate.context");
                    String str2 = this.f114282a.f67833d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C52847n[] nVarArr = new C52847n[6];
                    nVarArr[0] = C52856t.m112465a("title", this.f114285d.getString(R.string.am1));
                    String str3 = "shoot_way";
                    String shootWay = this.f114284c.getMobParam().getShootWay();
                    if (shootWay == null) {
                        shootWay = "";
                    }
                    nVarArr[1] = C52856t.m112465a(str3, shootWay);
                    String str4 = "creation_id";
                    String creationId = this.f114284c.getMobParam().getCreationId();
                    if (creationId == null) {
                        creationId = "";
                    }
                    nVarArr[2] = C52856t.m112465a(str4, creationId);
                    nVarArr[3] = C52856t.m112465a("host_filter", "true");
                    nVarArr[4] = C52856t.m112465a("anchor_type", str);
                    nVarArr[5] = C52856t.m112465a("addButton", "true");
                    C48397a.m104727a(context, str2, C52550ab.m112050a(nVarArr));
                } else if (this.f114284c.getHasEditPageWikiAnchor()) {
                    C10691a.m21551c(this.f114283b.mo91470a().getContext(), this.f114283b.mo91470a().getContext().getString(R.string.hwm)).mo19066a();
                } else {
                    Context context2 = this.f114283b.mo91470a().getContext();
                    C52711k.m112236a((Object) context2, "delegate.context");
                    String str5 = this.f114282a.f67833d;
                    if (str5 == null) {
                        str5 = "";
                    }
                    C52847n[] nVarArr2 = new C52847n[4];
                    nVarArr2[0] = C52856t.m112465a("title", this.f114285d.getString(R.string.am1));
                    String str6 = "shoot_way";
                    String shootWay2 = this.f114284c.getMobParam().getShootWay();
                    if (shootWay2 == null) {
                        shootWay2 = "";
                    }
                    nVarArr2[1] = C52856t.m112465a(str6, shootWay2);
                    String str7 = "creation_id";
                    String creationId2 = this.f114284c.getMobParam().getCreationId();
                    if (creationId2 == null) {
                        creationId2 = "";
                    }
                    nVarArr2[2] = C52856t.m112465a(str7, creationId2);
                    nVarArr2[3] = C52856t.m112465a("show_keyboard", "true");
                    C48397a.m104727a(context2, str5, C52550ab.m112050a(nVarArr2));
                }
            } else if (C52711k.m112239a((Object) (Boolean) this.f114284c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114284c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114284c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114284c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C9432q.m18676a(this.f114283b.mo91470a().getContext(), this.f114283b.mo91470a().getContext().getString(R.string.dq_));
            } else {
                C9432q.m18676a(this.f114283b.mo91470a().getContext(), this.f114283b.mo91470a().getContext().getString(R.string.aka, new Object[]{this.f114283b.mo91470a().getContext().getString(R.string.am1)}));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dh$b */
    static final class C45167b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45165dh f114286a;

        C45167b(C45165dh dhVar) {
            this.f114286a = dhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45165dh dhVar = this.f114286a;
                C52711k.m112236a((Object) bool, "it");
                dhVar.mo91471a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dh$c */
    static final class C45168c<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45165dh f114287a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114288b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dh$c$a */
        static final class C45169a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f114289a;

            /* renamed from: b */
            final /* synthetic */ C45168c f114290b;

            C45169a(AnchorTransData anchorTransData, C45168c cVar) {
                this.f114289a = anchorTransData;
                this.f114290b = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                if (!this.f114290b.f114287a.mo91470a().f113683j) {
                    C9432q.m18676a(this.f114290b.f114287a.mo91470a().getContext(), this.f114290b.f114287a.mo91470a().getContext().getString(R.string.aka, new Object[]{this.f114290b.f114287a.mo91470a().getContext().getString(R.string.am1)}));
                } else {
                    C26890h.m65011a("delete_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47829a("shoot_way", this.f114290b.f114288b.getMobParam().getShootWay()).mo47829a("creation_id", this.f114290b.f114288b.getMobParam().getCreationId()).mo47826a("business_type", this.f114289a.getBusinessType()).f61491a);
                    C45165dh dhVar = this.f114290b.f114287a;
                    C39592a publishExtensionDataContainer = this.f114290b.f114288b.getPublishExtensionDataContainer();
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
                    C45170di diVar = dhVar.f114280a;
                    if (diVar == null) {
                        C52711k.m112237a("delegate");
                    }
                    diVar.mo91473a();
                    dhVar.mo91471a(true);
                    this.f114290b.f114288b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                    this.f114290b.f114288b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                    this.f114290b.f114288b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                }
                return C52860x.f131107a;
            }
        }

        C45168c(C45165dh dhVar, ExtensionMisc extensionMisc) {
            this.f114287a = dhVar;
            this.f114288b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    this.f114287a.mo91470a().mo91473a();
                } else {
                    C45170di a = this.f114287a.mo91470a();
                    UrlModel anchorIcon = anchorTransData.getAnchorIcon();
                    if (anchorIcon == null) {
                        anchorIcon = C45088a.m98613a(Integer.valueOf(anchorTransData.getBusinessType()));
                    }
                    String title = anchorTransData.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    Integer source2 = anchorTransData.getSource();
                    if (source2 != null) {
                        i = source2.intValue();
                    } else {
                        i = 0;
                    }
                    a.mo91474a(anchorIcon, title, i, new C45169a(anchorTransData, this));
                }
            }
        }
    }

    public final String getName() {
        return "WikiPublishExtension";
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
        return new WikiPublishModel();
    }

    /* renamed from: a */
    public final C45170di mo91470a() {
        C45170di diVar = this.f114280a;
        if (diVar == null) {
            C52711k.m112237a("delegate");
        }
        return diVar;
    }

    public final void onEnterChildrenMode() {
        C45170di diVar = this.f114280a;
        if (diVar == null) {
            C52711k.m112237a("delegate");
        }
        diVar.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98652b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f114281b
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
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45165dh.m98652b():boolean");
    }

    /* renamed from: a */
    public final void mo91471a(boolean z) {
        if (z) {
            C45170di diVar = this.f114280a;
            if (diVar == null) {
                C52711k.m112237a("delegate");
            }
            diVar.setAlpha(1.0f);
            C45170di diVar2 = this.f114280a;
            if (diVar2 == null) {
                C52711k.m112237a("delegate");
            }
            diVar2.setEnable(true);
            C45170di diVar3 = this.f114280a;
            if (diVar3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = diVar3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C45170di diVar4 = this.f114280a;
        if (diVar4 == null) {
            C52711k.m112237a("delegate");
        }
        diVar4.setAlpha(0.5f);
        C45170di diVar5 = this.f114280a;
        if (diVar5 == null) {
            C52711k.m112237a("delegate");
        }
        diVar5.setEnable(false);
        C45170di diVar6 = this.f114280a;
        if (diVar6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = diVar6.getLeftDrawableView();
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
        this.f114281b = extensionMisc;
        C45170di diVar = new C45170di(linearLayout.getContext());
        linearLayout.addView(diVar, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        diVar.setGravity(16);
        diVar.setOrientation(0);
        int i = 8;
        diVar.setVisibility(8);
        this.f114280a = diVar;
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar, new C45167b(this));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar, new C45168c(this, extensionMisc));
        C45170di diVar2 = this.f114280a;
        if (diVar2 == null) {
            C52711k.m112237a("delegate");
        }
        if (m98652b()) {
            i = 0;
        }
        diVar2.setVisibility(i);
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C25626g gVar = (C25626g) obj;
                if (gVar.f67830a == C25600a.WIKIPEDIA.getTYPE() || gVar.f67830a == C25600a.YELP.getTYPE() || gVar.f67830a == C25600a.TRIP_ADVISOR.getTYPE()) {
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
                C45170di diVar3 = this.f114280a;
                if (diVar3 == null) {
                    C52711k.m112237a("delegate");
                }
                diVar3.setOnClickListener(new C45166a(gVar2, this, extensionMisc, fragment));
            }
        }
    }
}
