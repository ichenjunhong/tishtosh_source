package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.gm */
final class C16717gm extends C16687fo<Double> implements C16747hj<Double>, C16787iw, RandomAccess {

    /* renamed from: a */
    private static final C16717gm f46990a;

    /* renamed from: b */
    private double[] f46991b;

    /* renamed from: c */
    private int f46992c;

    C16717gm() {
        this(new double[10], 0);
    }

    private C16717gm(double[] dArr, int i) {
        this.f46991b = dArr;
        this.f46992c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo31999c();
        if (i2 >= i) {
            double[] dArr = this.f46991b;
            System.arraycopy(dArr, i2, dArr, i, this.f46992c - i2);
            this.f46992c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16717gm)) {
            return super.equals(obj);
        }
        C16717gm gmVar = (C16717gm) obj;
        if (this.f46992c != gmVar.f46992c) {
            return false;
        }
        double[] dArr = gmVar.f46991b;
        for (int i = 0; i < this.f46992c; i++) {
            if (Double.doubleToLongBits(this.f46991b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46992c; i2++) {
            i = (i * 31) + C16743hf.m40312a(Double.doubleToLongBits(this.f46991b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f46992c;
    }

    /* renamed from: a */
    public final void mo32185a(double d) {
        m40206a(this.f46992c, d);
    }

    /* renamed from: a */
    private final void m40206a(int i, double d) {
        mo31999c();
        if (i < 0 || i > this.f46992c) {
            throw new IndexOutOfBoundsException(m40208c(i));
        }
        if (this.f46992c < this.f46991b.length) {
            double[] dArr = this.f46991b;
            System.arraycopy(dArr, i, dArr, i + 1, this.f46992c - i);
        } else {
            double[] dArr2 = new double[(((this.f46992c * 3) / 2) + 1)];
            System.arraycopy(this.f46991b, 0, dArr2, 0, i);
            System.arraycopy(this.f46991b, i, dArr2, i + 1, this.f46992c - i);
            this.f46991b = dArr2;
        }
        this.f46991b[i] = d;
        this.f46992c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo31999c();
        C16743hf.m40314a(collection);
        if (!(collection instanceof C16717gm)) {
            return super.addAll(collection);
        }
        C16717gm gmVar = (C16717gm) collection;
        if (gmVar.f46992c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f46992c >= gmVar.f46992c) {
            int i = this.f46992c + gmVar.f46992c;
            if (i > this.f46991b.length) {
                this.f46991b = Arrays.copyOf(this.f46991b, i);
            }
            System.arraycopy(gmVar.f46991b, 0, this.f46991b, this.f46992c, gmVar.f46992c);
            this.f46992c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo31999c();
        for (int i = 0; i < this.f46992c; i++) {
            if (obj.equals(Double.valueOf(this.f46991b[i]))) {
                System.arraycopy(this.f46991b, i + 1, this.f46991b, i, (this.f46992c - i) - 1);
                this.f46992c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m40207b(int i) {
        if (i < 0 || i >= this.f46992c) {
            throw new IndexOutOfBoundsException(m40208c(i));
        }
    }

    /* renamed from: c */
    private final String m40208c(int i) {
        int i2 = this.f46992c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo31999c();
        m40207b(i);
        double d = this.f46991b[i];
        this.f46991b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        mo31999c();
        m40207b(i);
        double d = this.f46991b[i];
        if (i < this.f46992c - 1) {
            System.arraycopy(this.f46991b, i + 1, this.f46991b, i, (this.f46992c - i) - 1);
        }
        this.f46992c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m40206a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16747hj mo32008a(int i) {
        if (i >= this.f46992c) {
            return new C16717gm(Arrays.copyOf(this.f46991b, i), this.f46992c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m40207b(i);
        return Double.valueOf(this.f46991b[i]);
    }

    static {
        C16717gm gmVar = new C16717gm();
        f46990a = gmVar;
        gmVar.mo31998b();
    }
}
