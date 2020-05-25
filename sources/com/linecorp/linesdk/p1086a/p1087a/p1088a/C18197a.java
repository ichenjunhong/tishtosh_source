package com.linecorp.linesdk.p1086a.p1087a.p1088a;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import com.linecorp.linesdk.C18194a;
import com.linecorp.linesdk.C18233b;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.p1083a.p1084a.C18184a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.linecorp.linesdk.a.a.a.a */
public final class C18197a {

    /* renamed from: a */
    private static final byte[] f50244a = new byte[0];

    /* renamed from: b */
    private final C18202f f50245b;

    /* renamed from: c */
    private final C18201e f50246c;

    /* renamed from: d */
    private int f50247d;

    /* renamed from: e */
    private int f50248e;

    private C18197a(C18202f fVar) {
        this.f50245b = fVar;
        this.f50246c = new C18201e("UTF-8");
        this.f50247d = 90000;
        this.f50248e = 90000;
    }

    /* renamed from: a */
    private static HttpURLConnection m44397a(Uri uri) {
        URLConnection openConnection = new URL(uri.toString()).openConnection();
        if (!(openConnection instanceof HttpsURLConnection)) {
            throw new IllegalArgumentException("The scheme of the server url must be https.".concat(String.valueOf(uri)));
        } else if (VERSION.SDK_INT >= 24) {
            return (HttpURLConnection) openConnection;
        } else {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setSSLSocketFactory(new C18184a(httpsURLConnection.getSSLSocketFactory()));
            return httpsURLConnection;
        }
    }

    /* renamed from: a */
    private static byte[] m44399a(Map<String, String> map) {
        if (map.isEmpty()) {
            return f50244a;
        }
        Builder builder = new Builder();
        for (Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            return builder.build().getEncodedQuery().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public C18197a(Context context, String str) {
        this(new C18202f(context, str));
    }

    /* renamed from: a */
    private static void m44398a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            C18198b.m44402a(httpURLConnection, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: a */
    private static <T> C18194a<T> m44396a(HttpURLConnection httpURLConnection, C18200d<T> dVar, C18200d<String> dVar2) {
        InputStream inputStream;
        if (httpURLConnection.getResponseCode() < 400) {
            URLConnection uRLConnection = httpURLConnection;
            if (C18982g.m46160a(uRLConnection)) {
                C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            inputStream = httpURLConnection.getInputStream();
        } else {
            inputStream = httpURLConnection.getErrorStream();
        }
        List list = (List) httpURLConnection.getHeaderFields().get("Content-Encoding");
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (((String) list.get(i)).equalsIgnoreCase("gzip")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            inputStream = new GZIPInputStream(inputStream);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            try {
                return C18194a.m44389a(C18233b.SERVER_ERROR, new LineApiError(responseCode, (String) dVar2.mo36279a(inputStream)));
            } catch (IOException e) {
                return C18194a.m44389a(C18233b.INTERNAL_ERROR, new LineApiError(responseCode, (Exception) e));
            }
        } else {
            Object a = dVar.mo36279a(inputStream);
            if (a == null) {
                return C18194a.f50236a;
            }
            return new C18194a<>(C18233b.SUCCESS, a, LineApiError.f50227a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.C18194a<T> mo36282b(android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4, java.util.Map<java.lang.String, java.lang.String> r5, com.linecorp.linesdk.p1086a.p1087a.p1088a.C18200d<T> r6) {
        /*
            r2 = this;
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x000c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.appendQueryParameter(r1, r0)
            goto L_0x000c
        L_0x0028:
            r5 = 0
            android.net.Uri r3 = r3.build()     // Catch:{ IOException -> 0x0070 }
            java.net.HttpURLConnection r3 = m44397a(r3)     // Catch:{ IOException -> 0x0070 }
            r0 = 1
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = "User-Agent"
            com.linecorp.linesdk.a.a.a.f r1 = r2.f50245b     // Catch:{ IOException -> 0x0070 }
            java.lang.String r1 = r1.mo36285a()     // Catch:{ IOException -> 0x0070 }
            com.linecorp.linesdk.p1086a.p1087a.p1088a.C18198b.m44402a(r3, r0, r1)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r1 = "gzip"
            com.linecorp.linesdk.p1086a.p1087a.p1088a.C18198b.m44402a(r3, r0, r1)     // Catch:{ IOException -> 0x0070 }
            int r0 = r2.f50247d     // Catch:{ IOException -> 0x0070 }
            r3.setConnectTimeout(r0)     // Catch:{ IOException -> 0x0070 }
            int r0 = r2.f50248e     // Catch:{ IOException -> 0x0070 }
            r3.setReadTimeout(r0)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)     // Catch:{ IOException -> 0x0070 }
            m44398a(r3, r4)     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            r3.connect()     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            com.linecorp.linesdk.a.a.a.e r4 = r2.f50246c     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            com.linecorp.linesdk.a r4 = m44396a(r3, r6, r4)     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            if (r3 == 0) goto L_0x0067
            r3.disconnect()
        L_0x0067:
            return r4
        L_0x0068:
            r4 = move-exception
            r5 = r3
            goto L_0x0082
        L_0x006b:
            r4 = move-exception
            r5 = r3
            goto L_0x0071
        L_0x006e:
            r4 = move-exception
            goto L_0x0082
        L_0x0070:
            r4 = move-exception
        L_0x0071:
            com.linecorp.linesdk.b r3 = com.linecorp.linesdk.C18233b.NETWORK_ERROR     // Catch:{ all -> 0x006e }
            com.linecorp.linesdk.LineApiError r6 = new com.linecorp.linesdk.LineApiError     // Catch:{ all -> 0x006e }
            r6.<init>(r4)     // Catch:{ all -> 0x006e }
            com.linecorp.linesdk.a r3 = com.linecorp.linesdk.C18194a.m44389a(r3, r6)     // Catch:{ all -> 0x006e }
            if (r5 == 0) goto L_0x0081
            r5.disconnect()
        L_0x0081:
            return r3
        L_0x0082:
            if (r5 == 0) goto L_0x0087
            r5.disconnect()
        L_0x0087:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.p1086a.p1087a.p1088a.C18197a.mo36282b(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.d):com.linecorp.linesdk.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.C18194a<T> mo36281a(android.net.Uri r6, java.util.Map<java.lang.String, java.lang.String> r7, java.util.Map<java.lang.String, java.lang.String> r8, com.linecorp.linesdk.p1086a.p1087a.p1088a.C18200d<T> r9) {
        /*
            r5 = this;
            byte[] r8 = m44399a(r8)
            r0 = 0
            int r1 = r8.length     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r6 = m44397a(r6)     // Catch:{ IOException -> 0x0066 }
            r2 = 1
            r6.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "User-Agent"
            com.linecorp.linesdk.a.a.a.f r4 = r5.f50245b     // Catch:{ IOException -> 0x0066 }
            java.lang.String r4 = r4.mo36285a()     // Catch:{ IOException -> 0x0066 }
            com.linecorp.linesdk.p1086a.p1087a.p1088a.C18198b.m44402a(r6, r3, r4)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "gzip"
            com.linecorp.linesdk.p1086a.p1087a.p1088a.C18198b.m44402a(r6, r3, r4)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            com.linecorp.linesdk.p1086a.p1087a.p1088a.C18198b.m44402a(r6, r3, r4)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "Content-Length"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0066 }
            com.linecorp.linesdk.p1086a.p1087a.p1088a.C18198b.m44402a(r6, r3, r1)     // Catch:{ IOException -> 0x0066 }
            int r1 = r5.f50247d     // Catch:{ IOException -> 0x0066 }
            r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0066 }
            int r1 = r5.f50248e     // Catch:{ IOException -> 0x0066 }
            r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r1 = "POST"
            r6.setRequestMethod(r1)     // Catch:{ IOException -> 0x0066 }
            r6.setDoOutput(r2)     // Catch:{ IOException -> 0x0066 }
            m44398a(r6, r7)     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            r6.connect()     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            r7.write(r8)     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            r7.flush()     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            com.linecorp.linesdk.a.a.a.e r7 = r5.f50246c     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            com.linecorp.linesdk.a r7 = m44396a(r6, r9, r7)     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            if (r6 == 0) goto L_0x005d
            r6.disconnect()
        L_0x005d:
            return r7
        L_0x005e:
            r7 = move-exception
            r0 = r6
            goto L_0x0078
        L_0x0061:
            r7 = move-exception
            r0 = r6
            goto L_0x0067
        L_0x0064:
            r7 = move-exception
            goto L_0x0078
        L_0x0066:
            r7 = move-exception
        L_0x0067:
            com.linecorp.linesdk.b r6 = com.linecorp.linesdk.C18233b.NETWORK_ERROR     // Catch:{ all -> 0x0064 }
            com.linecorp.linesdk.LineApiError r8 = new com.linecorp.linesdk.LineApiError     // Catch:{ all -> 0x0064 }
            r8.<init>(r7)     // Catch:{ all -> 0x0064 }
            com.linecorp.linesdk.a r6 = com.linecorp.linesdk.C18194a.m44389a(r6, r8)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0077
            r0.disconnect()
        L_0x0077:
            return r6
        L_0x0078:
            if (r0 == 0) goto L_0x007d
            r0.disconnect()
        L_0x007d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.p1086a.p1087a.p1088a.C18197a.mo36281a(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.d):com.linecorp.linesdk.a");
    }
}
