package org.eclipse.mat.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class HashMapLongObject<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private int capacity;
    public long[] keys;
    private int limit;
    public int size;
    private int step;
    public boolean[] used;
    public E[] values;

    public interface Entry<E> {
        long getKey();

        E getValue();
    }

    private int hash(long j) {
        return (int) (j & 2147483647L);
    }

    public final int size() {
        return this.size;
    }

    public HashMapLongObject() {
        this(10);
    }

    public final Iterator<Entry<E>> entries() {
        return new Iterator<Entry<E>>() {

            /* renamed from: i */
            int f133274i = -1;

            /* renamed from: n */
            int f133275n;

            public void remove() throws UnsupportedOperationException {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                if (this.f133275n < HashMapLongObject.this.size) {
                    return true;
                }
                return false;
            }

            public Entry<E> next() throws NoSuchElementException {
                do {
                    int i = this.f133274i + 1;
                    this.f133274i = i;
                    if (i >= HashMapLongObject.this.used.length) {
                        throw new NoSuchElementException();
                    }
                } while (!HashMapLongObject.this.used[this.f133274i]);
                this.f133275n++;
                return new Entry<E>() {
                    public long getKey() {
                        return HashMapLongObject.this.keys[C537193.this.f133274i];
                    }

                    public E getValue() {
                        return HashMapLongObject.this.values[C537193.this.f133274i];
                    }
                };
            }
        };
    }

    public final IteratorLong keys() {
        return new IteratorLong() {

            /* renamed from: i */
            int f133270i = -1;

            /* renamed from: n */
            int f133271n;

            public boolean hasNext() {
                if (this.f133271n < HashMapLongObject.this.size) {
                    return true;
                }
                return false;
            }

            public long next() throws NoSuchElementException {
                do {
                    int i = this.f133270i + 1;
                    this.f133270i = i;
                    if (i >= HashMapLongObject.this.used.length) {
                        throw new NoSuchElementException();
                    }
                } while (!HashMapLongObject.this.used[this.f133270i]);
                this.f133271n++;
                return HashMapLongObject.this.keys[this.f133270i];
            }
        };
    }

    public final Iterator<E> values() {
        return new Iterator<E>() {

            /* renamed from: i */
            int f133272i = -1;

            /* renamed from: n */
            int f133273n;

            public void remove() throws UnsupportedOperationException {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                if (this.f133273n < HashMapLongObject.this.size) {
                    return true;
                }
                return false;
            }

            public E next() throws NoSuchElementException {
                do {
                    int i = this.f133272i + 1;
                    this.f133272i = i;
                    if (i >= HashMapLongObject.this.used.length) {
                        throw new NoSuchElementException();
                    }
                } while (!HashMapLongObject.this.used[this.f133272i]);
                this.f133273n++;
                return HashMapLongObject.this.values[this.f133272i];
            }
        };
    }

    public final void clear() {
        this.size = 0;
        this.used = new boolean[this.capacity];
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final long[] getAllKeys() {
        long[] jArr = new long[this.size];
        int i = 0;
        for (int i2 = 0; i2 < this.used.length; i2++) {
            if (this.used[i2]) {
                int i3 = i + 1;
                jArr[i] = this.keys[i2];
                i = i3;
            }
        }
        return jArr;
    }

    public final Object[] getAllValues() {
        Object[] objArr = new Object[this.size];
        int i = 0;
        for (int i2 = 0; i2 < this.used.length; i2++) {
            if (this.used[i2]) {
                int i3 = i + 1;
                objArr[i] = this.values[i2];
                i = i3;
            }
        }
        return objArr;
    }

    public HashMapLongObject(int i) {
        init(i);
    }

    public final boolean containsKey(long j) {
        int hash = hash(j);
        int i = this.capacity;
        while (true) {
            int i2 = hash % i;
            if (!this.used[i2]) {
                return false;
            }
            if (this.keys[i2] == j) {
                return true;
            }
            hash = i2 + this.step;
            i = this.capacity;
        }
    }

    private void init(int i) {
        this.capacity = PrimeFinder.findNextPrime(i);
        this.step = Math.max(1, PrimeFinder.findPrevPrime(i / 3));
        double d = (double) this.capacity;
        Double.isNaN(d);
        this.limit = (int) (d * 0.75d);
        clear();
        this.keys = new long[this.capacity];
        this.values = (Object[]) new Object[this.capacity];
    }

    private void resize(int i) {
        int i2;
        int i3 = this.size;
        boolean[] zArr = this.used;
        long[] jArr = this.keys;
        E[] eArr = this.values;
        init(i);
        for (int i4 = 0; i4 < zArr.length; i4++) {
            if (zArr[i4]) {
                long j = jArr[i4];
                int hash = hash(j);
                int i5 = this.capacity;
                while (true) {
                    i2 = hash % i5;
                    if (!this.used[i2]) {
                        break;
                    }
                    hash = i2 + this.step;
                    i5 = this.capacity;
                }
                this.used[i2] = true;
                this.keys[i2] = j;
                this.values[i2] = eArr[i4];
            }
        }
        this.size = i3;
    }

    public final E get(long j) {
        int hash = hash(j);
        int i = this.capacity;
        while (true) {
            int i2 = hash % i;
            if (!this.used[i2]) {
                return null;
            }
            if (this.keys[i2] == j) {
                return this.values[i2];
            }
            hash = i2 + this.step;
            i = this.capacity;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=T[], code=java.lang.Object[], for r5v0, types: [T[], java.lang.Object[], java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T[] getAllValues(java.lang.Object[] r5) {
        /*
            r4 = this;
            int r0 = r5.length
            int r1 = r4.size
            if (r0 >= r1) goto L_0x0015
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r5 = r5.getComponentType()
            int r0 = r4.size
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
        L_0x0015:
            r0 = 0
            r1 = 0
        L_0x0017:
            boolean[] r2 = r4.used
            int r2 = r2.length
            if (r0 >= r2) goto L_0x002e
            boolean[] r2 = r4.used
            boolean r2 = r2[r0]
            if (r2 == 0) goto L_0x002b
            int r2 = r1 + 1
            E[] r3 = r4.values
            r3 = r3[r0]
            r5[r1] = r3
            r1 = r2
        L_0x002b:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x002e:
            int r0 = r5.length
            int r1 = r4.size
            if (r0 <= r1) goto L_0x0038
            int r0 = r4.size
            r1 = 0
            r5[r0] = r1
        L_0x0038:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.collect.HashMapLongObject.getAllValues(java.lang.Object[]):java.lang.Object[]");
    }

    public final E remove(long j) {
        int i;
        int hash = hash(j);
        int i2 = this.capacity;
        while (true) {
            int i3 = hash % i2;
            if (!this.used[i3]) {
                return null;
            }
            if (this.keys[i3] == j) {
                E e = this.values[i3];
                this.used[i3] = false;
                this.size--;
                int i4 = i3 + this.step;
                int i5 = this.capacity;
                while (true) {
                    int i6 = i4 % i5;
                    if (!this.used[i6]) {
                        return e;
                    }
                    long j2 = this.keys[i6];
                    this.used[i6] = false;
                    int hash2 = hash(j2);
                    int i7 = this.capacity;
                    while (true) {
                        i = hash2 % i7;
                        if (!this.used[i]) {
                            break;
                        }
                        hash2 = i + this.step;
                        i7 = this.capacity;
                    }
                    this.used[i] = true;
                    this.keys[i] = j2;
                    E[] eArr = this.values;
                    eArr[i] = eArr[i6];
                    i4 = i6 + this.step;
                    i5 = this.capacity;
                }
            } else {
                hash = i3 + this.step;
                i2 = this.capacity;
            }
        }
    }

    public final E put(long j, E e) {
        if (this.size == this.limit) {
            resize(this.capacity << 1);
        }
        int hash = hash(j);
        int i = this.capacity;
        while (true) {
            int i2 = hash % i;
            if (!this.used[i2]) {
                this.used[i2] = true;
                this.keys[i2] = j;
                this.values[i2] = e;
                this.size++;
                return null;
            } else if (this.keys[i2] == j) {
                E e2 = this.values[i2];
                this.values[i2] = e;
                return e2;
            } else {
                hash = i2 + this.step;
                i = this.capacity;
            }
        }
    }
}
