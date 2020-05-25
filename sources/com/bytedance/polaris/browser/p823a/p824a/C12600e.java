package com.bytedance.polaris.browser.p823a.p824a;

import android.app.Activity;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.polaris.browser.a.a.e */
final class C12600e extends Thread {

    /* renamed from: a */
    private final String f33078a;

    /* renamed from: b */
    private final String f33079b;

    /* renamed from: c */
    private final String f33080c;

    /* renamed from: d */
    private final String f33081d;

    /* renamed from: e */
    private final String f33082e;

    /* renamed from: f */
    private final Handler f33083f;

    /* renamed from: g */
    private final WeakReference<Activity> f33084g;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed A[Catch:{ Exception -> 0x0110 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r0 = 14
            r1 = 0
            r2 = 18
            java.lang.String r3 = r12.f33079b     // Catch:{ Exception -> 0x0110 }
            java.lang.String r4 = r12.f33078a     // Catch:{ Exception -> 0x0110 }
            java.lang.String r5 = r12.f33080c     // Catch:{ Exception -> 0x0110 }
            boolean r6 = com.bytedance.polaris.p826d.C12650p.m25425c(r4)     // Catch:{ Exception -> 0x0110 }
            r7 = 1
            if (r6 == 0) goto L_0x00e6
            android.net.Uri r6 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0110 }
            boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Exception -> 0x0110 }
            if (r8 != 0) goto L_0x002b
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0110 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0110 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x0110 }
            r9.<init>()     // Catch:{ Exception -> 0x0110 }
            java.util.Map r8 = com.bytedance.polaris.p826d.C12639h.m25398a(r8)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0030
        L_0x002b:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x0110 }
            r8.<init>()     // Catch:{ Exception -> 0x0110 }
        L_0x0030:
            com.bytedance.polaris.p826d.C12650p.m25422a(r8, r7)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r9 = r3.toLowerCase()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r10 = "get"
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0110 }
            r10 = 20480(0x5000, float:2.8699E-41)
            if (r9 == 0) goto L_0x0082
            android.net.Uri$Builder r3 = r6.buildUpon()     // Catch:{ Exception -> 0x0110 }
            if (r8 == 0) goto L_0x0071
            boolean r4 = r8.isEmpty()     // Catch:{ Exception -> 0x0110 }
            if (r4 != 0) goto L_0x0071
            java.util.Set r4 = r8.keySet()     // Catch:{ Exception -> 0x0110 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0110 }
        L_0x0055:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x0110 }
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0110 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0110 }
            if (r6 != 0) goto L_0x0055
            java.lang.Object r6 = r8.get(r5)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0110 }
            r3.appendQueryParameter(r5, r6)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0055
        L_0x0071:
            com.bytedance.polaris.a.e r4 = com.bytedance.polaris.p821a.C12563i.m25225g()     // Catch:{ Throwable -> 0x00e6 }
            android.net.Uri r3 = r3.build()     // Catch:{ Throwable -> 0x00e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x00e6 }
            java.lang.String r3 = r4.mo23607a(r10, r3)     // Catch:{ Throwable -> 0x00e6 }
            goto L_0x00e7
        L_0x0082:
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r6 = "post"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0110 }
            if (r3 == 0) goto L_0x00e6
            java.lang.String r3 = r12.f33082e     // Catch:{ Exception -> 0x0110 }
            java.lang.String r6 = "json"
            boolean r3 = r6.equals(r3)     // Catch:{ Exception -> 0x0110 }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r3 = "UTF-8"
            byte[] r3 = r5.getBytes(r3)     // Catch:{ Exception -> 0x0110 }
            com.bytedance.polaris.a.e r5 = com.bytedance.polaris.p821a.C12563i.m25225g()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r6 = "application/json; charset=utf-8"
            java.lang.String r3 = r5.mo23609a(r10, r4, r3, r6)     // Catch:{ Exception -> 0x0110 }
            goto L_0x00e7
        L_0x00a9:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0110 }
            r3.<init>()     // Catch:{ Exception -> 0x0110 }
            if (r8 == 0) goto L_0x00dd
            boolean r5 = r8.isEmpty()     // Catch:{ Exception -> 0x0110 }
            if (r5 != 0) goto L_0x00dd
            java.util.Set r5 = r8.keySet()     // Catch:{ Exception -> 0x0110 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0110 }
        L_0x00be:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0110 }
            if (r6 == 0) goto L_0x00dd
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0110 }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0110 }
            if (r9 != 0) goto L_0x00be
            android.util.Pair r9 = new android.util.Pair     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r11 = r8.get(r6)     // Catch:{ Exception -> 0x0110 }
            r9.<init>(r6, r11)     // Catch:{ Exception -> 0x0110 }
            r3.add(r9)     // Catch:{ Exception -> 0x0110 }
            goto L_0x00be
        L_0x00dd:
            com.bytedance.polaris.a.e r5 = com.bytedance.polaris.p821a.C12563i.m25225g()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r3 = r5.mo23608a(r10, r4, r3)     // Catch:{ Exception -> 0x0110 }
            goto L_0x00e7
        L_0x00e6:
            r3 = r1
        L_0x00e7:
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x0110 }
            if (r4 == 0) goto L_0x00ef
            r2 = 17
        L_0x00ef:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0110 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0110 }
            android.os.Message r3 = android.os.Message.obtain()     // Catch:{ Exception -> 0x0110 }
            r3.what = r0     // Catch:{ Exception -> 0x0110 }
            r3.arg1 = r7     // Catch:{ Exception -> 0x0110 }
            java.lang.String r5 = r12.f33081d     // Catch:{ Exception -> 0x0110 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0110 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0110 }
            r3.arg2 = r5     // Catch:{ Exception -> 0x0110 }
            r3.obj = r4     // Catch:{ Exception -> 0x0110 }
            android.os.Handler r4 = r12.f33083f     // Catch:{ Exception -> 0x0110 }
            r4.sendMessage(r3)     // Catch:{ Exception -> 0x0110 }
            return
        L_0x0110:
            r3 = move-exception
            java.lang.ref.WeakReference<android.app.Activity> r4 = r12.f33084g
            if (r4 == 0) goto L_0x011d
            java.lang.ref.WeakReference<android.app.Activity> r1 = r12.f33084g
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x011d:
            if (r1 == 0) goto L_0x0127
            com.bytedance.polaris.a.c r2 = com.bytedance.polaris.p821a.C12563i.m25221c()
            int r2 = r2.mo23598a(r1, r3)
        L_0x0127:
            java.lang.String r1 = r3.getMessage()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "errorCode"
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r2 = "errorMessage"
            r3.put(r2, r1)     // Catch:{ JSONException -> 0x013a }
        L_0x013a:
            android.os.Message r1 = android.os.Message.obtain()
            r1.what = r0
            r0 = 0
            r1.arg1 = r0
            java.lang.String r0 = r12.f33081d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            r1.arg2 = r0
            r1.obj = r3
            android.os.Handler r0 = r12.f33083f
            r0.sendMessage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p823a.p824a.C12600e.run():void");
    }

    C12600e(Handler handler, WeakReference<Activity> weakReference, String str, String str2, String str3, String str4, String str5) {
        this.f33083f = handler;
        this.f33084g = weakReference;
        this.f33078a = str;
        this.f33079b = str2;
        this.f33080c = str3;
        this.f33082e = str4;
        this.f33081d = str5;
    }
}
