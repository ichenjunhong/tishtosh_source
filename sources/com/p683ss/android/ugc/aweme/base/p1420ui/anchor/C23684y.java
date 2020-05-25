package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27097c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.y */
public final class C23684y extends C23649b {

    /* renamed from: s */
    public static final C23685a f63167s = new C23685a(null);

    /* renamed from: a */
    public final Activity f63168a;

    /* renamed from: b */
    public final String f63169b;

    /* renamed from: u */
    private String f63170u;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.y$a */
    public static final class C23685a {
        private C23685a() {
        }

        public /* synthetic */ C23685a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo49074a() {
        String str;
        ICommerceService a = C25539a.m62079a();
        String str2 = "product_anchor_show";
        C25560e eVar = new C25560e();
        String str3 = this.f63169b;
        if (str3 == null) {
            str3 = "";
        }
        eVar.f67569b = str3;
        Aweme aweme = this.f63071q;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        eVar.f67571d = str;
        Aweme aweme2 = this.f63071q;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        eVar.f67570c = str4;
        eVar.f67586s = this.f63170u;
        a.logCommerceEvents(str2, eVar);
    }

    /* renamed from: b */
    public final void mo49077b() {
        String str;
        ICommerceService a = C25539a.m62079a();
        String str2 = "enter_product_detail";
        C25560e eVar = new C25560e();
        String str3 = this.f63169b;
        if (str3 == null) {
            str3 = "";
        }
        eVar.f67569b = str3;
        Aweme aweme = this.f63071q;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        eVar.f67571d = str;
        Aweme aweme2 = this.f63071q;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        eVar.f67570c = str4;
        eVar.f67586s = this.f63170u;
        a.logCommerceEvents(str2, eVar);
    }

    @C53771m
    public final void onEvent(C27097c cVar) {
        String str;
        C52711k.m112240b(cVar, "event");
        ICommerceService a = C25539a.m62079a();
        String str2 = "product_stay_time";
        C25560e eVar = new C25560e();
        String str3 = this.f63169b;
        if (str3 == null) {
            str3 = "";
        }
        eVar.f67569b = str3;
        Aweme aweme = this.f63071q;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        eVar.f67571d = str;
        Aweme aweme2 = this.f63071q;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        eVar.f67570c = str4;
        eVar.f67586s = this.f63170u;
        eVar.f67587t = String.valueOf(cVar.f71469a);
        a.logCommerceEvents(str2, eVar);
        C47718bf.m103291d(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[SYNTHETIC, Splitter:B:11:0x0024] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49075a(android.view.View r7) {
        /*
            r6 = this;
            super.mo49075a(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f63071q
            r0 = 0
            if (r7 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.feed.model.Anchor r7 = r7.getAnchor()
            if (r7 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r7 = r7.getAnchorInfo()
            if (r7 == 0) goto L_0x0019
            java.lang.String r7 = r7.getUrl()
            goto L_0x001a
        L_0x0019:
            r7 = r0
        L_0x001a:
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0024
            return
        L_0x0024:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = r1.getShopLinkAnchorDisclaimer()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            java.lang.String r1 = ""
        L_0x0034:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0043
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r4 = 0
            goto L_0x0044
        L_0x0043:
            r4 = 1
        L_0x0044:
            if (r4 != 0) goto L_0x0094
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.widget.Toast r5 = new android.widget.Toast
            r5.<init>(r4)
            r5.setDuration(r2)
            r2 = 55
            r5.setGravity(r2, r3, r3)
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r2 = r4.getSystemService(r2)
            if (r2 == 0) goto L_0x008c
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            r3 = 2132215269(0x7f1705e5, float:2.0074403E38)
            android.view.View r0 = r2.inflate(r3, r0)
            r2 = 2132023727(0x7f1419af, float:1.968591E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "contentView.findViewById…extView>(R.id.tv_content)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r2.setText(r1)
            r5.setView(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L_0x0088
            r0 = r5
            android.widget.Toast r0 = (android.widget.Toast) r0
            com.p683ss.android.ugc.aweme.utils.C47905fy.m103630a(r0)
        L_0x0088:
            r5.show()
            goto L_0x0094
        L_0x008c:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.view.LayoutInflater"
            r7.<init>(r0)
            throw r7
        L_0x0094:
            android.app.Activity r0 = r6.f63168a
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = ""
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64222a(r0, r7, r1)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r6)
            android.app.Activity r7 = r6.f63168a
            boolean r7 = r7 instanceof android.arch.lifecycle.C0184k
            if (r7 == 0) goto L_0x00b8
            android.app.Activity r7 = r6.f63168a
            android.arch.lifecycle.k r7 = (android.arch.lifecycle.C0184k) r7
            android.arch.lifecycle.h r7 = r7.getLifecycle()
            com.ss.android.ugc.aweme.base.ui.anchor.ShopLinkFeedsAnchor$onClick$1 r0 = new com.ss.android.ugc.aweme.base.ui.anchor.ShopLinkFeedsAnchor$onClick$1
            r0.<init>()
            android.arch.lifecycle.j r0 = (android.arch.lifecycle.C0183j) r0
            r7.mo324a(r0)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23684y.mo49075a(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r3, org.json.JSONObject r4) {
        /*
            r2 = this;
            super.mo49076a(r3, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r2.f63057c
            r0 = 2131953604(0x7f1307c4, float:1.9543684E38)
            r4.setImageResource(r0)
            if (r3 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.feed.model.Anchor r4 = r3.getAnchor()
            if (r4 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = r4.getAnchorInfo()
            if (r4 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r2.f63057c
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r4)
        L_0x0024:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r2.f63058d
            r0 = 0
            if (r3 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r3.getAnchor()
            if (r1 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r1.getAnchorInfo()
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r1.getKeyword()
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            if (r3 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x0084
            java.lang.String r3 = r3.getExtra()
            if (r3 == 0) goto L_0x0084
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = r0
        L_0x0061:
            if (r3 == 0) goto L_0x0084
            com.google.gson.q r4 = new com.google.gson.q
            r4.<init>()
            com.google.gson.l r3 = r4.mo35029a(r3)
            java.lang.String r4 = "JsonParser().parse(it)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.google.gson.o r3 = r3.mo35009m()
            java.lang.String r4 = "product_type"
            com.google.gson.l r3 = r3.mo35022b(r4)
            if (r3 == 0) goto L_0x0081
            java.lang.String r0 = r3.mo34905c()
        L_0x0081:
            r2.f63170u = r0
            return
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23684y.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23684y(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63168a = activity;
        this.f63169b = str;
    }
}
