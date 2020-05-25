package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.g */
public final class C34933g<R> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89936a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34933g.class), "loaders", "getLoaders()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C34934a f89937b = new C34934a(null);

    /* renamed from: c */
    private final C52668f f89938c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.g$a */
    public static final class C34934a {
        private C34934a() {
        }

        /* renamed from: a */
        public static <R> C34933g<R> m79071a() {
            return new C34933g<>(null);
        }

        public /* synthetic */ C34934a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.g$b */
    static final class C34935b extends C52712l implements C52670a<List<C34923f<?, R>>> {

        /* renamed from: a */
        public static final C34935b f89939a = new C34935b();

        C34935b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: c */
    private final List<C34923f<?, R>> m79066c() {
        return (List) this.f89938c.getValue();
    }

    private C34933g() {
        this.f89938c = C52732g.m112285a(C34935b.f89939a);
    }

    /* renamed from: a */
    public final List<C34923f<?, R>> mo73048a() {
        return C52575l.m112139e((Collection<? extends T>) m79066c());
    }

    /* renamed from: b */
    public final void mo73049b() {
        for (C34923f fVar : m79066c()) {
            fVar.f89928q = false;
            fVar.mo73039f().mo6180a();
            fVar.f89927p = true;
        }
    }

    public /* synthetic */ C34933g(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final C34933g<R> mo73047a(C34923f<?, R> fVar) {
        C52711k.m112240b(fVar, "loader");
        C34933g<R> gVar = this;
        gVar.m79066c().add(fVar);
        return gVar;
    }

    /* renamed from: a */
    public final C34923f<?, R> mo73046a(boolean z) {
        for (C34923f<?, R> fVar : m79066c()) {
            if (fVar.mo73028e()) {
                return fVar;
            }
        }
        return null;
    }
}
