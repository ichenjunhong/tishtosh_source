package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class axi extends awh<Double> implements ayh<Double>, azw, RandomAccess {

    /* renamed from: a */
    private static final axi f41515a;

    /* renamed from: b */
    private double[] f41516b;

    /* renamed from: c */
    private int f41517c;

    axi() {
        this(new double[10], 0);
    }

    private axi(double[] dArr, int i) {
        this.f41516b = dArr;
        this.f41517c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo29594c();
        if (i2 >= i) {
            double[] dArr = this.f41516b;
            System.arraycopy(dArr, i2, dArr, i, this.f41517c - i2);
            this.f41517c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axi)) {
            return super.equals(obj);
        }
        axi axi = (axi) obj;
        if (this.f41517c != axi.f41517c) {
            return false;
        }
        double[] dArr = axi.f41516b;
        for (int i = 0; i < this.f41517c; i++) {
            if (Double.doubleToLongBits(this.f41516b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41517c; i2++) {
            i = (i * 31) + ayb.m34766a(Double.doubleToLongBits(this.f41516b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f41517c;
    }

    /* renamed from: a */
    public final void mo29780a(double d) {
        m34636a(this.f41517c, d);
    }

    /* renamed from: a */
    private final void m34636a(int i, double d) {
        mo29594c();
        if (i < 0 || i > this.f41517c) {
            throw new IndexOutOfBoundsException(m34638c(i));
        }
        if (this.f41517c < this.f41516b.length) {
            double[] dArr = this.f41516b;
            System.arraycopy(dArr, i, dArr, i + 1, this.f41517c - i);
        } else {
            double[] dArr2 = new double[(((this.f41517c * 3) / 2) + 1)];
            System.arraycopy(this.f41516b, 0, dArr2, 0, i);
            System.arraycopy(this.f41516b, i, dArr2, i + 1, this.f41517c - i);
            this.f41516b = dArr2;
        }
        this.f41516b[i] = d;
        this.f41517c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo29594c();
        ayb.m34768a(collection);
        if (!(collection instanceof axi)) {
            return super.addAll(collection);
        }
        axi axi = (axi) collection;
        if (axi.f41517c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41517c >= axi.f41517c) {
            int i = this.f41517c + axi.f41517c;
            if (i > this.f41516b.length) {
                this.f41516b = Arrays.copyOf(this.f41516b, i);
            }
            System.arraycopy(axi.f41516b, 0, this.f41516b, this.f41517c, axi.f41517c);
            this.f41517c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo29594c();
        for (int i = 0; i < this.f41517c; i++) {
            if (obj.equals(Double.valueOf(this.f41516b[i]))) {
                System.arraycopy(this.f41516b, i + 1, this.f41516b, i, (this.f41517c - i) - 1);
                this.f41517c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m34637b(int i) {
        if (i < 0 || i >= this.f41517c) {
            throw new IndexOutOfBoundsException(m34638c(i));
        }
    }

    /* renamed from: c */
    private final String m34638c(int i) {
        int i2 = this.f41517c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo29594c();
        m34637b(i);
        double d = this.f41516b[i];
        this.f41516b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        mo29594c();
        m34637b(i);
        double d = this.f41516b[i];
        if (i < this.f41517c - 1) {
            System.arraycopy(this.f41516b, i + 1, this.f41516b, i, (this.f41517c - i) - 1);
        }
        this.f41517c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m34636a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayh mo29603a(int i) {
        if (i >= this.f41517c) {
            return new axi(Arrays.copyOf(this.f41516b, i), this.f41517c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m34637b(i);
        return Double.valueOf(this.f41516b[i]);
    }

    static {
        axi axi = new axi();
        f41515a = axi;
        axi.mo29593b();
    }
}
