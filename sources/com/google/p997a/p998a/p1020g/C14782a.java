package com.google.p997a.p998a.p1020g;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.a.a.g.a */
public class C14782a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a */
    int f38290a;

    /* renamed from: b */
    Object[] f38291b;

    /* renamed from: com.google.a.a.g.a$a */
    final class C14783a implements Entry<K, V> {

        /* renamed from: b */
        private int f38293b;

        public final V getValue() {
            return C14782a.this.mo27085a(this.f38293b);
        }

        public final K getKey() {
            C14782a aVar = C14782a.this;
            int i = this.f38293b;
            if (i < 0 || i >= aVar.f38290a) {
                return null;
            }
            return aVar.f38291b[i << 1];
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public final V setValue(V v) {
            return C14782a.this.mo27086a(this.f38293b, v);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!C14813n.m30286a(getKey(), entry.getKey()) || !C14813n.m30286a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        C14783a(int i) {
            this.f38293b = i;
        }
    }

    /* renamed from: com.google.a.a.g.a$b */
    final class C14784b implements Iterator<Entry<K, V>> {

        /* renamed from: b */
        private boolean f38295b;

        /* renamed from: c */
        private int f38296c;

        public final boolean hasNext() {
            if (this.f38296c < C14782a.this.f38290a) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object next() {
            int i = this.f38296c;
            if (i != C14782a.this.f38290a) {
                this.f38296c++;
                return new C14783a(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            int i = this.f38296c - 1;
            if (this.f38295b || i < 0) {
                throw new IllegalArgumentException();
            }
            C14782a.this.mo27088b(i << 1);
            this.f38295b = true;
        }

        C14784b() {
        }
    }

    /* renamed from: com.google.a.a.g.a$c */
    final class C14785c extends AbstractSet<Entry<K, V>> {
        public final Iterator<Entry<K, V>> iterator() {
            return new C14784b();
        }

        public final int size() {
            return C14782a.this.f38290a;
        }

        C14785c() {
        }
    }

    public final int size() {
        return this.f38290a;
    }

    /* renamed from: a */
    public static <K, V> C14782a<K, V> m30235a() {
        return new C14782a<>();
    }

    public void clear() {
        this.f38290a = 0;
        this.f38291b = null;
    }

    public final Set<Entry<K, V>> entrySet() {
        return new C14785c();
    }

    /* renamed from: b */
    public final C14782a<K, V> clone() {
        try {
            C14782a<K, V> aVar = (C14782a) super.clone();
            Object[] objArr = this.f38291b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f38291b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private V m30237c(int i) {
        if (i < 0) {
            return null;
        }
        return this.f38291b[i];
    }

    public final boolean containsKey(Object obj) {
        if (-2 != m30234a(obj)) {
            return true;
        }
        return false;
    }

    public final V get(Object obj) {
        return m30237c(m30234a(obj) + 1);
    }

    public final V remove(Object obj) {
        return mo27088b(m30234a(obj));
    }

    /* renamed from: a */
    private int m30234a(Object obj) {
        int i = this.f38290a << 1;
        Object[] objArr = this.f38291b;
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    public final boolean containsValue(Object obj) {
        int i = this.f38290a << 1;
        Object[] objArr = this.f38291b;
        int i2 = 1;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final V mo27085a(int i) {
        if (i < 0 || i >= this.f38290a) {
            return null;
        }
        return m30237c((i << 1) + 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public V mo27088b(int i) {
        int i2 = this.f38290a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V c = m30237c(i + 1);
        Object[] objArr = this.f38291b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f38290a--;
        m30236a(i2 - 2, null, null);
        return c;
    }

    /* renamed from: a */
    public final V mo27086a(int i, V v) {
        int i2 = this.f38290a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V c = m30237c(i3);
        this.f38291b[i3] = v;
        return c;
    }

    public final V put(K k, V v) {
        int i;
        int a = m30234a((Object) k) >> 1;
        if (a == -1) {
            a = this.f38290a;
        }
        if (a >= 0) {
            int i2 = a + 1;
            if (i2 >= 0) {
                Object[] objArr = this.f38291b;
                int i3 = i2 << 1;
                if (objArr == null) {
                    i = 0;
                } else {
                    i = objArr.length;
                }
                if (i3 > i) {
                    int i4 = ((i / 2) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 < i3) {
                        i4 = i3;
                    }
                    if (i4 == 0) {
                        this.f38291b = null;
                    } else {
                        int i5 = this.f38290a;
                        Object[] objArr2 = this.f38291b;
                        if (i5 == 0 || i4 != objArr2.length) {
                            Object[] objArr3 = new Object[i4];
                            this.f38291b = objArr3;
                            if (i5 != 0) {
                                System.arraycopy(objArr2, 0, objArr3, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = a << 1;
                V c = m30237c(i6 + 1);
                m30236a(i6, k, v);
                if (i2 > this.f38290a) {
                    this.f38290a = i2;
                }
                return c;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    private void m30236a(int i, K k, V v) {
        Object[] objArr = this.f38291b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }
}
