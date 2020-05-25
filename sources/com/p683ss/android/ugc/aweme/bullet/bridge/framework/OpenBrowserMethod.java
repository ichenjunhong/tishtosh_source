package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod */
public final class OpenBrowserMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24194a f64191b = new C24194a(null);

    /* renamed from: c */
    private final String f64192c = "openBrowser";

    /* renamed from: d */
    private C10269a f64193d = C10269a.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$a */
    public static final class C24194a {
        private C24194a() {
        }

        public /* synthetic */ C24194a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$b */
    static final class C24195b implements C26534a {

        /* renamed from: a */
        final /* synthetic */ Context f64194a;

        C24195b(Context context) {
            this.f64194a = context;
        }

        /* renamed from: a */
        public final void mo49915a(boolean z) {
            String str;
            C26080b a = C26077e.m63190a().mo53582a("draw_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            a.mo53593b(str).mo53586a(this.f64194a);
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64193d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64192c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64193d = aVar;
    }

    public OpenBrowserMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da A[Catch:{ Exception -> 0x00e8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r9, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r10) {
        /*
            r8 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            r0 = 0
            android.content.Context r1 = r8.mo18743e()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r2 = "url"
            java.lang.String r2 = r9.getString(r2)     // Catch:{ Exception -> 0x00e8 }
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x00e8 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00e8 }
            r4 = 1
            if (r3 == 0) goto L_0x0022
        L_0x001f:
            r9 = 0
            goto L_0x00ca
        L_0x0022:
            java.lang.String r3 = "url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x00e8 }
            if (r2 == 0) goto L_0x00e0
            java.lang.String r3 = r2.toLowerCase()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "http://"
            r6 = 0
            r7 = 2
            boolean r5 = p2628d.p2650m.C52830p.m112411b(r3, r5, r0, r7, r6)     // Catch:{ Exception -> 0x00e8 }
            if (r5 != 0) goto L_0x006c
            java.lang.String r5 = "https://"
            boolean r3 = p2628d.p2650m.C52830p.m112411b(r3, r5, r0, r7, r6)     // Catch:{ Exception -> 0x00e8 }
            if (r3 == 0) goto L_0x0045
            goto L_0x006c
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            goto L_0x001f
        L_0x0048:
            boolean r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r1, r2, r0)     // Catch:{ Exception -> 0x00e8 }
            if (r9 == 0) goto L_0x00ca
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53582a(r3)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53593b(r3)     // Catch:{ Exception -> 0x00e8 }
            r2.mo53586a(r1)     // Catch:{ Exception -> 0x00e8 }
            com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$b r2 = new com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$b     // Catch:{ Exception -> 0x00e8 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00e8 }
            com.ss.android.ugc.aweme.commercialize.utils.q$a r2 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a) r2     // Catch:{ Exception -> 0x00e8 }
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64208a(r2)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00ca
        L_0x006c:
            java.lang.String r1 = "url"
            java.lang.String r1 = r9.getString(r1)     // Catch:{ Exception -> 0x00e8 }
            android.content.Context r2 = r8.mo18743e()     // Catch:{ Exception -> 0x00e8 }
            if (r2 == 0) goto L_0x00b0
            java.lang.String r3 = "use_external_browser"
            boolean r3 = r9.optBoolean(r3, r0)     // Catch:{ Exception -> 0x00e8 }
            if (r3 == 0) goto L_0x00b0
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "android.intent.action.VIEW"
            android.net.Uri r6 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00e8 }
            r3.<init>(r5, r6)     // Catch:{ Exception -> 0x00e8 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r5)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "android.intent.category.BROWSABLE"
            r3.addCategory(r5)     // Catch:{ Exception -> 0x00e8 }
            android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch:{ Exception -> 0x00e8 }
            r6 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r5 = r5.resolveActivity(r3, r6)     // Catch:{ Exception -> 0x00e8 }
            if (r5 == 0) goto L_0x00b0
            android.content.pm.ActivityInfo r9 = r5.activityInfo     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r9 = r9.packageName     // Catch:{ Exception -> 0x00e8 }
            android.content.pm.ActivityInfo r1 = r5.activityInfo     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = r1.name     // Catch:{ Exception -> 0x00e8 }
            r3.setClassName(r9, r1)     // Catch:{ Exception -> 0x00e8 }
            r2.startActivity(r3)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00c9
        L_0x00b0:
            java.lang.String r3 = "type"
            java.lang.String r5 = "webview"
            r9.put(r3, r5)     // Catch:{ Exception -> 0x00e8 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e8 }
            r3.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "url"
            r3.put(r5, r1)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = "args"
            r9.put(r1, r3)     // Catch:{ Exception -> 0x00e8 }
            com.p683ss.android.ugc.aweme.p1706fe.utils.C29970a.m70114a(r2, r9)     // Catch:{ Exception -> 0x00e8 }
        L_0x00c9:
            r9 = 1
        L_0x00ca:
            if (r9 == 0) goto L_0x00da
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e8 }
            r9.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = "code"
            r9.put(r1, r4)     // Catch:{ Exception -> 0x00e8 }
            r10.mo49913a(r9)     // Catch:{ Exception -> 0x00e8 }
            return
        L_0x00da:
            java.lang.String r9 = ""
            r10.mo49910a(r0, r9)     // Catch:{ Exception -> 0x00e8 }
            return
        L_0x00e0:
            d.u r9 = new d.u     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r1)     // Catch:{ Exception -> 0x00e8 }
            throw r9     // Catch:{ Exception -> 0x00e8 }
        L_0x00e8:
            java.lang.String r9 = ""
            r10.mo49910a(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
