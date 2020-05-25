package com.bytedance.sdk.account.p859d;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.C12997b.C12999b;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p847c.C13007a;
import com.bytedance.sdk.account.p844a.p847c.C13008b;
import com.bytedance.sdk.account.p844a.p847c.C13009c;
import com.bytedance.sdk.account.p844a.p847c.C13010d;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p878m.C13208a;
import com.bytedance.sdk.account.p878m.C13212e;
import com.bytedance.sdk.account.p878m.C13216h;
import com.bytedance.sdk.account.p878m.C13217i;
import com.p683ss.android.C18962e;
import com.p683ss.android.C18963f;
import com.p683ss.android.account.C18495c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.d.h */
public abstract class C13090h<R extends C12990b> implements C13007a, C13009c {

    /* renamed from: d */
    static List<String> f34206d;

    /* renamed from: j */
    private static C13008b f34207j = new C13008b() {
        /* renamed from: a */
        public final C13010d mo24601a(C13009c cVar) {
            C13093a aVar = new C13093a(cVar);
            aVar.mo24780b();
            return aVar;
        }
    };

    /* renamed from: k */
    private static C13094i f34208k = new C13094i() {
        /* renamed from: a */
        public final void mo24767a(C13095j jVar) {
            C9381g gVar = ((C13082e) C13082e.m26317b()).f34186B;
            Message obtain = Message.obtain(gVar, 100);
            obtain.obj = jVar;
            gVar.sendMessage(obtain);
        }
    };

    /* renamed from: a */
    protected Context f34209a;

    /* renamed from: b */
    protected C13073a f34210b;

    /* renamed from: c */
    protected WeakReference<? extends C12989a> f34211c;

    /* renamed from: e */
    private String f34212e;

    /* renamed from: f */
    private C13075b f34213f;

    /* renamed from: g */
    private C12989a f34214g;

    /* renamed from: h */
    private C13010d f34215h;

    /* renamed from: i */
    private boolean f34216i;

    /* renamed from: com.bytedance.sdk.account.d.h$a */
    static class C13093a extends C13208a implements C13010d {

        /* renamed from: f */
        private C13009c f34217f;

        public final void run() {
            this.f34217f.mo24602b();
        }

        private C13093a(C13009c cVar) {
            this.f34217f = cVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo24584a(boolean z, C13075b bVar);

    /* renamed from: a */
    public abstract void mo24585a(R r);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24586a(JSONObject jSONObject, JSONObject jSONObject2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception;

    /* renamed from: a */
    public final void mo24600a() {
        this.f34214g = null;
    }

    /* renamed from: c */
    public final void mo24603c() {
        mo24600a();
        C13010d dVar = this.f34215h;
        if (dVar != null) {
            dVar.mo24603c();
        }
    }

    /* renamed from: d */
    public final void mo24766d() {
        this.f34215h = f34207j.mo24601a(this);
    }

    /* renamed from: b */
    public final void mo24602b() {
        C12990b e = m26347e();
        if (e != null) {
            if (this.f34213f != null) {
                e.f33999b = this.f34213f.f34152d;
            }
            if (TextUtils.isEmpty(e.f33999b)) {
                e.f33999b = this.f34212e;
            }
            mo24585a((R) e);
            f34208k.mo24767a(new C13095j(this.f34211c, e));
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f34206d = arrayList;
        arrayList.add(C12999b.m26135a("/passport/auth/unbind/"));
        f34206d.add(C12999b.m26135a("/passport/auth/switch_bind/"));
        f34206d.add(C12999b.m26137c());
        f34206d.add(C12998a.m26126i());
        f34206d.add(C12998a.m26125h());
        f34206d.add(C12998a.m26118a("/passport/mobile/unbind/"));
        f34206d.add(C12998a.m26127j());
        f34206d.add(C12998a.m26128k());
        f34206d.add(C12998a.m26124g());
        f34206d.add(C12998a.m26120c());
        f34206d.add(C12998a.m26118a("/passport/safe/login_device/del/"));
        f34206d.add(C12998a.m26118a("/passport/auth/one_bind_mobile/"));
        f34206d.add(C12998a.m26118a("/passport/auth/one_bind_mobile/v2/"));
        f34206d.add(C12998a.m26122e());
        f34206d.add(C12998a.m26123f());
        f34206d.add(C12998a.m26118a("/passport/cancel/post/"));
        f34206d.add(C12998a.m26118a("/passport/cancel/do/"));
        f34206d.add(C12998a.m26132o());
        f34206d.add(C12999b.m26138d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013b, code lost:
        if (r4 >= 0) goto L_0x013d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private R m26347e() {
        /*
            r8 = this;
            r0 = 0
            r8.f34216i = r0
            r1 = -12
            android.content.Context r2 = r8.f34209a     // Catch:{ Throwable -> 0x0128 }
            if (r2 != 0) goto L_0x0017
            com.bytedance.sdk.account.c.b r2 = r8.f34213f     // Catch:{ Throwable -> 0x0128 }
            r3 = -24
            r2.f34150b = r3     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.c.b r2 = r8.f34213f     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r3 = "null context"
            r2.f34153e = r3     // Catch:{ Throwable -> 0x0128 }
            goto L_0x0125
        L_0x0017:
            android.content.Context r2 = r8.f34209a     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.m.e$a r2 = com.bytedance.sdk.account.p878m.C13212e.m26595a(r2)     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.m.e$a r3 = com.bytedance.sdk.account.p878m.C13212e.C13213a.NONE     // Catch:{ Throwable -> 0x0128 }
            if (r2 != r3) goto L_0x002d
            com.bytedance.sdk.account.c.b r2 = r8.f34213f     // Catch:{ Throwable -> 0x0128 }
            r2.f34150b = r1     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.c.b r2 = r8.f34213f     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r3 = "no network"
            r2.f34153e = r3     // Catch:{ Throwable -> 0x0128 }
            goto L_0x0125
        L_0x002d:
            java.lang.String r2 = "get"
            com.bytedance.sdk.account.c.a r3 = r8.f34210b     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r3 = r3.f34144b     // Catch:{ Throwable -> 0x0128 }
            boolean r2 = r2.equals(r3)     // Catch:{ Throwable -> 0x0128 }
            r3 = 0
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = r8.f34212e     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.c.a r4 = r8.f34210b     // Catch:{ Throwable -> 0x0128 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f34145c     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.m.h r5 = new com.bytedance.sdk.account.m.h     // Catch:{ Throwable -> 0x0128 }
            r5.<init>(r2)     // Catch:{ Throwable -> 0x0128 }
            if (r4 == 0) goto L_0x0083
            java.util.Set r4 = r4.entrySet()     // Catch:{ Throwable -> 0x0128 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x0128 }
        L_0x004f:
            boolean r6 = r4.hasNext()     // Catch:{ Throwable -> 0x0128 }
            if (r6 == 0) goto L_0x0083
            java.lang.Object r6 = r4.next()     // Catch:{ Throwable -> 0x0128 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Throwable -> 0x0128 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ Throwable -> 0x0128 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x0128 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0128 }
            if (r7 != 0) goto L_0x004f
            java.lang.Object r7 = r6.getValue()     // Catch:{ Throwable -> 0x0128 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x0128 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0128 }
            if (r7 != 0) goto L_0x004f
            java.lang.Object r7 = r6.getKey()     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x0128 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x0128 }
            r5.mo24807a(r7, r6)     // Catch:{ Throwable -> 0x0128 }
            goto L_0x004f
        L_0x0083:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0128 }
            r4.<init>()     // Catch:{ Throwable -> 0x0128 }
            com.ss.android.c r6 = com.p683ss.android.account.C18495c.m44742a()     // Catch:{ Throwable -> 0x0128 }
            boolean r6 = r6.mo38464d()     // Catch:{ Throwable -> 0x0128 }
            if (r6 == 0) goto L_0x009c
            java.lang.String r6 = "multi_login"
            java.lang.String r7 = "1"
            r5.mo24807a(r6, r7)     // Catch:{ Throwable -> 0x0128 }
            m26345a(r4)     // Catch:{ Throwable -> 0x0128 }
        L_0x009c:
            m26343a(r2, r4)     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r2 = "account_sdk_source"
            java.lang.String r6 = "app"
            r5.mo24807a(r2, r6)     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r2 = "account_sdk_version"
            r6 = 386(0x182, float:5.41E-43)
            r5.mo24806a(r2, r6)     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r2 = r5.toString()     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.c.b r5 = r8.f34213f     // Catch:{ Throwable -> 0x0128 }
            r5.f34152d = r2     // Catch:{ Throwable -> 0x0128 }
            com.ss.android.c r5 = com.p683ss.android.account.C18495c.m44742a()     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.c r5 = r5.mo38463c()     // Catch:{ Throwable -> 0x0128 }
            if (r5 == 0) goto L_0x00de
            r3 = 2147483647(0x7fffffff, float:NaN)
            com.ss.android.f r2 = r5.mo24748a(r3, r2, r4)     // Catch:{ Throwable -> 0x0128 }
            r3 = r2
            goto L_0x00de
        L_0x00c8:
            java.lang.String r2 = "post"
            com.bytedance.sdk.account.c.a r4 = r8.f34210b     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r4 = r4.f34144b     // Catch:{ Throwable -> 0x0128 }
            boolean r2 = r2.equals(r4)     // Catch:{ Throwable -> 0x0128 }
            if (r2 == 0) goto L_0x00de
            java.lang.String r2 = r8.f34212e     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.c.a r3 = r8.f34210b     // Catch:{ Throwable -> 0x0128 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f34145c     // Catch:{ Throwable -> 0x0128 }
            com.ss.android.f r3 = r8.m26339a(r2, r3)     // Catch:{ Throwable -> 0x0128 }
        L_0x00de:
            r8.m26341a(r3)     // Catch:{ Throwable -> 0x0128 }
            if (r3 == 0) goto L_0x0119
            java.lang.String r2 = r3.f52260d     // Catch:{ Throwable -> 0x0128 }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Throwable -> 0x0128 }
            if (r2 == 0) goto L_0x00ec
            goto L_0x0119
        L_0x00ec:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r3 = r3.f52260d     // Catch:{ Throwable -> 0x0128 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0128 }
            org.json.JSONObject r3 = m26340a(r2)     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r4 = "message"
            java.lang.String r4 = r2.optString(r4)     // Catch:{ Throwable -> 0x0128 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0128 }
            if (r5 != 0) goto L_0x0108
            boolean r0 = r8.m26346a(r2, r3, r4)     // Catch:{ Throwable -> 0x0128 }
            goto L_0x0125
        L_0x0108:
            if (r3 == 0) goto L_0x0125
            org.json.JSONObject r0 = m26340a(r3)     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r2 = "message"
            java.lang.String r2 = r3.optString(r2)     // Catch:{ Throwable -> 0x0128 }
            boolean r0 = r8.m26346a(r3, r0, r2)     // Catch:{ Throwable -> 0x0128 }
            goto L_0x0125
        L_0x0119:
            com.bytedance.sdk.account.c.b r2 = r8.f34213f     // Catch:{ Throwable -> 0x0128 }
            r3 = -25
            r2.f34150b = r3     // Catch:{ Throwable -> 0x0128 }
            com.bytedance.sdk.account.c.b r2 = r8.f34213f     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r3 = "response null"
            r2.f34153e = r3     // Catch:{ Throwable -> 0x0128 }
        L_0x0125:
            r8.f34216i = r0     // Catch:{ Throwable -> 0x0128 }
            goto L_0x017c
        L_0x0128:
            r0 = move-exception
            com.bytedance.sdk.account.c.b r2 = r8.f34213f
            android.content.Context r3 = r8.f34209a
            com.ss.android.c r4 = com.p683ss.android.account.C18495c.m44742a()
            com.bytedance.sdk.account.c r4 = r4.mo38463c()
            if (r4 == 0) goto L_0x013d
            int r4 = r4.mo24747a(r3, r0)
            if (r4 < 0) goto L_0x0172
        L_0x013d:
            boolean r4 = r0 instanceof org.apache.http.conn.ConnectTimeoutException
            r5 = -14
            r6 = -15
            if (r4 == 0) goto L_0x0148
            r4 = -13
            goto L_0x0164
        L_0x0148:
            boolean r4 = r0 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L_0x014f
            r4 = -14
            goto L_0x0164
        L_0x014f:
            boolean r4 = r0 instanceof java.net.SocketException
            if (r4 == 0) goto L_0x0156
        L_0x0153:
            r4 = -15
            goto L_0x0164
        L_0x0156:
            boolean r4 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L_0x015d
            r4 = -21
            goto L_0x0164
        L_0x015d:
            boolean r4 = r0 instanceof java.io.IOException
            if (r4 == 0) goto L_0x0162
            goto L_0x0153
        L_0x0162:
            r4 = -18
        L_0x0164:
            if (r3 == 0) goto L_0x0172
            if (r4 == r6) goto L_0x016a
            if (r4 != r5) goto L_0x0172
        L_0x016a:
            boolean r3 = com.bytedance.sdk.account.p878m.C13210c.m26593a(r3)
            if (r3 != 0) goto L_0x0172
            r4 = -12
        L_0x0172:
            r2.f34150b = r4
            com.bytedance.sdk.account.c.b r1 = r8.f34213f
            java.lang.String r0 = r0.getMessage()
            r1.f34153e = r0
        L_0x017c:
            boolean r0 = r8.f34216i
            com.bytedance.sdk.account.c.b r1 = r8.f34213f
            com.bytedance.sdk.account.a.a.b r0 = r8.mo24584a(r0, r1)
            if (r0 == 0) goto L_0x01c8
            com.bytedance.sdk.account.c.b r1 = r8.f34213f
            int r1 = r1.f34150b
            if (r1 >= 0) goto L_0x01ab
            int r1 = r0.f34000c
            if (r1 != 0) goto L_0x0196
            com.bytedance.sdk.account.c.b r1 = r8.f34213f
            int r1 = r1.f34150b
            r0.f34000c = r1
        L_0x0196:
            boolean r1 = r0 instanceof com.bytedance.sdk.account.p844a.p845a.C12993e
            if (r1 == 0) goto L_0x01ab
            r1 = r0
            com.bytedance.sdk.account.a.a.e r1 = (com.bytedance.sdk.account.p844a.p845a.C12993e) r1
            T r1 = r1.f34007h
            if (r1 == 0) goto L_0x01ab
            int r2 = r1.f34275h
            if (r2 != 0) goto L_0x01ab
            com.bytedance.sdk.account.c.b r2 = r8.f34213f
            int r2 = r2.f34150b
            r1.f34275h = r2
        L_0x01ab:
            com.bytedance.sdk.account.c.b r1 = r8.f34213f
            int r1 = r1.f34150b
            if (r1 == 0) goto L_0x01c8
            java.lang.String r1 = r0.f34002e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01c8
            com.bytedance.sdk.account.c.b r1 = r8.f34213f
            java.lang.String r1 = r1.f34153e
            if (r1 == 0) goto L_0x01c4
            com.bytedance.sdk.account.c.b r1 = r8.f34213f
            java.lang.String r1 = r1.f34153e
            goto L_0x01c6
        L_0x01c4:
            java.lang.String r1 = ""
        L_0x01c6:
            r0.f34002e = r1
        L_0x01c8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.p859d.C13090h.m26347e():com.bytedance.sdk.account.a.a.b");
    }

    /* renamed from: a */
    private static void m26342a(String str) {
        C13082e.m26317b().mo24597a(str);
    }

    /* renamed from: a */
    private static JSONObject m26340a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null || !jSONObject.has("data")) {
            return null;
        }
        try {
            Object opt = jSONObject.opt("data");
            if (opt == null) {
                return null;
            }
            if (opt instanceof JSONObject) {
                jSONObject2 = (JSONObject) opt;
            } else {
                if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("data", jSONArray);
                    } catch (Exception unused) {
                    }
                    jSONObject2 = jSONObject3;
                }
                jSONObject2 = null;
            }
            return jSONObject2;
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    private void m26341a(C18963f fVar) {
        if (fVar != null) {
            try {
                List<C18962e> list = fVar.f52259c;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C18962e eVar = (C18962e) it.next();
                        if ("x-tt-multi-sids".equalsIgnoreCase(eVar.f52255a)) {
                            String str = eVar.f52256b;
                            if (!TextUtils.isEmpty(str)) {
                                m26342a(str);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m26345a(List<C18962e> list) {
        try {
            String a = C13082e.m26317b().mo24593a();
            if (!TextUtils.isEmpty(a)) {
                list.add(new C18962e("x-tt-multi-sids", a));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m26343a(String str, List<C18962e> list) {
        try {
            String b = C13217i.m26603b(str, "passport_csrf_token");
            if (!TextUtils.isEmpty(b)) {
                list.add(new C18962e("x-tt-passport-csrf-token", b));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final C18963f m26339a(String str, Map<String, String> map) throws Exception {
        HashMap hashMap = new HashMap();
        C13216h hVar = new C13216h(str);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        hashMap.put("account_sdk_source", "app");
        ArrayList arrayList = new ArrayList();
        if (C18495c.m44742a().mo38464d()) {
            hashMap.put("multi_login", "1");
            m26345a((List<C18962e>) arrayList);
        }
        m26343a(str, (List<C18962e>) arrayList);
        hVar.mo24806a("account_sdk_version", 386);
        String hVar2 = hVar.toString();
        this.f34213f.f34152d = hVar2;
        return C13212e.m26596a(Integer.MAX_VALUE, hVar2, hashMap, arrayList);
    }

    public C13090h(Context context, C13073a aVar, C12989a aVar2) {
        this.f34209a = context.getApplicationContext();
        this.f34212e = aVar.f34143a;
        this.f34210b = aVar;
        this.f34214g = aVar2;
        if (aVar2 != null) {
            aVar2.mJobController = this;
        }
        this.f34211c = new WeakReference<>(aVar2);
        this.f34213f = new C13075b(aVar);
    }

    /* renamed from: a */
    private void m26344a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (("error".equals(str) || "exception".equals(str)) && jSONObject2 != null) {
            if (jSONObject2.has("error_code")) {
                this.f34213f.f34150b = jSONObject2.optInt("error_code", this.f34213f.f34150b);
            } else if (jSONObject2.has("code")) {
                this.f34213f.f34150b = jSONObject2.optInt("code", this.f34213f.f34150b);
            }
            this.f34213f.f34151c = jSONObject2.optString("description");
            this.f34213f.f34153e = this.f34213f.f34151c;
            mo24586a(jSONObject2, jSONObject);
        }
    }

    /* renamed from: a */
    private boolean m26346a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws Exception {
        if (!"success".equals(str)) {
            m26344a(str, jSONObject, jSONObject2);
            return false;
        }
        if (jSONObject2 != null) {
            mo24587b(jSONObject, jSONObject2);
        }
        return true;
    }
}
