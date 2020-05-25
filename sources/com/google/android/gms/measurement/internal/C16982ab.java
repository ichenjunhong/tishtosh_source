package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.ab */
final class C16982ab implements Runnable {

    /* renamed from: a */
    private final URL f47860a;

    /* renamed from: b */
    private final byte[] f47861b;

    /* renamed from: c */
    private final C17140y f47862c;

    /* renamed from: d */
    private final String f47863d;

    /* renamed from: e */
    private final Map<String, String> f47864e;

    /* renamed from: f */
    private final /* synthetic */ C17137v f47865f;

    public C16982ab(C17137v vVar, String str, URL url, byte[] bArr, Map<String, String> map, C17140y yVar) {
        this.f47865f = vVar;
        C15464q.m32125a(str);
        C15464q.m32123a(url);
        C15464q.m32123a(yVar);
        this.f47860a = url;
        this.f47861b = bArr;
        this.f47862c = yVar;
        this.f47863d = str;
        this.f47864e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ff A[SYNTHETIC, Splitter:B:57:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013a A[SYNTHETIC, Splitter:B:68:0x013a] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.v r0 = r12.f47865f
            r0.mo32838b()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.v r2 = r12.f47865f     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            java.net.URL r3 = r12.f47860a     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            if (r4 == 0) goto L_0x00f0
            javax.net.ssl.SSLSocketFactory r4 = r2.f48467a     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            if (r4 == 0) goto L_0x0023
            boolean r4 = r3 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            if (r4 == 0) goto L_0x0023
            r4 = r3
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            javax.net.ssl.SSLSocketFactory r2 = r2.f48467a     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            r4.setSSLSocketFactory(r2)     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
        L_0x0023:
            r2 = r3
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            r2.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            r3 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            r3 = 61000(0xee48, float:8.5479E-41)
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            r2.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            r3 = 1
            r2.setDoInput(r3)     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f47864e     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            if (r4 == 0) goto L_0x0066
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f47864e     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
        L_0x004a:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            com.google.android.gms.measurement.internal.C16983ac.m41160a(r2, r6, r5)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            goto L_0x004a
        L_0x0066:
            byte[] r4 = r12.f47861b     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            if (r4 == 0) goto L_0x00ae
            com.google.android.gms.measurement.internal.v r4 = r12.f47865f     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            com.google.android.gms.measurement.internal.ej r4 = r4.mo32906f()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            byte[] r5 = r12.f47861b     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            byte[] r4 = r4.mo33132b(r5)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            com.google.android.gms.measurement.internal.v r5 = r12.f47865f     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo32854q()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            com.google.android.gms.measurement.internal.t r5 = r5.f48453j     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r5.mo33377a(r6, r7)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r2.setDoOutput(r3)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            com.google.android.gms.measurement.internal.C16983ac.m41160a(r2, r3, r5)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            int r3 = r4.length     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r2.setFixedLengthStreamingMode(r3)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r2.connect()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r3.write(r4)     // Catch:{ IOException -> 0x00a9, all -> 0x00a4 }
            r3.close()     // Catch:{ IOException -> 0x00a9, all -> 0x00a4 }
            goto L_0x00ae
        L_0x00a4:
            r4 = move-exception
            r10 = r1
            r1 = r3
            r3 = r4
            goto L_0x00e9
        L_0x00a9:
            r4 = move-exception
            r9 = r1
            r1 = r3
            r7 = r4
            goto L_0x00ee
        L_0x00ae:
            int r7 = r2.getResponseCode()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Map r10 = r2.getHeaderFields()     // Catch:{ IOException -> 0x00e2, all -> 0x00de }
            com.google.android.gms.measurement.internal.v r0 = r12.f47865f     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            byte[] r9 = com.google.android.gms.measurement.internal.C17137v.m42024a(r2)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            if (r2 == 0) goto L_0x00c1
            r2.disconnect()
        L_0x00c1:
            com.google.android.gms.measurement.internal.v r0 = r12.f47865f
            com.google.android.gms.measurement.internal.at r0 = r0.mo32853p()
            com.google.android.gms.measurement.internal.z r1 = new com.google.android.gms.measurement.internal.z
            java.lang.String r5 = r12.f47863d
            com.google.android.gms.measurement.internal.y r6 = r12.f47862c
            r8 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo32912a(r1)
            return
        L_0x00d7:
            r0 = move-exception
            r3 = r0
            goto L_0x00fd
        L_0x00da:
            r0 = move-exception
            r6 = r7
            r9 = r10
            goto L_0x00e5
        L_0x00de:
            r0 = move-exception
            r3 = r0
            r10 = r1
            goto L_0x00fd
        L_0x00e2:
            r0 = move-exception
            r9 = r1
            r6 = r7
        L_0x00e5:
            r7 = r0
            goto L_0x0138
        L_0x00e7:
            r3 = move-exception
            r10 = r1
        L_0x00e9:
            r7 = 0
            goto L_0x00fd
        L_0x00eb:
            r3 = move-exception
            r9 = r1
            r7 = r3
        L_0x00ee:
            r6 = 0
            goto L_0x0138
        L_0x00f0:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
            throw r2     // Catch:{ IOException -> 0x0133, all -> 0x00f8 }
        L_0x00f8:
            r2 = move-exception
            r10 = r1
            r3 = r2
            r7 = 0
            r2 = r10
        L_0x00fd:
            if (r1 == 0) goto L_0x0117
            r1.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0117
        L_0x0103:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f47865f
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b
            java.lang.String r4 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r5 = r12.f47863d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C17133r.m41997a(r5)
            r1.mo33378a(r4, r5, r0)
        L_0x0117:
            if (r2 == 0) goto L_0x011c
            r2.disconnect()
        L_0x011c:
            com.google.android.gms.measurement.internal.v r0 = r12.f47865f
            com.google.android.gms.measurement.internal.at r0 = r0.mo32853p()
            com.google.android.gms.measurement.internal.z r1 = new com.google.android.gms.measurement.internal.z
            java.lang.String r5 = r12.f47863d
            com.google.android.gms.measurement.internal.y r6 = r12.f47862c
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo32912a(r1)
            throw r3
        L_0x0133:
            r2 = move-exception
            r9 = r1
            r7 = r2
            r6 = 0
            r2 = r9
        L_0x0138:
            if (r1 == 0) goto L_0x0152
            r1.close()     // Catch:{ IOException -> 0x013e }
            goto L_0x0152
        L_0x013e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f47865f
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b
            java.lang.String r3 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r4 = r12.f47863d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r4)
            r1.mo33378a(r3, r4, r0)
        L_0x0152:
            if (r2 == 0) goto L_0x0157
            r2.disconnect()
        L_0x0157:
            com.google.android.gms.measurement.internal.v r0 = r12.f47865f
            com.google.android.gms.measurement.internal.at r0 = r0.mo32853p()
            com.google.android.gms.measurement.internal.z r1 = new com.google.android.gms.measurement.internal.z
            java.lang.String r4 = r12.f47863d
            com.google.android.gms.measurement.internal.y r5 = r12.f47862c
            r8 = 0
            r10 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.mo32912a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16982ab.run():void");
    }
}
