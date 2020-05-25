package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30331av;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ch */
public final class C30843ch extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    private View f80789a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ch$a */
    static final class C30844a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DmtTextView f80790a;

        /* renamed from: b */
        final /* synthetic */ C30843ch f80791b;

        C30844a(DmtTextView dmtTextView, C30843ch chVar) {
            this.f80790a = dmtTextView;
            this.f80791b = chVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Aweme aweme = this.f80791b.f81192l;
            C52711k.m112236a((Object) aweme, "aweme");
            Aweme aweme2 = this.f80791b.f81192l;
            C52711k.m112236a((Object) aweme2, "aweme");
            C26890h.m65011a("opt_out_click", C23089d.m56640a().mo47829a("enter_from", this.f80791b.f81193m).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme2.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56847a(this.f80791b.f81192l, this.f80791b.f81196p))).f61491a);
            C10643a a = new C10643a(this.f80791b.f81198r).mo18906c().mo18885a((int) R.string.gea);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f80790a.getContext().getString(R.string.ge8));
            sb.append("\n\n");
            sb.append(this.f80790a.getContext().getString(R.string.ge9));
            a.mo18902b(sb.toString()).mo18886a((int) R.string.ge_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C30844a f80792a;

                {
                    this.f80792a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C23794bh.m58381G().mo47240a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C308451 f80793a;

                        {
                            this.f80793a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            C47718bf.m103288a(new C30331av());
                            C30163b.m70784k();
                            C10691a.m21548c(this.f80793a.f80792a.f80791b.f81198r, (int) R.string.gec).mo19066a();
                            return C52860x.f131107a;
                        }
                    }, (C52670a<C52860x>) new C52670a<C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C308451 f80794a;

                        {
                            this.f80794a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            C10691a.m21548c(this.f80794a.f80792a.f80791b.f81198r, (int) R.string.geb).mo19066a();
                            return C52860x.f131107a;
                        }
                    });
                }
            }).mo18900b((int) R.string.uq, (DialogInterface.OnClickListener) null).mo18898b().mo18897a().mo18883c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ch$b */
    static final class C30848b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30843ch f80795a;

        C30848b(C30843ch chVar) {
            this.f80795a = chVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SmartRouter.buildRoute(this.f80795a.f81198r, C23794bh.m58381G().mo47236a()).open();
            Aweme aweme = this.f80795a.f81192l;
            C52711k.m112236a((Object) aweme, "aweme");
            Aweme aweme2 = this.f80795a.f81192l;
            C52711k.m112236a((Object) aweme2, "aweme");
            C26890h.m65011a("enter_vpa_notify", C23089d.m56640a().mo47829a("enter_from", this.f80795a.f81193m).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme2.getAuthorUid()).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* renamed from: d */
    private final void m72257d() {
        if (C31186b.m72814b(this.f81192l)) {
            View view = this.f80789a;
            if (view != null) {
                view.setVisibility(0);
            }
            Aweme aweme = this.f81192l;
            C52711k.m112236a((Object) aweme, "aweme");
            Aweme aweme2 = this.f81192l;
            C52711k.m112236a((Object) aweme2, "aweme");
            C26890h.m65011a("vpa_notify_show", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme2.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56847a(this.f81192l, this.f81196p))).f61491a);
            if (C23794bh.m58381G().mo47241b() == 2 || !C52711k.m112239a((Object) "homepage_hot", (Object) this.f81193m) || this.f81196p != 0 || this.f81202v != 1) {
                View view2 = this.f80789a;
                if (view2 != null) {
                    DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.enp);
                    if (dmtTextView != null) {
                        dmtTextView.setVisibility(8);
                    }
                }
                return;
            }
            View view3 = this.f80789a;
            if (view3 != null) {
                DmtTextView dmtTextView2 = (DmtTextView) view3.findViewById(R.id.enp);
                if (dmtTextView2 != null) {
                    dmtTextView2.setVisibility(0);
                }
            }
            Aweme aweme3 = this.f81192l;
            C52711k.m112236a((Object) aweme3, "aweme");
            Aweme aweme4 = this.f81192l;
            C52711k.m112236a((Object) aweme4, "aweme");
            C26890h.m65011a("opt_out_show", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", aweme3.getAid()).mo47829a("author_id", aweme4.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56847a(this.f81192l, this.f81196p))).f61491a);
            return;
        }
        View view4 = this.f80789a;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    public C30843ch(View view) {
        super(view);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        m72257d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("on_page_selected", (C0199s<C23274a>) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b7j);
        C52711k.m112236a((Object) view2, "x2CItemFeed.getView(mCon…n_feed_view_vpa_info_bar)");
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f80789a = view2;
        View view3 = this.f80789a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f80789a;
        if (view4 != null) {
            DmtTextView dmtTextView = (DmtTextView) view4.findViewById(R.id.enp);
            if (dmtTextView != null) {
                dmtTextView.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r6.mo47103a() != false) goto L_0x0023;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58323a(com.p683ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            r5 = this;
            super.mo58323a(r6)
            if (r6 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.f81192l
            boolean r6 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72814b(r6)
            if (r6 == 0) goto L_0x00ff
            boolean r6 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            r0 = 0
            if (r6 != 0) goto L_0x0023
            com.ss.android.ugc.aweme.antiaddic.lock.b r6 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            java.lang.String r1 = "LegacyServiceUtils.getTimeLockRulerService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r1)
            boolean r6 = r6.mo47103a()
            if (r6 == 0) goto L_0x002a
        L_0x0023:
            java.lang.String r6 = "vpa_show_in_child_mode"
            java.lang.String r1 = ""
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r6, r1, r0)
        L_0x002a:
            com.ss.android.ugc.aweme.ao r6 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            boolean r6 = r6.mo47250k()
            if (r6 != 0) goto L_0x003b
            java.lang.String r6 = "vpa_show_in_error_region"
            java.lang.String r1 = ""
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r6, r1, r0)
        L_0x003b:
            android.view.View r6 = r5.f80789a
            if (r6 == 0) goto L_0x0054
            r0 = 2132024643(0x7f141d43, float:1.9687768E38)
            android.view.View r6 = r6.findViewById(r0)
            android.support.constraint.ConstraintLayout r6 = (android.support.constraint.ConstraintLayout) r6
            if (r6 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.feed.ui.ch$b r0 = new com.ss.android.ugc.aweme.feed.ui.ch$b
            r0.<init>(r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
        L_0x0054:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f81192l
            java.lang.String r2 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.j r1 = r1.getUploadMiscInfoStruct()
            com.ss.android.ugc.aweme.feed.model.VPAInfo r1 = r1.vpaInfo
            int r1 = r1.getInfoBarType()
            r2 = 1
            if (r1 != r2) goto L_0x0079
            android.content.Context r1 = r5.f81198r
            r3 = 2132544635(0x7f1c0c7b, float:2.0742437E38)
            java.lang.String r1 = r1.getString(r3)
            goto L_0x0082
        L_0x0079:
            android.content.Context r1 = r5.f81198r
            r3 = 2132544636(0x7f1c0c7c, float:2.074244E38)
            java.lang.String r1 = r1.getString(r3)
        L_0x0082:
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.<init>(r0)
            com.ss.android.ugc.aweme.feed.ui.bc r0 = new com.ss.android.ugc.aweme.feed.ui.bc
            android.content.Context r1 = r5.f81198r
            java.lang.String r3 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r3 = 2131952717(0x7f13044d, float:1.9541885E38)
            r0.<init>(r1, r3)
            int r1 = r6.length()
            int r1 = r1 - r2
            int r3 = r6.length()
            r4 = 18
            r6.setSpan(r0, r1, r3, r4)
            android.view.View r0 = r5.f80789a
            if (r0 == 0) goto L_0x00c4
            r1 = 2132019723(0x7f140a0b, float:1.9677789E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            if (r0 == 0) goto L_0x00c4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r0.setText(r6)
        L_0x00c4:
            com.ss.android.ugc.aweme.ao r6 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            int r6 = r6.mo47241b()
            r0 = 2
            if (r6 == r0) goto L_0x00ff
            java.lang.String r6 = "homepage_hot"
            java.lang.String r0 = r5.f81193m
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            if (r6 == 0) goto L_0x00ff
            int r6 = r5.f81196p
            if (r6 != 0) goto L_0x00ff
            int r6 = r5.f81202v
            if (r6 != r2) goto L_0x00ff
            android.view.View r6 = r5.f80789a
            if (r6 == 0) goto L_0x00ff
            r0 = 2132021455(0x7f1410cf, float:1.9681302E38)
            android.view.View r6 = r6.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            if (r6 == 0) goto L_0x00ff
            java.lang.String r0 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g
            r6.setFontType(r0)
            com.ss.android.ugc.aweme.feed.ui.ch$a r0 = new com.ss.android.ugc.aweme.feed.ui.ch$a
            r0.<init>(r6, r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
        L_0x00ff:
            r5.m72257d()
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30843ch.mo58323a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }
}
