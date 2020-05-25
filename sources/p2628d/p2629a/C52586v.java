package p2628d.p2629a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52785g;
import p2628d.p2650m.C52830p;

/* renamed from: d.a.v */
public class C52586v extends C52585u {

    /* renamed from: d.a.v$a */
    public static final class C52587a implements C52785g<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f130880a;

        /* renamed from: a */
        public final Iterator<T> mo110157a() {
            return this.f130880a.iterator();
        }

        public C52587a(Iterable iterable) {
            this.f130880a = iterable;
        }
    }

    /* renamed from: d.a.v$b */
    public static final class C52588b extends C52712l implements C52671b {

        /* renamed from: a */
        final /* synthetic */ int f130881a;

        public C52588b(int i) {
            this.f130881a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            StringBuilder sb = new StringBuilder("Collection doesn't contain element at index ");
            sb.append(this.f130881a);
            sb.append('.');
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: a */
    public static final <T> boolean m112125a(Iterable<? extends T> iterable, T t) {
        C52711k.m112240b(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return C52575l.m112126b(iterable, t) >= 0;
    }

    /* renamed from: a */
    public static final <T> List<T> m112122a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C52711k.m112240b(iterable, "$this$sortedWith");
        C52711k.m112240b(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C52575l.m112138e(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array == null) {
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                C52568f.m112069a((T[]) array, comparator);
                return C52568f.m112068a(array);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> f = C52575l.m112141f(iterable);
            C52575l.m112105a(f, comparator);
            return f;
        }
    }

    /* renamed from: a */
    public static final <T> Set<T> m112124a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C52711k.m112240b(iterable, "$this$subtract");
        C52711k.m112240b(iterable2, "other");
        Set<T> h = C52575l.m112145h(iterable);
        C52575l.m112112b(h, iterable2);
        return h;
    }

    /* renamed from: a */
    public static final <T> List<T> m112123a(Collection<? extends T> collection, T t) {
        C52711k.m112240b(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: e */
    public static final <T> List<T> m112139e(Collection<? extends T> collection) {
        C52711k.m112240b(collection, "$this$toMutableList");
        return new ArrayList<>(collection);
    }

    /* renamed from: g */
    public static final <T> List<T> m112143g(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$distinct");
        return C52575l.m112138e((Iterable<? extends T>) C52575l.m112145h(iterable));
    }

    /* renamed from: k */
    public static final <T> C52785g<T> m112148k(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$asSequence");
        return new C52587a<>(iterable);
    }

    /* renamed from: c */
    public static final <T> List<T> m112132c(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$reversed");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C52575l.m112138e(iterable);
        }
        List<T> f = C52575l.m112141f(iterable);
        C52575l.m112113d(f);
        return f;
    }

    /* renamed from: d */
    public static final <T> HashSet<T> m112135d(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$toHashSet");
        return (HashSet) C52575l.m112127b(iterable, (C) new HashSet(C52550ab.m112044a(C52575l.m112104a(iterable, 12))));
    }

    /* renamed from: e */
    public static final <T> T m112137e(List<? extends T> list) {
        C52711k.m112240b(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: f */
    public static final <T> T m112140f(List<? extends T> list) {
        C52711k.m112240b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: g */
    public static final <T> T m112142g(List<? extends T> list) {
        C52711k.m112240b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C52575l.m112093a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: h */
    public static final <T> T m112144h(List<? extends T> list) {
        C52711k.m112240b(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: l */
    public static final int m112149l(Iterable<Integer> iterable) {
        C52711k.m112240b(iterable, "$this$sum");
        int i = 0;
        for (Number intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    /* renamed from: m */
    public static final long m112150m(Iterable<Long> iterable) {
        C52711k.m112240b(iterable, "$this$sum");
        long j = 0;
        for (Number longValue : iterable) {
            j += longValue.longValue();
        }
        return j;
    }

    /* renamed from: a */
    public static final <T> T m112117a(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$first");
        if (iterable instanceof List) {
            return C52575l.m112137e((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: d */
    public static final long[] m112136d(Collection<Long> collection) {
        C52711k.m112240b(collection, "$this$toLongArray");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Number longValue : collection) {
            int i2 = i + 1;
            jArr[i] = longValue.longValue();
            i = i2;
        }
        return jArr;
    }

    /* renamed from: f */
    public static final <T> List<T> m112141f(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return C52575l.m112139e((Collection) iterable);
        }
        return (List) C52575l.m112127b(iterable, (C) new ArrayList());
    }

    /* renamed from: h */
    public static final <T> Set<T> m112145h(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        return (Set) C52575l.m112127b(iterable, (C) new LinkedHashSet());
    }

    /* renamed from: i */
    public static final <T extends Comparable<? super T>> T m112146i(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$max");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: j */
    public static final <T extends Comparable<? super T>> T m112147j(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$min");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: b */
    public static final <T> List<T> m112128b(Iterable<? extends T> iterable) {
        C52711k.m112240b(iterable, "$this$filterNotNull");
        return (List) C52575l.m112121a(iterable, (C) new ArrayList());
    }

    /* renamed from: c */
    public static final int[] m112134c(Collection<Integer> collection) {
        C52711k.m112240b(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Number intValue : collection) {
            int i2 = i + 1;
            iArr[i] = intValue.intValue();
            i = i2;
        }
        return iArr;
    }

    /* renamed from: e */
    public static final <T> List<T> m112138e(Iterable<? extends T> iterable) {
        Object obj;
        C52711k.m112240b(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C52575l.m112098b(C52575l.m112141f(iterable));
        }
        Collection collection = (Collection) iterable;
        switch (collection.size()) {
            case 0:
                return C52575l.m112097a();
            case 1:
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
                return C52575l.m112092a(obj);
            default:
                return C52575l.m112139e(collection);
        }
    }

    /* renamed from: b */
    public static final double[] m112131b(Collection<Double> collection) {
        C52711k.m112240b(collection, "$this$toDoubleArray");
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Number doubleValue : collection) {
            int i2 = i + 1;
            dArr[i] = doubleValue.doubleValue();
            i = i2;
        }
        return dArr;
    }

    /* renamed from: a */
    public static final <T> int m112114a(List<? extends T> list, T t) {
        C52711k.m112240b(list, "$this$indexOf");
        return list.indexOf(t);
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m112127b(Iterable<? extends T> iterable, C c) {
        C52711k.m112240b(iterable, "$this$toCollection");
        C52711k.m112240b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: b */
    public static final <T> int m112126b(Iterable<? extends T> iterable, T t) {
        C52711k.m112240b(iterable, "$this$indexOf");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C52575l.m112100b();
            }
            if (C52711k.m112239a((Object) t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> List<T> m112133c(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C52711k.m112240b(collection, "$this$plus");
        C52711k.m112240b(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C52575l.m112108a((Collection<? super T>) arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: a */
    public static final <T> T m112118a(List<? extends T> list, int i) {
        C52711k.m112240b(list, "$this$getOrNull");
        if (i < 0 || i > C52575l.m112093a(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: b */
    public static final <T> List<T> m112129b(Iterable<? extends T> iterable, int i) {
        boolean z;
        C52711k.m112240b(iterable, "$this$take");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C52575l.m112097a();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return C52575l.m112138e(iterable);
                }
                if (i == 1) {
                    return C52575l.m112092a(C52575l.m112117a(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C52575l.m112098b((List<? extends T>) arrayList);
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m112130b(List<? extends T> list, int i) {
        boolean z;
        C52711k.m112240b(list, "$this$takeLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C52575l.m112097a();
        } else {
            int size = list.size();
            if (i >= size) {
                return C52575l.m112138e((Iterable<? extends T>) list);
            }
            if (i == 1) {
                return C52575l.m112092a(C52575l.m112142g(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                Iterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m112121a(Iterable<? extends T> iterable, C c) {
        C52711k.m112240b(iterable, "$this$filterNotNullTo");
        C52711k.m112240b(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: a */
    public static final <T> String m112119a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b<? super T, ? extends CharSequence> bVar) {
        C52711k.m112240b(iterable, "$this$joinToString");
        C52711k.m112240b(charSequence, "separator");
        C52711k.m112240b(charSequence2, "prefix");
        C52711k.m112240b(charSequence3, "postfix");
        C52711k.m112240b(charSequence4, "truncated");
        String sb = ((StringBuilder) C52575l.m112115a(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, bVar)).toString();
        C52711k.m112236a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m112115a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b<? super T, ? extends CharSequence> bVar) {
        C52711k.m112240b(iterable, "$this$joinTo");
        C52711k.m112240b(a, "buffer");
        C52711k.m112240b(charSequence, "separator");
        C52711k.m112240b(charSequence2, "prefix");
        C52711k.m112240b(charSequence3, "postfix");
        C52711k.m112240b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
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
    public static /* synthetic */ String m112120a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b bVar, int i2, Object obj) {
        int i3;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        CharSequence charSequence6 = charSequence3;
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            bVar = null;
        }
        return C52575l.m112119a(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, bVar);
    }
}
