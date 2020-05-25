package com.p683ss.android.ugc.aweme.discover.p1659ui.search;

import com.p683ss.android.ugc.aweme.discover.C27939e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
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

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b */
public final class C28665b implements C27939e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f75233a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28665b.class), "LISTENERS", "getLISTENERS()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C28665b f75234b = new C28665b();

    /* renamed from: c */
    private static final C52668f f75235c = C52732g.m112285a(C28666a.f75236a);

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b$a */
    static final class C28666a extends C52712l implements C52670a<List<Object>> {

        /* renamed from: a */
        public static final C28666a f75236a = new C28666a();

        C28666a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    private C28665b() {
    }

    /* renamed from: b */
    private final List<Object> m67921b() {
        return (List) f75235c.getValue();
    }

    /* renamed from: a */
    public final boolean mo56348a() {
        if (!m67921b().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo56347a(Aweme aweme, String str, String str2) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "state");
        C52711k.m112240b(str2, "enterFrom");
        Iterator it = m67921b().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
