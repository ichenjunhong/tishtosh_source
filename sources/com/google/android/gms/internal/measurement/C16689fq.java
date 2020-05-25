package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fq */
final class C16689fq extends C16687fo<Boolean> implements C16747hj<Boolean>, C16787iw, RandomAccess {

    /* renamed from: a */
    private static final C16689fq f46932a;

    /* renamed from: b */
    private boolean[] f46933b;

    /* renamed from: c */
    private int f46934c;

    C16689fq() {
        this(new boolean[10], 0);
    }

    private C16689fq(boolean[] zArr, int i) {
        this.f46933b = zArr;
        this.f46934c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo31999c();
        if (i2 >= i) {
            boolean[] zArr = this.f46933b;
            System.arraycopy(zArr, i2, zArr, i, this.f46934c - i2);
            this.f46934c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16689fq)) {
            return super.equals(obj);
        }
        C16689fq fqVar = (C16689fq) obj;
        if (this.f46934c != fqVar.f46934c) {
            return false;
        }
        boolean[] zArr = fqVar.f46933b;
        for (int i = 0; i < this.f46934c; i++) {
            if (this.f46933b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46934c; i2++) {
            i = (i * 31) + C16743hf.m40313a(this.f46933b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f46934c;
    }

    /* renamed from: a */
    public final void mo32009a(boolean z) {
        m39859a(this.f46934c, z);
    }

    /* renamed from: a */
    private final void m39859a(int i, boolean z) {
        mo31999c();
        if (i < 0 || i > this.f46934c) {
            throw new IndexOutOfBoundsException(m39861c(i));
        }
        if (this.f46934c < this.f46933b.length) {
            boolean[] zArr = this.f46933b;
            System.arraycopy(zArr, i, zArr, i + 1, this.f46934c - i);
        } else {
            boolean[] zArr2 = new boolean[(((this.f46934c * 3) / 2) + 1)];
            System.arraycopy(this.f46933b, 0, zArr2, 0, i);
            System.arraycopy(this.f46933b, i, zArr2, i + 1, this.f46934c - i);
            this.f46933b = zArr2;
        }
        this.f46933b[i] = z;
        this.f46934c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo31999c();
        C16743hf.m40314a(collection);
        if (!(collection instanceof C16689fq)) {
            return super.addAll(collection);
        }
        C16689fq fqVar = (C16689fq) collection;
        if (fqVar.f46934c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f46934c >= fqVar.f46934c) {
            int i = this.f46934c + fqVar.f46934c;
            if (i > this.f46933b.length) {
                this.f46933b = Arrays.copyOf(this.f46933b, i);
            }
            System.arraycopy(fqVar.f46933b, 0, this.f46933b, this.f46934c, fqVar.f46934c);
            this.f46934c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo31999c();
        for (int i = 0; i < this.f46934c; i++) {
            if (obj.equals(Boolean.valueOf(this.f46933b[i]))) {
                System.arraycopy(this.f46933b, i + 1, this.f46933b, i, (this.f46934c - i) - 1);
                this.f46934c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m39860b(int i) {
        if (i < 0 || i >= this.f46934c) {
            throw new IndexOutOfBoundsException(m39861c(i));
        }
    }

    /* renamed from: c */
    private final String m39861c(int i) {
        int i2 = this.f46934c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo31999c();
        m39860b(i);
        boolean z = this.f46933b[i];
        this.f46933b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        mo31999c();
        m39860b(i);
        boolean z = this.f46933b[i];
        if (i < this.f46934c - 1) {
            System.arraycopy(this.f46933b, i + 1, this.f46933b, i, (this.f46934c - i) - 1);
        }
        this.f46934c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m39859a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16747hj mo32008a(int i) {
        if (i >= this.f46934c) {
            return new C16689fq(Arrays.copyOf(this.f46933b, i), this.f46934c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m39860b(i);
        return Boolean.valueOf(this.f46933b[i]);
    }

    static {
        C16689fq fqVar = new C16689fq();
        f46932a = fqVar;
        fqVar.mo31998b();
    }
}
