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

/* renamed from: android.arch.lifecycle.g */
public final class C0174g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f432a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C0174g.class), "viewModels", "getViewModels()Ljava/util/HashMap;"))};

    /* renamed from: b */
    private final C52668f f433b = C52732g.m112285a(C0175a.f434a);

    /* renamed from: android.arch.lifecycle.g$a */
    static final class C0175a extends C52712l implements C52670a<HashMap<String, C0209x>> {

        /* renamed from: a */
        public static final C0175a f434a = new C0175a();

        C0175a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: a */
    public final HashMap<String, C0209x> mo320a() {
        return (HashMap) this.f433b.getValue();
    }

    /* renamed from: b */
    public final void mo322b() {
        Collection<C0209x> values = mo320a().values();
        C52711k.m112236a((Object) values, "viewModels.values");
        for (C0209x onCleared : values) {
            onCleared.onCleared();
        }
        mo320a().clear();
    }

    /* renamed from: a */
    public final void mo321a(String str, C0209x xVar) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(xVar, "viewModel");
        C0209x xVar2 = (C0209x) mo320a().put(str, xVar);
        if (xVar2 != null) {
            xVar2.onCleared();
        }
    }
}
