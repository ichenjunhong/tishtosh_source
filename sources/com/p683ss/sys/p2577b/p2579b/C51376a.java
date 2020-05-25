package com.p683ss.sys.p2577b.p2579b;

import com.C2240a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* renamed from: com.ss.sys.b.b.a */
public final class C51376a {

    /* renamed from: a */
    private static boolean f128478a;

    /* renamed from: a */
    public static String m110494a(String str, byte[] bArr) {
        URL url;
        try {
            url = new URL(str);
        } catch (Throwable unused) {
            url = null;
        }
        return m110495a(url, bArr, "application/octet-stream");
    }

    /* renamed from: a */
    private static String m110495a(URL url, byte[] bArr, String str) {
        URLConnection openConnection;
        try {
            if (!WebKitApi.SCHEME_HTTPS.equals(url.getProtocol().toLowerCase()) || !f128478a) {
                openConnection = url.openConnection();
            } else {
                HttpsURLConnection.setDefaultSSLSocketFactory(SSLContext.getInstance("TLS").getSocketFactory());
                openConnection = url.openConnection(Proxy.NO_PROXY);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            String str2 = "Content-Type";
            URLConnection uRLConnection = httpURLConnection;
            if (C18982g.m46160a(uRLConnection)) {
                C18976b.m46151a(uRLConnection.getURL(), str2, str, "");
            }
            httpURLConnection.setRequestProperty(str2, str);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                return C2240a.m6772a("{\"code\":%d}", new Object[]{Integer.valueOf(responseCode)});
            }
            URLConnection uRLConnection2 = httpURLConnection;
            if (C18982g.m46160a(uRLConnection2)) {
                C18976b.m46151a(uRLConnection2.getURL(), null, null, uRLConnection2.getContentType());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    inputStream.close();
                    outputStream.close();
                    return sb.toString();
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }
}
