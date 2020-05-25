package com.p683ss.p1096a.p1097a;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.ss.a.a.b */
public abstract class C18478b {

    /* renamed from: a */
    public String f50893a = "";

    /* renamed from: b */
    int f50894b = 10000;

    /* renamed from: c */
    int f50895c = 1;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public int f50896d;

    /* renamed from: e */
    Handler f50897e;

    /* renamed from: f */
    private Context f50898f;

    /* renamed from: g */
    private String f50899g;

    /* renamed from: h */
    private int f50900h;

    /* renamed from: i */
    private int f50901i;

    /* renamed from: j */
    private byte[] f50902j;

    /* renamed from: k */
    private int f50903k = -1;

    /* renamed from: l */
    private byte[] f50904l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f50905m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public HandlerThread f50906n;

    /* renamed from: o */
    private boolean f50907o;

    /* renamed from: p */
    private HttpURLConnection f50908p;

    public C18478b(Context context, String str) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f50898f = context;
        this.f50899g = str;
    }

    /* renamed from: a */
    private static byte[] m44720a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = inputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public abstract boolean mo37728a(int i, byte[] bArr);

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|(1:36)|37|(6:38|39|(1:41)|42|43|44)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r2 = "GET";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r7.f50908p.setRequestMethod(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        switch(r7.f50901i) {
            case 1: goto L_0x0061;
            case 2: goto L_0x005e;
            default: goto L_0x005b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r2 = "application/octet-stream";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r2 = "application/json; charset=utf-8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r2.length() <= 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        com.p683ss.p1096a.p1097a.C18480c.m44724a(r7.f50908p, "Content-Type", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r4 = new java.lang.StringBuilder("sessionid=");
        r4.append(r7.f50899g);
        com.p683ss.p1096a.p1097a.C18480c.m44724a(r7.f50908p, "Cookie", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2 = java.util.Locale.getDefault().getLanguage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r2.equalsIgnoreCase("zh") == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r3 = r7.f50908p;
        r4 = "Accept-Language";
        r5 = new java.lang.StringBuilder();
        r5.append(java.util.Locale.getDefault().toString());
        r5.append(",");
        r5.append(r2);
        r5.append(";q=0.9");
        r2 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        com.p683ss.p1096a.p1097a.C18480c.m44724a(r3, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        r3 = r7.f50908p;
        r4 = "Accept-Language";
        r5 = new java.lang.StringBuilder();
        r5.append(java.util.Locale.getDefault().toString());
        r5.append(",");
        r5.append(r2);
        r5.append(";q=0.9,en-US;q=0.6,en;q=0.4");
        r2 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        r7.f50908p.setDoOutput(true);
        r2 = r7.f50908p.getOutputStream();
        r2.write(r7.f50902j);
        r2.flush();
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0105, code lost:
        r7.f50908p.connect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7.f50903k = r7.f50908p.getResponseCode();
        r2 = r7.f50908p;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011b, code lost:
        if (com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r3) != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r3.getURL(), null, null, r3.getContentType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0128, code lost:
        r2 = r2.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r7.f50904l = m44720a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0132, code lost:
        if (r2 == null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0138, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        if (r2 != null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013e, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0141, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0142, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0143, code lost:
        if (r2 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        if (r7.f50908p == null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014a, code lost:
        r7.f50908p.disconnect();
        r7.f50908p = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0152, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0155, code lost:
        if (r7.f50908p != null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        r7.f50908p.disconnect();
        r7.f50908p = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0163, code lost:
        if (r7.f50908p == null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0166, code lost:
        if (r0 == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        mo37728a(r7.f50903k, r7.f50904l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016f, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00e6 */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013e A[Catch:{ Throwable -> 0x015f, all -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0152 A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:31:0x00e6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo37727a() {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.lang.String r3 = r7.f50893a     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            boolean r3 = r7.f50907o     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = "TLS"
            javax.net.ssl.SSLContext r3 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            javax.net.ssl.SSLSocketFactory r3 = r3.getSocketFactory()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r3)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.net.URLConnection r2 = r2.openConnection(r3)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
        L_0x0022:
            r7.f50908p = r2     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            goto L_0x002c
        L_0x0025:
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            goto L_0x0022
        L_0x002c:
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            int r3 = r7.f50894b     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.setConnectTimeout(r3)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            int r3 = r7.f50894b     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.setReadTimeout(r3)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            int r2 = r7.f50900h     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            switch(r2) {
                case 1: goto L_0x004f;
                case 2: goto L_0x004c;
                case 3: goto L_0x0049;
                case 4: goto L_0x0046;
                case 5: goto L_0x0043;
                case 6: goto L_0x0040;
                default: goto L_0x003f;
            }     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
        L_0x003f:
            goto L_0x004c
        L_0x0040:
            java.lang.String r2 = "TRACE"
            goto L_0x0051
        L_0x0043:
            java.lang.String r2 = "HEAD"
            goto L_0x0051
        L_0x0046:
            java.lang.String r2 = "DELETE"
            goto L_0x0051
        L_0x0049:
            java.lang.String r2 = "PUT"
            goto L_0x0051
        L_0x004c:
            java.lang.String r2 = "GET"
            goto L_0x0051
        L_0x004f:
            java.lang.String r2 = "POST"
        L_0x0051:
            java.net.HttpURLConnection r3 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r3.setRequestMethod(r2)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            int r2 = r7.f50901i     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            switch(r2) {
                case 1: goto L_0x0061;
                case 2: goto L_0x005e;
                default: goto L_0x005b;
            }     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
        L_0x005b:
            java.lang.String r2 = ""
            goto L_0x0063
        L_0x005e:
            java.lang.String r2 = "application/octet-stream"
            goto L_0x0063
        L_0x0061:
            java.lang.String r2 = "application/json; charset=utf-8"
        L_0x0063:
            int r3 = r2.length()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            if (r3 <= 0) goto L_0x0070
            java.net.HttpURLConnection r3 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.lang.String r4 = "Content-Type"
            com.p683ss.p1096a.p1097a.C18480c.m44724a(r3, r4, r2)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
        L_0x0070:
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.lang.String r3 = "Cookie"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.lang.String r5 = "sessionid="
            r4.<init>(r5)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.lang.String r5 = r7.f50899g     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r4.append(r5)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            com.p683ss.p1096a.p1097a.C18480c.m44724a(r2, r3, r4)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r2 = r2.getLanguage()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r3 = "zh"
            boolean r3 = r2.equalsIgnoreCase(r3)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            if (r3 == 0) goto L_0x00c0
            java.net.HttpURLConnection r3 = r7.f50908p     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r4 = "Accept-Language"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            r5.<init>()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            r5.append(r6)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            r5.append(r2)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r2 = ";q=0.9"
            r5.append(r2)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r2 = r5.toString()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
        L_0x00bc:
            com.p683ss.p1096a.p1097a.C18480c.m44724a(r3, r4, r2)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            goto L_0x00e6
        L_0x00c0:
            java.net.HttpURLConnection r3 = r7.f50908p     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r4 = "Accept-Language"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            r5.<init>()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            r5.append(r6)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            r5.append(r2)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r2 = ";q=0.9,en-US;q=0.6,en;q=0.4"
            r5.append(r2)     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            java.lang.String r2 = r5.toString()     // Catch:{ Throwable -> 0x00e6, all -> 0x0152 }
            goto L_0x00bc
        L_0x00e6:
            byte[] r2 = r7.f50902j     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            if (r2 == 0) goto L_0x0105
            byte[] r2 = r7.f50902j     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            if (r2 <= 0) goto L_0x0105
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.setDoOutput(r0)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            byte[] r3 = r7.f50902j     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.write(r3)     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.flush()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.close()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
        L_0x0105:
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            r2.connect()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            int r2 = r2.getResponseCode()     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            r7.f50903k = r2     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            java.net.HttpURLConnection r2 = r7.f50908p     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            r3 = r2
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            boolean r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r3)     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            if (r4 == 0) goto L_0x0128
            java.net.URL r4 = r3.getURL()     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            java.lang.String r3 = r3.getContentType()     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r4, r1, r1, r3)     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
        L_0x0128:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Throwable -> 0x0142, all -> 0x013a }
            byte[] r3 = m44720a(r2)     // Catch:{ Throwable -> 0x0143, all -> 0x0138 }
            r7.f50904l = r3     // Catch:{ Throwable -> 0x0143, all -> 0x0138 }
            if (r2 == 0) goto L_0x0146
        L_0x0134:
            r2.close()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
            goto L_0x0146
        L_0x0138:
            r0 = move-exception
            goto L_0x013c
        L_0x013a:
            r0 = move-exception
            r2 = r1
        L_0x013c:
            if (r2 == 0) goto L_0x0141
            r2.close()     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
        L_0x0141:
            throw r0     // Catch:{ Throwable -> 0x015f, all -> 0x0152 }
        L_0x0142:
            r2 = r1
        L_0x0143:
            if (r2 == 0) goto L_0x0146
            goto L_0x0134
        L_0x0146:
            java.net.HttpURLConnection r2 = r7.f50908p
            if (r2 == 0) goto L_0x0166
        L_0x014a:
            java.net.HttpURLConnection r2 = r7.f50908p
            r2.disconnect()
            r7.f50908p = r1
            goto L_0x0166
        L_0x0152:
            r0 = move-exception
            java.net.HttpURLConnection r2 = r7.f50908p
            if (r2 == 0) goto L_0x015e
            java.net.HttpURLConnection r2 = r7.f50908p
            r2.disconnect()
            r7.f50908p = r1
        L_0x015e:
            throw r0
        L_0x015f:
            r0 = 0
            java.net.HttpURLConnection r2 = r7.f50908p
            if (r2 == 0) goto L_0x0166
            goto L_0x014a
        L_0x0166:
            if (r0 == 0) goto L_0x016f
            int r1 = r7.f50903k
            byte[] r2 = r7.f50904l
            r7.mo37728a(r1, r2)
        L_0x016f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p1096a.p1097a.C18478b.mo37727a():boolean");
    }

    /* renamed from: a */
    public final synchronized void mo37726a(int i, int i2, byte[] bArr) {
        if (!this.f50905m) {
            this.f50895c = 2;
            this.f50900h = i;
            this.f50901i = i2;
            this.f50902j = bArr;
            this.f50905m = true;
            this.f50896d = 0;
            this.f50906n = new HandlerThread("request");
            this.f50906n.start();
            this.f50897e = new Handler(this.f50906n.getLooper(), new Callback() {
                public final boolean handleMessage(Message message) {
                    if (C18478b.this.f50896d >= C18478b.this.f50895c) {
                        C18478b.this.f50905m = false;
                        C18478b.this.f50896d = 0;
                        C18478b.this.f50906n.quit();
                        return false;
                    } else if (C18478b.this.mo37727a()) {
                        C18478b.this.f50905m = false;
                        C18478b.this.f50896d = 0;
                        C18478b.this.f50906n.quit();
                        return true;
                    } else {
                        C18478b.this.f50897e.sendEmptyMessageDelayed(1, (long) (C18478b.this.f50894b * 1));
                        C18478b.this.f50896d++;
                        return false;
                    }
                }
            });
            this.f50897e.sendEmptyMessage(1);
        }
    }
}
