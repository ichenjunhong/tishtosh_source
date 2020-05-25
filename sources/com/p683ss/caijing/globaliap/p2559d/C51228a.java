package com.p683ss.caijing.globaliap.p2559d;

import android.content.Context;
import com.p683ss.caijing.globaliap.p2557b.C51224b;

/* renamed from: com.ss.caijing.globaliap.d.a */
public final class C51228a implements C51224b {

    /* renamed from: a */
    private Context f127938a;

    /* renamed from: a */
    public final String mo101752a() {
        return "GoogleConfirmTask";
    }

    /* JADX INFO: used method not loaded: com.ss.caijing.globaliap.f.b.a(java.lang.String, boolean, boolean):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        com.p683ss.caijing.globaliap.p2563f.C51283b.m110252a(r4, false, true);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            android.content.Context r0 = r10.f127938a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r0 = r10.f127938a
            java.lang.String r0 = com.p683ss.base.p2547b.C51160c.m110046a(r0)
            java.lang.String r1 = "confirm_task"
            com.p683ss.caijing.globaliap.p2563f.C51283b.m110249a(r0, r1)
            android.content.Context r0 = r10.f127938a
            java.util.Map r0 = com.p683ss.caijing.globaliap.p2559d.C51267i.m110213a(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001d
            return
        L_0x001d:
            java.util.Set r1 = r0.keySet()
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0042
            int r2 = r1.size()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "size"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r2.toString()
            r3.put(r4, r2)
            java.lang.String r2 = "caijing_iap_google_background_confirm_size"
            com.p683ss.caijing.globaliap.p2563f.C51284c.m110260a(r2, r3)
        L_0x0042:
            java.util.Iterator r1 = r1.iterator()
        L_0x0046:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d3
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r0.get(r2)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 == 0) goto L_0x0046
            java.lang.String r3 = com.p683ss.caijing.globaliap.p2559d.C51266h.m110208a(r2)     // Catch:{ c -> 0x00d0 }
            java.lang.String r4 = com.p683ss.caijing.globaliap.p2559d.C51266h.m110210b(r2)     // Catch:{ c -> 0x00d0 }
            com.ss.caijing.globaliap.e.c$a r5 = new com.ss.caijing.globaliap.e.c$a
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "https://"
            r6.<init>(r7)
            android.content.Context r7 = r10.f127938a
            java.lang.String r7 = com.p683ss.base.p2547b.C51160c.m110046a(r7)
            r6.append(r7)
            java.lang.String r7 = "/gateway-u"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.ss.caijing.globaliap.e.c$a r5 = r5.mo101800a(r6)
            java.lang.String r2 = r2.toString()
            java.util.Map r2 = com.p683ss.caijing.globaliap.p2559d.C51267i.m110214a(r2)
            com.ss.caijing.globaliap.e.c$a r2 = r5.mo101801a(r2)
            com.ss.caijing.globaliap.e.c r2 = r2.f128048a
            com.ss.caijing.globaliap.e.c$b r2 = r2.mo101799a()     // Catch:{ b -> 0x00ca }
            android.content.Context r5 = r10.f127938a     // Catch:{ b -> 0x00ca }
            int r6 = r2.f128049a     // Catch:{ b -> 0x00ca }
            r7 = 200(0xc8, float:2.8E-43)
            r8 = 1
            r9 = 0
            if (r6 != r7) goto L_0x00c5
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r2 = r2.f128050b     // Catch:{ JSONException -> 0x00c1 }
            r6.<init>(r2)     // Catch:{ JSONException -> 0x00c1 }
            com.ss.caijing.globaliap.a.c r2 = new com.ss.caijing.globaliap.a.c     // Catch:{ JSONException -> 0x00c1 }
            r2.<init>()     // Catch:{ JSONException -> 0x00c1 }
            com.ss.caijing.globaliap.a.c$a r2 = com.p683ss.caijing.globaliap.p2556a.C51220c.m110130a(r6)     // Catch:{ JSONException -> 0x00c1 }
            boolean r2 = r2.mo101747a()     // Catch:{ JSONException -> 0x00c1 }
            if (r2 == 0) goto L_0x00bd
            com.p683ss.caijing.globaliap.p2559d.C51267i.m110216a(r5, r3)     // Catch:{ JSONException -> 0x00c1 }
            com.p683ss.caijing.globaliap.p2563f.C51283b.m110252a(r4, r8, r9)     // Catch:{ JSONException -> 0x00c1 }
            goto L_0x0046
        L_0x00bd:
            com.p683ss.caijing.globaliap.p2563f.C51283b.m110252a(r4, r9, r9)     // Catch:{ JSONException -> 0x00c1 }
            goto L_0x0046
        L_0x00c1:
            com.p683ss.caijing.globaliap.p2563f.C51283b.m110252a(r4, r9, r8)     // Catch:{ b -> 0x00ca }
            goto L_0x0046
        L_0x00c5:
            com.p683ss.caijing.globaliap.p2563f.C51283b.m110252a(r4, r9, r8)     // Catch:{ b -> 0x00ca }
            goto L_0x0046
        L_0x00ca:
            r2 = move-exception
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43754b(r2)
            goto L_0x0046
        L_0x00d0:
            goto L_0x0046
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.caijing.globaliap.p2559d.C51228a.run():void");
    }

    public C51228a(Context context) {
        this.f127938a = context;
    }
}
