package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aya extends awh<Integer> implements ayf, azw, RandomAccess {

    /* renamed from: a */
    private static final aya f41624a;

    /* renamed from: b */
    private int[] f41625b;

    /* renamed from: c */
    private int f41626c;

    /* renamed from: d */
    public static aya m34758d() {
        return f41624a;
    }

    aya() {
        this(new int[10], 0);
    }

    private aya(int[] iArr, int i) {
        this.f41625b = iArr;
        this.f41626c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo29594c();
        if (i2 >= i) {
            int[] iArr = this.f41625b;
            System.arraycopy(iArr, i2, iArr, i, this.f41626c - i2);
            this.f41626c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aya)) {
            return super.equals(obj);
        }
        aya aya = (aya) obj;
        if (this.f41626c != aya.f41626c) {
            return false;
        }
        int[] iArr = aya.f41625b;
        for (int i = 0; i < this.f41626c; i++) {
            if (this.f41625b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41626c; i2++) {
            i = (i * 31) + this.f41625b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final ayf mo29603a(int i) {
        if (i >= this.f41626c) {
            return new aya(Arrays.copyOf(this.f41625b, i), this.f41626c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final int mo29834c(int i) {
        m34759e(i);
        return this.f41625b[i];
    }

    public final int size() {
        return this.f41626c;
    }

    /* renamed from: d */
    public final void mo29835d(int i) {
        m34757a(this.f41626c, i);
    }

    /* renamed from: a */
    private final void m34757a(int i, int i2) {
        mo29594c();
        if (i < 0 || i > this.f41626c) {
            throw new IndexOutOfBoundsException(m34760f(i));
        }
        if (this.f41626c < this.f41625b.length) {
            int[] iArr = this.f41625b;
            System.arraycopy(iArr, i, iArr, i + 1, this.f41626c - i);
        } else {
            int[] iArr2 = new int[(((this.f41626c * 3) / 2) + 1)];
            System.arraycopy(this.f41625b, 0, iArr2, 0, i);
            System.arraycopy(this.f41625b, i, iArr2, i + 1, this.f41626c - i);
            this.f41625b = iArr2;
        }
        this.f41625b[i] = i2;
        this.f41626c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo29594c();
        ayb.m34768a(collection);
        if (!(collection instanceof aya)) {
            return super.addAll(collection);
        }
        aya aya = (aya) collection;
        if (aya.f41626c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41626c >= aya.f41626c) {
            int i = this.f41626c + aya.f41626c;
            if (i > this.f41625b.length) {
                this.f41625b = Arrays.copyOf(this.f41625b, i);
            }
            System.arraycopy(aya.f41625b, 0, this.f41625b, this.f41626c, aya.f41626c);
            this.f41626c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo29594c();
        for (int i = 0; i < this.f41626c; i++) {
            if (obj.equals(Integer.valueOf(this.f41625b[i]))) {
                System.arraycopy(this.f41625b, i + 1, this.f41625b, i, (this.f41626c - i) - 1);
                this.f41626c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private final void m34759e(int i) {
        if (i < 0 || i >= this.f41626c) {
            throw new IndexOutOfBoundsException(m34760f(i));
        }
    }

    /* renamed from: f */
    private final String m34760f(int i) {
        int i2 = this.f41626c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo29594c();
        m34759e(i);
        int i2 = this.f41625b[i];
        this.f41625b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        mo29594c();
        m34759e(i);
        int i2 = this.f41625b[i];
        if (i < this.f41626c - 1) {
            System.arraycopy(this.f41625b, i + 1, this.f41625b, i, (this.f41626c - i) - 1);
        }
        this.f41626c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m34757a(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo29834c(i));
    }

    static {
        aya aya = new aya();
        f41624a = aya;
        aya.mo29593b();
    }
}
