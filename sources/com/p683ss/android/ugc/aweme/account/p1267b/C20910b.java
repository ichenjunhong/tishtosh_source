package com.p683ss.android.ugc.aweme.account.p1267b;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21661g;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21678a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21717b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21753c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21806u;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21919k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21920l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
import p064c.p065a.C2197r;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.b.b */
public final class C20910b extends C21920l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56893a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20910b.class), "email", "getEmail()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20910b.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: e */
    private final C52668f f56894e = C52732g.m112285a(new C20911a(this));

    /* renamed from: j */
    private final C52668f f56895j = C52732g.m112285a(new C20912b(this));

    /* renamed from: k */
    private HashMap f56896k;

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$a */
    static final class C20911a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C20910b f56897a;

        C20911a(C20910b bVar) {
            this.f56897a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C21839d.f59130a.mo45972a((Fragment) this.f56897a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$b */
    static final class C20912b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C20910b f56898a;

        C20912b(C20910b bVar) {
            this.f56898a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f56898a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$c */
    static final class C20913c<T> implements C1710e<C12993e<C21661g>> {

        /* renamed from: a */
        final /* synthetic */ C20910b f56899a;

        C20913c(C20910b bVar) {
            this.f56899a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b6, code lost:
            if (r8 == null) goto L_0x00b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
            if (r1 == null) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
                r7 = this;
                com.bytedance.sdk.account.a.a.e r8 = (com.bytedance.sdk.account.p844a.p845a.C12993e) r8
                com.ss.android.ugc.aweme.profile.model.User r0 = com.p683ss.android.ugc.aweme.C23826bi.m58468i()
                T r1 = r8.f34007h
                com.ss.android.ugc.aweme.account.login.v2.a.g r1 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21661g) r1
                org.json.JSONObject r1 = r1.f34279l
                if (r1 == 0) goto L_0x001e
                java.lang.String r2 = "data"
                org.json.JSONObject r1 = r1.optJSONObject(r2)
                if (r1 == 0) goto L_0x001e
                java.lang.String r2 = "email"
                java.lang.String r1 = r1.optString(r2)
                if (r1 != 0) goto L_0x0020
            L_0x001e:
                java.lang.String r1 = ""
            L_0x0020:
                r0.setEmail(r1)
                r1 = 1
                r0.setEmailVerified(r1)
                r0.setHasEmail(r1)
                android.app.Application r0 = com.p683ss.android.ugc.aweme.C23826bi.m58460b()
                android.content.Context r0 = (android.content.Context) r0
                com.ss.android.ugc.aweme.account.b.b r2 = r7.f56899a
                r3 = 2132544366(0x7f1c0b6e, float:2.0741891E38)
                java.lang.String r2 = r2.getString(r3)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r0, r2)
                r0.mo19066a()
                java.lang.String r0 = com.p683ss.android.ugc.aweme.account.p1267b.C20903a.C20904a.m53251a()
                com.ss.android.ugc.aweme.app.f.d r2 = new com.ss.android.ugc.aweme.app.f.d
                r2.<init>()
                java.lang.String r3 = "type"
                com.ss.android.ugc.aweme.app.f.d r1 = r2.mo47826a(r3, r1)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
                com.ss.android.ugc.aweme.account.b.b r0 = r7.f56899a
                boolean r0 = r0.ac_()
                if (r0 == 0) goto L_0x0087
                java.lang.String r0 = "set_up_proAccount"
                com.ss.android.ugc.aweme.account.a.b.a r1 = new com.ss.android.ugc.aweme.account.a.b.a
                r1.<init>()
                java.lang.String r2 = "page"
                java.lang.String r3 = "Input Email Captcha"
                com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                java.lang.String r2 = "method"
                java.lang.String r3 = "set_by_email"
                com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                java.lang.String r2 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.account.b.b r5 = r7.f56899a
                long r5 = r5.f59117m
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44775a(r2, r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56798a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            L_0x0087:
                com.ss.android.ugc.aweme.account.b.b r0 = r7.f56899a
                android.os.Bundle r0 = r0.getArguments()
                if (r0 != 0) goto L_0x0092
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0092:
                java.lang.String r1 = "final_data"
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r3 = "platForm"
                java.lang.String r4 = "email"
                r2.putString(r3, r4)
                T r8 = r8.f34007h
                com.ss.android.ugc.aweme.account.login.v2.a.g r8 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21661g) r8
                org.json.JSONObject r8 = r8.f34279l
                if (r8 == 0) goto L_0x00b8
                java.lang.String r3 = "data"
                org.json.JSONObject r8 = r8.optJSONObject(r3)
                if (r8 == 0) goto L_0x00b8
                java.lang.String r3 = "ticket"
                java.lang.String r8 = r8.optString(r3)
                if (r8 != 0) goto L_0x00ba
            L_0x00b8:
                java.lang.String r8 = ""
            L_0x00ba:
                com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.m54512c(r2, r8)
                r0.putBundle(r1, r2)
                com.ss.android.ugc.aweme.account.b.b r8 = r7.f56899a
                com.ss.android.ugc.aweme.account.b.b r0 = r7.f56899a
                android.os.Bundle r0 = r0.getArguments()
                if (r0 != 0) goto L_0x00cd
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00cd:
                java.lang.String r1 = "arguments!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r8.mo45964b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1267b.C20910b.C20913c.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$d */
    static final class C20914d<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C20910b f56900a;

        C20914d(C20910b bVar) {
            this.f56900a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f56900a.mo46025v();
        }
    }

    /* renamed from: x */
    private String m53252x() {
        return (String) this.f56894e.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f56896k == null) {
            this.f56896k = new HashMap();
        }
        View view = (View) this.f56896k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f56896k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean ac_() {
        return ((Boolean) this.f56895j.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f56896k != null) {
            this.f56896k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final C21919k ab_() {
        C21919k kVar = new C21919k();
        kVar.mo46020a(m53252x());
        kVar.f59299b = false;
        kVar.f59301d = C21839d.m54513d(this);
        return kVar;
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f59182d = getString(R.string.ag5);
        aVar.f59183e = getString(R.string.ag6, m53252x());
        aVar.f59179a = " ";
        aVar.f59186h = false;
        return aVar;
    }

    /* renamed from: h */
    public final void mo44871h() {
        if (ac_()) {
            C26890h.onEventV3("resend_code_email");
        }
        ((C2193n) C20903a.f56882c.invoke(this, m53252x(), "resend")).mo6496c((C1710e<? super T>) new C20914d<Object>(this)).mo6491b();
    }

    /* renamed from: a_ */
    public final void mo44868a_(String str) {
        C52711k.m112240b(str, "codes");
        C21829b bVar = this;
        String x = m53252x();
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        boolean z = arguments.getBoolean(PasswordService.FROM_CHANGE_PWD, false);
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(x, "email");
        C52711k.m112240b(str, "codes");
        C2193n a = C2193n.m6558a((C2197r<T>) new C21678a<T>(bVar, x, str, z)).mo6496c((C1710e<? super T>) new C21717b<Object>(bVar)).mo6486a((C1710e<? super Throwable>) new C21753c<Object>(bVar));
        C52711k.m112236a((Object) a, "Maybe.create<MobileApiRe…errorMsg, null)\n        }");
        C21806u.m54453a(bVar, a).mo6496c((C1710e<? super T>) new C20913c<Object>(this)).mo6491b();
    }
}
