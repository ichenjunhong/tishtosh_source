package com.google.android.gms.internal.measurement;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.C2240a;
import com.google.android.gms.analytics.C15098l;
import com.google.android.gms.common.internal.C15464q;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.bo */
final class C16571bo extends C16860r {

    /* renamed from: a */
    static final byte[] f46569a = "\n".getBytes();

    /* renamed from: c */
    private final String f46570c = C2240a.m6772a("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", C16861s.f47331a, VERSION.RELEASE, C16585cb.m39588a(Locale.getDefault()), Build.MODEL, Build.ID});

    /* renamed from: d */
    private final C16584ca f46571d;

    C16571bo(C16862t tVar) {
        super(tVar);
        this.f46571d = new C16584ca(tVar.f47336c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
        mo32490a("Network initialized. User agent", this.f46570c);
    }

    /* renamed from: b */
    public final boolean mo31836b() {
        NetworkInfo networkInfo;
        C15098l.m31266b();
        mo32516r();
        try {
            networkInfo = C16572bp.m39554a((ConnectivityManager) mo32506g().getSystemService("connectivity"));
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        mo32493b("No network connectivity");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0149, code lost:
        if (m39541a(r5) == 200) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0187, code lost:
        if (m39542a(r6, r5) == 200) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a0 A[EDGE_INSN: B:71:0x01a0->B:67:0x01a0 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Long> mo31835a(java.util.List<com.google.android.gms.internal.measurement.C16564bh> r9) {
        /*
            r8 = this;
            com.google.android.gms.analytics.C15098l.m31266b()
            r8.mo32516r()
            com.google.android.gms.common.internal.C15464q.m32123a(r9)
            com.google.android.gms.internal.measurement.au r0 = r8.mo32508i()
            java.util.Set r0 = r0.mo31810k()
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0053
            com.google.android.gms.internal.measurement.ca r0 = r8.f46571d
            com.google.android.gms.internal.measurement.bd<java.lang.Integer> r3 = com.google.android.gms.internal.measurement.C16559bc.f46542v
            V r3 = r3.f46547a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            boolean r0 = r0.mo31858a(r3)
            if (r0 != 0) goto L_0x0031
            goto L_0x0053
        L_0x0031:
            com.google.android.gms.internal.measurement.bd<java.lang.String> r0 = com.google.android.gms.internal.measurement.C16559bc.f46536p
            V r0 = r0.f46547a
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.measurement.al r0 = com.google.android.gms.internal.measurement.C16541al.zzz(r0)
            com.google.android.gms.internal.measurement.al r3 = com.google.android.gms.internal.measurement.C16541al.NONE
            if (r0 == r3) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            com.google.android.gms.internal.measurement.bd<java.lang.String> r3 = com.google.android.gms.internal.measurement.C16559bc.f46537q
            V r3 = r3.f46547a
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.measurement.aq r3 = com.google.android.gms.internal.measurement.C16546aq.zzaa(r3)
            com.google.android.gms.internal.measurement.aq r4 = com.google.android.gms.internal.measurement.C16546aq.GZIP
            if (r3 != r4) goto L_0x0054
            r3 = r0
            r0 = 1
            goto L_0x0056
        L_0x0053:
            r0 = 0
        L_0x0054:
            r3 = r0
            r0 = 0
        L_0x0056:
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L_0x00f9
            boolean r1 = r9.isEmpty()
            r1 = r1 ^ r2
            com.google.android.gms.common.internal.C15464q.m32133b(r1)
            java.lang.String r1 = "Uploading batched hits. compression, count"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r3 = r9.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.mo32491a(r1, r2, r3)
            com.google.android.gms.internal.measurement.bq r1 = new com.google.android.gms.internal.measurement.bq
            r1.<init>(r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0081:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x009d
            java.lang.Object r3 = r9.next()
            com.google.android.gms.internal.measurement.bh r3 = (com.google.android.gms.internal.measurement.C16564bh) r3
            boolean r5 = r1.mo31837a(r3)
            if (r5 == 0) goto L_0x009d
            long r5 = r3.f46558c
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r2.add(r3)
            goto L_0x0081
        L_0x009d:
            int r9 = r1.f46572a
            if (r9 != 0) goto L_0x00a2
            return r2
        L_0x00a2:
            java.net.URL r9 = r8.m39549c()
            if (r9 != 0) goto L_0x00ae
            java.lang.String r9 = "Failed to build batching endpoint url"
            r8.mo32505f(r9)
            goto L_0x00f4
        L_0x00ae:
            if (r0 == 0) goto L_0x00b9
            byte[] r0 = r1.mo31838a()
            int r9 = r8.m39547b(r9, r0)
            goto L_0x00c1
        L_0x00b9:
            byte[] r0 = r1.mo31838a()
            int r9 = r8.m39542a(r9, r0)
        L_0x00c1:
            if (r4 != r9) goto L_0x00cf
            java.lang.String r9 = "Batched upload completed. Hits batched"
            int r0 = r1.f46572a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.mo32490a(r9, r0)
            return r2
        L_0x00cf:
            java.lang.String r0 = "Network error uploading hits. status code"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r8.mo32490a(r0, r1)
            com.google.android.gms.internal.measurement.au r0 = r8.mo32508i()
            java.util.Set r0 = r0.mo31810k()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r0.contains(r9)
            if (r9 == 0) goto L_0x00f4
            java.lang.String r9 = "Server instructed the client to stop batching"
            r8.mo32503e(r9)
            com.google.android.gms.internal.measurement.ca r9 = r8.f46571d
            r9.mo31857a()
        L_0x00f4:
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        L_0x00f9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r9.size()
            r0.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
        L_0x0106:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x01a0
            java.lang.Object r3 = r9.next()
            com.google.android.gms.internal.measurement.bh r3 = (com.google.android.gms.internal.measurement.C16564bh) r3
            com.google.android.gms.common.internal.C15464q.m32123a(r3)
            boolean r5 = r3.f46561f
            r5 = r5 ^ r2
            java.lang.String r5 = r8.mo31834a(r3, r5)
            if (r5 != 0) goto L_0x0129
            com.google.android.gms.internal.measurement.bl r5 = r8.mo32507h()
            java.lang.String r6 = "Error formatting hit for upload"
            r5.mo31826a(r3, r6)
        L_0x0127:
            r5 = 1
            goto L_0x018b
        L_0x0129:
            int r6 = r5.length()
            com.google.android.gms.internal.measurement.bd<java.lang.Integer> r7 = com.google.android.gms.internal.measurement.C16559bc.f46535o
            V r7 = r7.f46547a
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 > r7) goto L_0x014c
            java.net.URL r5 = r8.m39544a(r3, r5)
            if (r5 != 0) goto L_0x0145
            java.lang.String r5 = "Failed to build collect GET endpoint url"
            r8.mo32505f(r5)
            goto L_0x018a
        L_0x0145:
            int r5 = r8.m39541a(r5)
            if (r5 != r4) goto L_0x018a
        L_0x014b:
            goto L_0x0127
        L_0x014c:
            java.lang.String r5 = r8.mo31834a(r3, r1)
            if (r5 != 0) goto L_0x015c
            com.google.android.gms.internal.measurement.bl r5 = r8.mo32507h()
            java.lang.String r6 = "Error formatting hit for POST upload"
            r5.mo31826a(r3, r6)
            goto L_0x0127
        L_0x015c:
            byte[] r5 = r5.getBytes()
            int r6 = r5.length
            com.google.android.gms.internal.measurement.bd<java.lang.Integer> r7 = com.google.android.gms.internal.measurement.C16559bc.f46539s
            V r7 = r7.f46547a
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 <= r7) goto L_0x0177
            com.google.android.gms.internal.measurement.bl r5 = r8.mo32507h()
            java.lang.String r6 = "Hit payload exceeds size limit"
            r5.mo31826a(r3, r6)
            goto L_0x0127
        L_0x0177:
            java.net.URL r6 = r8.m39543a(r3)
            if (r6 != 0) goto L_0x0183
            java.lang.String r5 = "Failed to build collect POST endpoint url"
            r8.mo32505f(r5)
            goto L_0x018a
        L_0x0183:
            int r5 = r8.m39542a(r6, r5)
            if (r5 != r4) goto L_0x018a
            goto L_0x014b
        L_0x018a:
            r5 = 0
        L_0x018b:
            if (r5 == 0) goto L_0x01a0
            long r5 = r3.f46558c
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.add(r3)
            int r3 = r0.size()
            int r5 = com.google.android.gms.internal.measurement.C16550au.m39484f()
            if (r3 < r5) goto L_0x0106
        L_0x01a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16571bo.mo31835a(java.util.List):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m39541a(java.net.URL r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.C15464q.m32123a(r5)
            java.lang.String r0 = "GET request"
            r4.mo32494b(r0, r5)
            r0 = 0
            java.net.HttpURLConnection r5 = r4.m39548b(r5)     // Catch:{ IOException -> 0x003a, all -> 0x0035 }
            r5.connect()     // Catch:{ IOException -> 0x0033 }
            r4.m39546a(r5)     // Catch:{ IOException -> 0x0033 }
            int r0 = r5.getResponseCode()     // Catch:{ IOException -> 0x0033 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0022
            com.google.android.gms.internal.measurement.l r1 = r4.mo32510k()     // Catch:{ IOException -> 0x0033 }
            r1.mo32477e()     // Catch:{ IOException -> 0x0033 }
        L_0x0022:
            java.lang.String r1 = "GET status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0033 }
            r4.mo32494b(r1, r2)     // Catch:{ IOException -> 0x0033 }
            if (r5 == 0) goto L_0x0030
            r5.disconnect()
        L_0x0030:
            return r0
        L_0x0031:
            r0 = move-exception
            goto L_0x004a
        L_0x0033:
            r0 = move-exception
            goto L_0x003e
        L_0x0035:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x004a
        L_0x003a:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L_0x003e:
            java.lang.String r1 = "Network GET connection error"
            r4.mo32498c(r1, r0)     // Catch:{ all -> 0x0031 }
            if (r5 == 0) goto L_0x0048
            r5.disconnect()
        L_0x0048:
            r5 = 0
            return r5
        L_0x004a:
            if (r5 == 0) goto L_0x004f
            r5.disconnect()
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16571bo.m39541a(java.net.URL):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f A[SYNTHETIC, Splitter:B:35:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[SYNTHETIC, Splitter:B:45:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m39542a(java.net.URL r4, byte[] r5) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C15464q.m32123a(r4)
            com.google.android.gms.common.internal.C15464q.m32123a(r5)
            java.lang.String r0 = "POST bytes, url"
            int r1 = r5.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo32495b(r0, r1, r4)
            boolean r0 = m40932p()
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "Post payload\n"
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5)
            r3.mo32490a(r0, r1)
        L_0x0020:
            r0 = 0
            android.content.Context r1 = r3.mo32506g()     // Catch:{ IOException -> 0x0076, all -> 0x0073 }
            r1.getPackageName()     // Catch:{ IOException -> 0x0076, all -> 0x0073 }
            java.net.HttpURLConnection r4 = r3.m39548b(r4)     // Catch:{ IOException -> 0x0076, all -> 0x0073 }
            r1 = 1
            r4.setDoOutput(r1)     // Catch:{ IOException -> 0x0071 }
            int r1 = r5.length     // Catch:{ IOException -> 0x0071 }
            r4.setFixedLengthStreamingMode(r1)     // Catch:{ IOException -> 0x0071 }
            r4.connect()     // Catch:{ IOException -> 0x0071 }
            java.io.OutputStream r1 = r4.getOutputStream()     // Catch:{ IOException -> 0x0071 }
            r1.write(r5)     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            r3.m39546a(r4)     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            int r5 = r4.getResponseCode()     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 != r0) goto L_0x0050
            com.google.android.gms.internal.measurement.l r0 = r3.mo32510k()     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            r0.mo32477e()     // Catch:{ IOException -> 0x006e, all -> 0x006b }
        L_0x0050:
            java.lang.String r0 = "POST status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            r3.mo32494b(r0, r2)     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            if (r1 == 0) goto L_0x0065
            r1.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0065
        L_0x005f:
            r0 = move-exception
            java.lang.String r1 = "Error closing http post connection output stream"
            r3.mo32501d(r1, r0)
        L_0x0065:
            if (r4 == 0) goto L_0x006a
            r4.disconnect()
        L_0x006a:
            return r5
        L_0x006b:
            r5 = move-exception
            r0 = r1
            goto L_0x0091
        L_0x006e:
            r5 = move-exception
            r0 = r1
            goto L_0x0078
        L_0x0071:
            r5 = move-exception
            goto L_0x0078
        L_0x0073:
            r5 = move-exception
            r4 = r0
            goto L_0x0091
        L_0x0076:
            r5 = move-exception
            r4 = r0
        L_0x0078:
            java.lang.String r1 = "Network POST connection error"
            r3.mo32498c(r1, r5)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0089
            r0.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0089
        L_0x0083:
            r5 = move-exception
            java.lang.String r0 = "Error closing http post connection output stream"
            r3.mo32501d(r0, r5)
        L_0x0089:
            if (r4 == 0) goto L_0x008e
            r4.disconnect()
        L_0x008e:
            r4 = 0
            return r4
        L_0x0090:
            r5 = move-exception
        L_0x0091:
            if (r0 == 0) goto L_0x009d
            r0.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009d
        L_0x0097:
            r0 = move-exception
            java.lang.String r1 = "Error closing http post connection output stream"
            r3.mo32501d(r1, r0)
        L_0x009d:
            if (r4 == 0) goto L_0x00a2
            r4.disconnect()
        L_0x00a2:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16571bo.m39542a(java.net.URL, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea A[SYNTHETIC, Splitter:B:45:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe A[SYNTHETIC, Splitter:B:55:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m39547b(java.net.URL r10, byte[] r11) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.C15464q.m32123a(r10)
            com.google.android.gms.common.internal.C15464q.m32123a(r11)
            r0 = 0
            android.content.Context r1 = r9.mo32506g()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r1.getPackageName()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r1.<init>()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r2.write(r11)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r2.close()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r1.close()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r2 = "POST compressed size, ratio %, url"
            int r3 = r1.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r4 = 100
            int r6 = r1.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            long r6 = (long) r6     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            long r6 = r6 * r4
            int r4 = r11.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            long r4 = (long) r4     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            long r6 = r6 / r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r9.mo32492a(r2, r3, r4, r10)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            int r2 = r1.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            int r3 = r11.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            if (r2 <= r3) goto L_0x004f
            java.lang.String r2 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            int r3 = r1.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            int r4 = r11.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r9.mo32499c(r2, r3, r4)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
        L_0x004f:
            boolean r2 = m40932p()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            if (r2 == 0) goto L_0x0075
            java.lang.String r2 = "Post payload"
            java.lang.String r3 = "\n"
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r4.<init>(r11)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r11 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            int r4 = r11.length()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            if (r4 == 0) goto L_0x006d
            java.lang.String r11 = r3.concat(r11)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            goto L_0x0072
        L_0x006d:
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r11.<init>(r3)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
        L_0x0072:
            r9.mo32490a(r2, r11)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
        L_0x0075:
            java.net.HttpURLConnection r10 = r9.m39548b(r10)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r11 = 1
            r10.setDoOutput(r11)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            java.lang.String r11 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r3 = r10
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            boolean r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r3)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            if (r4 == 0) goto L_0x0093
            java.net.URL r3 = r3.getURL()     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            java.lang.String r4 = ""
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r3, r11, r2, r4)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
        L_0x0093:
            r10.addRequestProperty(r11, r2)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            int r11 = r1.length     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            r10.setFixedLengthStreamingMode(r11)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            r10.connect()     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            java.io.OutputStream r11 = r10.getOutputStream()     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            r11.write(r1)     // Catch:{ IOException -> 0x00ce, all -> 0x00c8 }
            r11.close()     // Catch:{ IOException -> 0x00ce, all -> 0x00c8 }
            r9.m39546a(r10)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            int r11 = r10.getResponseCode()     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r11 != r1) goto L_0x00b9
            com.google.android.gms.internal.measurement.l r1 = r9.mo32510k()     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            r1.mo32477e()     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
        L_0x00b9:
            java.lang.String r1 = "POST status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            r9.mo32494b(r1, r2)     // Catch:{ IOException -> 0x00d9, all -> 0x00d4 }
            if (r10 == 0) goto L_0x00c7
            r10.disconnect()
        L_0x00c7:
            return r11
        L_0x00c8:
            r0 = move-exception
            r8 = r11
            r11 = r10
            r10 = r0
            r0 = r8
            goto L_0x00fc
        L_0x00ce:
            r0 = move-exception
            r8 = r11
            r11 = r10
            r10 = r0
            r0 = r8
            goto L_0x00e3
        L_0x00d4:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x00fc
        L_0x00d9:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x00e3
        L_0x00de:
            r10 = move-exception
            r11 = r0
            goto L_0x00fc
        L_0x00e1:
            r10 = move-exception
            r11 = r0
        L_0x00e3:
            java.lang.String r1 = "Network compressed POST connection error"
            r9.mo32498c(r1, r10)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00f4
            r0.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00f4
        L_0x00ee:
            r10 = move-exception
            java.lang.String r0 = "Error closing http compressed post connection output stream"
            r9.mo32501d(r0, r10)
        L_0x00f4:
            if (r11 == 0) goto L_0x00f9
            r11.disconnect()
        L_0x00f9:
            r10 = 0
            return r10
        L_0x00fb:
            r10 = move-exception
        L_0x00fc:
            if (r0 == 0) goto L_0x0108
            r0.close()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0108
        L_0x0102:
            r0 = move-exception
            java.lang.String r1 = "Error closing http compressed post connection output stream"
            r9.mo32501d(r1, r0)
        L_0x0108:
            if (r11 == 0) goto L_0x010d
            r11.disconnect()
        L_0x010d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16571bo.m39547b(java.net.URL, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0022 A[SYNTHETIC, Splitter:B:19:0x0022] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m39546a(java.net.HttpURLConnection r3) throws java.io.IOException {
        /*
            r2 = this;
            java.io.InputStream r3 = com.google.android.gms.internal.measurement.C16572bp.m39555a(r3)     // Catch:{ all -> 0x001e }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x001c }
        L_0x0008:
            int r1 = r3.read(r0)     // Catch:{ all -> 0x001c }
            if (r1 > 0) goto L_0x0008
            if (r3 == 0) goto L_0x001b
            r3.close()     // Catch:{ IOException -> 0x0014 }
            return
        L_0x0014:
            r3 = move-exception
            java.lang.String r0 = "Error closing http connection input stream"
            r2.mo32501d(r0, r3)
            return
        L_0x001b:
            return
        L_0x001c:
            r0 = move-exception
            goto L_0x0020
        L_0x001e:
            r0 = move-exception
            r3 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x002c
            r3.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002c
        L_0x0026:
            r3 = move-exception
            java.lang.String r1 = "Error closing http connection input stream"
            r2.mo32501d(r1, r3)
        L_0x002c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16571bo.m39546a(java.net.HttpURLConnection):void");
    }

    /* renamed from: b */
    private final HttpURLConnection m39548b(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(((Integer) C16559bc.f46543w.f46547a).intValue());
            httpURLConnection.setReadTimeout(((Integer) C16559bc.f46544x.f46547a).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            C16572bp.m39556a(httpURLConnection, "User-Agent", this.f46570c);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* renamed from: a */
    private final URL m39543a(C16564bh bhVar) {
        String str;
        String str2;
        if (bhVar.f46561f) {
            String valueOf = String.valueOf(C16550au.m39486h());
            String valueOf2 = String.valueOf(C16550au.m39488j());
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
                return new URL(str);
            }
            str2 = new String(valueOf);
        } else {
            String valueOf3 = String.valueOf(C16550au.m39487i());
            String valueOf4 = String.valueOf(C16550au.m39488j());
            if (valueOf4.length() != 0) {
                str = valueOf3.concat(valueOf4);
                return new URL(str);
            }
            str2 = new String(valueOf3);
        }
        str = str2;
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            mo32501d("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: a */
    private final URL m39544a(C16564bh bhVar, String str) {
        String str2;
        if (bhVar.f46561f) {
            String h = C16550au.m39486h();
            String j = C16550au.m39488j();
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 1 + String.valueOf(j).length() + String.valueOf(str).length());
            sb.append(h);
            sb.append(j);
            sb.append("?");
            sb.append(str);
            str2 = sb.toString();
        } else {
            String i = C16550au.m39487i();
            String j2 = C16550au.m39488j();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(j2).length() + String.valueOf(str).length());
            sb2.append(i);
            sb2.append(j2);
            sb2.append("?");
            sb2.append(str);
            str2 = sb2.toString();
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            mo32501d("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: c */
    private final URL m39549c() {
        String valueOf = String.valueOf(C16550au.m39486h());
        String valueOf2 = String.valueOf((String) C16559bc.f46534n.f46547a);
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            mo32501d("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo31834a(C16564bh bhVar, boolean z) {
        String str;
        C15464q.m32123a(bhVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Entry entry : bhVar.f46556a.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                    m39545a(sb, str2, (String) entry.getValue());
                }
            }
            m39545a(sb, "ht", String.valueOf(bhVar.f46559d));
            m39545a(sb, "qt", String.valueOf(mo32504f().mo28523a() - bhVar.f46559d));
            if (z) {
                long a = C16585cb.m39586a(bhVar.mo31823a("_s", "0"));
                if (a != 0) {
                    str = String.valueOf(a);
                } else {
                    str = String.valueOf(bhVar.f46558c);
                }
                m39545a(sb, "z", str);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            mo32501d("Failed to encode name or value", e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m39545a(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }
}
