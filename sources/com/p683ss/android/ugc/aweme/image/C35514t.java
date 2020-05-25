package com.p683ss.android.ugc.aweme.image;

import com.bytedance.lighten.p766a.C12193g;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;

/* renamed from: com.ss.android.ugc.aweme.image.t */
final /* synthetic */ class C35514t implements Runnable {

    /* renamed from: a */
    private final C355121 f91278a;

    /* renamed from: b */
    private final C12193g f91279b;

    /* renamed from: c */
    private final C12799u f91280c;

    /* renamed from: d */
    private final long f91281d;

    /* renamed from: e */
    private final C12690b f91282e;

    C35514t(C355121 r1, C12193g gVar, C12799u uVar, long j, C12690b bVar) {
        this.f91278a = r1;
        this.f91279b = gVar;
        this.f91280c = uVar;
        this.f91281d = j;
        this.f91282e = bVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0184 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1 A[Catch:{ JSONException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce A[Catch:{ JSONException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4 A[Catch:{ JSONException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0130 A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014e A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016c A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018a A[Catch:{ JSONException -> 0x01a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            com.ss.android.ugc.aweme.image.r$1 r1 = r0.f91278a
            com.bytedance.lighten.a.g r2 = r0.f91279b
            com.bytedance.retrofit2.u r3 = r0.f91280c
            long r4 = r0.f91281d
            com.bytedance.retrofit2.b r6 = r0.f91282e
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01a1 }
            r2.f32128d = r7     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.retrofit2.a.d r7 = r3.f33551a     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = "X-Cache"
            java.util.List r7 = r7.mo23867b(r8)     // Catch:{ JSONException -> 0x01a1 }
            if (r7 == 0) goto L_0x0022
            int r8 = r7.size()     // Catch:{ JSONException -> 0x01a1 }
            if (r8 > 0) goto L_0x002a
        L_0x0022:
            com.bytedance.retrofit2.a.d r7 = r3.f33551a     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = "X-Cache-new"
            java.util.List r7 = r7.mo23867b(r8)     // Catch:{ JSONException -> 0x01a1 }
        L_0x002a:
            boolean r8 = com.bytedance.common.utility.p522b.C9376b.m18558a(r7)     // Catch:{ JSONException -> 0x01a1 }
            if (r8 != 0) goto L_0x005e
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x01a1 }
        L_0x0034:
            boolean r8 = r7.hasNext()     // Catch:{ JSONException -> 0x01a1 }
            if (r8 == 0) goto L_0x005e
            java.lang.Object r8 = r7.next()     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.retrofit2.a.b r8 = (com.bytedance.retrofit2.p830a.C12685b) r8     // Catch:{ JSONException -> 0x01a1 }
            if (r8 == 0) goto L_0x0034
            java.lang.String r8 = r8.f33319b     // Catch:{ JSONException -> 0x01a1 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x01a1 }
            r10 = 1
            if (r9 != 0) goto L_0x0059
            java.lang.String r8 = r8.toLowerCase()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r9 = "hit"
            boolean r8 = r8.contains(r9)     // Catch:{ JSONException -> 0x01a1 }
            if (r8 == 0) goto L_0x0059
            r8 = 1
            goto L_0x005a
        L_0x0059:
            r8 = 0
        L_0x005a:
            if (r8 == 0) goto L_0x0034
            r2.f32131g = r10     // Catch:{ JSONException -> 0x01a1 }
        L_0x005e:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r7.<init>()     // Catch:{ JSONException -> 0x01a1 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r9.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = com.p683ss.android.ugc.aweme.image.C35511r.m80251a(r3)     // Catch:{ JSONException -> 0x01a1 }
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x01a1 }
            if (r10 != 0) goto L_0x007c
            java.lang.String r10 = "cache_control"
            r7.put(r10, r8)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r10 = "cache_control"
            r9.put(r10, r8)     // Catch:{ JSONException -> 0x01a1 }
        L_0x007c:
            r2.f32137m = r4     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = "image_size"
            r7.put(r8, r4)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = "content_length"
            r9.put(r8, r4)     // Catch:{ JSONException -> 0x01a1 }
            boolean r4 = r6 instanceof com.bytedance.retrofit2.C12758l     // Catch:{ Throwable -> 0x009d }
            if (r4 == 0) goto L_0x0091
            com.bytedance.retrofit2.l r6 = (com.bytedance.retrofit2.C12758l) r6     // Catch:{ Throwable -> 0x009d }
            r6.doCollect()     // Catch:{ Throwable -> 0x009d }
        L_0x0091:
            com.bytedance.retrofit2.a.d r4 = r3.f33551a     // Catch:{ Throwable -> 0x009d }
            java.lang.Object r4 = r4.f33351f     // Catch:{ Throwable -> 0x009d }
            boolean r5 = r4 instanceof com.bytedance.ttnet.p885c.C13297b     // Catch:{ Throwable -> 0x009d }
            if (r5 == 0) goto L_0x009d
            com.bytedance.ttnet.c.b r4 = (com.bytedance.ttnet.p885c.C13297b) r4     // Catch:{ Throwable -> 0x009d }
            r1.f91272a = r4     // Catch:{ Throwable -> 0x009d }
        L_0x009d:
            com.bytedance.ttnet.c.b r4 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            if (r4 != 0) goto L_0x00a8
            com.bytedance.ttnet.c.b r4 = new com.bytedance.ttnet.c.b     // Catch:{ JSONException -> 0x01a1 }
            r4.<init>()     // Catch:{ JSONException -> 0x01a1 }
            r1.f91272a = r4     // Catch:{ JSONException -> 0x01a1 }
        L_0x00a8:
            com.bytedance.ttnet.c.b r4 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            long r4 = r4.f26755e     // Catch:{ JSONException -> 0x01a1 }
            r2.f32126b = r4     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.ttnet.c.b r4 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            long r5 = r1.f91273b     // Catch:{ JSONException -> 0x01a1 }
            r4.f26757g = r5     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.ttnet.c.b r4 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            long r5 = r2.f32128d     // Catch:{ JSONException -> 0x01a1 }
            r4.f26758h = r5     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.ttnet.c.b r4 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            java.util.List r5 = r3.mo23959b()     // Catch:{ JSONException -> 0x01a1 }
            com.ss.android.ugc.aweme.image.r r6 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.ttnet.c.e r6 = r6.f91270f     // Catch:{ JSONException -> 0x01a1 }
            r8 = 0
            com.p683ss.android.ugc.aweme.image.C35511r.m80252a(r4, r5, r6, r8)     // Catch:{ JSONException -> 0x01a1 }
            com.ss.android.ugc.aweme.image.r r4 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ JSONException -> 0x01a1 }
            com.ss.android.ugc.aweme.image.j r4 = r4.f91205b     // Catch:{ JSONException -> 0x01a1 }
            if (r4 == 0) goto L_0x00ec
            com.ss.android.ugc.aweme.image.r r4 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ JSONException -> 0x01a1 }
            com.ss.android.ugc.aweme.image.j r11 = r4.f91205b     // Catch:{ JSONException -> 0x01a1 }
            long r4 = r2.f32128d     // Catch:{ JSONException -> 0x01a1 }
            long r12 = r2.f32125a     // Catch:{ JSONException -> 0x01a1 }
            r6 = 0
            long r12 = r4 - r12
            long r14 = r2.f32125a     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.retrofit2.a.d r4 = r3.f33551a     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r4 = r4.f33346a     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.ttnet.c.b r5 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            r18 = 0
            r16 = r4
            r17 = r5
            r19 = r7
            r11.mo73888b(r12, r14, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x01a1 }
        L_0x00ec:
            java.lang.String r4 = "retryCount"
            com.bytedance.ttnet.c.b r5 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            org.json.JSONObject r5 = r5.f26775y     // Catch:{ JSONException -> 0x01a1 }
            if (r5 == 0) goto L_0x0105
            java.lang.String r6 = "retryCount"
            java.lang.Object r5 = r5.remove(r6)     // Catch:{ JSONException -> 0x01a1 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ JSONException -> 0x01a1 }
            if (r6 == 0) goto L_0x0105
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r5.intValue()     // Catch:{ JSONException -> 0x01a1 }
            goto L_0x0106
        L_0x0105:
            r5 = -1
        L_0x0106:
            r9.put(r4, r5)     // Catch:{ JSONException -> 0x01a1 }
            com.facebook.net.g r13 = new com.facebook.net.g     // Catch:{ JSONException -> 0x01a1 }
            r13.<init>()     // Catch:{ JSONException -> 0x01a1 }
            r13.f37819a = r3     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.retrofit2.a.d r4 = r3.f33551a     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r4 = r4.f33346a     // Catch:{ JSONException -> 0x01a1 }
            r13.f37821c = r4     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r4 = "http_status"
            int r3 = r3.mo23958a()     // Catch:{ JSONException -> 0x01a1 }
            r9.put(r4, r3)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r3 = "requestId"
            java.lang.String r4 = r2.f32130f     // Catch:{ JSONException -> 0x01a1 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x01a1 }
            long r3 = r2.f32126b     // Catch:{ JSONException -> 0x0184 }
            r5 = -1
            r7 = 0
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0143
            long r3 = r2.f32125a     // Catch:{ JSONException -> 0x0184 }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0137
            goto L_0x0143
        L_0x0137:
            java.lang.String r3 = "queue_time"
            long r10 = r2.f32126b     // Catch:{ JSONException -> 0x0184 }
            long r14 = r2.f32125a     // Catch:{ JSONException -> 0x0184 }
            r4 = 0
            long r10 = r10 - r14
            r9.put(r3, r10)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0148
        L_0x0143:
            java.lang.String r3 = "queue_time"
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0184 }
        L_0x0148:
            long r3 = r2.f32128d     // Catch:{ JSONException -> 0x0184 }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0161
            long r3 = r2.f32126b     // Catch:{ JSONException -> 0x0184 }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0155
            goto L_0x0161
        L_0x0155:
            java.lang.String r3 = "fetch_time"
            long r10 = r2.f32128d     // Catch:{ JSONException -> 0x0184 }
            long r14 = r2.f32126b     // Catch:{ JSONException -> 0x0184 }
            r4 = 0
            long r10 = r10 - r14
            r9.put(r3, r10)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0166
        L_0x0161:
            java.lang.String r3 = "fetch_time"
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0184 }
        L_0x0166:
            long r3 = r2.f32128d     // Catch:{ JSONException -> 0x0184 }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x017f
            long r3 = r2.f32125a     // Catch:{ JSONException -> 0x0184 }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0173
            goto L_0x017f
        L_0x0173:
            java.lang.String r3 = "total_time"
            long r4 = r2.f32128d     // Catch:{ JSONException -> 0x0184 }
            long r6 = r2.f32125a     // Catch:{ JSONException -> 0x0184 }
            r8 = 0
            long r4 = r4 - r6
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0184
        L_0x017f:
            java.lang.String r3 = "total_time"
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0184 }
        L_0x0184:
            com.ss.android.ugc.aweme.image.r r3 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ JSONException -> 0x01a1 }
            com.facebook.net.d r3 = r3.f91206c     // Catch:{ JSONException -> 0x01a1 }
            if (r3 == 0) goto L_0x01a0
            com.ss.android.ugc.aweme.image.r r3 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ JSONException -> 0x01a1 }
            com.facebook.net.d r8 = r3.f91206c     // Catch:{ JSONException -> 0x01a1 }
            long r3 = r2.f32128d     // Catch:{ JSONException -> 0x01a1 }
            long r5 = r2.f32125a     // Catch:{ JSONException -> 0x01a1 }
            r7 = 0
            long r3 = r3 - r5
            long r11 = r2.f32125a     // Catch:{ JSONException -> 0x01a1 }
            com.bytedance.ttnet.c.b r14 = r1.f91272a     // Catch:{ JSONException -> 0x01a1 }
            r15 = 0
            r1 = r9
            r9 = r3
            r16 = r1
            r8.mo26791b(r9, r11, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x01a1 }
        L_0x01a0:
            return
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35514t.run():void");
    }
}
