package com.bytedance.p582g.p583a.p584a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.frameworks.core.p577a.C9925b;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.g.a.a.b */
public final class C9946b {

    /* renamed from: a */
    private static C9948b f27029a;

    /* renamed from: com.bytedance.g.a.a.b$a */
    public enum C9947a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f27031a;

        private C9947a(int i) {
            this.f27031a = i;
        }
    }

    /* renamed from: com.bytedance.g.a.a.b$b */
    public interface C9948b {
        /* renamed from: a */
        String mo17908a(String str, byte[] bArr);
    }

    /* renamed from: com.bytedance.g.a.a.b$c */
    public enum C9949c {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f27033a;

        public final int getValue() {
            return this.f27033a;
        }

        private C9949c(int i) {
            this.f27033a = i;
        }
    }

    /* renamed from: a */
    private static byte[] m19989a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static boolean m19987a(Context context) {
        try {
            NetworkInfo a = C9950c.m19993a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    if (1 == a.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static C9949c m19991b(Context context) {
        try {
            NetworkInfo a = C9950c.m19993a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C9949c.WIFI;
                    }
                    if (type != 0) {
                        return C9949c.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return C9949c.MOBILE_3G;
                        case 13:
                            return C9949c.MOBILE_4G;
                        default:
                            return C9949c.MOBILE;
                    }
                }
            }
            return C9949c.NONE;
        } catch (Throwable unused) {
            return C9949c.MOBILE;
        }
    }

    /* renamed from: a */
    public static String m19986a(String str, byte[] bArr) {
        if (f27029a != null) {
            return f27029a.mo17908a(str, bArr);
        }
        return str;
    }

    /* renamed from: a */
    public static byte[] m19988a(long j, String str, byte[] bArr, C9947a aVar, String str2, boolean z) throws Throwable {
        byte[] bArr2;
        String str3;
        String str4 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (C9947a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str4 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (C9947a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str4 = "deflate";
        }
        String str5 = str4;
        byte[] a = C9925b.m19906a(bArr, bArr.length);
        if (a != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("?");
                    str = sb.toString();
                }
            } else if (!str.endsWith("&")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("&");
                str = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("tt_data=a");
            str2 = "application/octet-stream;tt-data=a";
            bArr2 = a;
            str3 = sb3.toString();
        } else {
            str3 = str;
            bArr2 = bArr;
        }
        return m19990a(str3, bArr2, str2, str5, "POST", true, true);
    }

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0101 A[SYNTHETIC, Splitter:B:72:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0108 A[SYNTHETIC, Splitter:B:76:0x0108] */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m19990a(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) throws java.lang.Throwable {
        /*
            r8 = 0
            com.bytedance.g.a.a.b$b r0 = f27029a     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            if (r0 == 0) goto L_0x000b
            com.bytedance.g.a.a.b$b r0 = f27029a     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.lang.String r3 = r0.mo17908a(r3, r4)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
        L_0x000b:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r0.<init>()     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            if (r9 == 0) goto L_0x001c
            java.lang.String r3 = com.bytedance.frameworks.core.p577a.C9923a.m19898a(r3, r0)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            goto L_0x0021
        L_0x001c:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
        L_0x0021:
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            if (r9 == 0) goto L_0x0056
            boolean r9 = r0.isEmpty()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r9 != 0) goto L_0x0056
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0033:
            boolean r0 = r9.hasNext()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r9.next()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r0.first     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.Object r0 = r0.second     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.p582g.p583a.p584a.C9950c.m19994a(r3, r1, r0)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0033
        L_0x004d:
            r4 = move-exception
            goto L_0x00ff
        L_0x0050:
            r4 = move-exception
            r2 = r8
            r8 = r3
            r3 = r2
            goto L_0x00fa
        L_0x0056:
            r9 = 1
            r3.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 == 0) goto L_0x0061
            java.lang.String r9 = "Content-Type"
            com.bytedance.p582g.p583a.p584a.C9950c.m19994a(r3, r9, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0061:
            if (r6 == 0) goto L_0x0068
            java.lang.String r5 = "Content-Encoding"
            com.bytedance.p582g.p583a.p584a.C9950c.m19994a(r3, r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0068:
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r6 = "gzip"
            com.bytedance.p582g.p583a.p584a.C9950c.m19994a(r3, r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = "Version-Code"
            java.lang.String r6 = "1"
            com.bytedance.p582g.p583a.p584a.C9950c.m19994a(r3, r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r3.setRequestMethod(r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r4 == 0) goto L_0x0090
            int r5 = r4.length     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 <= 0) goto L_0x0090
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.write(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.flush()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.close()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0090:
            int r4 = r3.getResponseCode()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x00e9
            r4 = r3
            java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            boolean r5 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 == 0) goto L_0x00ac
            java.net.URL r5 = r4.getURL()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r4 = r4.getContentType()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r5, r8, r8, r4)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00ac:
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = r3.getContentEncoding()     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r6 != 0) goto L_0x00cf
            java.lang.String r6 = "gzip"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r5 == 0) goto L_0x00cf
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            byte[] r6 = m19989a(r5)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            r5.close()     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            goto L_0x00d3
        L_0x00cf:
            byte[] r6 = m19989a(r4)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
        L_0x00d3:
            if (r4 == 0) goto L_0x00da
            r4.close()     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00da
        L_0x00d9:
        L_0x00da:
            if (r3 == 0) goto L_0x00df
            r3.disconnect()     // Catch:{ Exception -> 0x00df }
        L_0x00df:
            return r6
        L_0x00e0:
            r5 = move-exception
            r8 = r4
            r4 = r5
            goto L_0x00ff
        L_0x00e4:
            r5 = move-exception
            r8 = r3
            r3 = r4
            r4 = r5
            goto L_0x00fa
        L_0x00e9:
            java.lang.String r5 = r3.getResponseMessage()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.apm.net.a r6 = new com.bytedance.apm.net.a     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r6.<init>(r4, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r6     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00f3:
            r3 = move-exception
            r4 = r3
            r3 = r8
            goto L_0x00ff
        L_0x00f7:
            r3 = move-exception
            r4 = r3
            r3 = r8
        L_0x00fa:
            throw r4     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r4 = move-exception
            r2 = r8
            r8 = r3
            r3 = r2
        L_0x00ff:
            if (r8 == 0) goto L_0x0106
            r8.close()     // Catch:{ Exception -> 0x0105 }
            goto L_0x0106
        L_0x0105:
        L_0x0106:
            if (r3 == 0) goto L_0x010b
            r3.disconnect()     // Catch:{ Exception -> 0x010b }
        L_0x010b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p584a.C9946b.m19990a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):byte[]");
    }
}
