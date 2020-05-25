package p2628d.p2629a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52751c;

/* renamed from: d.a.n */
public class C52577n extends C52576m {
    /* renamed from: a */
    public static final <T> List<T> m112097a() {
        return C52590x.INSTANCE;
    }

    /* renamed from: b */
    public static final void m112100b() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: c */
    public static final void m112102c() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: a */
    public static final <T> int m112093a(List<? extends T> list) {
        C52711k.m112240b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: a */
    public static final C52751c m112095a(Collection<?> collection) {
        C52711k.m112240b(collection, "$this$indices");
        return new C52751c(0, collection.size() - 1);
    }

    /* renamed from: b */
    public static final <T> List<T> m112099b(T... tArr) {
        C52711k.m112240b(tArr, "elements");
        if (tArr.length > 0) {
            return C52568f.m112068a(tArr);
        }
        return C52575l.m112097a();
    }

    /* renamed from: c */
    public static final <T> List<T> m112101c(T... tArr) {
        C52711k.m112240b(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C52567e(tArr, true));
    }

    /* renamed from: d */
    public static final <T> ArrayList<T> m112103d(T... tArr) {
        C52711k.m112240b(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C52567e(tArr, true));
    }

    /* renamed from: a */
    public static final <T> Collection<T> m112096a(T[] tArr) {
        C52711k.m112240b(tArr, "$this$asCollection");
        return new C52567e<>(tArr, false);
    }

    /* renamed from: b */
    public static final <T> List<T> m112098b(List<? extends T> list) {
        C52711k.m112240b(list, "$this$optimizeReadOnlyList");
        switch (list.size()) {
            case 0:
                return C52575l.m112097a();
            case 1:
                return C52575l.m112092a(list.get(0));
            default:
                return list;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m112094a(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        int size = list.size();
        C52711k.m112240b(list, "$this$binarySearch");
        int size2 = list.size();
        int i4 = 0;
        if (size < 0) {
            StringBuilder sb = new StringBuilder("fromIndex (");
            sb.append(0);
            sb.append(") is greater than toIndex (");
            sb.append(size);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        } else if (size <= size2) {
            int i5 = size - 1;
            while (i4 <= i5) {
                int i6 = (i4 + i5) >>> 1;
                int a = C52594a.m112153a((Comparable) list.get(i6), comparable);
                if (a < 0) {
                    i4 = i6 + 1;
                } else if (a <= 0) {
                    return i6;
                } else {
                    i5 = i6 - 1;
                }
            }
            return -(i4 + 1);
        } else {
            StringBuilder sb2 = new StringBuilder("toIndex (");
            sb2.append(size);
            sb2.append(") is greater than size (");
            sb2.append(size2);
            sb2.append(").");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }
}
