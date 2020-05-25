package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class awm extends awh<Boolean> implements ayh<Boolean>, azw, RandomAccess {

    /* renamed from: a */
    private static final awm f41465a;

    /* renamed from: b */
    private boolean[] f41466b;

    /* renamed from: c */
    private int f41467c;

    awm() {
        this(new boolean[10], 0);
    }

    private awm(boolean[] zArr, int i) {
        this.f41466b = zArr;
        this.f41467c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo29594c();
        if (i2 >= i) {
            boolean[] zArr = this.f41466b;
            System.arraycopy(zArr, i2, zArr, i, this.f41467c - i2);
            this.f41467c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awm)) {
            return super.equals(obj);
        }
        awm awm = (awm) obj;
        if (this.f41467c != awm.f41467c) {
            return false;
        }
        boolean[] zArr = awm.f41466b;
        for (int i = 0; i < this.f41467c; i++) {
            if (this.f41466b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41467c; i2++) {
            i = (i * 31) + ayb.m34767a(this.f41466b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f41467c;
    }

    /* renamed from: a */
    public final void mo29604a(boolean z) {
        m34285a(this.f41467c, z);
    }

    /* renamed from: a */
    private final void m34285a(int i, boolean z) {
        mo29594c();
        if (i < 0 || i > this.f41467c) {
            throw new IndexOutOfBoundsException(m34287c(i));
        }
        if (this.f41467c < this.f41466b.length) {
            boolean[] zArr = this.f41466b;
            System.arraycopy(zArr, i, zArr, i + 1, this.f41467c - i);
        } else {
            boolean[] zArr2 = new boolean[(((this.f41467c * 3) / 2) + 1)];
            System.arraycopy(this.f41466b, 0, zArr2, 0, i);
            System.arraycopy(this.f41466b, i, zArr2, i + 1, this.f41467c - i);
            this.f41466b = zArr2;
        }
        this.f41466b[i] = z;
        this.f41467c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo29594c();
        ayb.m34768a(collection);
        if (!(collection instanceof awm)) {
            return super.addAll(collection);
        }
        awm awm = (awm) collection;
        if (awm.f41467c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41467c >= awm.f41467c) {
            int i = this.f41467c + awm.f41467c;
            if (i > this.f41466b.length) {
                this.f41466b = Arrays.copyOf(this.f41466b, i);
            }
            System.arraycopy(awm.f41466b, 0, this.f41466b, this.f41467c, awm.f41467c);
            this.f41467c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo29594c();
        for (int i = 0; i < this.f41467c; i++) {
            if (obj.equals(Boolean.valueOf(this.f41466b[i]))) {
                System.arraycopy(this.f41466b, i + 1, this.f41466b, i, (this.f41467c - i) - 1);
                this.f41467c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m34286b(int i) {
        if (i < 0 || i >= this.f41467c) {
            throw new IndexOutOfBoundsException(m34287c(i));
        }
    }

    /* renamed from: c */
    private final String m34287c(int i) {
        int i2 = this.f41467c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo29594c();
        m34286b(i);
        boolean z = this.f41466b[i];
        this.f41466b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        mo29594c();
        m34286b(i);
        boolean z = this.f41466b[i];
        if (i < this.f41467c - 1) {
            System.arraycopy(this.f41466b, i + 1, this.f41466b, i, (this.f41467c - i) - 1);
        }
        this.f41467c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m34285a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayh mo29603a(int i) {
        if (i >= this.f41467c) {
            return new awm(Arrays.copyOf(this.f41466b, i), this.f41467c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m34286b(i);
        return Boolean.valueOf(this.f41466b[i]);
    }

    static {
        awm awm = new awm();
        f41465a = awm;
        awm.mo29593b();
    }
}
