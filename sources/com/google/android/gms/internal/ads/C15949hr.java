package com.google.android.gms.internal.ads;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.hr */
public final class C15949hr implements C15948hq<C16037ky> {

    /* renamed from: a */
    private final Context f45035a;

    /* renamed from: b */
    private final zzbgz f45036b;

    public C15949hr(Context context, zzbgz zzbgz) {
        this.f45035a = context;
        this.f45036b = zzbgz;
    }

    /* renamed from: b */
    private static C15953hv m37767b(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            abv.m32793b("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C15952hu(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C15953hv(optString, url, arrayList, optString3);
    }

    /* renamed from: a */
    private static JSONObject m37766a(C15955hx hxVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", hxVar.f45051a);
            if (hxVar.f45054d != null) {
                jSONObject.put("body", hxVar.f45054d);
            }
            JSONArray jSONArray = new JSONArray();
            for (C15952hu huVar : hxVar.f45053c) {
                jSONArray.put(new JSONObject().put("key", huVar.f45042a).put("value", huVar.f45043b));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", hxVar.f45052b);
        } catch (JSONException e) {
            abv.m32793b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C15954hw m37765a(com.google.android.gms.internal.ads.C15953hv r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r13.f45045b     // Catch:{ Exception -> 0x0101, all -> 0x00fe }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x0101, all -> 0x00fe }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0101, all -> 0x00fe }
            com.google.android.gms.internal.ads.acd r3 = com.google.android.gms.ads.internal.C14963ax.m30831a()     // Catch:{ Exception -> 0x00fc }
            android.content.Context r4 = r12.f45035a     // Catch:{ Exception -> 0x00fc }
            com.google.android.gms.internal.ads.zzbgz r5 = r12.f45036b     // Catch:{ Exception -> 0x00fc }
            java.lang.String r5 = r5.f46237a     // Catch:{ Exception -> 0x00fc }
            r3.mo28667a(r4, r5, r0, r2)     // Catch:{ Exception -> 0x00fc }
            java.util.ArrayList<com.google.android.gms.internal.ads.hu> r3 = r13.f45046c     // Catch:{ Exception -> 0x00fc }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x00fc }
            int r4 = r3.size()     // Catch:{ Exception -> 0x00fc }
            r5 = 0
        L_0x0020:
            if (r5 >= r4) goto L_0x0044
            java.lang.Object r6 = r3.get(r5)     // Catch:{ Exception -> 0x00fc }
            int r5 = r5 + 1
            com.google.android.gms.internal.ads.hu r6 = (com.google.android.gms.internal.ads.C15952hu) r6     // Catch:{ Exception -> 0x00fc }
            java.lang.String r7 = r6.f45042a     // Catch:{ Exception -> 0x00fc }
            java.lang.String r6 = r6.f45043b     // Catch:{ Exception -> 0x00fc }
            r8 = r2
            java.net.URLConnection r8 = (java.net.URLConnection) r8     // Catch:{ Exception -> 0x00fc }
            boolean r9 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r8)     // Catch:{ Exception -> 0x00fc }
            if (r9 == 0) goto L_0x0040
            java.net.URL r8 = r8.getURL()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r9 = ""
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r8, r7, r6, r9)     // Catch:{ Exception -> 0x00fc }
        L_0x0040:
            r2.addRequestProperty(r7, r6)     // Catch:{ Exception -> 0x00fc }
            goto L_0x0020
        L_0x0044:
            java.lang.String r3 = r13.f45047d     // Catch:{ Exception -> 0x00fc }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00fc }
            r4 = 1
            if (r3 != 0) goto L_0x006a
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r3 = r13.f45047d     // Catch:{ Exception -> 0x00fc }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00fc }
            int r5 = r3.length     // Catch:{ Exception -> 0x00fc }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ Exception -> 0x00fc }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00fc }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ Exception -> 0x00fc }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00fc }
            r5.write(r3)     // Catch:{ Exception -> 0x00fc }
            r5.close()     // Catch:{ Exception -> 0x00fc }
            goto L_0x006b
        L_0x006a:
            r3 = r1
        L_0x006b:
            com.google.android.gms.internal.ads.aew r5 = new com.google.android.gms.internal.ads.aew     // Catch:{ Exception -> 0x00fc }
            r5.<init>()     // Catch:{ Exception -> 0x00fc }
            r5.mo28767a(r2, r3)     // Catch:{ Exception -> 0x00fc }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00fc }
            r3.<init>()     // Catch:{ Exception -> 0x00fc }
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00fc }
            if (r6 == 0) goto L_0x00bb
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00fc }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x00fc }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00fc }
        L_0x008a:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00fc }
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00fc }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r8 = r7.getValue()     // Catch:{ Exception -> 0x00fc }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00fc }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00fc }
        L_0x00a0:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00fc }
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00fc }
            com.google.android.gms.internal.ads.hu r10 = new com.google.android.gms.internal.ads.hu     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r11 = r7.getKey()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00fc }
            r10.<init>(r11, r9)     // Catch:{ Exception -> 0x00fc }
            r3.add(r10)     // Catch:{ Exception -> 0x00fc }
            goto L_0x00a0
        L_0x00bb:
            com.google.android.gms.internal.ads.hx r6 = new com.google.android.gms.internal.ads.hx     // Catch:{ Exception -> 0x00fc }
            java.lang.String r13 = r13.f45044a     // Catch:{ Exception -> 0x00fc }
            int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x00fc }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00fc }
            r9 = r2
            java.net.URLConnection r9 = (java.net.URLConnection) r9     // Catch:{ Exception -> 0x00fc }
            boolean r10 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r9)     // Catch:{ Exception -> 0x00fc }
            if (r10 == 0) goto L_0x00d9
            java.net.URL r10 = r9.getURL()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r9 = r9.getContentType()     // Catch:{ Exception -> 0x00fc }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r10, r1, r1, r9)     // Catch:{ Exception -> 0x00fc }
        L_0x00d9:
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x00fc }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r8 = com.google.android.gms.internal.ads.acd.m32577a(r8)     // Catch:{ Exception -> 0x00fc }
            r6.<init>(r13, r7, r3, r8)     // Catch:{ Exception -> 0x00fc }
            int r13 = r6.f45052b     // Catch:{ Exception -> 0x00fc }
            r5.mo28766a(r2, r13)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r13 = r6.f45054d     // Catch:{ Exception -> 0x00fc }
            r5.mo28764a(r13)     // Catch:{ Exception -> 0x00fc }
            com.google.android.gms.internal.ads.hw r13 = new com.google.android.gms.internal.ads.hw     // Catch:{ Exception -> 0x00fc }
            r13.<init>(r12, r4, r6, r1)     // Catch:{ Exception -> 0x00fc }
            if (r2 == 0) goto L_0x00fb
            r2.disconnect()
        L_0x00fb:
            return r13
        L_0x00fc:
            r13 = move-exception
            goto L_0x0103
        L_0x00fe:
            r13 = move-exception
            r2 = r1
            goto L_0x0113
        L_0x0101:
            r13 = move-exception
            r2 = r1
        L_0x0103:
            com.google.android.gms.internal.ads.hw r3 = new com.google.android.gms.internal.ads.hw     // Catch:{ all -> 0x0112 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0112 }
            r3.<init>(r12, r0, r1, r13)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0111
            r2.disconnect()
        L_0x0111:
            return r3
        L_0x0112:
            r13 = move-exception
        L_0x0113:
            if (r2 == 0) goto L_0x0118
            r2.disconnect()
        L_0x0118:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15949hr.m37765a(com.google.android.gms.internal.ads.hv):com.google.android.gms.internal.ads.hw");
    }

    /* renamed from: a */
    public final JSONObject mo31085a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            str = jSONObject.optString("http_request_id");
            try {
                C15954hw a = m37765a(m37767b(jSONObject));
                if (a.f45049b) {
                    jSONObject2.put("response", m37766a(a.f45048a));
                    jSONObject2.put("success", true);
                } else {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", a.f45050c);
                }
            } catch (Exception e) {
                e = e;
                abv.m32793b("Error executing http request.", e);
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                } catch (JSONException e2) {
                    abv.m32793b("Error executing http request.", e2);
                }
                return jSONObject2;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            abv.m32793b("Error executing http request.", e);
            jSONObject2.put("response", new JSONObject().put("http_request_id", str));
            jSONObject2.put("success", false);
            jSONObject2.put("reason", e.toString());
            return jSONObject2;
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        acb.m32566a((Runnable) new C15950hs(this, map, (C16037ky) obj));
    }
}
