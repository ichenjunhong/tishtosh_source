package p2628d.p2649l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.p2642a.C52695a;
import p2628d.p2650m.C52830p;

/* renamed from: d.l.m */
public class C52794m extends C52793l {

    /* renamed from: d.l.m$a */
    public static final class C52795a implements C52695a, Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ C52785g f131029a;

        public final Iterator<T> iterator() {
            return this.f131029a.mo110157a();
        }

        public C52795a(C52785g gVar) {
            this.f131029a = gVar;
        }
    }

    /* renamed from: d.l.m$b */
    static final class C52796b extends C52712l implements C52671b<T, Boolean> {

        /* renamed from: a */
        public static final C52796b f131030a = new C52796b();

        C52796b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: d.l.m$c */
    static final class C52797c extends C52712l implements C52671b<C52785g<? extends R>, Iterator<? extends R>> {

        /* renamed from: a */
        public static final C52797c f131031a = new C52797c();

        C52797c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52785g gVar = (C52785g) obj;
            C52711k.m112240b(gVar, "it");
            return gVar.mo110157a();
        }
    }

    /* renamed from: d.l.m$d */
    public static final class C52798d implements C52785g<T> {

        /* renamed from: a */
        final /* synthetic */ C52785g f131032a;

        /* renamed from: b */
        final /* synthetic */ Comparator f131033b;

        /* renamed from: a */
        public final Iterator<T> mo110157a() {
            List h = C52786h.m112354h(this.f131032a);
            C52575l.m112105a(h, this.f131033b);
            return h.iterator();
        }

        public C52798d(C52785g<? extends T> gVar, Comparator comparator) {
            this.f131032a = gVar;
            this.f131033b = comparator;
        }
    }

    /* renamed from: e */
    public static final <T> C52785g<T> m112350e(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$filterNotNull");
        return C52786h.m112345b(gVar, C52796b.f131030a);
    }

    /* renamed from: g */
    public static final <T> List<T> m112353g(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$toList");
        return C52575l.m112098b(C52786h.m112354h(gVar));
    }

    /* renamed from: i */
    public static final <T> boolean m112355i(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$any");
        return gVar.mo110157a().hasNext();
    }

    /* renamed from: j */
    public static final <T> Iterable<T> m112356j(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$asIterable");
        return new C52795a<>(gVar);
    }

    /* renamed from: f */
    public static final <T> HashSet<T> m112352f(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$toHashSet");
        return (HashSet) C52786h.m112344a(gVar, (C) new HashSet());
    }

    /* renamed from: h */
    public static final <T> List<T> m112354h(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$toMutableList");
        return (List) C52786h.m112344a(gVar, (C) new ArrayList());
    }

    /* renamed from: c */
    public static final <T> T m112347c(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$first");
        Iterator a = gVar.mo110157a();
        if (a.hasNext()) {
            return a.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: d */
    public static final <T> T m112349d(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "$this$firstOrNull");
        Iterator a = gVar.mo110157a();
        if (!a.hasNext()) {
            return null;
        }
        return a.next();
    }

    /* renamed from: a */
    public static final <T> C52785g<T> m112340a(C52785g<? extends T> gVar, C52671b<? super T, Boolean> bVar) {
        C52711k.m112240b(gVar, "$this$filter");
        C52711k.m112240b(bVar, "predicate");
        return new C52779d<>(gVar, true, bVar);
    }

    /* renamed from: b */
    public static final <T> C52785g<T> m112345b(C52785g<? extends T> gVar, C52671b<? super T, Boolean> bVar) {
        C52711k.m112240b(gVar, "$this$filterNot");
        C52711k.m112240b(bVar, "predicate");
        return new C52779d<>(gVar, false, bVar);
    }

    /* renamed from: c */
    public static final <T, R> C52785g<R> m112346c(C52785g<? extends T> gVar, C52671b<? super T, ? extends C52785g<? extends R>> bVar) {
        C52711k.m112240b(gVar, "$this$flatMap");
        C52711k.m112240b(bVar, "transform");
        return new C52781e<>(gVar, bVar, C52797c.f131031a);
    }

    /* renamed from: d */
    public static final <T, R> C52785g<R> m112348d(C52785g<? extends T> gVar, C52671b<? super T, ? extends R> bVar) {
        C52711k.m112240b(gVar, "$this$map");
        C52711k.m112240b(bVar, "transform");
        return new C52801o<>(gVar, bVar);
    }

    /* renamed from: e */
    public static final <T, R> C52785g<R> m112351e(C52785g<? extends T> gVar, C52671b<? super T, ? extends R> bVar) {
        C52711k.m112240b(gVar, "$this$mapNotNull");
        C52711k.m112240b(bVar, "transform");
        return C52786h.m112350e(new C52801o(gVar, bVar));
    }

    /* renamed from: a */
    public static final <T> C52785g<T> m112341a(C52785g<? extends T> gVar, T t) {
        C52711k.m112240b(gVar, "$this$plus");
        return C52786h.m112335a(C52786h.m112337a((T[]) new C52785g[]{gVar, C52786h.m112337a((T[]) new Object[]{t})}));
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m112344a(C52785g<? extends T> gVar, C c) {
        C52711k.m112240b(gVar, "$this$toCollection");
        C52711k.m112240b(c, "destination");
        Iterator a = gVar.mo110157a();
        while (a.hasNext()) {
            c.add(a.next());
        }
        return c;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m112342a(C52785g<? extends T> gVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b<? super T, ? extends CharSequence> bVar) {
        C52711k.m112240b(gVar, "$this$joinTo");
        C52711k.m112240b(a, "buffer");
        C52711k.m112240b(charSequence, "separator");
        C52711k.m112240b(charSequence2, "prefix");
        C52711k.m112240b(charSequence3, "postfix");
        C52711k.m112240b(charSequence4, "truncated");
        a.append(charSequence2);
        Iterator a2 = gVar.mo110157a();
        int i2 = 0;
        while (a2.hasNext()) {
            Object next = a2.next();
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C52830p.m112390a(a, next, bVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m112343a(C52785g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b bVar, int i2, Object obj) {
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = "...";
        C52785g gVar2 = gVar;
        C52711k.m112240b(gVar, "$this$joinToString");
        CharSequence charSequence8 = charSequence;
        C52711k.m112240b(charSequence, "separator");
        C52711k.m112240b(charSequence5, "prefix");
        C52711k.m112240b(charSequence6, "postfix");
        C52711k.m112240b(charSequence7, "truncated");
        String sb = ((StringBuilder) C52786h.m112342a(gVar2, new StringBuilder(), charSequence8, charSequence5, charSequence6, -1, charSequence7, null)).toString();
        C52711k.m112236a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}
