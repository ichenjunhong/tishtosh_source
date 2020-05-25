package com.p683ss.android.ugc.aweme.account.p1300n;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21919k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21920l;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
import p064c.p065a.p071d.C1706a;
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

/* renamed from: com.ss.android.ugc.aweme.account.n.b */
public final class C22061b extends C21920l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59563a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22061b.class), "phone", "getPhone()Ljava/lang/String;"))};

    /* renamed from: e */
    private final C52668f f59564e = C52732g.m112285a(new C22063b(this));

    /* renamed from: j */
    private HashMap f59565j;

    /* renamed from: com.ss.android.ugc.aweme.account.n.b$a */
    static final class C22062a<T> implements C1710e<C12996h> {

        /* renamed from: a */
        final /* synthetic */ C22061b f59566a;

        C22062a(C22061b bVar) {
            this.f59566a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12996h hVar = (C12996h) obj;
            C21839d dVar = C21839d.f59130a;
            Fragment fragment = this.f59566a;
            C52711k.m112236a((Object) hVar, "it");
            String str = hVar.f34021h;
            C52711k.m112236a((Object) str, "it.ticket");
            dVar.mo45974b(fragment, str);
            C22061b bVar = this.f59566a;
            Bundle arguments = this.f59566a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("next_page", C21850i.CHANGE_PASSWORD.getValue());
            arguments.putString("platform", "phone");
            C52711k.m112236a((Object) arguments, "arguments!!.apply {\n    …NE)\n                    }");
            bVar.mo45961a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.n.b$b */
    static final class C22063b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C22061b f59567a;

        C22063b(C22061b bVar) {
            this.f59567a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C21839d.m54511c(this.f59567a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.n.b$c */
    static final class C22064c implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C22061b f59568a;

        C22064c(C22061b bVar) {
            this.f59568a = bVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f59568a.mo46025v();
        }
    }

    /* renamed from: x */
    private String m54811x() {
        return (String) this.f59564e.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59565j == null) {
            this.f59565j = new HashMap();
        }
        View view = (View) this.f59565j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59565j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59565j != null) {
            this.f59565j.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: h */
    public final void mo44871h() {
        m54810c("resend").mo6491b();
    }

    public final C21919k ab_() {
        C21919k kVar = new C21919k();
        kVar.mo46020a(m54811x());
        kVar.f59299b = true;
        kVar.f59300c = Boolean.valueOf(false);
        kVar.f59301d = false;
        return kVar;
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f59182d = getString(R.string.agb);
        aVar.f59183e = getString(R.string.hgg, m54811x());
        aVar.f59179a = " ";
        aVar.f59186h = false;
        return aVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m54810c("user_click").mo6491b();
    }

    /* renamed from: a_ */
    public final void mo44868a_(String str) {
        C52711k.m112240b(str, "codes");
        C21677s.m54404a(this, str, 13).mo6496c((C1710e<? super T>) new C22062a<Object>(this)).mo6491b();
    }

    /* renamed from: c */
    private C2193n<C12993e<C13120s>> m54810c(String str) {
        C52711k.m112240b(str, "sendMethod");
        C2193n<C12993e<C13120s>> a = C21677s.f58713a.mo45942a(this, m54811x(), mo45970p(), mo45965k(), "", str, null).mo6485a((C1706a) new C22064c(this));
        C52711k.m112236a((Object) a, "NetworkHelper.sendSmsCod…   onCodeSent()\n        }");
        return a;
    }
}
