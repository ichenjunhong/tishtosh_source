package com.p683ss.android.ugc.aweme.account.p1303p;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21671o;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21919k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21920l;
import com.p683ss.android.ugc.aweme.account.p1303p.C22100a.C22101a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
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

/* renamed from: com.ss.android.ugc.aweme.account.p.b */
public final class C22109b extends C21920l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59631a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22109b.class), "email", "getEmail()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22109b.class), "fromChangePwd", "getFromChangePwd()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22109b.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: e */
    public final String f59632e = "email_verify_success";

    /* renamed from: j */
    private final C52668f f59633j = C52732g.m112285a(new C22110a(this));

    /* renamed from: k */
    private final C52668f f59634k = C52732g.m112285a(new C22111b(this));

    /* renamed from: p */
    private final C52668f f59635p = C52732g.m112285a(new C22112c(this));

    /* renamed from: q */
    private HashMap f59636q;

    /* renamed from: com.ss.android.ugc.aweme.account.p.b$a */
    static final class C22110a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C22109b f59637a;

        C22110a(C22109b bVar) {
            this.f59637a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C21839d.f59130a.mo45972a((Fragment) this.f59637a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.b$b */
    static final class C22111b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C22109b f59638a;

        C22111b(C22109b bVar) {
            this.f59638a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59638a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(PasswordService.FROM_CHANGE_PWD));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.b$c */
    static final class C22112c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C22109b f59639a;

        C22112c(C22109b bVar) {
            this.f59639a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59639a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.b$d */
    static final class C22113d<T> implements C1710e<C12993e<C21671o>> {

        /* renamed from: a */
        final /* synthetic */ C22109b f59640a;

        C22113d(C22109b bVar) {
            this.f59640a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0088, code lost:
            if (r8 == null) goto L_0x008a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
                r7 = this;
                com.bytedance.sdk.account.a.a.e r8 = (com.bytedance.sdk.account.p844a.p845a.C12993e) r8
                com.ss.android.ugc.aweme.profile.model.User r0 = com.p683ss.android.ugc.aweme.C23826bi.m58468i()
                java.lang.String r1 = "ModuleStore.getCurUser()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r1 = 1
                r0.setEmailVerified(r1)
                com.ss.android.ugc.aweme.account.p.b r0 = r7.f59640a
                boolean r0 = r0.mo46209x()
                if (r0 == 0) goto L_0x0042
                java.lang.String r0 = "set_up_proAccount"
                com.ss.android.ugc.aweme.account.a.b.a r1 = new com.ss.android.ugc.aweme.account.a.b.a
                r1.<init>()
                java.lang.String r2 = "page"
                java.lang.String r3 = "Input Email Captcha"
                com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                java.lang.String r2 = "method"
                java.lang.String r3 = "verify_email"
                com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                java.lang.String r2 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.account.p.b r5 = r7.f59640a
                long r5 = r5.f59117m
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44775a(r2, r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56798a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            L_0x0042:
                android.app.Application r0 = com.p683ss.android.ugc.aweme.C23826bi.m58460b()
                android.content.Context r0 = (android.content.Context) r0
                com.ss.android.ugc.aweme.account.p.b r1 = r7.f59640a
                r2 = 2132544387(0x7f1c0b83, float:2.0741934E38)
                java.lang.String r1 = r1.getString(r2)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r0, r1)
                r0.mo19066a()
                com.ss.android.ugc.aweme.account.p.b r0 = r7.f59640a
                java.lang.String r0 = r0.f59632e
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Map r1 = (java.util.Map) r1
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "platForm"
                java.lang.String r2 = "email"
                r0.putString(r1, r2)
                T r8 = r8.f34007h
                com.ss.android.ugc.aweme.account.login.v2.a.o r8 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21671o) r8
                org.json.JSONObject r8 = r8.f34279l
                if (r8 == 0) goto L_0x008a
                java.lang.String r1 = "data"
                org.json.JSONObject r8 = r8.optJSONObject(r1)
                if (r8 == 0) goto L_0x008a
                java.lang.String r1 = "ticket"
                java.lang.String r8 = r8.optString(r1)
                if (r8 != 0) goto L_0x008c
            L_0x008a:
                java.lang.String r8 = ""
            L_0x008c:
                com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.m54512c(r0, r8)
                com.ss.android.ugc.aweme.account.p.b r8 = r7.f59640a
                android.os.Bundle r8 = r8.getArguments()
                if (r8 != 0) goto L_0x009a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x009a:
                java.lang.String r1 = "final_data"
                r8.putBundle(r1, r0)
                com.ss.android.ugc.aweme.account.p.b r8 = r7.f59640a
                com.ss.android.ugc.aweme.account.p.b r0 = r7.f59640a
                android.os.Bundle r0 = r0.getArguments()
                if (r0 != 0) goto L_0x00ac
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00ac:
                java.lang.String r1 = "arguments!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r8.mo45964b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1303p.C22109b.C22113d.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.b$e */
    static final class C22114e<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C22109b f59641a;

        C22114e(C22109b bVar) {
            this.f59641a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59641a.mo46025v();
        }
    }

    /* renamed from: y */
    private String m54912y() {
        return (String) this.f59633j.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59636q == null) {
            this.f59636q = new HashMap();
        }
        View view = (View) this.f59636q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59636q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59636q != null) {
            this.f59636q.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: x */
    public final boolean mo46209x() {
        return ((Boolean) this.f59635p.getValue()).booleanValue();
    }

    public final C21919k ab_() {
        C21919k kVar = new C21919k();
        kVar.mo46020a(m54912y());
        kVar.f59299b = false;
        kVar.f59301d = C21839d.m54513d(this);
        return kVar;
    }

    /* renamed from: h */
    public final void mo44871h() {
        if (mo46209x()) {
            C26890h.onEventV3("resend_code_email");
        }
        ((C2193n) C22101a.m54911a().invoke(this, m54912y(), "resend")).mo6496c((C1710e<? super T>) new C22114e<Object>(this)).mo6491b();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        int i;
        int i2;
        Object[] objArr;
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        if (mo46209x()) {
            i = R.string.hh0;
        } else {
            i = R.string.ag5;
        }
        aVar.f59182d = getString(i);
        if (mo46209x()) {
            i2 = R.string.hgz;
            objArr = new Object[]{m54912y()};
        } else {
            i2 = R.string.ag6;
            objArr = new Object[]{m54912y()};
        }
        aVar.f59183e = getString(i2, objArr);
        aVar.f59179a = " ";
        aVar.f59186h = false;
        return aVar;
    }

    /* renamed from: a_ */
    public final void mo44868a_(String str) {
        int i;
        C52711k.m112240b(str, "codes");
        C21829b bVar = this;
        if (((Boolean) this.f59634k.getValue()).booleanValue()) {
            i = 11;
        } else {
            i = 6;
        }
        C21677s.m54410b(bVar, str, i).mo6496c((C1710e<? super T>) new C22113d<Object>(this)).mo6491b();
    }
}
