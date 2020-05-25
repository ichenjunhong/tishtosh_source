package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.AlgoFreeInfo;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.feed.helper.C30394q;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.video.C48009d;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.a */
public final class C30741a {

    /* renamed from: a */
    public VideoViewComponent f80563a = new VideoViewComponent(true);

    /* renamed from: b */
    public boolean f80564b;

    /* renamed from: c */
    public boolean f80565c;

    /* renamed from: d */
    public final ViewGroup f80566d;

    /* renamed from: e */
    private C30394q f80567e;

    /* renamed from: f */
    private final C30178a f80568f = new C30178a();

    /* renamed from: g */
    private C30744c f80569g = new C30744c(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$a */
    static final class C30742a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DmtTextView f80570a;

        C30742a(DmtTextView dmtTextView) {
            this.f80570a = dmtTextView;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            View rootView = this.f80570a.getRootView();
            C52711k.m112236a((Object) rootView, "rootView");
            Context context = rootView.getContext();
            AlgoFreeInfo c = C23794bh.m58381G().mo47242c();
            if (c != null) {
                str = c.getLearnMoreLink();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(context, str).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$b */
    public static final class C30743b implements C50161j {

        /* renamed from: a */
        final /* synthetic */ C30741a f80571a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C30743b(C30741a aVar) {
            this.f80571a = aVar;
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
            if (this.f80571a.f80565c) {
                this.f80571a.f80565c = false;
                this.f80571a.mo63429c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$c */
    public static final class C30744c extends C48009d {

        /* renamed from: a */
        final /* synthetic */ C30741a f80572a;

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            super.mo53524a(dVar);
        }

        C30744c(C30741a aVar) {
            this.f80572a = aVar;
        }

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            super.mo53526a(gVar);
        }

        /* renamed from: a */
        public final void mo53527a(String str) {
            super.mo53527a(str);
        }

        /* renamed from: a */
        public final void mo53525a(C50117f fVar) {
            super.mo53525a(fVar);
            C50160i iVar = C30741a.m72076a(this.f80572a).f125619b;
            C52711k.m112236a((Object) iVar, "mVideoView.surfaceHolder");
            View a = iVar.mo97949a();
            C52711k.m112236a((Object) a, "mVideoView.surfaceHolder.view");
            a.setVisibility(0);
        }

        /* renamed from: e */
        public final void mo53535e(String str) {
            super.mo53535e(str);
            C50160i iVar = C30741a.m72076a(this.f80572a).f125619b;
            C52711k.m112236a((Object) iVar, "mVideoView.surfaceHolder");
            View a = iVar.mo97949a();
            C52711k.m112236a((Object) a, "mVideoView.surfaceHolder.view");
            a.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo63427a() {
        m72077f();
        this.f80564b = true;
        mo63429c();
        this.f80566d.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo63428b() {
        this.f80564b = false;
        m72078g();
        this.f80566d.setVisibility(8);
        C23794bh.m58381G().mo47244e();
    }

    /* renamed from: g */
    private void m72078g() {
        this.f80565c = false;
        int i = this.f80568f.f78757a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        C30394q qVar = this.f80567e;
        if (qVar == null) {
            C52711k.m112237a("mPlayVideoHelper");
        }
        qVar.mo60815d();
        this.f80568f.f78757a = 0;
    }

    /* renamed from: c */
    public final void mo63429c() {
        VideoViewComponent videoViewComponent = this.f80563a;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        C50160i iVar = videoViewComponent.f125619b;
        C52711k.m112236a((Object) iVar, "mVideoView.surfaceHolder");
        if (!iVar.mo97954c()) {
            this.f80565c = true;
            return;
        }
        int i = this.f80568f.f78757a;
        if (i == 0) {
            C30394q qVar = this.f80567e;
            if (qVar == null) {
                C52711k.m112237a("mPlayVideoHelper");
            }
            qVar.mo60812a();
            this.f80565c = false;
            this.f80568f.f78757a = 2;
        } else if (i == 3) {
            mo63430d();
        }
    }

    /* renamed from: d */
    public final void mo63430d() {
        this.f80565c = false;
        int i = this.f80568f.f78757a;
        if (i == 0) {
            mo63429c();
        } else if (i == 3) {
            C30394q qVar = this.f80567e;
            if (qVar == null) {
                C52711k.m112237a("mPlayVideoHelper");
            }
            qVar.mo60814c();
            this.f80568f.f78757a = 4;
        }
    }

    /* renamed from: e */
    public final void mo63431e() {
        this.f80565c = false;
        int i = this.f80568f.f78757a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        C30394q qVar = this.f80567e;
        if (qVar == null) {
            C52711k.m112237a("mPlayVideoHelper");
        }
        qVar.mo60813b();
        this.f80568f.f78757a = 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab A[LOOP:0: B:20:0x00a5->B:22:0x00ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m72077f() {
        /*
            r9 = this;
            android.view.ViewGroup r0 = r9.f80566d
            android.view.View r0 = (android.view.View) r0
            r1 = 2132020550(0x7f140d46, float:1.9679466E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r1.mo47242c()
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r1.getLearnMoreText()
            if (r1 == 0) goto L_0x0020
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0024
        L_0x0020:
            java.lang.String r1 = "Learn More"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0024:
            r0.setText(r1)
            com.ss.android.ugc.aweme.feed.ui.a$a r1 = new com.ss.android.ugc.aweme.feed.ui.a$a
            r1.<init>(r0)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.view.ViewGroup r0 = r9.f80566d
            android.view.View r0 = (android.view.View) r0
            r1 = 2132019564(0x7f14096c, float:1.9677466E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r1.mo47242c()
            r2 = 0
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = r1.getIconUrl()
            goto L_0x004f
        L_0x004e:
            r1 = r2
        L_0x004f:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r1)
            android.view.ViewGroup r0 = r9.f80566d
            android.view.View r0 = (android.view.View) r0
            r1 = 2132023392(0x7f141860, float:1.968523E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            java.lang.String r1 = "rootView.title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r1.mo47242c()
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r1.getTitle()
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.ao r0 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            com.ss.android.ugc.aweme.AlgoFreeInfo r0 = r0.mo47242c()
            if (r0 == 0) goto L_0x0094
            java.lang.String r3 = r0.getBody()
            if (r3 == 0) goto L_0x0094
            java.lang.String r4 = "\n"
            java.lang.String r5 = "\n\n"
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r2 = p2628d.p2650m.C52830p.m112401a(r3, r4, r5, r6, r7, r8)
        L_0x0094:
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.<init>(r2)
            java.lang.String r1 = "\n\n"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
        L_0x00a5:
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x00c1
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r3 = 7
            r4 = 1
            r2.<init>(r3, r4)
            int r3 = r1.start()
            int r3 = r3 + r4
            int r4 = r1.end()
            r5 = 33
            r0.setSpan(r2, r3, r4, r5)
            goto L_0x00a5
        L_0x00c1:
            android.view.ViewGroup r1 = r9.f80566d
            android.view.View r1 = (android.view.View) r1
            r2 = 2132018494(0x7f14053e, float:1.9675296E38)
            android.view.View r1 = r1.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "rootView.desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30741a.m72077f():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoViewComponent m72076a(C30741a aVar) {
        VideoViewComponent videoViewComponent = aVar.f80563a;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        return videoViewComponent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b5, code lost:
        if (r1 == null) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30741a(android.view.ViewGroup r3) {
        /*
            r2 = this;
            java.lang.String r0 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            r2.<init>()
            r2.f80566d = r3
            com.ss.android.ugc.aweme.feed.d.a r3 = new com.ss.android.ugc.aweme.feed.d.a
            r3.<init>()
            r2.f80568f = r3
            com.ss.android.ugc.aweme.feed.ui.a$c r3 = new com.ss.android.ugc.aweme.feed.ui.a$c
            r3.<init>(r2)
            r2.f80569g = r3
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r3 = new com.ss.android.ugc.playerkit.videoview.VideoViewComponent
            r0 = 1
            r3.<init>(r0)
            r2.f80563a = r3
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r3 = r2.f80563a
            if (r3 != 0) goto L_0x0029
            java.lang.String r0 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0029:
            android.view.ViewGroup r0 = r2.f80566d
            android.view.View r0 = (android.view.View) r0
            r1 = 2132024476(0x7f141c9c, float:1.968743E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.mo97916a(r0)
            android.view.ViewGroup r3 = r2.f80566d
            android.view.View r3 = (android.view.View) r3
            r0 = 2132023392(0x7f141860, float:1.968523E38)
            android.view.View r3 = r3.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r0 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g
            r3.setFontType(r0)
            android.view.ViewGroup r3 = r2.f80566d
            android.view.View r3 = (android.view.View) r3
            r0 = 2132020550(0x7f140d46, float:1.9679466E38)
            android.view.View r3 = r3.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r0 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g
            r3.setFontType(r0)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r3 = r2.f80563a
            if (r3 != 0) goto L_0x0066
            java.lang.String r0 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0066:
            com.ss.android.ugc.aweme.feed.ui.a$b r0 = new com.ss.android.ugc.aweme.feed.ui.a$b
            r0.<init>(r2)
            com.ss.android.ugc.playerkit.videoview.j r0 = (com.p683ss.android.ugc.playerkit.videoview.C50161j) r0
            r3.mo97918a(r0)
            com.ss.android.ugc.aweme.feed.helper.q r3 = new com.ss.android.ugc.aweme.feed.helper.q
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r2.f80563a
            if (r0 != 0) goto L_0x007b
            java.lang.String r1 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x007b:
            com.ss.android.ugc.aweme.feed.ui.a$c r1 = r2.f80569g
            com.ss.android.ugc.aweme.player.sdk.a.j r1 = (com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j) r1
            r3.<init>(r0, r1)
            r2.f80567e = r3
            com.ss.android.ugc.aweme.feed.d.a r3 = r2.f80568f
            int r3 = r3.f78757a
            r0 = 2
            if (r3 != r0) goto L_0x0097
            com.ss.android.ugc.aweme.feed.helper.q r3 = r2.f80567e
            if (r3 != 0) goto L_0x0094
            java.lang.String r0 = "mPlayVideoHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0094:
            r3.mo60813b()
        L_0x0097:
            com.ss.android.ugc.aweme.feed.d.a r3 = r2.f80568f
            r0 = 0
            r3.f78757a = r0
            com.ss.android.ugc.aweme.feed.helper.q r3 = r2.f80567e
            if (r3 != 0) goto L_0x00a5
            java.lang.String r0 = "mPlayVideoHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00a5:
            com.ss.android.ugc.aweme.video.b.b r0 = com.p683ss.android.ugc.aweme.video.p2393b.C47993b.f120631a
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r1.mo47242c()
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = r1.getBackgroundVideoUrl()
            if (r1 != 0) goto L_0x00b9
        L_0x00b7:
            java.lang.String r1 = ""
        L_0x00b9:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo95152a(r1)
            java.lang.String r1 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            r3.f79456a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30741a.<init>(android.view.ViewGroup):void");
    }
}
