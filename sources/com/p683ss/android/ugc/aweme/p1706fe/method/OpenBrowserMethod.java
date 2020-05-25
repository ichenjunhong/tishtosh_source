package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod */
public final class OpenBrowserMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29818a f77862a = new C29818a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$a */
    public static final class C29818a {
        private C29818a() {
        }

        public /* synthetic */ C29818a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b */
    static final class C29819b implements C26534a {

        /* renamed from: a */
        final /* synthetic */ Context f77863a;

        C29819b(Context context) {
            this.f77863a = context;
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
            a.mo53593b(str).mo53586a(this.f77863a);
        }
    }

    public OpenBrowserMethod() {
        this(null, 1, null);
    }

    public OpenBrowserMethod(C10757a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d3 A[Catch:{ Exception -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9 A[Catch:{ Exception -> 0x00e7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r8, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.ref.WeakReference r0 = r7.f77793e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            java.lang.String r2 = "url"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ Exception -> 0x00e7 }
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x00e7 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00e7 }
            if (r3 == 0) goto L_0x0025
        L_0x0022:
            r8 = 0
            goto L_0x00d1
        L_0x0025:
            java.lang.String r3 = "url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x00e7 }
            if (r2 == 0) goto L_0x00df
            java.lang.String r3 = r2.toLowerCase()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r4 = "http://"
            r5 = 0
            r6 = 2
            boolean r4 = p2628d.p2650m.C52830p.m112411b(r3, r4, r1, r6, r5)     // Catch:{ Exception -> 0x00e7 }
            if (r4 != 0) goto L_0x006f
            java.lang.String r4 = "https://"
            boolean r3 = p2628d.p2650m.C52830p.m112411b(r3, r4, r1, r6, r5)     // Catch:{ Exception -> 0x00e7 }
            if (r3 == 0) goto L_0x0048
            goto L_0x006f
        L_0x0048:
            if (r0 != 0) goto L_0x004b
            goto L_0x0022
        L_0x004b:
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r0, r2, r1)     // Catch:{ Exception -> 0x00e7 }
            if (r8 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53582a(r3)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53593b(r3)     // Catch:{ Exception -> 0x00e7 }
            r2.mo53586a(r0)     // Catch:{ Exception -> 0x00e7 }
            com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b r2 = new com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b     // Catch:{ Exception -> 0x00e7 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00e7 }
            com.ss.android.ugc.aweme.commercialize.utils.q$a r2 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a) r2     // Catch:{ Exception -> 0x00e7 }
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64208a(r2)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00d1
        L_0x006f:
            java.lang.ref.WeakReference r0 = r7.f77793e     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00e7 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r2 = "url"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ Exception -> 0x00e7 }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r3 = "use_external_browser"
            boolean r3 = r8.optBoolean(r3, r1)     // Catch:{ Exception -> 0x00e7 }
            if (r3 == 0) goto L_0x00b7
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r5 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00e7 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x00e7 }
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r4)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r4 = "android.intent.category.BROWSABLE"
            r3.addCategory(r4)     // Catch:{ Exception -> 0x00e7 }
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ Exception -> 0x00e7 }
            r5 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r4 = r4.resolveActivity(r3, r5)     // Catch:{ Exception -> 0x00e7 }
            if (r4 == 0) goto L_0x00b7
            android.content.pm.ActivityInfo r8 = r4.activityInfo     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = r8.packageName     // Catch:{ Exception -> 0x00e7 }
            android.content.pm.ActivityInfo r2 = r4.activityInfo     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r2 = r2.name     // Catch:{ Exception -> 0x00e7 }
            r3.setClassName(r8, r2)     // Catch:{ Exception -> 0x00e7 }
            r0.startActivity(r3)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00d0
        L_0x00b7:
            java.lang.String r3 = "type"
            java.lang.String r4 = "webview"
            r8.put(r3, r4)     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e7 }
            r3.<init>()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r4 = "url"
            r3.put(r4, r2)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r2 = "args"
            r8.put(r2, r3)     // Catch:{ Exception -> 0x00e7 }
            com.p683ss.android.ugc.aweme.p1706fe.utils.C29970a.m70114a(r0, r8)     // Catch:{ Exception -> 0x00e7 }
        L_0x00d0:
            r8 = 1
        L_0x00d1:
            if (r8 == 0) goto L_0x00d9
            java.lang.String r8 = ""
            r9.mo60039a(r8)     // Catch:{ Exception -> 0x00e7 }
            return
        L_0x00d9:
            java.lang.String r8 = ""
            r9.mo60038a(r1, r8)     // Catch:{ Exception -> 0x00e7 }
            return
        L_0x00df:
            d.u r8 = new d.u     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r0)     // Catch:{ Exception -> 0x00e7 }
            throw r8     // Catch:{ Exception -> 0x00e7 }
        L_0x00e7:
            java.lang.String r8 = ""
            r9.mo60038a(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.OpenBrowserMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ OpenBrowserMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
