package com.p683ss.android.ugc.aweme.image;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.lighten.p766a.C12193g;
import com.bytedance.lighten.p766a.p769c.C12173h;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12757k;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p885c.C13297b;
import com.bytedance.ttnet.p885c.C13302e;
import com.bytedance.ttnet.p887e.C13333g;
import com.facebook.net.C14542b;
import com.facebook.net.C14551d;
import com.facebook.net.C14556g;
import com.facebook.net.C14557h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.r */
public final class C35511r extends C35481a {

    /* renamed from: e */
    public volatile C12690b<TypedInput> f91269e;

    /* renamed from: f */
    public C13302e f91270f;

    /* renamed from: g */
    private final int f91271g = 206;

    /* renamed from: a */
    public final void mo73900a(C12799u uVar, C12193g gVar, Throwable th, C13297b bVar, int i, long j, long j2) {
        C12799u uVar2 = uVar;
        C12193g gVar2 = gVar;
        if (gVar2 != null) {
            try {
                long j3 = gVar2.f32125a;
                long j4 = j <= 0 ? j2 : j;
                String str = null;
                if (C9431p.m18664a((String) null)) {
                    if (uVar2 != null) {
                        str = uVar2.f33551a.f33346a;
                    } else {
                        str = gVar2.f32132h.toString();
                    }
                }
                C14556g gVar3 = new C14556g();
                gVar3.f37819a = uVar2;
                gVar3.f37821c = str;
                if (this.f91206c != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", gVar2.f32130f);
                    jSONObject.put("retryCount", i);
                    this.f91206c.mo26790a(j4, j3, gVar3, bVar, th, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo23096a() {
        if (this.f91269e != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f91269e.cancel();
                return;
            }
            this.f91204a.execute(new C35513s(this));
        }
    }

    /* renamed from: a */
    public static String m80251a(C12799u<TypedInput> uVar) {
        String str;
        Pattern compile = Pattern.compile("max-age=\\d+");
        String str2 = null;
        try {
            List b = uVar.mo23959b();
            if (b != null && b.size() > 0) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C12685b bVar = (C12685b) it.next();
                    if ("Cache-Control".equals(bVar.f33318a)) {
                        str = bVar.f33319b;
                        break;
                    }
                }
            }
            str = null;
            if (str == null) {
                return null;
            }
            try {
                Matcher matcher = compile.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group();
                }
            } catch (Exception unused) {
                str2 = str;
            }
            return str2;
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    public final void mo23098b(final C12193g gVar, final C12173h hVar) {
        if (this.f91269e != null && gVar != null) {
            this.f91269e.enqueue(new C12757k<TypedInput>() {

                /* renamed from: a */
                C13297b f91272a;

                /* renamed from: b */
                long f91273b = -1;

                /* renamed from: a */
                public final void mo19942a(C12690b<TypedInput> bVar, C12799u<TypedInput> uVar) {
                }

                /* renamed from: a */
                public final void mo19943a(C12690b<TypedInput> bVar, Throwable th) {
                    Exception exc;
                    this.f91273b = System.currentTimeMillis();
                    long j = gVar.f32128d - gVar.f32125a;
                    long j2 = 0;
                    if (j <= 0) {
                        j2 = System.currentTimeMillis() - gVar.f32125a;
                    }
                    C35511r.this.mo73899a(null, gVar, th, hVar, j, j2);
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception(th.getMessage(), th.getCause());
                    }
                    m80260a(null, exc, this.f91272a, j, j2);
                    C35511r.this.mo73898a(hVar, th);
                }

                /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2 A[Catch:{ all -> 0x0115 }] */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo23905b(com.bytedance.retrofit2.C12690b<com.bytedance.retrofit2.mime.TypedInput> r23, com.bytedance.retrofit2.C12799u<com.bytedance.retrofit2.mime.TypedInput> r24) {
                    /*
                        r22 = this;
                        r9 = r22
                        r8 = r24
                        r1 = 0
                        r19 = 0
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r9.f91273b = r2     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.a.g r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0.f32127c = r2     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        if (r8 != 0) goto L_0x001c
                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r1)     // Catch:{ Throwable -> 0x001b }
                        return
                    L_0x001b:
                        return
                    L_0x001c:
                        T r0 = r8.f33552b     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        boolean r2 = r24.mo23960c()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        if (r2 != 0) goto L_0x006f
                        com.bytedance.lighten.a.g r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r2 = r0.f32128d     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.a.g r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r4 = r0.f32125a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0 = 0
                        long r15 = r2 - r4
                        int r0 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
                        if (r0 > 0) goto L_0x0042
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.a.g r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r4 = r0.f32125a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0 = 0
                        long r2 = r2 - r4
                        r17 = r2
                        goto L_0x0044
                    L_0x0042:
                        r17 = r19
                    L_0x0044:
                        java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.String r3 = "Unexpected HTTP code "
                        r2.<init>(r3)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r2.append(r8)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0.<init>(r2)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.ss.android.ugc.aweme.image.r r10 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.a.g r12 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.a.c.h r14 = r4     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r11 = r24
                        r13 = r0
                        r10.mo73899a(r11, r12, r13, r14, r15, r17)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.ss.android.ugc.aweme.image.r r2 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.a.c.h r3 = r4     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r2.mo73898a(r3, r0)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r1)     // Catch:{ Throwable -> 0x006e }
                        return
                    L_0x006e:
                        return
                    L_0x006f:
                        com.ss.android.ugc.aweme.image.r r2 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.ss.android.ugc.aweme.image.k r2 = r2.f91207d     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.io.InputStream r3 = r0.mo9554in()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.retrofit2.a.d r4 = r8.f33551a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.String r4 = r4.f33346a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r5 = r0.length()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        android.util.Pair r0 = r2.mo73893a(r3, r4, r5)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.Object r2 = r0.first     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r10 = r2
                        java.io.InputStream r10 = (java.io.InputStream) r10     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        long r0 = r0.longValue()     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        int r2 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
                        if (r2 < 0) goto L_0x00a7
                        com.bytedance.lighten.a.g r2 = r3     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        long r2 = r2.f32129e     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
                        if (r4 <= 0) goto L_0x00a5
                        int r2 = r24.mo23958a()     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r3 = 206(0xce, float:2.89E-43)
                        if (r2 == r3) goto L_0x00a5
                        goto L_0x00a7
                    L_0x00a5:
                        r11 = r0
                        goto L_0x00a9
                    L_0x00a7:
                        r11 = r19
                    L_0x00a9:
                        com.bytedance.lighten.a.g r0 = r3     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.ss.android.ugc.aweme.image.t r13 = new com.ss.android.ugc.aweme.image.t     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.bytedance.lighten.a.g r3 = r3     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r1 = r13
                        r2 = r22
                        r4 = r24
                        r5 = r11
                        r7 = r23
                        r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r0.f32134j = r13     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.bytedance.lighten.a.c.h r0 = r4     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        int r1 = (int) r11     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r0.mo23092a(r10, r1)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r10)     // Catch:{ Throwable -> 0x00c6 }
                        return
                    L_0x00c6:
                        return
                    L_0x00c7:
                        r0 = move-exception
                        r1 = r10
                        goto L_0x0118
                    L_0x00ca:
                        r0 = move-exception
                        r21 = r10
                        goto L_0x00d3
                    L_0x00ce:
                        r0 = move-exception
                        goto L_0x0118
                    L_0x00d0:
                        r0 = move-exception
                        r21 = r1
                    L_0x00d3:
                        com.bytedance.lighten.a.g r1 = r3     // Catch:{ all -> 0x0115 }
                        long r1 = r1.f32128d     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.a.g r3 = r3     // Catch:{ all -> 0x0115 }
                        long r3 = r3.f32125a     // Catch:{ all -> 0x0115 }
                        r5 = 0
                        long r5 = r1 - r3
                        int r1 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
                        if (r1 > 0) goto L_0x00ee
                        long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.a.g r3 = r3     // Catch:{ all -> 0x0115 }
                        long r3 = r3.f32125a     // Catch:{ all -> 0x0115 }
                        r7 = 0
                        long r1 = r1 - r3
                        r19 = r1
                    L_0x00ee:
                        com.ss.android.ugc.aweme.image.r r10 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.a.g r12 = r3     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.a.c.h r14 = r4     // Catch:{ all -> 0x0115 }
                        r11 = r24
                        r13 = r0
                        r15 = r5
                        r17 = r19
                        r10.mo73899a(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0115 }
                        com.bytedance.ttnet.c.b r4 = r9.f91272a     // Catch:{ all -> 0x0115 }
                        r1 = r22
                        r2 = r24
                        r3 = r0
                        r7 = r19
                        r1.m80260a(r2, r3, r4, r5, r7)     // Catch:{ all -> 0x0115 }
                        com.ss.android.ugc.aweme.image.r r1 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.a.c.h r2 = r4     // Catch:{ all -> 0x0115 }
                        r1.mo73898a(r2, r0)     // Catch:{ all -> 0x0115 }
                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r21)     // Catch:{ Throwable -> 0x0114 }
                        return
                    L_0x0114:
                        return
                    L_0x0115:
                        r0 = move-exception
                        r1 = r21
                    L_0x0118:
                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r1)     // Catch:{ Throwable -> 0x011b }
                    L_0x011b:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35511r.C355121.mo23905b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                }

                /* JADX WARNING: Can't wrap try/catch for region: R(8:(3:23|24|(2:26|(1:28)))|(1:34)(1:33)|(1:36)(1:37)|38|(4:40|(1:42)|43|(2:45|46))|47|48|49) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ba */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private void m80260a(com.bytedance.retrofit2.C12799u r12, java.lang.Exception r13, com.bytedance.ttnet.p885c.C13297b r14, long r15, long r17) {
                    /*
                        r11 = this;
                        r0 = r11
                        r2 = r12
                        r1 = r13
                        if (r1 != 0) goto L_0x0006
                        return
                    L_0x0006:
                        r3 = -1
                        boolean r4 = r1 instanceof com.facebook.net.C14557h.C14558a
                        if (r4 == 0) goto L_0x0014
                        com.facebook.net.h$a r1 = (com.facebook.net.C14557h.C14558a) r1
                        java.lang.Exception r3 = r1.f37831e
                        int r1 = r1.retryCount
                        r6 = r1
                        r4 = r3
                        goto L_0x0016
                    L_0x0014:
                        r4 = r1
                        r6 = -1
                    L_0x0016:
                        r1 = 1
                        boolean r3 = r4 instanceof com.bytedance.frameworks.baselib.network.http.p568a.C9836c
                        r5 = 0
                        if (r3 == 0) goto L_0x002a
                        r3 = r4
                        com.bytedance.frameworks.baselib.network.http.a.c r3 = (com.bytedance.frameworks.baselib.network.http.p568a.C9836c) r3
                        if (r3 == 0) goto L_0x002a
                        int r3 = r3.getStatusCode()
                        r7 = 304(0x130, float:4.26E-43)
                        if (r3 != r7) goto L_0x002a
                        r1 = 0
                    L_0x002a:
                        boolean r3 = r4 instanceof com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a
                        if (r3 == 0) goto L_0x004c
                        r3 = r4
                        com.bytedance.frameworks.baselib.network.http.cronet.a.a r3 = (com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a) r3
                        com.bytedance.frameworks.baselib.network.http.a r7 = r3.getRequestInfo()
                        boolean r8 = r7 instanceof com.bytedance.ttnet.p885c.C13297b
                        if (r8 == 0) goto L_0x003d
                        r3 = r7
                        com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p885c.C13297b) r3
                        goto L_0x004d
                    L_0x003d:
                        com.bytedance.ttnet.c.b r7 = new com.bytedance.ttnet.c.b
                        r7.<init>()
                        r7.f26772v = r5
                        java.lang.String r3 = r3.getRequestLog()
                        r7.f26774x = r3
                        r3 = r7
                        goto L_0x004d
                    L_0x004c:
                        r3 = r14
                    L_0x004d:
                        if (r1 == 0) goto L_0x00c6
                        if (r3 != 0) goto L_0x006a
                        com.ss.android.ugc.aweme.image.r r1 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f91269e     // Catch:{ Throwable -> 0x00c6 }
                        boolean r1 = r1 instanceof com.bytedance.retrofit2.C12759m     // Catch:{ Throwable -> 0x00c6 }
                        if (r1 == 0) goto L_0x006a
                        com.ss.android.ugc.aweme.image.r r1 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f91269e     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.m r1 = (com.bytedance.retrofit2.C12759m) r1     // Catch:{ Throwable -> 0x00c6 }
                        java.lang.Object r1 = r1.getRequestInfo()     // Catch:{ Throwable -> 0x00c6 }
                        boolean r5 = r1 instanceof com.bytedance.ttnet.p885c.C13297b     // Catch:{ Throwable -> 0x00c6 }
                        if (r5 == 0) goto L_0x006a
                        r3 = r1
                        com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p885c.C13297b) r3     // Catch:{ Throwable -> 0x00c6 }
                    L_0x006a:
                        if (r3 != 0) goto L_0x0087
                        com.ss.android.ugc.aweme.image.r r1 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f91269e     // Catch:{ Throwable -> 0x00c6 }
                        boolean r1 = r1 instanceof com.bytedance.retrofit2.C12758l     // Catch:{ Throwable -> 0x00c6 }
                        if (r1 == 0) goto L_0x0087
                        if (r2 == 0) goto L_0x0087
                        com.ss.android.ugc.aweme.image.r r1 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f91269e     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.l r1 = (com.bytedance.retrofit2.C12758l) r1     // Catch:{ Throwable -> 0x00c6 }
                        r1.doCollect()     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.a.d r1 = r2.f33551a     // Catch:{ Throwable -> 0x00c6 }
                        java.lang.Object r1 = r1.f33351f     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.ttnet.c.b r1 = (com.bytedance.ttnet.p885c.C13297b) r1     // Catch:{ Throwable -> 0x00c6 }
                        r5 = r1
                        goto L_0x0088
                    L_0x0087:
                        r5 = r3
                    L_0x0088:
                        if (r2 == 0) goto L_0x008f
                        java.util.List r1 = r12.mo23959b()     // Catch:{ Throwable -> 0x00c6 }
                        goto L_0x0090
                    L_0x008f:
                        r1 = 0
                    L_0x0090:
                        com.ss.android.ugc.aweme.image.r r3 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.ttnet.c.e r3 = r3.f91270f     // Catch:{ Throwable -> 0x00c6 }
                        com.p683ss.android.ugc.aweme.image.C35511r.m80252a(r5, r1, r3, r4)     // Catch:{ Throwable -> 0x00c6 }
                        if (r5 == 0) goto L_0x00ba
                        long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c6 }
                        r5.f26758h = r7     // Catch:{ Throwable -> 0x00c6 }
                        long r7 = r5.f26757g     // Catch:{ Throwable -> 0x00c6 }
                        r9 = 0
                        int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                        if (r1 > 0) goto L_0x00ab
                        long r7 = r0.f91273b     // Catch:{ Throwable -> 0x00c6 }
                        r5.f26757g = r7     // Catch:{ Throwable -> 0x00c6 }
                    L_0x00ab:
                        org.json.JSONObject r1 = r5.f26775y     // Catch:{ Throwable -> 0x00c6 }
                        if (r1 == 0) goto L_0x00ba
                        org.json.JSONObject r1 = r5.f26775y     // Catch:{ Throwable -> 0x00ba }
                        java.lang.String r3 = "ex"
                        java.lang.String r7 = r4.getMessage()     // Catch:{ Throwable -> 0x00ba }
                        r1.put(r3, r7)     // Catch:{ Throwable -> 0x00ba }
                    L_0x00ba:
                        com.ss.android.ugc.aweme.image.r r1 = com.p683ss.android.ugc.aweme.image.C35511r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.lighten.a.g r3 = r3     // Catch:{ Throwable -> 0x00c6 }
                        r2 = r12
                        r7 = r15
                        r9 = r17
                        r1.mo73900a(r2, r3, r4, r5, r6, r7, r9)     // Catch:{ Throwable -> 0x00c6 }
                        return
                    L_0x00c6:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35511r.C355121.m80260a(com.bytedance.retrofit2.u, java.lang.Exception, com.bytedance.ttnet.c.b, long, long):void");
                }
            });
        }
    }

    /* renamed from: a */
    private static void m80253a(String[] strArr, List<C12685b> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C12685b bVar : list) {
                        if ("x-net-info.remoteaddr".equals(bVar.f33318a)) {
                            strArr[0] = bVar.f33319b;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if ("request canceled".equals(r4.getMessage()) == false) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73898a(com.bytedance.lighten.p766a.p769c.C12173h r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0010
            java.lang.String r0 = "request canceled"
            java.lang.String r1 = r4.getMessage()     // Catch:{ Throwable -> 0x0024 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x0024 }
            if (r0 != 0) goto L_0x001c
        L_0x0010:
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f91269e     // Catch:{ Throwable -> 0x0024 }
            if (r0 == 0) goto L_0x0020
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f91269e     // Catch:{ Throwable -> 0x0024 }
            boolean r0 = r0.isCanceled()     // Catch:{ Throwable -> 0x0024 }
            if (r0 == 0) goto L_0x0020
        L_0x001c:
            r3.mo23091a()     // Catch:{ Throwable -> 0x0024 }
            goto L_0x0024
        L_0x0020:
            r3.mo23093a(r4)     // Catch:{ Throwable -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            return
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35511r.mo73898a(com.bytedance.lighten.a.c.h, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo23097a(C12193g gVar, C12173h hVar) {
        INetworkApi iNetworkApi;
        gVar.f32125a = System.currentTimeMillis();
        if (gVar.f32135k instanceof C14551d) {
            this.f91206c = (C14551d) gVar.f32135k;
        }
        Uri uri = gVar.f32132h;
        if (uri != null) {
            String a = this.f91207d.mo73894a(uri.toString());
            if (!C9431p.m18664a(a)) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair a2 = C9917l.m19876a(a, (Map<String, String>) linkedHashMap);
                    String str = (String) a2.first;
                    String str2 = (String) a2.second;
                    if (C14557h.m29810a().mo26794b()) {
                        iNetworkApi = (INetworkApi) C14557h.m29810a().mo26793a(str, INetworkApi.class);
                    } else {
                        iNetworkApi = (INetworkApi) C13333g.m26861a(str, INetworkApi.class);
                    }
                    INetworkApi iNetworkApi2 = iNetworkApi;
                    this.f91270f = new C14542b(gVar.f32136l);
                    LinkedList linkedList = null;
                    if (gVar.f32129e > 0) {
                        linkedList = new LinkedList();
                        StringBuilder sb = new StringBuilder("bytes=");
                        sb.append(gVar.f32129e);
                        sb.append("-");
                        linkedList.add(new C12685b("Range", sb.toString()));
                    }
                    LinkedList linkedList2 = linkedList;
                    if (iNetworkApi2 != null) {
                        this.f91269e = iNetworkApi2.downloadFile(false, -1, str2, linkedHashMap, linkedList2, this.f91270f);
                    }
                } catch (Exception e) {
                    mo73899a(null, gVar, e, hVar, 0, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m80252a(C9831a aVar, List<C12685b> list, C13302e eVar, Exception exc) {
        if (aVar != null) {
            try {
                if (C9431p.m18664a(aVar.f26751a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (C12685b bVar : list) {
                            if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f33318a)) {
                                str = bVar.f33319b;
                            }
                        }
                    }
                    if (C9431p.m18664a(str) && eVar != null) {
                        str = eVar.f26778a;
                    }
                    if (C9431p.m18664a(str)) {
                        str = C35481a.m80195a(exc);
                    }
                    if (!C9431p.m18664a(str) && aVar != null) {
                        aVar.f26751a = str;
                        if (aVar.f26752b != null) {
                            aVar.f26752b.f26778a = str;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo73899a(C12799u uVar, C12193g gVar, Throwable th, C12173h hVar, long j, long j2) {
        long j3;
        C13297b bVar;
        String uri;
        C12799u uVar2 = uVar;
        C12193g gVar2 = gVar;
        Throwable th2 = th;
        if (gVar2 != null) {
            try {
                String[] strArr = new String[1];
                if (!(uVar2 == null || uVar2 == null)) {
                    m80253a(strArr, uVar.mo23959b());
                }
                if (C9431p.m18664a(strArr[0])) {
                    strArr[0] = C35481a.m80195a(th);
                }
                long j4 = gVar2.f32125a;
                if (j <= 0) {
                    j3 = j2;
                } else {
                    j3 = j;
                }
                String str = null;
                if (C9431p.m18664a((String) null)) {
                    if (uVar2 != null) {
                        uri = uVar2.f33551a.f33346a;
                    } else {
                        uri = gVar2.f32132h.toString();
                    }
                    str = uri;
                }
                if (th2 instanceof C9872a) {
                    C9831a requestInfo = ((C9872a) th2).getRequestInfo();
                    if (requestInfo instanceof C13297b) {
                        bVar = (C13297b) requestInfo;
                    } else {
                        bVar = new C13297b();
                        bVar.f26772v = 0;
                        bVar.f26774x = ((C9872a) th2).getRequestLog();
                    }
                } else {
                    bVar = new C13297b();
                }
                C13297b bVar2 = bVar;
                bVar2.f26751a = strArr[0];
                if (this.f91205b != null) {
                    this.f91205b.mo73887a(j3, j4, str, bVar2, th, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
