package com.bytedance.ies.p621b.p624c;

import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.p1144c.C18889b;
import com.p683ss.android.common.p1144c.C18891d;
import com.p683ss.android.common.p1144c.p1145a.C18884a;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18885a;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18886b;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18887c;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18888d;
import com.p683ss.android.common.util.C18916c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53522d.C53523a;
import okhttp3.C53524e;
import okhttp3.C53668q.C53669a;
import okhttp3.C53678w;
import okhttp3.C53679x;
import okhttp3.C53679x.C53680a;

/* renamed from: com.bytedance.ies.b.c.c */
public final class C10206c implements C18889b {

    /* renamed from: a */
    private final String f27536a = " okhttp/3.5.0";

    /* renamed from: b */
    private C10204a f27537b;

    /* renamed from: com.bytedance.ies.b.c.c$a */
    public static class C10209a implements C18891d {

        /* renamed from: a */
        C53524e f27544a;

        /* renamed from: a */
        public final void mo18243a() {
            if (this.f27544a != null) {
                this.f27544a.mo111248c();
            }
        }

        public C10209a(C53524e eVar) {
            this.f27544a = eVar;
        }
    }

    /* renamed from: a */
    private static String m20670a(String str) {
        return "1.1.1.1";
    }

    /* renamed from: a */
    public final byte[] mo18240a(int i, String str) throws Exception {
        C53506ae aeVar;
        C53506ae aeVar2 = null;
        try {
            C53504ad b = this.f27537b.mo18229b().mo111325a(new C53499a().mo111262a(str).mo111272c()).mo111247b();
            if (b.f132400c == 200) {
                aeVar = b.f132404g;
                if (aeVar != null) {
                    try {
                        InputStream byteStream = aeVar.byteStream();
                        String b2 = b.mo111276b("Content-Length");
                        long j = -1;
                        if (b2 != null) {
                            j = Long.parseLong(b2);
                        }
                        byte[] stream2ByteArray = NetworkUtils.stream2ByteArray(i, byteStream, j);
                        NetworkUtils.safeClose(aeVar);
                        return stream2ByteArray;
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                        aeVar2 = aeVar;
                        NetworkUtils.safeClose(aeVar2);
                        throw th;
                    }
                }
                NetworkUtils.safeClose(aeVar);
                return null;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            NetworkUtils.safeClose(aeVar2);
            throw th;
        }
        aeVar = null;
        NetworkUtils.safeClose(aeVar);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fd A[SYNTHETIC, Splitter:B:64:0x00fd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18238a(int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.p683ss.android.common.util.C18915b<java.lang.String> r22, java.lang.String r23, com.p683ss.android.common.util.C18919f r24, java.util.List<com.p683ss.android.http.p1169a.p1172b.C19180e> r25, java.lang.String[] r26, int[] r27) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r24
            r13 = r26
            r2 = r27
            com.bytedance.ies.b.c.a r3 = r1.f27537b
            okhttp3.y r3 = r3.mo18229b()
            r4 = 0
            okhttp3.ab$a r5 = new okhttp3.ab$a     // Catch:{ all -> 0x00f6 }
            r5.<init>()     // Catch:{ all -> 0x00f6 }
            r6 = r18
            okhttp3.ab$a r5 = r5.mo111262a(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = com.p683ss.android.common.util.NetworkUtils.getUserAgent()     // Catch:{ all -> 0x00f6 }
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ all -> 0x00f6 }
            if (r7 != 0) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r7.<init>()     // Catch:{ all -> 0x00f6 }
            r7.append(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = " okhttp/3.5.0"
            r7.append(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "User-Agent"
            r5.mo111263a(r7, r6)     // Catch:{ all -> 0x00f6 }
        L_0x003a:
            if (r25 == 0) goto L_0x0058
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x00f6 }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00f6 }
            com.ss.android.http.a.b.e r7 = (com.p683ss.android.http.p1169a.p1172b.C19180e) r7     // Catch:{ all -> 0x00f6 }
            java.lang.String r8 = r7.mo39131a()     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = r7.mo39132b()     // Catch:{ all -> 0x00f6 }
            r5.mo111271b(r8, r7)     // Catch:{ all -> 0x00f6 }
            goto L_0x0040
        L_0x0058:
            okhttp3.ab r5 = r5.mo111272c()     // Catch:{ all -> 0x00f6 }
            okhttp3.e r3 = r3.mo111325a(r5)     // Catch:{ all -> 0x00f6 }
            okhttp3.ad r6 = r3.mo111247b()     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "x-snssdk.remoteaddr"
            java.lang.String r14 = r6.mo111276b(r7)     // Catch:{ all -> 0x00f6 }
            r7 = 0
            if (r0 == 0) goto L_0x007a
            boolean r8 = r0.f52125a     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x007a
            m20672a(r13, r14)
            return r7
        L_0x0075:
            r0 = move-exception
            r15 = r4
        L_0x0077:
            r4 = r14
            goto L_0x00f8
        L_0x007a:
            int r8 = r6.f132400c     // Catch:{ all -> 0x0075 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x00ea
            okhttp3.ae r15 = r6.f132404g     // Catch:{ all -> 0x0075 }
            if (r15 == 0) goto L_0x00e1
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r6.mo111276b(r4)     // Catch:{ all -> 0x00df }
            r8 = -1
            if (r4 == 0) goto L_0x0092
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x00df }
        L_0x0092:
            if (r2 == 0) goto L_0x00a3
            int r4 = r2.length     // Catch:{ all -> 0x00df }
            if (r4 <= 0) goto L_0x00a3
            r2[r7] = r7     // Catch:{ all -> 0x00df }
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x00a3
            int r4 = (int) r8     // Catch:{ all -> 0x00df }
            r2[r7] = r4     // Catch:{ all -> 0x00df }
        L_0x00a3:
            java.io.InputStream r2 = r15.byteStream()     // Catch:{ all -> 0x00df }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r6.mo111276b(r4)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00bd
            java.lang.String r6 = "gzip"
            boolean r4 = r6.equalsIgnoreCase(r4)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00bd
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00df }
            r4.<init>(r2)     // Catch:{ all -> 0x00df }
            r2 = r4
        L_0x00bd:
            com.bytedance.ies.b.c.c$1 r6 = new com.bytedance.ies.b.c.c$1     // Catch:{ all -> 0x00df }
            r6.<init>(r5, r3)     // Catch:{ all -> 0x00df }
            r3 = r8
            r5 = r6
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            boolean r0 = com.p683ss.android.common.util.NetworkUtils.stream2File(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00df }
            m20672a(r13, r14)
            if (r15 == 0) goto L_0x00de
            com.p683ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00de }
        L_0x00de:
            return r0
        L_0x00df:
            r0 = move-exception
            goto L_0x0077
        L_0x00e1:
            m20672a(r13, r14)
            if (r15 == 0) goto L_0x00e9
            com.p683ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00e9 }
        L_0x00e9:
            return r7
        L_0x00ea:
            java.lang.String r0 = "Reason-Phrase"
            java.lang.String r0 = r6.mo111276b(r0)     // Catch:{ all -> 0x0075 }
            com.ss.android.http.a.a.b r2 = new com.ss.android.http.a.a.b     // Catch:{ all -> 0x0075 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0075 }
            throw r2     // Catch:{ all -> 0x0075 }
        L_0x00f6:
            r0 = move-exception
            r15 = r4
        L_0x00f8:
            m20672a(r13, r4)
            if (r15 == 0) goto L_0x0100
            com.p683ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x0100 }
        L_0x0100:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p621b.p624c.C10206c.mo18238a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.f, java.util.List, java.lang.String[], int[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0104 A[SYNTHETIC, Splitter:B:63:0x0104] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18239a(int r17, java.lang.String r18, java.lang.StringBuffer r19, java.lang.StringBuffer r20, java.lang.StringBuffer r21, com.p683ss.android.common.util.C18915b<java.lang.String> r22, java.lang.String r23, com.p683ss.android.common.util.C18919f r24, java.util.List<com.p683ss.android.http.p1169a.p1172b.C19180e> r25, java.lang.String[] r26, int[] r27, org.apache.http.client.RedirectHandler r28) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r24
            r13 = r26
            r2 = r27
            com.bytedance.ies.b.c.a r3 = r1.f27537b
            okhttp3.y r3 = r3.mo18229b()
            r4 = 0
            okhttp3.ab$a r5 = new okhttp3.ab$a     // Catch:{ all -> 0x00fd }
            r5.<init>()     // Catch:{ all -> 0x00fd }
            r6 = r18
            okhttp3.ab$a r5 = r5.mo111262a(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = com.p683ss.android.common.util.NetworkUtils.getUserAgent()     // Catch:{ all -> 0x00fd }
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ all -> 0x00fd }
            if (r7 != 0) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r7.<init>()     // Catch:{ all -> 0x00fd }
            r7.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = " okhttp/3.5.0"
            r7.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "User-Agent"
            r5.mo111263a(r7, r6)     // Catch:{ all -> 0x00fd }
        L_0x003a:
            if (r25 == 0) goto L_0x0058
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x00fd }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00fd }
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00fd }
            com.ss.android.http.a.b.e r7 = (com.p683ss.android.http.p1169a.p1172b.C19180e) r7     // Catch:{ all -> 0x00fd }
            java.lang.String r8 = r7.mo39131a()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = r7.mo39132b()     // Catch:{ all -> 0x00fd }
            r5.mo111271b(r8, r7)     // Catch:{ all -> 0x00fd }
            goto L_0x0040
        L_0x0058:
            okhttp3.ab r5 = r5.mo111272c()     // Catch:{ all -> 0x00fd }
            okhttp3.e r3 = r3.mo111325a(r5)     // Catch:{ all -> 0x00fd }
            okhttp3.ad r6 = r3.mo111247b()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "x-snssdk.remoteaddr"
            java.lang.String r14 = r6.mo111276b(r7)     // Catch:{ all -> 0x00fd }
            r7 = 0
            if (r0 == 0) goto L_0x0078
            boolean r8 = r0.f52125a     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x0078
            m20672a(r13, r14)
            return r7
        L_0x0075:
            r0 = move-exception
            goto L_0x00ff
        L_0x0078:
            int r8 = r6.f132400c     // Catch:{ all -> 0x0075 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x00f1
            okhttp3.ae r15 = r6.f132404g     // Catch:{ all -> 0x0075 }
            if (r15 == 0) goto L_0x00e8
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r6.mo111276b(r4)     // Catch:{ all -> 0x00e5 }
            r8 = -1
            if (r4 == 0) goto L_0x0090
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x00e5 }
        L_0x0090:
            if (r2 == 0) goto L_0x00a1
            int r4 = r2.length     // Catch:{ all -> 0x00e5 }
            if (r4 <= 0) goto L_0x00a1
            r2[r7] = r7     // Catch:{ all -> 0x00e5 }
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x00a1
            int r4 = (int) r8     // Catch:{ all -> 0x00e5 }
            r2[r7] = r4     // Catch:{ all -> 0x00e5 }
        L_0x00a1:
            java.io.InputStream r2 = r15.byteStream()     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r6.mo111276b(r4)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00bb
            java.lang.String r6 = "gzip"
            boolean r4 = r6.equalsIgnoreCase(r4)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00bb
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00e5 }
            r4.<init>(r2)     // Catch:{ all -> 0x00e5 }
            r2 = r4
        L_0x00bb:
            com.bytedance.ies.b.c.c$2 r6 = new com.bytedance.ies.b.c.c$2     // Catch:{ all -> 0x00e5 }
            r6.<init>(r5, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = r19.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = r20.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = r21.toString()     // Catch:{ all -> 0x00e5 }
            r3 = r8
            r5 = r6
            r6 = r17
            r8 = r10
            r9 = r11
            r10 = r22
            r11 = r23
            r12 = r24
            boolean r0 = com.p683ss.android.common.util.NetworkUtils.stream2File(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e5 }
            m20672a(r13, r14)
            if (r15 == 0) goto L_0x00e4
            com.p683ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00e4 }
        L_0x00e4:
            return r0
        L_0x00e5:
            r0 = move-exception
            r4 = r15
            goto L_0x00ff
        L_0x00e8:
            m20672a(r13, r14)
            if (r15 == 0) goto L_0x00f0
            com.p683ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00f0 }
        L_0x00f0:
            return r7
        L_0x00f1:
            java.lang.String r0 = "Reason-Phrase"
            java.lang.String r0 = r6.mo111276b(r0)     // Catch:{ all -> 0x0075 }
            com.ss.android.http.a.a.b r2 = new com.ss.android.http.a.a.b     // Catch:{ all -> 0x0075 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0075 }
            throw r2     // Catch:{ all -> 0x0075 }
        L_0x00fd:
            r0 = move-exception
            r14 = r4
        L_0x00ff:
            m20672a(r13, r14)
            if (r4 == 0) goto L_0x0107
            com.p683ss.android.common.util.NetworkUtils.safeClose(r4)     // Catch:{ Throwable -> 0x0107 }
        L_0x0107:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p621b.p624c.C10206c.mo18239a(int, java.lang.String, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.f, java.util.List, java.lang.String[], int[], org.apache.http.client.RedirectHandler):boolean");
    }

    /* renamed from: a */
    public final String mo18237a(int i, String str, C18884a aVar, C18916c<Long> cVar, long j, C18891d[] dVarArr) throws Exception {
        C53499a a = new C53499a().mo111262a(str);
        C53680a a2 = new C53680a().mo111648a(C53679x.f133173e);
        for (C18887c cVar2 : aVar.f52090a) {
            if (cVar2 instanceof C18888d) {
                a2.mo111645a(cVar2.mo38694a(), (String) cVar2.mo38695b());
            } else if (cVar2 instanceof C18885a) {
                C18885a aVar2 = (C18885a) cVar2;
                a2.mo111646a(aVar2.mo38694a(), aVar2.f52093c, C53500ac.create((C53678w) null, (byte[]) aVar2.mo38695b()));
            } else if (cVar2 instanceof C18886b) {
                File file = (File) cVar2.mo38695b();
                a2.mo111646a(cVar2.mo38694a(), file.getName(), C53500ac.create((C53678w) null, file));
            }
        }
        return m20668a(0, i, str, a, (C53500ac) a2.mo111650a(), dVarArr);
    }

    /* renamed from: a */
    public final String mo18236a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C19170a> list) throws Exception {
        C53500ac create;
        C53499a a = new C53499a().mo111262a(str);
        if (str2 != null) {
            a.mo111263a("Content-Encoding", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            a.mo111263a("Content-Type", str3);
        }
        a.mo111271b("Accept-Encoding", "gzip");
        if (list != null) {
            for (C19170a aVar : list) {
                a.mo111271b(aVar.mo39116a(), aVar.mo39117b());
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            create = C53500ac.create(C53678w.m114225a(str3), bArr);
        } else {
            create = C53500ac.create((C53678w) null, bArr);
        }
        return m20668a(i, i2, str, a, create, (C18891d[]) null);
    }

    public C10206c(C10204a aVar) {
        this.f27537b = aVar;
    }

    /* renamed from: a */
    private static void m20672a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !C9431p.m18664a(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static C53498ab m20671a(int i, C53498ab abVar) throws Exception {
        if (i < 0) {
            return abVar;
        }
        return abVar.mo111256a().mo111266a(new C53523a().mo111323a(i, TimeUnit.SECONDS).mo111324b()).mo111270b("Pragma").mo111272c();
    }

    /* renamed from: a */
    private static String m20669a(int i, C53506ae aeVar, C53504ad adVar) throws IOException {
        String str;
        if (aeVar == null || adVar == null) {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
        InputStream byteStream = aeVar.byteStream();
        boolean z = false;
        String b = adVar.mo111276b("Content-Encoding");
        if (b != null && "gzip".equalsIgnoreCase(b)) {
            z = true;
        }
        try {
            C53678w contentType = aeVar.contentType();
            if (contentType != null) {
                str = contentType.toString();
            } else {
                str = adVar.mo111276b("Content-Type");
            }
            if (str == null) {
                str = "";
            }
            boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
            long contentLength = aeVar.contentLength();
            String str2 = null;
            if (contentLength > 2147483647L) {
                return null;
            }
            if (contentType != null) {
                if (contentType.mo111640a() != null) {
                    str2 = contentType.mo111640a().name();
                }
            }
            if (str2 == null) {
                str2 = "UTF-8";
            }
            String response2String = NetworkUtils.response2String(z, testIsSSBinary, i, byteStream, str2);
            NetworkUtils.safeClose(byteStream);
            return response2String;
        } finally {
            NetworkUtils.safeClose(byteStream);
        }
    }

    /* renamed from: a */
    public final String mo18235a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        return mo18236a(i, i2, str, bArr, str2, str3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r6 = r1;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.p683ss.android.common.util.NetworkUtils.safeClose(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fa A[SYNTHETIC, Splitter:B:62:0x00fa] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m20668a(int r20, int r21, java.lang.String r22, okhttp3.C53498ab.C53499a r23, okhttp3.C53500ac r24, com.p683ss.android.common.p1144c.C18891d[] r25) throws java.lang.Exception {
        /*
            r19 = this;
            r5 = r22
            r9 = r19
            r0 = r25
            com.bytedance.ies.b.c.a r1 = r9.f27537b
            okhttp3.y r1 = r1.mo18228a()
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.common.util.NetworkUtils$f r7 = new com.ss.android.common.util.NetworkUtils$f
            r7.<init>()
            java.lang.String r4 = m20670a(r22)
            r7.f52120a = r4
            r4 = 0
            r23.mo111265a(r24)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            okhttp3.ab r6 = r23.mo111272c()     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            r8 = r20
            okhttp3.ab r6 = m20671a(r8, r6)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            okhttp3.e r1 = r1.mo111325a(r6)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            if (r0 == 0) goto L_0x003a
            int r8 = r0.length     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            if (r8 <= 0) goto L_0x003a
            r8 = 0
            com.bytedance.ies.b.c.c$a r10 = new com.bytedance.ies.b.c.c$a     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            r10.<init>(r1)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            r0[r8] = r10     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
        L_0x003a:
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            okhttp3.ad r0 = r1.mo111247b()     // Catch:{ Exception -> 0x00da, all -> 0x00dc }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00da, all -> 0x00dc }
            r3 = 0
            long r10 = r1 - r17
            java.lang.String r1 = "X-TT-LOGID"
            java.lang.String r1 = r0.mo111276b(r1)     // Catch:{ Exception -> 0x00da, all -> 0x00dc }
            com.ss.android.common.util.NetworkUtils$d r2 = com.p683ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r2 == 0) goto L_0x008f
            com.ss.android.common.util.NetworkUtils$d r2 = com.p683ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            java.lang.String r2 = r2.mo38764a()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r3 != 0) goto L_0x008f
            java.util.List r2 = r0.mo111274a(r2)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r2 == 0) goto L_0x008f
            int r3 = r2.size()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r3 <= 0) goto L_0x008f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3.<init>()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
        L_0x0078:
            boolean r8 = r2.hasNext()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r8 == 0) goto L_0x0088
            java.lang.Object r8 = r2.next()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3.add(r8)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            goto L_0x0078
        L_0x0088:
            com.ss.android.common.util.NetworkUtils$d r2 = com.p683ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r2.mo38765a(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
        L_0x008f:
            int r2 = r0.f132400c     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x00ca
            okhttp3.ae r2 = r0.f132404g     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r2 == 0) goto L_0x00c4
            r3 = r21
            java.lang.String r0 = m20669a(r3, r2, r0)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            com.p683ss.android.common.util.NetworkUtils.handleTimeStampFromResponse(r0)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            com.p683ss.android.common.util.NetworkUtils.handleApiOk(r5, r10, r4)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            okhttp3.t r3 = r6.f132378a     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            java.net.URL r3 = r3.mo111610a()     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            java.lang.String r14 = r3.toString()     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            r12 = r17
            r15 = r1
            r16 = r7
            com.p683ss.android.common.util.NetworkUtils.monitorApiSample(r10, r12, r14, r15, r16)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            if (r2 == 0) goto L_0x00bc
            com.p683ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x00bc }
        L_0x00bc:
            return r0
        L_0x00bd:
            r0 = move-exception
            r4 = r2
            goto L_0x00f8
        L_0x00c0:
            r0 = move-exception
            r6 = r1
            r10 = r2
            goto L_0x00e3
        L_0x00c4:
            if (r2 == 0) goto L_0x00c9
            com.p683ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x00c9 }
        L_0x00c9:
            return r4
        L_0x00ca:
            java.lang.String r3 = "Reason-Phrase"
            java.lang.String r0 = r0.mo111276b(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            com.ss.android.http.a.a.b r3 = new com.ss.android.http.a.a.b     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            throw r3     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
        L_0x00d6:
            r0 = move-exception
            r6 = r1
            r10 = r4
            goto L_0x00e3
        L_0x00da:
            r0 = move-exception
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            goto L_0x00f8
        L_0x00de:
            r0 = move-exception
            r17 = r2
        L_0x00e1:
            r6 = r4
            r10 = r6
        L_0x00e3:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f6 }
            r3 = 0
            long r1 = r1 - r17
            com.p683ss.android.common.util.NetworkUtils.handleApiError(r5, r0, r1, r4)     // Catch:{ all -> 0x00f6 }
            r3 = r17
            r5 = r22
            r8 = r0
            com.p683ss.android.common.util.NetworkUtils.monitorApiError(r1, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            r4 = r10
        L_0x00f8:
            if (r4 == 0) goto L_0x00fd
            com.p683ss.android.common.util.NetworkUtils.safeClose(r4)     // Catch:{ Throwable -> 0x00fd }
        L_0x00fd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p621b.p624c.C10206c.m20668a(int, int, java.lang.String, okhttp3.ab$a, okhttp3.ac, com.ss.android.common.c.d[]):java.lang.String");
    }

    /* renamed from: a */
    public final String mo18232a(int i, int i2, String str, List<C19180e> list, C18884a aVar, C18891d[] dVarArr) throws Exception {
        C53499a a = new C53499a().mo111262a(str);
        C53680a a2 = new C53680a().mo111648a(C53679x.f133173e);
        for (C19180e eVar : list) {
            a2.mo111645a(eVar.mo39131a(), eVar.mo39132b());
        }
        for (C18887c cVar : aVar.f52090a) {
            if (cVar instanceof C18888d) {
                a2.mo111645a(cVar.mo38694a(), (String) cVar.mo38695b());
            } else if (cVar instanceof C18885a) {
                C18885a aVar2 = (C18885a) cVar;
                a2.mo111646a(aVar2.mo38694a(), aVar2.f52093c, C53500ac.create((C53678w) null, (byte[]) aVar2.mo38695b()));
            } else if (cVar instanceof C18886b) {
                File file = (File) cVar.mo38695b();
                a2.mo111646a(cVar.mo38694a(), file.getName(), C53500ac.create((C53678w) null, file));
            }
        }
        a.mo111271b("Accept-Encoding", "gzip");
        return m20668a(i, i2, str, a, (C53500ac) new C10210d(a2.mo111650a()), dVarArr);
    }

    /* renamed from: a */
    public final String mo18234a(int i, int i2, String str, List<C19180e> list, boolean z, C18891d[] dVarArr, List<C19170a> list2) throws Exception {
        C53499a a = new C53499a().mo111262a(str);
        C53669a aVar = new C53669a();
        for (C19180e eVar : list) {
            aVar.mo111586a(eVar.mo39131a(), eVar.mo39132b());
        }
        a.mo111271b("Accept-Encoding", "gzip");
        if (list2 != null) {
            for (C19170a aVar2 : list2) {
                a.mo111271b(aVar2.mo39116a(), aVar2.mo39117b());
            }
        }
        return m20668a(i, i2, str, a, (C53500ac) aVar.mo111587a(), dVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0149, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014a, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014e, code lost:
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0149 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0167 A[SYNTHETIC, Splitter:B:83:0x0167] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo18233a(int r19, int r20, java.lang.String r21, java.util.List<com.p683ss.android.http.p1169a.C19170a> r22, boolean r23, boolean r24, com.p683ss.android.http.p1169a.p1172b.C19181f r25, boolean r26) throws java.lang.Exception {
        /*
            r18 = this;
            r5 = r21
            r0 = r25
            long r3 = java.lang.System.currentTimeMillis()
            r13 = r18
            com.bytedance.ies.b.c.a r1 = r13.f27537b
            okhttp3.y r1 = r1.mo18228a()
            com.ss.android.common.util.NetworkUtils$f r14 = new com.ss.android.common.util.NetworkUtils$f
            r14.<init>()
            java.lang.String r2 = m20670a(r21)
            r14.f52120a = r2
            okhttp3.ab$a r6 = new okhttp3.ab$a     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            r6.<init>()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            okhttp3.ab$a r6 = r6.mo111262a(r5)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            java.lang.String r7 = "Accept-Encoding"
            java.lang.String r8 = "gzip"
            r6.mo111271b(r7, r8)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r22 == 0) goto L_0x0051
            java.util.Iterator r7 = r22.iterator()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
        L_0x0031:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            com.ss.android.http.a.a r8 = (com.p683ss.android.http.p1169a.C19170a) r8     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            java.lang.String r9 = r8.mo39116a()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            java.lang.String r8 = r8.mo39117b()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r9 == 0) goto L_0x0031
            int r10 = r9.length()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r10 <= 0) goto L_0x0031
            r6.mo111271b(r9, r8)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            goto L_0x0031
        L_0x0051:
            okhttp3.ab r6 = r6.mo111272c()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            r7 = r19
            okhttp3.ab r6 = m20671a(r7, r6)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            okhttp3.e r1 = r1.mo111325a(r6)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            okhttp3.ad r1 = r1.mo111247b()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            r9 = 0
            long r7 = r7 - r3
            java.lang.String r9 = "X-TT-LOGID"
            java.lang.String r15 = r1.mo111276b(r9)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            com.ss.android.common.util.NetworkUtils$d r9 = com.p683ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r9 == 0) goto L_0x00af
            com.ss.android.common.util.NetworkUtils$d r9 = com.p683ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.lang.String r9 = r9.mo38764a()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            boolean r10 = com.bytedance.common.utility.C9431p.m18664a(r9)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r10 != 0) goto L_0x00af
            java.util.List r9 = r1.mo111274a(r9)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r9 == 0) goto L_0x00af
            int r10 = r9.size()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r10 <= 0) goto L_0x00af
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r10.<init>()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x0098:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r10.add(r11)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            goto L_0x0098
        L_0x00a8:
            com.ss.android.common.util.NetworkUtils$d r9 = com.p683ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r9.mo38765a(r10)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x00af:
            if (r0 == 0) goto L_0x00fd
            okhttp3.s r9 = r1.f132403f     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r10 = 0
            int r11 = r9.mo111591a()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x00b8:
            if (r10 >= r11) goto L_0x00fd
            java.lang.String r12 = r9.mo111592a(r10)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.lang.String r2 = "ETag"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "Last-Modified"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "Cache-Control"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "X-SS-SIGN"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "X-TT-LOGID"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 == 0) goto L_0x00e7
            goto L_0x00ea
        L_0x00e7:
            r17 = r9
            goto L_0x00f8
        L_0x00ea:
            java.lang.String r2 = r9.mo111594b(r10)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r17 = r9
            com.ss.android.http.a.b.a r9 = new com.ss.android.http.a.b.a     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r9.<init>(r12, r2)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r0.mo39137a(r9)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x00f8:
            int r10 = r10 + 1
            r9 = r17
            goto L_0x00b8
        L_0x00fd:
            int r0 = r1.f132400c     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x013a
            okhttp3.ae r2 = r1.f132404g     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 == 0) goto L_0x0133
            r0 = r20
            java.lang.String r0 = m20669a(r0, r2, r1)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            com.p683ss.android.common.util.NetworkUtils.handleTimeStampFromResponse(r0)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            r1 = 0
            com.p683ss.android.common.util.NetworkUtils.handleApiOk(r5, r7, r1)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            okhttp3.t r1 = r6.f132378a     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            java.net.URL r1 = r1.mo111610a()     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            r6 = r7
            r8 = r3
            r11 = r15
            r12 = r14
            com.p683ss.android.common.util.NetworkUtils.monitorApiSample(r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            if (r2 == 0) goto L_0x012a
            com.p683ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x012a }
        L_0x012a:
            return r0
        L_0x012b:
            r0 = move-exception
            r16 = r2
            goto L_0x0165
        L_0x012f:
            r0 = move-exception
            r9 = r2
            r6 = r15
            goto L_0x0150
        L_0x0133:
            if (r2 == 0) goto L_0x0138
            com.p683ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x0138 }
        L_0x0138:
            r1 = 0
            return r1
        L_0x013a:
            java.lang.String r2 = "Reason-Phrase"
            java.lang.String r1 = r1.mo111276b(r2)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            com.ss.android.http.a.a.b r2 = new com.ss.android.http.a.a.b     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            throw r2     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x0146:
            r0 = move-exception
            r6 = r15
            goto L_0x014f
        L_0x0149:
            r0 = move-exception
            r16 = 0
            goto L_0x0165
        L_0x014d:
            r0 = move-exception
            r6 = 0
        L_0x014f:
            r9 = 0
        L_0x0150:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0162 }
            r7 = 0
            long r1 = r1 - r3
            r7 = 0
            com.p683ss.android.common.util.NetworkUtils.handleApiError(r5, r0, r1, r7)     // Catch:{ all -> 0x0162 }
            r5 = r21
            r7 = r14
            r8 = r0
            com.p683ss.android.common.util.NetworkUtils.monitorApiError(r1, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r16 = r9
        L_0x0165:
            if (r16 == 0) goto L_0x016a
            com.p683ss.android.common.util.NetworkUtils.safeClose(r16)     // Catch:{ Throwable -> 0x016a }
        L_0x016a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p621b.p624c.C10206c.mo18233a(int, int, java.lang.String, java.util.List, boolean, boolean, com.ss.android.http.a.b.f, boolean):java.lang.String");
    }
}
