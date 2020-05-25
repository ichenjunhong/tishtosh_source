package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.v */
public final class C23680v extends C23649b {

    /* renamed from: s */
    public static final C23681a f63145s = new C23681a(null);

    /* renamed from: a */
    public final Activity f63146a;

    /* renamed from: b */
    public final String f63147b;

    /* renamed from: u */
    private final Keva f63148u;

    /* renamed from: v */
    private AnchorCommonStruct f63149v;

    /* renamed from: w */
    private String f63150w;

    /* renamed from: x */
    private final String f63151x;

    /* renamed from: y */
    private final String f63152y;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.v$a */
    public static final class C23681a {
        private C23681a() {
        }

        public /* synthetic */ C23681a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m58117a(Context context, String str) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "pkgName");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (NameNotFoundException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final void mo49103a(Keva keva, Context context) {
            C52711k.m112240b(keva, "keva");
            C52711k.m112240b(context, "context");
            if (keva.getInt("is_resso_installed_key", -1) == -1) {
                String str = "is_resso_installed_key";
                int i = 1;
                if (!m58117a(context, "com.moonvideo.android.resso")) {
                    i = 0;
                }
                keva.storeInt(str, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo49074a() {
        C26890h.m65011a("anchor_entrance_show", m58112f().f61491a);
    }

    /* renamed from: b */
    public final void mo49077b() {
        String str;
        C26890h.m65011a("anchor_entrance_click", m58112f().f61491a);
        String str2 = "enter_anchor_detail";
        C23089d f = m58112f();
        String str3 = "click_type";
        if (C23681a.m58117a((Context) this.f63146a, "com.moonvideo.android.resso")) {
            str = "other_app";
        } else {
            str = C23060d.f61427a;
        }
        C26890h.m65011a(str2, f.mo47829a(str3, str).f61491a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r2 == null) goto L_0x0022;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p683ss.android.ugc.aweme.app.p1376f.C23089d m58112f() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            java.lang.String r2 = ""
        L_0x0024:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f63147b
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = r3.f63152y
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "anchor_name"
            java.lang.String r2 = r3.f63151x
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "anchor_id"
            java.lang.String r2 = r3.f63150w
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "music_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56873k(r2)
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "EventMapBuilder.newBuild…ils.getMusicIdStr(aweme))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23680v.m58112f():com.ss.android.ugc.aweme.app.f.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        if (r2 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r2 == null) goto L_0x00b7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49075a(android.view.View r4) {
        /*
            r3 = this;
            super.mo49075a(r4)
            android.app.Activity r4 = r3.f63146a
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r0 = "com.moonvideo.android.resso"
            boolean r4 = com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23680v.C23681a.m58117a(r4, r0)
            r0 = 0
            if (r4 == 0) goto L_0x0051
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r4.<init>(r1)
            java.lang.String r1 = "android.intent.category.BROWSABLE"
            r4.addCategory(r1)
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r4.addCategory(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0037
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r3.f63149v
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = r1.getUniversalLink()
        L_0x002f:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r4.setData(r0)
            goto L_0x004b
        L_0x0037:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r3.f63149v
            if (r1 == 0) goto L_0x003f
            java.lang.String r0 = r1.getDeepLink()
        L_0x003f:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r4.setData(r0)
            java.lang.String r0 = "com.moonvideo.android.resso"
            r4.setPackage(r0)
        L_0x004b:
            android.app.Activity r0 = r3.f63146a
            r0.startActivity(r4)
            return
        L_0x0051:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = r3.f63149v
            if (r4 == 0) goto L_0x0059
            java.lang.String r0 = r4.getSchema()
        L_0x0059:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r1 = "%26enter_from%3D"
            r4.append(r1)
            java.lang.String r1 = r3.f63147b
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            if (r0 == 0) goto L_0x00e4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e4
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f63147b
            r0.put(r1, r2)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = r3.f63152y
            r0.put(r1, r2)
            java.lang.String r1 = "anchor_name"
            java.lang.String r2 = r3.f63151x
            r0.put(r1, r2)
            java.lang.String r1 = "anchor_id"
            java.lang.String r2 = r3.f63150w
            r0.put(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x00a8
        L_0x00a6:
            java.lang.String r2 = ""
        L_0x00a8:
            r0.put(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x00b9
        L_0x00b7:
            java.lang.String r2 = ""
        L_0x00b9:
            r0.put(r1, r2)
            java.lang.String r1 = "music_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56873k(r2)
            r0.put(r1, r2)
            android.app.Activity r1 = r3.f63146a
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.router.SmartRoute r4 = com.bytedance.router.SmartRouter.buildRoute(r1, r4)
            java.lang.String r1 = "resso_key"
            java.lang.String r0 = r0.toString()
            com.bytedance.router.SmartRoute r4 = r4.withParam(r1, r0)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r3.f63147b
            com.bytedance.router.SmartRoute r4 = r4.withParam(r0, r1)
            r4.open()
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23680v.mo49075a(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r5 == null) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            super.mo49076a(r5, r6)
            r6 = 0
            if (r5 == 0) goto L_0x0066
            java.util.List r5 = r5.getAnchors()
            if (r5 == 0) goto L_0x0066
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r1
            int r2 = r1.getType()
            com.ss.android.ugc.aweme.commercialize.anchor.a r3 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ANCHOR_RESSO
            int r3 = r3.getTYPE()
            if (r2 != r3) goto L_0x005d
            java.lang.String r2 = r1.getKeyword()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = r1.getSchema()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = r1.getDeepLink()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x005d
            java.lang.String r1 = r1.getUniversalLink()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0012
            goto L_0x0062
        L_0x0061:
            r0 = r6
        L_0x0062:
            r5 = r0
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r5
            goto L_0x0067
        L_0x0066:
            r5 = r6
        L_0x0067:
            r4.f63149v = r5
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = r4.f63149v
            if (r5 == 0) goto L_0x0073
            java.lang.String r5 = r5.getId()
            if (r5 != 0) goto L_0x0075
        L_0x0073:
            java.lang.String r5 = ""
        L_0x0075:
            r4.f63150w = r5
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = r4.f63149v
            if (r5 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = r4.f63149v
            if (r5 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.getIcon()
            goto L_0x0085
        L_0x0084:
            r5 = r6
        L_0x0085:
            if (r5 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r4.f63057c
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.f63149v
            if (r0 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getIcon()
            goto L_0x0093
        L_0x0092:
            r0 = r6
        L_0x0093:
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r4.f63058d
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.f63149v
            if (r0 == 0) goto L_0x00a0
            java.lang.String r6 = r0.getKeyword()
        L_0x00a0:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23680v.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r2 == null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23680v(android.view.ViewGroup r2, android.app.Activity r3, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "parent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            r1.<init>(r2)
            r1.f63146a = r3
            r1.f63147b = r4
            java.lang.String r2 = "anchor_data_keva"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r3 = "Keva.getRepo(ANCHOR_KEVA_NAME)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r1.f63148u = r2
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r2 = r1.f63149v
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = r2.getId()
            if (r2 != 0) goto L_0x002f
        L_0x002d:
            java.lang.String r2 = ""
        L_0x002f:
            r1.f63150w = r2
            java.lang.String r2 = ""
            r1.f63151x = r2
            java.lang.String r2 = "Resso"
            r1.f63152y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23680v.<init>(android.view.ViewGroup, android.app.Activity, java.lang.String):void");
    }
}
