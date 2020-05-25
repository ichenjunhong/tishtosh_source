package com.p683ss.android.ugc.aweme.app.p1363a.p1364a;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.a.a.a */
public final class C22884a {

    /* renamed from: a */
    public static List<C22254a> f61214a = new ArrayList();

    /* renamed from: b */
    public static final CopyOnWriteArrayList<C22887c> f61215b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public static final C22885a f61216c = new C22885a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.a.a.a$a */
    public static final class C22885a {
        private C22885a() {
        }

        /* renamed from: a */
        public static void m56354a() {
            Iterator it = C22884a.f61215b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }

        /* renamed from: b */
        private static void m56356b() {
            for (C22887c a : C22884a.f61215b) {
                a.mo47682a();
            }
        }

        public /* synthetic */ C22885a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m56355a(C22887c cVar) {
            C52711k.m112240b(cVar, "listener");
            C22884a.f61215b.add(cVar);
        }

        /* renamed from: b */
        public static void m56357b(C22887c cVar) {
            C52711k.m112240b(cVar, "listener");
            C22884a.f61215b.remove(cVar);
        }

        /* renamed from: a */
        public final void mo47681a(Bundle bundle) {
            if (!C22884a.f61214a.isEmpty()) {
                ((C22254a) C22884a.f61214a.remove(0)).mo44959a(bundle);
            } else {
                m56356b();
            }
        }
    }

    /* renamed from: a */
    public static final void m56353a(Bundle bundle) {
        f61216c.mo47681a(bundle);
    }
}
