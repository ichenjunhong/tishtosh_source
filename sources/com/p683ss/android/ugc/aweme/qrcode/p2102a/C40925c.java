package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53511ah;
import okhttp3.C53512ai;
import okhttp3.C53682y;
import okio.ByteString;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.c */
public final class C40925c extends C40922a {

    /* renamed from: c */
    public static final C40926a f104148c = new C40926a(null);

    /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$a */
    public static final class C40926a {
        private C40926a() {
        }

        public /* synthetic */ C40926a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$b */
    public static final class C40927b extends C53512ai {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f104149a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40927b.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

        /* renamed from: b */
        public final String f104150b;

        /* renamed from: c */
        private final C52668f f104151c = C52732g.m112285a(C40928a.f104152a);

        /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$b$a */
        static final class C40928a extends C52712l implements C52670a<C17971f> {

            /* renamed from: a */
            public static final C40928a f104152a = new C40928a();

            C40928a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new C17971f();
            }
        }

        public C40927b(String str) {
            C52711k.m112240b(str, "wsUrl");
            this.f104150b = str;
        }

        public final void onMessage(C53511ah ahVar, ByteString byteString) {
            C52711k.m112240b(ahVar, "webSocket");
            C52711k.m112240b(byteString, "bytes");
            super.onMessage(ahVar, byteString);
        }

        public final void onOpen(C53511ah ahVar, C53504ad adVar) {
            C52711k.m112240b(ahVar, "webSocket");
            C52711k.m112240b(adVar, "response");
            super.onOpen(ahVar, adVar);
        }

        public final void onMessage(C53511ah ahVar, String str) {
            Object obj;
            Context context;
            C52711k.m112240b(ahVar, "webSocket");
            C52711k.m112240b(str, "text");
            super.onMessage(ahVar, str);
            C40929c cVar = (C40929c) ((C17971f) this.f104151c.getValue()).mo34884a(str, C40929c.class);
            Intent intent = new Intent();
            Uri parse = Uri.parse(cVar.f104153a);
            CharSequence charSequence = "aweme";
            C52711k.m112236a((Object) parse, "uri");
            if (TextUtils.equals(charSequence, parse.getScheme())) {
                Activity g = C11016e.m22312g();
                if (g != null) {
                    context = g;
                } else {
                    context = C11010c.m22280a();
                }
                SmartRouter.buildRoute(context, cVar.f104153a).open();
                return;
            }
            Boolean bool = null;
            if (TextUtils.equals(WebKitApi.SCHEME_HTTP, parse.getScheme()) || TextUtils.equals(WebKitApi.SCHEME_HTTPS, parse.getScheme())) {
                intent.setData(parse);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
            } else {
                Builder buildUpon = parse.buildUpon();
                StringBuilder sb = new StringBuilder(C23057c.f61424b);
                sb.append(C23018b.f61359a);
                intent.setData(buildUpon.scheme(sb.toString()).build());
                if (cVar != null) {
                    obj = cVar.f104157e;
                } else {
                    obj = null;
                }
                if (C52711k.m112239a(obj, (Object) Boolean.valueOf(true))) {
                    intent.putExtra("ws", this.f104150b);
                }
            }
            intent.setFlags(268435456);
            C11010c.m22280a().startActivity(intent);
            if (cVar != null) {
                bool = cVar.f104157e;
            }
            if (C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
                Process.killProcess(Process.myPid());
            }
        }

        public final void onClosed(C53511ah ahVar, int i, String str) {
            C52711k.m112240b(ahVar, "webSocket");
            C52711k.m112240b(str, "reason");
            super.onClosed(ahVar, i, str);
        }

        public final void onClosing(C53511ah ahVar, int i, String str) {
            C52711k.m112240b(ahVar, "webSocket");
            C52711k.m112240b(str, "reason");
            super.onClosing(ahVar, i, str);
        }

        public final void onFailure(C53511ah ahVar, Throwable th, C53504ad adVar) {
            C52711k.m112240b(ahVar, "webSocket");
            C52711k.m112240b(th, "t");
            super.onFailure(ahVar, th, adVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$c */
    public static final class C40929c {
        @C17952c(mo34828a = "o_url")

        /* renamed from: a */
        public String f104153a;
        @C17952c(mo34828a = "scene_name")

        /* renamed from: b */
        public String f104154b;
        @C17952c(mo34828a = "from_type")

        /* renamed from: c */
        public Integer f104155c;
        @C17952c(mo34828a = "stage")

        /* renamed from: d */
        public Integer f104156d;
        @C17952c(mo34828a = "is_cold_launch")

        /* renamed from: e */
        public Boolean f104157e;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f104157e, (java.lang.Object) r3.f104157e) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.qrcode.p2102a.C40925c.C40929c
                if (r0 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.qrcode.a.c$c r3 = (com.p683ss.android.ugc.aweme.qrcode.p2102a.C40925c.C40929c) r3
                java.lang.String r0 = r2.f104153a
                java.lang.String r1 = r3.f104153a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f104154b
                java.lang.String r1 = r3.f104154b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Integer r0 = r2.f104155c
                java.lang.Integer r1 = r3.f104155c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Integer r0 = r2.f104156d
                java.lang.Integer r1 = r3.f104156d
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Boolean r0 = r2.f104157e
                java.lang.Boolean r3 = r3.f104157e
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.qrcode.p2102a.C40925c.C40929c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f104153a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f104154b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num = this.f104155c;
            int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f104156d;
            int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Boolean bool = this.f104157e;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeeplinkData(url=");
            sb.append(this.f104153a);
            sb.append(", scene_name=");
            sb.append(this.f104154b);
            sb.append(", from_type=");
            sb.append(this.f104155c);
            sb.append(", stage=");
            sb.append(this.f104156d);
            sb.append(", is_cold_launch=");
            sb.append(this.f104157e);
            sb.append(")");
            return sb.toString();
        }
    }

    public C40925c(C40923a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public static void m90511a(String str) {
        C52711k.m112240b(str, "url");
        C53498ab c = new C53499a().mo111262a(str).mo111272c();
        C53682y yVar = new C53682y();
        yVar.mo111651a(c, new C40927b(str));
        yVar.f133192c.mo111573a().shutdown();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008c, code lost:
        if (r0 == null) goto L_0x008e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83412a(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r4 = 0
            if (r3 == 0) goto L_0x00a2
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            goto L_0x00a2
        L_0x000e:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = "dptower.bytedance.net"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r1)
            java.lang.String r1 = r3.getHost()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00a1
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "app_name"
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r1 = 2132541961(0x7f1c0209, float:2.0737013E38)
            java.lang.String r0 = r0.getString(r1)
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "device_id"
            java.lang.String r0 = com.p683ss.android.common.applog.TeaAgent.getServerDeviceId()
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "app_id"
            int r0 = com.p683ss.android.ugc.aweme.app.application.C23018b.f61359a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "app_version"
            java.lang.String r0 = "16.0.41"
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "ios_version"
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "device_name"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Android "
            r0.<init>(r1)
            java.lang.String r1 = android.os.Build.BRAND
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "user_id"
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = r0.getCurUserId()
            if (r0 != 0) goto L_0x0090
        L_0x008e:
            java.lang.String r0 = "null"
        L_0x0090:
            r3.appendQueryParameter(r4, r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "uri.buildUpon().apply {\n…\n            }.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            m90511a(r3)
            r3 = 1
            return r3
        L_0x00a1:
            return r4
        L_0x00a2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.qrcode.p2102a.C40925c.mo83412a(java.lang.String, int):boolean");
    }
}
