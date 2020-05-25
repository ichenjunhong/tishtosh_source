package p2628d.p2631c.p2632a;

import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52634f;
import p2628d.p2631c.p2633b.p2634a.C52613a;
import p2628d.p2631c.p2633b.p2634a.C52616d;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2631c.p2633b.p2634a.C52623j;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: d.c.a.c */
public class C52602c {

    /* renamed from: d.c.a.c$a */
    public static final class C52603a extends C52623j {

        /* renamed from: a */
        final /* synthetic */ C52625c f130885a;

        /* renamed from: b */
        final /* synthetic */ C52671b f130886b;

        /* renamed from: c */
        private int f130887c;

        public final Object invokeSuspend(Object obj) {
            switch (this.f130887c) {
                case 0:
                    this.f130887c = 1;
                    C52625c cVar = this;
                    C52671b bVar = this.f130886b;
                    if (bVar != null) {
                        return ((C52671b) C52731z.m112265b(bVar, 1)).invoke(cVar);
                    }
                    throw new C52857u("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.f130887c = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        public C52603a(C52625c cVar, C52625c cVar2, C52671b bVar) {
            this.f130885a = cVar;
            this.f130886b = bVar;
            super(cVar2);
        }
    }

    /* renamed from: d.c.a.c$b */
    public static final class C52604b extends C52616d {

        /* renamed from: a */
        final /* synthetic */ C52625c f130888a;

        /* renamed from: b */
        final /* synthetic */ C52628e f130889b;

        /* renamed from: c */
        final /* synthetic */ C52671b f130890c;

        /* renamed from: d */
        private int f130891d;

        public final Object invokeSuspend(Object obj) {
            switch (this.f130891d) {
                case 0:
                    this.f130891d = 1;
                    C52625c cVar = this;
                    C52671b bVar = this.f130890c;
                    if (bVar != null) {
                        return ((C52671b) C52731z.m112265b(bVar, 1)).invoke(cVar);
                    }
                    throw new C52857u("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.f130891d = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        public C52604b(C52625c cVar, C52628e eVar, C52625c cVar2, C52628e eVar2, C52671b bVar) {
            this.f130888a = cVar;
            this.f130889b = eVar;
            this.f130890c = bVar;
            super(cVar2, eVar2);
        }
    }

    /* renamed from: d.c.a.c$c */
    public static final class C52605c extends C52623j {

        /* renamed from: a */
        final /* synthetic */ C52625c f130892a;

        /* renamed from: b */
        final /* synthetic */ C52682m f130893b;

        /* renamed from: c */
        final /* synthetic */ Object f130894c;

        /* renamed from: d */
        private int f130895d;

        public final Object invokeSuspend(Object obj) {
            switch (this.f130895d) {
                case 0:
                    this.f130895d = 1;
                    C52625c cVar = this;
                    C52682m mVar = this.f130893b;
                    if (mVar != null) {
                        return ((C52682m) C52731z.m112265b(mVar, 2)).invoke(this.f130894c, cVar);
                    }
                    throw new C52857u("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.f130895d = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        public C52605c(C52625c cVar, C52625c cVar2, C52682m mVar, Object obj) {
            this.f130892a = cVar;
            this.f130893b = mVar;
            this.f130894c = obj;
            super(cVar2);
        }
    }

    /* renamed from: d.c.a.c$d */
    public static final class C52606d extends C52616d {

        /* renamed from: a */
        final /* synthetic */ C52625c f130896a;

        /* renamed from: b */
        final /* synthetic */ C52628e f130897b;

        /* renamed from: c */
        final /* synthetic */ C52682m f130898c;

        /* renamed from: d */
        final /* synthetic */ Object f130899d;

        /* renamed from: e */
        private int f130900e;

        public final Object invokeSuspend(Object obj) {
            switch (this.f130900e) {
                case 0:
                    this.f130900e = 1;
                    C52625c cVar = this;
                    C52682m mVar = this.f130898c;
                    if (mVar != null) {
                        return ((C52682m) C52731z.m112265b(mVar, 2)).invoke(this.f130899d, cVar);
                    }
                    throw new C52857u("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.f130900e = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        public C52606d(C52625c cVar, C52628e eVar, C52625c cVar2, C52628e eVar2, C52682m mVar, Object obj) {
            this.f130896a = cVar;
            this.f130897b = eVar;
            this.f130898c = mVar;
            this.f130899d = obj;
            super(cVar2, eVar2);
        }
    }

    /* renamed from: a */
    public static final <T> C52625c<T> m112154a(C52625c<? super T> cVar) {
        C52625c<? super T> cVar2;
        C52711k.m112240b(cVar, "$this$intercepted");
        if (!(cVar instanceof C52616d)) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        C52616d dVar = (C52616d) cVar2;
        if (dVar == null) {
            return cVar;
        }
        C52625c intercepted = dVar.intercepted();
        if (intercepted == null) {
            return cVar;
        }
        return intercepted;
    }

    /* renamed from: a */
    public static final <T> C52625c<C52860x> m112155a(C52671b<? super C52625c<? super T>, ? extends Object> bVar, C52625c<? super T> cVar) {
        C52711k.m112240b(bVar, "$this$createCoroutineUnintercepted");
        C52711k.m112240b(cVar, "completion");
        C52625c a = C52620h.m112170a(cVar);
        if (bVar instanceof C52613a) {
            return ((C52613a) bVar).create(a);
        }
        C52628e context = a.getContext();
        if (context == C52634f.INSTANCE) {
            if (a != null) {
                return new C52603a<>(a, a, bVar);
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (a != null) {
            C52604b bVar2 = new C52604b(a, context, a, context, bVar);
            return bVar2;
        } else {
            throw new C52857u("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    /* renamed from: a */
    public static final <R, T> C52625c<C52860x> m112156a(C52682m<? super R, ? super C52625c<? super T>, ? extends Object> mVar, R r, C52625c<? super T> cVar) {
        C52711k.m112240b(mVar, "$this$createCoroutineUnintercepted");
        C52711k.m112240b(cVar, "completion");
        C52625c a = C52620h.m112170a(cVar);
        if (mVar instanceof C52613a) {
            return ((C52613a) mVar).create(r, a);
        }
        C52628e context = a.getContext();
        if (context == C52634f.INSTANCE) {
            if (a != null) {
                return new C52605c<>(a, a, mVar, r);
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (a != null) {
            C52606d dVar = new C52606d(a, context, a, context, mVar, r);
            return dVar;
        } else {
            throw new C52857u("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }
}
