package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.qh */
public final class C16182qh extends C15922gr {

    /* renamed from: a */
    private final C16235sg f45438a;

    public C16182qh() {
        this(null);
    }

    private C16182qh(C16235sg sgVar) {
        this(null, null);
    }

    private C16182qh(C16235sg sgVar, SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C16135oo mo31076a(com.google.android.gms.internal.ads.brw<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, com.google.android.gms.internal.ads.C15560a {
        /*
            r6 = this;
            java.lang.String r0 = r7.f43726b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r8)
            java.util.Map r8 = r7.mo28744b()
            r1.putAll(r8)
            com.google.android.gms.internal.ads.sg r8 = r6.f45438a
            if (r8 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.sg r8 = r6.f45438a
            java.lang.String r8 = r8.mo31377a(r0)
            if (r8 != 0) goto L_0x003b
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "URL blocked by rewriter: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0030
            java.lang.String r8 = r8.concat(r0)
            goto L_0x0036
        L_0x0030:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            r8 = r0
        L_0x0036:
            r7.<init>(r8)
            throw r7
        L_0x003a:
            r8 = r0
        L_0x003b:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.net.URLConnection r8 = r0.openConnection()
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r8.setInstanceFollowRedirects(r2)
            int r2 = r7.mo30634d()
            r8.setConnectTimeout(r2)
            r8.setReadTimeout(r2)
            r2 = 0
            r8.setUseCaches(r2)
            r3 = 1
            r8.setDoInput(r3)
            java.lang.String r4 = "https"
            java.lang.String r0 = r0.getProtocol()
            r4.equals(r0)
            java.util.Set r0 = r1.keySet()     // Catch:{ all -> 0x0121 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0121 }
        L_0x0070:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0121 }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0121 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.ads.C16183qi.m38657a(r8, r4, r5)     // Catch:{ all -> 0x0121 }
            goto L_0x0070
        L_0x0086:
            int r0 = r7.f43725a     // Catch:{ all -> 0x0121 }
            switch(r0) {
                case -1: goto L_0x00c7;
                case 0: goto L_0x00c2;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00a4;
                case 5: goto L_0x009e;
                case 6: goto L_0x0098;
                case 7: goto L_0x008f;
                default: goto L_0x008b;
            }     // Catch:{ all -> 0x0121 }
        L_0x008b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0121 }
            goto L_0x011b
        L_0x008f:
            java.lang.String r0 = "PATCH"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
            m38655a(r8, r7)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x0098:
            java.lang.String r0 = "TRACE"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x009e:
            java.lang.String r0 = "OPTIONS"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x00a4:
            java.lang.String r0 = "HEAD"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x00aa:
            java.lang.String r0 = "DELETE"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x00b0:
            java.lang.String r0 = "PUT"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
            m38655a(r8, r7)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x00b9:
            java.lang.String r0 = "POST"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
            m38655a(r8, r7)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x00c2:
            java.lang.String r0 = "GET"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0121 }
        L_0x00c7:
            int r0 = r8.getResponseCode()     // Catch:{ all -> 0x0121 }
            r1 = -1
            if (r0 == r1) goto L_0x0113
            int r7 = r7.f43725a     // Catch:{ all -> 0x0121 }
            r1 = 4
            if (r7 == r1) goto L_0x00e5
            r7 = 100
            if (r7 > r0) goto L_0x00db
            r7 = 200(0xc8, float:2.8E-43)
            if (r0 < r7) goto L_0x00e5
        L_0x00db:
            r7 = 204(0xcc, float:2.86E-43)
            if (r0 == r7) goto L_0x00e5
            r7 = 304(0x130, float:4.26E-43)
            if (r0 == r7) goto L_0x00e5
            r7 = 1
            goto L_0x00e6
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            if (r7 != 0) goto L_0x00f9
            com.google.android.gms.internal.ads.oo r7 = new com.google.android.gms.internal.ads.oo     // Catch:{ all -> 0x0121 }
            java.util.Map r1 = r8.getHeaderFields()     // Catch:{ all -> 0x0121 }
            java.util.List r1 = m38654a(r1)     // Catch:{ all -> 0x0121 }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x0121 }
            r8.disconnect()
            return r7
        L_0x00f9:
            com.google.android.gms.internal.ads.oo r7 = new com.google.android.gms.internal.ads.oo     // Catch:{ all -> 0x0110 }
            java.util.Map r1 = r8.getHeaderFields()     // Catch:{ all -> 0x0110 }
            java.util.List r1 = m38654a(r1)     // Catch:{ all -> 0x0110 }
            int r2 = r8.getContentLength()     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.ri r4 = new com.google.android.gms.internal.ads.ri     // Catch:{ all -> 0x0110 }
            r4.<init>(r8)     // Catch:{ all -> 0x0110 }
            r7.<init>(r0, r1, r2, r4)     // Catch:{ all -> 0x0110 }
            return r7
        L_0x0110:
            r7 = move-exception
            r2 = 1
            goto L_0x0122
        L_0x0113:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r0)     // Catch:{ all -> 0x0121 }
            throw r7     // Catch:{ all -> 0x0121 }
        L_0x011b:
            java.lang.String r0 = "Unknown method type."
            r7.<init>(r0)     // Catch:{ all -> 0x0121 }
            throw r7     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r7 = move-exception
        L_0x0122:
            if (r2 != 0) goto L_0x0127
            r8.disconnect()
        L_0x0127:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16182qh.mo31076a(com.google.android.gms.internal.ads.brw, java.util.Map):com.google.android.gms.internal.ads.oo");
    }

    /* renamed from: a */
    private static List<blz> m38654a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String blz : (List) entry.getValue()) {
                    arrayList.add(new blz((String) entry.getKey(), blz));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m38655a(HttpURLConnection httpURLConnection, brw<?> brw) throws IOException, C15560a {
        byte[] a = brw.mo28743a();
        if (a != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                String str = "Content-Type";
                String str2 = "application/x-www-form-urlencoded; charset=";
                String valueOf = String.valueOf("UTF-8");
                C16183qi.m38657a(httpURLConnection, str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a);
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    static InputStream m38653a(HttpURLConnection httpURLConnection) {
        try {
            URLConnection uRLConnection = httpURLConnection;
            if (C18982g.m46160a(uRLConnection)) {
                C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }
}
