package com.p683ss.android.ugc.aweme.commercialize.symphony;

import android.app.Activity;
import android.support.design.widget.C0535b;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.e */
public final class C26312e extends C0535b {

    /* renamed from: d */
    public final Activity f69439d;

    /* renamed from: e */
    private final C2676c f69440e;

    /* renamed from: f */
    private final Aweme f69441f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.e$a */
    static final class C26313a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26312e f69442a;

        C26313a(C26312e eVar) {
            this.f69442a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69442a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.e$b */
    static final class C26314b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26312e f69443a;

        /* renamed from: b */
        final /* synthetic */ Aweme f69444b;

        /* renamed from: c */
        final /* synthetic */ C2676c f69445c;

        /* renamed from: d */
        final /* synthetic */ HashMap f69446d;

        C26314b(C26312e eVar, Aweme aweme, C2676c cVar, HashMap hashMap) {
            this.f69443a = eVar;
            this.f69444b = aweme;
            this.f69445c = cVar;
            this.f69446d = hashMap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f69444b
                if (r8 == 0) goto L_0x00bd
                com.ss.android.ugc.aweme.compliance.api.services.report.IReportService r8 = com.p683ss.android.ugc.aweme.compliance.api.C27013a.m65227a()
                com.ss.android.ugc.aweme.commercialize.symphony.e r0 = r7.f69443a
                android.app.Activity r0 = r0.f69439d
                android.net.Uri$Builder r1 = new android.net.Uri$Builder
                r1.<init>()
                java.lang.String r2 = "is_symphony"
                java.lang.String r3 = "1"
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "ad_provider_id"
                com.bytedance.ad.symphony.a.a.c r3 = r7.f69445c
                r4 = 0
                if (r3 == 0) goto L_0x0030
                com.bytedance.ad.symphony.e.b r3 = r3.mo7232a()
                if (r3 == 0) goto L_0x0030
                int r3 = r3.f8252c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0031
            L_0x0030:
                r3 = r4
            L_0x0031:
                java.lang.String r3 = java.lang.String.valueOf(r3)
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "ad_placement_id"
                com.bytedance.ad.symphony.a.a.c r3 = r7.f69445c
                if (r3 == 0) goto L_0x0048
                com.bytedance.ad.symphony.e.b r3 = r3.mo7232a()
                if (r3 == 0) goto L_0x0048
                java.lang.String r3 = r3.f8250a
                goto L_0x0049
            L_0x0048:
                r3 = r4
            L_0x0049:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_image_url"
                com.bytedance.ad.symphony.a.a.c r3 = r7.f69445c
                if (r3 == 0) goto L_0x0058
                java.lang.String r3 = r3.mo7236e()
                goto L_0x0059
            L_0x0058:
                r3 = r4
            L_0x0059:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_icon_url"
                com.bytedance.ad.symphony.a.a.c r3 = r7.f69445c
                if (r3 == 0) goto L_0x0068
                java.lang.String r3 = r3.mo7237f()
                goto L_0x0069
            L_0x0068:
                r3 = r4
            L_0x0069:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_title"
                com.bytedance.ad.symphony.a.a.c r3 = r7.f69445c
                if (r3 == 0) goto L_0x0078
                java.lang.String r3 = r3.mo7234c()
                goto L_0x0079
            L_0x0078:
                r3 = r4
            L_0x0079:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_description"
                com.bytedance.ad.symphony.a.a.c r3 = r7.f69445c
                if (r3 == 0) goto L_0x0088
                java.lang.String r3 = r3.mo7235d()
                goto L_0x0089
            L_0x0088:
                r3 = r4
            L_0x0089:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_cta"
                com.bytedance.ad.symphony.a.a.c r3 = r7.f69445c
                if (r3 == 0) goto L_0x0097
                java.lang.String r4 = r3.mo7238g()
            L_0x0097:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r4)
                java.lang.String r2 = "Uri.Builder().appendQuer… iNativeAd?.callToAction)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f69444b
                java.lang.String r3 = "symphony"
                java.lang.String r4 = "ad"
                com.google.gson.f r5 = new com.google.gson.f
                r5.<init>()
                java.util.HashMap r6 = r7.f69446d
                java.lang.String r5 = r5.mo34889b(r6)
                java.lang.String r6 = "Gson().toJson(extraMap)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                android.net.Uri$Builder r1 = com.p683ss.android.ugc.aweme.report.C41201a.m90894a(r1, r2, r3, r4, r5)
                r8.reportAd(r0, r1)
            L_0x00bd:
                com.ss.android.ugc.aweme.commercialize.symphony.e r8 = r7.f69443a
                r8.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.symphony.C26312e.C26314b.onClick(android.view.View):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r4 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r4 == null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.app.Activity r6 = r5.f69439d
            r5.setOwnerActivity(r6)
            r6 = 2132214480(0x7f1702d0, float:2.0072803E38)
            r5.setContentView(r6)
            com.bytedance.ad.symphony.a.a.c r6 = r5.f69440e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f69441f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "log_extra"
            if (r6 == 0) goto L_0x002e
            com.bytedance.ad.symphony.e.b r4 = r6.mo7232a()
            if (r4 == 0) goto L_0x002e
            org.json.JSONObject r4 = r4.f8254e
            if (r4 == 0) goto L_0x002e
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0030
        L_0x002e:
            java.lang.String r4 = ""
        L_0x0030:
            r2.put(r3, r4)
            java.lang.String r3 = "cid"
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r0.getAwemeRawAd()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r4.getCreativeIdStr()
            if (r4 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r4 = ""
        L_0x0045:
            r2.put(r3, r4)
            r2 = 2132023211(0x7f1417ab, float:1.9684863E38)
            android.view.View r2 = r5.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.content.Context r3 = r5.getContext()
            com.ss.android.ugc.aweme.commercialize.symphony.e$b r4 = new com.ss.android.ugc.aweme.commercialize.symphony.e$b
            r4.<init>(r5, r0, r6, r1)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r6 = 2132548403(0x7f1c1b33, float:2.075008E38)
            java.lang.String r6 = r3.getString(r6)
            android.content.res.Resources r0 = r3.getResources()
            r1 = 2131952600(0x7f1303d8, float:1.9541647E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            com.ss.android.ugc.aweme.share.seconditem.ShareItemView r6 = com.p683ss.android.ugc.aweme.share.seconditem.ShareItemView.m92667a(r3, r6, r0, r4)
            android.view.View r6 = (android.view.View) r6
            r2.addView(r6)
            r6 = 2132017918(0x7f1402fe, float:1.9674128E38)
            android.view.View r6 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            com.ss.android.ugc.aweme.commercialize.symphony.e$a r0 = new com.ss.android.ugc.aweme.commercialize.symphony.e$a
            r0.<init>(r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
            android.app.Activity r6 = r5.getOwnerActivity()
            android.content.Context r6 = (android.content.Context) r6
            int r6 = com.bytedance.common.utility.C9432q.m18688b(r6)
            android.content.Context r0 = r5.getContext()
            int r0 = com.bytedance.common.utility.C9432q.m18695e(r0)
            int r6 = r6 - r0
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x00b8
            r1 = -1
            if (r6 != 0) goto L_0x00a7
            r6 = -1
        L_0x00a7:
            r0.setLayout(r1, r6)
            r6 = 80
            r0.setGravity(r6)
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r1.gravity = r6
            r0.setAttributes(r1)
        L_0x00b8:
            r6 = 1
            r5.setCanceledOnTouchOutside(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.symphony.C26312e.onCreate(android.os.Bundle):void");
    }

    public C26312e(Activity activity, C2676c cVar, Aweme aweme) {
        C52711k.m112240b(activity, "activity");
        super(activity, R.style.a6r);
        this.f69439d = activity;
        this.f69440e = cVar;
        this.f69441f = aweme;
    }
}
