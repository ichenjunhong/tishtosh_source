package p2628d.p2629a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: d.a.s */
public class C52583s extends C52582r {
    /* renamed from: a */
    public static final <T> boolean m112110a(List<T> list, C52671b<? super T, Boolean> bVar) {
        C52711k.m112240b(list, "$this$removeAll");
        C52711k.m112240b(bVar, "predicate");
        return m112111a(list, bVar, true);
    }

    /* renamed from: a */
    public static final <T> boolean m112109a(Collection<? super T> collection, T[] tArr) {
        C52711k.m112240b(collection, "$this$addAll");
        C52711k.m112240b(tArr, "elements");
        return collection.addAll(C52568f.m112068a(tArr));
    }

    /* renamed from: a */
    public static final <T> boolean m112108a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C52711k.m112240b(collection, "$this$addAll");
        C52711k.m112240b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static final <T> boolean m112112b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        Collection collection2;
        boolean z;
        C52711k.m112240b(collection, "$this$removeAll");
        C52711k.m112240b(iterable, "elements");
        Iterable iterable2 = collection;
        C52711k.m112240b(iterable, "$this$convertToSetForSetOperationWith");
        C52711k.m112240b(iterable2, "source");
        if (iterable instanceof Set) {
            collection2 = (Collection) iterable;
        } else if (!(iterable instanceof Collection)) {
            collection2 = C52575l.m112135d(iterable);
        } else if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() >= 2) {
            Collection collection3 = (Collection) iterable;
            if (collection3.size() <= 2 || !(collection3 instanceof ArrayList)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                collection2 = C52575l.m112135d(iterable);
            } else {
                collection2 = collection3;
            }
        } else {
            collection2 = (Collection) iterable;
        }
        return C52731z.m112266b(collection).removeAll(collection2);
    }

    /* renamed from: a */
    public static final <T> boolean m112107a(Iterable<? extends T> iterable, C52671b<? super T, Boolean> bVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) bVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: a */
    private static final <T> boolean m112111a(List<T> list, C52671b<? super T, Boolean> bVar, boolean z) {
        int i;
        if (list instanceof RandomAccess) {
            int a = C52575l.m112093a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    Object obj = list.get(i2);
                    if (!((Boolean) bVar.invoke(obj)).booleanValue()) {
                        if (i != i2) {
                            list.set(i, obj);
                        }
                        i++;
                    }
                    if (i2 == a) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int a2 = C52575l.m112093a(list);
            if (a2 >= i) {
                while (true) {
                    list.remove(a2);
                    if (a2 == i) {
                        break;
                    }
                    a2--;
                }
            }
            return true;
        } else if (list != null) {
            return m112107a(C52731z.m112261a((Object) list), bVar, true);
        } else {
            throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
