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
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.MoviePublishModel;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x */
public final class C45229x implements IAVPublishExtension<MoviePublishModel> {

    /* renamed from: d */
    public static final C45230a f114405d = new C45230a(null);

    /* renamed from: a */
    public C45235y f114406a;

    /* renamed from: b */
    public Fragment f114407b;

    /* renamed from: c */
    public ExtensionMisc f114408c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$a */
    public static final class C45230a {
        private C45230a() {
        }

        public /* synthetic */ C45230a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$b */
    static final class C45231b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f114409a;

        /* renamed from: b */
        final /* synthetic */ C45229x f114410b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f114411c;

        C45231b(C25626g gVar, C45229x xVar, ExtensionMisc extensionMisc) {
            this.f114409a = gVar;
            this.f114410b = xVar;
            this.f114411c = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("add_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47826a("business_type", this.f114409a.f67830a).f61491a);
            if (C45229x.m98706a(this.f114410b).f113683j) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f114411c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData != null) {
                    Integer source = anchorTransData.getSource();
                    if (source != null && source.intValue() == 999) {
                        C10691a.m21545b(C45229x.m98706a(this.f114410b).getContext(), C45229x.m98706a(this.f114410b).getContext().getString(R.string.dq_)).mo19066a();
                        return;
                    } else if (C36811b.m82845a(anchorTransData.getSource())) {
                        return;
                    }
                }
                C36811b.m82841a(C45229x.m98706a(this.f114410b).getContext(), C25600a.INDIA_MOVIE);
            } else if (C52711k.m112239a((Object) (Boolean) this.f114411c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114411c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114411c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f114411c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10691a.m21545b(C45229x.m98706a(this.f114410b).getContext(), C45229x.m98706a(this.f114410b).getContext().getString(R.string.dq_)).mo19066a();
            } else {
                C10691a.m21545b(C45229x.m98706a(this.f114410b).getContext(), C45229x.m98706a(this.f114410b).getContext().getString(R.string.aka, new Object[]{C45229x.m98706a(this.f114410b).getContext().getString(R.string.gt2)})).mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$c */
    static final class C45232c<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45229x f114412a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114413b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$c$a */
        static final class C45233a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45232c f114414a;

            C45233a(C45232c cVar) {
                this.f114414a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C45229x xVar = this.f114414a.f114412a;
                ExtensionMisc extensionMisc = this.f114414a.f114413b;
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
                C45235y yVar = xVar.f114406a;
                if (yVar == null) {
                    C52711k.m112237a("delegate");
                }
                yVar.mo91509a();
                xVar.mo91507a(true);
                extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                return C52860x.f131107a;
            }
        }

        C45232c(C45229x xVar, ExtensionMisc extensionMisc) {
            this.f114412a = xVar;
            this.f114413b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    C45229x.m98706a(this.f114412a).mo91509a();
                } else {
                    C45235y a = C45229x.m98706a(this.f114412a);
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
                    a.mo91510a(anchorIcon, title, i, new C45233a(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$d */
    static final class C45234d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45229x f114415a;

        C45234d(C45229x xVar) {
            this.f114415a = xVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45229x xVar = this.f114415a;
                C52711k.m112236a((Object) bool, "it");
                xVar.mo91507a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "MoviePublishExtension";
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
        return new MoviePublishModel();
    }

    public final void onEnterChildrenMode() {
        C45235y yVar = this.f114406a;
        if (yVar == null) {
            C52711k.m112237a("delegate");
        }
        yVar.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98707a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.f114408c
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
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.INDIA_MOVIE
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45229x.m98707a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ C45235y m98706a(C45229x xVar) {
        C45235y yVar = xVar.f114406a;
        if (yVar == null) {
            C52711k.m112237a("delegate");
        }
        return yVar;
    }

    /* renamed from: a */
    public final void mo91507a(boolean z) {
        if (z) {
            C45235y yVar = this.f114406a;
            if (yVar == null) {
                C52711k.m112237a("delegate");
            }
            yVar.setAlpha(1.0f);
            C45235y yVar2 = this.f114406a;
            if (yVar2 == null) {
                C52711k.m112237a("delegate");
            }
            yVar2.setEnable(true);
            C45235y yVar3 = this.f114406a;
            if (yVar3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = yVar3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C45235y yVar4 = this.f114406a;
        if (yVar4 == null) {
            C52711k.m112237a("delegate");
        }
        yVar4.setAlpha(0.5f);
        C45235y yVar5 = this.f114406a;
        if (yVar5 == null) {
            C52711k.m112237a("delegate");
        }
        yVar5.setEnable(false);
        C45235y yVar6 = this.f114406a;
        if (yVar6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = yVar6.getLeftDrawableView();
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
        this.f114408c = extensionMisc;
        this.f114407b = fragment;
        C45235y yVar = new C45235y(linearLayout.getContext());
        linearLayout.addView(yVar, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        yVar.setGravity(16);
        yVar.setOrientation(0);
        int i = 8;
        yVar.setVisibility(8);
        this.f114406a = yVar;
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(kVar, new C45232c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(kVar, new C45234d(this));
        C45235y yVar2 = this.f114406a;
        if (yVar2 == null) {
            C52711k.m112237a("delegate");
        }
        if (m98707a()) {
            i = 0;
        }
        yVar2.setVisibility(i);
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.INDIA_MOVIE.getTYPE()) {
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
                C45235y yVar3 = this.f114406a;
                if (yVar3 == null) {
                    C52711k.m112237a("delegate");
                }
                yVar3.setOnClickListener(new C45231b(gVar, this, extensionMisc));
            }
        }
    }
}
