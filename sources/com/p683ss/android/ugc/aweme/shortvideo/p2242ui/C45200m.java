package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.I18nShopPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45385ai;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45397ao;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.m */
public final class C45200m implements IAVPublishExtension<I18nShopPublishModel> {

    /* renamed from: a */
    public I18nShopPublishSettingItem f114348a;

    /* renamed from: b */
    public MentionEditText f114349b;

    /* renamed from: c */
    public Context f114350c;

    /* renamed from: d */
    private Fragment f114351d;

    /* renamed from: e */
    private ExtensionMisc f114352e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.m$a */
    static final class C45201a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f114353a;

        /* renamed from: b */
        final /* synthetic */ C45200m f114354b;

        /* renamed from: c */
        final /* synthetic */ Fragment f114355c;

        /* renamed from: d */
        final /* synthetic */ PublishOutput f114356d;

        /* renamed from: e */
        final /* synthetic */ AVPublishContentType f114357e;

        /* renamed from: f */
        final /* synthetic */ ExtensionMisc f114358f;

        C45201a(C25626g gVar, C45200m mVar, Fragment fragment, PublishOutput publishOutput, AVPublishContentType aVPublishContentType, ExtensionMisc extensionMisc) {
            this.f114353a = gVar;
            this.f114354b = mVar;
            this.f114355c = fragment;
            this.f114356d = publishOutput;
            this.f114357e = aVPublishContentType;
            this.f114358f = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("add_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47826a("business_type", this.f114353a.f67830a).f61491a);
            if (C45200m.m98687a(this.f114354b).f113683j) {
                if (this.f114353a.f67833d != null) {
                    String uri = C37382g.m83707a(this.f114353a.f67833d).mo76659a("need_bottom_out", "1").mo76658a().toString();
                    C52711k.m112236a((Object) uri, "RnSchemeHelper.parseRnSc…              .toString()");
                    C41302w.m91042a().mo83858a((Activity) this.f114355c.getActivity(), uri);
                }
            } else if (C45397ao.m98954a(this.f114356d, this.f114357e)) {
                C9432q.m18676a(C45200m.m98687a(this.f114354b).getContext(), C45200m.m98687a(this.f114354b).getContext().getString(R.string.bwx));
            } else {
                if (C52711k.m112239a((Object) (Boolean) this.f114358f.getExtensionDataRepo().getAnchorState().getValue(), (Object) Boolean.valueOf(false))) {
                    C9432q.m18676a(C45200m.m98687a(this.f114354b).getContext(), C45200m.m98687a(this.f114354b).getContext().getString(R.string.aka, new Object[]{C45200m.m98687a(this.f114354b).getContext().getString(R.string.a2n)}));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.m$b */
    static final class C45202b<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45200m f114359a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114360b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.m$b$a */
        static final class C45203a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f114361a;

            /* renamed from: b */
            final /* synthetic */ C45202b f114362b;

            C45203a(AnchorTransData anchorTransData, C45202b bVar) {
                this.f114361a = anchorTransData;
                this.f114362b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                if (C45200m.m98687a(this.f114362b.f114359a).getVisibility() == 0) {
                    C45385ai.m98942a(this.f114362b.f114359a.f114349b);
                }
                C26890h.m65011a("delete_label", new C23089d().mo47829a("enter_from", "video_publish_page").mo47829a("shoot_way", this.f114362b.f114360b.getMobParam().getShootWay()).mo47829a("creation_id", this.f114362b.f114360b.getMobParam().getCreationId()).mo47826a("business_type", this.f114361a.getBusinessType()).f61491a);
                C45200m mVar = this.f114362b.f114359a;
                C39592a publishExtensionDataContainer = this.f114362b.f114360b.getPublishExtensionDataContainer();
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
                I18nShopPublishSettingItem i18nShopPublishSettingItem = mVar.f114348a;
                if (i18nShopPublishSettingItem == null) {
                    C52711k.m112237a("delegate");
                }
                i18nShopPublishSettingItem.mo91054a();
                mVar.mo91492a(true);
                this.f114362b.f114360b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                this.f114362b.f114360b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                this.f114362b.f114360b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                return C52860x.f131107a;
            }
        }

        C45202b(C45200m mVar, ExtensionMisc extensionMisc) {
            this.f114359a = mVar;
            this.f114360b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Object obj2;
            boolean z;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                List b = AnchorListManager.f67772d.mo52758b();
                if (b != null) {
                    Iterator it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (anchorTransData.getBusinessType() == ((C25626g) obj2).f67830a) {
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
                    C25626g gVar = (C25626g) obj2;
                    if (gVar != null) {
                        I18nShopPublishSettingItem a = C45200m.m98687a(this.f114359a);
                        UrlModel urlModel = gVar.f67834e;
                        String title = anchorTransData.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        C52670a aVar = new C45203a(anchorTransData, this);
                        C52711k.m112240b(urlModel, "addIcon");
                        C52711k.m112240b(title, "title");
                        C52711k.m112240b(aVar, "clearAction");
                        C23515d.m57669a(a.getLeftDrawableView(), urlModel);
                        a.setDrawableRight((int) R.drawable.aiy);
                        a.setRightIconListener(new C44904b(a, aVar));
                        a.setTitle(title);
                        if (C45200m.m98687a(this.f114359a).getVisibility() == 0) {
                            C45385ai.m98941a(this.f114359a.f114350c, this.f114359a.f114349b, gVar.f67839j);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.m$c */
    static final class C45204c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45200m f114363a;

        C45204c(C45200m mVar) {
            this.f114363a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    this.f114363a.mo91492a(true);
                } else {
                    this.f114363a.mo91492a(false);
                }
            }
        }
    }

    public final String getName() {
        return "I18nShopPublishExtension";
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
        return new I18nShopPublishModel();
    }

    public final void onEnterChildrenMode() {
        I18nShopPublishSettingItem i18nShopPublishSettingItem = this.f114348a;
        if (i18nShopPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        i18nShopPublishSettingItem.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m98688a() {
        /*
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f67772d
            java.util.List r0 = r0.mo52758b()
            r1 = 0
            if (r0 == 0) goto L_0x0045
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L_0x0044
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x001f
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0040
        L_0x001f:
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.commercialize.anchor.g r2 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r2
            int r2 = r2.f67830a
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ANCHOR_SHOP_LINK
            int r4 = r4.getTYPE()
            if (r2 != r4) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            return r1
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45200m.m98688a():boolean");
    }

    /* renamed from: a */
    public static final /* synthetic */ I18nShopPublishSettingItem m98687a(C45200m mVar) {
        I18nShopPublishSettingItem i18nShopPublishSettingItem = mVar.f114348a;
        if (i18nShopPublishSettingItem == null) {
            C52711k.m112237a("delegate");
        }
        return i18nShopPublishSettingItem;
    }

    /* renamed from: a */
    public final void mo91492a(boolean z) {
        if (z) {
            I18nShopPublishSettingItem i18nShopPublishSettingItem = this.f114348a;
            if (i18nShopPublishSettingItem == null) {
                C52711k.m112237a("delegate");
            }
            i18nShopPublishSettingItem.setAlpha(1.0f);
            I18nShopPublishSettingItem i18nShopPublishSettingItem2 = this.f114348a;
            if (i18nShopPublishSettingItem2 == null) {
                C52711k.m112237a("delegate");
            }
            i18nShopPublishSettingItem2.setEnable(true);
            I18nShopPublishSettingItem i18nShopPublishSettingItem3 = this.f114348a;
            if (i18nShopPublishSettingItem3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = i18nShopPublishSettingItem3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        I18nShopPublishSettingItem i18nShopPublishSettingItem4 = this.f114348a;
        if (i18nShopPublishSettingItem4 == null) {
            C52711k.m112237a("delegate");
        }
        i18nShopPublishSettingItem4.setAlpha(0.5f);
        I18nShopPublishSettingItem i18nShopPublishSettingItem5 = this.f114348a;
        if (i18nShopPublishSettingItem5 == null) {
            C52711k.m112237a("delegate");
        }
        i18nShopPublishSettingItem5.setEnable(false);
        I18nShopPublishSettingItem i18nShopPublishSettingItem6 = this.f114348a;
        if (i18nShopPublishSettingItem6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = i18nShopPublishSettingItem6.getLeftDrawableView();
        C52711k.m112236a((Object) leftDrawableView2, "delegate.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.support.p030v4.app.Fragment r8, android.widget.LinearLayout r9, android.os.Bundle r10, com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType r11, com.p683ss.android.ugc.aweme.services.publish.PublishOutput r12, com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc r13, com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r14) {
        /*
            r7 = this;
            java.lang.String r10 = "fragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r10)
            java.lang.String r10 = "extensionWidgetContainer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
            java.lang.String r10 = "contentType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r10)
            java.lang.String r10 = "publishOutput"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r10)
            java.lang.String r10 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r10)
            java.lang.String r10 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r10)
            r7.f114351d = r8
            android.content.Context r10 = r8.getContext()
            r7.f114350c = r10
            android.view.View r10 = r8.getView()
            r14 = 0
            if (r10 == 0) goto L_0x0037
            r0 = 2132018756(0x7f140644, float:1.9675828E38)
            android.view.View r10 = r10.findViewById(r0)
            com.ss.android.ugc.aweme.views.mention.MentionEditText r10 = (com.p683ss.android.ugc.aweme.views.mention.MentionEditText) r10
            goto L_0x0038
        L_0x0037:
            r10 = r14
        L_0x0038:
            r7.f114349b = r10
            r7.f114352e = r13
            com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem r10 = new com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "container.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r0)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Context r0 = r9.getContext()
            r1 = 1112539136(0x42500000, float:52.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            r1 = r10
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r0)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r9.addView(r1, r2)
            r9 = 16
            r10.setGravity(r9)
            r9 = 0
            r10.setOrientation(r9)
            r0 = 8
            r10.setVisibility(r0)
            r7.f114348a = r10
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r10 = r13.getExtensionDataRepo()
            android.arch.lifecycle.r r10 = r10.getUpdateAnchor()
            r1 = r8
            android.arch.lifecycle.k r1 = (android.arch.lifecycle.C0184k) r1
            com.ss.android.ugc.aweme.shortvideo.ui.m$b r2 = new com.ss.android.ugc.aweme.shortvideo.ui.m$b
            r2.<init>(r7, r13)
            android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
            r10.observe(r1, r2)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r10 = r13.getExtensionDataRepo()
            android.arch.lifecycle.r r10 = r10.getAnchorState()
            com.ss.android.ugc.aweme.shortvideo.ui.m$c r2 = new com.ss.android.ugc.aweme.shortvideo.ui.m$c
            r2.<init>(r7)
            android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
            r10.observe(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem r10 = r7.f114348a
            if (r10 != 0) goto L_0x00a8
            java.lang.String r1 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00a8:
            boolean r1 = m98688a()
            if (r1 == 0) goto L_0x00af
            r0 = 0
        L_0x00af:
            r10.setVisibility(r0)
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r10 = com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f67772d
            java.util.List r10 = r10.mo52758b()
            if (r10 == 0) goto L_0x00fb
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00c0:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r10.next()
            r1 = r0
            com.ss.android.ugc.aweme.commercialize.anchor.g r1 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r1
            int r1 = r1.f67830a
            com.ss.android.ugc.aweme.commercialize.anchor.a r2 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ANCHOR_SHOP_LINK
            int r2 = r2.getTYPE()
            if (r1 != r2) goto L_0x00d9
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            if (r1 == 0) goto L_0x00c0
            r14 = r0
        L_0x00dd:
            r1 = r14
            com.ss.android.ugc.aweme.commercialize.anchor.g r1 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r1
            if (r1 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem r10 = r7.f114348a
            if (r10 != 0) goto L_0x00eb
            java.lang.String r14 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r14)
        L_0x00eb:
            com.ss.android.ugc.aweme.shortvideo.ui.m$a r14 = new com.ss.android.ugc.aweme.shortvideo.ui.m$a
            r0 = r14
            r2 = r7
            r3 = r8
            r4 = r12
            r5 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.view.View$OnClickListener r14 = (android.view.View.OnClickListener) r14
            r10.setOnClickListener(r14)
        L_0x00fb:
            boolean r8 = com.p683ss.android.ugc.aweme.shortvideo.util.C45397ao.m98954a(r12, r11)
            if (r8 == 0) goto L_0x0104
            r7.mo91492a(r9)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45200m.onCreate(android.support.v4.app.Fragment, android.widget.LinearLayout, android.os.Bundle, com.ss.android.ugc.aweme.services.publish.AVPublishContentType, com.ss.android.ugc.aweme.services.publish.PublishOutput, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback):void");
    }
}
