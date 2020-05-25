package com.p683ss.ugc.live.p2595a.p2596a.p2598b;

import com.C2240a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51562b.C51563a;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51587c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.ugc.live.a.a.b.c */
public final class C51564c implements C51562b {

    /* renamed from: a */
    private final ExecutorService f128812a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(3).mo49847a());

    /* renamed from: com.ss.ugc.live.a.a.b.c$a */
    static class C51566a extends IOException {

        /* renamed from: a */
        int f128816a;

        public C51566a(String str, int i) {
            super(str);
            this.f128816a = i;
        }
    }

    /* renamed from: a */
    private static boolean m110703a(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: b */
    private static boolean m110704b(int i) {
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

    /* renamed from: a */
    public final void mo105492a(final C51561a aVar, final C51563a aVar2) {
        if (C51587c.m110737a(aVar.f128810a)) {
            aVar2.mo105494a((Throwable) new IllegalArgumentException("request is not valid"), 0);
        } else {
            this.f128812a.submit(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:33:0x0053 A[Catch:{ all -> 0x006b }] */
                /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[Catch:{ all -> 0x006b }] */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x005f A[SYNTHETIC, Splitter:B:37:0x005f] */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x0066  */
                /* JADX WARNING: Removed duplicated region for block: B:46:0x006e A[SYNTHETIC, Splitter:B:46:0x006e] */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x0075  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r5 = this;
                        com.ss.ugc.live.a.a.b.c r0 = com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51564c.this
                        com.ss.ugc.live.a.a.b.a r1 = r3
                        com.ss.ugc.live.a.a.b.b$a r2 = r4
                        r3 = 5
                        r4 = 0
                        java.net.HttpURLConnection r0 = r0.mo105495a(r1, r3)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
                        if (r0 == 0) goto L_0x003c
                        r1 = r0
                        java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ IOException -> 0x003a }
                        boolean r3 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r1)     // Catch:{ IOException -> 0x003a }
                        if (r3 == 0) goto L_0x0022
                        java.net.URL r3 = r1.getURL()     // Catch:{ IOException -> 0x003a }
                        java.lang.String r1 = r1.getContentType()     // Catch:{ IOException -> 0x003a }
                        com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r3, r4, r4, r1)     // Catch:{ IOException -> 0x003a }
                    L_0x0022:
                        java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x003a }
                        java.lang.String r3 = "Content-Length"
                        r4 = -1
                        int r3 = r0.getHeaderFieldInt(r3, r4)     // Catch:{ IOException -> 0x0036, all -> 0x0032 }
                        long r3 = (long) r3     // Catch:{ IOException -> 0x0036, all -> 0x0032 }
                        r2.mo105493a(r1, r3)     // Catch:{ IOException -> 0x0036, all -> 0x0032 }
                        goto L_0x003d
                    L_0x0032:
                        r2 = move-exception
                        r4 = r1
                        r1 = r2
                        goto L_0x006c
                    L_0x0036:
                        r3 = move-exception
                        r4 = r1
                        r1 = r3
                        goto L_0x004f
                    L_0x003a:
                        r1 = move-exception
                        goto L_0x004f
                    L_0x003c:
                        r1 = r4
                    L_0x003d:
                        if (r1 == 0) goto L_0x0044
                        r1.close()     // Catch:{ IOException -> 0x0043 }
                        goto L_0x0044
                    L_0x0043:
                    L_0x0044:
                        if (r0 == 0) goto L_0x006a
                        r0.disconnect()
                        return
                    L_0x004a:
                        r1 = move-exception
                        r0 = r4
                        goto L_0x006c
                    L_0x004d:
                        r1 = move-exception
                        r0 = r4
                    L_0x004f:
                        boolean r3 = r1 instanceof com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51564c.C51566a     // Catch:{ all -> 0x006b }
                        if (r3 == 0) goto L_0x0059
                        r3 = r1
                        com.ss.ugc.live.a.a.b.c$a r3 = (com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51564c.C51566a) r3     // Catch:{ all -> 0x006b }
                        int r3 = r3.f128816a     // Catch:{ all -> 0x006b }
                        goto L_0x005a
                    L_0x0059:
                        r3 = 0
                    L_0x005a:
                        r2.mo105494a(r1, r3)     // Catch:{ all -> 0x006b }
                        if (r4 == 0) goto L_0x0064
                        r4.close()     // Catch:{ IOException -> 0x0063 }
                        goto L_0x0064
                    L_0x0063:
                    L_0x0064:
                        if (r0 == 0) goto L_0x006a
                        r0.disconnect()
                        return
                    L_0x006a:
                        return
                    L_0x006b:
                        r1 = move-exception
                    L_0x006c:
                        if (r4 == 0) goto L_0x0073
                        r4.close()     // Catch:{ IOException -> 0x0072 }
                        goto L_0x0073
                    L_0x0072:
                    L_0x0073:
                        if (r0 == 0) goto L_0x0078
                        r0.disconnect()
                    L_0x0078:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51564c.C515651.run():void");
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public HttpURLConnection mo105495a(C51561a aVar, int i) throws IOException {
        String str;
        String str2 = aVar.f128810a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        long j = aVar.f128811b;
        if (j > 0) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            C51567d.m110707a(httpURLConnection, "range", sb.toString());
        }
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(5000);
        int responseCode = httpURLConnection.getResponseCode();
        if (m110703a(responseCode)) {
            return httpURLConnection;
        }
        if (m110704b(responseCode)) {
            String headerField = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            if (headerField == null || i <= 0) {
                if (i == 0) {
                    str = C2240a.m6772a("URL %1$s too many redirects", new Object[]{str2});
                } else {
                    str = C2240a.m6772a("URL %1$s invalid redirect", new Object[]{str2});
                }
                throw new IOException(str);
            }
            aVar.f128810a = headerField;
            mo105495a(aVar, i - 1);
            return httpURLConnection;
        }
        httpURLConnection.disconnect();
        StringBuilder sb2 = new StringBuilder("error response code:");
        sb2.append(responseCode);
        throw new C51566a(sb2.toString(), responseCode);
    }
}
