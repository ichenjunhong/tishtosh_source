package org.eclipse.mat.collect;

import java.util.Arrays;

public final class ArrayLong {
    long[] elements;
    int size;

    public final void clear() {
        this.size = 0;
    }

    public final int size() {
        return this.size;
    }

    public ArrayLong() {
        this(10);
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final IteratorLong iterator() {
        return new IteratorLong() {
            int index;

            public boolean hasNext() {
                if (this.index < ArrayLong.this.size) {
                    return true;
                }
                return false;
            }

            public long next() {
                long[] jArr = ArrayLong.this.elements;
                int i = this.index;
                this.index = i + 1;
                return jArr[i];
            }
        };
    }

    public final long firstElement() {
        if (this.size != 0) {
            return this.elements[0];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final long lastElement() {
        return this.elements[this.size - 1];
    }

    public final void sort() {
        Arrays.sort(this.elements, 0, this.size);
    }

    public final long[] toArray() {
        long[] jArr = new long[this.size];
        System.arraycopy(this.elements, 0, jArr, 0, this.size);
        return jArr;
    }

    public ArrayLong(int i) {
        this.elements = new long[i];
    }

    public ArrayLong(ArrayLong arrayLong) {
        this(arrayLong.size);
        System.arraycopy(arrayLong.elements, 0, this.elements, 0, arrayLong.size);
        this.size = arrayLong.size;
    }

    private void ensureCapacity(int i) {
        int length = this.elements.length;
        if (i > length) {
            long[] jArr = this.elements;
            int i2 = ((length * 3) / 2) + 1;
            if (i2 >= i) {
                i = i2;
            }
            this.elements = new long[i];
            System.arraycopy(jArr, 0, this.elements, 0, this.size);
        }
    }

    public final void add(long j) {
        ensureCapacity(this.size + 1);
        long[] jArr = this.elements;
        int i = this.size;
        this.size = i + 1;
        jArr[i] = j;
    }

    public final void addAll(ArrayLong arrayLong) {
        ensureCapacity(this.size + arrayLong.size);
        System.arraycopy(arrayLong.elements, 0, this.elements, this.size, arrayLong.size);
        this.size += arrayLong.size;
    }

    public final long get(int i) {
        if (i >= 0 && i < this.size) {
            return this.elements[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public ArrayLong(long[] jArr) {
        this(jArr.length);
        System.arraycopy(jArr, 0, this.elements, 0, jArr.length);
        this.size = jArr.length;
    }

    public final void addAll(long[] jArr) {
        ensureCapacity(this.size + jArr.length);
        System.arraycopy(jArr, 0, this.elements, this.size, jArr.length);
        this.size += jArr.length;
    }

    public final long set(int i, long j) {
        if (i < 0 || i >= this.size) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        long j2 = this.elements[i];
        this.elements[i] = j;
        return j2;
    }
}
