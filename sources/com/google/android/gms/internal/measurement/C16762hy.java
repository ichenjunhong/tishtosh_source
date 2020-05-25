package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hy */
final class C16762hy extends C16687fo<Long> implements C16747hj<Long>, C16787iw, RandomAccess {

    /* renamed from: a */
    private static final C16762hy f47129a;

    /* renamed from: b */
    private long[] f47130b;

    /* renamed from: c */
    private int f47131c;

    C16762hy() {
        this(new long[10], 0);
    }

    private C16762hy(long[] jArr, int i) {
        this.f47130b = jArr;
        this.f47131c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo31999c();
        if (i2 >= i) {
            long[] jArr = this.f47130b;
            System.arraycopy(jArr, i2, jArr, i, this.f47131c - i2);
            this.f47131c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16762hy)) {
            return super.equals(obj);
        }
        C16762hy hyVar = (C16762hy) obj;
        if (this.f47131c != hyVar.f47131c) {
            return false;
        }
        long[] jArr = hyVar.f47130b;
        for (int i = 0; i < this.f47131c; i++) {
            if (this.f47130b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f47131c; i2++) {
            i = (i * 31) + C16743hf.m40312a(this.f47130b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo32269b(int i) {
        m40360c(i);
        return this.f47130b[i];
    }

    public final int size() {
        return this.f47131c;
    }

    /* renamed from: a */
    public final void mo32268a(long j) {
        m40359a(this.f47131c, j);
    }

    /* renamed from: a */
    private final void m40359a(int i, long j) {
        mo31999c();
        if (i < 0 || i > this.f47131c) {
            throw new IndexOutOfBoundsException(m40361d(i));
        }
        if (this.f47131c < this.f47130b.length) {
            long[] jArr = this.f47130b;
            System.arraycopy(jArr, i, jArr, i + 1, this.f47131c - i);
        } else {
            long[] jArr2 = new long[(((this.f47131c * 3) / 2) + 1)];
            System.arraycopy(this.f47130b, 0, jArr2, 0, i);
            System.arraycopy(this.f47130b, i, jArr2, i + 1, this.f47131c - i);
            this.f47130b = jArr2;
        }
        this.f47130b[i] = j;
        this.f47131c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo31999c();
        C16743hf.m40314a(collection);
        if (!(collection instanceof C16762hy)) {
            return super.addAll(collection);
        }
        C16762hy hyVar = (C16762hy) collection;
        if (hyVar.f47131c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f47131c >= hyVar.f47131c) {
            int i = this.f47131c + hyVar.f47131c;
            if (i > this.f47130b.length) {
                this.f47130b = Arrays.copyOf(this.f47130b, i);
            }
            System.arraycopy(hyVar.f47130b, 0, this.f47130b, this.f47131c, hyVar.f47131c);
            this.f47131c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo31999c();
        for (int i = 0; i < this.f47131c; i++) {
            if (obj.equals(Long.valueOf(this.f47130b[i]))) {
                System.arraycopy(this.f47130b, i + 1, this.f47130b, i, (this.f47131c - i) - 1);
                this.f47131c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m40360c(int i) {
        if (i < 0 || i >= this.f47131c) {
            throw new IndexOutOfBoundsException(m40361d(i));
        }
    }

    /* renamed from: d */
    private final String m40361d(int i) {
        int i2 = this.f47131c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo31999c();
        m40360c(i);
        long j = this.f47130b[i];
        this.f47130b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo31999c();
        m40360c(i);
        long j = this.f47130b[i];
        if (i < this.f47131c - 1) {
            System.arraycopy(this.f47130b, i + 1, this.f47130b, i, (this.f47131c - i) - 1);
        }
        this.f47131c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m40359a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16747hj mo32008a(int i) {
        if (i >= this.f47131c) {
            return new C16762hy(Arrays.copyOf(this.f47130b, i), this.f47131c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo32269b(i));
    }

    static {
        C16762hy hyVar = new C16762hy();
        f47129a = hyVar;
        hyVar.mo31998b();
    }
}
