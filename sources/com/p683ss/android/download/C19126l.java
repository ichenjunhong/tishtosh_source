package com.p683ss.android.download;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.p683ss.android.download.C19101c.C19103a;
import com.p683ss.android.download.p1161b.C19096c.C19097a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;

/* renamed from: com.ss.android.download.l */
public final class C19126l implements Runnable {

    /* renamed from: a */
    private final Context f52697a;

    /* renamed from: b */
    private final C19101c f52698b;

    /* renamed from: c */
    private final C19138v f52699c;

    /* renamed from: d */
    private final C19136u f52700d;

    /* renamed from: e */
    private final C19109e f52701e;

    /* renamed from: f */
    private volatile boolean f52702f;

    /* renamed from: com.ss.android.download.l$a */
    static class C19127a {

        /* renamed from: a */
        public String f52703a;

        /* renamed from: b */
        public String f52704b;

        /* renamed from: c */
        public int f52705c;

        /* renamed from: d */
        public boolean f52706d;

        /* renamed from: e */
        public String f52707e;

        /* renamed from: f */
        public long f52708f = -1;

        /* renamed from: g */
        public long f52709g;

        /* renamed from: h */
        public String f52710h;

        /* renamed from: i */
        public boolean f52711i;

        /* renamed from: j */
        public long f52712j;

        /* renamed from: k */
        public long f52713k;

        /* renamed from: l */
        public int f52714l = -1;

        /* renamed from: m */
        public long f52715m;

        /* renamed from: n */
        public long f52716n;

        /* renamed from: o */
        public long f52717o;

        /* renamed from: p */
        public long f52718p = -1;

        /* renamed from: q */
        public String f52719q;

        /* renamed from: r */
        public String f52720r;

        /* renamed from: s */
        public int f52721s;

        /* renamed from: t */
        public URL f52722t;

        public C19127a(C19101c cVar) {
            this.f52704b = cVar.f52611f;
            this.f52707e = cVar.f52607b;
            this.f52703a = cVar.f52610e;
            this.f52708f = cVar.f52624s;
            this.f52709g = cVar.f52625t;
        }
    }

    /* renamed from: a */
    private void m46616a(C19127a aVar, byte[] bArr, int i, OutputStream outputStream) throws C19135t {
        C19136u uVar = this.f52700d;
        int i2 = this.f52698b.f52612g;
        String str = aVar.f52703a;
        long j = (long) i;
        if (uVar.mo39076a(j) >= 1048576) {
            uVar.mo39078a(i2, str, j);
        }
        boolean z = false;
        while (true) {
            try {
                outputStream.write(bArr, 0, i);
                return;
            } catch (IOException e) {
                if (!z) {
                    this.f52700d.mo39078a(this.f52698b.f52612g, aVar.f52703a, j);
                    z = true;
                } else {
                    StringBuilder sb = new StringBuilder("Failed to write data: ");
                    sb.append(e);
                    throw new C19135t(492, sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m46610a() throws C19135t {
        this.f52702f = false;
        C19103a b = this.f52698b.mo39028b();
        if (b != C19103a.OK) {
            int i = 196;
            if (b == C19103a.UNUSABLE_DUE_TO_SIZE) {
                this.f52698b.mo39025a(true);
            } else if (b == C19103a.RECOMMENDED_UNUSABLE_DUE_TO_SIZE) {
                this.f52698b.mo39025a(false);
            } else {
                i = 195;
            }
            throw new C19135t(i, b.name());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0112 A[SYNTHETIC, Splitter:B:79:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x012b A[Catch:{ all -> 0x0139 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0060=Splitter:B:18:0x0060, B:74:0x0102=Splitter:B:74:0x0102, B:87:0x0123=Splitter:B:87:0x0123} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0080=Splitter:B:32:0x0080, B:44:0x00ab=Splitter:B:44:0x00ab} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r0 = 0
            android.content.Context r2 = r13.f52697a     // Catch:{ all -> 0x0139 }
            com.ss.android.download.g r2 = com.p683ss.android.download.C19117g.m46591a(r2)     // Catch:{ all -> 0x0139 }
            com.ss.android.download.c r3 = r13.f52698b     // Catch:{ all -> 0x0139 }
            long r3 = r3.f52606a     // Catch:{ all -> 0x0139 }
            int r2 = com.p683ss.android.download.C19101c.m46524a(r2, r3)     // Catch:{ all -> 0x0139 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x012f
            com.ss.android.download.l$a r2 = new com.ss.android.download.l$a     // Catch:{ all -> 0x0139 }
            com.ss.android.download.c r4 = r13.f52698b     // Catch:{ all -> 0x0139 }
            r2.<init>(r4)     // Catch:{ all -> 0x0139 }
            com.ss.android.download.c r4 = r13.f52698b     // Catch:{ all -> 0x0139 }
            int r4 = r4.f52616k     // Catch:{ all -> 0x0139 }
            android.content.Context r5 = r13.f52697a     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = "power"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ all -> 0x0139 }
            android.os.PowerManager r5 = (android.os.PowerManager) r5     // Catch:{ all -> 0x0139 }
            r6 = 491(0x1eb, float:6.88E-43)
            r7 = 0
            r8 = 1
            java.lang.String r9 = "SsDownloadManager"
            android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r8, r9)     // Catch:{ t -> 0x00a9, Throwable -> 0x007e, all -> 0x007a }
            r5.acquire()     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            com.ss.android.download.v r9 = r13.f52699c     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            android.net.NetworkInfo r9 = r9.mo39072b()     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            if (r9 == 0) goto L_0x0049
            int r9 = r9.getType()     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            r2.f52714l = r9     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
        L_0x0049:
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006d }
            java.lang.String r10 = r2.f52707e     // Catch:{ MalformedURLException -> 0x006d }
            r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x006d }
            r2.f52722t = r9     // Catch:{ MalformedURLException -> 0x006d }
            r13.m46611a(r2)     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            java.lang.String r9 = r2.f52703a     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            if (r9 == 0) goto L_0x0060
            java.lang.String r9 = r2.f52703a     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            r10 = 420(0x1a4, float:5.89E-43)
            com.bytedance.common.utility.p524d.C9396a.m18578a(r9, r10)     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
        L_0x0060:
            m46612a(r2, r3)     // Catch:{ all -> 0x0139 }
            r13.m46613a(r2, r3, r7, r4)     // Catch:{ all -> 0x0139 }
            if (r5 == 0) goto L_0x010c
        L_0x0068:
            r5.release()     // Catch:{ all -> 0x0139 }
            goto L_0x010c
        L_0x006d:
            r3 = move-exception
            com.ss.android.download.t r9 = new com.ss.android.download.t     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            r10 = 400(0x190, float:5.6E-43)
            r9.<init>(r10, r3)     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
            throw r9     // Catch:{ t -> 0x0078, Throwable -> 0x0076 }
        L_0x0076:
            r3 = move-exception
            goto L_0x0080
        L_0x0078:
            r3 = move-exception
            goto L_0x00ab
        L_0x007a:
            r3 = move-exception
            r5 = r7
            goto L_0x0123
        L_0x007e:
            r3 = move-exception
            r5 = r7
        L_0x0080:
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = "Exception for id "
            r7.<init>(r8)     // Catch:{ all -> 0x00a3 }
            com.ss.android.download.c r8 = r13.f52698b     // Catch:{ all -> 0x00a3 }
            long r8 = r8.f52606a     // Catch:{ all -> 0x00a3 }
            r7.append(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = ": "
            r7.append(r8)     // Catch:{ all -> 0x00a3 }
            r7.append(r3)     // Catch:{ all -> 0x00a3 }
            m46612a(r2, r6)     // Catch:{ all -> 0x0139 }
            r13.m46613a(r2, r6, r3, r4)     // Catch:{ all -> 0x0139 }
            if (r5 == 0) goto L_0x010c
            goto L_0x0068
        L_0x00a3:
            r7 = move-exception
            r12 = r7
            r7 = r3
        L_0x00a6:
            r3 = r12
            goto L_0x0123
        L_0x00a9:
            r3 = move-exception
            r5 = r7
        L_0x00ab:
            java.lang.String r9 = r3.getMessage()     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            java.lang.String r10 = "Aborting request for download "
            r7.<init>(r10)     // Catch:{ all -> 0x011f }
            com.ss.android.download.c r10 = r13.f52698b     // Catch:{ all -> 0x011f }
            long r10 = r10.f52606a     // Catch:{ all -> 0x011f }
            r7.append(r10)     // Catch:{ all -> 0x011f }
            java.lang.String r10 = ": "
            r7.append(r10)     // Catch:{ all -> 0x011f }
            r7.append(r9)     // Catch:{ all -> 0x011f }
            int r3 = r3.f52730a     // Catch:{ all -> 0x011f }
            r6 = 194(0xc2, float:2.72E-43)
            if (r3 == r6) goto L_0x0112
            r7 = 495(0x1ef, float:6.94E-43)
            if (r3 == r7) goto L_0x00d9
            r7 = 500(0x1f4, float:7.0E-43)
            if (r3 == r7) goto L_0x00d9
            r7 = 503(0x1f7, float:7.05E-43)
            if (r3 == r7) goto L_0x00d9
            r7 = 0
            goto L_0x00da
        L_0x00d9:
            r7 = 1
        L_0x00da:
            if (r7 == 0) goto L_0x0102
            boolean r7 = r2.f52706d     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x00e2
            r4 = 1
            goto L_0x00e4
        L_0x00e2:
            int r4 = r4 + 1
        L_0x00e4:
            r7 = 5
            if (r4 >= r7) goto L_0x0102
            com.ss.android.download.v r7 = r13.f52699c     // Catch:{ all -> 0x011a }
            android.net.NetworkInfo r7 = r7.mo39072b()     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x0100
            int r8 = r7.getType()     // Catch:{ all -> 0x011a }
            int r10 = r2.f52714l     // Catch:{ all -> 0x011a }
            if (r8 != r10) goto L_0x0100
            boolean r7 = r7.isConnected()     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x0100
            r3 = 194(0xc2, float:2.72E-43)
            goto L_0x0102
        L_0x0100:
            r3 = 195(0xc3, float:2.73E-43)
        L_0x0102:
            m46612a(r2, r3)     // Catch:{ all -> 0x0139 }
            r13.m46613a(r2, r3, r9, r4)     // Catch:{ all -> 0x0139 }
            if (r5 == 0) goto L_0x010c
            goto L_0x0068
        L_0x010c:
            com.ss.android.download.u r2 = r13.f52700d     // Catch:{ all -> 0x0139 }
            r2.mo39077a()     // Catch:{ all -> 0x0139 }
            goto L_0x012f
        L_0x0112:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011a }
            java.lang.String r7 = "Execution should always throw final error codes"
            r6.<init>(r7)     // Catch:{ all -> 0x011a }
            throw r6     // Catch:{ all -> 0x011a }
        L_0x011a:
            r6 = move-exception
            r7 = r9
            r12 = r6
            r6 = r3
            goto L_0x00a6
        L_0x011f:
            r3 = move-exception
            r7 = r9
            goto L_0x0123
        L_0x0122:
            r3 = move-exception
        L_0x0123:
            m46612a(r2, r6)     // Catch:{ all -> 0x0139 }
            r13.m46613a(r2, r6, r7, r4)     // Catch:{ all -> 0x0139 }
            if (r5 == 0) goto L_0x012e
            r5.release()     // Catch:{ all -> 0x0139 }
        L_0x012e:
            throw r3     // Catch:{ all -> 0x0139 }
        L_0x012f:
            com.ss.android.download.e r2 = r13.f52701e
            com.ss.android.download.c r3 = r13.f52698b
            long r3 = r3.f52606a
            r2.mo39042a(r3, r0)
            return
        L_0x0139:
            r2 = move-exception
            com.ss.android.download.e r3 = r13.f52701e
            com.ss.android.download.c r4 = r13.f52698b
            long r4 = r4.f52606a
            r3.mo39042a(r4, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19126l.run():void");
    }

    /* renamed from: b */
    private boolean m46619b(C19127a aVar) {
        if (aVar.f52709g <= 0 || this.f52698b.f52608c || aVar.f52710h != null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:190:0x036f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46611a(com.p683ss.android.download.C19126l.C19127a r18) throws com.p683ss.android.download.C19135t {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = -1
            r0.f52718p = r2
            r4 = 0
            r0.f52719q = r4
            r0.f52720r = r4
            r5 = 0
            r0.f52721s = r5
            java.lang.String r6 = r0.f52703a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 492(0x1ec, float:6.9E-43)
            r8 = 0
            r10 = 489(0x1e9, float:6.85E-43)
            r11 = 1
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = r0.f52703a
            com.ss.android.download.u r12 = r1.f52700d
            java.io.File r12 = r12.f52732b
            boolean r6 = com.p683ss.android.download.C19129n.m46628a(r6, r12)
            if (r6 == 0) goto L_0x007b
            java.io.File r6 = new java.io.File
            java.lang.String r12 = r0.f52703a
            r6.<init>(r12)
            boolean r12 = r6.exists()
            if (r12 == 0) goto L_0x0083
            long r12 = r6.length()
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0048
            r6.delete()
            r0.f52703a = r4
            boolean r6 = com.p683ss.android.download.C19080a.f52537c
            goto L_0x0083
        L_0x0048:
            com.ss.android.download.c r14 = r1.f52698b
            java.lang.String r14 = r14.f52626u
            if (r14 != 0) goto L_0x0060
            com.ss.android.download.c r14 = r1.f52698b
            boolean r14 = r14.f52608c
            if (r14 == 0) goto L_0x0055
            goto L_0x0060
        L_0x0055:
            r6.delete()
            com.ss.android.download.t r0 = new com.ss.android.download.t
            java.lang.String r2 = "Trying to resume a download that can't be resumed"
            r0.<init>(r10, r2)
            throw r0
        L_0x0060:
            int r6 = (int) r12
            long r12 = (long) r6
            r0.f52709g = r12
            com.ss.android.download.c r6 = r1.f52698b
            long r12 = r6.f52624s
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            com.ss.android.download.c r6 = r1.f52698b
            long r12 = r6.f52624s
            r0.f52718p = r12
        L_0x0072:
            com.ss.android.download.c r6 = r1.f52698b
            java.lang.String r6 = r6.f52626u
            r0.f52710h = r6
            r0.f52711i = r11
            goto L_0x0083
        L_0x007b:
            com.ss.android.download.t r0 = new com.ss.android.download.t
            java.lang.String r2 = "found invalid internal destination filename"
            r0.<init>(r7, r2)
            throw r0
        L_0x0083:
            long r12 = r0.f52709g
            long r14 = r0.f52708f
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x008c
            return
        L_0x008c:
            int r6 = r0.f52721s
            int r12 = r6 + 1
            r0.f52721s = r12
            r12 = 5
            if (r6 >= r12) goto L_0x0373
            r17.m46610a()     // Catch:{ IOException -> 0x0361, all -> 0x035d }
            java.net.URL r6 = r0.f52722t     // Catch:{ IOException -> 0x0361, all -> 0x035d }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x0361, all -> 0x035d }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0361, all -> 0x035d }
            r6.setInstanceFollowRedirects(r5)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r12 = 20000(0x4e20, float:2.8026E-41)
            r6.setConnectTimeout(r12)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r6.setReadTimeout(r12)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r1.m46618b(r0, r6)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r12 = r6.getResponseCode()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 == r13) goto L_0x0194
            r13 = 206(0xce, float:2.89E-43)
            if (r12 == r13) goto L_0x017f
            r13 = 307(0x133, float:4.3E-43)
            if (r12 == r13) goto L_0x015d
            r13 = 416(0x1a0, float:5.83E-43)
            if (r12 == r13) goto L_0x0155
            r13 = 500(0x1f4, float:7.0E-43)
            if (r12 == r13) goto L_0x014b
            r13 = 503(0x1f7, float:7.05E-43)
            if (r12 == r13) goto L_0x010c
            switch(r12) {
                case 301: goto L_0x015d;
                case 302: goto L_0x015d;
                case 303: goto L_0x015d;
                default: goto L_0x00cd;
            }     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x00cd:
            java.lang.String r0 = r6.getResponseMessage()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = "Unhandled HTTP response: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.append(r12)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.append(r0)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2 = 400(0x190, float:5.6E-43)
            if (r12 < r2) goto L_0x00f6
            r3 = 600(0x258, float:8.41E-43)
            if (r12 < r3) goto L_0x00f0
            goto L_0x00f6
        L_0x00f0:
            com.ss.android.download.t r2 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.<init>(r12, r0)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x00f6:
            r3 = 300(0x12c, float:4.2E-43)
            if (r12 < r3) goto L_0x0104
            if (r12 >= r2) goto L_0x0104
            com.ss.android.download.t r2 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r3 = 493(0x1ed, float:6.91E-43)
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0104:
            com.ss.android.download.t r2 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r3 = 494(0x1ee, float:6.92E-43)
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x010c:
            java.lang.String r2 = "Retry-After"
            r3 = -1
            int r2 = r6.getHeaderFieldInt(r2, r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52705c = r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r2 = r0.f52705c     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r2 < 0) goto L_0x013f
            int r2 = r0.f52705c     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r3 = 30
            if (r2 < r3) goto L_0x0129
            int r2 = r0.f52705c     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r3 = 86400(0x15180, float:1.21072E-40)
            if (r2 <= r3) goto L_0x012b
            r0.f52705c = r3     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            goto L_0x012b
        L_0x0129:
            r0.f52705c = r3     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x012b:
            int r2 = r0.f52705c     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.util.Random r3 = com.p683ss.android.download.C19129n.f52723a     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r4 = 31
            int r3 = r3.nextInt(r4)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r2 = r2 + r3
            r0.f52705c = r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r2 = r0.f52705c     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r2 = r2 * 1000
            r0.f52705c = r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            goto L_0x0141
        L_0x013f:
            r0.f52705c = r5     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0141:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = r6.getResponseMessage()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.<init>(r13, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x014b:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = r6.getResponseMessage()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.<init>(r13, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0155:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = "Requested range not satisfiable"
            r0.<init>(r10, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x015d:
            java.lang.String r13 = "Location"
            java.lang.String r13 = r6.getHeaderField(r13)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.net.URL r14 = new java.net.URL     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.net.URL r15 = r0.f52722t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r14.<init>(r15, r13)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52722t = r14     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r13 = 301(0x12d, float:4.22E-43)
            if (r12 != r13) goto L_0x0178
            java.net.URL r12 = r0.f52722t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52707e = r12     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0178:
            if (r6 == 0) goto L_0x008c
            r6.disconnect()
            goto L_0x008c
        L_0x017f:
            boolean r2 = r0.f52711i     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r2 == 0) goto L_0x018c
            r1.m46615a(r0, r6)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r6 == 0) goto L_0x018b
            r6.disconnect()
        L_0x018b:
            return
        L_0x018c:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = "Expected OK, but received partial"
            r0.<init>(r10, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0194:
            boolean r12 = r0.f52711i     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r12 != 0) goto L_0x0350
            java.lang.String r12 = "Content-Disposition"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52719q = r12     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r12 = "Content-Location"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52720r = r12     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r12 = r0.f52704b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r12 != 0) goto L_0x01b2
            java.lang.String r12 = r6.getContentType()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52704b = r12     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x01b2:
            java.lang.String r12 = "ETag"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52710h = r12     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r12 = "Transfer-Encoding"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r12 != 0) goto L_0x01cb
            java.lang.String r13 = "Content-Length"
            long r13 = m46609a(r6, r13, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52718p = r13     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            goto L_0x01cd
        L_0x01cb:
            r0.f52718p = r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x01cd:
            long r13 = r0.f52718p     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52708f = r13     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            com.ss.android.download.c r13 = r1.f52698b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            long r14 = r0.f52718p     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r13.f52624s = r14     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            long r13 = r0.f52718p     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 != 0) goto L_0x01e8
            if (r12 == 0) goto L_0x01e7
            java.lang.String r2 = "chunked"
            boolean r2 = r12.equalsIgnoreCase(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r2 != 0) goto L_0x01e8
        L_0x01e7:
            r5 = 1
        L_0x01e8:
            com.ss.android.download.c r2 = r1.f52698b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            boolean r2 = r2.f52608c     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r2 != 0) goto L_0x01f9
            if (r5 != 0) goto L_0x01f1
            goto L_0x01f9
        L_0x01f1:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = "can't know size of download, giving up"
            r0.<init>(r10, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x01f9:
            android.content.Context r2 = r1.f52697a     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            com.ss.android.download.c r2 = r1.f52698b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = r2.f52607b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            com.ss.android.download.c r3 = r1.f52698b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = r3.f52609d     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r5 = r0.f52719q     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r10 = r0.f52720r     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r12 = r0.f52704b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            com.ss.android.download.c r13 = r1.f52698b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r13 = r13.f52612g     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            long r14 = r0.f52718p     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            com.ss.android.download.u r4 = r1.f52700d     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x0216
            r14 = r8
        L_0x0216:
            if (r13 != r11) goto L_0x0223
            android.net.Uri r2 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = r2.getPath()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r8 = 0
            goto L_0x02e8
        L_0x0223:
            if (r13 != 0) goto L_0x033c
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r9.<init>()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.io.File r11 = r4.f52731a     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r11 = r11.getPath()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r9.append(r11)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r11 = com.p683ss.android.download.C19080a.f52535a     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r9.append(r11)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            boolean r9 = r8.isDirectory()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r9 != 0) goto L_0x0266
            boolean r9 = r8.mkdir()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r9 == 0) goto L_0x024e
            goto L_0x0266
        L_0x024e:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = "unable to create external downloads directory "
            r2.<init>(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = r8.getPath()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.append(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.<init>(r7, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0266:
            r7 = 47
            if (r3 == 0) goto L_0x027f
            java.lang.String r9 = "/"
            boolean r9 = r3.endsWith(r9)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r9 != 0) goto L_0x027f
            int r9 = r3.lastIndexOf(r7)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r11 = 1
            int r9 = r9 + r11
            if (r9 <= 0) goto L_0x0280
            java.lang.String r3 = r3.substring(r9)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            goto L_0x0280
        L_0x027f:
            r3 = 0
        L_0x0280:
            if (r3 != 0) goto L_0x0296
            if (r5 == 0) goto L_0x0296
            java.lang.String r3 = com.p683ss.android.download.C19129n.m46623a(r5)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r3 == 0) goto L_0x0296
            int r5 = r3.lastIndexOf(r7)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r9 = 1
            int r5 = r5 + r9
            if (r5 <= 0) goto L_0x0296
            java.lang.String r3 = r3.substring(r5)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0296:
            r5 = 63
            if (r3 != 0) goto L_0x02be
            if (r10 == 0) goto L_0x02be
            java.lang.String r9 = android.net.Uri.decode(r10)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r9 == 0) goto L_0x02be
            java.lang.String r10 = "/"
            boolean r10 = r9.endsWith(r10)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r10 != 0) goto L_0x02be
            int r10 = r9.indexOf(r5)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r10 >= 0) goto L_0x02be
            int r3 = r9.lastIndexOf(r7)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r10 = 1
            int r3 = r3 + r10
            if (r3 <= 0) goto L_0x02bd
            java.lang.String r3 = r9.substring(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            goto L_0x02be
        L_0x02bd:
            r3 = r9
        L_0x02be:
            if (r3 != 0) goto L_0x02e0
            java.lang.String r2 = android.net.Uri.decode(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r2 == 0) goto L_0x02e0
            java.lang.String r9 = "/"
            boolean r9 = r2.endsWith(r9)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r9 != 0) goto L_0x02e0
            int r5 = r2.indexOf(r5)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r5 >= 0) goto L_0x02e0
            int r5 = r2.lastIndexOf(r7)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r7 = 1
            int r5 = r5 + r7
            if (r5 <= 0) goto L_0x02e0
            java.lang.String r3 = r2.substring(r5)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x02e0:
            if (r3 != 0) goto L_0x02e4
            java.lang.String r3 = "downloadfile"
        L_0x02e4:
            java.lang.String r2 = com.p683ss.android.download.C19129n.m46630b(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x02e8:
            r4.mo39078a(r13, r2, r14)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = com.p683ss.android.download.C19129n.m46624a(r2, r12, r13, r8)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.f52703a = r2     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.<init>()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = "_data"
            java.lang.String r4 = r0.f52703a     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = r0.f52710h     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r3 == 0) goto L_0x0308
            java.lang.String r3 = "etag"
            java.lang.String r4 = r0.f52710h     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0308:
            java.lang.String r3 = r0.f52704b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r3 == 0) goto L_0x0313
            java.lang.String r3 = "mimetype"
            java.lang.String r4 = r0.f52704b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0313:
            java.lang.String r3 = "total_bytes"
            com.ss.android.download.c r4 = r1.f52698b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            long r4 = r4.f52624s     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            android.content.Context r3 = r1.f52697a     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            com.ss.android.download.g r3 = com.p683ss.android.download.C19117g.m46591a(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            com.ss.android.download.c r4 = r1.f52698b     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            android.net.Uri r4 = r4.mo39029c()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r5 = 0
            r3.mo39052a(r4, r2, r5, r5)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r17.m46610a()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r1.m46615a(r0, r6)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            if (r6 == 0) goto L_0x033b
            r6.disconnect()
        L_0x033b:
            return
        L_0x033c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r3 = "unexpected value for destination: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r2.append(r13)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0350:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            java.lang.String r2 = "Expected partial, but received OK"
            r0.<init>(r10, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0358 }
        L_0x0358:
            r0 = move-exception
            goto L_0x036d
        L_0x035a:
            r0 = move-exception
            r4 = r6
            goto L_0x0363
        L_0x035d:
            r0 = move-exception
            r5 = r4
            r6 = r5
            goto L_0x036d
        L_0x0361:
            r0 = move-exception
            r5 = r4
        L_0x0363:
            com.ss.android.download.t r2 = new com.ss.android.download.t     // Catch:{ all -> 0x036b }
            r3 = 495(0x1ef, float:6.94E-43)
            r2.<init>(r3, r0)     // Catch:{ all -> 0x036b }
            throw r2     // Catch:{ all -> 0x036b }
        L_0x036b:
            r0 = move-exception
            r6 = r4
        L_0x036d:
            if (r6 == 0) goto L_0x0372
            r6.disconnect()
        L_0x0372:
            throw r0
        L_0x0373:
            com.ss.android.download.t r0 = new com.ss.android.download.t
            r2 = 497(0x1f1, float:6.96E-43)
            java.lang.String r3 = "Too many redirects"
            r0.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19126l.m46611a(com.ss.android.download.l$a):void");
    }

    /* renamed from: a */
    private static void m46612a(C19127a aVar, int i) {
        if (aVar.f52703a != null && C19097a.m46514b(i)) {
            new File(aVar.f52703a).delete();
            aVar.f52703a = null;
        }
    }

    /* renamed from: b */
    private void m46618b(C19127a aVar, HttpURLConnection httpURLConnection) {
        for (Pair pair : Collections.unmodifiableList(this.f52698b.f52598E)) {
            C19128m.m46621a(httpURLConnection, (String) pair.first, (String) pair.second);
        }
        if (httpURLConnection.getRequestProperty("User-Agent") == null) {
            String str = "User-Agent";
            String str2 = this.f52698b.f52622q;
            if (str2 == null) {
                str2 = C19080a.f52536b;
            }
            C19128m.m46621a(httpURLConnection, str, str2);
        }
        String str3 = "Accept-Encoding";
        String str4 = "identity";
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), str3, str4, "");
        }
        httpURLConnection.setRequestProperty(str3, str4);
        if (aVar.f52711i) {
            if (aVar.f52710h != null) {
                C19128m.m46621a(httpURLConnection, "If-Match", aVar.f52710h);
            }
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(aVar.f52709g);
            sb.append("-");
            C19128m.m46621a(httpURLConnection, "Range", sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x006b, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0071, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ IOException -> 0x0024, all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0052 A[SYNTHETIC, Splitter:B:44:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0059 A[SYNTHETIC, Splitter:B:48:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0061 A[Catch:{ IOException -> 0x006b, all -> 0x005d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46615a(com.p683ss.android.download.C19126l.C19127a r5, java.net.HttpURLConnection r6) throws com.p683ss.android.download.C19135t {
        /*
            r4 = this;
            r0 = 0
            java.io.InputStream r6 = com.p683ss.android.download.C19128m.m46620a(r6)     // Catch:{ IOException -> 0x0047 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r5.f52703a     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r2 = r1
            java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2     // Catch:{ IOException -> 0x0030 }
            java.io.FileDescriptor r2 = r2.getFD()     // Catch:{ IOException -> 0x0030 }
            r4.m46614a(r5, r6, r1)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x001c
            r6.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            r1.flush()     // Catch:{ IOException -> 0x0024, all -> 0x0028 }
            if (r2 == 0) goto L_0x0024
            r2.sync()     // Catch:{ IOException -> 0x0024, all -> 0x0028 }
        L_0x0024:
            r1.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002d
        L_0x0028:
            r5 = move-exception
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            throw r5
        L_0x002d:
            return
        L_0x002e:
            r5 = move-exception
            goto L_0x0041
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = move-exception
            r2 = r0
            goto L_0x0050
        L_0x0035:
            r5 = move-exception
            r1 = r0
        L_0x0037:
            com.ss.android.download.t r2 = new com.ss.android.download.t     // Catch:{ all -> 0x003f }
            r3 = 492(0x1ec, float:6.9E-43)
            r2.<init>(r3, r5)     // Catch:{ all -> 0x003f }
            throw r2     // Catch:{ all -> 0x003f }
        L_0x003f:
            r5 = move-exception
            r2 = r0
        L_0x0041:
            r0 = r1
            goto L_0x0050
        L_0x0043:
            r5 = move-exception
            r6 = r0
            r2 = r6
            goto L_0x0050
        L_0x0047:
            r5 = move-exception
            com.ss.android.download.t r6 = new com.ss.android.download.t     // Catch:{ all -> 0x0043 }
            r1 = 495(0x1ef, float:6.94E-43)
            r6.<init>(r1, r5)     // Catch:{ all -> 0x0043 }
            throw r6     // Catch:{ all -> 0x0043 }
        L_0x0050:
            if (r6 == 0) goto L_0x0057
            r6.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            if (r0 == 0) goto L_0x005f
            r0.flush()     // Catch:{ IOException -> 0x006b, all -> 0x005d }
            goto L_0x005f
        L_0x005d:
            r5 = move-exception
            goto L_0x0065
        L_0x005f:
            if (r2 == 0) goto L_0x0071
            r2.sync()     // Catch:{ IOException -> 0x006b, all -> 0x005d }
            goto L_0x0071
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r5
        L_0x006b:
            if (r0 == 0) goto L_0x0074
        L_0x006d:
            r0.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0074
        L_0x0071:
            if (r0 == 0) goto L_0x0074
            goto L_0x006d
        L_0x0074:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19126l.m46615a(com.ss.android.download.l$a, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    private static long m46609a(URLConnection uRLConnection, String str, long j) {
        try {
            return Long.parseLong(uRLConnection.getHeaderField(str));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private int m46608a(C19127a aVar, byte[] bArr, InputStream inputStream) throws C19135t {
        try {
            return inputStream.read(bArr);
        } catch (IOException e) {
            if ("unexpected end of stream".equals(e.getMessage())) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_bytes", Long.valueOf(aVar.f52709g));
            C19117g.m46591a(this.f52697a).mo39052a(this.f52698b.mo39029c(), contentValues, (String) null, (String[]) null);
            if (m46619b(aVar)) {
                StringBuilder sb = new StringBuilder("Failed reading response: ");
                sb.append(e);
                sb.append("; unable to resume");
                throw new C19135t(489, sb.toString(), e);
            }
            StringBuilder sb2 = new StringBuilder("Failed reading response: ");
            sb2.append(e);
            throw new C19135t(495, sb2.toString(), e);
        }
    }

    /* JADX INFO: used method not loaded: com.ss.android.download.t.<init>(int, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        throw new com.p683ss.android.download.C19135t(490, "download canceled");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46614a(com.p683ss.android.download.C19126l.C19127a r19, java.io.InputStream r20, java.io.OutputStream r21) throws com.p683ss.android.download.C19135t {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
            r3 = r20
        L_0x000a:
            int r4 = r1.m46608a(r0, r2, r3)
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L_0x0072
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "current_bytes"
            long r4 = r0.f52709g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            long r3 = r0.f52718p
            r8 = -1
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0036
            java.lang.String r3 = "total_bytes"
            long r4 = r0.f52709g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
        L_0x0036:
            android.content.Context r3 = r1.f52697a
            com.ss.android.download.g r3 = com.p683ss.android.download.C19117g.m46591a(r3)
            com.ss.android.download.c r4 = r1.f52698b
            android.net.Uri r4 = r4.mo39029c()
            r3.mo39052a(r4, r2, r7, r7)
            long r2 = r0.f52718p
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            long r2 = r0.f52709g
            long r4 = r0.f52718p
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r6 == 0) goto L_0x0071
            boolean r0 = r18.m46619b(r19)
            if (r0 == 0) goto L_0x0067
            com.ss.android.download.t r0 = new com.ss.android.download.t
            r2 = 489(0x1e9, float:6.85E-43)
            java.lang.String r3 = "mismatched content length; unable to resume"
            r0.<init>(r2, r3)
            throw r0
        L_0x0067:
            com.ss.android.download.t r0 = new com.ss.android.download.t
            r2 = 495(0x1ef, float:6.94E-43)
            java.lang.String r3 = "closed socket before end of file"
            r0.<init>(r2, r3)
            throw r0
        L_0x0071:
            return
        L_0x0072:
            r0.f52706d = r6
            r5 = r21
            r1.m46616a(r0, r2, r4, r5)
            long r8 = r0.f52709g
            long r10 = (long) r4
            long r8 = r8 + r10
            r0.f52709g = r8
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r10 = r0.f52716n
            long r10 = r8 - r10
            r12 = 500(0x1f4, double:2.47E-321)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c5
            long r12 = r0.f52709g
            long r14 = r0.f52717o
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            long r12 = r12 / r10
            long r10 = r0.f52715m
            r14 = 0
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x00a2
            r0.f52715m = r12
            goto L_0x00ae
        L_0x00a2:
            long r10 = r0.f52715m
            r16 = 3
            long r10 = r10 * r16
            long r10 = r10 + r12
            r12 = 4
            long r10 = r10 / r12
            r0.f52715m = r10
        L_0x00ae:
            long r10 = r0.f52716n
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00bf
            com.ss.android.download.e r4 = r1.f52701e
            com.ss.android.download.c r10 = r1.f52698b
            long r10 = r10.f52606a
            long r12 = r0.f52715m
            r4.mo39042a(r10, r12)
        L_0x00bf:
            r0.f52716n = r8
            long r10 = r0.f52709g
            r0.f52717o = r10
        L_0x00c5:
            long r10 = r0.f52709g
            long r12 = r0.f52712j
            long r10 = r10 - r12
            r12 = 4096(0x1000, double:2.0237E-320)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ff
            long r10 = r0.f52713k
            long r10 = r8 - r10
            r12 = 1500(0x5dc, double:7.41E-321)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ff
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r10 = "current_bytes"
            long r11 = r0.f52709g
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r4.put(r10, r11)
            android.content.Context r10 = r1.f52697a
            com.ss.android.download.g r10 = com.p683ss.android.download.C19117g.m46591a(r10)
            com.ss.android.download.c r11 = r1.f52698b
            android.net.Uri r11 = r11.mo39029c()
            r10.mo39052a(r11, r4, r7, r7)
            long r10 = r0.f52709g
            r0.f52712j = r10
            r0.f52713k = r8
        L_0x00ff:
            com.ss.android.download.c r4 = r1.f52698b
            monitor-enter(r4)
            com.ss.android.download.c r7 = r1.f52698b     // Catch:{ all -> 0x0132 }
            int r7 = r7.f52614i     // Catch:{ all -> 0x0132 }
            if (r7 == r6) goto L_0x0128
            com.ss.android.download.c r6 = r1.f52698b     // Catch:{ all -> 0x0132 }
            int r6 = r6.f52615j     // Catch:{ all -> 0x0132 }
            r7 = 490(0x1ea, float:6.87E-43)
            if (r6 == r7) goto L_0x0120
            com.ss.android.download.c r6 = r1.f52698b     // Catch:{ all -> 0x0132 }
            boolean r6 = r6.f52628w     // Catch:{ all -> 0x0132 }
            if (r6 != 0) goto L_0x0120
            monitor-exit(r4)     // Catch:{ all -> 0x0132 }
            boolean r4 = r1.f52702f
            if (r4 == 0) goto L_0x000a
            r18.m46610a()
            goto L_0x000a
        L_0x0120:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "download canceled"
            r0.<init>(r7, r2)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0128:
            com.ss.android.download.t r0 = new com.ss.android.download.t     // Catch:{ all -> 0x0132 }
            r2 = 193(0xc1, float:2.7E-43)
            java.lang.String r3 = "download paused by owner"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0132 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19126l.m46614a(com.ss.android.download.l$a, java.io.InputStream, java.io.OutputStream):void");
    }

    /* renamed from: b */
    private void m46617b(C19127a aVar, int i, String str, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        contentValues.put("_data", aVar.f52703a);
        contentValues.put("mimetype", aVar.f52704b);
        contentValues.put("lastmod", Long.valueOf(this.f52699c.mo39070a()));
        contentValues.put("numfailed", Integer.valueOf(i2));
        contentValues.put("method", Integer.valueOf(aVar.f52705c));
        if (!TextUtils.equals(this.f52698b.f52607b, aVar.f52707e)) {
            contentValues.put("uri", aVar.f52707e);
        }
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("errorMsg", str);
        }
        C19117g.m46591a(this.f52697a).mo39052a(this.f52698b.mo39029c(), contentValues, (String) null, (String[]) null);
    }

    /* renamed from: a */
    private void m46613a(C19127a aVar, int i, String str, int i2) {
        m46617b(aVar, i, str, i2);
        if (C19097a.m46515c(i)) {
            this.f52698b.mo39024a();
        }
    }

    public C19126l(Context context, C19138v vVar, C19101c cVar, C19136u uVar, C19109e eVar) {
        this.f52697a = context;
        this.f52699c = vVar;
        this.f52698b = cVar;
        this.f52700d = uVar;
        this.f52701e = eVar;
    }
}
