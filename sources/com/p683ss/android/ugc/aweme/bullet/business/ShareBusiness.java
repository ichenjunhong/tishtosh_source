package com.p683ss.android.ugc.aweme.bullet.business;

import android.content.Context;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42079d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.ShareBusiness */
public final class ShareBusiness extends AbsShareBusiness {

    /* renamed from: l */
    public WebView f64356l;

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.ShareBusiness$a */
    public static final class C24251a implements C42354e {

        /* renamed from: a */
        final /* synthetic */ ShareBusiness f64357a;

        /* renamed from: a */
        public final void mo49960a(SharePackage sharePackage, Context context) {
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
        }

        /* renamed from: b */
        public final void mo49962b(SharePackage sharePackage, Context context) {
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
        }

        C24251a(ShareBusiness shareBusiness) {
            this.f64357a = shareBusiness;
        }

        /* renamed from: a */
        public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
            C52711k.m112240b(gVar, "action");
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
            if (gVar instanceof C42079d) {
                this.f64357a.mo49967b(gVar.mo49954c());
            }
        }

        /* renamed from: a */
        public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
            C52711k.m112240b(bVar, "channel");
            C52711k.m112240b(context, "context");
            this.f64357a.mo49967b(bVar.mo86136b());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r5 == null) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49964a() {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.bullet.business.a r0 = r13.f64316k
            android.app.Activity r0 = r0.mo50010a()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r1 = r13.f64299b
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.bullet.business.a r1 = r13.f64316k
            com.bytedance.ies.bullet.ui.common.d.a r1 = r1.mo50019b()
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.bullet.module.base.C24336d
            r3 = 0
            if (r2 != 0) goto L_0x001a
            r1 = r3
        L_0x001a:
            com.ss.android.ugc.aweme.bullet.module.base.d r1 = (com.p683ss.android.ugc.aweme.bullet.module.base.C24336d) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "h5_page"
            r2.put(r4, r5)
            java.lang.String r4 = "previous_page"
            if (r1 == 0) goto L_0x0034
            java.lang.String r5 = r1.mo50125f()
            if (r5 != 0) goto L_0x0036
        L_0x0034:
            java.lang.String r5 = ""
        L_0x0036:
            r2.put(r4, r5)
            java.lang.String r4 = "scene_id"
            java.lang.String r5 = "1004"
            r2.put(r4, r5)
            java.lang.String r4 = "h5_click_more_button"
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r2)
            com.ss.android.ugc.aweme.sharer.ui.d$b r2 = new com.ss.android.ugc.aweme.sharer.ui.d$b
            r2.<init>()
            com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r4 = r13.f64299b
            r5 = 1
            if (r4 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.share.improve.b.d r12 = new com.ss.android.ugc.aweme.share.improve.b.d
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r4 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage) r4
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r12
            r7 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.sharer.b r12 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r12
            r2.mo86258a(r12)
            com.ss.android.ugc.aweme.share.ShareService r6 = com.p683ss.android.ugc.aweme.share.C41979aq.m91946a()
            r6.injectUniversalConfig(r2, r0, r5)
            r2.mo86259a(r4)
            r2.mo86270b(r5)
        L_0x006e:
            java.lang.String r0 = r13.f64301d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r4 = "Uri.parse(currentUrl)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            java.lang.String r0 = r0.getHost()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65491a()
            java.util.Collection r6 = (java.util.Collection) r6
            r4.<init>(r6)
            com.ss.android.ugc.aweme.app.v r6 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r7 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            com.ss.android.ugc.aweme.app.bf r6 = r6.mo47915k()
            java.lang.String r7 = "CommonSharePrefCache.inst().shareH5UrlWhiteList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object r6 = r6.mo47782d()
            java.util.Set r6 = (java.util.Set) r6
            java.util.Collection r6 = (java.util.Collection) r6
            r4.addAll(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x00a9:
            boolean r6 = r4.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x00be
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = com.p683ss.android.ugc.aweme.net.C37777i.m84365a(r0, r6)
            if (r6 == 0) goto L_0x00a9
            r0 = 1
            goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r13.f64302e
            if (r0 == 0) goto L_0x00c7
            r0 = 1
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            if (r0 != 0) goto L_0x00cd
            r2.mo86267b()
        L_0x00cd:
            java.util.List<java.lang.String> r0 = r13.f64300c
            java.lang.String r4 = "copylink"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.share.improve.a.d r0 = new com.ss.android.ugc.aweme.share.improve.a.d
            java.lang.String r4 = "fromWeb"
            r0.<init>(r4, r7, r5)
            com.ss.android.ugc.aweme.sharer.ui.g r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r0
            r2.mo86262a(r0)
        L_0x00e3:
            java.util.List<java.lang.String> r0 = r13.f64300c
            java.lang.String r4 = "refresh"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.share.improve.a.ad r0 = new com.ss.android.ugc.aweme.share.improve.a.ad
            r7 = 0
            r8 = 0
            android.webkit.WebView r9 = r13.f64356l
            r10 = 3
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.sharer.ui.g r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r0
            r2.mo86262a(r0)
        L_0x00fe:
            java.util.List<java.lang.String> r0 = r13.f64300c
            java.lang.String r4 = "browser"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0112
            com.ss.android.ugc.aweme.share.improve.a.z r0 = new com.ss.android.ugc.aweme.share.improve.a.z
            r0.<init>()
            com.ss.android.ugc.aweme.sharer.ui.g r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r0
            r2.mo86262a(r0)
        L_0x0112:
            r2.mo86265a(r5)
            com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r0 = r13.f64299b
            if (r0 == 0) goto L_0x0128
            android.os.Bundle r0 = r0.f106900i
            if (r0 == 0) goto L_0x0128
            java.lang.String r4 = "aweme_id"
            if (r1 == 0) goto L_0x0125
            java.lang.String r3 = r1.mo50124e()
        L_0x0125:
            r0.putString(r4, r3)
        L_0x0128:
            com.ss.android.ugc.aweme.bullet.business.ShareBusiness$a r0 = new com.ss.android.ugc.aweme.bullet.business.ShareBusiness$a
            r0.<init>(r13)
            com.ss.android.ugc.aweme.sharer.ui.e r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e) r0
            r2.mo86261a(r0)
            com.ss.android.ugc.aweme.share.improve.b r0 = new com.ss.android.ugc.aweme.share.improve.b
            android.app.Activity r4 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            if (r4 != 0) goto L_0x013d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x013d:
            com.ss.android.ugc.aweme.sharer.ui.d r5 = r2.mo86266a()
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.ShareBusiness.mo49964a():void");
    }

    public ShareBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBiz");
        super(aVar);
    }
}
