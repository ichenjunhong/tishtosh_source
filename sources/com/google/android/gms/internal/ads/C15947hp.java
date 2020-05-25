package com.google.android.gms.internal.ads;

import com.C2240a;

/* renamed from: com.google.android.gms.internal.ads.hp */
public class C15947hp implements bmz {

    /* renamed from: a */
    private static final boolean f45031a = C15840dr.f44899a;

    /* renamed from: b */
    private final C16163pp f45032b;

    /* renamed from: c */
    private final C15922gr f45033c;

    /* renamed from: d */
    private final C15973io f45034d;

    public C15947hp(C16163pp ppVar) {
        this(ppVar, new C15973io(4096));
    }

    private C15947hp(C16163pp ppVar, C15973io ioVar) {
        this.f45032b = ppVar;
        this.f45033c = new C15896fs(ppVar);
        this.f45034d = ioVar;
    }

    public C15947hp(C15922gr grVar) {
        this(grVar, new C15973io(4096));
    }

    private C15947hp(C15922gr grVar, C15973io ioVar) {
        this.f45033c = grVar;
        this.f45032b = grVar;
        this.f45034d = ioVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01cc, code lost:
        if (r0 < 400) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d8, code lost:
        throw new com.google.android.gms.internal.ads.bgv(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01db, code lost:
        if (r0 < 500) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e6, code lost:
        throw new com.google.android.gms.internal.ads.C15663aw(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ec, code lost:
        throw new com.google.android.gms.internal.ads.C15663aw(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ed, code lost:
        m37761a("auth", r2, new com.google.android.gms.internal.ads.C15560a(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f9, code lost:
        m37761a("network", r2, new com.google.android.gms.internal.ads.boy());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x020a, code lost:
        throw new com.google.android.gms.internal.ads.bqv(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x020c, code lost:
        r4 = "Bad URL ";
        r2 = java.lang.String.valueOf(r2.f43726b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x021a, code lost:
        if (r2.length() != 0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x021c, code lost:
        r2 = r4.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0221, code lost:
        r2 = new java.lang.String(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0229, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022a, code lost:
        m37761a("socket", r2, new com.google.android.gms.internal.ads.C15731bp());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014e, code lost:
        r13 = r5;
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x018e, code lost:
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018f, code lost:
        r13 = r5;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0193, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0194, code lost:
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0198, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0199, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019d, code lost:
        r17 = r5;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a3, code lost:
        r0 = r10.f45385a;
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r0), r2.f43726b};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b1, code lost:
        if (r13 != null) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b3, code lost:
        r11 = new com.google.android.gms.internal.ads.bpz(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c3, code lost:
        if (r0 == 401) goto L_0x01ed;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x020b A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0205 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.bpz mo28726a(com.google.android.gms.internal.ads.brw<?> r22) throws com.google.android.gms.internal.ads.C15812cq {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 1
            r7 = 2
            r9 = 0
            com.google.android.gms.internal.ads.auw r0 = r2.f43734j     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            if (r0 != 0) goto L_0x0018
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            goto L_0x0045
        L_0x0018:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            java.lang.String r11 = r0.f41391b     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            if (r11 == 0) goto L_0x0028
            java.lang.String r11 = "If-None-Match"
            java.lang.String r12 = r0.f41391b     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            r10.put(r11, r12)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
        L_0x0028:
            long r11 = r0.f41393d     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0044
            java.lang.String r11 = "If-Modified-Since"
            long r12 = r0.f41393d     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            java.text.SimpleDateFormat r0 = com.google.android.gms.internal.ads.C16107nn.m38102a()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            java.util.Date r14 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            r14.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            java.lang.String r0 = r0.format(r14)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            r10.put(r11, r0)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
        L_0x0044:
            r0 = r10
        L_0x0045:
            com.google.android.gms.internal.ads.gr r10 = r1.f45033c     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            com.google.android.gms.internal.ads.oo r10 = r10.mo31076a(r2, r0)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x019c }
            int r12 = r10.f45385a     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0198 }
            java.util.List r11 = r10.mo31237a()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0198 }
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x011c
            com.google.android.gms.internal.ads.auw r0 = r2.f43734j     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r0 != 0) goto L_0x006e
            com.google.android.gms.internal.ads.bpz r0 = new com.google.android.gms.internal.ads.bpz     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r5 = 0
            long r17 = r12 - r3
            r13 = r0
            r19 = r11
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            return r0
        L_0x006e:
            java.util.TreeSet r5 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r5.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            boolean r12 = r11.isEmpty()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r12 != 0) goto L_0x0091
            java.util.Iterator r12 = r11.iterator()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
        L_0x007f:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r13 == 0) goto L_0x0091
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            com.google.android.gms.internal.ads.blz r13 = (com.google.android.gms.internal.ads.blz) r13     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.lang.String r13 = r13.f42900a     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r5.add(r13)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            goto L_0x007f
        L_0x0091:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r12.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.util.List<com.google.android.gms.internal.ads.blz> r13 = r0.f41397h     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r13 == 0) goto L_0x00c0
            java.util.List<com.google.android.gms.internal.ads.blz> r13 = r0.f41397h     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r13 != 0) goto L_0x00ff
            java.util.List<com.google.android.gms.internal.ads.blz> r13 = r0.f41397h     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
        L_0x00a8:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r14 == 0) goto L_0x00ff
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            com.google.android.gms.internal.ads.blz r14 = (com.google.android.gms.internal.ads.blz) r14     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.lang.String r15 = r14.f42900a     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            boolean r15 = r5.contains(r15)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r15 != 0) goto L_0x00a8
            r12.add(r14)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            goto L_0x00a8
        L_0x00c0:
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f41396g     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r13 != 0) goto L_0x00ff
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f41396g     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
        L_0x00d2:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r14 == 0) goto L_0x00ff
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            boolean r15 = r5.contains(r15)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            if (r15 != 0) goto L_0x00d2
            com.google.android.gms.internal.ads.blz r15 = new com.google.android.gms.internal.ads.blz     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r15.<init>(r8, r14)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            goto L_0x00d2
        L_0x00ff:
            com.google.android.gms.internal.ads.bpz r5 = new com.google.android.gms.internal.ads.bpz     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.f41390a     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            r8 = 0
            long r18 = r13 - r3
            r14 = r5
            r16 = r0
            r20 = r12
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            return r5
        L_0x0117:
            r0 = move-exception
            r17 = r11
            goto L_0x01a0
        L_0x011c:
            java.io.InputStream r0 = r10.f45387c     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0193 }
            if (r0 == 0) goto L_0x0127
            int r5 = r10.f45386b     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            byte[] r0 = r1.m37762a(r0, r5)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0117 }
            goto L_0x0129
        L_0x0127:
            byte[] r0 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x0193 }
        L_0x0129:
            r5 = r0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r0 = 0
            long r13 = r13 - r3
            boolean r0 = f45031a     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            if (r0 != 0) goto L_0x013a
            r15 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x016a
        L_0x013a:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r0[r9] = r2     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r0[r6] = r8     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            if (r5 == 0) goto L_0x0152
            int r8 = r5.length     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x014d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x014d }
            goto L_0x0154
        L_0x014d:
            r0 = move-exception
            r13 = r5
            r17 = r11
            goto L_0x01a1
        L_0x0152:
            java.lang.String r8 = "null"
        L_0x0154:
            r0[r7] = r8     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r8 = 3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r0[r8] = r13     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r8 = 4
            com.google.android.gms.internal.ads.ac r13 = r2.f43733i     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            int r13 = r13.mo28660b()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r0[r8] = r13     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
        L_0x016a:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x0184
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x0184
            com.google.android.gms.internal.ads.bpz r0 = new com.google.android.gms.internal.ads.bpz     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018d }
            r8 = 0
            long r15 = r15 - r3
            r8 = r11
            r11 = r0
            r13 = r5
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018b }
            return r0
        L_0x0184:
            r8 = r11
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018b }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018b }
            throw r0     // Catch:{ SocketTimeoutException -> 0x022a, MalformedURLException -> 0x020b, IOException -> 0x018b }
        L_0x018b:
            r0 = move-exception
            goto L_0x018f
        L_0x018d:
            r0 = move-exception
            r8 = r11
        L_0x018f:
            r13 = r5
            r17 = r8
            goto L_0x01a1
        L_0x0193:
            r0 = move-exception
            r8 = r11
            r17 = r8
            goto L_0x01a0
        L_0x0198:
            r0 = move-exception
            r17 = r5
            goto L_0x01a0
        L_0x019c:
            r0 = move-exception
            r17 = r5
            r10 = 0
        L_0x01a0:
            r13 = 0
        L_0x01a1:
            if (r10 == 0) goto L_0x0205
            int r0 = r10.f45385a
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5[r9] = r7
            java.lang.String r7 = r2.f43726b
            r5[r6] = r7
            if (r13 == 0) goto L_0x01f9
            com.google.android.gms.internal.ads.bpz r5 = new com.google.android.gms.internal.ads.bpz
            r14 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r15 = r6 - r3
            r11 = r5
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r17)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x01ed
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x01ca
            goto L_0x01ed
        L_0x01ca:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x01d9
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x01d3
            goto L_0x01d9
        L_0x01d3:
            com.google.android.gms.internal.ads.bgv r0 = new com.google.android.gms.internal.ads.bgv
            r0.<init>(r5)
            throw r0
        L_0x01d9:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x01e7
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x01e7
            com.google.android.gms.internal.ads.aw r0 = new com.google.android.gms.internal.ads.aw
            r0.<init>(r5)
            throw r0
        L_0x01e7:
            com.google.android.gms.internal.ads.aw r0 = new com.google.android.gms.internal.ads.aw
            r0.<init>(r5)
            throw r0
        L_0x01ed:
            java.lang.String r0 = "auth"
            com.google.android.gms.internal.ads.a r6 = new com.google.android.gms.internal.ads.a
            r6.<init>(r5)
            m37761a(r0, r2, r6)
            goto L_0x0008
        L_0x01f9:
            java.lang.String r0 = "network"
            com.google.android.gms.internal.ads.boy r5 = new com.google.android.gms.internal.ads.boy
            r5.<init>()
            m37761a(r0, r2, r5)
            goto L_0x0008
        L_0x0205:
            com.google.android.gms.internal.ads.bqv r2 = new com.google.android.gms.internal.ads.bqv
            r2.<init>(r0)
            throw r2
        L_0x020b:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r2.f43726b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x0221
            java.lang.String r2 = r4.concat(r2)
            goto L_0x0226
        L_0x0221:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x0226:
            r3.<init>(r2, r0)
            throw r3
        L_0x022a:
            java.lang.String r0 = "socket"
            com.google.android.gms.internal.ads.bp r5 = new com.google.android.gms.internal.ads.bp
            r5.<init>()
            m37761a(r0, r2, r5)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15947hp.mo28726a(com.google.android.gms.internal.ads.brw):com.google.android.gms.internal.ads.bpz");
    }

    /* renamed from: a */
    private static void m37761a(String str, brw<?> brw, C15812cq cqVar) throws C15812cq {
        C15565ac acVar = brw.f43733i;
        int d = brw.mo30634d();
        try {
            acVar.mo28659a(cqVar);
            brw.mo30630b(C2240a.m6772a("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(d)}));
        } catch (C15812cq e) {
            brw.mo30630b(C2240a.m6772a("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(d)}));
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[SYNTHETIC, Splitter:B:22:0x003e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] m37762a(java.io.InputStream r5, int r6) throws java.io.IOException, com.google.android.gms.internal.ads.C15663aw {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.ti r0 = new com.google.android.gms.internal.ads.ti
            com.google.android.gms.internal.ads.io r1 = r4.f45034d
            r0.<init>(r1, r6)
            r6 = 0
            if (r5 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.io r1 = r4.f45034d     // Catch:{ all -> 0x003b }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r1 = r1.mo31100a(r2)     // Catch:{ all -> 0x003b }
        L_0x0012:
            int r6 = r5.read(r1)     // Catch:{ all -> 0x0030 }
            r2 = -1
            if (r6 == r2) goto L_0x001e
            r2 = 0
            r0.write(r1, r2, r6)     // Catch:{ all -> 0x0030 }
            goto L_0x0012
        L_0x001e:
            byte[] r6 = r0.toByteArray()     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x0027
            r5.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            com.google.android.gms.internal.ads.io r5 = r4.f45034d
            r5.mo31099a(r1)
            r0.close()
            return r6
        L_0x0030:
            r6 = move-exception
            r3 = r1
            r1 = r6
            r6 = r3
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.ads.aw r1 = new com.google.android.gms.internal.ads.aw     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
        L_0x003c:
            if (r5 == 0) goto L_0x0041
            r5.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            com.google.android.gms.internal.ads.io r5 = r4.f45034d
            r5.mo31099a(r6)
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15947hp.m37762a(java.io.InputStream, int):byte[]");
    }
}
