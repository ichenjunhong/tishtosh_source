package com.bytedance.android.livesdk.p279af;

/* renamed from: com.bytedance.android.livesdk.af.ag */
public final class C4566ag<E> {

    /* renamed from: a */
    public int f12531a;

    /* renamed from: b */
    private Object[] f12532b = new Object[(this.f12533c + 1)];

    /* renamed from: c */
    private int f12533c;

    /* renamed from: d */
    private C4567a f12534d;

    /* renamed from: com.bytedance.android.livesdk.af.ag$a */
    public interface C4567a<E> {
        /* renamed from: a */
        boolean mo10383a(E e, E e2);
    }

    /* renamed from: a */
    public final E mo10379a() {
        if (this.f12531a <= 0) {
            return null;
        }
        E e = this.f12532b[1];
        Object[] objArr = this.f12532b;
        Object[] objArr2 = this.f12532b;
        int i = this.f12531a;
        this.f12531a = i - 1;
        objArr[1] = objArr2[i];
        m10963c();
        return e;
    }

    /* renamed from: b */
    public final void mo10381b() {
        for (int i = 0; i < this.f12531a; i++) {
            this.f12532b[i] = null;
        }
        this.f12531a = 0;
    }

    /* renamed from: c */
    private void m10963c() {
        int i = 2;
        int i2 = 1;
        while (i <= this.f12531a) {
            int i3 = i + 1;
            if (i3 <= this.f12531a && this.f12534d.mo10383a(this.f12532b[i3], this.f12532b[i])) {
                i = i3;
            }
            if (this.f12534d.mo10383a(this.f12532b[i], this.f12532b[i2])) {
                m10962a(i2, i);
                i2 = i;
                i *= 2;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo10382b(Object obj) {
        int i = 0;
        while (i < this.f12531a) {
            i++;
            if (this.f12532b[i].equals(obj)) {
                Object[] objArr = this.f12532b;
                int i2 = this.f12531a;
                this.f12531a = i2 - 1;
                objArr[i] = objArr[i2];
                m10963c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo10380a(Object obj) {
        if (this.f12531a != this.f12533c) {
            this.f12531a++;
            this.f12532b[this.f12531a] = obj;
            int i = this.f12531a;
            while (true) {
                int i2 = i;
                i /= 2;
                if (i <= 0 || !this.f12534d.mo10383a(this.f12532b[i2], this.f12532b[i])) {
                    break;
                }
                m10962a(i, i2);
            }
        } else if (this.f12534d.mo10383a(obj, this.f12532b[1])) {
            return false;
        } else {
            this.f12532b[1] = obj;
            m10963c();
        }
        return true;
    }

    public C4566ag(int i, C4567a aVar) {
        this.f12533c = i;
        this.f12534d = aVar;
    }

    /* renamed from: a */
    private void m10962a(int i, int i2) {
        Object obj = this.f12532b[i];
        Object[] objArr = this.f12532b;
        objArr[i] = objArr[i2];
        this.f12532b[i2] = obj;
    }
}
