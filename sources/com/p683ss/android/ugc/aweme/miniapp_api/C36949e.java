package com.p683ss.android.ugc.aweme.miniapp_api;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.e */
public final class C36949e {
    /* renamed from: a */
    public static String m83163a(C36966e eVar) {
        if (eVar == null) {
            return "";
        }
        return eVar.getSchema();
    }

    /* renamed from: f */
    private static boolean m83170f(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m83164a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("app_id");
    }

    /* renamed from: c */
    public static boolean m83167c(String str) {
        if (!m83170f(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microapp");
    }

    /* renamed from: e */
    public static boolean m83169e(String str) {
        if (!m83170f(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microgame");
    }

    /* renamed from: b */
    public static boolean m83166b(String str) {
        if (!m83170f(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m83168d(String str) {
        if (!m83170f(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m83165a(java.lang.String r4, java.lang.String r5, boolean r6, java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L_0x0024
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0023 }
            r2.<init>()     // Catch:{ Exception -> 0x0023 }
            java.lang.String r3 = "web_url"
            r2.put(r3, r7)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r7 = "other_open"
            r0.put(r7, r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L_0x0035
            java.lang.String r7 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r4 = r1
        L_0x0036:
            if (r6 == 0) goto L_0x003b
            java.lang.String r6 = "microgame"
            goto L_0x003d
        L_0x003b:
            java.lang.String r6 = "microapp"
        L_0x003d:
            if (r4 != 0) goto L_0x0042
            java.lang.String r7 = ""
            goto L_0x0046
        L_0x0042:
            java.lang.String r7 = r4.getPath()
        L_0x0046:
            java.util.HashMap r4 = com.p683ss.android.ugc.aweme.miniapp_api.C36946c.m83159a(r4)
            com.tt.miniapphost.entity.MicroSchemaEntity$Builder r1 = new com.tt.miniapphost.entity.MicroSchemaEntity$Builder
            r1.<init>()
            java.lang.String r2 = "microapp"
            if (r6 != r2) goto L_0x0056
            com.tt.miniapphost.entity.MicroSchemaEntity$Host r6 = com.p2615tt.miniapphost.entity.MicroSchemaEntity.Host.MICROAPP
            goto L_0x0058
        L_0x0056:
            com.tt.miniapphost.entity.MicroSchemaEntity$Host r6 = com.p2615tt.miniapphost.entity.MicroSchemaEntity.Host.MICROGAME
        L_0x0058:
            com.tt.miniapphost.entity.MicroSchemaEntity$Builder r6 = r1.host(r6)
            com.tt.miniapphost.entity.MicroSchemaEntity$Builder r5 = r6.appId(r5)
            com.tt.miniapphost.entity.MicroSchemaEntity$Builder r5 = r5.path(r7)
            com.tt.miniapphost.entity.MicroSchemaEntity$Builder r4 = r5.query(r4)
            com.tt.miniapphost.entity.MicroSchemaEntity$Builder r4 = r4.customFields(r0)
            com.tt.miniapphost.entity.MicroSchemaEntity r4 = r4.build()
            java.lang.String r4 = r4.toSchema()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83165a(java.lang.String, java.lang.String, boolean, java.lang.String):java.lang.String");
    }
}
