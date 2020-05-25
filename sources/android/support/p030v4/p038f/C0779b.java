package android.support.p030v4.p038f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.f.b */
public final class C0779b<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f2668c = new int[0];

    /* renamed from: d */
    private static final Object[] f2669d = new Object[0];

    /* renamed from: e */
    private static Object[] f2670e;

    /* renamed from: f */
    private static int f2671f;

    /* renamed from: g */
    private static Object[] f2672g;

    /* renamed from: h */
    private static int f2673h;

    /* renamed from: a */
    Object[] f2674a;

    /* renamed from: b */
    int f2675b;

    /* renamed from: i */
    private int[] f2676i;

    /* renamed from: j */
    private C0787i<E, E> f2677j;

    public final int size() {
        return this.f2675b;
    }

    public C0779b() {
        this(0);
    }

    public final boolean isEmpty() {
        if (this.f2675b <= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f2676i;
        int i = 0;
        for (int i2 = 0; i2 < this.f2675b; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[this.f2675b];
        System.arraycopy(this.f2674a, 0, objArr, 0, this.f2675b);
        return objArr;
    }

    public final void clear() {
        if (this.f2675b != 0) {
            m2204a(this.f2676i, this.f2674a, this.f2675b);
            this.f2676i = f2668c;
            this.f2674a = f2669d;
            this.f2675b = 0;
        }
    }

    public final Iterator<E> iterator() {
        if (this.f2677j == null) {
            this.f2677j = new C0787i<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo2454a() {
                    return C0779b.this.f2675b;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final void mo2462c() {
                    C0779b.this.clear();
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Map<E, E> mo2461b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final int mo2460b(Object obj) {
                    return C0779b.this.mo2463a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo2455a(Object obj) {
                    return C0779b.this.mo2463a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo2458a(int i) {
                    C0779b.this.mo2467b(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo2456a(int i, int i2) {
                    return C0779b.this.f2674a[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final E mo2457a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo2459a(E e, E e2) {
                    C0779b.this.add(e);
                }
            };
        }
        return this.f2677j.mo2512d().iterator();
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2675b * 14);
        sb.append('{');
        for (int i = 0; i < this.f2675b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object a = mo2464a(i);
            if (a != this) {
                sb.append(a);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private int m2202a() {
        int i = this.f2675b;
        if (i == 0) {
            return -1;
        }
        int a = C0782d.m2219a(this.f2676i, i, 0);
        if (a < 0 || this.f2674a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f2676i[i2] == 0) {
            if (this.f2674a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f2676i[i3] == 0) {
            if (this.f2674a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public final E mo2464a(int i) {
        return this.f2674a[i];
    }

    public C0779b(Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: a */
    public final int mo2463a(Object obj) {
        if (obj == null) {
            return m2202a();
        }
        return m2203a(obj, obj.hashCode());
    }

    public final boolean contains(Object obj) {
        if (mo2463a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        int a = mo2463a(obj);
        if (a < 0) {
            return false;
        }
        mo2467b(a);
        return true;
    }

    public C0779b(int i) {
        if (i == 0) {
            this.f2676i = f2668c;
            this.f2674a = f2669d;
        } else {
            m2205c(i);
        }
        this.f2675b = 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f2675b - 1; i >= 0; i--) {
            if (!collection.contains(this.f2674a[i])) {
                mo2467b(i);
                z = true;
            }
        }
        return z;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f2675b + collection.size();
        boolean z = false;
        if (this.f2676i.length < size) {
            int[] iArr = this.f2676i;
            Object[] objArr = this.f2674a;
            m2205c(size);
            if (this.f2675b > 0) {
                System.arraycopy(iArr, 0, this.f2676i, 0, this.f2675b);
                System.arraycopy(objArr, 0, this.f2674a, 0, this.f2675b);
            }
            m2204a(iArr, objArr, this.f2675b);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f2675b) {
            try {
                if (!set.contains(mo2464a(i))) {
                    return false;
                }
                i++;
            } catch (NullPointerException unused) {
                return false;
            } catch (ClassCastException unused2) {
                return false;
            }
        }
        return true;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2675b) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2675b);
        }
        System.arraycopy(this.f2674a, 0, tArr, 0, this.f2675b);
        if (tArr.length > this.f2675b) {
            tArr[this.f2675b] = null;
        }
        return tArr;
    }

    /* renamed from: c */
    private void m2205c(int i) {
        if (i == 8) {
            synchronized (C0779b.class) {
                if (f2672g != null) {
                    Object[] objArr = f2672g;
                    this.f2674a = objArr;
                    f2672g = (Object[]) objArr[0];
                    this.f2676i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2673h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0779b.class) {
                if (f2670e != null) {
                    Object[] objArr2 = f2670e;
                    this.f2674a = objArr2;
                    f2670e = (Object[]) objArr2[0];
                    this.f2676i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2671f--;
                    return;
                }
            }
        }
        this.f2676i = new int[i];
        this.f2674a = new Object[i];
    }

    public final boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m2202a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m2203a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        if (this.f2675b >= this.f2676i.length) {
            int i4 = 4;
            if (this.f2675b >= 8) {
                i4 = (this.f2675b >> 1) + this.f2675b;
            } else if (this.f2675b >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f2676i;
            Object[] objArr = this.f2674a;
            m2205c(i4);
            if (this.f2676i.length > 0) {
                System.arraycopy(iArr, 0, this.f2676i, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2674a, 0, objArr.length);
            }
            m2204a(iArr, objArr, this.f2675b);
        }
        if (i3 < this.f2675b) {
            int[] iArr2 = this.f2676i;
            int i5 = i3 + 1;
            System.arraycopy(iArr2, i3, iArr2, i5, this.f2675b - i3);
            Object[] objArr2 = this.f2674a;
            System.arraycopy(objArr2, i3, objArr2, i5, this.f2675b - i3);
        }
        this.f2676i[i3] = i;
        this.f2674a[i3] = e;
        this.f2675b++;
        return true;
    }

    /* renamed from: b */
    public final E mo2467b(int i) {
        E e = this.f2674a[i];
        if (this.f2675b <= 1) {
            m2204a(this.f2676i, this.f2674a, this.f2675b);
            this.f2676i = f2668c;
            this.f2674a = f2669d;
            this.f2675b = 0;
        } else {
            int i2 = 8;
            if (this.f2676i.length <= 8 || this.f2675b >= this.f2676i.length / 3) {
                this.f2675b--;
                if (i < this.f2675b) {
                    int i3 = i + 1;
                    System.arraycopy(this.f2676i, i3, this.f2676i, i, this.f2675b - i);
                    System.arraycopy(this.f2674a, i3, this.f2674a, i, this.f2675b - i);
                }
                this.f2674a[this.f2675b] = null;
            } else {
                if (this.f2675b > 8) {
                    i2 = (this.f2675b >> 1) + this.f2675b;
                }
                int[] iArr = this.f2676i;
                Object[] objArr = this.f2674a;
                m2205c(i2);
                this.f2675b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2676i, 0, i);
                    System.arraycopy(objArr, 0, this.f2674a, 0, i);
                }
                if (i < this.f2675b) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.f2676i, i, this.f2675b - i);
                    System.arraycopy(objArr, i4, this.f2674a, i, this.f2675b - i);
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private int m2203a(Object obj, int i) {
        int i2 = this.f2675b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0782d.m2219a(this.f2676i, i2, i);
        if (a < 0 || obj.equals(this.f2674a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2676i[i3] == i) {
            if (obj.equals(this.f2674a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f2676i[i4] == i) {
            if (obj.equals(this.f2674a[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private static void m2204a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0779b.class) {
                if (f2673h < 10) {
                    objArr[0] = f2672g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2672g = objArr;
                    f2673h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0779b.class) {
                if (f2671f < 10) {
                    objArr[0] = f2670e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2670e = objArr;
                    f2671f++;
                }
            }
        }
    }
}
