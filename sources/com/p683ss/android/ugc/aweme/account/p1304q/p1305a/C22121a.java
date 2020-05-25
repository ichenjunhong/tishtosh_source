package com.p683ss.android.ugc.aweme.account.p1304q.p1305a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.sdk.account.p868i.p869a.C13178c;
import com.bytedance.sdk.account.p868i.p870b.C13179a;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.q.a.a */
public final class C22121a implements C10762d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59650a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22121a.class), "mOneKeyLoginService", "getMOneKeyLoginService()Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22121a.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

    /* renamed from: b */
    public CountDownLatch f59651b;

    /* renamed from: c */
    public C22123b f59652c;

    /* renamed from: d */
    public final WeakReference<Context> f59653d;

    /* renamed from: e */
    public final C10757a f59654e;

    /* renamed from: f */
    private final C52668f f59655f = C52732g.m112285a(C22131g.f59677a);

    /* renamed from: g */
    private C22122a f59656g;

    /* renamed from: h */
    private final C52668f f59657h = C52732g.m112285a(C22130f.f59676a);

    /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$a */
    public static final class C22122a {
        @C17952c(mo34828a = "getMask")

        /* renamed from: a */
        public Integer f59658a;
        @C17952c(mo34828a = "getToken")

        /* renamed from: b */
        public Integer f59659b;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$b */
    static final class C22123b {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f59660a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22123b.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"))};

        /* renamed from: g */
        public static final C22124a f59661g = new C22124a(null);

        /* renamed from: b */
        public String f59662b;

        /* renamed from: c */
        public volatile int f59663c = 1;

        /* renamed from: d */
        public volatile int f59664d;

        /* renamed from: e */
        public volatile int f59665e;

        /* renamed from: f */
        public volatile int f59666f;

        /* renamed from: h */
        private final C52668f f59667h = C52732g.m112285a(C22125b.f59668a);

        /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$b$a */
        public static final class C22124a {
            private C22124a() {
            }

            public /* synthetic */ C22124a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$b$b */
        static final class C22125b extends C52712l implements C52670a<JSONObject> {

            /* renamed from: a */
            public static final C22125b f59668a = new C22125b();

            C22125b() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new JSONObject();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final JSONObject mo46210a() {
            return (JSONObject) this.f59667h.getValue();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$c */
    public static final class C22126c {

        /* renamed from: a */
        final /* synthetic */ C22121a f59669a;

        /* renamed from: b */
        final /* synthetic */ C52723a f59670b;

        C22126c(C22121a aVar, C52723a aVar2) {
            this.f59669a = aVar;
            this.f59670b = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$d */
    public static final class C22127d {

        /* renamed from: a */
        final /* synthetic */ C22121a f59671a;

        /* renamed from: b */
        final /* synthetic */ C52723a f59672b;

        C22127d(C22121a aVar, C52723a aVar2) {
            this.f59671a = aVar;
            this.f59672b = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$e */
    static final class C22128e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22121a f59673a;

        /* renamed from: b */
        final /* synthetic */ C10766h f59674b;

        C22128e(C22121a aVar, C10766h hVar) {
            this.f59673a = aVar;
            this.f59674b = hVar;
        }

        public final void run() {
            CountDownLatch countDownLatch = this.f59673a.f59651b;
            if (countDownLatch == null) {
                C52711k.m112237a("countDownLatch");
            }
            countDownLatch.await();
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C22128e f59675a;

                {
                    this.f59675a = r1;
                }

                public final void run() {
                    JSONObject jSONObject;
                    C22121a aVar = this.f59675a.f59673a;
                    String str = this.f59675a.f59674b.f28945b;
                    C52711k.m112236a((Object) str, "jsMsg.callback_id");
                    C22123b bVar = this.f59675a.f59673a.f59652c;
                    if (bVar == null) {
                        C52711k.m112237a("jsResponseBody");
                    }
                    if (bVar.f59663c == 0) {
                        jSONObject = new JSONObject();
                        jSONObject.put("code", bVar.f59663c);
                        String str2 = "from";
                        String str3 = bVar.f59662b;
                        if (str3 == null) {
                            C52711k.m112237a("from");
                        }
                        jSONObject.put(str2, str3);
                        jSONObject.put("tokenErrorCode", bVar.f59664d);
                        jSONObject.put("maskErrorCode", bVar.f59665e);
                        jSONObject.put("networkType", bVar.f59666f);
                    } else {
                        bVar.mo46210a().put("code", bVar.f59663c);
                        JSONObject a = bVar.mo46210a();
                        String str4 = "from";
                        String str5 = bVar.f59662b;
                        if (str5 == null) {
                            C52711k.m112237a("from");
                        }
                        a.put(str4, str5);
                        jSONObject = bVar.mo46210a();
                    }
                    aVar.f59654e.mo19455a(str, jSONObject);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$f */
    static final class C22130f extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C22130f f59676a = new C22130f();

        C22130f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C17971f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.q.a.a$g */
    static final class C22131g extends C52712l implements C52670a<C13178c> {

        /* renamed from: a */
        public static final C22131g f59677a = new C22131g();

        C22131g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C13178c) C13179a.m26562a(C13178c.class);
        }
    }

    /* renamed from: a */
    private final C13178c m54927a() {
        return (C13178c) this.f59655f.getValue();
    }

    public C22121a(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "iesJsBridge");
        this.f59653d = weakReference;
        this.f59654e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r2.intValue() != 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r2.intValue() != 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.p675g.p676a.C10766h r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            java.lang.String r6 = "jsMsg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
            r6 = 0
            r5.f28951h = r6
            com.ss.android.ugc.aweme.account.q.a.a$b r0 = new com.ss.android.ugc.aweme.account.q.a.a$b
            r0.<init>()
            r4.f59652c = r0
            com.ss.android.ugc.aweme.account.q.a.a$b r0 = r4.f59652c
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = "jsResponseBody"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0018:
            com.bytedance.sdk.account.i.a.c r1 = r4.m54927a()
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = r1.mo24793a()
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r1 = ""
        L_0x0026:
            java.lang.String r2 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r0.f59662b = r1
            com.ss.android.ugc.aweme.account.q.a.a$b r0 = r4.f59652c
            if (r0 != 0) goto L_0x0036
            java.lang.String r1 = "jsResponseBody"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0036:
            com.bytedance.sdk.account.i.a.c r1 = r4.m54927a()
            int r1 = r1.mo24794b()
            r0.f59666f = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "from: "
            r0.<init>(r1)
            com.ss.android.ugc.aweme.account.q.a.a$b r1 = r4.f59652c
            if (r1 != 0) goto L_0x0050
            java.lang.String r2 = "jsResponseBody"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0050:
            java.lang.String r1 = r1.f59662b
            if (r1 != 0) goto L_0x0059
            java.lang.String r2 = "from"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0059:
            r0.append(r1)
            d.f r0 = r4.f59657h
            java.lang.Object r0 = r0.getValue()
            com.google.gson.f r0 = (com.google.gson.C17971f) r0
            org.json.JSONObject r1 = r5.f28947d
            java.lang.String r1 = r1.toString()
            java.lang.Class<com.ss.android.ugc.aweme.account.q.a.a$a> r2 = com.p683ss.android.ugc.aweme.account.p1304q.p1305a.C22121a.C22122a.class
            java.lang.Object r0 = r0.mo34884a(r1, r2)
            java.lang.String r1 = "gson.fromJson(jsMsg.para…(), JsParams::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.account.q.a.a$a r0 = (com.p683ss.android.ugc.aweme.account.p1304q.p1305a.C22121a.C22122a) r0
            com.ss.android.ugc.aweme.account.q.a.a$b r1 = r4.f59652c
            if (r1 != 0) goto L_0x0080
            java.lang.String r2 = "jsResponseBody"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0080:
            java.lang.Integer r2 = r0.f59658a
            r3 = 1
            if (r2 == 0) goto L_0x009b
            java.lang.Integer r2 = r0.f59658a
            if (r2 != 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x009b
        L_0x0090:
            java.lang.Integer r2 = r0.f59658a
            if (r2 != 0) goto L_0x0095
            goto L_0x00b5
        L_0x0095:
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x00b5
        L_0x009b:
            java.lang.Integer r2 = r0.f59659b
            if (r2 == 0) goto L_0x00c3
            java.lang.Integer r2 = r0.f59659b
            if (r2 != 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x00c3
        L_0x00aa:
            java.lang.Integer r2 = r0.f59659b
            if (r2 != 0) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x00c3
        L_0x00b5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0.f59658a = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0.f59659b = r2
            r1.f59663c = r6
        L_0x00c3:
            r4.f59656g = r0
            com.ss.android.ugc.aweme.account.q.a.a$a r0 = r4.f59656g
            if (r0 != 0) goto L_0x00ce
            java.lang.String r1 = "jsParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00ce:
            java.lang.Integer r0 = r0.f59658a
            if (r0 == 0) goto L_0x00d7
            int r0 = r0.intValue()
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            int r0 = r0 + r6
            com.ss.android.ugc.aweme.account.q.a.a$a r1 = r4.f59656g
            if (r1 != 0) goto L_0x00e2
            java.lang.String r2 = "jsParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00e2:
            java.lang.Integer r1 = r1.f59659b
            if (r1 == 0) goto L_0x00eb
            int r1 = r1.intValue()
            goto L_0x00ec
        L_0x00eb:
            r1 = 0
        L_0x00ec:
            int r0 = r0 + r1
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r1.<init>(r0)
            r4.f59651b = r1
            com.ss.android.ugc.aweme.account.q.a.a$a r0 = r4.f59656g
            if (r0 != 0) goto L_0x00fd
            java.lang.String r1 = "jsParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00fd:
            java.lang.Integer r0 = r0.f59658a
            if (r0 != 0) goto L_0x0102
            goto L_0x0117
        L_0x0102:
            int r0 = r0.intValue()
            if (r3 != r0) goto L_0x0117
            d.f.b.v$a r0 = new d.f.b.v$a
            r0.<init>()
            r0.element = r6
            r4.m54927a()
            com.ss.android.ugc.aweme.account.q.a.a$c r1 = new com.ss.android.ugc.aweme.account.q.a.a$c
            r1.<init>(r4, r0)
        L_0x0117:
            com.ss.android.ugc.aweme.account.q.a.a$a r0 = r4.f59656g
            if (r0 != 0) goto L_0x0120
            java.lang.String r1 = "jsParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0120:
            java.lang.Integer r0 = r0.f59659b
            if (r0 != 0) goto L_0x0125
            goto L_0x013a
        L_0x0125:
            int r0 = r0.intValue()
            if (r3 != r0) goto L_0x013a
            d.f.b.v$a r0 = new d.f.b.v$a
            r0.<init>()
            r0.element = r6
            r4.m54927a()
            com.ss.android.ugc.aweme.account.q.a.a$d r6 = new com.ss.android.ugc.aweme.account.q.a.a$d
            r6.<init>(r4, r0)
        L_0x013a:
            java.lang.Thread r6 = new java.lang.Thread
            com.ss.android.ugc.aweme.account.q.a.a$e r0 = new com.ss.android.ugc.aweme.account.q.a.a$e
            r0.<init>(r4, r5)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r6.<init>(r0)
            r6.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1304q.p1305a.C22121a.call(com.bytedance.ies.g.a.h, org.json.JSONObject):void");
    }
}
