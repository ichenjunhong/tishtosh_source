package android.support.p030v4.p038f;

/* renamed from: android.support.v4.f.g */
public final class C0785g<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f2684a = new Object();

    /* renamed from: b */
    private boolean f2685b;

    /* renamed from: c */
    private long[] f2686c;

    /* renamed from: d */
    private Object[] f2687d;

    /* renamed from: e */
    private int f2688e;

    public C0785g() {
        this(10);
    }

    /* renamed from: b */
    public final int mo2490b() {
        if (this.f2685b) {
            m2226d();
        }
        return this.f2688e;
    }

    /* renamed from: c */
    public final void mo2495c() {
        int i = this.f2688e;
        Object[] objArr = this.f2687d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2688e = 0;
        this.f2685b = false;
    }

    /* renamed from: d */
    private void m2226d() {
        int i = this.f2688e;
        long[] jArr = this.f2686c;
        Object[] objArr = this.f2687d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2684a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2685b = false;
        this.f2688e = i2;
    }

    /* renamed from: a */
    public final C0785g<E> clone() {
        try {
            C0785g<E> gVar = (C0785g) super.clone();
            gVar.f2686c = (long[]) this.f2686c.clone();
            gVar.f2687d = (Object[]) this.f2687d.clone();
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        if (mo2490b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2688e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2688e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2491b(i));
            sb.append('=');
            Object c = mo2494c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo2496c(long j) {
        mo2492b(j);
    }

    /* renamed from: a */
    public final E mo2487a(long j) {
        return mo2488a(j, null);
    }

    /* renamed from: c */
    public final E mo2494c(int i) {
        if (this.f2685b) {
            m2226d();
        }
        return this.f2687d[i];
    }

    /* renamed from: d */
    public final int mo2499d(long j) {
        if (this.f2685b) {
            m2226d();
        }
        return C0782d.m2220a(this.f2686c, this.f2688e, j);
    }

    public C0785g(int i) {
        if (i == 0) {
            this.f2686c = C0782d.f2680b;
            this.f2687d = C0782d.f2681c;
        } else {
            int b = C0782d.m2222b(i);
            this.f2686c = new long[b];
            this.f2687d = new Object[b];
        }
        this.f2688e = 0;
    }

    /* renamed from: b */
    public final long mo2491b(int i) {
        if (this.f2685b) {
            m2226d();
        }
        return this.f2686c[i];
    }

    /* renamed from: b */
    public final void mo2492b(long j) {
        int a = C0782d.m2220a(this.f2686c, this.f2688e, j);
        if (a >= 0 && this.f2687d[a] != f2684a) {
            this.f2687d[a] = f2684a;
            this.f2685b = true;
        }
    }

    /* renamed from: a */
    public final void mo2489a(int i) {
        if (this.f2687d[i] != f2684a) {
            this.f2687d[i] = f2684a;
            this.f2685b = true;
        }
    }

    /* renamed from: a */
    public final E mo2488a(long j, E e) {
        int a = C0782d.m2220a(this.f2686c, this.f2688e, j);
        if (a < 0 || this.f2687d[a] == f2684a) {
            return e;
        }
        return this.f2687d[a];
    }

    /* renamed from: c */
    public final void mo2497c(long j, E e) {
        if (this.f2688e == 0 || j > this.f2686c[this.f2688e - 1]) {
            if (this.f2685b && this.f2688e >= this.f2686c.length) {
                m2226d();
            }
            int i = this.f2688e;
            if (i >= this.f2686c.length) {
                int b = C0782d.m2222b(i + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f2686c, 0, jArr, 0, this.f2686c.length);
                System.arraycopy(this.f2687d, 0, objArr, 0, this.f2687d.length);
                this.f2686c = jArr;
                this.f2687d = objArr;
            }
            this.f2686c[i] = j;
            this.f2687d[i] = e;
            this.f2688e = i + 1;
            return;
        }
        mo2493b(j, e);
    }

    /* renamed from: b */
    public final void mo2493b(long j, E e) {
        int a = C0782d.m2220a(this.f2686c, this.f2688e, j);
        if (a >= 0) {
            this.f2687d[a] = e;
            return;
        }
        int i = a ^ -1;
        if (i >= this.f2688e || this.f2687d[i] != f2684a) {
            if (this.f2685b && this.f2688e >= this.f2686c.length) {
                m2226d();
                i = C0782d.m2220a(this.f2686c, this.f2688e, j) ^ -1;
            }
            if (this.f2688e >= this.f2686c.length) {
                int b = C0782d.m2222b(this.f2688e + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f2686c, 0, jArr, 0, this.f2686c.length);
                System.arraycopy(this.f2687d, 0, objArr, 0, this.f2687d.length);
                this.f2686c = jArr;
                this.f2687d = objArr;
            }
            if (this.f2688e - i != 0) {
                long[] jArr2 = this.f2686c;
                int i2 = i + 1;
                System.arraycopy(jArr2, i, jArr2, i2, this.f2688e - i);
                Object[] objArr2 = this.f2687d;
                System.arraycopy(objArr2, i, objArr2, i2, this.f2688e - i);
            }
            this.f2686c[i] = j;
            this.f2687d[i] = e;
            this.f2688e++;
            return;
        }
        this.f2686c[i] = j;
        this.f2687d[i] = e;
    }
}
