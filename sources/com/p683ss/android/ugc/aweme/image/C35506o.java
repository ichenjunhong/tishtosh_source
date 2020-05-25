package com.p683ss.android.ugc.aweme.image;

import com.bytedance.lighten.p766a.C12193g;
import okhttp3.C53498ab;
import okhttp3.C53504ad;

/* renamed from: com.ss.android.ugc.aweme.image.o */
final /* synthetic */ class C35506o implements Runnable {

    /* renamed from: a */
    private final C355041 f91262a;

    /* renamed from: b */
    private final C12193g f91263b;

    /* renamed from: c */
    private final C53504ad f91264c;

    /* renamed from: d */
    private final long f91265d;

    /* renamed from: e */
    private final C53498ab f91266e;

    C35506o(C355041 r1, C12193g gVar, C53504ad adVar, long j, C53498ab abVar) {
        this.f91262a = r1;
        this.f91263b = gVar;
        this.f91264c = adVar;
        this.f91265d = j;
        this.f91266e = abVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d9 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[Catch:{ JSONException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d A[Catch:{ JSONException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0085 A[Catch:{ JSONException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3 A[Catch:{ JSONException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c1 A[Catch:{ JSONException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df A[Catch:{ JSONException -> 0x00fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r0 = r25
            com.ss.android.ugc.aweme.image.n$1 r1 = r0.f91262a
            com.bytedance.lighten.a.g r2 = r0.f91263b
            okhttp3.ad r3 = r0.f91264c
            long r4 = r0.f91265d
            okhttp3.ab r6 = r0.f91266e
            long r7 = java.lang.System.currentTimeMillis()
            r2.f32128d = r7
            if (r3 == 0) goto L_0x001b
            java.lang.String r7 = "x-snssdk.remoteaddr"
            java.lang.String r7 = r3.mo111276b(r7)     // Catch:{ Exception -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r7 = 0
        L_0x001c:
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fc }
            r15.<init>()     // Catch:{ JSONException -> 0x00fc }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fc }
            r14.<init>()     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r8 = "image_size"
            r15.put(r8, r4)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r8 = "image_size"
            r14.put(r8, r4)     // Catch:{ JSONException -> 0x00fc }
            com.bytedance.ttnet.c.b r4 = new com.bytedance.ttnet.c.b     // Catch:{ JSONException -> 0x00fc }
            r4.<init>()     // Catch:{ JSONException -> 0x00fc }
            r4.f26751a = r7     // Catch:{ JSONException -> 0x00fc }
            com.ss.android.ugc.aweme.image.n r5 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ JSONException -> 0x00fc }
            com.ss.android.ugc.aweme.image.j r5 = r5.f91205b     // Catch:{ JSONException -> 0x00fc }
            if (r5 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.image.n r5 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ JSONException -> 0x00fc }
            com.ss.android.ugc.aweme.image.j r8 = r5.f91205b     // Catch:{ JSONException -> 0x00fc }
            long r9 = r2.f32128d     // Catch:{ JSONException -> 0x00fc }
            long r11 = r2.f32125a     // Catch:{ JSONException -> 0x00fc }
            r5 = 0
            long r9 = r9 - r11
            long r11 = r2.f32125a     // Catch:{ JSONException -> 0x00fc }
            com.ss.android.ugc.aweme.image.n r5 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ JSONException -> 0x00fc }
            okhttp3.ab r5 = r5.f91256f     // Catch:{ JSONException -> 0x00fc }
            okhttp3.t r5 = r5.f132378a     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r13 = r5.toString()     // Catch:{ JSONException -> 0x00fc }
            r5 = 0
            r7 = r14
            r14 = r4
            r16 = r15
            r15 = r5
            r8.mo73888b(r9, r11, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x00fc }
            goto L_0x005e
        L_0x005d:
            r7 = r14
        L_0x005e:
            com.facebook.net.g r5 = new com.facebook.net.g     // Catch:{ JSONException -> 0x00fc }
            r5.<init>()     // Catch:{ JSONException -> 0x00fc }
            r5.f37820b = r3     // Catch:{ JSONException -> 0x00fc }
            okhttp3.t r6 = r6.f132378a     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x00fc }
            r5.f37821c = r6     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r6 = "http_status"
            int r3 = r3.f132400c     // Catch:{ JSONException -> 0x00fc }
            r7.put(r6, r3)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r3 = "requestId"
            java.lang.String r6 = r2.f32130f     // Catch:{ JSONException -> 0x00fc }
            r7.put(r3, r6)     // Catch:{ JSONException -> 0x00fc }
            long r8 = r2.f32126b     // Catch:{ JSONException -> 0x00d9 }
            r10 = -1
            r12 = 0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0098
            long r8 = r2.f32125a     // Catch:{ JSONException -> 0x00d9 }
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x008c
            goto L_0x0098
        L_0x008c:
            java.lang.String r3 = "queue_time"
            long r8 = r2.f32126b     // Catch:{ JSONException -> 0x00d9 }
            long r14 = r2.f32125a     // Catch:{ JSONException -> 0x00d9 }
            r6 = 0
            long r8 = r8 - r14
            r7.put(r3, r8)     // Catch:{ JSONException -> 0x00d9 }
            goto L_0x009d
        L_0x0098:
            java.lang.String r3 = "queue_time"
            r7.put(r3, r10)     // Catch:{ JSONException -> 0x00d9 }
        L_0x009d:
            long r8 = r2.f32128d     // Catch:{ JSONException -> 0x00d9 }
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x00b6
            long r8 = r2.f32126b     // Catch:{ JSONException -> 0x00d9 }
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x00aa
            goto L_0x00b6
        L_0x00aa:
            java.lang.String r3 = "fetch_time"
            long r8 = r2.f32128d     // Catch:{ JSONException -> 0x00d9 }
            long r14 = r2.f32126b     // Catch:{ JSONException -> 0x00d9 }
            r6 = 0
            long r8 = r8 - r14
            r7.put(r3, r8)     // Catch:{ JSONException -> 0x00d9 }
            goto L_0x00bb
        L_0x00b6:
            java.lang.String r3 = "fetch_time"
            r7.put(r3, r10)     // Catch:{ JSONException -> 0x00d9 }
        L_0x00bb:
            long r8 = r2.f32128d     // Catch:{ JSONException -> 0x00d9 }
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x00d4
            long r8 = r2.f32125a     // Catch:{ JSONException -> 0x00d9 }
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x00c8
            goto L_0x00d4
        L_0x00c8:
            java.lang.String r3 = "total_time"
            long r8 = r2.f32128d     // Catch:{ JSONException -> 0x00d9 }
            long r10 = r2.f32125a     // Catch:{ JSONException -> 0x00d9 }
            r6 = 0
            long r8 = r8 - r10
            r7.put(r3, r8)     // Catch:{ JSONException -> 0x00d9 }
            goto L_0x00d9
        L_0x00d4:
            java.lang.String r3 = "total_time"
            r7.put(r3, r10)     // Catch:{ JSONException -> 0x00d9 }
        L_0x00d9:
            com.ss.android.ugc.aweme.image.n r3 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ JSONException -> 0x00fc }
            com.facebook.net.d r3 = r3.f91206c     // Catch:{ JSONException -> 0x00fc }
            if (r3 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.image.n r1 = com.p683ss.android.ugc.aweme.image.C35503n.this     // Catch:{ JSONException -> 0x00fc }
            com.facebook.net.d r1 = r1.f91206c     // Catch:{ JSONException -> 0x00fc }
            long r8 = r2.f32128d     // Catch:{ JSONException -> 0x00fc }
            long r10 = r2.f32125a     // Catch:{ JSONException -> 0x00fc }
            r3 = 0
            long r17 = r8 - r10
            long r2 = r2.f32125a     // Catch:{ JSONException -> 0x00fc }
            r23 = 0
            r16 = r1
            r19 = r2
            r21 = r5
            r22 = r4
            r24 = r7
            r16.mo26791b(r17, r19, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x00fc }
        L_0x00fb:
            return
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35506o.run():void");
    }
}
