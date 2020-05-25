package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0678q;
import android.support.p030v4.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n */
public final class C22016n extends C0678q {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59490a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22016n.class), "tabFragmentsList", "getTabFragmentsList()Ljava/util/List;"))};

    /* renamed from: b */
    private final C52668f f59491b = C52732g.m112285a(C22018b.f59494a);

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$a */
    public static final class C22017a {

        /* renamed from: a */
        public final Fragment f59492a;

        /* renamed from: b */
        public final String f59493b;

        public C22017a(Fragment fragment, String str) {
            C52711k.m112240b(fragment, "fragment");
            C52711k.m112240b(str, "title");
            this.f59492a = fragment;
            this.f59493b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$b */
    static final class C22018b extends C52712l implements C52670a<List<C22017a>> {

        /* renamed from: a */
        public static final C22018b f59494a = new C22018b();

        C22018b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    private final List<C22017a> m54762a() {
        return (List) this.f59491b.getValue();
    }

    public final int getCount() {
        return m54762a().size();
    }

    public C22016n(C0654k kVar) {
        super(kVar);
    }

    public final Fragment getItem(int i) {
        return ((C22017a) m54762a().get(i)).f59492a;
    }

    public final CharSequence getPageTitle(int i) {
        return ((C22017a) m54762a().get(i)).f59493b;
    }

    /* renamed from: a */
    public final void mo46078a(C22017a aVar) {
        C52711k.m112240b(aVar, "fragment");
        if (!m54762a().contains(aVar)) {
            m54762a().add(aVar);
        }
    }
}
