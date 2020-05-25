package com.bytedance.p582g.p583a.p592d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.frameworks.core.p577a.C9925b;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.g.a.d.h */
public final class C10004h {

    /* renamed from: a */
    private static C10006b f27160a;

    /* renamed from: com.bytedance.g.a.d.h$a */
    public enum C10005a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f27162a;

        private C10005a(int i) {
            this.f27162a = i;
        }
    }

    /* renamed from: com.bytedance.g.a.d.h$b */
    public interface C10006b {
        /* renamed from: a */
        String mo17973a(String str, byte[] bArr);
    }

    /* renamed from: com.bytedance.g.a.d.h$c */
    public enum C10007c {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f27164a;

        public final int getValue() {
            return this.f27164a;
        }

        private C10007c(int i) {
            this.f27164a = i;
        }
    }

    /* renamed from: a */
    private static byte[] m20118a(InputStream inputStream) throws IOException {
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

    /* renamed from: b */
    public static boolean m20120b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo a = C10008i.m20122a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static C10007c m20116a(Context context) {
        try {
            NetworkInfo a = C10008i.m20122a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C10007c.WIFI;
                    }
                    if (type != 0) {
                        return C10007c.MOBILE;
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
                            return C10007c.MOBILE_3G;
                        case 13:
                            return C10007c.MOBILE_4G;
                        default:
                            return C10007c.MOBILE;
                    }
                }
            }
            return C10007c.NONE;
        } catch (Throwable unused) {
            return C10007c.MOBILE;
        }
    }

    /* renamed from: a */
    public static byte[] m20117a(long j, String str, byte[] bArr, C10005a aVar, String str2, boolean z) throws Throwable {
        String str3;
        byte[] bArr2;
        String str4;
        String str5 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (C10005a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str5 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (C10005a.DEFLATER == aVar && length > 128) {
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
            str5 = "deflate";
        }
        byte[] bArr4 = bArr;
        String str6 = str5;
        if (z) {
            byte[] a = C9925b.m19906a(bArr4, bArr4.length);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("&tt_data=a");
                String sb2 = sb.toString();
                bArr2 = a;
                str4 = sb2;
                str3 = "application/octet-stream;tt-data=a";
            } else {
                str4 = str;
                str3 = str2;
                bArr2 = bArr4;
            }
            return m20119a(str4, bArr2, str3, str6, "POST", true, true);
        }
        return m20119a(str, bArr4, str2, str6, "POST", true, false);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v10, types: [java.util.zip.GZIPInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0118 A[SYNTHETIC, Splitter:B:93:0x0118] */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m20119a(java.lang.String r4, byte[] r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) throws java.lang.Throwable {
        /*
            r0 = 0
            com.bytedance.g.a.d.h$b r1 = f27160a     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            if (r1 == 0) goto L_0x000b
            com.bytedance.g.a.d.h$b r1 = f27160a     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            java.lang.String r4 = r1.mo17973a(r4, r5)     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
        L_0x000b:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            r1.<init>()     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            if (r10 == 0) goto L_0x001c
            java.lang.String r4 = com.bytedance.frameworks.core.p577a.C9923a.m19898a(r4, r1)     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            goto L_0x0021
        L_0x001c:
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
        L_0x0021:
            java.net.URLConnection r4 = r2.openConnection()     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x010b, all -> 0x0107 }
            if (r10 == 0) goto L_0x0056
            boolean r10 = r1.isEmpty()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r10 != 0) goto L_0x0056
            java.util.Iterator r10 = r1.iterator()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0033:
            boolean r1 = r10.hasNext()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r1 == 0) goto L_0x0056
            java.lang.Object r1 = r10.next()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r2 = r1.first     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.Object r1 = r1.second     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.p582g.p583a.p592d.C10008i.m20123a(r4, r2, r1)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0033
        L_0x004d:
            r5 = move-exception
            goto L_0x0113
        L_0x0050:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x010e
        L_0x0056:
            if (r9 == 0) goto L_0x005d
            r9 = 1
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0061
        L_0x005d:
            r9 = 0
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0061:
            if (r6 == 0) goto L_0x0068
            java.lang.String r9 = "Content-Type"
            com.bytedance.p582g.p583a.p592d.C10008i.m20123a(r4, r9, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0068:
            if (r7 == 0) goto L_0x006f
            java.lang.String r6 = "Content-Encoding"
            com.bytedance.p582g.p583a.p592d.C10008i.m20123a(r4, r6, r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x006f:
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r7 = "gzip"
            com.bytedance.p582g.p583a.p592d.C10008i.m20123a(r4, r6, r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r6 = "Version-Code"
            java.lang.String r7 = "1"
            com.bytedance.p582g.p583a.p592d.C10008i.m20123a(r4, r6, r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r4.setRequestMethod(r8)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 == 0) goto L_0x00a0
            int r6 = r5.length     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r6 <= 0) goto L_0x00a0
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ all -> 0x009a }
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ all -> 0x009a }
            r6.<init>(r7)     // Catch:{ all -> 0x009a }
            r6.write(r5)     // Catch:{ all -> 0x0098 }
            r6.flush()     // Catch:{ all -> 0x0098 }
            com.bytedance.p582g.p583a.p592d.C10001e.m20111a(r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x00a0
        L_0x0098:
            r5 = move-exception
            goto L_0x009c
        L_0x009a:
            r5 = move-exception
            r6 = r0
        L_0x009c:
            com.bytedance.p582g.p583a.p592d.C10001e.m20111a(r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r5     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00a0:
            int r5 = r4.getResponseCode()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00fd
            r5 = r4
            java.net.URLConnection r5 = (java.net.URLConnection) r5     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            boolean r6 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r6 == 0) goto L_0x00bc
            java.net.URL r6 = r5.getURL()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = r5.getContentType()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r6, r0, r0, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00bc:
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r6 = r4.getContentEncoding()     // Catch:{ Throwable -> 0x00f8, all -> 0x00f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f4 }
            if (r7 != 0) goto L_0x00e7
            java.lang.String r7 = "gzip"
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f4 }
            if (r6 == 0) goto L_0x00e7
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00e2 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e2 }
            byte[] r7 = m20118a(r6)     // Catch:{ all -> 0x00df }
            com.bytedance.p582g.p583a.p592d.C10001e.m20111a(r6)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f4 }
            goto L_0x00eb
        L_0x00df:
            r7 = move-exception
            r0 = r6
            goto L_0x00e3
        L_0x00e2:
            r7 = move-exception
        L_0x00e3:
            com.bytedance.p582g.p583a.p592d.C10001e.m20111a(r0)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f4 }
            throw r7     // Catch:{ Throwable -> 0x00f8, all -> 0x00f4 }
        L_0x00e7:
            byte[] r7 = m20118a(r5)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f4 }
        L_0x00eb:
            com.bytedance.p582g.p583a.p592d.C10001e.m20111a(r5)
            if (r4 == 0) goto L_0x00f3
            r4.disconnect()     // Catch:{ Exception -> 0x00f3 }
        L_0x00f3:
            return r7
        L_0x00f4:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto L_0x0113
        L_0x00f8:
            r6 = move-exception
            r0 = r4
            r4 = r5
            r5 = r6
            goto L_0x010e
        L_0x00fd:
            java.lang.String r6 = r4.getResponseMessage()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.g.a.d.d r7 = new com.bytedance.g.a.d.d     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r7.<init>(r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r7     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0107:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x0113
        L_0x010b:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L_0x010e:
            throw r5     // Catch:{ all -> 0x010f }
        L_0x010f:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L_0x0113:
            com.bytedance.p582g.p583a.p592d.C10001e.m20111a(r0)
            if (r4 == 0) goto L_0x011b
            r4.disconnect()     // Catch:{ Exception -> 0x011b }
        L_0x011b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p592d.C10004h.m20119a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):byte[]");
    }
}
