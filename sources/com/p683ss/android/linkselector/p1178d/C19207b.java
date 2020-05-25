package com.p683ss.android.linkselector.p1178d;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.linkselector.p1176b.C19202b;
import com.p683ss.android.linkselector.p1177c.C19204b;
import com.p683ss.android.linkselector.p1177c.C19205c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.linkselector.d.b */
public final class C19207b {

    /* renamed from: e */
    public static volatile boolean f52933e;

    /* renamed from: a */
    public C19208a f52934a;

    /* renamed from: b */
    public Handler f52935b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public boolean f52936c;

    /* renamed from: d */
    public boolean f52937d;

    /* renamed from: f */
    private long f52938f;

    /* renamed from: com.ss.android.linkselector.d.b$a */
    public interface C19208a {
        /* renamed from: a */
        void mo39185a(List<C19202b> list);
    }

    /* renamed from: com.ss.android.linkselector.d.b$b */
    class C19209b implements Runnable {

        /* renamed from: a */
        List<C19202b> f52939a = new ArrayList();

        /* renamed from: a */
        private void m46824a() {
            Collections.sort(this.f52939a, new Comparator<C19202b>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return (int) (((C19202b) obj).mo39196h() - ((C19202b) obj2).mo39196h());
                }
            });
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f52939a);
            int i = 0;
            while (i < this.f52939a.size()) {
                C19202b bVar = (C19202b) this.f52939a.get(i);
                StringBuilder sb = new StringBuilder("weight sort = ");
                sb.append(bVar.mo39196h());
                sb.append(" ");
                sb.append(bVar.f52919e);
                sb.append("://");
                sb.append(bVar.f52918d);
                i++;
                for (int i2 = i; i2 < this.f52939a.size(); i2++) {
                    C19202b bVar2 = (C19202b) this.f52939a.get(i2);
                    if (bVar.f52918d.equals(bVar2.f52918d)) {
                        arrayList.remove(bVar2);
                    }
                }
            }
            this.f52939a.clear();
            this.f52939a.addAll(arrayList);
            if (this.f52939a.size() > 0) {
                C19207b.this.f52936c = true;
            } else {
                C19207b.this.f52936c = false;
            }
            C19207b.this.f52937d = false;
            StringBuilder sb2 = new StringBuilder("speed distinct = ");
            sb2.append(this.f52939a.size());
            sb2.append(" thread = ");
            sb2.append(Thread.currentThread());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
            r19 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
            r12 = r0;
            r11 = null;
            r19 = null;
            r25 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x013f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
            r12 = r7;
            r25 = r9;
            r2 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0179, code lost:
            if (r25 == null) goto L_0x01d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            r19.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d3, code lost:
            if (r25 == null) goto L_0x01d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            r25.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01e5 A[SYNTHETIC, Splitter:B:106:0x01e5] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01ec A[SYNTHETIC, Splitter:B:110:0x01ec] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x007d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0073] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0188 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:42:0x00d1] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01ce A[SYNTHETIC, Splitter:B:92:0x01ce] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r26 = this;
                r1 = r26
                boolean r0 = com.p683ss.android.linkselector.p1178d.C19207b.f52933e
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                r0 = 1
                com.p683ss.android.linkselector.p1178d.C19207b.f52933e = r0
                r3 = 0
            L_0x000b:
                java.util.List<com.ss.android.linkselector.b.b> r0 = r1.f52939a
                int r0 = r0.size()
                if (r3 >= r0) goto L_0x01f4
                java.util.List<com.ss.android.linkselector.b.b> r0 = r1.f52939a
                java.lang.Object r0 = r0.get(r3)
                r14 = r0
                com.ss.android.linkselector.b.b r14 = (com.p683ss.android.linkselector.p1176b.C19202b) r14
                if (r14 == 0) goto L_0x01f0
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "https://"
                r15.append(r0)
                java.lang.String r0 = r14.f52918d
                r15.append(r0)
                java.lang.String r0 = "/ies/speed/"
                r15.append(r0)
                long r4 = java.lang.System.currentTimeMillis()
                r15.append(r4)
                long r16 = java.lang.System.currentTimeMillis()
                r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
                r11 = 200(0xc8, float:2.8E-43)
                r7 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x01a7, all -> 0x01a1 }
                java.lang.String r8 = r15.toString()     // Catch:{ Exception -> 0x01a7, all -> 0x01a1 }
                r0.<init>(r8)     // Catch:{ Exception -> 0x01a7, all -> 0x01a1 }
                java.net.URLConnection r8 = r0.openConnection()     // Catch:{ Exception -> 0x01a7, all -> 0x01a1 }
                r9 = r8
                java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x01a7, all -> 0x01a1 }
                com.ss.android.linkselector.LinkSelector r8 = com.p683ss.android.linkselector.LinkSelector.m46790a()     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                int r8 = r8.f52903d     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                r9.setConnectTimeout(r8)     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                com.ss.android.linkselector.LinkSelector r8 = com.p683ss.android.linkselector.LinkSelector.m46790a()     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                int r8 = r8.f52903d     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                r9.setReadTimeout(r8)     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                java.lang.String r8 = "X-SS-No-Cookie"
                java.lang.String r10 = "true"
                r18 = r9
                java.net.URLConnection r18 = (java.net.URLConnection) r18     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                boolean r19 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r18)     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                if (r19 == 0) goto L_0x008d
                java.net.URL r4 = r18.getURL()     // Catch:{ Exception -> 0x0084, all -> 0x007d }
                java.lang.String r5 = ""
                com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r4, r8, r10, r5)     // Catch:{ Exception -> 0x0084, all -> 0x007d }
                goto L_0x008d
            L_0x007d:
                r0 = move-exception
                r19 = r7
            L_0x0080:
                r25 = r9
                goto L_0x01e3
            L_0x0084:
                r0 = move-exception
                r12 = r0
                r11 = r7
                r19 = r11
                r25 = r9
                goto L_0x01ae
            L_0x008d:
                r9.setRequestProperty(r8, r10)     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                int r10 = r9.getResponseCode()     // Catch:{ Exception -> 0x0199, all -> 0x0193 }
                if (r10 != r11) goto L_0x00cd
                r4 = r9
                java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch:{ Exception -> 0x00c3, all -> 0x007d }
                boolean r5 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x007d }
                if (r5 == 0) goto L_0x00aa
                java.net.URL r5 = r4.getURL()     // Catch:{ Exception -> 0x00c3, all -> 0x007d }
                java.lang.String r4 = r4.getContentType()     // Catch:{ Exception -> 0x00c3, all -> 0x007d }
                com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r5, r7, r7, r4)     // Catch:{ Exception -> 0x00c3, all -> 0x007d }
            L_0x00aa:
                java.io.InputStream r4 = r9.getInputStream()     // Catch:{ Exception -> 0x00c3, all -> 0x007d }
                java.lang.String r5 = "X-TT-LOGID"
                java.lang.String r5 = r9.getHeaderField(r5)     // Catch:{ Exception -> 0x00bd, all -> 0x00b9 }
                r19 = r4
                r18 = r5
                goto L_0x00d1
            L_0x00b9:
                r0 = move-exception
                r19 = r4
                goto L_0x0080
            L_0x00bd:
                r0 = move-exception
                r12 = r0
                r19 = r4
                r11 = r7
                goto L_0x00c8
            L_0x00c3:
                r0 = move-exception
                r12 = r0
                r11 = r7
                r19 = r11
            L_0x00c8:
                r25 = r9
                r2 = r10
                goto L_0x01af
            L_0x00cd:
                r18 = r7
                r19 = r18
            L_0x00d1:
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x018b, all -> 0x0188 }
                r6 = 0
                long r7 = r4 - r16
                if (r10 != r11) goto L_0x0149
                r14.f52921g = r7     // Catch:{ Exception -> 0x013f, all -> 0x0188 }
                r14.mo39193f()     // Catch:{ Exception -> 0x013f, all -> 0x0188 }
                java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x013f, all -> 0x0188 }
                r0 = 0
                r20 = 1
                r5 = r14
                r6 = r10
                r23 = r7
                r25 = r9
                r2 = r10
                r9 = r16
                r11 = r18
                r12 = r0
                r13 = r20
                m46825a(r4, r5, r6, r7, r9, r11, r12, r13)     // Catch:{ Exception -> 0x013a }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
                java.lang.String r4 = "sort speed time = "
                r0.<init>(r4)     // Catch:{ Exception -> 0x013a }
                r12 = r23
                r0.append(r12)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = " "
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = r14.f52919e     // Catch:{ Exception -> 0x0138 }
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = "://"
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = r14.f52918d     // Catch:{ Exception -> 0x0138 }
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = "sort weight time = "
                r0.<init>(r4)     // Catch:{ Exception -> 0x0138 }
                long r4 = r14.f52920f     // Catch:{ Exception -> 0x0138 }
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = " "
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = r14.f52919e     // Catch:{ Exception -> 0x0138 }
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = "://"
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = r14.f52918d     // Catch:{ Exception -> 0x0138 }
                r0.append(r4)     // Catch:{ Exception -> 0x0138 }
                goto L_0x0172
            L_0x0138:
                r0 = move-exception
                goto L_0x013d
            L_0x013a:
                r0 = move-exception
                r12 = r23
            L_0x013d:
                r7 = r12
                goto L_0x0144
            L_0x013f:
                r0 = move-exception
                r12 = r7
                r25 = r9
                r2 = r10
            L_0x0144:
                r11 = r18
                r12 = r0
                goto L_0x01b1
            L_0x0149:
                r12 = r7
                r25 = r9
                r2 = r10
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f }
                java.lang.String r5 = "sort speed error code = "
                r4.<init>(r5)     // Catch:{ Exception -> 0x017f }
                r4.append(r2)     // Catch:{ Exception -> 0x017f }
                r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
                r14.f52921g = r9     // Catch:{ Exception -> 0x017f }
                java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x017f }
                r0 = 0
                r20 = 0
                r5 = r14
                r6 = r2
                r7 = r12
                r9 = r16
                r11 = r18
                r21 = r12
                r12 = r0
                r13 = r20
                m46825a(r4, r5, r6, r7, r9, r11, r12, r13)     // Catch:{ Exception -> 0x017d }
            L_0x0172:
                if (r19 == 0) goto L_0x0179
                r19.close()     // Catch:{ IOException -> 0x0178 }
                goto L_0x0179
            L_0x0178:
            L_0x0179:
                if (r25 == 0) goto L_0x01d8
                goto L_0x01d5
            L_0x017d:
                r0 = move-exception
                goto L_0x0182
            L_0x017f:
                r0 = move-exception
                r21 = r12
            L_0x0182:
                r12 = r0
                r11 = r18
                r7 = r21
                goto L_0x01b1
            L_0x0188:
                r0 = move-exception
                goto L_0x0080
            L_0x018b:
                r0 = move-exception
                r25 = r9
                r2 = r10
                r12 = r0
                r11 = r18
                goto L_0x01af
            L_0x0193:
                r0 = move-exception
                r25 = r9
                r19 = r7
                goto L_0x01e3
            L_0x0199:
                r0 = move-exception
                r25 = r9
                r12 = r0
                r11 = r7
                r19 = r11
                goto L_0x01ae
            L_0x01a1:
                r0 = move-exception
                r19 = r7
                r25 = r19
                goto L_0x01e3
            L_0x01a7:
                r0 = move-exception
                r12 = r0
                r11 = r7
                r19 = r11
                r25 = r19
            L_0x01ae:
                r2 = -1
            L_0x01af:
                r7 = -1
            L_0x01b1:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e2 }
                java.lang.String r4 = "sort speed error = "
                r0.<init>(r4)     // Catch:{ all -> 0x01e2 }
                r0.append(r12)     // Catch:{ all -> 0x01e2 }
                r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
                r14.f52921g = r4     // Catch:{ all -> 0x01e2 }
                java.lang.String r4 = r15.toString()     // Catch:{ all -> 0x01e2 }
                r13 = 0
                r5 = r14
                r6 = r2
                r9 = r16
                m46825a(r4, r5, r6, r7, r9, r11, r12, r13)     // Catch:{ all -> 0x01e2 }
                if (r19 == 0) goto L_0x01d3
                r19.close()     // Catch:{ IOException -> 0x01d2 }
                goto L_0x01d3
            L_0x01d2:
            L_0x01d3:
                if (r25 == 0) goto L_0x01d8
            L_0x01d5:
                r25.disconnect()     // Catch:{ Exception -> 0x01d8 }
            L_0x01d8:
                r4 = 200(0xc8, float:2.8E-43)
                if (r2 == r4) goto L_0x01f0
                r4 = 3000(0xbb8, double:1.482E-320)
                java.lang.Thread.sleep(r4)     // Catch:{ Exception -> 0x01f0 }
                goto L_0x01f0
            L_0x01e2:
                r0 = move-exception
            L_0x01e3:
                if (r19 == 0) goto L_0x01ea
                r19.close()     // Catch:{ IOException -> 0x01e9 }
                goto L_0x01ea
            L_0x01e9:
            L_0x01ea:
                if (r25 == 0) goto L_0x01ef
                r25.disconnect()     // Catch:{ Exception -> 0x01ef }
            L_0x01ef:
                throw r0
            L_0x01f0:
                int r3 = r3 + 1
                goto L_0x000b
            L_0x01f4:
                r26.m46824a()
                com.ss.android.linkselector.d.b r0 = com.p683ss.android.linkselector.p1178d.C19207b.this
                android.os.Handler r0 = r0.f52935b
                com.ss.android.linkselector.d.b$b$2 r2 = new com.ss.android.linkselector.d.b$b$2
                r2.<init>()
                r0.post(r2)
                r2 = 0
                com.p683ss.android.linkselector.p1178d.C19207b.f52933e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.linkselector.p1178d.C19207b.C19209b.run():void");
        }

        public C19209b(List<C19202b> list) {
            this.f52939a.clear();
            this.f52939a.addAll(list);
        }

        /* renamed from: a */
        private static void m46825a(String str, C19202b bVar, int i, long j, long j2, String str2, Exception exc, boolean z) {
            C19205c cVar = new C19205c(str, bVar, i, j, j2, str2, exc, z);
            C19204b.m46821a(0, cVar);
        }
    }

    public C19207b(C19208a aVar) {
        this.f52934a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39199a(java.util.List<com.p683ss.android.linkselector.p1176b.C19202b> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.p683ss.android.linkselector.LinkSelector.m46793c()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r2 = r5.f52938f     // Catch:{ all -> 0x0085 }
            r4 = 0
            long r0 = r0 - r2
            com.ss.android.linkselector.LinkSelector r2 = com.p683ss.android.linkselector.LinkSelector.m46790a()     // Catch:{ all -> 0x0085 }
            long r2 = r2.f52902c     // Catch:{ all -> 0x0085 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x001f
            boolean r0 = r5.f52936c     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0023
        L_0x001f:
            boolean r0 = r5.f52937d     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x004f
        L_0x0023:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "no need opt sort ,last duration is "
            r6.<init>(r0)     // Catch:{ all -> 0x0085 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r2 = r5.f52938f     // Catch:{ all -> 0x0085 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 / r2
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = " min, frequency is "
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            com.ss.android.linkselector.LinkSelector r0 = com.p683ss.android.linkselector.LinkSelector.m46790a()     // Catch:{ all -> 0x0085 }
            long r0 = r0.f52902c     // Catch:{ all -> 0x0085 }
            long r0 = r0 / r2
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = " min"
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return
        L_0x004f:
            r0 = 1
            r5.f52937d = r0     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0077
            int r0 = r6.size()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x005b
            goto L_0x0077
        L_0x005b:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            r5.f52938f = r0     // Catch:{ all -> 0x0085 }
            java.util.concurrent.ExecutorService r0 = com.p683ss.android.linkselector.p1178d.C19206a.f52932a     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x006b
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ all -> 0x0085 }
            com.p683ss.android.linkselector.p1178d.C19206a.f52932a = r0     // Catch:{ all -> 0x0085 }
        L_0x006b:
            java.util.concurrent.ExecutorService r0 = com.p683ss.android.linkselector.p1178d.C19206a.f52932a     // Catch:{ all -> 0x0085 }
            com.ss.android.linkselector.d.b$b r1 = new com.ss.android.linkselector.d.b$b     // Catch:{ all -> 0x0085 }
            r1.<init>(r6)     // Catch:{ all -> 0x0085 }
            r0.execute(r1)     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return
        L_0x0077:
            r0 = 0
            r5.f52937d = r0     // Catch:{ all -> 0x0085 }
            com.ss.android.linkselector.d.b$a r0 = r5.f52934a     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0083
            com.ss.android.linkselector.d.b$a r0 = r5.f52934a     // Catch:{ all -> 0x0085 }
            r0.mo39185a(r6)     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r5)
            return
        L_0x0085:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.linkselector.p1178d.C19207b.mo39199a(java.util.List):void");
    }
}
