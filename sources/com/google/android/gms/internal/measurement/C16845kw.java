package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kw */
public final class C16845kw implements Cloneable {

    /* renamed from: a */
    static final C16846kx f47293a = new C16846kx();

    /* renamed from: b */
    int[] f47294b;

    /* renamed from: c */
    C16846kx[] f47295c;

    /* renamed from: d */
    public int f47296d;

    C16845kw() {
        this(10);
    }

    private C16845kw(int i) {
        int b = m40889b(i);
        this.f47294b = new int[b];
        this.f47295c = new C16846kx[b];
        this.f47296d = 0;
    }

    /* renamed from: a */
    public final boolean mo32460a() {
        return this.f47296d == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16846kx mo32459a(int i) {
        return this.f47295c[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16845kw)) {
            return false;
        }
        C16845kw kwVar = (C16845kw) obj;
        if (this.f47296d != kwVar.f47296d) {
            return false;
        }
        int[] iArr = this.f47294b;
        int[] iArr2 = kwVar.f47294b;
        int i = this.f47296d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C16846kx[] kxVarArr = this.f47295c;
            C16846kx[] kxVarArr2 = kwVar.f47295c;
            int i3 = this.f47296d;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!kxVarArr[i4].equals(kxVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f47296d; i2++) {
            i = (((i * 31) + this.f47294b[i2]) * 31) + this.f47295c[i2].hashCode();
        }
        return i;
    }

    /* renamed from: b */
    static int m40889b(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo32461c(int i) {
        int i2 = this.f47296d - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f47294b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f47296d;
        C16845kw kwVar = new C16845kw(i);
        System.arraycopy(this.f47294b, 0, kwVar.f47294b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f47295c[i2] != null) {
                kwVar.f47295c[i2] = (C16846kx) this.f47295c[i2].clone();
            }
        }
        kwVar.f47296d = i;
        return kwVar;
    }
}
