package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.c.n */
final class C17711n<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a */
    public transient long[] f49439a;

    /* renamed from: b */
    transient Object[] f49440b;

    /* renamed from: c */
    transient float f49441c;

    /* renamed from: d */
    transient int f49442d;

    /* renamed from: e */
    transient int f49443e;

    /* renamed from: f */
    private transient int[] f49444f;

    /* renamed from: g */
    private transient int f49445g;

    /* renamed from: a */
    public static int m43508a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    private static long m43509a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    private static int m43512b(long j) {
        return (int) j;
    }

    public final int size() {
        return this.f49443e;
    }

    /* renamed from: a */
    private int m43507a() {
        return this.f49444f.length - 1;
    }

    public final boolean isEmpty() {
        if (this.f49443e == 0) {
            return true;
        }
        return false;
    }

    public final Iterator<E> iterator() {
        return new Iterator<E>() {

            /* renamed from: a */
            int f49446a = C17711n.this.f49442d;

            /* renamed from: b */
            int f49447b;

            /* renamed from: c */
            int f49448c;

            public final boolean hasNext() {
                if (this.f49447b >= 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            private void m43517a() {
                if (C17711n.this.f49442d != this.f49446a) {
                    throw new ConcurrentModificationException();
                }
            }

            public final E next() {
                m43517a();
                if (hasNext()) {
                    this.f49448c = this.f49447b;
                    E e = C17711n.this.f49440b[this.f49447b];
                    int i = this.f49447b + 1;
                    if (i >= C17711n.this.f49443e) {
                        i = -1;
                    }
                    this.f49447b = i;
                    return e;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                boolean z;
                m43517a();
                if (this.f49448c >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C17698k.m43479a(z);
                this.f49446a++;
                C17711n.this.mo34461a(C17711n.this.f49440b[this.f49448c], C17711n.m43508a(C17711n.this.f49439a[this.f49448c]));
                int i = this.f49447b;
                int i2 = this.f49448c;
                this.f49447b = i - 1;
                this.f49448c = -1;
            }

            {
                int i;
                if (C17711n.this.isEmpty()) {
                    i = -1;
                } else {
                    i = 0;
                }
                this.f49447b = i;
                this.f49448c = -1;
            }
        };
    }

    C17711n() {
        m43510a(3, 1.0f);
    }

    public final Object[] toArray() {
        return Arrays.copyOf(this.f49440b, this.f49443e);
    }

    public final void clear() {
        this.f49442d++;
        Arrays.fill(this.f49440b, 0, this.f49443e, null);
        Arrays.fill(this.f49444f, -1);
        Arrays.fill(this.f49439a, -1);
        this.f49443e = 0;
    }

    /* renamed from: b */
    private static long[] m43513b(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    public final boolean remove(Object obj) {
        return mo34461a(obj, C17724y.m43537a(obj));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m43510a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f49443e);
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.f49440b;
        int i = this.f49443e;
        C17421k.m42658a(0, i + 0, objArr.length);
        if (tArr.length < i) {
            tArr = C17632az.m43333a(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    public final boolean contains(Object obj) {
        int a = C17724y.m43537a(obj);
        int i = this.f49444f[m43507a() & a];
        while (i != -1) {
            long j = this.f49439a[i];
            if (m43508a(j) == a && C17417i.m42646a(obj, this.f49440b[i])) {
                return true;
            }
            i = m43512b(j);
        }
        return false;
    }

    /* renamed from: a */
    private static int[] m43511a(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: c */
    private void m43514c(int i) {
        if (this.f49444f.length >= 1073741824) {
            this.f49445g = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f49441c)) + 1;
        int[] a = m43511a(i);
        long[] jArr = this.f49439a;
        int length = a.length - 1;
        for (int i3 = 0; i3 < this.f49443e; i3++) {
            int a2 = m43508a(jArr[i3]);
            int i4 = a2 & length;
            int i5 = a[i4];
            a[i4] = i3;
            jArr[i3] = (((long) a2) << 32) | (4294967295L & ((long) i5));
        }
        this.f49445g = i2;
        this.f49444f = a;
    }

    /* renamed from: d */
    private void m43515d(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f49440b;
            objArr[i] = objArr[size];
            this.f49440b[size] = null;
            long j = this.f49439a[size];
            this.f49439a[i] = j;
            this.f49439a[size] = -1;
            int a = m43508a(j) & m43507a();
            int i2 = this.f49444f[a];
            if (i2 == size) {
                this.f49444f[a] = i;
            } else {
                while (true) {
                    long j2 = this.f49439a[i2];
                    int b = m43512b(j2);
                    if (b == size) {
                        this.f49439a[i2] = m43509a(j2, i);
                        return;
                    }
                    i2 = b;
                }
            }
        } else {
            this.f49440b[i] = null;
            this.f49439a[i] = -1;
        }
    }

    public final boolean add(E e) {
        long[] jArr = this.f49439a;
        Object[] objArr = this.f49440b;
        int a = C17724y.m43537a((Object) e);
        int a2 = m43507a() & a;
        int i = this.f49443e;
        int i2 = this.f49444f[a2];
        if (i2 == -1) {
            this.f49444f[a2] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m43508a(j) == a && C17417i.m42646a(e, objArr[i2])) {
                    return false;
                }
                int b = m43512b(j);
                if (b == -1) {
                    jArr[i2] = m43509a(j, i);
                    break;
                }
                i2 = b;
            }
        }
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            int i4 = i + 1;
            int length = this.f49439a.length;
            if (i4 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max >= 0) {
                    i3 = max;
                }
                if (i3 != length) {
                    this.f49440b = Arrays.copyOf(this.f49440b, i3);
                    long[] jArr2 = this.f49439a;
                    int length2 = jArr2.length;
                    long[] copyOf = Arrays.copyOf(jArr2, i3);
                    if (i3 > length2) {
                        Arrays.fill(copyOf, length2, i3, -1);
                    }
                    this.f49439a = copyOf;
                }
            }
            this.f49439a[i] = (((long) a) << 32) | 4294967295L;
            this.f49440b[i] = e;
            this.f49443e = i4;
            if (i >= this.f49445g) {
                m43514c(this.f49444f.length * 2);
            }
            this.f49442d++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: a */
    private void m43510a(int i, float f) {
        C17421k.m42660a(true, (Object) "Initial capacity must be non-negative");
        C17421k.m42660a(true, (Object) "Illegal load factor");
        int a = C17724y.m43536a(3, 1.0d);
        this.f49444f = m43511a(a);
        this.f49441c = 1.0f;
        this.f49440b = new Object[3];
        this.f49439a = m43513b(3);
        this.f49445g = Math.max(1, (int) (((float) a) * 1.0f));
    }

    /* renamed from: a */
    public final boolean mo34461a(Object obj, int i) {
        int a = m43507a() & i;
        int i2 = this.f49444f[a];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (m43508a(this.f49439a[i2]) != i || !C17417i.m42646a(obj, this.f49440b[i2])) {
                int b = m43512b(this.f49439a[i2]);
                if (b == -1) {
                    return false;
                }
                int i4 = b;
                i3 = i2;
                i2 = i4;
            } else {
                if (i3 == -1) {
                    this.f49444f[a] = m43512b(this.f49439a[i2]);
                } else {
                    long[] jArr = this.f49439a;
                    jArr[i3] = m43509a(jArr[i3], m43512b(this.f49439a[i2]));
                }
                m43515d(i2);
                this.f49443e--;
                this.f49442d++;
                return true;
            }
        }
    }
}
