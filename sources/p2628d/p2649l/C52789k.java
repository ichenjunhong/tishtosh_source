package p2628d.p2649l;

import java.util.Iterator;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: d.l.k */
public class C52789k extends C52788j {

    /* renamed from: d.l.k$a */
    public static final class C52790a implements C52785g<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f131026a;

        /* renamed from: a */
        public final Iterator<T> mo110157a() {
            return this.f131026a;
        }

        public C52790a(Iterator it) {
            this.f131026a = it;
        }
    }

    /* renamed from: d.l.k$b */
    static final class C52791b extends C52712l implements C52671b<C52785g<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C52791b f131027a = new C52791b();

        C52791b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52785g gVar = (C52785g) obj;
            C52711k.m112240b(gVar, "it");
            return gVar.mo110157a();
        }
    }

    /* renamed from: d.l.k$c */
    static final class C52792c extends C52712l implements C52671b<T, T> {

        /* renamed from: a */
        public static final C52792c f131028a = new C52792c();

        C52792c() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: a */
    public static final <T> C52785g<T> m112334a() {
        return C52778c.f131007a;
    }

    /* renamed from: a */
    public static final <T> C52785g<T> m112336a(Iterator<? extends T> it) {
        C52711k.m112240b(it, "$this$asSequence");
        return C52786h.m112338b(new C52790a(it));
    }

    /* renamed from: b */
    public static final <T> C52785g<T> m112338b(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$constrainOnce");
        if (gVar instanceof C52776a) {
            return gVar;
        }
        return new C52776a<>(gVar);
    }

    /* renamed from: a */
    public static final <T> C52785g<T> m112335a(C52785g<? extends C52785g<? extends T>> gVar) {
        C52711k.m112240b(gVar, "$this$flatten");
        C52671b bVar = C52791b.f131027a;
        if (!(gVar instanceof C52801o)) {
            return new C52781e<>(gVar, C52792c.f131028a, bVar);
        }
        C52801o oVar = (C52801o) gVar;
        C52711k.m112240b(bVar, "iterator");
        return new C52781e<>(oVar.f131039a, oVar.f131040b, bVar);
    }

    /* renamed from: a */
    public static final <T> C52785g<T> m112337a(T... tArr) {
        boolean z;
        C52711k.m112240b(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C52786h.m112334a();
        }
        return C52568f.m112089j(tArr);
    }
}
