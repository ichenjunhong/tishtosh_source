package org.eclipse.mat.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class HashMapIntLong implements Serializable {
    private static NoSuchElementException noSuchElementException = new NoSuchElementException("This is static exception, there is no stack trace available. It is thrown by get() method.");
    private static final long serialVersionUID = 1;
    private int capacity;
    public int[] keys;
    private int limit;
    public int size;
    private int step;
    public boolean[] used;
    public long[] values;

    public interface Entry {
        int getKey();

        long getValue();
    }

    public final int size() {
        return this.size;
    }

    public HashMapIntLong() {
        this(10);
    }

    public final Iterator<Entry> entries() {
        return new Iterator<Entry>() {

            /* renamed from: i */
            int f133262i = -1;

            /* renamed from: n */
            int f133263n;

            public void remove() throws UnsupportedOperationException {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                if (this.f133263n < HashMapIntLong.this.size) {
                    return true;
                }
                return false;
            }

            public Entry next() throws NoSuchElementException {
                do {
                    int i = this.f133262i + 1;
                    this.f133262i = i;
                    if (i >= HashMapIntLong.this.used.length) {
                        throw new NoSuchElementException();
                    }
                } while (!HashMapIntLong.this.used[this.f133262i]);
                this.f133263n++;
                return new Entry() {
                    public int getKey() {
                        return HashMapIntLong.this.keys[C537113.this.f133262i];
                    }

                    public long getValue() {
                        return HashMapIntLong.this.values[C537113.this.f133262i];
                    }
                };
            }
        };
    }

    public final IteratorInt keys() {
        return new IteratorInt() {

            /* renamed from: i */
            int f133258i = -1;

            /* renamed from: n */
            int f133259n;

            public boolean hasNext() {
                if (this.f133259n < HashMapIntLong.this.size) {
                    return true;
                }
                return false;
            }

            public int next() throws NoSuchElementException {
                do {
                    int i = this.f133258i + 1;
                    this.f133258i = i;
                    if (i >= HashMapIntLong.this.used.length) {
                        throw new NoSuchElementException();
                    }
                } while (!HashMapIntLong.this.used[this.f133258i]);
                this.f133259n++;
                return HashMapIntLong.this.keys[this.f133258i];
            }
        };
    }

    public final IteratorLong values() {
        return new IteratorLong() {

            /* renamed from: i */
            int f133260i = -1;

            /* renamed from: n */
            int f133261n;

            public boolean hasNext() {
                if (this.f133261n < HashMapIntLong.this.size) {
                    return true;
                }
                return false;
            }

            public long next() throws NoSuchElementException {
                do {
                    int i = this.f133260i + 1;
                    this.f133260i = i;
                    if (i >= HashMapIntLong.this.used.length) {
                        throw new NoSuchElementException();
                    }
                } while (!HashMapIntLong.this.used[this.f133260i]);
                this.f133261n++;
                return HashMapIntLong.this.values[this.f133260i];
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

    public final int[] getAllKeys() {
        int[] iArr = new int[this.size];
        int i = 0;
        for (int i2 = 0; i2 < this.used.length; i2++) {
            if (this.used[i2]) {
                int i3 = i + 1;
                iArr[i] = this.keys[i2];
                i = i3;
            }
        }
        return iArr;
    }

    public final long[] getAllValues() {
        long[] jArr = new long[this.size];
        int i = 0;
        for (int i2 = 0; i2 < this.values.length; i2++) {
            if (this.used[i2]) {
                int i3 = i + 1;
                jArr[i] = this.values[i2];
                i = i3;
            }
        }
        return jArr;
    }

    public HashMapIntLong(int i) {
        init(i);
    }

    public final boolean containsKey(int i) {
        int i2 = Integer.MAX_VALUE & i;
        int i3 = this.capacity;
        while (true) {
            int i4 = i2 % i3;
            if (!this.used[i4]) {
                return false;
            }
            if (this.keys[i4] == i) {
                return true;
            }
            i2 = i4 + this.step;
            i3 = this.capacity;
        }
    }

    private void init(int i) {
        this.capacity = PrimeFinder.findNextPrime(i);
        this.step = Math.max(1, PrimeFinder.findPrevPrime(i / 3));
        double d = (double) this.capacity;
        Double.isNaN(d);
        this.limit = (int) (d * 0.75d);
        clear();
        this.keys = new int[this.capacity];
        this.values = new long[this.capacity];
    }

    private void resize(int i) {
        int i2;
        int i3 = this.size;
        boolean[] zArr = this.used;
        int[] iArr = this.keys;
        long[] jArr = this.values;
        init(i);
        for (int i4 = 0; i4 < zArr.length; i4++) {
            if (zArr[i4]) {
                int i5 = iArr[i4];
                int i6 = Integer.MAX_VALUE & i5;
                int i7 = this.capacity;
                while (true) {
                    i2 = i6 % i7;
                    if (!this.used[i2]) {
                        break;
                    }
                    i6 = i2 + this.step;
                    i7 = this.capacity;
                }
                this.used[i2] = true;
                this.keys[i2] = i5;
                this.values[i2] = jArr[i4];
            }
        }
        this.size = i3;
    }

    public final long get(int i) {
        int i2 = Integer.MAX_VALUE & i;
        int i3 = this.capacity;
        while (true) {
            int i4 = i2 % i3;
            if (!this.used[i4]) {
                throw noSuchElementException;
            } else if (this.keys[i4] == i) {
                return this.values[i4];
            } else {
                i2 = i4 + this.step;
                i3 = this.capacity;
            }
        }
    }

    public final boolean remove(int i) {
        int i2;
        int i3 = i & Integer.MAX_VALUE;
        int i4 = this.capacity;
        while (true) {
            int i5 = i3 % i4;
            if (!this.used[i5]) {
                return false;
            }
            if (this.keys[i5] == i) {
                this.used[i5] = false;
                this.size--;
                int i6 = i5 + this.step;
                int i7 = this.capacity;
                while (true) {
                    int i8 = i6 % i7;
                    if (!this.used[i8]) {
                        return true;
                    }
                    int i9 = this.keys[i8];
                    this.used[i8] = false;
                    int i10 = i9 & Integer.MAX_VALUE;
                    int i11 = this.capacity;
                    while (true) {
                        i2 = i10 % i11;
                        if (!this.used[i2]) {
                            break;
                        }
                        i10 = i2 + this.step;
                        i11 = this.capacity;
                    }
                    this.used[i2] = true;
                    this.keys[i2] = i9;
                    long[] jArr = this.values;
                    jArr[i2] = jArr[i8];
                    i6 = i8 + this.step;
                    i7 = this.capacity;
                }
            } else {
                i3 = i5 + this.step;
                i4 = this.capacity;
            }
        }
    }

    public final boolean put(int i, long j) {
        if (this.size == this.limit) {
            resize(this.capacity << 1);
        }
        int i2 = Integer.MAX_VALUE & i;
        int i3 = this.capacity;
        while (true) {
            int i4 = i2 % i3;
            if (!this.used[i4]) {
                this.used[i4] = true;
                this.keys[i4] = i;
                this.values[i4] = j;
                this.size++;
                return false;
            } else if (this.keys[i4] == i) {
                this.values[i4] = j;
                return true;
            } else {
                i2 = i4 + this.step;
                i3 = this.capacity;
            }
        }
    }
}
