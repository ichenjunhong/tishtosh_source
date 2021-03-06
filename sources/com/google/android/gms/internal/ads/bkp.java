package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public final class bkp implements ble {

    /* renamed from: a */
    private static final Pattern f42796a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f42797b = new AtomicReference<>();

    /* renamed from: c */
    private final boolean f42798c;

    /* renamed from: d */
    private final int f42799d;

    /* renamed from: e */
    private final int f42800e;

    /* renamed from: f */
    private final String f42801f;

    /* renamed from: g */
    private final blm<String> f42802g;

    /* renamed from: h */
    private final HashMap<String, String> f42803h;

    /* renamed from: i */
    private final bld f42804i;

    /* renamed from: j */
    private bkn f42805j;

    /* renamed from: k */
    private HttpURLConnection f42806k;

    /* renamed from: l */
    private InputStream f42807l;

    /* renamed from: m */
    private boolean f42808m;

    /* renamed from: n */
    private long f42809n;

    /* renamed from: o */
    private long f42810o;

    /* renamed from: p */
    private long f42811p;

    /* renamed from: q */
    private long f42812q;

    public bkp(String str, blm<String> blm, bld bld, int i, int i2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f42801f = str;
            this.f42802g = null;
            this.f42804i = null;
            this.f42803h = new HashMap<>();
            this.f42799d = i;
            this.f42800e = i2;
            this.f42798c = z;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo29003a(com.google.android.gms.internal.ads.bkn r19) throws com.google.android.gms.internal.ads.bkv {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r8.f42805j = r9
            r10 = 0
            r8.f42812q = r10
            r8.f42811p = r10
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x017e }
            android.net.Uri r0 = r9.f42786a     // Catch:{ IOException -> 0x017e }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x017e }
            r2.<init>(r0)     // Catch:{ IOException -> 0x017e }
            long r12 = r9.f42788c     // Catch:{ IOException -> 0x017e }
            long r14 = r9.f42789d     // Catch:{ IOException -> 0x017e }
            int r0 = r9.f42791f     // Catch:{ IOException -> 0x017e }
            r7 = 1
            r0 = r0 & r7
            r5 = 0
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            boolean r1 = r8.f42798c     // Catch:{ IOException -> 0x017e }
            if (r1 != 0) goto L_0x0038
            r1 = r18
            r3 = r12
            r5 = r14
            r12 = 1
            r7 = r0
            java.net.HttpURLConnection r0 = r1.m35965a(r2, r3, r5, r7)     // Catch:{ IOException -> 0x017e }
            r0.connect()     // Catch:{ IOException -> 0x017e }
            r11 = 1
            goto L_0x0075
        L_0x0038:
            r6 = r2
            r1 = 0
        L_0x003a:
            int r3 = r1 + 1
            r2 = 20
            if (r1 > r2) goto L_0x0161
            r1 = r18
            r2 = r6
            r16 = r3
            r3 = r12
            r17 = r6
            r10 = 0
            r5 = r14
            r11 = 1
            r7 = r0
            java.net.HttpURLConnection r1 = r1.m35965a(r2, r3, r5, r7)     // Catch:{ IOException -> 0x017e }
            r1.setInstanceFollowRedirects(r10)     // Catch:{ IOException -> 0x017e }
            r1.connect()     // Catch:{ IOException -> 0x017e }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x017e }
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 301(0x12d, float:4.22E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 307(0x133, float:4.3E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 308(0x134, float:4.32E-43)
            if (r2 != r3) goto L_0x0074
            goto L_0x010e
        L_0x0074:
            r0 = r1
        L_0x0075:
            r8.f42806k = r0     // Catch:{ IOException -> 0x017e }
            java.net.HttpURLConnection r0 = r8.f42806k     // Catch:{ IOException -> 0x00e7 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x00e7 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x00d8
            r2 = 299(0x12b, float:4.19E-43)
            if (r0 > r2) goto L_0x00d8
            java.net.HttpURLConnection r2 = r8.f42806k
            r2.getContentType()
            if (r0 != r1) goto L_0x0097
            long r0 = r9.f42788c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0099
            long r0 = r9.f42788c
            goto L_0x009a
        L_0x0097:
            r2 = 0
        L_0x0099:
            r0 = r2
        L_0x009a:
            r8.f42809n = r0
            int r0 = r9.f42791f
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00bd
            java.net.HttpURLConnection r0 = r8.f42806k
            long r0 = m35964a(r0)
            long r2 = r9.f42789d
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00b2
            long r4 = r9.f42789d
            goto L_0x00ba
        L_0x00b2:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00ba
            long r2 = r8.f42809n
            long r4 = r0 - r2
        L_0x00ba:
            r8.f42810o = r4
            goto L_0x00c1
        L_0x00bd:
            long r0 = r9.f42789d
            r8.f42810o = r0
        L_0x00c1:
            java.net.HttpURLConnection r0 = r8.f42806k     // Catch:{ IOException -> 0x00ce }
            java.io.InputStream r0 = com.google.android.gms.internal.ads.bkq.m35970a(r0)     // Catch:{ IOException -> 0x00ce }
            r8.f42807l = r0     // Catch:{ IOException -> 0x00ce }
            r8.f42808m = r11
            long r0 = r8.f42810o
            return r0
        L_0x00ce:
            r0 = move-exception
            r18.m35966b()
            com.google.android.gms.internal.ads.bkv r1 = new com.google.android.gms.internal.ads.bkv
            r1.<init>(r0, r9)
            throw r1
        L_0x00d8:
            java.net.HttpURLConnection r1 = r8.f42806k
            java.util.Map r1 = r1.getHeaderFields()
            r18.m35966b()
            com.google.android.gms.internal.ads.bkw r2 = new com.google.android.gms.internal.ads.bkw
            r2.<init>(r0, r1, r9)
            throw r2
        L_0x00e7:
            r0 = move-exception
            r18.m35966b()
            com.google.android.gms.internal.ads.bkv r1 = new com.google.android.gms.internal.ads.bkv
            java.lang.String r2 = "Unable to connect to "
            android.net.Uri r3 = r9.f42786a
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0104
            java.lang.String r2 = r2.concat(r3)
            goto L_0x010a
        L_0x0104:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x010a:
            r1.<init>(r2, r0, r9)
            throw r1
        L_0x010e:
            r2 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r1.getHeaderField(r4)     // Catch:{ IOException -> 0x017e }
            r1.disconnect()     // Catch:{ IOException -> 0x017e }
            if (r4 == 0) goto L_0x0159
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x017e }
            r1 = r17
            r6.<init>(r1, r4)     // Catch:{ IOException -> 0x017e }
            java.lang.String r1 = r6.getProtocol()     // Catch:{ IOException -> 0x017e }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r1)     // Catch:{ IOException -> 0x017e }
            if (r4 != 0) goto L_0x0152
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)     // Catch:{ IOException -> 0x017e }
            if (r4 != 0) goto L_0x0152
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x017e }
            java.lang.String r2 = "Unsupported protocol redirect: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x017e }
            int r3 = r1.length()     // Catch:{ IOException -> 0x017e }
            if (r3 == 0) goto L_0x0149
            java.lang.String r1 = r2.concat(r1)     // Catch:{ IOException -> 0x017e }
            goto L_0x014e
        L_0x0149:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x017e }
            r1.<init>(r2)     // Catch:{ IOException -> 0x017e }
        L_0x014e:
            r0.<init>(r1)     // Catch:{ IOException -> 0x017e }
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x0152:
            r10 = r2
            r1 = r16
            r5 = 0
            r7 = 1
            goto L_0x003a
        L_0x0159:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x017e }
            java.lang.String r1 = "Null location redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x017e }
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x0161:
            r16 = r3
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x017e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017e }
            r2 = 31
            r1.<init>(r2)     // Catch:{ IOException -> 0x017e }
            java.lang.String r2 = "Too many redirects: "
            r1.append(r2)     // Catch:{ IOException -> 0x017e }
            r2 = r16
            r1.append(r2)     // Catch:{ IOException -> 0x017e }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x017e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x017e }
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x017e:
            r0 = move-exception
            com.google.android.gms.internal.ads.bkv r1 = new com.google.android.gms.internal.ads.bkv
            java.lang.String r2 = "Unable to connect to "
            android.net.Uri r3 = r9.f42786a
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0198
            java.lang.String r2 = r2.concat(r3)
            goto L_0x019e
        L_0x0198:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x019e:
            r1.<init>(r2, r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bkp.mo29003a(com.google.android.gms.internal.ads.bkn):long");
    }

    /* renamed from: a */
    public final int mo29002a(byte[] bArr, int i, int i2) throws bkv {
        try {
            if (this.f42811p != this.f42809n) {
                byte[] bArr2 = (byte[]) f42797b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (this.f42811p != this.f42809n) {
                    int read = this.f42807l.read(bArr2, 0, (int) Math.min(this.f42809n - this.f42811p, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f42811p += (long) read;
                    } else {
                        throw new EOFException();
                    }
                }
                f42797b.set(bArr2);
            }
            if (this.f42810o != -1) {
                i2 = (int) Math.min((long) i2, this.f42810o - this.f42812q);
            }
            if (i2 == 0) {
                return -1;
            }
            int read2 = this.f42807l.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.f42810o != -1) {
                    if (this.f42810o != this.f42812q) {
                        throw new EOFException();
                    }
                }
                return -1;
            }
            this.f42812q += (long) read2;
            return read2;
        } catch (IOException e) {
            throw new bkv(e, this.f42805j);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27|28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r2 > 2048) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29004a() throws com.google.android.gms.internal.ads.bkv {
        /*
            r9 = this;
            r0 = 0
            java.io.InputStream r1 = r9.f42807l     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x007d
            java.net.HttpURLConnection r1 = r9.f42806k     // Catch:{ all -> 0x0088 }
            long r2 = r9.f42810o     // Catch:{ all -> 0x0088 }
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0012
            long r2 = r9.f42810o     // Catch:{ all -> 0x0088 }
            goto L_0x0018
        L_0x0012:
            long r2 = r9.f42810o     // Catch:{ all -> 0x0088 }
            long r6 = r9.f42812q     // Catch:{ all -> 0x0088 }
            r8 = 0
            long r2 = r2 - r6
        L_0x0018:
            int r6 = com.google.android.gms.internal.ads.blp.f42854a     // Catch:{ all -> 0x0088 }
            r7 = 19
            if (r6 == r7) goto L_0x0024
            int r6 = com.google.android.gms.internal.ads.blp.f42854a     // Catch:{ all -> 0x0088 }
            r7 = 20
            if (r6 != r7) goto L_0x006b
        L_0x0024:
            java.io.InputStream r1 = com.google.android.gms.internal.ads.bkq.m35970a(r1)     // Catch:{ IOException | Exception -> 0x006b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0034
            int r2 = r1.read()     // Catch:{ IOException | Exception -> 0x006b }
            r3 = -1
            if (r2 != r3) goto L_0x003a
            goto L_0x006b
        L_0x0034:
            r4 = 2048(0x800, double:1.0118E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006b
        L_0x003a:
            java.lang.Class r2 = r1.getClass()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.String r2 = r2.getName()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException | Exception -> 0x006b }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException | Exception -> 0x006b }
            if (r2 == 0) goto L_0x006b
        L_0x0052:
            java.lang.Class r2 = r1.getClass()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.Class r2 = r2.getSuperclass()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.String r3 = "unexpectedEndOfInput"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ IOException | Exception -> 0x006b }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IOException | Exception -> 0x006b }
            r2.invoke(r1, r3)     // Catch:{ IOException | Exception -> 0x006b }
        L_0x006b:
            java.io.InputStream r1 = r9.f42807l     // Catch:{ IOException -> 0x0074 }
            r1.close()     // Catch:{ IOException -> 0x0074 }
            r1 = 0
            r9.f42807l = r1     // Catch:{ all -> 0x0088 }
            goto L_0x007d
        L_0x0074:
            r1 = move-exception
            com.google.android.gms.internal.ads.bkv r2 = new com.google.android.gms.internal.ads.bkv     // Catch:{ all -> 0x0088 }
            com.google.android.gms.internal.ads.bkn r3 = r9.f42805j     // Catch:{ all -> 0x0088 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0088 }
            throw r2     // Catch:{ all -> 0x0088 }
        L_0x007d:
            boolean r1 = r9.f42808m
            if (r1 == 0) goto L_0x0087
            r9.f42808m = r0
            r9.m35966b()
            return
        L_0x0087:
            return
        L_0x0088:
            r1 = move-exception
            boolean r2 = r9.f42808m
            if (r2 == 0) goto L_0x0092
            r9.f42808m = r0
            r9.m35966b()
        L_0x0092:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bkp.mo29004a():void");
    }

    /* renamed from: a */
    private final HttpURLConnection m35965a(URL url, long j, long j2, boolean z) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f42799d);
        httpURLConnection.setReadTimeout(this.f42800e);
        httpURLConnection.setDoOutput(false);
        synchronized (this.f42803h) {
            for (Entry entry : this.f42803h.entrySet()) {
                bkq.m35971a(httpURLConnection, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                long j3 = (j + j2) - 1;
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append(j3);
                sb2 = sb3.toString();
            }
            bkq.m35971a(httpURLConnection, "Range", sb2);
        }
        bkq.m35971a(httpURLConnection, "User-Agent", this.f42801f);
        if (!z) {
            bkq.m35971a(httpURLConnection, "Accept-Encoding", "identity");
        }
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m35964a(java.net.HttpURLConnection r6) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r6.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0011
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            r0 = -1
        L_0x0013:
            java.lang.String r2 = "Content-Range"
            java.lang.String r6 = r6.getHeaderField(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x0053
            java.util.regex.Pattern r2 = f42796a
            java.util.regex.Matcher r6 = r2.matcher(r6)
            boolean r2 = r6.find()
            if (r2 == 0) goto L_0x0053
            r2 = 2
            java.lang.String r2 = r6.group(r2)     // Catch:{ NumberFormatException -> 0x0053 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0053 }
            r4 = 1
            java.lang.String r6 = r6.group(r4)     // Catch:{ NumberFormatException -> 0x0053 }
            long r4 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0053 }
            r6 = 0
            long r2 = r2 - r4
            r4 = 1
            long r2 = r2 + r4
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x004a
        L_0x0048:
            r0 = r2
            goto L_0x0053
        L_0x004a:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0053
            long r2 = java.lang.Math.max(r0, r2)     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x0048
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bkp.m35964a(java.net.HttpURLConnection):long");
    }

    /* renamed from: b */
    private final void m35966b() {
        if (this.f42806k != null) {
            this.f42806k.disconnect();
            this.f42806k = null;
        }
    }
}
