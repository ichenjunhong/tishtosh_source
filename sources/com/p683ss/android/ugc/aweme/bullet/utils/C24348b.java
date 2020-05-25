package com.p683ss.android.ugc.aweme.bullet.utils;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.bullet.p628b.p636f.C10317b;
import com.bytedance.ies.bullet.p628b.p643i.C10384e;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.bullet.api.C24107a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.utils.b */
public final class C24348b {

    /* renamed from: a */
    public static final C24348b f64656a = new C24348b();

    private C24348b() {
    }

    /* renamed from: b */
    public static final String m59717b(String str) {
        return m59715a(str, (String) null);
    }

    /* renamed from: a */
    public static final Uri m59711a(String str) {
        C52711k.m112240b(str, "oldUri");
        C52711k.m112240b(str, "oldUri");
        return m59713a(str, null, null, null);
    }

    /* renamed from: a */
    private static String m59715a(String str, String str2) {
        if (str == null) {
            return "";
        }
        return String.valueOf(m59708a(Uri.parse(str), (String) null));
    }

    /* renamed from: b */
    private static String m59718b(String str, String str2) {
        if (str == null) {
            return "";
        }
        return String.valueOf(m59716b(Uri.parse(str), str2));
    }

    /* renamed from: a */
    private static Uri m59708a(Uri uri, String str) {
        if (uri == null) {
            return uri;
        }
        Builder buildUpon = uri.buildUpon();
        C52711k.m112236a((Object) buildUpon, "uri.buildUpon()");
        if (!TextUtils.isEmpty(uri.getQueryParameter("hybrid_sdk_version"))) {
            return uri;
        }
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("package_name", str);
        }
        buildUpon.appendQueryParameter("hybrid_sdk_version", "bullet");
        return buildUpon.build();
    }

    /* renamed from: b */
    private static Uri m59716b(Uri uri, String str) {
        if (str == null || uri == null || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri;
        }
        Builder buildUpon = uri.buildUpon();
        C52711k.m112236a((Object) buildUpon, "uri.buildUpon()");
        buildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!C52711k.m112239a((Object) str2, (Object) str)) {
                for (String appendQueryParameter : uri.getQueryParameters(str2)) {
                    buildUpon.appendQueryParameter(str2, appendQueryParameter);
                }
            }
        }
        return buildUpon.build();
    }

    /* renamed from: a */
    public static final Uri m59709a(Uri uri, String str, String str2) {
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri;
        }
        Builder buildUpon = uri.buildUpon();
        C52711k.m112236a((Object) buildUpon, "uri.buildUpon()");
        buildUpon.clearQuery();
        for (String str3 : uri.getQueryParameterNames()) {
            if (!C52711k.m112239a((Object) str3, (Object) str)) {
                for (String appendQueryParameter : uri.getQueryParameters(str3)) {
                    buildUpon.appendQueryParameter(str3, appendQueryParameter);
                }
            } else {
                buildUpon.appendQueryParameter(str3, str2);
            }
        }
        return buildUpon.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.ies.bullet.kit.web.p652e.C10520a m59714a(java.lang.String r1, android.os.Bundle r2, com.p683ss.android.ugc.aweme.bullet.api.C24107a r3) {
        /*
            java.lang.String r0 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)
            com.ss.android.ugc.aweme.bullet.api.IBulletService r0 = com.p683ss.android.ugc.aweme.bullet.impl.BulletService.provideBulletService_Monster()
            com.ss.android.ugc.aweme.bullet.api.IBulletService r0 = (com.p683ss.android.ugc.aweme.bullet.api.IBulletService) r0
            java.lang.String r1 = r0.checkNeedCutOutParam(r1)
            com.bytedance.ies.bullet.kit.web.e.a r0 = new com.bytedance.ies.bullet.kit.web.e.a
            if (r3 == 0) goto L_0x0019
            android.net.Uri r2 = r3.mo49903a(r1, r2)
            if (r2 != 0) goto L_0x0022
        L_0x0019:
            android.net.Uri r2 = android.net.Uri.parse(r1)
            java.lang.String r1 = "Uri.parse(webUrl)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r1)
        L_0x0022:
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.utils.C24348b.m59714a(java.lang.String, android.os.Bundle, com.ss.android.ugc.aweme.bullet.api.a):com.bytedance.ies.bullet.kit.web.e.a");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m59712a(java.lang.String r7, java.lang.String r8, com.p683ss.android.ugc.aweme.bullet.api.C24107a r9) {
        /*
            java.lang.String r0 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.bullet.api.IBulletService r0 = com.p683ss.android.ugc.aweme.bullet.impl.BulletService.provideBulletService_Monster()
            com.ss.android.ugc.aweme.bullet.api.IBulletService r0 = (com.p683ss.android.ugc.aweme.bullet.api.IBulletService) r0
            java.lang.String r7 = r0.checkNeedCutOutParam(r7)
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.bytedance.ies.bullet.kit.rn.c.a r0 = new com.bytedance.ies.bullet.kit.rn.c.a
            r0.<init>()
            java.lang.String r1 = "bundle_name"
            java.lang.String r1 = r7.getQueryParameter(r1)
            java.lang.String r2 = "bundle"
            java.lang.String r2 = r7.getQueryParameter(r2)
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            if (r3 != 0) goto L_0x002f
            goto L_0x0044
        L_0x002f:
            if (r1 == 0) goto L_0x0043
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".android.jsbundle"
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            goto L_0x0044
        L_0x0043:
            r2 = r4
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r0.mo18522b(r2)
        L_0x0049:
            java.lang.String r1 = "channel_name"
            java.lang.String r1 = r7.getQueryParameter(r1)
            java.lang.String r2 = "channel"
            java.lang.String r2 = r7.getQueryParameter(r2)
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r3 != 0) goto L_0x0061
            r1 = r2
            goto L_0x007f
        L_0x0061:
            if (r1 == 0) goto L_0x007e
            java.lang.String r2 = "_android"
            r3 = 2
            boolean r2 = p2628d.p2650m.C52830p.m112413c(r1, r2, r5, r3, r4)
            if (r2 != 0) goto L_0x007e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "_android"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x007f
        L_0x007e:
            r1 = r4
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r0.mo18521a(r1)
        L_0x0084:
            java.lang.String r1 = "module_name"
            java.lang.String r1 = r7.getQueryParameter(r1)
            if (r1 == 0) goto L_0x008f
            r0.mo18523c(r1)
        L_0x008f:
            if (r8 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.bullet.utils.b r1 = f64656a
            com.bytedance.ies.bullet.kit.web.e.a r8 = m59714a(r8, r4, r9)
            if (r8 == 0) goto L_0x00a7
            android.net.Uri$Builder r8 = r8.mo18453b()
            android.net.Uri r8 = r8.build()
            if (r8 == 0) goto L_0x00a7
            r0.mo18327a(r8)
            goto L_0x00a8
        L_0x00a7:
            r8 = r4
        L_0x00a8:
            android.net.Uri$Builder r9 = r0.mo18453b()
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r1 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.app.bf r0 = r0.getRnFallback()
            java.lang.String r1 = "SharePrefCache.inst().rnFallback"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.String r1 = "SharePrefCache.inst().rnFallback.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = "force_h5"
            java.lang.String r1 = "1"
            r9.appendQueryParameter(r0, r1)
        L_0x00d6:
            java.lang.String r0 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            java.util.Set r0 = r7.getQueryParameterNames()
            if (r0 == 0) goto L_0x0134
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00e8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0134
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00e8
            java.lang.String r3 = "bundle_name"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r6 = 1
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0125
            java.lang.String r3 = "channel_name"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0125
            java.lang.String r3 = "channel"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0125
            java.lang.String r3 = "bundle"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0125
            java.lang.String r3 = "module_name"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            if (r6 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r2 = r4
        L_0x012a:
            if (r2 == 0) goto L_0x00e8
            java.lang.String r3 = r7.getQueryParameter(r2)
            r9.appendQueryParameter(r2, r3)
            goto L_0x00e8
        L_0x0134:
            if (r8 == 0) goto L_0x0168
            boolean r7 = r8.isHierarchical()
            if (r7 == 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r8 = r4
        L_0x013e:
            if (r8 == 0) goto L_0x0168
            java.util.Set r7 = r8.getQueryParameterNames()
            if (r7 == 0) goto L_0x0168
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x014c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0168
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r0 == 0) goto L_0x0160
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L_0x014c
        L_0x0160:
            java.lang.String r2 = r8.getQueryParameter(r1)
            r9.appendQueryParameter(r1, r2)
            goto L_0x014c
        L_0x0168:
            android.net.Uri r7 = r9.build()
            java.lang.String r8 = "BaseRnKitParamsBuilder()…                }.build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r8 = "Uri.parse(rnUrl).let {\n …      }.build()\n        }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.utils.C24348b.m59712a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.bullet.api.a):android.net.Uri");
    }

    /* renamed from: a */
    public static final Uri m59713a(String str, List<String> list, Bundle bundle, C24107a aVar) {
        List list2;
        String str2;
        C52711k.m112240b(str, "oldUri");
        C10317b bVar = new C10317b();
        if (list != null) {
            list2 = C52575l.m112139e((Collection<? extends T>) list);
        } else {
            list2 = new ArrayList();
        }
        String queryParameter = Uri.parse(str).getQueryParameter("package_name");
        if (queryParameter != null) {
            if (!TextUtils.isEmpty(queryParameter)) {
                list2.add(queryParameter);
            }
            str2 = m59718b(str, "package_name");
        } else {
            str2 = str;
        }
        bVar.mo18390a(list2);
        m59718b(str2, "hybrid_sdk_version");
        if (C52830p.m112411b(str, WebKitApi.SCHEME_HTTP, false, 2, null)) {
            StringBuilder sb = new StringBuilder("aweme://webview/");
            sb.append("?fallback_url=");
            sb.append(Uri.encode(str));
            str = sb.toString();
        }
        String str3 = str;
        Uri parse = Uri.parse(str3);
        String queryParameter2 = parse.getQueryParameter("fallback_url");
        if (queryParameter2 == null) {
            queryParameter2 = parse.getQueryParameter("url");
        }
        String str4 = queryParameter2;
        C52711k.m112236a((Object) parse, "old");
        String authority = parse.getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            if (hashCode != -1772600516) {
                if (hashCode != -1033318826) {
                    if (hashCode == 1224424441 && authority.equals(C23060d.f61427a)) {
                        String queryParameter3 = parse.getQueryParameter("rn_schema");
                        String queryParameter4 = parse.getQueryParameter("lynx_schema");
                        if (queryParameter3 != null) {
                            bVar.mo18388a(m59712a(queryParameter3, str4, aVar));
                        } else if (queryParameter4 != null) {
                            C24349c.m59719a(queryParameter4, str4);
                        } else if (str4 != null) {
                            bVar.mo18389a((C10384e<Builder>) m59714a(str4, bundle, aVar));
                        }
                    }
                } else if (authority.equals("reactnative")) {
                    String queryParameter5 = parse.getQueryParameter("rn_schema");
                    if (queryParameter5 != null) {
                        bVar.mo18388a(m59712a(queryParameter5, str4, (C24107a) null));
                    } else {
                        bVar.mo18388a(m59712a(str3, str4, (C24107a) null));
                    }
                }
            } else if (authority.equals("lynxview")) {
                String queryParameter6 = parse.getQueryParameter("lynx_schema");
                if (queryParameter6 != null) {
                    C24349c.m59719a(queryParameter6, str4);
                } else {
                    C24349c.m59719a(str3, str4);
                }
            }
        }
        Uri build = bVar.mo18453b().build();
        C52711k.m112236a((Object) build, "BulletLoaderParamsUriBui…er()\n            .build()");
        return build;
    }
}
