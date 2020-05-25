package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.b.c.ak */
public abstract class C17570ak<E> extends C17725z<E> implements Set<E> {

    /* renamed from: a */
    private transient C17530ab<E> f49245a;

    /* renamed from: com.google.b.c.ak$a */
    public static class C17571a<E> extends C17726a<E> {

        /* renamed from: d */
        Object[] f49246d;

        /* renamed from: e */
        private int f49247e;

        public C17571a() {
            super(4);
        }

        /* renamed from: a */
        public C17570ak<E> mo34100a() {
            C17650bg bgVar;
            Object[] objArr;
            switch (this.f49461b) {
                case 0:
                    return C17570ak.m43180of();
                case 1:
                    return C17570ak.m43181of(this.f49460a[0]);
                default:
                    if (this.f49246d == null || C17570ak.m43179b(this.f49461b) != this.f49246d.length) {
                        C17570ak construct = C17570ak.construct(this.f49461b, this.f49460a);
                        this.f49461b = construct.size();
                        bgVar = construct;
                    } else {
                        if (C17570ak.shouldTrim(this.f49461b, this.f49460a.length)) {
                            objArr = Arrays.copyOf(this.f49460a, this.f49461b);
                        } else {
                            objArr = this.f49460a;
                        }
                        C17650bg bgVar2 = new C17650bg(objArr, this.f49247e, this.f49246d, this.f49246d.length - 1, this.f49461b);
                        bgVar = bgVar2;
                    }
                    this.f49462c = true;
                    this.f49246d = null;
                    return bgVar;
            }
        }

        C17571a(int i) {
            super(i);
            this.f49246d = new Object[C17570ak.m43179b(i)];
        }

        /* renamed from: b */
        public C17571a<E> mo33971a(Iterable<? extends E> iterable) {
            C17421k.m42653a(iterable);
            if (this.f49246d != null) {
                for (Object c : iterable) {
                    mo33975b(c);
                }
            } else {
                super.mo33971a(iterable);
            }
            return this;
        }

        /* renamed from: b */
        public C17571a<E> mo33972a(Iterator<? extends E> it) {
            C17421k.m42653a(it);
            while (it.hasNext()) {
                mo33975b(it.next());
            }
            return this;
        }

        /* renamed from: b */
        public C17571a<E> mo33973a(E... eArr) {
            if (this.f49246d != null) {
                for (E c : eArr) {
                    mo33975b(c);
                }
            } else {
                super.mo33973a(eArr);
            }
            return this;
        }

        /* renamed from: c */
        public C17571a<E> mo33975b(E e) {
            C17421k.m42653a(e);
            if (this.f49246d == null || C17570ak.m43179b(this.f49461b) > this.f49246d.length) {
                this.f49246d = null;
                super.mo33975b(e);
                return this;
            }
            int length = this.f49246d.length - 1;
            int hashCode = e.hashCode();
            int a = C17724y.m43535a(hashCode);
            while (true) {
                int i = a & length;
                Object obj = this.f49246d[i];
                if (obj != null) {
                    if (obj.equals(e)) {
                        break;
                    }
                    a = i + 1;
                } else {
                    this.f49246d[i] = e;
                    this.f49247e += hashCode;
                    super.mo33975b(e);
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.google.b.c.ak$b */
    static abstract class C17572b<E> extends C17570ak<E> {
        C17572b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract E mo34031a(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final C17530ab<E> mo34098d() {
            return new C17530ab<E>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final boolean mo33977a() {
                    return C17572b.this.mo33977a();
                }

                public final int size() {
                    return C17572b.this.size();
                }

                public final E get(int i) {
                    return C17572b.this.mo34031a(i);
                }
            };
        }

        public C17666bt<E> iterator() {
            return asList().iterator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo33952a(Object[] objArr, int i) {
            return asList().mo33952a(objArr, i);
        }
    }

    /* renamed from: com.google.b.c.ak$c */
    static class C17574c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f49249a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return C17570ak.copyOf((E[]) this.f49249a);
        }

        C17574c(Object[] objArr) {
            this.f49249a = objArr;
        }
    }

    C17570ak() {
    }

    /* renamed from: of */
    public static <E> C17570ak<E> m43180of() {
        return C17650bg.f49346a;
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo34027c() {
        return false;
    }

    public abstract C17666bt<E> iterator();

    public static <E> C17571a<E> builder() {
        return new C17571a<>();
    }

    public int hashCode() {
        return C17658bm.m43405a(this);
    }

    public C17530ab<E> asList() {
        C17530ab<E> abVar = this.f49245a;
        if (abVar != null) {
            return abVar;
        }
        C17530ab<E> d = mo34098d();
        this.f49245a = d;
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C17530ab<E> mo34098d() {
        return C17530ab.m43053a(toArray());
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17574c(toArray());
    }

    /* renamed from: of */
    public static <E> C17570ak<E> m43181of(E e) {
        return new C17660bn(e);
    }

    public static <E> C17571a<E> builderWithExpectedSize(int i) {
        C17698k.m43477a(i, "expectedSize");
        return new C17571a<>(i);
    }

    public static <E> C17570ak<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: b */
    static int m43179b(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C17421k.m42660a(z, (Object) "collection too large");
            return 1073741824;
        }
    }

    public static <E> C17570ak<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof C17570ak) && !(collection instanceof SortedSet)) {
            C17570ak<E> akVar = (C17570ak) collection;
            if (!akVar.mo33977a()) {
                return akVar;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17570ak) || !mo34027c() || !((C17570ak) obj).mo34027c() || hashCode() == obj.hashCode()) {
            return C17658bm.m43407a((Set<?>) this, obj);
        }
        return false;
    }

    public static <E> C17570ak<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m43180of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m43181of(next);
        }
        return new C17571a().mo33975b(next).mo33972a(it).mo34100a();
    }

    public static <E> C17570ak<E> copyOf(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return m43180of();
            case 1:
                return m43181of(eArr[0]);
            default:
                return construct(eArr.length, (Object[]) eArr.clone());
        }
    }

    /* renamed from: of */
    public static <E> C17570ak<E> m43182of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> C17570ak<E> construct(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case 0:
                    return m43180of();
                case 1:
                    return m43181of(objArr[0]);
                default:
                    int b = m43179b(i);
                    Object[] objArr2 = new Object[b];
                    int i2 = b - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object a = C17632az.m43331a(objArr[i5], i5);
                        int hashCode = a.hashCode();
                        int a2 = C17724y.m43535a(hashCode);
                        while (true) {
                            int i6 = a2 & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                int i7 = i4 + 1;
                                objArr[i4] = a;
                                objArr2[i6] = a;
                                i3 += hashCode;
                                i4 = i7;
                            } else if (!obj.equals(a)) {
                                a2++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i4, i, null);
                    if (i4 == 1) {
                        return new C17660bn(objArr[0], i3);
                    }
                    if (m43179b(i4) < b / 2) {
                        i = i4;
                    } else {
                        if (shouldTrim(i4, objArr.length)) {
                            objArr = Arrays.copyOf(objArr, i4);
                        }
                        C17650bg bgVar = new C17650bg(objArr, i3, objArr2, i2, i4);
                        return bgVar;
                    }
            }
        }
    }

    /* renamed from: of */
    public static <E> C17570ak<E> m43183of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> C17570ak<E> m43184of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> C17570ak<E> m43185of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> C17570ak<E> m43186of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42660a(z, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(objArr.length, objArr);
    }
}
