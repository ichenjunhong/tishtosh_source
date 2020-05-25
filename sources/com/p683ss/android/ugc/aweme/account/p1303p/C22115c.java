package com.p683ss.android.ugc.aweme.account.p1303p;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.C2240a;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21919k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21920l;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p064c.p065a.C2193n;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
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

/* renamed from: com.ss.android.ugc.aweme.account.p.c */
public final class C22115c extends C21920l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59642a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22115c.class), "phone", "getPhone()Ljava/lang/String;"))};

    /* renamed from: e */
    public static final C22116a f59643e = new C22116a(null);

    /* renamed from: j */
    private final C52668f f59644j = C52732g.m112285a(new C22118c(this));

    /* renamed from: k */
    private HashMap f59645k;

    /* renamed from: com.ss.android.ugc.aweme.account.p.c$a */
    public static final class C22116a {
        private C22116a() {
        }

        public /* synthetic */ C22116a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C2193n<C12993e<C13120s>> m54925a(C21829b bVar, String str, String str2) {
            C52711k.m112240b(bVar, "fragment");
            C52711k.m112240b(str, "phone");
            C52711k.m112240b(str2, "sendMethod");
            return C21677s.f58713a.mo45942a(bVar, str, bVar.mo45970p(), bVar.mo45965k(), "", str2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.c$b */
    static final class C22117b<T> implements C1710e<C12996h> {

        /* renamed from: a */
        final /* synthetic */ C22115c f59646a;

        C22117b(C22115c cVar) {
            this.f59646a = cVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12996h hVar = (C12996h) obj;
            C21839d dVar = C21839d.f59130a;
            Fragment fragment = this.f59646a;
            C52711k.m112236a((Object) hVar, "it");
            String str = hVar.f34021h;
            C52711k.m112236a((Object) str, "it.ticket");
            dVar.mo45974b(fragment, str);
            C22115c cVar = this.f59646a;
            Bundle arguments = this.f59646a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) arguments, "arguments!!");
            cVar.mo45961a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.c$c */
    static final class C22118c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C22115c f59647a;

        C22118c(C22115c cVar) {
            this.f59647a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C21839d.m54511c(this.f59647a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.c$d */
    static final class C22119d implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C22115c f59648a;

        C22119d(C22115c cVar) {
            this.f59648a = cVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f59648a.mo46025v();
        }
    }

    /* renamed from: x */
    private String m54919x() {
        return (String) this.f59644j.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59645k == null) {
            this.f59645k = new HashMap();
        }
        View view = (View) this.f59645k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59645k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59645k != null) {
            this.f59645k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final C21919k ab_() {
        C21919k kVar = new C21919k();
        kVar.f59299b = true;
        kVar.mo46020a(m54919x());
        kVar.f59301d = C21839d.m54513d(this);
        return kVar;
    }

    /* renamed from: h */
    public final void mo44871h() {
        C22116a.m54925a(this, m54919x(), "resend").mo6485a((C1706a) new C22119d(this)).mo6491b();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f59182d = getString(R.string.agb);
        Locale locale = Locale.US;
        C52711k.m112236a((Object) locale, "Locale.US");
        String string = getString(R.string.afo);
        C52711k.m112236a((Object) string, "getString(R.string.commo…istration_phone_sms_text)");
        String a = C2240a.m6773a(locale, string, Arrays.copyOf(new Object[]{m54919x()}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
        aVar.f59183e = a;
        aVar.f59179a = " ";
        aVar.f59186h = false;
        return aVar;
    }

    /* renamed from: a_ */
    public final void mo44868a_(String str) {
        C52711k.m112240b(str, "codes");
        C21677s.m54404a(this, str, 22).mo6496c((C1710e<? super T>) new C22117b<Object>(this)).mo6491b();
    }
}
