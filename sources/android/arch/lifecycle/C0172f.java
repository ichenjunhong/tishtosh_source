package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: android.arch.lifecycle.f */
public final class C0172f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f429a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C0172f.class), "viewModels", "getViewModels()Ljava/util/HashMap;"))};

    /* renamed from: b */
    private final C52668f f430b = C52732g.m112285a(C0173a.f431a);

    /* renamed from: android.arch.lifecycle.f$a */
    static final class C0173a extends C52712l implements C52670a<HashMap<String, C0209x>> {

        /* renamed from: a */
        public static final C0173a f431a = new C0173a();

        C0173a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: b */
    private final HashMap<String, C0209x> m380b() {
        return (HashMap) this.f430b.getValue();
    }

    /* renamed from: a */
    public final void mo318a() {
        Collection<C0209x> values = m380b().values();
        C52711k.m112236a((Object) values, "viewModels.values");
        for (C0209x onCleared : values) {
            onCleared.onCleared();
        }
        m380b().clear();
    }
}
