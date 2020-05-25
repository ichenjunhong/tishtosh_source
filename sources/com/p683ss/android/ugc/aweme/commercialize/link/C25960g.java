package com.p683ss.android.ugc.aweme.commercialize.link;

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
import com.p683ss.android.ugc.aweme.commercialize.model.C26130k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.LinkPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.trill.R;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.g */
public final class C25960g implements IAVPublishExtension<LinkPublishModel> {

    /* renamed from: c */
    public static final C25961a f68545c = new C25961a(null);

    /* renamed from: a */
    public C25959f f68546a;

    /* renamed from: b */
    public ExtensionMisc f68547b;

    /* renamed from: d */
    private String f68548d = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$a */
    public static final class C25961a {
        private C25961a() {
        }

        public /* synthetic */ C25961a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$b */
    static final class C25962b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25960g f68549a;

        /* renamed from: b */
        final /* synthetic */ Fragment f68550b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f68551c;

        C25962b(C25960g gVar, Fragment fragment, ExtensionMisc extensionMisc) {
            this.f68549a = gVar;
            this.f68550b = fragment;
            this.f68551c = extensionMisc;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f68549a.mo53315a().f113683j) {
                C26890h.m65011a("click_link_entrance", C52550ab.m112056b(C52856t.m112465a("entrance_location", "video_post_page")));
                Activity activity = this.f68550b.getActivity();
                String str2 = "publish";
                int hashCode = str2.hashCode();
                if (hashCode != -235365105) {
                    if (hashCode == 1434631203 && str2.equals("settings")) {
                        C25953d.f68530c.mo53301a(activity);
                    }
                } else if (str2.equals("publish")) {
                    C25953d.f68529b.mo53301a(activity);
                }
            } else if (C52711k.m112239a((Object) (Boolean) this.f68551c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f68551c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f68551c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                Context context = this.f68550b.getContext();
                Context context2 = this.f68550b.getContext();
                if (context2 != null) {
                    str = context2.getString(R.string.dq_);
                } else {
                    str = null;
                }
                C9432q.m18676a(context, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$c */
    public static final class C25963c implements C26130k {

        /* renamed from: a */
        final /* synthetic */ C39592a f68552a;

        /* renamed from: a */
        public final String mo53334a() {
            return this.f68552a.mo78634c();
        }

        /* renamed from: b */
        public final boolean mo53336b() {
            return this.f68552a.mo78636e();
        }

        C25963c(C39592a aVar) {
            this.f68552a = aVar;
        }

        /* renamed from: a */
        public final void mo53335a(String str) {
            C52711k.m112240b(str, "value");
            this.f68552a.mo78632a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$d */
    static final class C25964d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68553a;

        C25964d(C25960g gVar) {
            this.f68553a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C25960g gVar = this.f68553a;
                C52711k.m112236a((Object) bool, "it");
                gVar.mo53316a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$e */
    static final class C25965e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68554a;

        C25965e(C25960g gVar) {
            this.f68554a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f68554a.mo53317b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$f */
    static final class C25966f extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68555a;

        C25966f(C25960g gVar) {
            this.f68555a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            if (str != null) {
                this.f68555a.mo53315a().setLinkData(str);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$g */
    static final class C25967g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68556a;

        C25967g(C25960g gVar) {
            this.f68556a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f68556a.mo53318c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$h */
    static final class C25968h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68557a;

        C25968h(C25960g gVar) {
            this.f68557a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f68557a.mo53319d();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$i */
    static final class C25969i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68558a;

        C25969i(C25960g gVar) {
            this.f68558a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f68558a.mo53317b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$j */
    static final class C25970j extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68559a;

        C25970j(C25960g gVar) {
            this.f68559a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            if (str != null) {
                this.f68559a.mo53315a().setLinkData(str);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$k */
    static final class C25971k extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68560a;

        C25971k(C25960g gVar) {
            this.f68560a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f68560a.mo53318c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.g$l */
    static final class C25972l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25960g f68561a;

        C25972l(C25960g gVar) {
            this.f68561a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f68561a.mo53319d();
            return C52860x.f131107a;
        }
    }

    public final String getName() {
        return "LinkPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
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
        return new LinkPublishModel();
    }

    /* renamed from: a */
    public final C25959f mo53315a() {
        C25959f fVar = this.f68546a;
        if (fVar == null) {
            C52711k.m112237a("delegate");
        }
        return fVar;
    }

    /* renamed from: c */
    public final void mo53318c() {
        C25959f fVar = this.f68546a;
        if (fVar == null) {
            C52711k.m112237a("delegate");
        }
        this.f68548d = fVar.getLinkData();
    }

    public final void onEnterChildrenMode() {
        C25959f fVar = this.f68546a;
        if (fVar == null) {
            C52711k.m112237a("delegate");
        }
        fVar.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo53317b() {
        C25959f fVar = this.f68546a;
        if (fVar == null) {
            C52711k.m112237a("delegate");
        }
        fVar.setLinkData("");
        mo53316a(true);
    }

    /* renamed from: d */
    public final void mo53319d() {
        C25959f fVar = this.f68546a;
        if (fVar == null) {
            C52711k.m112237a("delegate");
        }
        fVar.setLinkData(this.f68548d);
        this.f68548d = "";
    }

    public final void onCreateFinish() {
        ExtensionMisc extensionMisc = this.f68547b;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        extensionMisc.getExtensionDataRepo().setResetLinkAction(new C25969i(this));
        ExtensionMisc extensionMisc2 = this.f68547b;
        if (extensionMisc2 == null) {
            C52711k.m112237a("extensionMisc");
        }
        extensionMisc2.getExtensionDataRepo().setUpdateLink(new C25970j(this));
        ExtensionMisc extensionMisc3 = this.f68547b;
        if (extensionMisc3 == null) {
            C52711k.m112237a("extensionMisc");
        }
        extensionMisc3.getExtensionDataRepo().setRecordLinkAction(new C25971k(this));
        ExtensionMisc extensionMisc4 = this.f68547b;
        if (extensionMisc4 == null) {
            C52711k.m112237a("extensionMisc");
        }
        extensionMisc4.getExtensionDataRepo().setRevertLinkAction(new C25972l(this));
    }

    /* renamed from: a */
    public final void mo53316a(boolean z) {
        if (z) {
            C25959f fVar = this.f68546a;
            if (fVar == null) {
                C52711k.m112237a("delegate");
            }
            fVar.setAlpha(1.0f);
            C25959f fVar2 = this.f68546a;
            if (fVar2 == null) {
                C52711k.m112237a("delegate");
            }
            fVar2.setEnable(true);
            return;
        }
        C25959f fVar3 = this.f68546a;
        if (fVar3 == null) {
            C52711k.m112237a("delegate");
        }
        fVar3.setAlpha(0.5f);
        C25959f fVar4 = this.f68546a;
        if (fVar4 == null) {
            C52711k.m112237a("delegate");
        }
        fVar4.setEnable(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.support.p030v4.app.Fragment r2, android.widget.LinearLayout r3, android.os.Bundle r4, com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType r5, com.p683ss.android.ugc.aweme.services.publish.PublishOutput r6, com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc r7, com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r8) {
        /*
            r1 = this;
            java.lang.String r4 = "fragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            java.lang.String r4 = "extensionWidgetContainer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            java.lang.String r4 = "contentType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r4)
            java.lang.String r4 = "publishOutput"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r4)
            java.lang.String r4 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r4)
            java.lang.String r4 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r4)
            r1.f68547b = r7
            com.ss.android.ugc.aweme.commercialize.link.f r4 = new com.ss.android.ugc.aweme.commercialize.link.f
            android.content.Context r5 = r3.getContext()
            r4.<init>(r5)
            android.content.Context r5 = r3.getContext()
            r6 = 1112539136(0x42500000, float:52.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r6)
            int r5 = (int) r5
            r6 = r4
            android.view.View r6 = (android.view.View) r6
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r0 = -1
            r8.<init>(r0, r5)
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r3.addView(r6, r8)
            r3 = 16
            r4.setGravity(r3)
            r3 = 0
            r4.setOrientation(r3)
            r5 = 8
            r4.setVisibility(r5)
            r1.f68546a = r4
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            r6 = 0
            if (r4 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getCurUser()
            if (r4 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r4 = r4.getCommerceUserInfo()
            if (r4 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.profile.model.LinkUserInfoStruct r4 = r4.getLinkUserInfo()
            if (r4 == 0) goto L_0x0072
            int r4 = r4.authStatus
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0073
        L_0x0072:
            r4 = r6
        L_0x0073:
            r8 = 2
            boolean r4 = com.p683ss.android.ugc.aweme.commercialize.link.C25953d.m62949a(r4, r8)
            if (r4 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.commercialize.link.f r4 = r1.f68546a
            if (r4 != 0) goto L_0x0083
            java.lang.String r8 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0083:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r8 = r1.f68547b
            if (r8 != 0) goto L_0x008c
            java.lang.String r0 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x008c:
            com.ss.android.ugc.aweme.port.in.bc$a r8 = r8.getPublishExtensionDataContainer()
            if (r8 == 0) goto L_0x0097
            java.lang.String r8 = r8.mo78634c()
            goto L_0x0098
        L_0x0097:
            r8 = r6
        L_0x0098:
            com.ss.android.ugc.aweme.commercialize.model.ad r8 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r8)
            java.lang.String r0 = "PublishExtensionModel\n  …                        )"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo r8 = r8.f68924f
            r0 = 1
            if (r8 == 0) goto L_0x00a8
            r8 = 0
            goto L_0x00a9
        L_0x00a8:
            r8 = 1
        L_0x00a9:
            if (r8 == 0) goto L_0x00ac
            r5 = 0
        L_0x00ac:
            r4.setVisibility(r5)
            com.ss.android.ugc.aweme.commercialize.link.f r4 = r1.f68546a
            if (r4 != 0) goto L_0x00b8
            java.lang.String r5 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00b8:
            com.ss.android.ugc.aweme.commercialize.link.g$b r5 = new com.ss.android.ugc.aweme.commercialize.link.g$b
            r5.<init>(r1, r2, r7)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
            java.lang.String r4 = "video_post_page"
            java.lang.String r5 = "show_link_entrance"
            d.n[] r8 = new p2628d.C52847n[r0]
            java.lang.String r0 = "entrance_location"
            d.n r4 = p2628d.C52856t.m112465a(r0, r4)
            r8[r3] = r4
            java.util.Map r3 = p2628d.p2629a.C52550ab.m112056b(r8)
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r3)
            goto L_0x00e4
        L_0x00d8:
            com.ss.android.ugc.aweme.commercialize.link.f r3 = r1.f68546a
            if (r3 != 0) goto L_0x00e1
            java.lang.String r4 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00e1:
            r3.setVisibility(r5)
        L_0x00e4:
            boolean r3 = r2 instanceof com.p683ss.android.ugc.aweme.commercialize.model.C26130k
            if (r3 == 0) goto L_0x00ec
            r6 = r2
            com.ss.android.ugc.aweme.commercialize.model.k r6 = (com.p683ss.android.ugc.aweme.commercialize.model.C26130k) r6
            goto L_0x00fb
        L_0x00ec:
            boolean r3 = r2 instanceof com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a
            if (r3 == 0) goto L_0x00fb
            r3 = r2
            com.ss.android.ugc.aweme.port.in.bc$a r3 = (com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a) r3
            com.ss.android.ugc.aweme.commercialize.link.g$c r4 = new com.ss.android.ugc.aweme.commercialize.link.g$c
            r4.<init>(r3)
            r6 = r4
            com.ss.android.ugc.aweme.commercialize.model.k r6 = (com.p683ss.android.ugc.aweme.commercialize.model.C26130k) r6
        L_0x00fb:
            if (r6 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.commercialize.link.f r3 = r1.f68546a
            if (r3 != 0) goto L_0x0106
            java.lang.String r4 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0106:
            r3.setCommerceDataContainer(r6)
        L_0x0109:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r3 = r7.getExtensionDataRepo()
            android.arch.lifecycle.r r3 = r3.getLinkState()
            android.arch.lifecycle.k r2 = (android.arch.lifecycle.C0184k) r2
            com.ss.android.ugc.aweme.commercialize.link.g$d r4 = new com.ss.android.ugc.aweme.commercialize.link.g$d
            r4.<init>(r1)
            android.arch.lifecycle.s r4 = (android.arch.lifecycle.C0199s) r4
            r3.observe(r2, r4)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r7.getExtensionDataRepo()
            com.ss.android.ugc.aweme.commercialize.link.g$e r3 = new com.ss.android.ugc.aweme.commercialize.link.g$e
            r3.<init>(r1)
            d.f.a.a r3 = (p2628d.p2639f.p2640a.C52670a) r3
            r2.setResetLinkAction(r3)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r7.getExtensionDataRepo()
            com.ss.android.ugc.aweme.commercialize.link.g$f r3 = new com.ss.android.ugc.aweme.commercialize.link.g$f
            r3.<init>(r1)
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            r2.setUpdateLink(r3)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r7.getExtensionDataRepo()
            com.ss.android.ugc.aweme.commercialize.link.g$g r3 = new com.ss.android.ugc.aweme.commercialize.link.g$g
            r3.<init>(r1)
            d.f.a.a r3 = (p2628d.p2639f.p2640a.C52670a) r3
            r2.setRecordLinkAction(r3)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r7.getExtensionDataRepo()
            com.ss.android.ugc.aweme.commercialize.link.g$h r3 = new com.ss.android.ugc.aweme.commercialize.link.g$h
            r3.<init>(r1)
            d.f.a.a r3 = (p2628d.p2639f.p2640a.C52670a) r3
            r2.setRevertLinkAction(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.link.C25960g.onCreate(android.support.v4.app.Fragment, android.widget.LinearLayout, android.os.Bundle, com.ss.android.ugc.aweme.services.publish.AVPublishContentType, com.ss.android.ugc.aweme.services.publish.PublishOutput, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback):void");
    }
}
