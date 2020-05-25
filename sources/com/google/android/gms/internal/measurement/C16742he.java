package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.he */
final class C16742he extends C16687fo<Integer> implements C16747hj<Integer>, C16787iw, RandomAccess {

    /* renamed from: a */
    private static final C16742he f47104a;

    /* renamed from: b */
    private int[] f47105b;

    /* renamed from: c */
    private int f47106c;

    C16742he() {
        this(new int[10], 0);
    }

    private C16742he(int[] iArr, int i) {
        this.f47105b = iArr;
        this.f47106c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo31999c();
        if (i2 >= i) {
            int[] iArr = this.f47105b;
            System.arraycopy(iArr, i2, iArr, i, this.f47106c - i2);
            this.f47106c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16742he)) {
            return super.equals(obj);
        }
        C16742he heVar = (C16742he) obj;
        if (this.f47106c != heVar.f47106c) {
            return false;
        }
        int[] iArr = heVar.f47105b;
        for (int i = 0; i < this.f47106c; i++) {
            if (this.f47105b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f47106c; i2++) {
            i = (i * 31) + this.f47105b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final int mo32241b(int i) {
        m40306d(i);
        return this.f47105b[i];
    }

    public final int size() {
        return this.f47106c;
    }

    /* renamed from: c */
    public final void mo32242c(int i) {
        m40305a(this.f47106c, i);
    }

    /* renamed from: a */
    private final void m40305a(int i, int i2) {
        mo31999c();
        if (i < 0 || i > this.f47106c) {
            throw new IndexOutOfBoundsException(m40307e(i));
        }
        if (this.f47106c < this.f47105b.length) {
            int[] iArr = this.f47105b;
            System.arraycopy(iArr, i, iArr, i + 1, this.f47106c - i);
        } else {
            int[] iArr2 = new int[(((this.f47106c * 3) / 2) + 1)];
            System.arraycopy(this.f47105b, 0, iArr2, 0, i);
            System.arraycopy(this.f47105b, i, iArr2, i + 1, this.f47106c - i);
            this.f47105b = iArr2;
        }
        this.f47105b[i] = i2;
        this.f47106c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo31999c();
        C16743hf.m40314a(collection);
        if (!(collection instanceof C16742he)) {
            return super.addAll(collection);
        }
        C16742he heVar = (C16742he) collection;
        if (heVar.f47106c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f47106c >= heVar.f47106c) {
            int i = this.f47106c + heVar.f47106c;
            if (i > this.f47105b.length) {
                this.f47105b = Arrays.copyOf(this.f47105b, i);
            }
            System.arraycopy(heVar.f47105b, 0, this.f47105b, this.f47106c, heVar.f47106c);
            this.f47106c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo31999c();
        for (int i = 0; i < this.f47106c; i++) {
            if (obj.equals(Integer.valueOf(this.f47105b[i]))) {
                System.arraycopy(this.f47105b, i + 1, this.f47105b, i, (this.f47106c - i) - 1);
                this.f47106c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m40306d(int i) {
        if (i < 0 || i >= this.f47106c) {
            throw new IndexOutOfBoundsException(m40307e(i));
        }
    }

    /* renamed from: e */
    private final String m40307e(int i) {
        int i2 = this.f47106c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo31999c();
        m40306d(i);
        int i2 = this.f47105b[i];
        this.f47105b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        mo31999c();
        m40306d(i);
        int i2 = this.f47105b[i];
        if (i < this.f47106c - 1) {
            System.arraycopy(this.f47105b, i + 1, this.f47105b, i, (this.f47106c - i) - 1);
        }
        this.f47106c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m40305a(i, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16747hj mo32008a(int i) {
        if (i >= this.f47106c) {
            return new C16742he(Arrays.copyOf(this.f47105b, i), this.f47106c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo32241b(i));
    }

    static {
        C16742he heVar = new C16742he();
        f47104a = heVar;
        heVar.mo31998b();
    }
}
