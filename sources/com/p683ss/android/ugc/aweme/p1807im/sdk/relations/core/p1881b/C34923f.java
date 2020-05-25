package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f */
public abstract class C34923f<T, R> extends C34922e<R> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f89917g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34923f.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: r */
    public static final C34925b f89918r = new C34925b(null);

    /* renamed from: a */
    private final C52668f f89919a = C52732g.m112285a(C34926c.f89929a);

    /* renamed from: i */
    public C52671b<? super T, Boolean> f89920i;

    /* renamed from: j */
    public C52671b<? super List<? extends T>, ? extends List<? extends T>> f89921j;

    /* renamed from: k */
    public C52671b<? super R, Boolean> f89922k;

    /* renamed from: l */
    public C52671b<? super List<? extends R>, ? extends List<? extends R>> f89923l;

    /* renamed from: m */
    public C1675ac f89924m;

    /* renamed from: n */
    public C1675ac f89925n;

    /* renamed from: o */
    public int f89926o = -1;

    /* renamed from: p */
    volatile boolean f89927p = true;

    /* renamed from: q */
    public volatile boolean f89928q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$a */
    public static abstract class C34924a<LOADER extends C34923f<T, R>, T, R> {
        /* renamed from: a */
        public abstract LOADER mo73022a();

        /* renamed from: b */
        public abstract LOADER mo73023b();

        /* renamed from: a */
        public final C34924a<LOADER, T, R> mo73042a(int i) {
            C34924a<LOADER, T, R> aVar = this;
            aVar.mo73022a().f89926o = i;
            return aVar;
        }

        /* renamed from: b */
        public final C34924a<LOADER, T, R> mo73044b(C52671b<? super List<? extends T>, ? extends List<? extends T>> bVar) {
            C52711k.m112240b(bVar, "collator");
            C34924a<LOADER, T, R> aVar = this;
            aVar.mo73022a().f89921j = bVar;
            return aVar;
        }

        /* renamed from: c */
        public final C34924a<LOADER, T, R> mo73045c(C52671b<? super R, Boolean> bVar) {
            C52711k.m112240b(bVar, "filter");
            C34924a<LOADER, T, R> aVar = this;
            aVar.mo73022a().f89922k = bVar;
            return aVar;
        }

        /* renamed from: a */
        public final C34924a<LOADER, T, R> mo73043a(C52671b<? super T, Boolean> bVar) {
            C52711k.m112240b(bVar, "filter");
            C34924a<LOADER, T, R> aVar = this;
            aVar.mo73022a().f89920i = bVar;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$b */
    public static final class C34925b {
        private C34925b() {
        }

        public /* synthetic */ C34925b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$c */
    static final class C34926c extends C52712l implements C52670a<C1689b> {

        /* renamed from: a */
        public static final C34926c f89929a = new C34926c();

        C34926c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C1689b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$d */
    static final /* synthetic */ class C34927d extends C52710j implements C52670a<List<T>> {
        C34927d(C34923f fVar) {
            super(0, fVar);
        }

        public final String getName() {
            return "loadInternal";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34923f.class);
        }

        public final String getSignature() {
            return "loadInternal()Ljava/util/List;";
        }

        public final /* synthetic */ Object invoke() {
            return ((C34923f) this.receiver).mo73018c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$e */
    static final /* synthetic */ class C34928e extends C52710j implements C52670a<List<T>> {
        C34928e(C34923f fVar) {
            super(0, fVar);
        }

        public final String getName() {
            return "loadMoreInternal";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34923f.class);
        }

        public final String getSignature() {
            return "loadMoreInternal()Ljava/util/List;";
        }

        public final /* synthetic */ Object invoke() {
            return ((C34923f) this.receiver).bo_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$f */
    static final class C34929f<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C52670a f89930a;

        C34929f(C52670a aVar) {
            this.f89930a = aVar;
        }

        public final void subscribe(C2204x<List<T>> xVar) {
            C52711k.m112240b(xVar, "it");
            try {
                xVar.mo6282a(this.f89930a.invoke());
            } catch (Throwable th) {
                xVar.mo6274a(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$g */
    static final class C34930g<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C34923f f89931a;

        C34930g(C34923f fVar) {
            this.f89931a = fVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            return this.f89931a.mo73038a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$h */
    static final class C34931h<T> implements C1710e<List<R>> {

        /* renamed from: a */
        final /* synthetic */ C34923f f89932a;

        /* renamed from: b */
        final /* synthetic */ boolean f89933b;

        C34931h(C34923f fVar, boolean z) {
            this.f89932a = fVar;
            this.f89933b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            this.f89932a.f89928q = false;
            C34923f fVar = this.f89932a;
            C52711k.m112236a((Object) list, "it");
            fVar.mo73037a(list, this.f89933b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.f$i */
    static final class C34932i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C34923f f89934a;

        /* renamed from: b */
        final /* synthetic */ boolean f89935b;

        C34932i(C34923f fVar, boolean z) {
            this.f89934a = fVar;
            this.f89935b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f89934a.f89928q = false;
            C34923f fVar = this.f89934a;
            C52711k.m112236a((Object) th, "it");
            fVar.mo73036a(th, this.f89935b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C52671b<T, R> mo73015a();

    /* access modifiers changed from: protected */
    public abstract List<T> bo_();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<T> mo73018c();

    /* renamed from: d */
    public final boolean mo73027d() {
        return this.f89928q;
    }

    /* renamed from: e */
    public final boolean mo73028e() {
        return this.f89927p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C1689b mo73039f() {
        return (C1689b) this.f89919a.getValue();
    }

    /* renamed from: g */
    public final List<R> mo73040g() {
        return mo73038a(mo73018c());
    }

    /* renamed from: h */
    public final List<R> mo73041h() {
        return mo73038a(bo_());
    }

    /* renamed from: b */
    public boolean mo73016b() {
        if (!this.f89928q) {
            C34923f fVar = this;
            if (!(fVar.f89924m == null || fVar.f89925n == null || !super.mo73016b())) {
                return true;
            }
        }
        return false;
    }

    public final void bp_() {
        C34923f fVar;
        if (mo73016b()) {
            fVar = this;
        } else {
            fVar = null;
        }
        C34923f fVar2 = fVar;
        if (fVar2 != null) {
            fVar2.m79048a(false, (C52670a<? extends List<T>>) new C34927d<Object>(this));
        }
    }

    public final void bq_() {
        C34923f fVar;
        if (mo73016b()) {
            fVar = this;
        } else {
            fVar = null;
        }
        C34923f fVar2 = fVar;
        if (fVar2 != null) {
            fVar2.m79048a(true, (C52670a<? extends List<T>>) new C34928e<Object>(this));
        }
    }

    /* renamed from: a */
    public final List<R> mo73038a(List<T> list) {
        boolean z;
        if (this.f89926o <= 0 || list.size() < this.f89926o) {
            z = false;
        } else {
            z = true;
        }
        this.f89927p = z;
        return C52575l.m112139e((Collection<? extends T>) m79049b(m79047a(m79050c(m79049b(m79047a(list, this.f89920i), this.f89921j), mo73015a()), this.f89922k), this.f89923l));
    }

    /* renamed from: b */
    private static <D> List<D> m79049b(List<? extends D> list, C52671b<? super List<? extends D>, ? extends List<? extends D>> bVar) {
        if (bVar == null) {
            return list;
        }
        List list2 = (List) bVar.invoke(list);
        if (list2 == null) {
            return list;
        }
        return list2;
    }

    /* renamed from: a */
    private static <D> List<D> m79047a(List<? extends D> list, C52671b<? super D, Boolean> bVar) {
        if (bVar == null) {
            return list;
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) bVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    private static <D, F> List<F> m79050c(List<? extends D> list, C52671b<? super D, ? extends F> bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object invoke : list) {
            Object invoke2 = bVar.invoke(invoke);
            if (invoke2 != null) {
                arrayList.add(invoke2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m79048a(boolean z, C52670a<? extends List<T>> aVar) {
        this.f89928q = true;
        C2201v a = C2201v.m6601a((C2205y<T>) new C34929f<T>(aVar));
        C1675ac acVar = this.f89924m;
        if (acVar == null) {
            C52711k.m112237a("subscribeScheduler");
        }
        C2201v d = a.mo6529b(acVar).mo6541d((C1711f<? super T, ? extends R>) new C34930g<Object,Object>(this));
        C1675ac acVar2 = this.f89925n;
        if (acVar2 == null) {
            C52711k.m112237a("observeScheduler");
        }
        C1690c a2 = d.mo6514a(acVar2).mo6505a((C1710e<? super T>) new C34931h<Object>(this, z), (C1710e<? super Throwable>) new C34932i<Object>(this, z));
        mo73039f().mo6180a();
        mo73039f().mo6181a(a2);
    }
}
