package com.p683ss.android.p1103ad.splash.core;

import com.p683ss.android.p1103ad.splash.C18756h;
import com.p683ss.android.p1103ad.splash.C18770q;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1115d.C18621a;
import com.p683ss.android.p1103ad.splash.p1111c.C18560b;
import com.p683ss.android.p1103ad.splash.p1111c.C18562d;
import com.p683ss.android.p1103ad.splash.p1123g.C18735a;

/* renamed from: com.ss.android.ad.splash.core.s */
final class C18664s implements C18770q {

    /* renamed from: a */
    private C18756h f51580a;

    /* renamed from: b */
    private C18587c f51581b;

    /* renamed from: c */
    private C18569b f51582c;

    /* renamed from: d */
    private C18562d f51583d;

    /* renamed from: e */
    private boolean f51584e;

    C18664s() {
    }

    /* renamed from: a */
    private C18560b m45360a() {
        if (this.f51583d == null) {
            this.f51583d = new C18562d();
        }
        return this.f51583d;
    }

    /* renamed from: a */
    public final C18770q mo38128a(C18756h hVar) {
        this.f51580a = hVar;
        return this;
    }

    /* renamed from: a */
    private void m45361a(C18602b bVar) {
        C18735a.m45661a(bVar.mo37863p(), "发送 ACK 请求");
        C18621a.m45105a(bVar);
        this.f51584e = true;
    }

    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r3v42 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r3v43 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0506, code lost:
        if (r12 != r10) goto L_0x0508;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02f6  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.ViewGroup mo38127a(android.content.Context r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            if (r1 == 0) goto L_0x06cd
            java.lang.String r2 = "ContextImpl"
            java.lang.Class r3 = r17.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.equals(r3)
            com.ss.android.ad.splash.core.r r2 = com.p683ss.android.p1103ad.splash.core.C18663r.m45318j()
            boolean r2 = r2.mo38126k()
            r3 = 0
            if (r2 != 0) goto L_0x001f
            return r3
        L_0x001f:
            com.ss.android.ad.splash.h r2 = r0.f51580a
            if (r2 == 0) goto L_0x06c5
            com.ss.android.ad.splash.core.n r2 = com.p683ss.android.p1103ad.splash.core.C18658n.m45272a()
            r4 = 0
            com.ss.android.ad.splash.core.c.b r5 = r2.mo38077a(r4)
            if (r5 != 0) goto L_0x0035
            java.lang.String r1 = "没有挑选出广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45667b(r1)
            goto L_0x06b4
        L_0x0035:
            com.ss.android.ad.splash.core.v r6 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            r6.mo38186g()
            boolean r6 = r5.mo37990l()
            r7 = 1
            if (r6 == 0) goto L_0x007e
            com.ss.android.ad.splash.c.c r6 = com.p683ss.android.p1103ad.splash.core.C18642g.m45182J()
            if (r6 == 0) goto L_0x007e
            long r1 = r5.mo37863p()
            java.lang.String r4 = "挑选出了原生开屏广告，剩下的看端上你们的了"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r1, r4)
            com.ss.android.ad.splash.c.b r1 = r16.m45360a()
            com.ss.android.ad.splash.h r2 = r0.f51580a
            r1.mo37867a(r2)
            com.ss.android.ad.splash.c.c r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45182J()
            r1.mo37869a(r5, r7)
            boolean r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45197Y()
            if (r1 == 0) goto L_0x006b
            r0.m45361a(r5)
        L_0x006b:
            com.ss.android.ad.splash.core.u r1 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()
            com.ss.android.ad.splash.core.u r1 = r1.mo38157e()
            r1.mo38164h()
            com.ss.android.ad.splash.core.r r1 = com.p683ss.android.p1103ad.splash.core.C18663r.m45318j()
            r1.f51579a = r7
            goto L_0x06b4
        L_0x007e:
            boolean r6 = r5.mo37991m()
            if (r6 == 0) goto L_0x00b2
            long r1 = r5.mo37863p()
            java.lang.String r4 = "挑选出了原生搜索开屏广告，剩下的看端上你们的了"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r1, r4)
            com.ss.android.ad.splash.c.b r1 = r16.m45360a()
            com.ss.android.ad.splash.h r2 = r0.f51580a
            r1.mo37867a(r2)
            boolean r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45197Y()
            if (r1 == 0) goto L_0x009f
            r0.m45361a(r5)
        L_0x009f:
            com.ss.android.ad.splash.core.u r1 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()
            com.ss.android.ad.splash.core.u r1 = r1.mo38157e()
            r1.mo38164h()
            com.ss.android.ad.splash.core.r r1 = com.p683ss.android.p1103ad.splash.core.C18663r.m45318j()
            r1.f51579a = r7
            goto L_0x06b4
        L_0x00b2:
            boolean r6 = r5.mo37977a()
            if (r6 != 0) goto L_0x00ba
            goto L_0x06b4
        L_0x00ba:
            boolean r6 = com.p683ss.android.p1103ad.splash.core.C18642g.f51469G
            r9 = 3
            r10 = 8
            r11 = 2
            if (r6 == 0) goto L_0x0300
            long r12 = r5.mo37863p()
            java.lang.String r6 = "开始绑定广告数据，生成广告布局，新样式"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r12, r6)
            com.ss.android.ad.splash.core.c r6 = new com.ss.android.ad.splash.core.c
            r6.<init>(r1)
            com.ss.android.ad.splash.core.p r1 = new com.ss.android.ad.splash.core.p
            com.ss.android.ad.splash.h r12 = r0.f51580a
            r1.<init>(r6, r12)
            r6.setSplashAdInteraction(r1)
            int r1 = r5.mo37865x()
            if (r1 == 0) goto L_0x022e
            switch(r1) {
                case 2: goto L_0x01b6;
                case 3: goto L_0x00fe;
                case 4: goto L_0x00e6;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            r1 = 0
            goto L_0x0293
        L_0x00e6:
            long r12 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为九宫格图片广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r12, r1)
            r6.setImageTouchListener(r5)
            boolean r1 = r6.mo37945b(r5)
            if (r1 == 0) goto L_0x00e3
            r6.mo37942a()
        L_0x00fb:
            r1 = 1
            goto L_0x0293
        L_0x00fe:
            long r12 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为插屏视频广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r12, r1)
            com.ss.android.ad.splash.core.c.n r1 = r5.f51339m
            if (r1 == 0) goto L_0x00e3
            com.ss.android.ad.splash.core.c.f r1 = r5.f51317a
            if (r1 != 0) goto L_0x0110
            goto L_0x00e3
        L_0x0110:
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r1 = r6.f51243d
            r1.setVisibility(r4)
            com.ss.android.ad.splash.core.video2.a r1 = new com.ss.android.ad.splash.core.video2.a
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r10 = r6.f51243d
            r1.<init>(r10)
            r6.f51254o = r1
            com.ss.android.ad.splash.core.video2.e r1 = r6.f51254o
            com.ss.android.ad.splash.core.video2.b r10 = r6.mo37946c(r5)
            r1.mo38299a(r10)
            com.ss.android.ad.splash.core.c.n r1 = r5.f51339m
            com.ss.android.ad.splash.core.c.f r10 = r5.f51317a
            int r10 = r10.f51374c
            int r12 = r1.f51408g
            int r13 = r1.f51409h
            if (r10 == 0) goto L_0x00e3
            if (r12 == 0) goto L_0x00e3
            if (r13 > 0) goto L_0x0138
            goto L_0x00e3
        L_0x0138:
            boolean r10 = r6.mo37945b(r5)
            java.lang.String r1 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45725b(r1)
            boolean r14 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r1)
            if (r14 == 0) goto L_0x0147
            goto L_0x00e3
        L_0x0147:
            if (r10 == 0) goto L_0x0153
            com.ss.android.ad.splash.core.video2.e r10 = r6.f51254o
            boolean r1 = r10.mo38301a(r1)
            if (r1 == 0) goto L_0x0153
            r1 = 1
            goto L_0x0154
        L_0x0153:
            r1 = 0
        L_0x0154:
            if (r1 == 0) goto L_0x0172
            com.ss.android.ad.splash.core.video2.d r10 = com.p683ss.android.p1103ad.splash.core.video2.C18712d.m45601a()
            android.content.Context r14 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()
            r10.mo38323a(r5, r14)
            com.ss.android.ad.splash.core.video2.d r10 = com.p683ss.android.p1103ad.splash.core.video2.C18712d.m45601a()
            com.ss.android.ad.splash.core.video2.e r14 = r6.f51254o
            int r15 = r5.mo37972H()
            long r7 = r5.mo37979c()
            r10.mo38324a(r14, r15, r7)
        L_0x0172:
            com.ss.android.ad.splash.core.c$7 r7 = new com.ss.android.ad.splash.core.c$7
            r7.<init>(r5)
            r6.setOnTouchListener(r7)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r7 = r6.f51243d
            com.ss.android.ad.splash.core.c$8 r8 = new com.ss.android.ad.splash.core.c$8
            r8.<init>(r5)
            r7.setTextureViewOnTouchListener(r8)
            if (r1 == 0) goto L_0x0293
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r7 = r6.f51243d
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            float r8 = (float) r12
            float r10 = (float) r7
            float r8 = r8 * r10
            float r10 = (float) r13
            float r8 = r8 / r10
            int r8 = (int) r8
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r10 = r6.f51243d
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r10 = (android.widget.FrameLayout.LayoutParams) r10
            r10.height = r8
            r10.width = r7
            r7 = 17
            r10.gravity = r7
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r7 = r6.f51243d
            r7.setLayoutParams(r10)
            r6.mo37942a()
            com.p683ss.android.p1103ad.splash.core.C18587c.m45001a(r5)
            goto L_0x0293
        L_0x01b6:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为视频广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            com.ss.android.ad.splash.core.c.n r1 = r5.f51339m
            if (r1 != 0) goto L_0x01c5
            goto L_0x00e3
        L_0x01c5:
            com.ss.android.ad.splash.core.c.n r1 = r5.f51339m
            java.lang.String r1 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45725b(r1)
            boolean r7 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r1)
            if (r7 == 0) goto L_0x01d3
            goto L_0x00e3
        L_0x01d3:
            com.ss.android.ad.splash.core.c$9 r7 = new com.ss.android.ad.splash.core.c$9
            r7.<init>(r5)
            r6.setOnTouchListener(r7)
            android.widget.Space r7 = r6.f51240a
            r7.setVisibility(r10)
            android.widget.ImageView r7 = r6.f51241b
            r7.setVisibility(r4)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r7 = r6.f51243d
            r7.setVisibility(r4)
            com.ss.android.ad.splash.core.video2.a r7 = new com.ss.android.ad.splash.core.video2.a
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r8 = r6.f51243d
            r7.<init>(r8)
            r6.f51254o = r7
            com.ss.android.ad.splash.core.video2.e r7 = r6.f51254o
            com.ss.android.ad.splash.core.video2.b r8 = r6.mo37946c(r5)
            r7.mo38299a(r8)
            com.ss.android.ad.splash.core.video2.e r7 = r6.f51254o
            boolean r1 = r7.mo38301a(r1)
            if (r1 == 0) goto L_0x0293
            com.ss.android.ad.splash.core.video2.d r7 = com.p683ss.android.p1103ad.splash.core.video2.C18712d.m45601a()
            android.content.Context r8 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()
            r7.mo38323a(r5, r8)
            com.ss.android.ad.splash.core.video2.d r7 = com.p683ss.android.p1103ad.splash.core.video2.C18712d.m45601a()
            com.ss.android.ad.splash.core.video2.e r8 = r6.f51254o
            int r10 = r5.mo37972H()
            long r12 = r5.mo37979c()
            r7.mo38324a(r8, r10, r12)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r7 = r6.f51243d
            com.ss.android.ad.splash.core.c$10 r8 = new com.ss.android.ad.splash.core.c$10
            r8.<init>(r5)
            r7.post(r8)
            r6.mo37942a()
            goto L_0x0293
        L_0x022e:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为图片广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            r6.setImageTouchListener(r5)
            boolean r1 = r6.mo37945b(r5)
            if (r1 == 0) goto L_0x00e3
            int r1 = r5.f51335i
            if (r1 != r9) goto L_0x028e
            boolean r1 = r5.mo37985h()
            if (r1 == 0) goto L_0x028e
            r1 = 1
            r6.f51248i = r1
            android.widget.RelativeLayout r1 = r6.f51244e
            r1.setVisibility(r4)
            android.widget.RelativeLayout r1 = r6.f51244e
            com.ss.android.ad.splash.core.c$1 r7 = new com.ss.android.ad.splash.core.c$1
            r7.<init>(r5)
            r1.setOnTouchListener(r7)
            java.lang.String r1 = r5.f51331e
            boolean r1 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r1)
            if (r1 != 0) goto L_0x026c
            android.widget.TextView r1 = r6.f51245f
            java.lang.String r7 = r5.f51331e
            r1.setText(r7)
            goto L_0x0284
        L_0x026c:
            int r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45238k()
            if (r1 == 0) goto L_0x027c
            android.widget.TextView r1 = r6.f51245f
            int r7 = com.p683ss.android.p1103ad.splash.core.C18642g.m45238k()
            r1.setText(r7)
            goto L_0x0284
        L_0x027c:
            android.widget.TextView r1 = r6.f51245f
            r7 = 2132549262(0x7f1c1e8e, float:2.0751822E38)
            r1.setText(r7)
        L_0x0284:
            android.widget.RelativeLayout r1 = r6.f51244e
            com.ss.android.ad.splash.core.c$6 r7 = new com.ss.android.ad.splash.core.c$6
            r7.<init>(r5)
            r1.post(r7)
        L_0x028e:
            r6.mo37942a()
            goto L_0x00fb
        L_0x0293:
            if (r1 == 0) goto L_0x02e1
            r6.f51251l = r5
            long r7 = r5.mo37979c()
            r6.f51249j = r7
            long r7 = r5.mo37863p()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r10 = "数据绑定成功，广告展示时长为 "
            r1.<init>(r10)
            long r12 = r6.f51249j
            r1.append(r12)
            java.lang.String r10 = " ms"
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            r6.setupUIWidgets(r5)
            com.ss.android.ad.splash.core.f.a r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45181I()
            com.ss.android.ad.splash.core.c.b r7 = r6.f51251l
            r1.mo38037a(r7)
            android.view.View[] r1 = new android.view.View[r9]
            android.widget.ImageView r7 = r6.f51241b
            r1[r4] = r7
            android.widget.FrameLayout r7 = r6.f51247h
            r8 = 1
            r1[r8] = r7
            android.widget.TextView r7 = r6.f51242c
            r1[r11] = r7
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.ss.android.ad.splash.core.f.a r7 = com.p683ss.android.p1103ad.splash.core.C18642g.m45181I()
            r7.mo38036a(r6, r1)
            r1 = 1
            goto L_0x02eb
        L_0x02e1:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "数据绑定失败，检查广告数据是否有问题"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            r1 = 0
        L_0x02eb:
            if (r1 != 0) goto L_0x02f6
            com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44917a()
            r1 = 7
            com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44918a(r1)
            goto L_0x06b4
        L_0x02f6:
            r0.f51581b = r6
            com.ss.android.ad.splash.core.c r1 = r0.f51581b
            com.p683ss.android.p1103ad.splash.core.C18620d.m45103a(r1)
        L_0x02fd:
            r3 = r6
            goto L_0x0657
        L_0x0300:
            long r6 = r5.mo37863p()
            java.lang.String r8 = "开始绑定广告数据，生成广告布局，旧样式"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r6, r8)
            com.ss.android.ad.splash.core.b r6 = new com.ss.android.ad.splash.core.b
            r6.<init>(r1)
            com.ss.android.ad.splash.core.p r1 = new com.ss.android.ad.splash.core.p
            com.ss.android.ad.splash.h r7 = r0.f51580a
            r1.<init>(r6, r7)
            r6.setSplashAdInteraction(r1)
            int r1 = r5.mo37865x()
            if (r1 == 0) goto L_0x0526
            switch(r1) {
                case 2: goto L_0x0371;
                case 3: goto L_0x0362;
                case 4: goto L_0x0324;
                default: goto L_0x0321;
            }
        L_0x0321:
            r1 = 0
            goto L_0x05b6
        L_0x0324:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为九宫格图片广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            r6.setImageTouchListener(r5)
            boolean r1 = r6.mo37896b(r5)
            if (r1 != 0) goto L_0x0337
            goto L_0x0321
        L_0x0337:
            int r1 = r5.f51336j
            r7 = 1
            if (r1 == r7) goto L_0x0342
            android.view.ViewGroup r1 = r6.f51176e
            r1.setVisibility(r10)
            goto L_0x0359
        L_0x0342:
            boolean r1 = r5.mo37969E()
            if (r1 == 0) goto L_0x0351
            android.widget.FrameLayout r1 = r6.f51191t
            r1.setVisibility(r4)
            r6.setSkipClickListener(r5)
            goto L_0x0359
        L_0x0351:
            android.view.ViewGroup r1 = r6.f51176e
            r1.setVisibility(r4)
            r6.setSkipClickListener(r5)
        L_0x0359:
            r6.setSplashInfoStyle(r5)
            r6.mo37891a()
        L_0x035f:
            r1 = 1
            goto L_0x05b6
        L_0x0362:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为插屏视频广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            boolean r1 = r6.mo37894a(r5)
            goto L_0x05b6
        L_0x0371:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为视频广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            com.ss.android.ad.splash.core.c.n r1 = r5.f51339m
            if (r1 != 0) goto L_0x037f
            goto L_0x0321
        L_0x037f:
            android.view.ViewGroup r1 = r6.f51180i
            r1.setVisibility(r4)
            com.ss.android.ad.splash.core.video.f r1 = new com.ss.android.ad.splash.core.video.f
            android.content.Context r7 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()
            android.widget.FrameLayout r8 = r6.f51181j
            r1.<init>(r7, r8)
            r6.f51185n = r1
            r6.setSplashAdListener(r5)
            com.ss.android.ad.splash.core.c.n r1 = r5.f51339m
            int r7 = r5.f51336j
            r8 = 1
            if (r7 != r8) goto L_0x039d
            r7 = 1
            goto L_0x039e
        L_0x039d:
            r7 = 0
        L_0x039e:
            java.lang.String r8 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45725b(r1)
            boolean r12 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r8)
            if (r12 == 0) goto L_0x03aa
            goto L_0x0321
        L_0x03aa:
            boolean r12 = com.p683ss.android.p1103ad.splash.core.C18642g.m45196X()
            if (r12 == 0) goto L_0x0467
            android.widget.Space r1 = r6.f51175d
            r1.setVisibility(r10)
            android.widget.ImageView r1 = r6.f51174c
            r1.setVisibility(r4)
            r6.setSkipAndWifiPreloadLayout(r5)
            r6.setSkipClickListener(r5)
            boolean r1 = r5.mo37969E()
            boolean r7 = r5.mo37985h()
            r6.mo37893a(r1, r7)
            com.ss.android.ad.splash.core.b$7 r1 = new com.ss.android.ad.splash.core.b$7
            r1.<init>(r5)
            r6.setOnTouchListener(r1)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r1 = r6.f51194w
            r1.setVisibility(r4)
            com.ss.android.ad.splash.core.video2.a r1 = new com.ss.android.ad.splash.core.video2.a
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r7 = r6.f51194w
            r1.<init>(r7)
            r6.f51195x = r1
            com.ss.android.ad.splash.core.video2.e r1 = r6.f51195x
            com.ss.android.ad.splash.core.video2.b r7 = r6.mo37897c(r5)
            r1.mo38299a(r7)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r1 = r6.f51194w
            com.ss.android.ad.splash.core.c.n r7 = r5.f51339m
            int r7 = r7.f51409h
            com.ss.android.ad.splash.core.c.n r10 = r5.f51339m
            int r10 = r10.f51408g
            android.content.res.Resources r12 = r6.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            if (r12 != 0) goto L_0x040a
            android.content.Context r12 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
        L_0x040a:
            int r13 = r12.widthPixels
            int r12 = r12.heightPixels
            float r14 = (float) r13
            float r15 = (float) r12
            float r14 = r14 / r15
            float r15 = (float) r7
            float r3 = (float) r10
            float r15 = r15 / r3
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r3.<init>(r9, r9)
            int r9 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0423
            int r7 = r7 * r12
            int r7 = r7 / r10
            r9 = r12
            goto L_0x042d
        L_0x0423:
            int r9 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x043e
            int r10 = r10 * r13
            int r7 = r10 / r7
            r9 = r7
            r7 = r13
        L_0x042d:
            int r7 = r7 - r13
            int r7 = java.lang.Math.abs(r7)
            int r7 = -r7
            int r7 = r7 / r11
            int r9 = r9 - r12
            int r9 = java.lang.Math.abs(r9)
            int r9 = -r9
            int r9 = r9 / r11
            r3.setMargins(r7, r9, r7, r9)
        L_0x043e:
            r1.setSurfaceLayoutParams(r3)
            com.ss.android.ad.splash.core.video2.e r1 = r6.f51195x
            boolean r1 = r1.mo38301a(r8)
            if (r1 == 0) goto L_0x05b6
            com.ss.android.ad.splash.core.video2.d r3 = com.p683ss.android.p1103ad.splash.core.video2.C18712d.m45601a()
            android.content.Context r7 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()
            r3.mo38323a(r5, r7)
            com.ss.android.ad.splash.core.video2.d r3 = com.p683ss.android.p1103ad.splash.core.video2.C18712d.m45601a()
            com.ss.android.ad.splash.core.video2.e r7 = r6.f51195x
            int r8 = r5.mo37972H()
            long r9 = r5.mo37979c()
            r3.mo38324a(r7, r8, r9)
            goto L_0x05b6
        L_0x0467:
            com.ss.android.ad.splash.core.video.e$a r3 = new com.ss.android.ad.splash.core.video.e$a
            r3.<init>()
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38256a(r8)
            java.lang.String r8 = r1.f51405d
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38261b(r8)
            long r8 = r5.mo37863p()
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38255a(r8)
            android.view.ViewGroup r8 = r6.f51180i
            int r8 = r8.getWidth()
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38254a(r8)
            android.view.ViewGroup r8 = r6.f51180i
            int r8 = r8.getHeight()
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38260b(r8)
            java.util.List<java.lang.String> r8 = r1.f51402a
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38257a(r8)
            java.lang.String r8 = r5.mo37864r()
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38264c(r8)
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38263c(r4)
            r8 = 1
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38258a(r8)
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38262b(r7)
            int r7 = r5.f51328b
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38266d(r7)
            boolean r7 = r5.mo37969E()
            com.ss.android.ad.splash.core.video.e$a r3 = r3.mo38265c(r7)
            long r7 = r5.mo37862f()
            r3.f51719o = r7
            com.ss.android.ad.splash.core.video.f r7 = r6.f51185n
            boolean r8 = r5.mo37987i()
            r7.f51725f = r8
            int r7 = r1.f51409h
            int r1 = r1.f51408g
            int r8 = com.p683ss.android.p1103ad.splash.core.C18642g.f51530z
            r9 = 1
            if (r8 != r9) goto L_0x051a
            android.content.res.Resources r8 = r6.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 != 0) goto L_0x04e8
            android.content.Context r8 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
        L_0x04e8:
            int r9 = r8.widthPixels
            int r8 = r8.heightPixels
            float r10 = (float) r9
            float r12 = (float) r8
            float r10 = r10 / r12
            float r12 = (float) r7
            float r13 = (float) r1
            float r12 = r12 / r13
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x04fb
            int r7 = r7 * r8
            int r7 = r7 / r1
            r1 = r8
            goto L_0x0508
        L_0x04fb:
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0504
            int r1 = r1 * r9
            int r1 = r1 / r7
            r7 = r9
            goto L_0x0508
        L_0x0504:
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x051a
        L_0x0508:
            int r7 = r7 - r9
            int r7 = java.lang.Math.abs(r7)
            int r7 = -r7
            int r7 = r7 / r11
            int r1 = r1 - r8
            int r1 = java.lang.Math.abs(r1)
            int r1 = -r1
            int r1 = r1 / r11
            r3.f51716l = r7
            r3.f51717m = r1
        L_0x051a:
            com.ss.android.ad.splash.core.video.f r1 = r6.f51185n
            com.ss.android.ad.splash.core.video.e r3 = r3.mo38259a()
            boolean r1 = r1.mo38267a(r3)
            goto L_0x05b6
        L_0x0526:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "准备绑定广告数据，该广告为图片广告"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            r6.setImageTouchListener(r5)
            boolean r1 = r6.mo37896b(r5)
            if (r1 != 0) goto L_0x053a
            goto L_0x0321
        L_0x053a:
            int r1 = r5.f51335i
            r3 = 3
            if (r1 == r3) goto L_0x0540
            goto L_0x058a
        L_0x0540:
            boolean r1 = r5.mo37985h()
            if (r1 == 0) goto L_0x058a
            r1 = 1
            r6.f51190s = r1
            android.view.View r1 = r6.f51183l
            r1.setVisibility(r4)
            android.view.View r1 = r6.f51183l
            com.ss.android.ad.splash.core.b$14 r3 = new com.ss.android.ad.splash.core.b$14
            r3.<init>(r5)
            r1.setOnTouchListener(r3)
            java.lang.String r1 = r5.f51331e
            boolean r1 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r1)
            if (r1 != 0) goto L_0x0568
            android.widget.TextView r1 = r6.f51184m
            java.lang.String r3 = r5.f51331e
            r1.setText(r3)
            goto L_0x0580
        L_0x0568:
            int r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45238k()
            if (r1 == 0) goto L_0x0578
            android.widget.TextView r1 = r6.f51184m
            int r3 = com.p683ss.android.p1103ad.splash.core.C18642g.m45238k()
            r1.setText(r3)
            goto L_0x0580
        L_0x0578:
            android.widget.TextView r1 = r6.f51184m
            r3 = 2132549261(0x7f1c1e8d, float:2.075182E38)
            r1.setText(r3)
        L_0x0580:
            android.view.View r1 = r6.f51183l
            com.ss.android.ad.splash.core.b$2 r3 = new com.ss.android.ad.splash.core.b$2
            r3.<init>(r5)
            r1.post(r3)
        L_0x058a:
            int r1 = r5.f51336j
            r3 = 1
            if (r1 == r3) goto L_0x059a
            android.widget.FrameLayout r1 = r6.f51191t
            r1.setVisibility(r10)
            android.view.ViewGroup r1 = r6.f51176e
            r1.setVisibility(r10)
            goto L_0x05ae
        L_0x059a:
            boolean r1 = r5.mo37969E()
            if (r1 == 0) goto L_0x05a6
            android.widget.FrameLayout r1 = r6.f51191t
            r1.setVisibility(r4)
            goto L_0x05ab
        L_0x05a6:
            android.view.ViewGroup r1 = r6.f51176e
            r1.setVisibility(r4)
        L_0x05ab:
            r6.setSkipClickListener(r5)
        L_0x05ae:
            r6.setSplashInfoStyle(r5)
            r6.mo37891a()
            goto L_0x035f
        L_0x05b6:
            if (r1 == 0) goto L_0x0639
            r6.f51172a = r5
            r1 = 1
            r6.f51188q = r1
            long r7 = r5.mo37979c()
            r6.f51189r = r7
            long r7 = r5.mo37863p()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "数据绑定成功，广告展示时长为 "
            r1.<init>(r3)
            long r9 = r6.f51189r
            r1.append(r9)
            java.lang.String r3 = " ms"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            boolean r1 = r5.f51295D
            r6.f51167A = r1
            boolean r1 = r6.f51167A
            if (r1 == 0) goto L_0x0605
            long r7 = r6.f51189r
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            int r1 = (int) r7
            r6.f51197z = r1
            android.widget.TextView r1 = r6.f51177f
            int r3 = r6.f51197z
            java.lang.String r3 = com.p683ss.android.p1103ad.splash.core.C18569b.m44950a(r3)
            r1.setText(r3)
            android.widget.TextView r1 = r6.f51192u
            int r3 = r6.f51197z
            java.lang.String r3 = com.p683ss.android.p1103ad.splash.core.C18569b.m44950a(r3)
            r1.setText(r3)
        L_0x0605:
            com.ss.android.ad.splash.core.f.a r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45181I()
            r1.mo38037a(r5)
            boolean r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45196X()
            if (r1 == 0) goto L_0x0637
            r1 = 5
            android.view.View[] r1 = new android.view.View[r1]
            android.widget.ImageView r3 = r6.f51174c
            r1[r4] = r3
            android.widget.TextView r3 = r6.f51193v
            r7 = 1
            r1[r7] = r3
            android.widget.TextView r3 = r6.f51182k
            r1[r11] = r3
            android.widget.FrameLayout r3 = r6.f51191t
            r7 = 3
            r1[r7] = r3
            r3 = 4
            android.view.ViewGroup r7 = r6.f51176e
            r1[r3] = r7
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.ss.android.ad.splash.core.f.a r3 = com.p683ss.android.p1103ad.splash.core.C18642g.m45181I()
            r3.mo38036a(r6, r1)
        L_0x0637:
            r1 = 1
            goto L_0x0643
        L_0x0639:
            long r7 = r5.mo37863p()
            java.lang.String r1 = "数据绑定失败，检查广告数据是否有问题"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r7, r1)
            r1 = 0
        L_0x0643:
            if (r1 != 0) goto L_0x064e
            com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44917a()
            r1 = 7
            com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44918a(r1)
            r3 = 0
            goto L_0x06b4
        L_0x064e:
            r0.f51582c = r6
            com.ss.android.ad.splash.core.b r1 = r0.f51582c
            com.p683ss.android.p1103ad.splash.core.C18620d.m45103a(r1)
            goto L_0x02fd
        L_0x0657:
            com.ss.android.ad.splash.core.r r1 = com.p683ss.android.p1103ad.splash.core.C18663r.m45318j()
            r6 = 1
            r1.f51579a = r6
            com.ss.android.ad.splash.core.u r1 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()
            com.ss.android.ad.splash.core.u r1 = r1.mo38157e()
            r1.mo38164h()
            r0.m45361a(r5)
            java.lang.String r1 = r5.mo37971G()
            boolean r7 = com.p683ss.android.p1103ad.splash.core.C18642g.m45195W()
            if (r7 == 0) goto L_0x0681
            long r1 = r2.f51570c
            long r7 = r5.mo37863p()
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0698
            goto L_0x0699
        L_0x0681:
            boolean r7 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r1)
            if (r7 != 0) goto L_0x0698
            java.lang.String r7 = r2.f51569b
            boolean r7 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r7)
            if (r7 != 0) goto L_0x0698
            java.lang.String r2 = r2.f51569b
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0698
            goto L_0x0699
        L_0x0698:
            r6 = 0
        L_0x0699:
            if (r6 == 0) goto L_0x06a1
            com.p683ss.android.p1103ad.splash.core.p1113b.C18586b.m44982a()
            com.p683ss.android.p1103ad.splash.core.p1113b.C18586b.m44993c(r5)
        L_0x06a1:
            com.ss.android.ad.splash.b.b r1 = com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44917a()
            long r5 = java.lang.System.currentTimeMillis()
            r1.f51150b = r5
            r1.mo37852c()
            com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44917a()
            com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44918a(r4)
        L_0x06b4:
            if (r3 != 0) goto L_0x06bd
            com.ss.android.ad.splash.core.m r1 = com.p683ss.android.p1103ad.splash.core.C18656m.m45265a()
            r1.mo38073b()
        L_0x06bd:
            boolean r1 = r0.f51584e
            if (r1 != 0) goto L_0x06c4
            com.p683ss.android.p1103ad.splash.core.p1115d.C18621a.m45104a()
        L_0x06c4:
            return r3
        L_0x06c5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "SplashAdActionListener为空! 请在SplashAdNative中设置！"
            r1.<init>(r2)
            throw r1
        L_0x06cd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "context is null"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.core.C18664s.mo38127a(android.content.Context):android.view.ViewGroup");
    }
}
