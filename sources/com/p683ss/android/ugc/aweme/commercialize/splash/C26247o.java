package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.o */
public final class C26247o {

    /* renamed from: a */
    public ViewGroup f69297a;

    /* renamed from: b */
    public View f69298b;

    /* renamed from: c */
    private Activity f69299c;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0072, code lost:
        if (r3.equals("honor") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a1, code lost:
        if (r3.equals("huawei") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        r2 = com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.f69300a.mo53903b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        r2 = com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.f69300a.mo53905d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
        if (r2 != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        r0.topMargin = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55512d(com.bytedance.ies.ugc.p694a.C11010c.m22280a());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53901a() {
        /*
            r6 = this;
            android.app.Activity r0 = r6.f69299c
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f69297a = r0
            android.view.View r0 = new android.view.View
            android.app.Activity r1 = r6.f69299c
            r0.<init>(r1)
            r6.f69298b = r0
            java.lang.Class<com.ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate> r0 = com.p683ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate.class
            java.lang.Object r0 = com.p683ss.android.ugc.aweme.lego.C35857a.m81002b(r0)
            com.ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate r0 = (com.p683ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate) r0
            android.view.View r1 = r6.f69298b
            android.app.Activity r2 = r6.f69299c
            android.graphics.drawable.Drawable r0 = r0.getSplashBgDrawable(r2)
            r1.setBackground(r0)
            android.view.ViewGroup r0 = r6.f69297a
            boolean r0 = r0 instanceof android.widget.FrameLayout
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L_0x00dc
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2)
            android.app.Activity r2 = r6.f69299c
            boolean r2 = com.p683ss.android.ugc.aweme.app.p1372c.C23059a.m56592a(r2)
            if (r2 == 0) goto L_0x00d4
            android.app.Activity r2 = r6.f69299c
            java.lang.String r3 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r4 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            if (r3 == 0) goto L_0x00cc
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r4 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "Xiaomi"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            if (r4 == 0) goto L_0x0064
            java.lang.String r3 = "Xiaomi"
        L_0x0064:
            int r4 = r3.hashCode()
            switch(r4) {
                case -1675632421: goto L_0x00aa;
                case -1206476313: goto L_0x009b;
                case 3418016: goto L_0x008c;
                case 3620012: goto L_0x0075;
                case 99462250: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x00b9
        L_0x006c:
            java.lang.String r4 = "honor"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b9
            goto L_0x00a3
        L_0x0075:
            java.lang.String r4 = "vivo"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b9
            com.ss.android.ugc.aweme.commercialize.splash.p r3 = com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.f69300a
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L_0x008a
            boolean r2 = r3.mo53905d(r2)
            goto L_0x00bf
        L_0x008a:
            r2 = 0
            goto L_0x00bf
        L_0x008c:
            java.lang.String r4 = "oppo"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b9
            com.ss.android.ugc.aweme.commercialize.splash.p r3 = com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.f69300a
            boolean r2 = r3.mo53902a(r2)
            goto L_0x00bf
        L_0x009b:
            java.lang.String r4 = "huawei"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b9
        L_0x00a3:
            com.ss.android.ugc.aweme.commercialize.splash.p r3 = com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.f69300a
            boolean r2 = r3.mo53903b(r2)
            goto L_0x00bf
        L_0x00aa:
            java.lang.String r4 = "Xiaomi"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b9
            com.ss.android.ugc.aweme.commercialize.splash.p r3 = com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.f69300a
            boolean r2 = r3.mo53904c(r2)
            goto L_0x00bf
        L_0x00b9:
            com.ss.android.ugc.aweme.commercialize.splash.p r3 = com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.f69300a
            boolean r2 = r3.mo53905d(r2)
        L_0x00bf:
            if (r2 != 0) goto L_0x00d4
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            int r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55512d(r2)
            r0.topMargin = r2
            goto L_0x00d4
        L_0x00cc:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00d4:
            android.view.ViewGroup r2 = r6.f69297a
            android.view.View r3 = r6.f69298b
            r2.addView(r3, r1, r0)
            goto L_0x00e8
        L_0x00dc:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r2)
            android.view.ViewGroup r2 = r6.f69297a
            android.view.View r3 = r6.f69298b
            r2.addView(r3, r1, r0)
        L_0x00e8:
            java.lang.String r0 = "awesome_splash"
            java.lang.String r1 = "addSplashLoadMask"
            com.p683ss.android.agilelogger.C18778a.m45848b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.C26247o.mo53901a():void");
    }

    public C26247o(Activity activity) {
        this.f69299c = activity;
    }
}
