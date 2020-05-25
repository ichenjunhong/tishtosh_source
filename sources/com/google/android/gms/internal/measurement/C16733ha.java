package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ha */
final class C16733ha extends C16687fo<Float> implements C16747hj<Float>, C16787iw, RandomAccess {

    /* renamed from: a */
    private static final C16733ha f47080a;

    /* renamed from: b */
    private float[] f47081b;

    /* renamed from: c */
    private int f47082c;

    C16733ha() {
        this(new float[10], 0);
    }

    private C16733ha(float[] fArr, int i) {
        this.f47081b = fArr;
        this.f47082c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo31999c();
        if (i2 >= i) {
            float[] fArr = this.f47081b;
            System.arraycopy(fArr, i2, fArr, i, this.f47082c - i2);
            this.f47082c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16733ha)) {
            return super.equals(obj);
        }
        C16733ha haVar = (C16733ha) obj;
        if (this.f47082c != haVar.f47082c) {
            return false;
        }
        float[] fArr = haVar.f47081b;
        for (int i = 0; i < this.f47082c; i++) {
            if (Float.floatToIntBits(this.f47081b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f47082c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f47081b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f47082c;
    }

    /* renamed from: a */
    public final void mo32219a(float f) {
        m40267a(this.f47082c, f);
    }

    /* renamed from: a */
    private final void m40267a(int i, float f) {
        mo31999c();
        if (i < 0 || i > this.f47082c) {
            throw new IndexOutOfBoundsException(m40269c(i));
        }
        if (this.f47082c < this.f47081b.length) {
            float[] fArr = this.f47081b;
            System.arraycopy(fArr, i, fArr, i + 1, this.f47082c - i);
        } else {
            float[] fArr2 = new float[(((this.f47082c * 3) / 2) + 1)];
            System.arraycopy(this.f47081b, 0, fArr2, 0, i);
            System.arraycopy(this.f47081b, i, fArr2, i + 1, this.f47082c - i);
            this.f47081b = fArr2;
        }
        this.f47081b[i] = f;
        this.f47082c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo31999c();
        C16743hf.m40314a(collection);
        if (!(collection instanceof C16733ha)) {
            return super.addAll(collection);
        }
        C16733ha haVar = (C16733ha) collection;
        if (haVar.f47082c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f47082c >= haVar.f47082c) {
            int i = this.f47082c + haVar.f47082c;
            if (i > this.f47081b.length) {
                this.f47081b = Arrays.copyOf(this.f47081b, i);
            }
            System.arraycopy(haVar.f47081b, 0, this.f47081b, this.f47082c, haVar.f47082c);
            this.f47082c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo31999c();
        for (int i = 0; i < this.f47082c; i++) {
            if (obj.equals(Float.valueOf(this.f47081b[i]))) {
                System.arraycopy(this.f47081b, i + 1, this.f47081b, i, (this.f47082c - i) - 1);
                this.f47082c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m40268b(int i) {
        if (i < 0 || i >= this.f47082c) {
            throw new IndexOutOfBoundsException(m40269c(i));
        }
    }

    /* renamed from: c */
    private final String m40269c(int i) {
        int i2 = this.f47082c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo31999c();
        m40268b(i);
        float f = this.f47081b[i];
        this.f47081b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        mo31999c();
        m40268b(i);
        float f = this.f47081b[i];
        if (i < this.f47082c - 1) {
            System.arraycopy(this.f47081b, i + 1, this.f47081b, i, (this.f47082c - i) - 1);
        }
        this.f47082c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m40267a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16747hj mo32008a(int i) {
        if (i >= this.f47082c) {
            return new C16733ha(Arrays.copyOf(this.f47081b, i), this.f47082c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m40268b(i);
        return Float.valueOf(this.f47081b[i]);
    }

    static {
        C16733ha haVar = new C16733ha();
        f47080a = haVar;
        haVar.mo31998b();
    }
}
