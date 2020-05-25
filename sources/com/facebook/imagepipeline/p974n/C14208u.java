package com.facebook.imagepipeline.p974n;

import android.net.Uri;
import com.C2240a;
import com.facebook.common.p927k.C13731f;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14123ai.C14124a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.facebook.imagepipeline.n.u */
public final class C14208u extends C14176c<C14207t> {

    /* renamed from: a */
    private int f37091a;

    /* renamed from: b */
    private final ExecutorService f37092b;

    /* renamed from: a */
    private static boolean m29141a(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: b */
    private static boolean m29142b(int i) {
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308:
                return true;
            default:
                return false;
        }
    }

    public C14208u() {
        this(C14211v.m29145a(3));
    }

    private C14208u(ExecutorService executorService) {
        this.f37092b = executorService;
    }

    public C14208u(int i) {
        this(C14211v.m29145a(3));
        this.f37091a = i;
    }

    /* renamed from: a */
    private static HttpURLConnection m29140a(Uri uri) throws IOException {
        return (HttpURLConnection) C13731f.m27777a(uri).openConnection();
    }

    public final C14207t createFetchState(C14188k<C14044e> kVar, C14140an anVar) {
        return new C14207t(kVar, anVar);
    }

    /* renamed from: a */
    private static String m29139a(String str, Object... objArr) {
        return C2240a.m6773a(Locale.getDefault(), str, objArr);
    }

    public final void fetch(final C14207t tVar, final C14124a aVar) {
        final Future submit = this.f37092b.submit(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0052 A[SYNTHETIC, Splitter:B:33:0x0052] */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x0059  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0061 A[SYNTHETIC, Splitter:B:42:0x0061] */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x0068  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    com.facebook.imagepipeline.n.u r0 = com.facebook.imagepipeline.p974n.C14208u.this
                    com.facebook.imagepipeline.n.t r1 = r3
                    com.facebook.imagepipeline.n.ai$a r2 = r4
                    r3 = 0
                    android.net.Uri r1 = r1.mo26420c()     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
                    r4 = 5
                    java.net.HttpURLConnection r0 = r0.mo26422a(r1, r4)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
                    if (r0 == 0) goto L_0x003a
                    r1 = r0
                    java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ IOException -> 0x0038 }
                    boolean r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r1)     // Catch:{ IOException -> 0x0038 }
                    if (r4 == 0) goto L_0x0026
                    java.net.URL r4 = r1.getURL()     // Catch:{ IOException -> 0x0038 }
                    java.lang.String r1 = r1.getContentType()     // Catch:{ IOException -> 0x0038 }
                    com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r4, r3, r3, r1)     // Catch:{ IOException -> 0x0038 }
                L_0x0026:
                    java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0038 }
                    r3 = -1
                    r2.mo26372a(r1, r3)     // Catch:{ IOException -> 0x0033, all -> 0x002f }
                    goto L_0x003b
                L_0x002f:
                    r2 = move-exception
                    r3 = r1
                    r1 = r2
                    goto L_0x005f
                L_0x0033:
                    r3 = move-exception
                    r5 = r3
                    r3 = r1
                    r1 = r5
                    goto L_0x004d
                L_0x0038:
                    r1 = move-exception
                    goto L_0x004d
                L_0x003a:
                    r1 = r3
                L_0x003b:
                    if (r1 == 0) goto L_0x0042
                    r1.close()     // Catch:{ IOException -> 0x0041 }
                    goto L_0x0042
                L_0x0041:
                L_0x0042:
                    if (r0 == 0) goto L_0x005d
                    r0.disconnect()
                    return
                L_0x0048:
                    r1 = move-exception
                    r0 = r3
                    goto L_0x005f
                L_0x004b:
                    r1 = move-exception
                    r0 = r3
                L_0x004d:
                    r2.mo26373a(r1)     // Catch:{ all -> 0x005e }
                    if (r3 == 0) goto L_0x0057
                    r3.close()     // Catch:{ IOException -> 0x0056 }
                    goto L_0x0057
                L_0x0056:
                L_0x0057:
                    if (r0 == 0) goto L_0x005d
                    r0.disconnect()
                    return
                L_0x005d:
                    return
                L_0x005e:
                    r1 = move-exception
                L_0x005f:
                    if (r3 == 0) goto L_0x0066
                    r3.close()     // Catch:{ IOException -> 0x0065 }
                    goto L_0x0066
                L_0x0065:
                L_0x0066:
                    if (r0 == 0) goto L_0x006b
                    r0.disconnect()
                L_0x006b:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14208u.C142091.run():void");
            }
        });
        tVar.f37087e.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                if (submit.cancel(false)) {
                    aVar.mo26371a();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection mo26422a(android.net.Uri r8, int r9) throws java.io.IOException {
        /*
            r7 = this;
        L_0x0000:
            java.net.HttpURLConnection r0 = m29140a(r8)
            int r1 = r7.f37091a
            r0.setConnectTimeout(r1)
            int r1 = r0.getResponseCode()
            boolean r2 = m29141a(r1)
            if (r2 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r2 = m29142b(r1)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x006f
            java.lang.String r2 = "Location"
            java.lang.String r2 = r0.getHeaderField(r2)
            r0.disconnect()
            if (r2 != 0) goto L_0x002a
            r0 = 0
            goto L_0x002e
        L_0x002a:
            android.net.Uri r0 = android.net.Uri.parse(r2)
        L_0x002e:
            java.lang.String r2 = r8.getScheme()
            if (r9 <= 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            java.lang.String r6 = r0.getScheme()
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0044
            int r9 = r9 + -1
            r8 = r0
            goto L_0x0000
        L_0x0044:
            if (r9 != 0) goto L_0x0055
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.lang.String r8 = "URL %s follows too many redirects"
            java.lang.String r8 = m29139a(r8, r9)
            goto L_0x0069
        L_0x0055:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r9[r5] = r8
            java.lang.String r8 = "URL %s returned %d without a valid redirect"
            java.lang.String r8 = m29139a(r8, r9)
        L_0x0069:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r8)
            throw r9
        L_0x006f:
            r0.disconnect()
            java.io.IOException r9 = new java.io.IOException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r0[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0[r5] = r8
            java.lang.String r8 = "Image URL %s returned HTTP code %d"
            java.lang.String r8 = com.C2240a.m6772a(r8, r0)
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14208u.mo26422a(android.net.Uri, int):java.net.HttpURLConnection");
    }
}
