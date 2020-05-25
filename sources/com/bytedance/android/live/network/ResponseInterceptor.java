package com.bytedance.android.live.network;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class ResponseInterceptor implements C12727a {
    ResponseInterceptor() {
    }

    /* renamed from: a */
    private static JSONObject m10303a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C12799u mo9545b(C12728a aVar) throws Exception {
        C12686c a = aVar.mo23899a();
        C12799u a2 = aVar.mo23900a(a);
        m10304a(a, a2);
        return a2;
    }

    /* renamed from: a */
    private static String m10301a(C12799u uVar) {
        List b = uVar.f33551a.mo23867b("X-Tt-Logid");
        if (b == null || b.size() <= 0) {
            return "";
        }
        return ((C12685b) b.get(0)).f33319b;
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo9545b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo9545b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cc, code lost:
        if (com.bytedance.android.live.network.p251a.C4149a.m10312a().mo9549a().contains(r7.getPath()) != false) goto L_0x015e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10304a(com.bytedance.retrofit2.p830a.C12686c r13, com.bytedance.retrofit2.C12799u r14) throws java.lang.Exception {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L_0x015e
            if (r13 != 0) goto L_0x0008
            goto L_0x015e
        L_0x0008:
            com.bytedance.retrofit2.a.d r2 = r14.f33551a
            if (r2 == 0) goto L_0x015e
            int r3 = r2.f33347b
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x015e
            T r4 = r14.f33552b
            java.lang.String r5 = r13.f33321b
            r6 = 2132551178(0x7f1c260a, float:2.0755708E38)
            java.lang.String r6 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r6)
            boolean r7 = r4 instanceof com.bytedance.android.live.network.response.C4178e
            if (r7 == 0) goto L_0x0034
            com.bytedance.android.live.network.response.e r4 = (com.bytedance.android.live.network.response.C4178e) r4
            int r7 = r4.f11375a
            T r8 = r4.f11376b
            boolean r8 = r8 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            if (r8 == 0) goto L_0x0031
            T r4 = r4.f11376b
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r4
            java.lang.String r6 = r4.message
        L_0x0031:
            r4 = r7
            goto L_0x00a6
        L_0x0034:
            boolean r7 = r4 instanceof com.bytedance.retrofit2.p830a.C12688d
            if (r7 == 0) goto L_0x003e
            com.bytedance.retrofit2.a.d r4 = (com.bytedance.retrofit2.p830a.C12688d) r4
            int r4 = r4.f33347b
            goto L_0x00a6
        L_0x003e:
            boolean r7 = r4 instanceof com.bytedance.android.live.network.response.C4176c
            if (r7 == 0) goto L_0x0048
            com.bytedance.android.live.network.response.c r4 = (com.bytedance.android.live.network.response.C4176c) r4
            int r4 = r4.f11364a
            goto L_0x00a6
        L_0x0048:
            boolean r7 = r4 instanceof com.bytedance.android.live.core.p226e.p227a.C3841c
            if (r7 == 0) goto L_0x005d
            com.bytedance.android.live.core.e.a.c r4 = (com.bytedance.android.live.core.p226e.p227a.C3841c) r4
            com.bytedance.android.live.core.e.a.b r4 = r4.f10820c
            if (r4 == 0) goto L_0x0057
            int r6 = r4.f10815a
            java.lang.String r4 = r4.f10816b
            goto L_0x0059
        L_0x0057:
            r4 = r6
            r6 = 0
        L_0x0059:
            r11 = r6
            r6 = r4
            r4 = r11
            goto L_0x00a6
        L_0x005d:
            boolean r7 = r4 instanceof com.bytedance.android.live.core.p226e.p227a.C3839a
            if (r7 == 0) goto L_0x006c
            com.bytedance.android.live.core.e.a.a r4 = (com.bytedance.android.live.core.p226e.p227a.C3839a) r4
            com.bytedance.android.live.core.e.a.b r4 = r4.f10814c
            if (r4 == 0) goto L_0x0057
            int r6 = r4.f10815a
            java.lang.String r4 = r4.f10816b
            goto L_0x0059
        L_0x006c:
            boolean r7 = r4 instanceof com.bytedance.android.live.network.response.C4172a
            if (r7 == 0) goto L_0x0075
            com.bytedance.android.live.network.response.a r4 = (com.bytedance.android.live.network.response.C4172a) r4
            int r4 = r4.f11364a
            goto L_0x00a6
        L_0x0075:
            boolean r7 = r4 instanceof com.bytedance.android.live.network.response.C4175b
            if (r7 == 0) goto L_0x007e
            com.bytedance.android.live.network.response.b r4 = (com.bytedance.android.live.network.response.C4175b) r4
            int r4 = r4.statusCode
            goto L_0x00a6
        L_0x007e:
            boolean r7 = r4 instanceof java.lang.String
            if (r7 == 0) goto L_0x00a5
            java.lang.String r4 = (java.lang.String) r4
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto L_0x00a5
            org.json.JSONObject r4 = m10303a(r4)
            java.lang.String r6 = "status_code"
            if (r4 != 0) goto L_0x0094
            r6 = 0
            goto L_0x0098
        L_0x0094:
            int r6 = r4.optInt(r6, r1)
        L_0x0098:
            java.lang.String r7 = "message"
            java.lang.String r8 = ""
            if (r4 != 0) goto L_0x00a0
            r4 = r8
            goto L_0x0059
        L_0x00a0:
            java.lang.String r4 = r4.optString(r7, r8)
            goto L_0x0059
        L_0x00a5:
            r4 = 0
        L_0x00a6:
            if (r4 == 0) goto L_0x015e
            android.net.Uri r7 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00d0 }
            com.bytedance.android.live.network.a.c r8 = com.bytedance.android.live.network.p251a.C4149a.m10312a()     // Catch:{ Exception -> 0x00d0 }
            if (r8 == 0) goto L_0x00d0
            com.bytedance.android.live.network.a.c r8 = com.bytedance.android.live.network.p251a.C4149a.m10312a()     // Catch:{ Exception -> 0x00d0 }
            java.util.List r8 = r8.mo9549a()     // Catch:{ Exception -> 0x00d0 }
            if (r8 == 0) goto L_0x00d0
            com.bytedance.android.live.network.a.c r8 = com.bytedance.android.live.network.p251a.C4149a.m10312a()     // Catch:{ Exception -> 0x00d0 }
            java.util.List r8 = r8.mo9549a()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r7 = r7.getPath()     // Catch:{ Exception -> 0x00d0 }
            boolean r7 = r8.contains(r7)     // Catch:{ Exception -> 0x00d0 }
            if (r7 == 0) goto L_0x00d0
            goto L_0x015e
        L_0x00d0:
            java.lang.String r7 = ""
            java.util.List<com.bytedance.retrofit2.a.b> r2 = r2.f33349d
            if (r2 == 0) goto L_0x00fb
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L_0x00fb
            java.util.Iterator r2 = r2.iterator()
        L_0x00e0:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00fb
            java.lang.Object r8 = r2.next()
            com.bytedance.retrofit2.a.b r8 = (com.bytedance.retrofit2.p830a.C12685b) r8
            if (r8 == 0) goto L_0x00e0
            java.lang.String r9 = "x-tt-Logid"
            java.lang.String r10 = r8.f33318a
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L_0x00e0
            java.lang.String r7 = r8.f33319b
            goto L_0x00e0
        L_0x00fb:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r8 = "xLogId"
            m10306a(r2, r8, r7)
            java.lang.String r8 = "code"
            m10305a(r2, r8, r3)
            java.lang.String r8 = "status_code"
            m10305a(r2, r8, r4)
            java.lang.String r8 = "url"
            m10306a(r2, r8, r5)
            java.lang.String r8 = "message"
            m10306a(r2, r8, r6)
            java.lang.String r8 = "classes"
            java.lang.String r9 = "com.bytedance.android.livesdk.network.ResponseInterceptor"
            m10306a(r2, r8, r9)
            java.lang.String r8 = "ttlive_net"
            r9 = 0
            java.lang.String r2 = m10302a(r8, r2, r9)
            com.bytedance.android.live.core.p224c.C3831a.m9707a(r8, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r8 = "xLogId"
            m10306a(r2, r8, r7)
            java.lang.String r7 = "code"
            m10305a(r2, r7, r3)
            java.lang.String r3 = "status_code"
            m10305a(r2, r3, r4)
            android.net.Uri r3 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "host"
            java.lang.String r5 = r3.getHost()     // Catch:{ Exception -> 0x0154 }
            m10306a(r2, r4, r5)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "path"
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0154 }
            m10306a(r2, r4, r3)     // Catch:{ Exception -> 0x0154 }
        L_0x0154:
            java.lang.String r3 = "message"
            m10306a(r2, r3, r6)
            java.lang.String r3 = "ttlive_network_request_error"
            com.bytedance.android.live.core.p225d.C3837e.m9749b(r3, r0, r2)
        L_0x015e:
            T r2 = r14.f33552b
            boolean r3 = r2 instanceof com.bytedance.android.live.network.response.C4178e
            if (r3 == 0) goto L_0x01a5
            com.bytedance.android.live.network.response.e r2 = (com.bytedance.android.live.network.response.C4178e) r2
            int r0 = r2.f11375a
            if (r0 == 0) goto L_0x01a4
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11378d
            if (r0 != 0) goto L_0x0175
            com.bytedance.android.live.network.response.RequestError r0 = new com.bytedance.android.live.network.response.RequestError
            r0.<init>()
            r2.f11378d = r0
        L_0x0175:
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11378d
            java.lang.String r13 = r13.f33321b
            r0.url = r13
            com.bytedance.android.live.network.response.RequestError r13 = r2.f11378d
            T r0 = r2.f11376b
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            java.lang.String r0 = r0.message
            r13.message = r0
            com.bytedance.android.live.network.response.RequestError r13 = r2.f11378d
            T r0 = r2.f11376b
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            java.lang.String r0 = r0.prompts
            r13.prompts = r0
            int r13 = r2.f11375a
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11378d
            com.google.gson.f r1 = com.bytedance.android.live.C2942b.m8369a()
            java.lang.Object r2 = r2.f11377c
            java.lang.String r1 = r1.mo34889b(r2)
            java.lang.String r14 = m10301a(r14)
            com.bytedance.android.live.network.p252b.C4153a.m10317a(r13, r0, r1, r14)
        L_0x01a4:
            return
        L_0x01a5:
            boolean r3 = r2 instanceof com.bytedance.android.live.network.response.C4177d
            if (r3 == 0) goto L_0x01ce
            com.bytedance.android.live.network.response.d r2 = (com.bytedance.android.live.network.response.C4177d) r2
            int r0 = r2.statusCode
            if (r0 == 0) goto L_0x01cd
            com.bytedance.android.live.network.response.RequestError r0 = r2.error
            if (r0 != 0) goto L_0x01ba
            com.bytedance.android.live.network.response.RequestError r0 = new com.bytedance.android.live.network.response.RequestError
            r0.<init>()
            r2.error = r0
        L_0x01ba:
            com.bytedance.android.live.network.response.RequestError r0 = r2.error
            java.lang.String r13 = r13.f33321b
            r0.url = r13
            int r13 = r2.statusCode
            com.bytedance.android.live.network.response.RequestError r0 = r2.error
            com.bytedance.android.live.base.model.Extra r1 = r2.extra
            java.lang.String r14 = m10301a(r14)
            com.bytedance.android.live.network.p252b.C4153a.m10316a(r13, r0, r1, r14)
        L_0x01cd:
            return
        L_0x01ce:
            boolean r3 = r2 instanceof com.bytedance.android.live.network.response.C4176c
            if (r3 == 0) goto L_0x01f7
            com.bytedance.android.live.network.response.c r2 = (com.bytedance.android.live.network.response.C4176c) r2
            int r0 = r2.f11364a
            if (r0 == 0) goto L_0x01f6
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11367d
            if (r0 != 0) goto L_0x01e3
            com.bytedance.android.live.network.response.RequestError r0 = new com.bytedance.android.live.network.response.RequestError
            r0.<init>()
            r2.f11367d = r0
        L_0x01e3:
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11367d
            java.lang.String r13 = r13.f33321b
            r0.url = r13
            int r13 = r2.f11364a
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11367d
            com.bytedance.android.live.base.model.Extra r1 = r2.f11366c
            java.lang.String r14 = m10301a(r14)
            com.bytedance.android.live.network.p252b.C4153a.m10316a(r13, r0, r1, r14)
        L_0x01f6:
            return
        L_0x01f7:
            boolean r3 = r2 instanceof com.bytedance.android.live.core.p226e.p227a.C3841c
            if (r3 == 0) goto L_0x021f
            com.bytedance.android.live.core.e.a.c r2 = (com.bytedance.android.live.core.p226e.p227a.C3841c) r2
            java.lang.String r0 = r2.f10819b
            java.lang.String r1 = "success"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x021e
            com.bytedance.android.live.core.e.a.b r0 = r2.f10820c
            if (r0 == 0) goto L_0x021e
            com.bytedance.android.live.core.e.a.b r0 = r2.f10820c
            java.lang.String r13 = r13.f33321b
            r0.f10817c = r13
            com.bytedance.android.live.core.e.a.b r13 = r2.f10820c
            int r13 = r13.f10815a
            com.bytedance.android.live.core.e.a.b r0 = r2.f10820c
            java.lang.String r14 = m10301a(r14)
            com.bytedance.android.live.network.p252b.C4153a.m10315a(r13, r0, r14)
        L_0x021e:
            return
        L_0x021f:
            boolean r3 = r2 instanceof com.bytedance.android.live.core.p226e.p227a.C3839a
            if (r3 == 0) goto L_0x0247
            com.bytedance.android.live.core.e.a.a r2 = (com.bytedance.android.live.core.p226e.p227a.C3839a) r2
            java.lang.String r0 = r2.f10813b
            java.lang.String r1 = "success"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0246
            com.bytedance.android.live.core.e.a.b r0 = r2.f10814c
            if (r0 == 0) goto L_0x0246
            com.bytedance.android.live.core.e.a.b r0 = r2.f10814c
            java.lang.String r13 = r13.f33321b
            r0.f10817c = r13
            com.bytedance.android.live.core.e.a.b r13 = r2.f10814c
            int r13 = r13.f10815a
            com.bytedance.android.live.core.e.a.b r0 = r2.f10814c
            java.lang.String r14 = m10301a(r14)
            com.bytedance.android.live.network.p252b.C4153a.m10315a(r13, r0, r14)
        L_0x0246:
            return
        L_0x0247:
            boolean r3 = r2 instanceof com.bytedance.android.live.network.response.C4172a
            if (r3 == 0) goto L_0x027c
            com.bytedance.android.live.network.response.a r2 = (com.bytedance.android.live.network.response.C4172a) r2
            int r0 = r2.f11364a
            if (r0 == 0) goto L_0x0271
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11367d
            if (r0 != 0) goto L_0x025c
            com.bytedance.android.live.network.response.RequestError r0 = new com.bytedance.android.live.network.response.RequestError
            r0.<init>()
            r2.f11367d = r0
        L_0x025c:
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11367d
            java.lang.String r13 = r13.f33321b
            r0.url = r13
            int r13 = r2.f11364a
            com.bytedance.android.live.network.response.RequestError r0 = r2.f11367d
            R r1 = r2.f11366c
            java.lang.String r14 = m10301a(r14)
            com.bytedance.android.live.network.p252b.C4153a.m10316a(r13, r0, r1, r14)
            goto L_0x032d
        L_0x0271:
            java.util.List<T> r13 = r2.f11365b
            if (r13 == 0) goto L_0x0276
            return
        L_0x0276:
            com.bytedance.android.live.b.a.a.c r13 = new com.bytedance.android.live.b.a.a.c
            r13.<init>()
            throw r13
        L_0x027c:
            boolean r3 = r2 instanceof com.bytedance.android.live.network.response.C4175b
            if (r3 == 0) goto L_0x02b1
            com.bytedance.android.live.network.response.b r2 = (com.bytedance.android.live.network.response.C4175b) r2
            int r0 = r2.statusCode
            if (r0 == 0) goto L_0x02a6
            com.bytedance.android.live.network.response.RequestError r0 = r2.error
            if (r0 != 0) goto L_0x0291
            com.bytedance.android.live.network.response.RequestError r0 = new com.bytedance.android.live.network.response.RequestError
            r0.<init>()
            r2.error = r0
        L_0x0291:
            com.bytedance.android.live.network.response.RequestError r0 = r2.error
            java.lang.String r13 = r13.f33321b
            r0.url = r13
            int r13 = r2.statusCode
            com.bytedance.android.live.network.response.RequestError r0 = r2.error
            R r1 = r2.extra
            java.lang.String r14 = m10301a(r14)
            com.bytedance.android.live.network.p252b.C4153a.m10316a(r13, r0, r1, r14)
            goto L_0x032d
        L_0x02a6:
            T r13 = r2.data
            if (r13 == 0) goto L_0x02ab
            return
        L_0x02ab:
            com.bytedance.android.live.b.a.a.c r13 = new com.bytedance.android.live.b.a.a.c
            r13.<init>(r2)
            throw r13
        L_0x02b1:
            boolean r13 = r2 instanceof java.lang.String
            if (r13 == 0) goto L_0x032d
            java.lang.String r2 = (java.lang.String) r2
            boolean r13 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r13 != 0) goto L_0x0327
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>(r2)
            java.lang.String r14 = "data"
            boolean r14 = r13.has(r14)
            if (r14 == 0) goto L_0x0321
            java.lang.String r14 = "status_code"
            boolean r14 = r13.has(r14)
            if (r14 == 0) goto L_0x02db
            java.lang.String r14 = "status_code"
            int r14 = r13.optInt(r14)
            if (r14 != 0) goto L_0x02db
            goto L_0x02dc
        L_0x02db:
            r0 = 0
        L_0x02dc:
            if (r0 == 0) goto L_0x02df
            goto L_0x032d
        L_0x02df:
            java.lang.String r14 = "data"
            org.json.JSONObject r14 = r13.optJSONObject(r14)
            com.bytedance.android.live.b.a.b.a r0 = new com.bytedance.android.live.b.a.b.a
            java.lang.String r1 = "status_code"
            int r1 = r13.optInt(r1)
            r0.<init>(r1)
            java.lang.String r1 = "message"
            java.lang.String r2 = ""
            java.lang.String r1 = r14.optString(r1, r2)
            com.bytedance.android.live.b.a.b.a r0 = r0.setErrorMsg(r1)
            java.lang.String r1 = "prompts"
            java.lang.String r2 = ""
            java.lang.String r1 = r14.optString(r1, r2)
            com.bytedance.android.live.b.a.b.a r0 = r0.setPrompt(r1)
            java.lang.String r1 = "extra"
            java.lang.String r2 = ""
            java.lang.String r13 = r13.optString(r1, r2)
            com.bytedance.android.live.b.a.b.a r13 = r0.setExtra(r13)
            java.lang.String r0 = "alert"
            java.lang.String r1 = ""
            java.lang.String r14 = r14.optString(r0, r1)
            com.bytedance.android.live.b.a.b.a r13 = r13.setAlert(r14)
            throw r13
        L_0x0321:
            com.bytedance.android.live.b.a.a.c r13 = new com.bytedance.android.live.b.a.a.c
            r13.<init>()
            throw r13
        L_0x0327:
            com.bytedance.android.live.b.a.a.b r13 = new com.bytedance.android.live.b.a.a.b
            r13.<init>()
            throw r13
        L_0x032d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.network.ResponseInterceptor.m10304a(com.bytedance.retrofit2.a.c, com.bytedance.retrofit2.u):void");
    }

    /* renamed from: a */
    private static void m10305a(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static String m10302a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("tag", str);
            jSONObject3.put("data", jSONObject.toString());
        } catch (JSONException unused) {
        }
        return jSONObject3.toString();
    }

    /* renamed from: a */
    private static void m10306a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
