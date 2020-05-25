package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class axw extends awh<Float> implements ayh<Float>, azw, RandomAccess {

    /* renamed from: a */
    private static final axw f41599a;

    /* renamed from: b */
    private float[] f41600b;

    /* renamed from: c */
    private int f41601c;

    axw() {
        this(new float[10], 0);
    }

    private axw(float[] fArr, int i) {
        this.f41600b = fArr;
        this.f41601c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo29594c();
        if (i2 >= i) {
            float[] fArr = this.f41600b;
            System.arraycopy(fArr, i2, fArr, i, this.f41601c - i2);
            this.f41601c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axw)) {
            return super.equals(obj);
        }
        axw axw = (axw) obj;
        if (this.f41601c != axw.f41601c) {
            return false;
        }
        float[] fArr = axw.f41600b;
        for (int i = 0; i < this.f41601c; i++) {
            if (Float.floatToIntBits(this.f41600b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41601c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f41600b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f41601c;
    }

    /* renamed from: a */
    public final void mo29813a(float f) {
        m34697a(this.f41601c, f);
    }

    /* renamed from: a */
    private final void m34697a(int i, float f) {
        mo29594c();
        if (i < 0 || i > this.f41601c) {
            throw new IndexOutOfBoundsException(m34699c(i));
        }
        if (this.f41601c < this.f41600b.length) {
            float[] fArr = this.f41600b;
            System.arraycopy(fArr, i, fArr, i + 1, this.f41601c - i);
        } else {
            float[] fArr2 = new float[(((this.f41601c * 3) / 2) + 1)];
            System.arraycopy(this.f41600b, 0, fArr2, 0, i);
            System.arraycopy(this.f41600b, i, fArr2, i + 1, this.f41601c - i);
            this.f41600b = fArr2;
        }
        this.f41600b[i] = f;
        this.f41601c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo29594c();
        ayb.m34768a(collection);
        if (!(collection instanceof axw)) {
            return super.addAll(collection);
        }
        axw axw = (axw) collection;
        if (axw.f41601c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41601c >= axw.f41601c) {
            int i = this.f41601c + axw.f41601c;
            if (i > this.f41600b.length) {
                this.f41600b = Arrays.copyOf(this.f41600b, i);
            }
            System.arraycopy(axw.f41600b, 0, this.f41600b, this.f41601c, axw.f41601c);
            this.f41601c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo29594c();
        for (int i = 0; i < this.f41601c; i++) {
            if (obj.equals(Float.valueOf(this.f41600b[i]))) {
                System.arraycopy(this.f41600b, i + 1, this.f41600b, i, (this.f41601c - i) - 1);
                this.f41601c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m34698b(int i) {
        if (i < 0 || i >= this.f41601c) {
            throw new IndexOutOfBoundsException(m34699c(i));
        }
    }

    /* renamed from: c */
    private final String m34699c(int i) {
        int i2 = this.f41601c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo29594c();
        m34698b(i);
        float f = this.f41600b[i];
        this.f41600b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        mo29594c();
        m34698b(i);
        float f = this.f41600b[i];
        if (i < this.f41601c - 1) {
            System.arraycopy(this.f41600b, i + 1, this.f41600b, i, (this.f41601c - i) - 1);
        }
        this.f41601c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m34697a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayh mo29603a(int i) {
        if (i >= this.f41601c) {
            return new axw(Arrays.copyOf(this.f41600b, i), this.f41601c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m34698b(i);
        return Float.valueOf(this.f41600b[i]);
    }

    static {
        axw axw = new axw();
        f41599a = axw;
        axw.mo29593b();
    }
}
