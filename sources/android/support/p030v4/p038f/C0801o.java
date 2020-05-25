package android.support.p030v4.p038f;

/* renamed from: android.support.v4.f.o */
public final class C0801o<E> implements Cloneable {

    /* renamed from: a */
    public static final Object f2723a = new Object();

    /* renamed from: b */
    public boolean f2724b;

    /* renamed from: c */
    public int[] f2725c;

    /* renamed from: d */
    public Object[] f2726d;

    /* renamed from: e */
    public int f2727e;

    public C0801o() {
        this(10);
    }

    /* renamed from: c */
    public final int mo2596c() {
        if (this.f2724b) {
            mo2593b();
        }
        return this.f2727e;
    }

    /* renamed from: d */
    public final void mo2601d() {
        int i = this.f2727e;
        Object[] objArr = this.f2726d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2727e = 0;
        this.f2724b = false;
    }

    /* renamed from: a */
    public final C0801o<E> clone() {
        try {
            C0801o<E> oVar = (C0801o) super.clone();
            oVar.f2725c = (int[]) this.f2725c.clone();
            oVar.f2726d = (Object[]) this.f2726d.clone();
            return oVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public void mo2593b() {
        int i = this.f2727e;
        int[] iArr = this.f2725c;
        Object[] objArr = this.f2726d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2723a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2724b = false;
        this.f2727e = i2;
    }

    public final String toString() {
        if (mo2596c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2727e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2727e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2597c(i));
            sb.append('=');
            Object d = mo2600d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo2594b(int i) {
        m2280e(i);
    }

    /* renamed from: a */
    public final E mo2591a(int i) {
        return mo2592a(i, null);
    }

    /* renamed from: d */
    public final E mo2600d(int i) {
        if (this.f2724b) {
            mo2593b();
        }
        return this.f2726d[i];
    }

    public C0801o(int i) {
        if (i == 0) {
            this.f2725c = C0782d.f2679a;
            this.f2726d = C0782d.f2681c;
        } else {
            int a = C0782d.m2218a(i);
            this.f2725c = new int[a];
            this.f2726d = new Object[a];
        }
        this.f2727e = 0;
    }

    /* renamed from: e */
    private void m2280e(int i) {
        int a = C0782d.m2219a(this.f2725c, this.f2727e, i);
        if (a >= 0 && this.f2726d[a] != f2723a) {
            this.f2726d[a] = f2723a;
            this.f2724b = true;
        }
    }

    /* renamed from: c */
    public final int mo2597c(int i) {
        if (this.f2724b) {
            mo2593b();
        }
        return this.f2725c[i];
    }

    /* renamed from: a */
    public final E mo2592a(int i, E e) {
        int a = C0782d.m2219a(this.f2725c, this.f2727e, i);
        if (a < 0 || this.f2726d[a] == f2723a) {
            return e;
        }
        return this.f2726d[a];
    }

    /* renamed from: c */
    public final void mo2598c(int i, E e) {
        if (this.f2727e == 0 || i > this.f2725c[this.f2727e - 1]) {
            if (this.f2724b && this.f2727e >= this.f2725c.length) {
                mo2593b();
            }
            int i2 = this.f2727e;
            if (i2 >= this.f2725c.length) {
                int a = C0782d.m2218a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                System.arraycopy(this.f2725c, 0, iArr, 0, this.f2725c.length);
                System.arraycopy(this.f2726d, 0, objArr, 0, this.f2726d.length);
                this.f2725c = iArr;
                this.f2726d = objArr;
            }
            this.f2725c[i2] = i;
            this.f2726d[i2] = e;
            this.f2727e = i2 + 1;
            return;
        }
        mo2595b(i, e);
    }

    /* renamed from: b */
    public final void mo2595b(int i, E e) {
        int a = C0782d.m2219a(this.f2725c, this.f2727e, i);
        if (a >= 0) {
            this.f2726d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 >= this.f2727e || this.f2726d[i2] != f2723a) {
            if (this.f2724b && this.f2727e >= this.f2725c.length) {
                mo2593b();
                i2 = C0782d.m2219a(this.f2725c, this.f2727e, i) ^ -1;
            }
            if (this.f2727e >= this.f2725c.length) {
                int a2 = C0782d.m2218a(this.f2727e + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                System.arraycopy(this.f2725c, 0, iArr, 0, this.f2725c.length);
                System.arraycopy(this.f2726d, 0, objArr, 0, this.f2726d.length);
                this.f2725c = iArr;
                this.f2726d = objArr;
            }
            if (this.f2727e - i2 != 0) {
                int[] iArr2 = this.f2725c;
                int i3 = i2 + 1;
                System.arraycopy(iArr2, i2, iArr2, i3, this.f2727e - i2);
                Object[] objArr2 = this.f2726d;
                System.arraycopy(objArr2, i2, objArr2, i3, this.f2727e - i2);
            }
            this.f2725c[i2] = i;
            this.f2726d[i2] = e;
            this.f2727e++;
            return;
        }
        this.f2725c[i2] = i;
        this.f2726d[i2] = e;
    }
}
