package android.support.p030v4.p038f;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.f.n */
public class C0800n<K, V> {

    /* renamed from: b */
    static Object[] f2716b;

    /* renamed from: c */
    static int f2717c;

    /* renamed from: d */
    static Object[] f2718d;

    /* renamed from: e */
    static int f2719e;

    /* renamed from: f */
    int[] f2720f;

    /* renamed from: g */
    Object[] f2721g;

    /* renamed from: h */
    int f2722h;

    public int size() {
        return this.f2722h;
    }

    public boolean isEmpty() {
        if (this.f2722h <= 0) {
            return true;
        }
        return false;
    }

    public C0800n() {
        this.f2720f = C0782d.f2679a;
        this.f2721g = C0782d.f2681c;
    }

    public void clear() {
        if (this.f2722h > 0) {
            int[] iArr = this.f2720f;
            Object[] objArr = this.f2721g;
            int i = this.f2722h;
            this.f2720f = C0782d.f2679a;
            this.f2721g = C0782d.f2681c;
            this.f2722h = 0;
            m2272a(iArr, objArr, i);
        }
        if (this.f2722h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f2720f;
        Object[] objArr = this.f2721g;
        int i2 = this.f2722h;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < i2) {
            Object obj = objArr[i4];
            int i6 = iArr[i3];
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i5 += i ^ i6;
            i3++;
            i4 += 2;
        }
        return i5;
    }

    /* renamed from: a */
    private int m2269a() {
        int i = this.f2722h;
        if (i == 0) {
            return -1;
        }
        int a = m2271a(this.f2720f, i, 0);
        if (a < 0 || this.f2721g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f2720f[i2] == 0) {
            if (this.f2721g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f2720f[i3] == 0) {
            if (this.f2721g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2722h * 28);
        sb.append('{');
        for (int i = 0; i < this.f2722h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo2576b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo2577c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public final K mo2576b(int i) {
        return this.f2721g[i << 1];
    }

    /* renamed from: c */
    public final V mo2577c(int i) {
        return this.f2721g[(i << 1) + 1];
    }

    public boolean containsKey(Object obj) {
        if (mo2573a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (mo2575b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public V remove(Object obj) {
        int a = mo2573a(obj);
        if (a >= 0) {
            return mo2581d(a);
        }
        return null;
    }

    public C0800n(int i) {
        if (i == 0) {
            this.f2720f = C0782d.f2679a;
            this.f2721g = C0782d.f2681c;
        } else {
            m2273e(i);
        }
        this.f2722h = 0;
    }

    /* renamed from: a */
    public final int mo2573a(Object obj) {
        if (obj == null) {
            return m2269a();
        }
        return m2270a(obj, obj.hashCode());
    }

    public V get(Object obj) {
        int a = mo2573a(obj);
        if (a >= 0) {
            return this.f2721g[(a << 1) + 1];
        }
        return null;
    }

    public C0800n(C0800n<K, V> nVar) {
        this();
        if (nVar != null) {
            int i = nVar.f2722h;
            mo2574a(this.f2722h + i);
            if (this.f2722h != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(nVar.mo2576b(i2), nVar.mo2577c(i2));
                }
            } else if (i > 0) {
                System.arraycopy(nVar.f2720f, 0, this.f2720f, 0, i);
                System.arraycopy(nVar.f2721g, 0, this.f2721g, 0, i << 1);
                this.f2722h = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo2574a(int i) {
        int i2 = this.f2722h;
        if (this.f2720f.length < i) {
            int[] iArr = this.f2720f;
            Object[] objArr = this.f2721g;
            m2273e(i);
            if (this.f2722h > 0) {
                System.arraycopy(iArr, 0, this.f2720f, 0, i2);
                System.arraycopy(objArr, 0, this.f2721g, 0, i2 << 1);
            }
            m2272a(iArr, objArr, i2);
        }
        if (this.f2722h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo2575b(Object obj) {
        int i = this.f2722h * 2;
        Object[] objArr = this.f2721g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: e */
    private void m2273e(int i) {
        if (i == 8) {
            synchronized (C0777a.class) {
                if (f2718d != null) {
                    Object[] objArr = f2718d;
                    this.f2721g = objArr;
                    f2718d = (Object[]) objArr[0];
                    this.f2720f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2719e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0777a.class) {
                if (f2716b != null) {
                    Object[] objArr2 = f2716b;
                    this.f2721g = objArr2;
                    f2716b = (Object[]) objArr2[0];
                    this.f2720f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2717c--;
                    return;
                }
            }
        }
        this.f2720f = new int[i];
        this.f2721g = new Object[(i << 1)];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0800n) {
            C0800n nVar = (C0800n) obj;
            if (size() != nVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f2722h) {
                try {
                    Object b = mo2576b(i);
                    Object c = mo2577c(i);
                    Object obj2 = nVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !nVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f2722h) {
                try {
                    Object b2 = mo2576b(i2);
                    Object c2 = mo2577c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (NullPointerException unused3) {
                    return false;
                } catch (ClassCastException unused4) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public final V mo2581d(int i) {
        int i2 = i << 1;
        V v = this.f2721g[i2 + 1];
        int i3 = this.f2722h;
        int i4 = 0;
        if (i3 <= 1) {
            m2272a(this.f2720f, this.f2721g, i3);
            this.f2720f = C0782d.f2679a;
            this.f2721g = C0782d.f2681c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f2720f.length <= 8 || this.f2722h >= this.f2720f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f2720f, i7, this.f2720f, i, i8);
                    System.arraycopy(this.f2721g, i7 << 1, this.f2721g, i2, i8 << 1);
                }
                int i9 = i5 << 1;
                this.f2721g[i9] = null;
                this.f2721g[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr = this.f2720f;
                Object[] objArr = this.f2721g;
                m2273e(i6);
                if (i3 == this.f2722h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f2720f, 0, i);
                        System.arraycopy(objArr, 0, this.f2721g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f2720f, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f2721g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f2722h) {
            this.f2722h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    private int m2270a(Object obj, int i) {
        int i2 = this.f2722h;
        if (i2 == 0) {
            return -1;
        }
        int a = m2271a(this.f2720f, i2, i);
        if (a < 0 || obj.equals(this.f2721g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2720f[i3] == i) {
            if (obj.equals(this.f2721g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f2720f[i4] == i) {
            if (obj.equals(this.f2721g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f2722h;
        if (k == null) {
            i2 = m2269a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = m2270a(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V v2 = this.f2721g[i4];
            this.f2721g[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f2720f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f2720f;
            Object[] objArr = this.f2721g;
            m2273e(i6);
            if (i3 == this.f2722h) {
                if (this.f2720f.length > 0) {
                    System.arraycopy(iArr, 0, this.f2720f, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f2721g, 0, objArr.length);
                }
                m2272a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f2720f;
            int i7 = i5 + 1;
            System.arraycopy(iArr2, i5, iArr2, i7, i3 - i5);
            System.arraycopy(this.f2721g, i5 << 1, this.f2721g, i7 << 1, (this.f2722h - i5) << 1);
        }
        if (i3 != this.f2722h || i5 >= this.f2720f.length) {
            throw new ConcurrentModificationException();
        }
        this.f2720f[i5] = i;
        int i8 = i5 << 1;
        this.f2721g[i8] = k;
        this.f2721g[i8 + 1] = v;
        this.f2722h++;
        return null;
    }

    /* renamed from: a */
    private static int m2271a(int[] iArr, int i, int i2) {
        try {
            return C0782d.m2219a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m2272a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0777a.class) {
                if (f2719e < 10) {
                    objArr[0] = f2718d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2718d = objArr;
                    f2719e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0777a.class) {
                if (f2717c < 10) {
                    objArr[0] = f2716b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2716b = objArr;
                    f2717c++;
                }
            }
        }
    }
}
