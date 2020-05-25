package com.bytedance.p582g.p583a.p585b;

import android.content.Context;
import com.bytedance.p582g.p583a.p585b.p587b.C9957a;
import com.bytedance.p582g.p583a.p585b.p589d.C9968a.C9971b;
import com.bytedance.p582g.p583a.p585b.p590e.C9979b;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.g.a.b.b */
public final class C9956b implements C9971b {

    /* renamed from: a */
    public volatile boolean f27037a = true;

    /* renamed from: b */
    public int f27038b = 120;

    /* renamed from: c */
    public int f27039c = 100;

    /* renamed from: d */
    public String f27040d;

    /* renamed from: e */
    public Context f27041e;

    /* renamed from: f */
    public JSONObject f27042f;

    /* renamed from: g */
    private long f27043g;

    /* renamed from: h */
    private C9958c f27044h;

    /* renamed from: a */
    private void m20020a() {
        List<C9957a> a = m20019a(this.f27039c);
        if (!C9979b.m20068a(a)) {
            long j = -1;
            try {
                JSONArray jSONArray = new JSONArray();
                LinkedList linkedList = new LinkedList();
                for (C9957a aVar : a) {
                    long j2 = aVar.f27045a;
                    if (j2 > j) {
                        j = j2;
                    }
                    String str = aVar.f27049e;
                    linkedList.add(aVar);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("log_id", j2);
                        jSONObject.put("d_s_t", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
                if (m20021a(jSONArray, false)) {
                    m20022b(j);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private List<C9957a> m20019a(int i) {
        return this.f27044h.mo17924a(Integer.parseInt(this.f27040d), i);
    }

    /* renamed from: b */
    private int m20022b(long j) {
        return this.f27044h.mo17923a(this.f27040d, j);
    }

    /* renamed from: a */
    public final void mo17920a(long j) {
        if (this.f27037a) {
            long currentTimeMillis = System.currentTimeMillis();
            long a = (long) this.f27044h.mo17922a(this.f27040d);
            if (a <= 0) {
                return;
            }
            if (a > ((long) this.f27039c) || (currentTimeMillis - this.f27043g) / 1000 > ((long) this.f27038b)) {
                this.f27043g = currentTimeMillis;
                m20020a();
            }
        }
    }

    public C9956b(Context context, String str) {
        this.f27041e = context;
        this.f27044h = C9958c.m20025a(context);
        this.f27040d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0015 A[Catch:{ Throwable -> 0x0048 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016 A[Catch:{ Throwable -> 0x0048 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m20021a(org.json.JSONArray r4, boolean r5) {
        /*
            r3 = this;
            r5 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0048 }
            r0.<init>()     // Catch:{ Throwable -> 0x0048 }
            r1 = 1
            if (r4 == 0) goto L_0x0012
            int r2 = r4.length()     // Catch:{ Throwable -> 0x0048 }
            if (r2 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = 0
            goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            if (r2 == 0) goto L_0x0016
            return r5
        L_0x0016:
            java.lang.String r2 = "data"
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0048 }
            org.json.JSONObject r4 = r3.f27042f     // Catch:{ Throwable -> 0x0048 }
            if (r4 == 0) goto L_0x0047
            java.lang.String r4 = "header"
            org.json.JSONObject r1 = r3.f27042f     // Catch:{ Throwable -> 0x0048 }
            r0.put(r4, r1)     // Catch:{ Throwable -> 0x0048 }
            java.lang.String r4 = r3.f27040d     // Catch:{ Throwable -> 0x0048 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0048 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0048 }
            if (r1 == 0) goto L_0x0033
            return r5
        L_0x0033:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.c.b> r1 = com.bytedance.p582g.p583a.p585b.p588c.C9965d.f27076b     // Catch:{ Throwable -> 0x0048 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Throwable -> 0x0048 }
            com.bytedance.g.a.b.c.b r4 = (com.bytedance.p582g.p583a.p585b.p588c.C9963b) r4     // Catch:{ Throwable -> 0x0048 }
            boolean r1 = r4.mo17926a()     // Catch:{ Throwable -> 0x0048 }
            if (r1 == 0) goto L_0x0042
            return r5
        L_0x0042:
            boolean r4 = r4.mo17927a(r0)     // Catch:{ Throwable -> 0x0048 }
            return r4
        L_0x0047:
            return r1
        L_0x0048:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p585b.C9956b.m20021a(org.json.JSONArray, boolean):boolean");
    }
}
