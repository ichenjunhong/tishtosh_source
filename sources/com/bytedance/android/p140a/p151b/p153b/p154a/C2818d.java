package com.bytedance.android.p140a.p151b.p153b.p154a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.android.p140a.p141a.p146e.C2788b;
import com.bytedance.android.p140a.p141a.p150i.C2799a;
import com.bytedance.android.p140a.p151b.C2806a;
import com.bytedance.android.p140a.p151b.C2810b;
import com.bytedance.android.p140a.p151b.p152a.C2809a;
import com.bytedance.android.p140a.p151b.p153b.C2820c;
import com.bytedance.android.p140a.p151b.p153b.C2822d;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2815b.C2816a;
import com.bytedance.android.p140a.p151b.p155c.C2823a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.b.a.d */
final class C2818d extends C2813a {
    C2818d(C2806a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final C2822d mo7410a(C2816a aVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C2822d a = super.mo7410a(aVar);
        C2810b.m7996a().mo7406a(a, SystemClock.uptimeMillis() - uptimeMillis);
        return a;
    }

    /* renamed from: a */
    public final C2822d mo7412a(C2822d dVar) {
        if (dVar == null || dVar.f8419e == null) {
            return dVar;
        }
        C2820c cVar = dVar.f8419e;
        C2788b bVar = cVar.f8410e;
        int i = dVar.f8415a;
        String str = cVar.f8407b;
        long j = dVar.f8418d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url_list", str).put("track_status", i).put("local_time_ms", j).put("is_retry", bVar.f8372j);
        } catch (JSONException unused) {
        }
        C2799a.m7958a("track_url", bVar, jSONObject);
        return dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|3|4|5|6|7|8|(4:10|(1:12)|13|(11:15|(4:18|(2:20|59)(1:58)|56|16)|57|21|(7:23|24|25|26|27|29|30)|34|(1:36)(1:37)|38|(4:42|(1:44)|45|(3:50|(1:52)|53))|54|55))|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ Throwable -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.p140a.p151b.p153b.C2820c mo7411a(com.bytedance.android.p140a.p151b.p153b.C2820c r9) {
        /*
            r8 = this;
            com.bytedance.android.a.a.e.b r0 = r9.f8410e
            java.lang.String r1 = r9.f8407b
            long r2 = r0.f8371i     // Catch:{ Throwable -> 0x0097 }
            java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x0097 }
            r2 = 0
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ Throwable -> 0x0013 }
            java.lang.String r3 = r3.getHost()     // Catch:{ Throwable -> 0x0013 }
            r2 = r3
        L_0x0013:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0097 }
            if (r3 != 0) goto L_0x0092
            com.bytedance.android.a.b.a r3 = r8.f8401a     // Catch:{ Throwable -> 0x0097 }
            com.bytedance.android.a.b.c.a r3 = r3.f8390a     // Catch:{ Throwable -> 0x0097 }
            java.util.List<java.lang.String> r4 = r3.f8427g     // Catch:{ Throwable -> 0x0097 }
            if (r4 != 0) goto L_0x0028
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0097 }
            r4.<init>()     // Catch:{ Throwable -> 0x0097 }
            r3.f8427g = r4     // Catch:{ Throwable -> 0x0097 }
        L_0x0028:
            java.util.List<java.lang.String> r3 = r3.f8427g     // Catch:{ Throwable -> 0x0097 }
            boolean r2 = r3.contains(r2)     // Catch:{ Throwable -> 0x0097 }
            if (r2 != 0) goto L_0x0092
            boolean r2 = r0.f8366d     // Catch:{ Throwable -> 0x0097 }
            android.util.Pair r2 = r8.m8013a(r1, r2)     // Catch:{ Throwable -> 0x0097 }
            java.lang.Object r3 = r2.first     // Catch:{ Throwable -> 0x0097 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Throwable -> 0x0097 }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x0097 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Throwable -> 0x0097 }
            java.util.Set r4 = r2.keySet()     // Catch:{ Throwable -> 0x0097 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x0097 }
        L_0x0046:
            boolean r5 = r4.hasNext()     // Catch:{ Throwable -> 0x0097 }
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r4.next()     // Catch:{ Throwable -> 0x0097 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0097 }
            java.lang.Object r6 = r2.get(r5)     // Catch:{ Throwable -> 0x0097 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x0097 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0097 }
            if (r7 != 0) goto L_0x0046
            java.lang.String r5 = r1.replace(r5, r6)     // Catch:{ Throwable -> 0x0097 }
            r1 = r5
            goto L_0x0046
        L_0x0064:
            boolean r2 = r3.isEmpty()     // Catch:{ Throwable -> 0x0097 }
            if (r2 != 0) goto L_0x009b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0097 }
            r2.<init>()     // Catch:{ Throwable -> 0x0097 }
            java.lang.String r4 = "ad_extra_data"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008c }
            r5.<init>()     // Catch:{ JSONException -> 0x008c }
            java.lang.String r6 = "macro"
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008c }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x008c }
            org.json.JSONObject r3 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x008c }
            org.json.JSONObject r3 = r2.put(r4, r3)     // Catch:{ JSONException -> 0x008c }
            java.lang.String r4 = "is_retry"
            int r5 = r0.f8372j     // Catch:{ JSONException -> 0x008c }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x008c }
        L_0x008c:
            java.lang.String r3 = "track_macro_invalid"
            com.bytedance.android.p140a.p141a.p150i.C2799a.m7958a(r3, r0, r2)     // Catch:{ Throwable -> 0x0097 }
            goto L_0x009b
        L_0x0092:
            r2 = 2
            com.bytedance.android.p140a.p141a.p150i.C2799a.m7956a(r0, r2)     // Catch:{ Throwable -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            r0.getMessage()
        L_0x009b:
            com.bytedance.android.a.a.e r0 = com.bytedance.android.p140a.p141a.C2786e.m7920d()
            com.bytedance.android.a.a.f r0 = r0.f8361h
            com.bytedance.android.a.b.b.c$a r9 = r9.f8406a
            java.lang.String r2 = "User-Agent"
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r0.mo7392a()
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r0 = ""
        L_0x00ae:
            java.lang.String r0 = com.bytedance.android.p140a.p141a.p150i.C2804f.m7973c(r0)
            java.lang.String r0 = com.bytedance.android.p140a.p141a.p150i.C2804f.m7974d(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00f1
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x00c3
            goto L_0x00f1
        L_0x00c3:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r9.f8413c
            if (r3 != 0) goto L_0x00ce
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r9.f8413c = r3
        L_0x00ce:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00f1
            if (r0 == 0) goto L_0x00f1
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x00e1
            goto L_0x00f1
        L_0x00e1:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r9.f8413c
            if (r3 != 0) goto L_0x00ec
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r9.f8413c = r3
        L_0x00ec:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r9.f8413c
            r3.put(r2, r0)
        L_0x00f1:
            com.bytedance.android.a.b.b.c$a r9 = r9.mo7416a(r1)
            com.bytedance.android.a.b.b.c r9 = r9.mo7417a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p140a.p151b.p153b.p154a.C2818d.mo7411a(com.bytedance.android.a.b.b.c):com.bytedance.android.a.b.b.c");
    }

    /* renamed from: a */
    private Pair<List<String>, Map<String, String>> m8013a(String str, boolean z) {
        List<String> list;
        Map map;
        C2809a aVar = this.f8401a.f8390a.f8428i;
        ArrayList arrayList = new ArrayList();
        C2823a aVar2 = this.f8401a.f8390a;
        if (z) {
            list = aVar2.f8425e;
        } else {
            list = aVar2.f8426f;
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                arrayList.add(str2);
            }
        }
        if (aVar != null) {
            map = aVar.mo7405a(arrayList);
        } else {
            map = Collections.emptyMap();
        }
        arrayList.removeAll(map.keySet());
        return new Pair<>(arrayList, map);
    }
}
