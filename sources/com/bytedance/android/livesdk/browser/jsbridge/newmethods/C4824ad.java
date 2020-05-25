package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.ies.p675g.p677b.C10782e;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad */
public final class C4824ad extends C10782e<JSONObject, Object> {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5, com.bytedance.ies.p675g.p677b.C10783f r6) throws java.lang.Exception {
        /*
            r4 = this;
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r6 = "type"
            java.lang.String r6 = r5.optString(r6)
            java.lang.String r0 = "args"
            org.json.JSONObject r5 = r5.getJSONObject(r0)
            int r0 = r6.hashCode()
            r1 = -1853762817(0xffffffff9181d2ff, float:-2.0482648E-28)
            if (r0 == r1) goto L_0x0036
            r1 = -858688242(0xffffffffccd1750e, float:-1.0981592E8)
            if (r0 == r1) goto L_0x002c
            r1 = 1821543916(0x6c928dec, float:1.417387E27)
            if (r0 == r1) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            java.lang.String r0 = "monitorStatus"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 0
            goto L_0x0041
        L_0x002c:
            java.lang.String r0 = "monitorDuration"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "monitorStatusAndDuration"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 2
            goto L_0x0041
        L_0x0040:
            r6 = -1
        L_0x0041:
            switch(r6) {
                case 0: goto L_0x0077;
                case 1: goto L_0x0061;
                case 2: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x008c
        L_0x0045:
            java.lang.String r6 = "service"
            java.lang.String r6 = r5.optString(r6)
            java.lang.String r0 = "status"
            int r0 = r5.optInt(r0)
            java.lang.String r1 = "duration"
            long r1 = r5.optLong(r1)
            java.lang.String r3 = "ext_json"
            org.json.JSONObject r5 = r5.optJSONObject(r3)
            com.bytedance.android.live.core.p225d.C3837e.m9742a(r6, r0, r1, r5)
            goto L_0x008c
        L_0x0061:
            java.lang.String r6 = "service"
            java.lang.String r6 = r5.optString(r6)
            java.lang.String r0 = "duration"
            long r0 = r5.optLong(r0)
            java.lang.String r2 = "ext_json"
            org.json.JSONObject r5 = r5.optJSONObject(r2)
            com.bytedance.android.live.core.p225d.C3837e.m9746a(r6, r0, r5)
            goto L_0x008c
        L_0x0077:
            java.lang.String r6 = "service"
            java.lang.String r6 = r5.optString(r6)
            java.lang.String r0 = "status"
            int r0 = r5.optInt(r0)
            java.lang.String r1 = "ext_json"
            org.json.JSONObject r5 = r5.optJSONObject(r1)
            com.bytedance.android.live.core.p225d.C3837e.m9744a(r6, r0, r5)
        L_0x008c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4824ad.invoke(java.lang.Object, com.bytedance.ies.g.b.f):java.lang.Object");
    }
}
