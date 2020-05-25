package com.p683ss.android.ugc.aweme.sharer.p2173ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42341c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42345e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareActionBar;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.h */
public class C42359h extends C42329a {

    /* renamed from: e */
    public final Context f106981e;

    /* renamed from: f */
    public C42348d f106982f;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.h$a */
    static final class C42360a implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f106983a;

        /* renamed from: b */
        final /* synthetic */ C42359h f106984b;

        C42360a(C52670a aVar, C42359h hVar) {
            this.f106983a = aVar;
            this.f106984b = hVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (((Boolean) this.f106983a.invoke()).booleanValue()) {
                ((ShareActionBar) this.f106984b.findViewById(R.id.cna)).postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42360a f106985a;

                    {
                        this.f106985a = r1;
                    }

                    public final void run() {
                        ShareActionBar shareActionBar = (ShareActionBar) this.f106985a.f106984b.findViewById(R.id.cna);
                        if (!shareActionBar.f106915a.isEmpty()) {
                            shareActionBar.f106916b.mo4833d(shareActionBar.f106915a.size() - 1);
                        }
                    }
                }, 300);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.h$b */
    public static final class C42362b implements C42341c {

        /* renamed from: a */
        final /* synthetic */ C42359h f106986a;

        C42362b(C42359h hVar) {
            this.f106986a = hVar;
        }

        /* renamed from: a */
        public final void mo86165a(C42357g gVar) {
            C52711k.m112240b(gVar, "action");
            if (!this.f106986a.f106982f.f106953i.mo86154a(gVar, this.f106986a.f106981e)) {
                gVar.mo49950a(this.f106986a.f106981e, this.f106986a.f106982f.f106953i);
            }
            C42354e eVar = this.f106986a.f106982f.f106956l;
            if (eVar != null) {
                eVar.mo49961a(gVar, this.f106986a.f106982f.f106953i, this.f106986a.f106981e);
            }
            if (gVar.mo49957f()) {
                this.f106986a.dismiss();
                return;
            }
            if (gVar.mo49956e()) {
                this.f106986a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.h$c */
    static final class C42363c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42359h f106987a;

        C42363c(C42359h hVar) {
            this.f106987a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42354e eVar = this.f106987a.f106982f.f106956l;
            if (eVar != null) {
                eVar.mo49960a(this.f106987a.f106982f.f106953i, this.f106987a.f106981e);
            }
            this.f106987a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.h$d */
    static final class C42364d extends C52712l implements C52671b<C42307b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42359h f106988a;

        C42364d(C42359h hVar) {
            this.f106988a = hVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C42307b bVar = (C42307b) obj;
            C52711k.m112240b(bVar, "it");
            return Boolean.valueOf(!bVar.mo86141a(this.f106988a.f106981e));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.h$e */
    public static final class C42365e implements C42345e {

        /* renamed from: a */
        final /* synthetic */ C42359h f106989a;

        C42365e(C42359h hVar) {
            this.f106989a = hVar;
        }

        /* renamed from: a */
        public final void mo66353a(C42307b bVar) {
            boolean z;
            C52711k.m112240b(bVar, "channel");
            if (!this.f106989a.f106982f.f106953i.mo85939a(bVar, this.f106989a.f106981e)) {
                z = bVar.mo49947a(this.f106989a.f106982f.f106953i.mo73884a(bVar), this.f106989a.f106981e);
            } else {
                z = true;
            }
            C42354e eVar = this.f106989a.f106982f.f106956l;
            if (eVar != null) {
                eVar.mo49959a(bVar, z, this.f106989a.f106982f.f106953i, this.f106989a.f106981e);
            }
            if (!bVar.mo86143g()) {
                this.f106989a.dismiss();
            }
        }
    }

    public void dismiss() {
        super.dismiss();
        C42354e eVar = this.f106982f.f106956l;
        if (eVar != null) {
            eVar.mo49962b(this.f106982f.f106953i, this.f106981e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ea, code lost:
        if (r0 != false) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r6 = 2132215149(0x7f17056d, float:2.007416E38)
            r5.setContentView(r6)
            com.ss.android.ugc.aweme.sharer.ui.a.a$a r6 = com.p683ss.android.ugc.aweme.sharer.p2173ui.p2174a.C42330a.f106908a
            r0 = r5
            android.support.design.widget.b r0 = (android.support.design.widget.C0535b) r0
            r1 = 2132022772(0x7f1415f4, float:1.9683973E38)
            android.view.View r1 = r5.findViewById(r1)
            com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout r1 = (com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout) r1
            java.lang.String r2 = "share_panel_root_layout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = (android.view.View) r1
            r6.mo86245a(r0, r1)
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            android.view.View r6 = r6.f106955k
            if (r6 == 0) goto L_0x0037
            r6 = 2132022776(0x7f1415f8, float:1.9683981E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            com.ss.android.ugc.aweme.sharer.ui.d r0 = r5.f106982f
            android.view.View r0 = r0.f106955k
            r6.addView(r0)
        L_0x0037:
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            boolean r6 = r6.f106948d
            if (r6 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r6 = r6.f106945a
            com.ss.android.ugc.aweme.sharer.ui.h$d r0 = new com.ss.android.ugc.aweme.sharer.ui.h$d
            r0.<init>(r5)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            p2628d.p2629a.C52575l.m112110a(r6, r0)
        L_0x004b:
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            boolean r6 = r6.f106947c
            r0 = 1
            r1 = 8
            r2 = 0
            if (r6 != 0) goto L_0x008b
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r6 = r6.f106945a
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x0066
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            if (r6 == 0) goto L_0x006a
            goto L_0x008b
        L_0x006a:
            r6 = 2132022773(0x7f1415f5, float:1.9683975E38)
            android.view.View r3 = r5.findViewById(r6)
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar r3 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareChannelBar) r3
            com.ss.android.ugc.aweme.sharer.ui.d r4 = r5.f106982f
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r4 = r4.f106945a
            r3.mo86251a(r4)
            android.view.View r6 = r5.findViewById(r6)
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar r6 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareChannelBar) r6
            com.ss.android.ugc.aweme.sharer.ui.h$e r3 = new com.ss.android.ugc.aweme.sharer.ui.h$e
            r3.<init>(r5)
            com.ss.android.ugc.aweme.sharer.ui.bar.e r3 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42345e) r3
            r6.mo86250a(r3)
            goto L_0x009c
        L_0x008b:
            r6 = 2132022766(0x7f1415ee, float:1.968396E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            java.lang.String r3 = "share_panel_first_line_layout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r3)
            r6.setVisibility(r1)
        L_0x009c:
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            java.util.List<com.ss.android.ugc.aweme.sharer.ui.g> r6 = r6.f106946b
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x00ad
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r6 = 0
            goto L_0x00ae
        L_0x00ad:
            r6 = 1
        L_0x00ae:
            r3 = 2132022760(0x7f1415e8, float:1.9683949E38)
            r4 = 2132022731(0x7f1415cb, float:1.968389E38)
            if (r6 == 0) goto L_0x00d4
            android.view.View r6 = r5.findViewById(r3)
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar r6 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareActionBar) r6
            java.lang.String r0 = "share_panel_action_bar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r6.setVisibility(r1)
            r6 = 2132022757(0x7f1415e5, float:1.9683943E38)
            android.view.View r6 = r5.findViewById(r6)
            java.lang.String r0 = "share_line"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r6.setVisibility(r1)
            goto L_0x0127
        L_0x00d4:
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            boolean r6 = r6.f106947c
            if (r6 != 0) goto L_0x00ec
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r6 = r6.f106945a
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x00ea
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            if (r0 == 0) goto L_0x00fa
        L_0x00ec:
            android.view.View r6 = r5.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = "share_action_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r6.setVisibility(r2)
        L_0x00fa:
            android.view.View r6 = r5.findViewById(r3)
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar r6 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareActionBar) r6
            com.ss.android.ugc.aweme.sharer.ui.d r0 = r5.f106982f
            java.util.List<com.ss.android.ugc.aweme.sharer.ui.g> r0 = r0.f106946b
            r6.mo86248a(r0)
            android.view.View r6 = r5.findViewById(r3)
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar r6 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareActionBar) r6
            com.ss.android.ugc.aweme.sharer.ui.h$b r0 = new com.ss.android.ugc.aweme.sharer.ui.h$b
            r0.<init>(r5)
            com.ss.android.ugc.aweme.sharer.ui.bar.c r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42341c) r0
            r6.mo86247a(r0)
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r5.f106982f
            d.f.a.a<java.lang.Boolean> r6 = r6.f106958n
            if (r6 == 0) goto L_0x0127
            com.ss.android.ugc.aweme.sharer.ui.h$a r0 = new com.ss.android.ugc.aweme.sharer.ui.h$a
            r0.<init>(r6, r5)
            android.content.DialogInterface$OnShowListener r0 = (android.content.DialogInterface.OnShowListener) r0
            r5.setOnShowListener(r0)
        L_0x0127:
            android.view.View r6 = r5.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = "share_action_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            android.content.Context r0 = r5.f106981e
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132546559(0x7f1c13ff, float:2.074634E38)
            java.lang.CharSequence r0 = r0.getText(r1)
            r6.setText(r0)
            android.view.View r6 = r5.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            android.content.Context r0 = r5.f106981e
            com.ss.android.ugc.aweme.sharer.ui.d r1 = r5.f106982f
            int r1 = r1.f106950f
            int r0 = android.support.p030v4.content.C0726c.m2098c(r0, r1)
            r6.setTextColor(r0)
            android.view.View r6 = r5.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = "share_action_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.ss.android.ugc.aweme.sharer.ui.d r0 = r5.f106982f
            float r0 = r0.f106951g
            r6.setAlpha(r0)
            r6 = 2132022775(0x7f1415f7, float:1.968398E38)
            android.view.View r0 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            java.lang.String r1 = "share_panel_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r1 = r5.f106981e
            android.content.res.Resources r1 = r1.getResources()
            com.ss.android.ugc.aweme.sharer.ui.d r2 = r5.f106982f
            int r2 = r2.f106949e
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setText(r1)
            android.view.View r0 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            android.content.Context r1 = r5.f106981e
            com.ss.android.ugc.aweme.sharer.ui.d r2 = r5.f106982f
            int r2 = r2.f106950f
            int r1 = android.support.p030v4.content.C0726c.m2098c(r1, r2)
            r0.setTextColor(r1)
            android.view.View r6 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = "share_panel_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.ss.android.ugc.aweme.sharer.ui.d r0 = r5.f106982f
            float r0 = r0.f106951g
            r6.setAlpha(r0)
            r6 = 2132022763(0x7f1415eb, float:1.9683955E38)
            android.view.View r0 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            java.lang.String r1 = "share_panel_cancel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r1 = r5.f106981e
            android.content.res.Resources r1 = r1.getResources()
            com.ss.android.ugc.aweme.sharer.ui.d r2 = r5.f106982f
            int r2 = r2.f106952h
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setText(r1)
            android.view.View r6 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            com.ss.android.ugc.aweme.sharer.ui.h$c r0 = new com.ss.android.ugc.aweme.sharer.ui.h$c
            r0.<init>(r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sharer.p2173ui.C42359h.onCreate(android.os.Bundle):void");
    }

    public C42359h(Context context, int i, C42348d dVar) {
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(dVar, "config");
        super(context, i);
        this.f106981e = context;
        this.f106982f = dVar;
    }
}
