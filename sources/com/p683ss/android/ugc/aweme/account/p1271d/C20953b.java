package com.p683ss.android.ugc.aweme.account.p1271d;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21667l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21778g;
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

/* renamed from: com.ss.android.ugc.aweme.account.d.b */
public final class C20953b extends C21920l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f57051a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20953b.class), "email", "getEmail()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20953b.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: e */
    private final C52668f f57052e = C52732g.m112285a(new C20954a(this));

    /* renamed from: j */
    private final C52668f f57053j = C52732g.m112285a(new C20955b(this));

    /* renamed from: k */
    private HashMap f57054k;

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$a */
    static final class C20954a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C20953b f57055a;

        C20954a(C20953b bVar) {
            this.f57055a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C21839d.f59130a.mo45972a((Fragment) this.f57055a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$b */
    static final class C20955b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C20953b f57056a;

        C20955b(C20953b bVar) {
            this.f57056a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f57056a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$c */
    static final class C20956c<T> implements C1710e<C12993e<C21667l>> {

        /* renamed from: a */
        final /* synthetic */ C20953b f57057a;

        C20956c(C20953b bVar) {
            this.f57057a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
            if (r7 == null) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            if (r1 == null) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
                r6 = this;
                com.bytedance.sdk.account.a.a.e r7 = (com.bytedance.sdk.account.p844a.p845a.C12993e) r7
                com.ss.android.ugc.aweme.account.login.v2.base.d r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.f59130a
                com.ss.android.ugc.aweme.account.d.b r1 = r6.f57057a
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                java.lang.String r2 = ""
                r0.mo45974b(r1, r2)
                com.ss.android.ugc.aweme.profile.model.User r0 = com.p683ss.android.ugc.aweme.C23826bi.m58468i()
                T r1 = r7.f34007h
                com.ss.android.ugc.aweme.account.login.v2.a.l r1 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21667l) r1
                org.json.JSONObject r1 = r1.f34279l
                if (r1 == 0) goto L_0x0029
                java.lang.String r2 = "data"
                org.json.JSONObject r1 = r1.optJSONObject(r2)
                if (r1 == 0) goto L_0x0029
                java.lang.String r2 = "email"
                java.lang.String r1 = r1.optString(r2)
                if (r1 != 0) goto L_0x002b
            L_0x0029:
                java.lang.String r1 = ""
            L_0x002b:
                r0.setEmail(r1)
                r1 = 1
                r0.setEmailVerified(r1)
                r0.setHasEmail(r1)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "platForm"
                java.lang.String r2 = "email"
                r0.putString(r1, r2)
                T r7 = r7.f34007h
                com.ss.android.ugc.aweme.account.login.v2.a.l r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21667l) r7
                org.json.JSONObject r7 = r7.f34279l
                if (r7 == 0) goto L_0x0059
                java.lang.String r1 = "data"
                org.json.JSONObject r7 = r7.optJSONObject(r1)
                if (r7 == 0) goto L_0x0059
                java.lang.String r1 = "ticket"
                java.lang.String r7 = r7.optString(r1)
                if (r7 != 0) goto L_0x005b
            L_0x0059:
                java.lang.String r7 = ""
            L_0x005b:
                com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.m54512c(r0, r7)
                com.ss.android.ugc.aweme.account.d.b r7 = r6.f57057a
                android.os.Bundle r7 = r7.getArguments()
                if (r7 != 0) goto L_0x0069
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0069:
                java.lang.String r1 = "final_data"
                r7.putBundle(r1, r0)
                android.app.Application r7 = com.p683ss.android.ugc.aweme.C23826bi.m58460b()
                android.content.Context r7 = (android.content.Context) r7
                com.ss.android.ugc.aweme.account.d.b r0 = r6.f57057a
                r1 = 2132544386(0x7f1c0b82, float:2.0741932E38)
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r7, r0)
                r7.mo19066a()
                java.lang.String r7 = com.p683ss.android.ugc.aweme.account.p1267b.C20903a.C20904a.m53251a()
                com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                r0.<init>()
                java.lang.String r1 = "type"
                r2 = 2
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
                com.ss.android.ugc.aweme.account.d.b r7 = r6.f57057a
                boolean r7 = r7.af_()
                if (r7 == 0) goto L_0x00cc
                java.lang.String r7 = "set_up_proAccount"
                com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
                r0.<init>()
                java.lang.String r1 = "page"
                java.lang.String r2 = "Input Email Captcha"
                com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
                java.lang.String r1 = "method"
                java.lang.String r2 = "use_new_email"
                com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
                java.lang.String r1 = "duration"
                long r2 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.account.d.b r4 = r6.f57057a
                long r4 = r4.f59117m
                long r2 = r2 - r4
                com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44775a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
            L_0x00cc:
                com.ss.android.ugc.aweme.account.d.b r7 = r6.f57057a
                com.ss.android.ugc.aweme.account.d.b r0 = r6.f57057a
                android.os.Bundle r0 = r0.getArguments()
                if (r0 != 0) goto L_0x00d9
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00d9:
                java.lang.String r1 = "arguments!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r7.mo45964b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1271d.C20953b.C20956c.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$d */
    static final class C20957d<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C20953b f57058a;

        C20957d(C20953b bVar) {
            this.f57058a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f57058a.mo46025v();
        }
    }

    /* renamed from: x */
    private String m53313x() {
        return (String) this.f57052e.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f57054k == null) {
            this.f57054k = new HashMap();
        }
        View view = (View) this.f57054k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f57054k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean af_() {
        return ((Boolean) this.f57053j.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f57054k != null) {
            this.f57054k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final C21919k ab_() {
        C21919k kVar = new C21919k();
        kVar.mo46020a(m53313x());
        kVar.f59299b = false;
        kVar.f59301d = C21839d.m54513d(this);
        return kVar;
    }

    /* renamed from: h */
    public final void mo44871h() {
        if (af_()) {
            C26890h.onEventV3("resend_code_email");
        }
        ((C2193n) C20946a.f57042c.invoke(this, m53313x(), "resend")).mo6496c((C1710e<? super T>) new C20957d<Object>(this)).mo6491b();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        int i;
        int i2;
        Object[] objArr;
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        if (af_()) {
            i = R.string.hh0;
        } else {
            i = R.string.ag5;
        }
        aVar.f59182d = getString(i);
        if (af_()) {
            i2 = R.string.hgz;
            objArr = new Object[]{m53313x()};
        } else {
            i2 = R.string.ag6;
            objArr = new Object[]{m53313x()};
        }
        aVar.f59183e = getString(i2, objArr);
        aVar.f59179a = " ";
        aVar.f59186h = false;
        return aVar;
    }

    /* renamed from: a_ */
    public final void mo44868a_(String str) {
        C52711k.m112240b(str, "codes");
        C21829b bVar = this;
        String x = m53313x();
        String e = C21839d.m54514e(this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        boolean z = arguments.getBoolean(PasswordService.FROM_CHANGE_PWD, false);
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(x, "email");
        C52711k.m112240b(str, "code");
        C52711k.m112240b(e, "ticket");
        C21778g gVar = new C21778g(bVar, str, x, e, z);
        C2193n a = C2193n.m6558a((C2197r<T>) gVar);
        C52711k.m112236a((Object) a, "Maybe.create<MobileApiRe…llBack).start()\n        }");
        C21806u.m54453a(bVar, a).mo6496c((C1710e<? super T>) new C20956c<Object>(this)).mo6491b();
    }
}
