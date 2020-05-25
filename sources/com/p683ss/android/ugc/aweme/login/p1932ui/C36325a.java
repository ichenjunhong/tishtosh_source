package com.p683ss.android.ugc.aweme.login.p1932ui;

import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2649l.C52786h;

/* renamed from: com.ss.android.ugc.aweme.login.ui.a */
public final class C36325a {

    /* renamed from: b */
    public static final C52668f f92955b = C52732g.m112286a(C52757k.SYNCHRONIZED, C36327b.f92959a);

    /* renamed from: c */
    public static final C36326a f92956c = new C36326a(null);

    /* renamed from: a */
    public final AtomicBoolean f92957a = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$a */
    public static final class C36326a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f92958a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C36326a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/login/ui/LogoutDialogUtils;"))};

        private C36326a() {
        }

        /* renamed from: a */
        public static C36325a m81962a() {
            return (C36325a) C36325a.f92955b.getValue();
        }

        public /* synthetic */ C36326a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$b */
    static final class C36327b extends C52712l implements C52670a<C36325a> {

        /* renamed from: a */
        public static final C36327b f92959a = new C36327b();

        C36327b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C36325a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$c */
    static final class C36328c extends C52712l implements C52671b<C12685b, Boolean> {

        /* renamed from: a */
        public static final C36328c f92960a = new C36328c();

        C36328c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C12685b bVar = (C12685b) obj;
            C52711k.m112236a((Object) bVar, "it");
            return Boolean.valueOf(C52711k.m112239a((Object) bVar.f33318a, (Object) "x-tt-logid"));
        }
    }

    /* renamed from: a */
    public final void mo75220a() {
        this.f92957a.set(false);
    }

    /* renamed from: b */
    public static void m81960b(C12686c cVar) {
        if (cVar != null) {
            try {
                List<C12685b> list = cVar.f33322c;
                if (list != null) {
                    C12685b bVar = (C12685b) C52786h.m112347c(C52786h.m112340a(C52575l.m112148k(list), (C52671b<? super T, Boolean>) C36328c.f92960a));
                    if (bVar != null) {
                        C23569o.m57776a("aweme_request_force_logout_log", 0, C23088c.m56631a().mo47824a("URL", cVar.mo23860c()).mo47822a("errorCode", Integer.valueOf(8)).mo47824a("x-tt-logid", bVar.f33319b).mo47825b());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[Catch:{ Exception -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d A[Catch:{ Exception -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3 A[ADDED_TO_REGION, Catch:{ Exception -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9 A[Catch:{ Exception -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba A[Catch:{ Exception -> 0x00db }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m81959a(com.bytedance.retrofit2.p830a.C12686c r10) {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x0006
            java.lang.String r1 = r10.f33321b     // Catch:{ Exception -> 0x00db }
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00db }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00db }
            if (r1 != 0) goto L_0x00db
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00db }
            r1.<init>()     // Catch:{ Exception -> 0x00db }
            if (r10 == 0) goto L_0x0019
            java.lang.String r2 = r10.f33321b     // Catch:{ Exception -> 0x00db }
            goto L_0x001a
        L_0x0019:
            r2 = r0
        L_0x001a:
            r3 = r1
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x00db }
            com.p683ss.android.account.token.C18503c.m44775a(r2, r3)     // Catch:{ Exception -> 0x00db }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x00db }
        L_0x0024:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00db }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00db }
            com.bytedance.retrofit2.a.b r3 = (com.bytedance.retrofit2.p830a.C12685b) r3     // Catch:{ Exception -> 0x00db }
            java.lang.String r6 = "X-Tt-Token"
            java.lang.String r7 = "h"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = r3.f33318a     // Catch:{ Exception -> 0x00db }
            boolean r3 = p2628d.p2650m.C52830p.m112406a(r6, r3, r4)     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x0024
            r2 = 1
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            android.webkit.CookieManager r3 = android.webkit.CookieManager.getInstance()     // Catch:{ Exception -> 0x00db }
            java.lang.String r6 = "tiktokv.com"
            java.lang.String r3 = r3.getCookie(r6)     // Catch:{ Exception -> 0x00db }
            android.webkit.CookieManager r6 = android.webkit.CookieManager.getInstance()     // Catch:{ Exception -> 0x00db }
            java.lang.String r7 = "musical.ly"
            java.lang.String r6 = r6.getCookie(r7)     // Catch:{ Exception -> 0x00db }
            r7 = r3
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00db }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00db }
            r8 = 2
            if (r7 != 0) goto L_0x0076
            java.lang.String r7 = "cookie"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)     // Catch:{ Exception -> 0x00db }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x00db }
            java.lang.String r7 = "sessionid"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00db }
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r3, r7, r5, r8, r0)     // Catch:{ Exception -> 0x00db }
            if (r3 != 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r3 = 0
            goto L_0x0077
        L_0x0076:
            r3 = 1
        L_0x0077:
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00db }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00db }
            if (r7 != 0) goto L_0x0094
            java.lang.String r7 = "cookie2"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Exception -> 0x00db }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x00db }
            java.lang.String r7 = "sessionid"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00db }
            boolean r6 = p2628d.p2650m.C52830p.m112456b(r6, r7, r5, r8, r0)     // Catch:{ Exception -> 0x00db }
            if (r6 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r6 = 0
            goto L_0x0095
        L_0x0094:
            r6 = 1
        L_0x0095:
            com.ss.android.ugc.aweme.app.f.c r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Exception -> 0x00db }
            java.lang.String r9 = "path"
            if (r10 == 0) goto L_0x00a1
            java.lang.String r0 = r10.mo23860c()     // Catch:{ Exception -> 0x00db }
        L_0x00a1:
            com.ss.android.ugc.aweme.app.f.c r10 = r7.mo47824a(r9, r0)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "has_token"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.app.f.c r10 = r10.mo47819a(r0, r2)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "empty"
            if (r6 == 0) goto L_0x00b7
            if (r3 == 0) goto L_0x00b7
            r4 = 0
            goto L_0x00bb
        L_0x00b7:
            if (r6 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r4 = 2
        L_0x00bb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.app.f.c r10 = r10.mo47822a(r0, r2)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "size"
            int r1 = r1.size()     // Catch:{ Exception -> 0x00db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.app.f.c r10 = r10.mo47822a(r0, r1)     // Catch:{ Exception -> 0x00db }
            org.json.JSONObject r10 = r10.mo47825b()     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "session_expired_dialog_show"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r10)     // Catch:{ Exception -> 0x00db }
            return
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.login.p1932ui.C36325a.m81959a(com.bytedance.retrofit2.a.c):void");
    }
}
