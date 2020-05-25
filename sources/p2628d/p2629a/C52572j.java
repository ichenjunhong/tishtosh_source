package p2628d.p2629a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52701b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;
import p2628d.p2650m.C52830p;

/* renamed from: d.a.j */
public class C52572j extends C52571i {

    /* renamed from: d.a.j$a */
    public static final class C52573a implements C52785g<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f130878a;

        /* renamed from: a */
        public final Iterator<T> mo110157a() {
            return C52701b.m112223a(this.f130878a);
        }

        public C52573a(Object[] objArr) {
            this.f130878a = objArr;
        }
    }

    /* renamed from: a */
    public static final int m112072a(int[] iArr) {
        C52711k.m112240b(iArr, "$this$lastIndex");
        return iArr.length - 1;
    }

    /* renamed from: d */
    public static final <T> int m112083d(T[] tArr) {
        C52711k.m112240b(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    /* renamed from: h */
    public static final <T> List<T> m112087h(T[] tArr) {
        C52711k.m112240b(tArr, "$this$distinct");
        return C52575l.m112138e((Iterable<? extends T>) C52568f.m112088i(tArr));
    }

    /* renamed from: b */
    public static final <T> T m112080b(T[] tArr) {
        boolean z;
        C52711k.m112240b(tArr, "$this$last");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[C52568f.m112083d(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: c */
    public static final <T> List<T> m112082c(T[] tArr) {
        C52711k.m112240b(tArr, "$this$filterNotNull");
        return (List) C52568f.m112076a(tArr, (C) new ArrayList());
    }

    /* renamed from: f */
    public static final <T> List<T> m112085f(T[] tArr) {
        C52711k.m112240b(tArr, "$this$toMutableList");
        return new ArrayList<>(C52575l.m112096a(tArr));
    }

    /* renamed from: i */
    public static final <T> Set<T> m112088i(T[] tArr) {
        C52711k.m112240b(tArr, "$this$toMutableSet");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C52550ab.m112044a(tArr.length));
        for (T add : tArr) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    /* renamed from: j */
    public static final <T> C52785g<T> m112089j(T[] tArr) {
        boolean z;
        C52711k.m112240b(tArr, "$this$asSequence");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C52786h.m112334a();
        }
        return new C52573a<>(tArr);
    }

    /* renamed from: a */
    public static final char m112071a(char[] cArr) {
        C52711k.m112240b(cArr, "$this$single");
        switch (cArr.length) {
            case 0:
                throw new NoSuchElementException("Array is empty.");
            case 1:
                return cArr[0];
            default:
                throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: e */
    public static final <T> List<T> m112084e(T[] tArr) {
        C52711k.m112240b(tArr, "$this$toList");
        switch (tArr.length) {
            case 0:
                return C52575l.m112097a();
            case 1:
                return C52575l.m112092a(tArr[0]);
            default:
                return C52568f.m112085f(tArr);
        }
    }

    /* renamed from: g */
    public static final <T> Set<T> m112086g(T[] tArr) {
        C52711k.m112240b(tArr, "$this$toSet");
        switch (tArr.length) {
            case 0:
                return C52555ag.m112062a();
            case 1:
                return C52555ag.m112061a(tArr[0]);
            default:
                return (Set) C52568f.m112081b(tArr, (C) new LinkedHashSet(C52550ab.m112044a(tArr.length)));
        }
    }

    /* renamed from: a */
    public static final int[] m112078a(Integer[] numArr) {
        C52711k.m112240b(numArr, "$this$toIntArray");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m112076a(T[] tArr, C c) {
        C52711k.m112240b(tArr, "$this$filterNotNullTo");
        C52711k.m112240b(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: b */
    public static final <T> int m112079b(T[] tArr, T t) {
        C52711k.m112240b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            int length2 = tArr.length;
            while (i < length2) {
                if (C52711k.m112239a((Object) t, (Object) tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m112081b(T[] tArr, C c) {
        C52711k.m112240b(tArr, "$this$toCollection");
        C52711k.m112240b(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: a */
    public static final <T> boolean m112077a(T[] tArr, T t) {
        C52711k.m112240b(tArr, "$this$contains");
        if (C52568f.m112079b(tArr, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final <T> String m112074a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b<? super T, ? extends CharSequence> bVar) {
        C52711k.m112240b(tArr, "$this$joinToString");
        C52711k.m112240b(charSequence, "separator");
        C52711k.m112240b(charSequence2, "prefix");
        C52711k.m112240b(charSequence3, "postfix");
        C52711k.m112240b(charSequence4, "truncated");
        String sb = ((StringBuilder) C52568f.m112073a(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, bVar)).toString();
        C52711k.m112236a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m112073a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b<? super T, ? extends CharSequence> bVar) {
        C52711k.m112240b(tArr, "$this$joinTo");
        C52711k.m112240b(a, "buffer");
        C52711k.m112240b(charSequence, "separator");
        C52711k.m112240b(charSequence2, "prefix");
        C52711k.m112240b(charSequence3, "postfix");
        C52711k.m112240b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C52830p.m112390a(a, t, bVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m112075a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C52671b bVar, int i2, Object obj) {
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
        return C52568f.m112074a(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, bVar);
    }
}
