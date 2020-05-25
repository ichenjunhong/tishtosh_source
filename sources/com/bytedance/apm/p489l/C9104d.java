package com.bytedance.apm.p489l;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p485h.C9039a;
import com.bytedance.apm.p485h.C9044f;
import com.bytedance.apm.p485h.C9046h;
import com.bytedance.apm.p485h.C9047i;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9201q;
import com.bytedance.frameworks.core.apm.C9937b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.d */
public final class C9104d extends C9081a {

    /* renamed from: a */
    public int f24889a;

    /* renamed from: b */
    public int f24890b;

    /* renamed from: g */
    public int f24891g;

    /* renamed from: h */
    public int f24892h;

    /* renamed from: i */
    boolean f24893i;

    /* renamed from: j */
    public final Context f24894j;

    /* renamed from: k */
    public volatile long f24895k;

    /* renamed from: l */
    public volatile C9046h f24896l;

    /* renamed from: m */
    public C9046h f24897m;

    /* renamed from: n */
    public List<C9047i> f24898n;

    /* renamed from: o */
    public List<C9047i> f24899o;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return 600000;
    }

    public C9104d() {
        this.f24893i = true;
        this.f24895k = -1;
        this.f24894j = C8976c.m17736a();
        this.f24812e = "traffic";
    }

    /* renamed from: f */
    public final void mo16225f() {
        if (C9201q.m18282a() && this.f24893i) {
            if (this.f24896l == null) {
                C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                    public final void run() {
                        C9104d.this.f24896l = C9201q.m18283b();
                        if (C9104d.this.f24896l != null) {
                            C9104d.this.f24898n = C9104d.this.f24896l.mo16378a();
                        }
                    }
                });
            } else {
                C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                    public final void run() {
                        boolean z;
                        C91073 r0 = this;
                        long a = C9201q.m18279a(C9104d.this.f24894j, System.currentTimeMillis() - 600000, System.currentTimeMillis(), 1);
                        long a2 = C9201q.m18279a(C9104d.this.f24894j, System.currentTimeMillis() - 600000, System.currentTimeMillis(), 0);
                        long j = a + a2;
                        C9104d.this.f24897m = C9201q.m18283b();
                        if (C9104d.this.f24897m != null) {
                            C9104d.this.f24899o = C9104d.this.f24897m.mo16378a();
                        }
                        if (j > ((long) C9104d.this.f24889a) * 1048576 || a2 > ((long) C9104d.this.f24890b) * 1048576) {
                            C9104d dVar = C9104d.this;
                            long currentTimeMillis = System.currentTimeMillis();
                            ArrayList arrayList = new ArrayList(8);
                            for (C9047i iVar : dVar.f24899o) {
                                Iterator it = dVar.f24898n.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C9047i iVar2 = (C9047i) it.next();
                                    if (iVar.f24712e == iVar2.f24712e && iVar.f24710c == iVar2.f24710c && iVar.f24711d == iVar2.f24711d) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        C9104d dVar2 = dVar;
                                        ArrayList arrayList2 = arrayList;
                                        C9044f fVar = r2;
                                        C9044f fVar2 = new C9044f(iVar.f24709b - iVar2.f24709b, iVar.f24712e, iVar.f24710c, iVar.f24711d, iVar2.f24713f, iVar.f24713f, currentTimeMillis);
                                        arrayList2.add(fVar);
                                        arrayList = arrayList2;
                                        dVar = dVar2;
                                        break;
                                    }
                                }
                            }
                            dVar.mo16472a((List<C9044f>) arrayList, (JSONObject) null);
                            r0 = this;
                        }
                        C9104d.this.f24896l = C9104d.this.f24897m;
                        C9104d.this.f24898n = C9104d.this.f24899o;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        super.mo16218a(activity);
        m18046a(activity, true);
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
        super.mo16221b(activity);
        m18046a(activity, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        this.f24891g = jSONObject.optInt("front_minute_limit", 80);
        this.f24892h = jSONObject.optInt("back_minute_limit", 70);
        this.f24893i = jSONObject.optBoolean("abnormal_switch", true);
        this.f24889a = jSONObject.optInt("traffic_monitor_warn_threshold", 800);
        this.f24890b = jSONObject.optInt("traffic_monitor_warn_threshold_mobile", 650);
    }

    /* renamed from: a */
    private void m18046a(final Activity activity, final boolean z) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                int i;
                C9104d dVar = C9104d.this;
                boolean z = false;
                if (C9201q.m18282a() && dVar.f24893i) {
                    if (dVar.f24895k == -1) {
                        dVar.f24895k = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - dVar.f24895k;
                        if (currentTimeMillis < 120000 || currentTimeMillis > 600000) {
                            dVar.f24895k = System.currentTimeMillis();
                        } else {
                            z = true;
                        }
                    }
                }
                if (z) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long currentTimeMillis3 = System.currentTimeMillis() - C9104d.this.f24895k;
                    long a = C9201q.m18279a(activity, C9104d.this.f24895k, System.currentTimeMillis(), 1);
                    long a2 = C9201q.m18279a(activity, C9104d.this.f24895k, System.currentTimeMillis(), 0);
                    long j = (currentTimeMillis3 / 60000) + 1;
                    long j2 = (a + a2) / 1048576;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("currentTime", currentTimeMillis2);
                        jSONObject.put("lastRecordTime", C9104d.this.f24895k);
                        jSONObject.put("netStatsWifi", a);
                        jSONObject.put("netStatsCell", a2);
                        jSONObject.put("currentThreadId", Thread.currentThread().getId());
                    } catch (JSONException unused) {
                    }
                    if (z) {
                        i = C9104d.this.f24891g;
                    } else {
                        i = C9104d.this.f24892h;
                    }
                    if (j2 > j * ((long) i)) {
                        C9104d dVar2 = C9104d.this;
                        C9104d dVar3 = C9104d.this;
                        boolean z2 = z;
                        JSONObject jSONObject2 = jSONObject;
                        boolean z3 = z2;
                        C9044f fVar = r4;
                        boolean z4 = z2;
                        ArrayList arrayList = new ArrayList(2);
                        C9104d dVar4 = dVar3;
                        JSONObject jSONObject3 = jSONObject2;
                        long j3 = a2;
                        C9044f fVar2 = new C9044f(a, z3 ? 1 : 0, 1, 0, dVar3.f24895k, currentTimeMillis2, currentTimeMillis2);
                        C9044f fVar3 = r4;
                        C9044f fVar4 = new C9044f(j3, z4 ? 1 : 0, 0, 0, dVar4.f24895k, currentTimeMillis2, currentTimeMillis2);
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(fVar);
                        arrayList2.add(fVar3);
                        dVar2.mo16472a((List<C9044f>) arrayList2, jSONObject3);
                    }
                    C9104d.this.f24895k = System.currentTimeMillis();
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(8:3|(1:5)|6|(1:8)|9|(2:11|35)(1:34)|32|1)|33|12|(1:17)(1:16)|18|19|20|21|22|(1:24)(1:25)|26|(2:30|28)|36|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092 A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0 A[LOOP:1: B:28:0x00ca->B:30:0x00d0, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16472a(java.util.List<com.bytedance.apm.p485h.C9044f> r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            java.util.Iterator r0 = r14.iterator()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = r3
            r7 = r5
            r3 = r1
        L_0x000e:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0036
            java.lang.Object r9 = r0.next()
            com.bytedance.apm.h.f r9 = (com.bytedance.apm.p485h.C9044f) r9
            int r10 = r9.f24712e
            if (r10 != 0) goto L_0x0021
            long r10 = r9.f24709b
            long r5 = r5 + r10
        L_0x0021:
            long r10 = r9.mo16377a()
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x002d
            long r3 = r9.mo16377a()
        L_0x002d:
            long r10 = r9.f24694a
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x000e
            long r7 = r9.f24694a
            goto L_0x000e
        L_0x0036:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            r9 = 900000(0xdbba0, double:4.44659E-318)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r0 = r3
            goto L_0x0051
        L_0x0049:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 600000(0x927c0, double:2.964394E-318)
            long r0 = r0 - r2
        L_0x0051:
            r2 = 2
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0070 }
            r3.<init>()     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r4 = "value"
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0070 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0070 }
            r4.<init>()     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r5 = "start_time"
            r4.put(r5, r0)     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r5 = "end_time"
            r4.put(r5, r7)     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r5 = "traffic_warn"
            com.bytedance.apm.C8936b.m17652a(r5, r2, r3, r4)     // Catch:{ JSONException -> 0x0070 }
        L_0x0070:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Exception -> 0x00c6 }
            r3.<init>()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = "is_sampled"
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00c6 }
            r3.put(r4, r6)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = "hit_rules"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00c6 }
            r3.put(r4, r6)     // Catch:{ Exception -> 0x00c6 }
            android.content.Context r4 = r13.f24894j     // Catch:{ Exception -> 0x00c6 }
            boolean r4 = com.bytedance.apm.p501q.C9193j.m18261d(r4)     // Catch:{ Exception -> 0x00c6 }
            r6 = 0
            r9 = 3
            if (r4 == 0) goto L_0x00aa
            java.lang.String r4 = "timestamp > ? AND timestamp < ? AND is_sampled = ?"
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00c6 }
            r9[r6] = r0     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00c6 }
            r9[r5] = r0     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "0"
            r9[r2] = r0     // Catch:{ Exception -> 0x00c6 }
            m18047a(r3, r4, r9)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00c6
        L_0x00aa:
            java.lang.String r4 = "timestamp > ? AND timestamp < ? AND front = ? AND is_sampled = ?"
            r10 = 4
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00c6 }
            r10[r6] = r0     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00c6 }
            r10[r5] = r0     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "0"
            r10[r2] = r0     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "0"
            r10[r9] = r0     // Catch:{ Exception -> 0x00c6 }
            m18047a(r3, r4, r10)     // Catch:{ Exception -> 0x00c6 }
        L_0x00c6:
            java.util.Iterator r14 = r14.iterator()
        L_0x00ca:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r14.next()
            com.bytedance.apm.h.f r0 = (com.bytedance.apm.p485h.C9044f) r0
            int r2 = r13.m18045a(r2, r0, r15)
            goto L_0x00ca
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p489l.C9104d.mo16472a(java.util.List, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static void m18047a(ContentValues contentValues, String str, String[] strArr) {
        C9937b.m19972a().mo17904a(C9039a.class).mo17873a(contentValues, str, strArr);
    }

    /* renamed from: a */
    private int m18045a(int i, C9044f fVar, JSONObject jSONObject) {
        try {
            if (fVar.f24709b == 0) {
                return i;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", fVar.f24709b);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("send", fVar.f24711d);
            jSONObject3.put("network_type", fVar.f24710c);
            jSONObject3.put("front", fVar.f24712e);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sid", fVar.f24714g);
            jSONObject4.put("start_time", fVar.mo16377a());
            jSONObject4.put("end_time", fVar.f24694a);
            jSONObject4.put("timestamp", fVar.f24694a);
            jSONObject4.put("hit_rules", i);
            if (jSONObject != null) {
                jSONObject4.put("debug_values", jSONObject);
            }
            boolean z = false;
            if (ApmDelegate.m17947a().mo16433b("smart_traffic")) {
                i |= 4;
            }
            if ((i & 2) > 0) {
                z = true;
            }
            C9024f fVar2 = new C9024f();
            C9024f a = fVar2.mo16354a("smart_traffic");
            a.f24618c = z;
            a.mo16355a(jSONObject2).mo16357b(jSONObject3).f24621f = jSONObject4;
            m17983a(fVar2);
            return i;
        } catch (Exception unused) {
        }
    }
}
