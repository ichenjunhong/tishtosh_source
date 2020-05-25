package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j;
import com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView;
import com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26577c;
import com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26579e;
import com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26653b.C26656c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget */
public final class AdLightWebPageWidget extends AbsAdFeedWidget {

    /* renamed from: a */
    public static final C26803a f70624a = new C26803a(null);

    /* renamed from: j */
    private AdLightWebPageView f70625j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$a */
    public static final class C26803a {
        private C26803a() {
        }

        public /* synthetic */ C26803a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m64795a(Aweme aweme) {
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    return awemeRawAd.getLightWebUrl();
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$b */
    static final class C26804b extends C52712l implements C52671b<C26656c, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25720j f70626a;

        C26804b(C25720j jVar) {
            this.f70626a = jVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
            if (r0 == null) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$c r3 = (com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26653b.C26656c) r3
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                com.ss.android.ugc.aweme.commercialize.d.j r0 = r2.f70626a
                org.json.JSONObject r0 = r0.f68033b
                if (r0 == 0) goto L_0x0015
                java.lang.String r1 = "init"
                java.lang.String r0 = r0.optString(r1)
                if (r0 != 0) goto L_0x0017
            L_0x0015:
                java.lang.String r0 = ""
            L_0x0017:
                r3.f70258a = r0
                d.x r3 = p2628d.C52860x.f131107a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget.C26804b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$c */
    static final class C26805c extends C52712l implements C52671b<C26579e, C52860x> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageWidget f70627a;

        /* renamed from: b */
        final /* synthetic */ String f70628b;

        C26805c(AdLightWebPageWidget adLightWebPageWidget, String str) {
            this.f70627a = adLightWebPageWidget;
            this.f70628b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C26579e eVar = (C26579e) obj;
            C52711k.m112240b(eVar, "$receiver");
            String str = this.f70628b;
            C52711k.m112240b(str, "<set-?>");
            eVar.f69993a = str;
            eVar.f69994b = this.f70627a.f70585i;
            eVar.f69995c = this.f70627a.f70584h;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$d */
    public static final class C26806d implements C26577c {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageWidget f70629a;

        /* renamed from: a */
        public final void mo54321a() {
            DataCenter dataCenter = this.f70629a.f62238e;
            if (dataCenter != null) {
                dataCenter.mo48228a("on_ad_light_web_page_show", (Object) null);
            }
        }

        /* renamed from: b */
        public final void mo54322b() {
            DataCenter dataCenter = this.f70629a.f62238e;
            if (dataCenter != null) {
                dataCenter.mo48228a("on_ad_light_web_page_hide", (Object) null);
            }
        }

        /* renamed from: c */
        public final void mo54323c() {
            DataCenter dataCenter = this.f70629a.f62238e;
            if (dataCenter != null) {
                dataCenter.mo48228a("AD_ACTION_REPLAY_VIDEO", (Object) null);
            }
        }

        C26806d(AdLightWebPageWidget adLightWebPageWidget) {
            this.f70629a = adLightWebPageWidget;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54694d() {
        super.mo54694d();
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            C0199s sVar = this;
            dataCenter.mo48226a("ad_feed_on_page_selected", sVar);
            dataCenter.mo48226a("ad_feed_on_page_unselected", sVar);
            dataCenter.mo48226a("ad_on_receive_js_bridge_event", sVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        if (r2 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0203  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r11) {
        /*
            r10 = this;
            super.onChanged(r11)
            r0 = 0
            if (r11 == 0) goto L_0x0009
            java.lang.String r1 = r11.f62242a
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            if (r1 != 0) goto L_0x000d
            return
        L_0x000d:
            int r2 = r1.hashCode()
            r3 = -1540531799(0xffffffffa42d59a9, float:-3.758934E-17)
            if (r2 == r3) goto L_0x0282
            r3 = -1132409520(0xffffffffbc80cd50, float:-0.0157229)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x01d1
            r3 = -690921606(0xffffffffd6d15f7a, float:-1.15103999E14)
            if (r2 == r3) goto L_0x0024
            goto L_0x02dc
        L_0x0024:
            java.lang.String r2 = "ad_on_receive_js_bridge_event"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02dc
            java.lang.Object r11 = r11.mo48246a()
            com.ss.android.ugc.aweme.commercialize.d.j r11 = (com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j) r11
            if (r11 != 0) goto L_0x0035
            return
        L_0x0035:
            java.lang.Object r1 = r11.f68035d
            boolean r2 = r1 instanceof com.bytedance.ies.p675g.p676a.C10757a
            if (r2 != 0) goto L_0x003c
            r1 = r0
        L_0x003c:
            com.bytedance.ies.g.a.a r1 = (com.bytedance.ies.p675g.p676a.C10757a) r1
            java.lang.String r2 = r11.f68032a
            int r3 = r2.hashCode()
            r6 = 898583738(0x358f4cba, float:1.0676661E-6)
            if (r3 == r6) goto L_0x0145
            r6 = 1518137890(0x5a7cf222, float:1.77994805E16)
            if (r3 == r6) goto L_0x0129
            r4 = 1531924954(0x5b4f51da, float:5.8355317E16)
            if (r3 == r4) goto L_0x0091
            r0 = 2049435752(0x7a27e868, float:2.1795683E35)
            if (r3 == r0) goto L_0x005a
            goto L_0x02dc
        L_0x005a:
            java.lang.String r0 = "closeLightLandingPage"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02dc
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r0 = r10.f70625j
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.mo54307a()
            if (r0 != r5) goto L_0x0073
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r0 = r10.f70625j
            if (r0 == 0) goto L_0x0073
            r0.dismiss()
        L_0x0073:
            if (r1 == 0) goto L_0x0090
            java.lang.String r11 = r11.f68034c
            org.json.JSONObject r0 = new org.json.JSONObject
            d.n r2 = new d.n
            java.lang.String r3 = "code"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.<init>(r3, r4)
            java.util.Map r2 = p2628d.p2629a.C52550ab.m112042a(r2)
            r0.<init>(r2)
            r1.mo19455a(r11, r0)
            goto L_0x02dc
        L_0x0090:
            return
        L_0x0091:
            java.lang.String r3 = "openPanel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02dc
            org.json.JSONObject r2 = r11.f68033b
            if (r2 == 0) goto L_0x00a3
            java.lang.String r0 = "type"
            java.lang.Object r0 = r2.opt(r0)
        L_0x00a3:
            java.lang.String r2 = "menu"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x00ea
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()
            com.google.gson.f r0 = r0.getGson()
            org.json.JSONObject r2 = r11.f68033b
            if (r2 == 0) goto L_0x00bd
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x00bf
        L_0x00bd:
            java.lang.String r2 = ""
        L_0x00bf:
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.ab> r3 = com.p683ss.android.ugc.aweme.commercialize.model.C26107ab.class
            java.lang.Object r0 = r0.mo34884a(r2, r3)
            com.ss.android.ugc.aweme.commercialize.model.ab r0 = (com.p683ss.android.ugc.aweme.commercialize.model.C26107ab) r0
            if (r0 == 0) goto L_0x00e9
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r2 = r10.f70625j
            if (r2 == 0) goto L_0x02dc
            java.lang.String r11 = r11.f68034c
            java.lang.String r3 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d r3 = new com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4, r0)
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$z r0 = new com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$z
            r0.<init>(r2, r1, r11)
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$a r0 = (com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26666d.C26667a) r0
            r3.f70273d = r0
            r3.show()
        L_0x00e9:
            return
        L_0x00ea:
            java.lang.String r2 = "datePicker"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r0 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r0 = r10.f70625j
            if (r0 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$c$a r2 = new com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$c$a
            r2.<init>()
            com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$b r3 = new com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$b
            r3.<init>(r11)
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            com.ss.android.ugc.aweme.commercialize.utils.bl r2 = r2.mo54142a(r3)
            T r2 = r2.f69675a
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$c r2 = (com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26653b.C26656c) r2
            java.lang.String r11 = r11.f68034c
            java.lang.String r3 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b r3 = new com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b
            android.content.Context r4 = r0.getContext()
            r3.<init>(r4, r2)
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$y r2 = new com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$y
            r2.<init>(r0, r1, r11)
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$a r2 = (com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26653b.C26654a) r2
            r3.f70254b = r2
            r3.show()
            goto L_0x02dc
        L_0x0128:
            return
        L_0x0129:
            java.lang.String r0 = "openAdUrl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02dc
            org.json.JSONObject r11 = r11.f68033b
            if (r11 == 0) goto L_0x013b
            java.lang.String r0 = "close_current_page"
            boolean r4 = r11.optBoolean(r0)
        L_0x013b:
            if (r4 == 0) goto L_0x02dc
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r11 = r10.f70625j
            if (r11 == 0) goto L_0x02dc
            r11.dismiss()
            return
        L_0x0145:
            java.lang.String r3 = "openLightLandingPage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02dc
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r2 = r10.f70625j
            if (r2 == 0) goto L_0x01b3
            boolean r2 = r2.mo54307a()
            if (r2 != 0) goto L_0x01b3
            org.json.JSONObject r2 = r11.f68033b
            if (r2 == 0) goto L_0x0162
            java.lang.String r3 = "clickFrom"
            java.lang.String r2 = r2.optString(r3)
            goto L_0x0163
        L_0x0162:
            r2 = r0
        L_0x0163:
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r3 = r10.f70625j
            if (r3 == 0) goto L_0x0174
            if (r2 != 0) goto L_0x0170
            r6 = 25
            java.lang.String r6 = com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness.C27167a.m65569a(r6)
            goto L_0x0171
        L_0x0170:
            r6 = r2
        L_0x0171:
            r3.mo54306a(r6)
        L_0x0174:
            if (r1 == 0) goto L_0x018f
            java.lang.String r3 = r11.f68034c
            org.json.JSONObject r6 = new org.json.JSONObject
            d.n r7 = new d.n
            java.lang.String r8 = "code"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.<init>(r8, r5)
            java.util.Map r5 = p2628d.p2629a.C52550ab.m112042a(r7)
            r6.<init>(r5)
            r1.mo19455a(r3, r6)
        L_0x018f:
            com.ss.android.ugc.aweme.commercialize.utils.b$a r3 = new com.ss.android.ugc.aweme.commercialize.utils.b$a
            r3.<init>()
            if (r2 != 0) goto L_0x0198
            java.lang.String r2 = ""
        L_0x0198:
            java.lang.String r5 = "clickFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            com.ss.android.ugc.aweme.commercialize.utils.b$a r3 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26409b.C26410a) r3
            r3.f69661a = r2
            r3.f69662b = r4
            com.ss.android.ugc.aweme.commercialize.utils.b r2 = new com.ss.android.ugc.aweme.commercialize.utils.b
            java.lang.String r5 = r3.f69661a
            boolean r3 = r3.f69662b
            r2.<init>(r5, r3, r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.f62238e
            java.lang.String r3 = "ACTION_HALF_WEB_PAGE_HIDE"
            r0.mo48228a(r3, r2)
        L_0x01b3:
            if (r1 == 0) goto L_0x01d0
            java.lang.String r11 = r11.f68034c
            org.json.JSONObject r0 = new org.json.JSONObject
            d.n r2 = new d.n
            java.lang.String r3 = "code"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.<init>(r3, r4)
            java.util.Map r2 = p2628d.p2629a.C52550ab.m112042a(r2)
            r0.<init>(r2)
            r1.mo19455a(r11, r0)
            goto L_0x02dc
        L_0x01d0:
            return
        L_0x01d1:
            java.lang.String r11 = "ad_feed_on_page_selected"
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L_0x02dc
            com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$a r11 = f70624a
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f70584h
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget.C26803a.m64795a(r11)
            if (r1 == 0) goto L_0x0200
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x01ed
            r1 = 1
            goto L_0x01ee
        L_0x01ed:
            r1 = 0
        L_0x01ee:
            if (r1 != r5) goto L_0x0200
            if (r11 == 0) goto L_0x0200
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r11.getAwemeRawAd()
            if (r11 == 0) goto L_0x0200
            int r11 = r11.getWebviewType()
            if (r11 != 0) goto L_0x0200
            r11 = 1
            goto L_0x0201
        L_0x0200:
            r11 = 0
        L_0x0201:
            if (r11 == 0) goto L_0x02dc
            android.support.v4.app.Fragment r11 = r10.f70585i
            if (r11 == 0) goto L_0x020b
            android.support.v4.app.FragmentActivity r0 = r11.getActivity()
        L_0x020b:
            if (r0 != 0) goto L_0x020f
            goto L_0x02dc
        L_0x020f:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f70584h
            java.lang.String r11 = com.p683ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget.C26803a.m64795a(r11)
            if (r11 == 0) goto L_0x02dc
            r1 = r11
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0221
            r4 = 1
        L_0x0221:
            if (r4 == r5) goto L_0x0224
            goto L_0x0281
        L_0x0224:
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$d r1 = com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.f69963l
            android.app.Activity r0 = (android.app.Activity) r0
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$e$a r2 = new com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$e$a
            r2.<init>()
            com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$c r3 = new com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$c
            r3.<init>(r10, r11)
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            com.ss.android.ugc.aweme.commercialize.utils.bl r11 = r2.mo54142a(r3)
            T r11 = r11.f69675a
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$e r11 = (com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26579e) r11
            java.lang.String r2 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.String r2 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r2)
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$d r1 = (com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26578d) r1
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = r1.mo54324a(r0)
            if (r1 != 0) goto L_0x0270
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = new com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 2132017279(0x7f14007f, float:1.9672832E38)
            r1.setId(r2)
            r1.setParams(r11)
            android.widget.FrameLayout r11 = com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26578d.m64348b(r0)
            if (r11 == 0) goto L_0x0270
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            r11.addView(r0)
        L_0x0270:
            r10.f70625j = r1
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r11 = r10.f70625j
            if (r11 == 0) goto L_0x0281
            com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$d r0 = new com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$d
            r0.<init>(r10)
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$c r0 = (com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26577c) r0
            r11.setCallback(r0)
            goto L_0x02dc
        L_0x0281:
            return
        L_0x0282:
            java.lang.String r11 = "ad_feed_on_page_unselected"
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L_0x02dc
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r11 = r10.f70625j
            if (r11 != 0) goto L_0x028f
            goto L_0x02dc
        L_0x028f:
            android.support.v4.app.Fragment r11 = r10.f70585i
            if (r11 == 0) goto L_0x0298
            android.support.v4.app.FragmentActivity r11 = r11.getActivity()
            goto L_0x0299
        L_0x0298:
            r11 = r0
        L_0x0299:
            if (r11 != 0) goto L_0x029c
            goto L_0x02dc
        L_0x029c:
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$d r1 = com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.f69963l
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.String r2 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r2)
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$d r1 = (com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26578d) r1
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = r1.mo54324a(r11)
            if (r1 == 0) goto L_0x02d9
            boolean r2 = r1.f69968c
            if (r2 == 0) goto L_0x02c1
            com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView r2 = r1.getMBulletWebView()
            com.bytedance.ies.bullet.ui.common.view.SSWebView r2 = r2.getWebView()
            if (r2 == 0) goto L_0x02ce
            java.lang.String r3 = "about:blank"
            r2.loadUrl(r3)
            goto L_0x02ce
        L_0x02c1:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r4 = r1.getMWebView()
            java.lang.String r5 = "about:blank"
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m65745a(r4, r5, r6, r7, r8, r9)
        L_0x02ce:
            android.widget.FrameLayout r11 = com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C26578d.m64348b(r11)
            if (r11 == 0) goto L_0x02d9
            android.view.View r1 = (android.view.View) r1
            r11.removeView(r1)
        L_0x02d9:
            r10.f70625j = r0
            return
        L_0x02dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }
}
