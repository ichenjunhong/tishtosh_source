package com.facebook.net;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

class RetryInterceptManager$1 implements C12727a {

    /* renamed from: a */
    final /* synthetic */ C14557h f37775a;

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo26782b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo26782b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ed A[EDGE_INSN: B:51:0x00ed->B:48:0x00ed ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.C12799u mo26782b(com.bytedance.retrofit2.p833c.C12727a.C12728a r18) throws java.lang.Exception {
        /*
            r17 = this;
            r1 = r17
            r2 = 0
            r3 = 0
        L_0x0004:
            r4 = 1
            com.bytedance.retrofit2.a.c r0 = r18.mo23899a()     // Catch:{ Exception -> 0x009f }
            java.lang.Object r5 = r0.f33329j     // Catch:{ Exception -> 0x009f }
            boolean r6 = r5 instanceof com.facebook.net.C14542b     // Catch:{ Exception -> 0x009f }
            if (r6 == 0) goto L_0x0047
            com.facebook.net.b r5 = (com.facebook.net.C14542b) r5     // Catch:{ Exception -> 0x009f }
            java.util.List<android.net.Uri> r5 = r5.f37777s     // Catch:{ Exception -> 0x009f }
            if (r5 == 0) goto L_0x0047
            int r6 = r5.size()     // Catch:{ Exception -> 0x009f }
            int r6 = r6 - r4
            if (r6 < r3) goto L_0x0047
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x009f }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ Exception -> 0x009f }
            boolean r6 = com.facebook.common.p927k.C13731f.m27778b(r5)     // Catch:{ Exception -> 0x009f }
            if (r6 == 0) goto L_0x0047
            com.bytedance.retrofit2.a.c r6 = new com.bytedance.retrofit2.a.c     // Catch:{ Exception -> 0x009f }
            java.lang.String r8 = r0.f33320a     // Catch:{ Exception -> 0x009f }
            java.lang.String r9 = r5.toString()     // Catch:{ Exception -> 0x009f }
            java.util.List<com.bytedance.retrofit2.a.b> r10 = r0.f33322c     // Catch:{ Exception -> 0x009f }
            com.bytedance.retrofit2.mime.TypedOutput r11 = r0.mo23857a()     // Catch:{ Exception -> 0x009f }
            int r12 = r0.f33325f     // Catch:{ Exception -> 0x009f }
            boolean r13 = r0.f33326g     // Catch:{ Exception -> 0x009f }
            int r14 = r0.f33327h     // Catch:{ Exception -> 0x009f }
            boolean r15 = r0.f33328i     // Catch:{ Exception -> 0x009f }
            java.lang.Object r0 = r0.f33329j     // Catch:{ Exception -> 0x009f }
            r7 = r6
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x009f }
            r0 = r6
        L_0x0047:
            com.facebook.net.h r5 = r1.f37775a     // Catch:{ Exception -> 0x009f }
            boolean r5 = r5.mo26794b()     // Catch:{ Exception -> 0x009f }
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r0.f33329j     // Catch:{ Exception -> 0x009f }
            boolean r6 = r5 instanceof com.bytedance.ttnet.p885c.C13302e     // Catch:{ Exception -> 0x009f }
            if (r6 == 0) goto L_0x0058
            com.bytedance.ttnet.c.e r5 = (com.bytedance.ttnet.p885c.C13302e) r5     // Catch:{ Exception -> 0x009f }
            goto L_0x005d
        L_0x0058:
            com.bytedance.ttnet.c.e r5 = new com.bytedance.ttnet.c.e     // Catch:{ Exception -> 0x009f }
            r5.<init>()     // Catch:{ Exception -> 0x009f }
        L_0x005d:
            com.facebook.net.h r6 = r1.f37775a     // Catch:{ Exception -> 0x009f }
            java.util.ArrayList<java.lang.Integer> r6 = r6.f37823a     // Catch:{ Exception -> 0x009f }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ Exception -> 0x009f }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x009f }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x009f }
            long r6 = (long) r6     // Catch:{ Exception -> 0x009f }
            r5.f26780c = r6     // Catch:{ Exception -> 0x009f }
            com.facebook.net.h r6 = r1.f37775a     // Catch:{ Exception -> 0x009f }
            java.util.ArrayList<java.lang.Integer> r6 = r6.f37824b     // Catch:{ Exception -> 0x009f }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ Exception -> 0x009f }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x009f }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x009f }
            long r6 = (long) r6     // Catch:{ Exception -> 0x009f }
            r5.f26781d = r6     // Catch:{ Exception -> 0x009f }
            r0.f33329j = r5     // Catch:{ Exception -> 0x009f }
        L_0x0081:
            r5 = r18
            com.bytedance.retrofit2.u r0 = r5.mo23900a(r0)     // Catch:{ Exception -> 0x009d }
            boolean r2 = r0 instanceof com.bytedance.retrofit2.C12799u     // Catch:{ Exception -> 0x009c }
            if (r2 == 0) goto L_0x009c
            com.bytedance.retrofit2.a.d r2 = r0.f33551a     // Catch:{ Exception -> 0x009c }
            java.lang.Object r2 = r2.f33351f     // Catch:{ Exception -> 0x009c }
            boolean r4 = r2 instanceof com.bytedance.ttnet.p885c.C13297b     // Catch:{ Exception -> 0x009c }
            if (r4 == 0) goto L_0x009c
            com.bytedance.ttnet.c.b r2 = (com.bytedance.ttnet.p885c.C13297b) r2     // Catch:{ Exception -> 0x009c }
            org.json.JSONObject r2 = r2.f26775y     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = "retryCount"
            r2.put(r4, r3)     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            return r0
        L_0x009d:
            r0 = move-exception
            goto L_0x00a2
        L_0x009f:
            r0 = move-exception
            r5 = r18
        L_0x00a2:
            com.facebook.net.h r6 = r1.f37775a
            boolean r6 = r6.mo26794b()
            if (r6 == 0) goto L_0x00ed
            java.lang.String r6 = r0.getMessage()
            java.lang.String r7 = "request canceled"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x00c7
            java.lang.String r7 = "Canceled"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x00c7
            java.lang.String r7 = "network not available"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            if (r4 == 0) goto L_0x00ed
            int r3 = r3 + 1
            com.facebook.net.h r4 = r1.f37775a
            int r4 = r4.f37825c
            if (r3 >= r4) goto L_0x00e7
            java.lang.String r0 = "RetryInterceptManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "[intercept] retryNum: "
            r4.<init>(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.p683ss.p2544b.p2545a.C51151a.m110022d(r0, r4)
            goto L_0x0004
        L_0x00e7:
            com.facebook.net.h$a r2 = new com.facebook.net.h$a
            r2.<init>(r0, r3)
            throw r2
        L_0x00ed:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.RetryInterceptManager$1.mo26782b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }
}
