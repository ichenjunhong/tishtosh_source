package com.p683ss.caijing.globaliap.p2561e;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.caijing.globaliap.p2561e.p2562a.C51273a;
import com.p683ss.caijing.globaliap.pay.C51292c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.e.c */
public final class C51276c {

    /* renamed from: c */
    public static C51281f f128044c;

    /* renamed from: a */
    String f128045a;

    /* renamed from: b */
    String f128046b;

    /* renamed from: d */
    private boolean f128047d;

    /* renamed from: com.ss.caijing.globaliap.e.c$a */
    public static class C51277a {

        /* renamed from: a */
        public C51276c f128048a = new C51276c(0);

        /* renamed from: a */
        public final C51277a mo101800a(String str) {
            this.f128048a.f128045a = str;
            return this;
        }

        /* renamed from: a */
        public final C51277a mo101801a(Map<String, String> map) {
            this.f128048a.f128046b = m110235b(map);
            return this;
        }

        /* renamed from: b */
        private static String m110235b(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (String str : map.keySet()) {
                if (z) {
                    sb.append(str);
                    sb.append("=");
                    sb.append((String) map.get(str));
                    z = false;
                } else {
                    sb.append("&");
                    sb.append(str);
                    sb.append("=");
                    sb.append((String) map.get(str));
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.e.c$b */
    public static class C51278b {

        /* renamed from: a */
        public int f128049a;

        /* renamed from: b */
        public String f128050b;

        private C51278b(int i, String str) {
            this.f128049a = i;
            this.f128050b = str;
        }

        /* synthetic */ C51278b(int i, String str, byte b) {
            this(i, str);
        }
    }

    private C51276c() {
        this.f128047d = true;
    }

    /* renamed from: b */
    private static String m110233b() {
        int i;
        Context b = C51292c.m110280b();
        if (b == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_ip", C51273a.m110229b(b));
            String str = "ua";
            StringBuilder sb = new StringBuilder("CJPay-3.3.0-Android");
            sb.append(VERSION.RELEASE);
            sb.append("-");
            sb.append(C51273a.m110228a(b));
            sb.append("-");
            int i2 = 0;
            if (b == null) {
                i = 0;
            } else {
                i = C51273a.m110230c(b).y;
            }
            sb.append(i);
            sb.append("_");
            if (b != null) {
                i2 = C51273a.m110230c(b).x;
            }
            sb.append(i2);
            sb.append("_");
            sb.append(Build.MODEL);
            jSONObject.put(str, sb.toString());
            jSONObject.put("lang", "en");
            return URLEncoder.encode(jSONObject.toString(), "UTF-8");
        } catch (JSONException e) {
            C17840a.m43754b(e);
            return "";
        } catch (UnsupportedEncodingException e2) {
            C17840a.m43754b(e2);
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d6, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.caijing.globaliap.p2561e.C51276c.C51278b mo101799a() {
        /*
            r6 = this;
            boolean r0 = com.p683ss.base.p2547b.C51160c.m110049a()
            if (r0 != 0) goto L_0x00e0
            r0 = 0
            f128044c = r0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00cc }
            java.lang.String r3 = r6.f128045a     // Catch:{ Exception -> 0x00cc }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00cc }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00cc }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00cc }
            boolean r3 = r6.f128047d     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r4 = 1
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            goto L_0x002a
        L_0x0025:
            java.lang.String r3 = "GET"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
        L_0x002a:
            r2.setDoInput(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r2.setUseCaches(r1)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r3 = 20000(0x4e20, float:2.8026E-41)
            r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            com.p683ss.caijing.globaliap.p2561e.C51279d.m110238a(r2, r3, r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r3 = "Accept-Charset"
            java.lang.String r4 = "UTF-8;"
            com.p683ss.caijing.globaliap.p2561e.C51279d.m110238a(r2, r3, r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            com.p683ss.caijing.globaliap.p2561e.C51279d.m110238a(r2, r3, r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r3 = "Content-Length"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r4.<init>()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r5 = r6.f128046b     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            byte[] r5 = r5.getBytes()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            int r5 = r5.length     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r4.append(r5)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            com.p683ss.caijing.globaliap.p2561e.C51279d.m110238a(r2, r3, r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r3 = "devinfo"
            java.lang.String r4 = m110233b()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            com.p683ss.caijing.globaliap.p2561e.C51279d.m110238a(r2, r3, r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r4 = r6.f128046b     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            if (r4 == 0) goto L_0x0087
            r3.write(r0)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            goto L_0x0090
        L_0x0087:
            java.lang.String r4 = r6.f128046b     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r3.write(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
        L_0x0090:
            r3.flush()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r3.close()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r3 = r2
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            boolean r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            if (r4 == 0) goto L_0x00aa
            java.net.URL r4 = r3.getURL()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r3 = r3.getContentType()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r4, r0, r0, r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
        L_0x00aa:
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            int r3 = r2.getResponseCode()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r4 = m110232a(r0)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            com.ss.caijing.globaliap.e.c$b r5 = new com.ss.caijing.globaliap.e.c$b     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r5.<init>(r3, r4, r1)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r0.close()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            if (r2 == 0) goto L_0x00d9
            r2.disconnect()
            goto L_0x00d9
        L_0x00c4:
            r0 = move-exception
            goto L_0x00da
        L_0x00c6:
            r0 = r2
            goto L_0x00cc
        L_0x00c8:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x00da
        L_0x00cc:
            com.ss.caijing.globaliap.e.c$b r5 = new com.ss.caijing.globaliap.e.c$b     // Catch:{ all -> 0x00c8 }
            r2 = -1
            java.lang.String r3 = "error"
            r5.<init>(r2, r3, r1)     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00d9
            r0.disconnect()
        L_0x00d9:
            return r5
        L_0x00da:
            if (r2 == 0) goto L_0x00df
            r2.disconnect()
        L_0x00df:
            throw r0
        L_0x00e0:
            com.ss.caijing.globaliap.e.b r0 = new com.ss.caijing.globaliap.e.b
            java.lang.String r1 = "should not use this method in ui thread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.caijing.globaliap.p2561e.C51276c.mo101799a():com.ss.caijing.globaliap.e.c$b");
    }

    /* synthetic */ C51276c(byte b) {
        this();
    }

    /* renamed from: a */
    private static String m110232a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }
}
