package com.p683ss.android.ugc.aweme.money.growth;

import android.content.Context;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p683ss.android.ugc.aweme.views.C48217o;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.money.growth.b */
public final class C37154b extends C48217o {

    /* renamed from: c */
    public static boolean f94828c = true;

    /* renamed from: d */
    public static C37154b f94829d = null;

    /* renamed from: e */
    public static final String f94830e = f94830e;

    /* renamed from: f */
    public static boolean f94831f;

    /* renamed from: g */
    public static final C37159a f94832g = new C37159a(null);

    /* renamed from: a */
    public boolean f94833a = true;

    /* renamed from: b */
    public boolean f94834b;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.b$a */
    public static final class C37159a {

        /* renamed from: com.ss.android.ugc.aweme.money.growth.b$a$a */
        public static final class C37160a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f94841a;

            /* renamed from: b */
            final /* synthetic */ UgChannelPopup f94842b;

            public C37160a(Context context, UgChannelPopup ugChannelPopup) {
                this.f94841a = context;
                this.f94842b = ugChannelPopup;
            }

            public final void run() {
                C37154b.f94832g.mo76479a(this.f94841a, this.f94842b);
            }
        }

        private C37159a() {
        }

        /* renamed from: b */
        private static boolean m83382b() {
            return C37154b.f94831f;
        }

        /* renamed from: a */
        private static C37154b m83379a() {
            C37154b bVar = C37154b.f94829d;
            if (bVar == null) {
                C52711k.m112237a("dialog");
            }
            return bVar;
        }

        /* renamed from: a */
        private static void m83381a(boolean z) {
            C37154b.f94831f = true;
        }

        public /* synthetic */ C37159a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static void m83380a(C37154b bVar) {
            C52711k.m112240b(bVar, "<set-?>");
            C37154b.f94829d = bVar;
        }

        /* renamed from: a */
        public final void mo76479a(Context context, UgChannelPopup ugChannelPopup) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(ugChannelPopup, "popupInfo");
            if (!m83382b()) {
                m83381a(true);
                try {
                    m83380a(new C37154b(context, ugChannelPopup));
                } catch (Exception unused) {
                }
                m83379a().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.b$b */
    public enum C37161b {
        SMALL(1),
        BANNER(2);
        

        /* renamed from: b */
        private final int f94844b;

        public final int getStyle() {
            return this.f94844b;
        }

        private C37161b(int i) {
            this.f94844b = i;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000b A[Catch:{ a -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void show() {
        /*
            r4 = this;
            boolean r0 = r4.f94833a
            if (r0 == 0) goto L_0x002b
            super.show()     // Catch:{ Exception -> 0x0007 }
        L_0x0007:
            boolean r0 = r4.f94834b     // Catch:{ a -> 0x002a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "toast_show"
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d     // Catch:{ a -> 0x002a }
            r1.<init>()     // Catch:{ a -> 0x002a }
            java.lang.String r2 = "toast_type"
            java.lang.String r3 = "coupon_fission"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)     // Catch:{ a -> 0x002a }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a     // Catch:{ a -> 0x002a }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)     // Catch:{ a -> 0x002a }
        L_0x001f:
            com.ss.android.ugc.aweme.money.growth.d r0 = com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a.m83405b()
            com.ss.android.ugc.aweme.money.growth.c r0 = r0.f94855c
            r1 = 2
            r0.mo76482a(r1)
            goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.money.growth.C37154b.show():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00ec */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0 A[Catch:{ a -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd A[Catch:{ a -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f A[Catch:{ a -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d A[Catch:{ a -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e A[Catch:{ a -> 0x0131 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C37154b(android.content.Context r5, com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "popupInfo"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            r0 = 1
            r1 = 0
            r2 = 2132607920(0x7f1d03b0, float:2.0870794E38)
            r4.<init>(r5, r2, r1, r0)
            r4.f94833a = r0
            java.lang.Integer r5 = r6.getImageStyle()     // Catch:{ a -> 0x002a }
            com.ss.android.ugc.aweme.money.growth.b$b r2 = com.p683ss.android.ugc.aweme.money.growth.C37154b.C37161b.BANNER     // Catch:{ a -> 0x002a }
            int r2 = r2.getStyle()     // Catch:{ a -> 0x002a }
            if (r5 != 0) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            int r5 = r5.intValue()     // Catch:{ a -> 0x002a }
            if (r5 != r2) goto L_0x002c
            r4.f94834b = r0     // Catch:{ a -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r4.f94834b = r1
        L_0x002c:
            boolean r5 = r4.f94834b
            if (r5 == 0) goto L_0x0037
            r5 = 2132214451(0x7f1702b3, float:2.0072744E38)
            r4.setContentView(r5)
            goto L_0x003d
        L_0x0037:
            r5 = 2132214467(0x7f1702c3, float:2.0072777E38)
            r4.setContentView(r5)
        L_0x003d:
            r4.setCancelable(r1)
            r4.setCanceledOnTouchOutside(r1)
            com.ss.android.ugc.aweme.money.growth.b$1 r5 = com.p683ss.android.ugc.aweme.money.growth.C37154b.C371551.f94835a
            android.content.DialogInterface$OnKeyListener r5 = (android.content.DialogInterface.OnKeyListener) r5
            r4.setOnKeyListener(r5)
            r5 = 2132018096(0x7f1403b0, float:1.967449E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.ss.android.ugc.aweme.money.growth.b$2 r0 = new com.ss.android.ugc.aweme.money.growth.b$2
            r0.<init>(r4)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0099 }
            r0 = 24
            r2 = 2132023399(0x7f141867, float:1.9685245E38)
            if (r5 < r0) goto L_0x0081
            android.view.View r5 = r4.findViewById(r2)     // Catch:{ a -> 0x0099 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5     // Catch:{ a -> 0x0099 }
            java.lang.String r0 = "titleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)     // Catch:{ a -> 0x0099 }
            java.lang.String r0 = r6.getTitle()     // Catch:{ a -> 0x0099 }
            r2 = 63
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r2)     // Catch:{ a -> 0x0099 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x0099 }
            r5.setText(r0)     // Catch:{ a -> 0x0099 }
            goto L_0x0099
        L_0x0081:
            android.view.View r5 = r4.findViewById(r2)     // Catch:{ a -> 0x0099 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5     // Catch:{ a -> 0x0099 }
            java.lang.String r0 = "titleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)     // Catch:{ a -> 0x0099 }
            java.lang.String r0 = r6.getTitle()     // Catch:{ a -> 0x0099 }
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch:{ a -> 0x0099 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x0099 }
            r5.setText(r0)     // Catch:{ a -> 0x0099 }
        L_0x0099:
            r5 = 2132018282(0x7f14046a, float:1.9674866E38)
            android.view.View r5 = r4.findViewById(r5)     // Catch:{ a -> 0x00b0 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5     // Catch:{ a -> 0x00b0 }
            java.lang.String r0 = "contentTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)     // Catch:{ a -> 0x00b0 }
            java.lang.String r0 = r6.getContent()     // Catch:{ a -> 0x00b0 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x00b0 }
            r5.setText(r0)     // Catch:{ a -> 0x00b0 }
        L_0x00b0:
            r5 = 2132017896(0x7f1402e8, float:1.9674083E38)
            android.view.View r0 = r4.findViewById(r5)     // Catch:{ a -> 0x00c7 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0     // Catch:{ a -> 0x00c7 }
            java.lang.String r2 = "button"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)     // Catch:{ a -> 0x00c7 }
            java.lang.String r2 = r6.getButtonText()     // Catch:{ a -> 0x00c7 }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ a -> 0x00c7 }
            r0.setText(r2)     // Catch:{ a -> 0x00c7 }
        L_0x00c7:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = new com.ss.android.ugc.aweme.base.model.UrlModel     // Catch:{ a -> 0x0131 }
            r0.<init>()     // Catch:{ a -> 0x0131 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r2 = r6.getResourceUrl()     // Catch:{ a -> 0x00ec }
            java.lang.String r3 = "popupInfo.resourceUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x00ec }
            java.util.List r2 = r2.getUrlList()     // Catch:{ a -> 0x00ec }
            r0.setUrlList(r2)     // Catch:{ a -> 0x00ec }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r6 = r6.getResourceUrl()     // Catch:{ a -> 0x00ec }
            java.lang.String r2 = "popupInfo.resourceUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r2)     // Catch:{ a -> 0x00ec }
            java.lang.String r6 = r6.getUri()     // Catch:{ a -> 0x00ec }
            r0.setUri(r6)     // Catch:{ a -> 0x00ec }
        L_0x00ec:
            boolean r6 = r4.f94834b     // Catch:{ a -> 0x0131 }
            if (r6 == 0) goto L_0x00fd
            r6 = 2132019567(0x7f14096f, float:1.9677473E38)
            android.view.View r6 = r4.findViewById(r6)     // Catch:{ a -> 0x0131 }
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r6     // Catch:{ a -> 0x0131 }
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r6, r0)     // Catch:{ a -> 0x0131 }
            goto L_0x0107
        L_0x00fd:
            com.ss.android.ugc.aweme.money.growth.b$3 r6 = new com.ss.android.ugc.aweme.money.growth.b$3     // Catch:{ a -> 0x0131 }
            r6.<init>(r4, r0)     // Catch:{ a -> 0x0131 }
            com.ss.android.ugc.aweme.base.d.a.b r6 = (com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b) r6     // Catch:{ a -> 0x0131 }
            com.p683ss.android.ugc.aweme.base.C23515d.m57666a(r0, r1, r1, r6)     // Catch:{ a -> 0x0131 }
        L_0x0107:
            com.ss.android.ugc.aweme.money.growth.d r6 = com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a.m83405b()     // Catch:{ a -> 0x0131 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r6 = r6.f94853a     // Catch:{ a -> 0x0131 }
            if (r6 == 0) goto L_0x011a
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r6 = r6.getChannelPopup()     // Catch:{ a -> 0x0131 }
            if (r6 == 0) goto L_0x011a
            java.lang.String r6 = r6.getH5Link()     // Catch:{ a -> 0x0131 }
            goto L_0x011b
        L_0x011a:
            r6 = 0
        L_0x011b:
            if (r6 == 0) goto L_0x012e
            android.view.View r5 = r4.findViewById(r5)     // Catch:{ a -> 0x0131 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5     // Catch:{ a -> 0x0131 }
            com.ss.android.ugc.aweme.money.growth.b$4 r0 = new com.ss.android.ugc.aweme.money.growth.b$4     // Catch:{ a -> 0x0131 }
            r0.<init>(r4, r6)     // Catch:{ a -> 0x0131 }
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0     // Catch:{ a -> 0x0131 }
            r5.setOnClickListener(r0)     // Catch:{ a -> 0x0131 }
            return
        L_0x012e:
            r4.f94833a = r1     // Catch:{ a -> 0x0131 }
            return
        L_0x0131:
            r4.f94833a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.money.growth.C37154b.<init>(android.content.Context, com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup):void");
    }
}
