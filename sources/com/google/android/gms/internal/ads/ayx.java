package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class ayx extends awh<Long> implements ayh<Long>, azw, RandomAccess {

    /* renamed from: a */
    private static final ayx f41650a;

    /* renamed from: b */
    private long[] f41651b;

    /* renamed from: c */
    private int f41652c;

    ayx() {
        this(new long[10], 0);
    }

    private ayx(long[] jArr, int i) {
        this.f41651b = jArr;
        this.f41652c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo29594c();
        if (i2 >= i) {
            long[] jArr = this.f41651b;
            System.arraycopy(jArr, i2, jArr, i, this.f41652c - i2);
            this.f41652c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayx)) {
            return super.equals(obj);
        }
        ayx ayx = (ayx) obj;
        if (this.f41652c != ayx.f41652c) {
            return false;
        }
        long[] jArr = ayx.f41651b;
        for (int i = 0; i < this.f41652c; i++) {
            if (this.f41651b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41652c; i2++) {
            i = (i * 31) + ayb.m34766a(this.f41651b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo29865b(int i) {
        m34819c(i);
        return this.f41651b[i];
    }

    public final int size() {
        return this.f41652c;
    }

    /* renamed from: a */
    public final void mo29864a(long j) {
        m34818a(this.f41652c, j);
    }

    /* renamed from: a */
    private final void m34818a(int i, long j) {
        mo29594c();
        if (i < 0 || i > this.f41652c) {
            throw new IndexOutOfBoundsException(m34820d(i));
        }
        if (this.f41652c < this.f41651b.length) {
            long[] jArr = this.f41651b;
            System.arraycopy(jArr, i, jArr, i + 1, this.f41652c - i);
        } else {
            long[] jArr2 = new long[(((this.f41652c * 3) / 2) + 1)];
            System.arraycopy(this.f41651b, 0, jArr2, 0, i);
            System.arraycopy(this.f41651b, i, jArr2, i + 1, this.f41652c - i);
            this.f41651b = jArr2;
        }
        this.f41651b[i] = j;
        this.f41652c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo29594c();
        ayb.m34768a(collection);
        if (!(collection instanceof ayx)) {
            return super.addAll(collection);
        }
        ayx ayx = (ayx) collection;
        if (ayx.f41652c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41652c >= ayx.f41652c) {
            int i = this.f41652c + ayx.f41652c;
            if (i > this.f41651b.length) {
                this.f41651b = Arrays.copyOf(this.f41651b, i);
            }
            System.arraycopy(ayx.f41651b, 0, this.f41651b, this.f41652c, ayx.f41652c);
            this.f41652c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo29594c();
        for (int i = 0; i < this.f41652c; i++) {
            if (obj.equals(Long.valueOf(this.f41651b[i]))) {
                System.arraycopy(this.f41651b, i + 1, this.f41651b, i, (this.f41652c - i) - 1);
                this.f41652c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m34819c(int i) {
        if (i < 0 || i >= this.f41652c) {
            throw new IndexOutOfBoundsException(m34820d(i));
        }
    }

    /* renamed from: d */
    private final String m34820d(int i) {
        int i2 = this.f41652c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo29594c();
        m34819c(i);
        long j = this.f41651b[i];
        this.f41651b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo29594c();
        m34819c(i);
        long j = this.f41651b[i];
        if (i < this.f41652c - 1) {
            System.arraycopy(this.f41651b, i + 1, this.f41651b, i, (this.f41652c - i) - 1);
        }
        this.f41652c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m34818a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayh mo29603a(int i) {
        if (i >= this.f41652c) {
            return new ayx(Arrays.copyOf(this.f41651b, i), this.f41652c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo29865b(i));
    }

    static {
        ayx ayx = new ayx();
        f41650a = ayx;
        ayx.mo29593b();
    }
}
