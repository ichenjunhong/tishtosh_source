package com.p683ss.android.ugc.aweme.image;

import android.net.Uri;
import android.os.Looper;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.lighten.p766a.C12193g;
import com.bytedance.lighten.p766a.p769c.C12173h;
import com.facebook.net.C14540a;
import com.facebook.net.C14551d;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53522d.C53523a;
import okhttp3.C53524e;
import okhttp3.C53526f;

/* renamed from: com.ss.android.ugc.aweme.image.n */
public final class C35503n extends C35481a {

    /* renamed from: e */
    public volatile C53524e f91255e;

    /* renamed from: f */
    public volatile C53498ab f91256f;

    /* renamed from: a */
    public final void mo23096a() {
        if (this.f91255e != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f91255e.mo111248c();
                return;
            }
            this.f91204a.execute(new Runnable() {
                public final void run() {
                    C35503n.this.f91255e.mo111248c();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo23098b(final C12193g gVar, final C12173h hVar) {
        if (this.f91255e != null && gVar != null) {
            final C53498ab a = this.f91255e.mo111245a();
            this.f91255e.mo111246a(new C53526f() {
                public final void onFailure(C53524e eVar, IOException iOException) {
                    C35503n.this.mo73895a(null, gVar, eVar, iOException, hVar);
                }

                /* JADX WARNING: Removed duplicated region for block: B:24:0x009b A[SYNTHETIC, Splitter:B:24:0x009b] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onResponse(okhttp3.C53524e r14, okhttp3.C53504ad r15) throws java.io.IOException {
                    /*
                        r13 = this;
                        com.bytedance.lighten.a.g r0 = r4
                        long r1 = java.lang.System.currentTimeMillis()
                        r0.f32126b = r1
                        com.bytedance.lighten.a.g r0 = r4
                        long r1 = java.lang.System.currentTimeMillis()
                        r0.f32127c = r1
                        okhttp3.ae r0 = r15.f132404g
                        boolean r1 = r15.mo111275a()     // Catch:{ Exception -> 0x00ab }
                        if (r1 != 0) goto L_0x0046
                        com.ss.android.ugc.aweme.image.n r2 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.a.g r4 = r4     // Catch:{ Exception -> 0x00ab }
                        java.io.IOException r6 = new java.io.IOException     // Catch:{ Exception -> 0x00ab }
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
                        java.lang.String r3 = "Unexpected HTTP code "
                        r1.<init>(r3)     // Catch:{ Exception -> 0x00ab }
                        r1.append(r15)     // Catch:{ Exception -> 0x00ab }
                        java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ab }
                        r6.<init>(r1)     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.a.c.h r7 = r5     // Catch:{ Exception -> 0x00ab }
                        r3 = r15
                        r5 = r14
                        r2.mo73895a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00ab }
                        if (r0 == 0) goto L_0x0045
                        r0.close()     // Catch:{ Exception -> 0x003c }
                        goto L_0x0045
                    L_0x003c:
                        r14 = move-exception
                        java.lang.String r15 = "OkHttpNetworkFetchProducer"
                        java.lang.String r0 = "Exception when closing response body"
                        com.facebook.common.p921e.C13697a.m27690b(r15, r0, r14)
                        return
                    L_0x0045:
                        return
                    L_0x0046:
                        com.ss.android.ugc.aweme.image.n r1 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ Exception -> 0x00ab }
                        com.ss.android.ugc.aweme.image.k r1 = r1.f91207d     // Catch:{ Exception -> 0x00ab }
                        java.io.InputStream r2 = r0.byteStream()     // Catch:{ Exception -> 0x00ab }
                        okhttp3.ab r3 = r15.f132398a     // Catch:{ Exception -> 0x00ab }
                        okhttp3.t r3 = r3.f132378a     // Catch:{ Exception -> 0x00ab }
                        java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ab }
                        long r4 = r0.contentLength()     // Catch:{ Exception -> 0x00ab }
                        android.util.Pair r1 = r1.mo73893a(r2, r3, r4)     // Catch:{ Exception -> 0x00ab }
                        java.lang.Object r2 = r1.second     // Catch:{ Exception -> 0x00ab }
                        java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x00ab }
                        long r2 = r2.longValue()     // Catch:{ Exception -> 0x00ab }
                        r4 = 0
                        int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r6 < 0) goto L_0x007d
                        com.bytedance.lighten.a.g r6 = r4     // Catch:{ Exception -> 0x00ab }
                        long r6 = r6.f32129e     // Catch:{ Exception -> 0x00ab }
                        int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                        if (r8 <= 0) goto L_0x007b
                        int r6 = r15.f132400c     // Catch:{ Exception -> 0x00ab }
                        r7 = 206(0xce, float:2.89E-43)
                        if (r6 == r7) goto L_0x007b
                        goto L_0x007d
                    L_0x007b:
                        r9 = r2
                        goto L_0x007e
                    L_0x007d:
                        r9 = r4
                    L_0x007e:
                        com.bytedance.lighten.a.g r11 = r4     // Catch:{ Exception -> 0x00ab }
                        com.ss.android.ugc.aweme.image.o r12 = new com.ss.android.ugc.aweme.image.o     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.a.g r4 = r4     // Catch:{ Exception -> 0x00ab }
                        okhttp3.ab r8 = r0     // Catch:{ Exception -> 0x00ab }
                        r2 = r12
                        r3 = r13
                        r5 = r15
                        r6 = r9
                        r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x00ab }
                        r11.f32134j = r12     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.a.c.h r2 = r5     // Catch:{ Exception -> 0x00ab }
                        java.lang.Object r1 = r1.first     // Catch:{ Exception -> 0x00ab }
                        java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ Exception -> 0x00ab }
                        int r3 = (int) r9     // Catch:{ Exception -> 0x00ab }
                        r2.mo23092a(r1, r3)     // Catch:{ Exception -> 0x00ab }
                        if (r0 == 0) goto L_0x00a8
                        r0.close()     // Catch:{ Exception -> 0x009f }
                        goto L_0x00a8
                    L_0x009f:
                        r14 = move-exception
                        java.lang.String r15 = "OkHttpNetworkFetchProducer"
                        java.lang.String r0 = "Exception when closing response body"
                        com.facebook.common.p921e.C13697a.m27690b(r15, r0, r14)
                        return
                    L_0x00a8:
                        return
                    L_0x00a9:
                        r14 = move-exception
                        goto L_0x00be
                    L_0x00ab:
                        r1 = move-exception
                        r6 = r1
                        com.ss.android.ugc.aweme.image.n r2 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ all -> 0x00a9 }
                        com.bytedance.lighten.a.g r4 = r4     // Catch:{ all -> 0x00a9 }
                        com.bytedance.lighten.a.c.h r7 = r5     // Catch:{ all -> 0x00a9 }
                        r3 = r15
                        r5 = r14
                        r2.mo73895a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a9 }
                        if (r0 == 0) goto L_0x00bd
                        r0.close()     // Catch:{ Exception -> 0x009f }
                    L_0x00bd:
                        return
                    L_0x00be:
                        if (r0 == 0) goto L_0x00cc
                        r0.close()     // Catch:{ Exception -> 0x00c4 }
                        goto L_0x00cc
                    L_0x00c4:
                        r15 = move-exception
                        java.lang.String r0 = "OkHttpNetworkFetchProducer"
                        java.lang.String r1 = "Exception when closing response body"
                        com.facebook.common.p921e.C13697a.m27690b(r0, r1, r15)
                    L_0x00cc:
                        throw r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35503n.C355041.onResponse(okhttp3.e, okhttp3.ad):void");
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo23097a(C12193g gVar, C12173h hVar) {
        gVar.f32125a = System.currentTimeMillis();
        this.f91206c = (C14551d) gVar.f32135k;
        Uri uri = gVar.f32132h;
        C53499a aVar = new C53499a();
        if (gVar.f32129e > 0) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(gVar.f32129e);
            sb.append("-");
            aVar.mo111263a("Range", sb.toString());
        }
        String a = C9894e.m19813a(this.f91207d.mo73894a(uri.toString()));
        if (C9431p.m18664a(a)) {
            a = uri.toString();
        }
        this.f91256f = aVar.mo111266a(new C53523a().mo111322a().mo111324b()).mo111262a(a).mo111260a().mo111272c();
        this.f91255e = C14540a.m29786a().mo111325a(this.f91256f);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:2|(17:4|5|6|7|8|9|12|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)(1:25)|26|(1:28))|10|12|13|(0)|16|(0)|19|(0)|22|(0)(0)|26|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if ("Socket closed".equals(r24.getMessage()) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048 A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ Throwable -> 0x009c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73895a(okhttp3.C53504ad r21, com.bytedance.lighten.p766a.C12193g r22, okhttp3.C53524e r23, java.lang.Exception r24, com.bytedance.lighten.p766a.p769c.C12173h r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r12 = r24
            r13 = r25
            if (r2 == 0) goto L_0x009c
            r3 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.String r4 = "x-snssdk.remoteaddr"
            java.lang.String r4 = r1.mo111276b(r4)     // Catch:{ Exception -> 0x001f }
            okhttp3.ab r5 = r1.f132398a     // Catch:{ Exception -> 0x0020 }
            okhttp3.t r5 = r5.f132378a     // Catch:{ Exception -> 0x0020 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0020 }
            r3 = r5
            goto L_0x0020
        L_0x001f:
            r4 = r3
        L_0x0020:
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r4)     // Catch:{ Throwable -> 0x009c }
            if (r5 == 0) goto L_0x002a
            java.lang.String r4 = com.p683ss.android.ugc.aweme.image.C35481a.m80195a(r24)     // Catch:{ Throwable -> 0x009c }
        L_0x002a:
            long r14 = r2.f32125a     // Catch:{ Throwable -> 0x009c }
            long r5 = r2.f32128d     // Catch:{ Throwable -> 0x009c }
            long r7 = r2.f32125a     // Catch:{ Throwable -> 0x009c }
            r9 = 0
            long r5 = r5 - r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0040
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x009c }
            long r7 = r2.f32125a     // Catch:{ Throwable -> 0x009c }
            r9 = 0
            long r5 = r5 - r7
        L_0x0040:
            r16 = r5
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x009c }
            if (r5 == 0) goto L_0x004e
            android.net.Uri r3 = r2.f32132h     // Catch:{ Throwable -> 0x009c }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x009c }
        L_0x004e:
            r11 = r3
            com.bytedance.ttnet.c.b r10 = new com.bytedance.ttnet.c.b     // Catch:{ Throwable -> 0x009c }
            r10.<init>()     // Catch:{ Throwable -> 0x009c }
            r10.f26751a = r4     // Catch:{ Throwable -> 0x009c }
            com.ss.android.ugc.aweme.image.j r3 = r0.f91205b     // Catch:{ Throwable -> 0x009c }
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.image.j r3 = r0.f91205b     // Catch:{ Throwable -> 0x009c }
            r18 = 0
            r4 = r16
            r6 = r14
            r8 = r11
            r9 = r10
            r19 = r10
            r10 = r24
            r12 = r11
            r11 = r18
            r3.mo73887a(r4, r6, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x009c }
            goto L_0x0071
        L_0x006e:
            r19 = r10
            r12 = r11
        L_0x0071:
            com.facebook.net.g r6 = new com.facebook.net.g     // Catch:{ Throwable -> 0x009c }
            r6.<init>()     // Catch:{ Throwable -> 0x009c }
            r6.f37820b = r1     // Catch:{ Throwable -> 0x009c }
            r6.f37821c = r12     // Catch:{ Throwable -> 0x009c }
            com.facebook.net.d r1 = r0.f91206c     // Catch:{ Throwable -> 0x009c }
            if (r1 == 0) goto L_0x009c
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Throwable -> 0x009c }
            r9.<init>()     // Catch:{ Throwable -> 0x009c }
            java.lang.String r1 = "requestId"
            java.lang.String r2 = r2.f32130f     // Catch:{ Throwable -> 0x009c }
            r9.put(r1, r2)     // Catch:{ Throwable -> 0x009c }
            java.lang.String r1 = "retryCount"
            r2 = 0
            r9.put(r1, r2)     // Catch:{ Throwable -> 0x009c }
            com.facebook.net.d r1 = r0.f91206c     // Catch:{ Throwable -> 0x009c }
            r2 = r16
            r4 = r14
            r7 = r19
            r8 = r24
            r1.mo26790a(r2, r4, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x009c }
        L_0x009c:
            if (r13 == 0) goto L_0x00cb
            r1 = r24
            if (r1 == 0) goto L_0x00ba
            java.lang.String r2 = "Canceled"
            java.lang.String r3 = r24.getMessage()     // Catch:{ Throwable -> 0x00ca }
            boolean r2 = r2.equals(r3)     // Catch:{ Throwable -> 0x00ca }
            if (r2 != 0) goto L_0x00c2
            java.lang.String r2 = "Socket closed"
            java.lang.String r3 = r24.getMessage()     // Catch:{ Throwable -> 0x00ca }
            boolean r2 = r2.equals(r3)     // Catch:{ Throwable -> 0x00ca }
            if (r2 != 0) goto L_0x00c2
        L_0x00ba:
            if (r23 == 0) goto L_0x00c6
            boolean r2 = r23.mo111250d()     // Catch:{ Throwable -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
        L_0x00c2:
            r25.mo23091a()     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00ca
        L_0x00c6:
            r13.mo23093a(r1)     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            return
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35503n.mo73895a(okhttp3.ad, com.bytedance.lighten.a.g, okhttp3.e, java.lang.Exception, com.bytedance.lighten.a.c.h):void");
    }
}
