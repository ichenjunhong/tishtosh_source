package com.p683ss.android.ugc.aweme.router;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.Set;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.router.l */
public final class C41286l implements IInterceptor {

    /* renamed from: a */
    public static final C41287a f104733a = new C41287a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.l$a */
    public static final class C41287a {
        private C41287a() {
        }

        public /* synthetic */ C41287a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        static Uri m91022a(Uri uri, String str, String str2) {
            Builder clearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C52711k.m112236a((Object) queryParameterNames, "uri.queryParameterNames");
            for (String str3 : queryParameterNames) {
                if (!C52711k.m112239a((Object) str3, (Object) str)) {
                    clearQuery.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
            clearQuery.appendQueryParameter(str, str2);
            Uri build = clearQuery.build();
            C52711k.m112236a((Object) build, "uri.buildUpon().clearQue…                }.build()");
            return build;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x007d
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.abtest.DynamicChannelExperiment> r2 = com.p683ss.android.ugc.aweme.crossplatform.abtest.DynamicChannelExperiment.class
            r3 = 1
            java.lang.String r4 = "bundle_dynamic_load"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            int r1 = r1.mo18168a(r2, r3, r4, r5, r6)
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x007d
            java.lang.String r8 = r8.getUrl()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r1 = "Uri.parse(routeIntent.url)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)
            java.lang.String r1 = r8.getAuthority()
            java.lang.String r3 = "reactnative"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "channel"
            java.lang.String r1 = r8.getQueryParameter(r1)
            if (r1 == 0) goto L_0x0049
            java.util.Set r8 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103331a()
            boolean r8 = r8.contains(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x0072
        L_0x0049:
            java.lang.String r1 = "channel_name"
            java.lang.String r8 = r8.getQueryParameter(r1)
            if (r8 == 0) goto L_0x0071
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r8 = "_android"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            if (r8 == 0) goto L_0x0071
            java.util.Set r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103331a()
            boolean r8 = r1.contains(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x0072
        L_0x0071:
            r8 = 0
        L_0x0072:
            if (r8 == 0) goto L_0x0079
            boolean r8 = r8.booleanValue()
            goto L_0x007a
        L_0x0079:
            r8 = 0
        L_0x007a:
            if (r8 == 0) goto L_0x007d
            return r2
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.router.C41286l.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r5, com.bytedance.router.RouteIntent r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.router.l$a r5 = f104733a
            java.lang.String r5 = r6.getUrl()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r0 = "Uri.parse(url)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            java.lang.String r0 = r5.getAuthority()
            java.lang.String r1 = "reactnative"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "fallback_url"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = "fallback_url"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = "Uri.parse(it)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = "dynamic"
            java.lang.String r3 = "1"
            android.net.Uri r0 = com.p683ss.android.ugc.aweme.router.C41286l.C41287a.m91022a(r0, r2, r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "replaceQuery(\n          …             ).toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.net.Uri r0 = com.p683ss.android.ugc.aweme.router.C41286l.C41287a.m91022a(r5, r1, r0)
            java.lang.String r1 = "dynamic"
            java.lang.String r2 = "1"
            android.net.Uri r0 = com.p683ss.android.ugc.aweme.router.C41286l.C41287a.m91022a(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x006e
        L_0x0053:
            java.lang.String r0 = "dynamic"
            java.lang.String r1 = "1"
            android.net.Uri r5 = com.p683ss.android.ugc.aweme.router.C41286l.C41287a.m91022a(r5, r0, r1)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "replaceQuery(uri, CrossP….DYNAMIC, \"1\").toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)
            goto L_0x006e
        L_0x0065:
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "uri.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)
        L_0x006e:
            r6.setUrl(r0)
        L_0x0071:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.router.C41286l.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
