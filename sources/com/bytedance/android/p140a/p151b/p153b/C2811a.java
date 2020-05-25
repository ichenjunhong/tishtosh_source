package com.bytedance.android.p140a.p151b.p153b;

import com.bytedance.android.p140a.p141a.p146e.C2788b;
import com.bytedance.android.p140a.p151b.C2806a;
import com.bytedance.android.p140a.p151b.p153b.C2820c.C2821a;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2813a;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2815b;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2815b.C2816a;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2817c;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.b.a */
public final class C2811a {

    /* renamed from: a */
    private final C2806a f8399a;

    /* renamed from: b */
    private final C2817c f8400b;

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00de A[SYNTHETIC, Splitter:B:52:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb A[SYNTHETIC, Splitter:B:63:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0115 A[SYNTHETIC, Splitter:B:74:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012a A[SYNTHETIC, Splitter:B:82:0x012a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x00f2=Splitter:B:60:0x00f2, B:49:0x00d5=Splitter:B:49:0x00d5, B:71:0x010f=Splitter:B:71:0x010f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.android.p140a.p151b.p153b.C2822d m8000a(com.bytedance.android.p140a.p151b.p153b.C2820c r12) {
        /*
            if (r12 != 0) goto L_0x000d
            java.lang.String r12 = "request is null"
            java.lang.IllegalArgumentException r12 = com.bytedance.android.p140a.p141a.p150i.C2800b.m7961a(r12)
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p140a.p151b.p153b.C2822d.m8022a(r12)
            return r12
        L_0x000d:
            java.lang.String r0 = r12.f8407b
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r12.f8409d
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0022
            java.lang.String r12 = "empty url"
            java.lang.IllegalArgumentException r12 = com.bytedance.android.p140a.p141a.p150i.C2800b.m7961a(r12)
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p140a.p151b.p153b.C2822d.m8022a(r12)
            return r12
        L_0x0022:
            r2 = 0
            r3 = 19
            r4 = 1
            r5 = 0
            java.net.URL r6 = new java.net.URL     // Catch:{ SecurityException -> 0x010e, IOException -> 0x00f1, Throwable -> 0x00d4 }
            r6.<init>(r0)     // Catch:{ SecurityException -> 0x010e, IOException -> 0x00f1, Throwable -> 0x00d4 }
            java.net.URLConnection r0 = r6.openConnection()     // Catch:{ SecurityException -> 0x010e, IOException -> 0x00f1, Throwable -> 0x00d4 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ SecurityException -> 0x010e, IOException -> 0x00f1, Throwable -> 0x00d4 }
            r0.setUseCaches(r5)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.lang.String r2 = r12.f8408c     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            r0.setRequestMethod(r2)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r1 == 0) goto L_0x0097
            java.util.Set r2 = r1.keySet()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
        L_0x0044:
            boolean r6 = r2.hasNext()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r6 == 0) goto L_0x0097
            java.lang.Object r6 = r2.next()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.lang.Object r7 = r1.get(r6)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r7 == 0) goto L_0x0044
            int r8 = r7.size()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r8 == 0) goto L_0x0044
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            r8.<init>()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
        L_0x0067:
            boolean r9 = r7.hasNext()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r9 == 0) goto L_0x0077
            java.lang.Object r9 = r7.next()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            r8.append(r9)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            goto L_0x0067
        L_0x0077:
            java.lang.String r7 = r8.toString()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r8 != 0) goto L_0x0044
            r8 = r0
            java.net.URLConnection r8 = (java.net.URLConnection) r8     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            boolean r9 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r8)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r9 == 0) goto L_0x0093
            java.net.URL r8 = r8.getURL()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.lang.String r9 = ""
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r8, r6, r7, r9)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
        L_0x0093:
            r0.setRequestProperty(r6, r7)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            goto L_0x0044
        L_0x0097:
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            r0.connect()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            int r7 = r0.getResponseCode()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.lang.String r8 = r0.getResponseMessage()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            java.util.Map r9 = r0.getHeaderFields()     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            com.bytedance.android.a.b.b.d r1 = new com.bytedance.android.a.b.b.d     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            r11 = 0
            r6 = r1
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ SecurityException -> 0x00ce, IOException -> 0x00cb, Throwable -> 0x00c8, all -> 0x00c6 }
            if (r0 == 0) goto L_0x00c5
            java.io.Closeable[] r12 = new java.io.Closeable[r4]     // Catch:{ Throwable -> 0x00be }
            java.io.InputStream r2 = com.bytedance.android.p140a.p151b.p153b.C2819b.m8017a(r0)     // Catch:{ Throwable -> 0x00be }
            r12[r5] = r2     // Catch:{ Throwable -> 0x00be }
            com.bytedance.android.p140a.p141a.p150i.C2805g.m7975a(r12)     // Catch:{ Throwable -> 0x00be }
        L_0x00be:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r3) goto L_0x00c5
            r0.disconnect()
        L_0x00c5:
            return r1
        L_0x00c6:
            r12 = move-exception
            goto L_0x0128
        L_0x00c8:
            r1 = move-exception
            r2 = r0
            goto L_0x00d5
        L_0x00cb:
            r1 = move-exception
            r2 = r0
            goto L_0x00f2
        L_0x00ce:
            r1 = move-exception
            r2 = r0
            goto L_0x010f
        L_0x00d1:
            r12 = move-exception
            r0 = r2
            goto L_0x0128
        L_0x00d4:
            r1 = move-exception
        L_0x00d5:
            r1.getMessage()     // Catch:{ all -> 0x00d1 }
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p140a.p151b.p153b.C2822d.m8023a(r1, r12)     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x00f0
            java.io.Closeable[] r0 = new java.io.Closeable[r4]     // Catch:{ Throwable -> 0x00e9 }
            java.io.InputStream r1 = com.bytedance.android.p140a.p151b.p153b.C2819b.m8017a(r2)     // Catch:{ Throwable -> 0x00e9 }
            r0[r5] = r1     // Catch:{ Throwable -> 0x00e9 }
            com.bytedance.android.p140a.p141a.p150i.C2805g.m7975a(r0)     // Catch:{ Throwable -> 0x00e9 }
        L_0x00e9:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x00f0
            r2.disconnect()
        L_0x00f0:
            return r12
        L_0x00f1:
            r1 = move-exception
        L_0x00f2:
            r1.getMessage()     // Catch:{ all -> 0x00d1 }
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p140a.p151b.p153b.C2822d.m8023a(r1, r12)     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x010d
            java.io.Closeable[] r0 = new java.io.Closeable[r4]     // Catch:{ Throwable -> 0x0106 }
            java.io.InputStream r1 = com.bytedance.android.p140a.p151b.p153b.C2819b.m8017a(r2)     // Catch:{ Throwable -> 0x0106 }
            r0[r5] = r1     // Catch:{ Throwable -> 0x0106 }
            com.bytedance.android.p140a.p141a.p150i.C2805g.m7975a(r0)     // Catch:{ Throwable -> 0x0106 }
        L_0x0106:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x010d
            r2.disconnect()
        L_0x010d:
            return r12
        L_0x010e:
            r1 = move-exception
        L_0x010f:
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p140a.p151b.p153b.C2822d.m8023a(r1, r12)     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x0127
            java.io.Closeable[] r0 = new java.io.Closeable[r4]     // Catch:{ Throwable -> 0x0120 }
            java.io.InputStream r1 = com.bytedance.android.p140a.p151b.p153b.C2819b.m8017a(r2)     // Catch:{ Throwable -> 0x0120 }
            r0[r5] = r1     // Catch:{ Throwable -> 0x0120 }
            com.bytedance.android.p140a.p141a.p150i.C2805g.m7975a(r0)     // Catch:{ Throwable -> 0x0120 }
        L_0x0120:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x0127
            r2.disconnect()
        L_0x0127:
            return r12
        L_0x0128:
            if (r0 == 0) goto L_0x013c
            java.io.Closeable[] r1 = new java.io.Closeable[r4]     // Catch:{ Throwable -> 0x0135 }
            java.io.InputStream r2 = com.bytedance.android.p140a.p151b.p153b.C2819b.m8017a(r0)     // Catch:{ Throwable -> 0x0135 }
            r1[r5] = r2     // Catch:{ Throwable -> 0x0135 }
            com.bytedance.android.p140a.p141a.p150i.C2805g.m7975a(r1)     // Catch:{ Throwable -> 0x0135 }
        L_0x0135:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 >= r3) goto L_0x013c
            r0.disconnect()
        L_0x013c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p140a.p151b.p153b.C2811a.m8000a(com.bytedance.android.a.b.b.c):com.bytedance.android.a.b.b.d");
    }

    /* renamed from: a */
    public final C2822d mo7409a(String str, C2788b bVar) {
        return this.f8400b.mo7414a(new C2821a().mo7416a(str).mo7418b("GET").mo7415a(bVar).mo7417a());
    }

    public C2811a(C2806a aVar, List<C2815b> list) {
        this.f8399a = aVar;
        this.f8400b = new C2817c(this.f8399a, new C2813a(aVar) {
            /* renamed from: a */
            public final C2822d mo7410a(C2816a aVar) {
                return C2811a.m8000a(aVar.mo7413a());
            }
        });
        if (list != null) {
            C2817c cVar = this.f8400b;
            cVar.f8405a.addAll(cVar.f8405a.size() - 1, list);
        }
    }
}
