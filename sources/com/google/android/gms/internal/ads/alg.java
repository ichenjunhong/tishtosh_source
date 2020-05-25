package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.nio.ByteBuffer;

@C16299uq
public final class alg extends akt {

    /* renamed from: d */
    public String f40840d;

    /* renamed from: e */
    public boolean f40841e;

    /* renamed from: f */
    private final aia f40842f;

    /* renamed from: g */
    private boolean f40843g;

    /* renamed from: h */
    private final akk f40844h = new akk();

    /* renamed from: i */
    private ByteBuffer f40845i;

    /* renamed from: j */
    private boolean f40846j;

    /* renamed from: k */
    private final Object f40847k = new Object();

    public alg(aib aib, aia aia) {
        super(aib);
        this.f40842f = aia;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29095b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo29095b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    private final void m33201d() {
        int position = this.f40845i.position();
        boolean z = position > 0;
        int i = aig.f40587a;
        int a = aig.m32996a();
        String str = this.f40840d;
        String b = mo29095b(this.f40840d);
        Handler handler = aes.f40377a;
        akv akv = new akv(this, str, b, position, 0, z, i, a);
        handler.post(akv);
    }

    /* JADX WARNING: type inference failed for: r7v15, types: [com.google.android.gms.internal.ads.aje] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.f40841e = true;
        mo29091a(r2, r3, (long) ((int) r1.f40844h.mo29083a(r1.f40845i)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r1.f40845i.remaining() > 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        m33201d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        if (r1.f40843g != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        r4 = r7.mo28523a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        if ((r4 - r16) < r10) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        m33201d();
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if ((r4 - r8) > (1000 * r12)) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00eb, code lost:
        r4 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r5 = new java.lang.StringBuilder(49);
        r5.append("Timeout exceeded. Limit: ");
        r5.append(r12);
        r5.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010a, code lost:
        throw new java.io.IOException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r4 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5 = r1.f40845i.limit();
        r7 = new java.lang.StringBuilder(35);
        r7.append("Precache abort at ");
        r7.append(r5);
        r7.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        throw new java.io.IOException(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0136, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0137, code lost:
        r4 = r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29093a(java.lang.String r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r1.f40840d = r2
            java.lang.String r3 = r21.mo29095b(r22)
            java.lang.String r4 = "error"
            r5 = 0
            com.google.android.gms.internal.ads.bkp r0 = new com.google.android.gms.internal.ads.bkp     // Catch:{ Exception -> 0x013c }
            java.lang.String r8 = r1.f40783b     // Catch:{ Exception -> 0x013c }
            r9 = 0
            r10 = 0
            com.google.android.gms.internal.ads.aia r7 = r1.f40842f     // Catch:{ Exception -> 0x013c }
            int r11 = r7.f40555d     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.aia r7 = r1.f40842f     // Catch:{ Exception -> 0x013c }
            int r12 = r7.f40557f     // Catch:{ Exception -> 0x013c }
            r13 = 1
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.aia r7 = r1.f40842f     // Catch:{ Exception -> 0x013c }
            boolean r7 = r7.f40561j     // Catch:{ Exception -> 0x013c }
            if (r7 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.aje r7 = new com.google.android.gms.internal.ads.aje     // Catch:{ Exception -> 0x0030 }
            android.content.Context r8 = r1.f40782a     // Catch:{ Exception -> 0x0030 }
            r9 = 0
            r7.<init>(r8, r0, r9)     // Catch:{ Exception -> 0x0030 }
            r0 = r7
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x013f
        L_0x0033:
            android.net.Uri r7 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.bkn r8 = new com.google.android.gms.internal.ads.bkn     // Catch:{ Exception -> 0x013c }
            r8.<init>(r7)     // Catch:{ Exception -> 0x013c }
            r0.mo29003a(r8)     // Catch:{ Exception -> 0x013c }
            java.lang.ref.WeakReference r7 = r1.f40784c     // Catch:{ Exception -> 0x013c }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.aib r7 = (com.google.android.gms.internal.ads.aib) r7     // Catch:{ Exception -> 0x013c }
            if (r7 == 0) goto L_0x004c
            r7.mo28933a(r3, r1)     // Catch:{ Exception -> 0x0030 }
        L_0x004c:
            com.google.android.gms.common.util.e r7 = com.google.android.gms.ads.internal.C14963ax.m30837g()     // Catch:{ Exception -> 0x013c }
            long r8 = r7.mo28523a()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r10 = com.google.android.gms.internal.ads.C15740bx.f44491u     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.bu r11 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r10 = r11.mo30717a(r10)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x013c }
            long r10 = r10.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r12 = com.google.android.gms.internal.ads.C15740bx.f44490t     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.bu r13 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r12 = r13.mo30717a(r12)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ Exception -> 0x013c }
            long r12 = r12.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.aia r14 = r1.f40842f     // Catch:{ Exception -> 0x013c }
            int r14 = r14.f40554c     // Catch:{ Exception -> 0x013c }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ Exception -> 0x013c }
            r1.f40845i = r14     // Catch:{ Exception -> 0x013c }
            r14 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x013c }
            r16 = r8
        L_0x0084:
            java.nio.ByteBuffer r6 = r1.f40845i     // Catch:{ Exception -> 0x013c }
            int r6 = r6.remaining()     // Catch:{ Exception -> 0x013c }
            int r6 = java.lang.Math.min(r6, r14)     // Catch:{ Exception -> 0x013c }
            int r6 = r0.mo29002a(r15, r5, r6)     // Catch:{ Exception -> 0x013c }
            r14 = -1
            if (r6 != r14) goto L_0x00a7
            r14 = 1
            r1.f40841e = r14     // Catch:{ Exception -> 0x0030 }
            com.google.android.gms.internal.ads.akk r0 = r1.f40844h     // Catch:{ Exception -> 0x0030 }
            java.nio.ByteBuffer r6 = r1.f40845i     // Catch:{ Exception -> 0x0030 }
            long r6 = r0.mo29083a(r6)     // Catch:{ Exception -> 0x0030 }
            int r0 = (int) r6     // Catch:{ Exception -> 0x0030 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0030 }
            r1.mo29091a(r2, r3, r6)     // Catch:{ Exception -> 0x0030 }
        L_0x00a5:
            r2 = 1
            goto L_0x00c6
        L_0x00a7:
            java.lang.Object r14 = r1.f40847k     // Catch:{ Exception -> 0x013c }
            monitor-enter(r14)     // Catch:{ Exception -> 0x013c }
            boolean r5 = r1.f40843g     // Catch:{ all -> 0x0131 }
            if (r5 != 0) goto L_0x00b7
            java.nio.ByteBuffer r5 = r1.f40845i     // Catch:{ all -> 0x0131 }
            r18 = r4
            r4 = 0
            r5.put(r15, r4, r6)     // Catch:{ all -> 0x013a }
            goto L_0x00b9
        L_0x00b7:
            r18 = r4
        L_0x00b9:
            monitor-exit(r14)     // Catch:{ all -> 0x013a }
            java.nio.ByteBuffer r4 = r1.f40845i     // Catch:{ Exception -> 0x0136 }
            int r4 = r4.remaining()     // Catch:{ Exception -> 0x0136 }
            if (r4 > 0) goto L_0x00c7
            r21.m33201d()     // Catch:{ Exception -> 0x0136 }
            goto L_0x00a5
        L_0x00c6:
            return r2
        L_0x00c7:
            boolean r4 = r1.f40843g     // Catch:{ Exception -> 0x0136 }
            if (r4 != 0) goto L_0x010b
            long r4 = r7.mo28523a()     // Catch:{ Exception -> 0x0136 }
            r6 = 0
            long r19 = r4 - r16
            int r6 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x00db
            r21.m33201d()     // Catch:{ Exception -> 0x0136 }
            r16 = r4
        L_0x00db:
            r6 = 0
            long r4 = r4 - r8
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r12
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            r4 = r18
            r5 = 0
            r14 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0084
        L_0x00eb:
            java.lang.String r4 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0030 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r5.append(r0)     // Catch:{ Exception -> 0x0030 }
            r5.append(r12)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = " sec"
            r5.append(r0)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0030 }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x0030 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0030 }
            throw r5     // Catch:{ Exception -> 0x0030 }
        L_0x010b:
            java.lang.String r4 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0030 }
            java.nio.ByteBuffer r5 = r1.f40845i     // Catch:{ Exception -> 0x0030 }
            int r5 = r5.limit()     // Catch:{ Exception -> 0x0030 }
            r6 = 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0030 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r6 = "Precache abort at "
            r7.append(r6)     // Catch:{ Exception -> 0x0030 }
            r7.append(r5)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r5 = " bytes"
            r7.append(r5)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0030 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0030 }
            throw r0     // Catch:{ Exception -> 0x0030 }
        L_0x0131:
            r0 = move-exception
            r18 = r4
        L_0x0134:
            monitor-exit(r14)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            r4 = r18
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            goto L_0x0134
        L_0x013c:
            r0 = move-exception
            r18 = r4
        L_0x013f:
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            r7 = 1
            int r6 = r6 + r7
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r5)
            java.lang.String r5 = ":"
            r7.append(r5)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r5 = java.lang.String.valueOf(r22)
            int r5 = r5.length()
            int r5 = r5 + 34
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Failed to preload url "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = " Exception: "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            com.google.android.gms.internal.ads.abv.m32798e(r5)
            r1.mo29092a(r2, r3, r4, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alg.mo29093a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo29088a() {
        this.f40843g = true;
    }

    /* renamed from: c */
    public final ByteBuffer mo29107c() {
        synchronized (this.f40847k) {
            if (this.f40845i != null && !this.f40846j) {
                this.f40845i.flip();
                this.f40846j = true;
            }
            this.f40843g = true;
        }
        return this.f40845i;
    }
}
