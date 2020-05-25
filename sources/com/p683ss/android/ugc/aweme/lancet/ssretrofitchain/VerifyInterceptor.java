package com.p683ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor */
public class VerifyInterceptor implements C12727a {

    /* renamed from: a */
    private static final boolean f91975a = false;

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo74475b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo74475b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.C12799u mo74475b(com.bytedance.retrofit2.p833c.C12727a.C12728a r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.bytedance.retrofit2.a.c r0 = r9.mo23899a()
            r1 = 0
            com.bytedance.retrofit2.u r2 = r9.mo23900a(r0)     // Catch:{ a -> 0x0052 }
            boolean r3 = r0.f33326g     // Catch:{ a -> 0x0050 }
            r4 = 1
            if (r3 == 0) goto L_0x000f
            goto L_0x0046
        L_0x000f:
            com.bytedance.retrofit2.a.d r3 = r2.f33551a     // Catch:{ a -> 0x0050 }
            java.lang.String r5 = "Content-Type"
            com.bytedance.retrofit2.a.b r3 = r3.mo23865a(r5)     // Catch:{ a -> 0x0050 }
            java.lang.String r5 = r0.mo23860c()     // Catch:{ a -> 0x0050 }
            if (r3 == 0) goto L_0x0046
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ a -> 0x0050 }
            if (r6 != 0) goto L_0x0034
            java.lang.String r6 = "/effect/api"
            boolean r6 = r5.contains(r6)     // Catch:{ a -> 0x0050 }
            if (r6 != 0) goto L_0x0046
            java.lang.String r6 = "/model/api"
            boolean r5 = r5.contains(r6)     // Catch:{ a -> 0x0050 }
            if (r5 == 0) goto L_0x0034
            goto L_0x0046
        L_0x0034:
            java.lang.String r3 = r3.f33319b     // Catch:{ a -> 0x0050 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ a -> 0x0050 }
            if (r5 != 0) goto L_0x0045
            java.lang.String r5 = "json"
            boolean r3 = r3.contains(r5)     // Catch:{ a -> 0x0050 }
            if (r3 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x0049
            return r2
        L_0x0049:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f r3 = com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.m80942a(r2)     // Catch:{ a -> 0x0050 }
            if (r3 != 0) goto L_0x0075
            return r2
        L_0x0050:
            r1 = move-exception
            goto L_0x0056
        L_0x0052:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
        L_0x0056:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a r3 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a
            r3.<init>()
            int r4 = r1.getErrorCode()
            r3.f91998a = r4
            java.lang.String r4 = r1.getErrorMsg()
            r3.f91999b = r4
            java.lang.String r4 = r1.getPrompt()
            r3.f92000c = r4
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f r4 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.f
            r5 = -1
            r4.<init>(r3, r5)
            r3 = r4
        L_0x0075:
            if (r3 != 0) goto L_0x007b
            if (r1 != 0) goto L_0x007a
            return r2
        L_0x007a:
            throw r1
        L_0x007b:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.b r4 = com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35817b.m80950a()
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a r3 = r4.mo74483b(r3, r0, r2)
            boolean r4 = r3.f91992a
            if (r4 == 0) goto L_0x0103
            java.lang.String r4 = r0.f33321b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0103
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f91994c
            if (r1 != 0) goto L_0x00a2
            com.bytedance.retrofit2.a.c$a r1 = r0.mo23858b()
            java.lang.String r0 = r0.f33321b
            com.bytedance.retrofit2.a.c$a r0 = r1.mo23861a(r0)
            com.bytedance.retrofit2.a.c r0 = r0.mo23864a()
            goto L_0x00fe
        L_0x00a2:
            java.lang.String r1 = r0.f33321b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.f91994c
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ea
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00b6
            java.lang.Object r4 = r3.getValue()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00b6
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r1.appendQueryParameter(r4, r3)
            goto L_0x00b6
        L_0x00ea:
            com.bytedance.retrofit2.a.c$a r0 = r0.mo23858b()
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            com.bytedance.retrofit2.a.c$a r0 = r0.mo23861a(r1)
            com.bytedance.retrofit2.a.c r0 = r0.mo23864a()
        L_0x00fe:
            com.bytedance.retrofit2.u r9 = r9.mo23900a(r0)
            return r9
        L_0x0103:
            if (r1 != 0) goto L_0x0106
            return r2
        L_0x0106:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor.mo74475b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }
}
