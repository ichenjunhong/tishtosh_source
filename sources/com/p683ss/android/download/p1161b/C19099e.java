package com.p683ss.android.download.p1161b;

/* renamed from: com.ss.android.download.b.e */
public final class C19099e implements Cloneable {

    /* renamed from: a */
    public long[] f52591a;

    /* renamed from: b */
    public long[] f52592b;

    /* renamed from: c */
    public int f52593c;

    public C19099e() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C19099e clone() {
        try {
            C19099e eVar = (C19099e) super.clone();
            try {
                eVar.f52591a = (long[]) this.f52591a.clone();
                eVar.f52592b = (long[]) this.f52592b.clone();
                return eVar;
            } catch (CloneNotSupportedException unused) {
                return eVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f52593c <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f52593c * 28);
        sb.append('{');
        for (int i = 0; i < this.f52593c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.f52591a[i]);
            sb.append('=');
            sb.append(this.f52592b[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo39019a(long j) {
        int a = C19095b.m46512a(this.f52591a, this.f52593c, j);
        if (a >= 0) {
            m46519a(a);
        }
    }

    private C19099e(int i) {
        int a = C19094a.m46511a(10);
        this.f52591a = new long[a];
        this.f52592b = new long[a];
        this.f52593c = 0;
    }

    /* renamed from: b */
    private void m46520b(int i) {
        int a = C19094a.m46511a(i);
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        System.arraycopy(this.f52591a, 0, jArr, 0, this.f52591a.length);
        System.arraycopy(this.f52592b, 0, jArr2, 0, this.f52592b.length);
        this.f52591a = jArr;
        this.f52592b = jArr2;
    }

    /* renamed from: a */
    private void m46519a(int i) {
        int i2 = i + 1;
        System.arraycopy(this.f52591a, i2, this.f52591a, i, this.f52593c - i2);
        System.arraycopy(this.f52592b, i2, this.f52592b, i, this.f52593c - i2);
        this.f52593c--;
    }

    /* renamed from: a */
    public final void mo39020a(long j, long j2) {
        int a = C19095b.m46512a(this.f52591a, this.f52593c, j);
        if (a >= 0) {
            this.f52592b[a] = j2;
            return;
        }
        int i = a ^ -1;
        if (this.f52593c >= this.f52591a.length) {
            m46520b(this.f52593c + 1);
        }
        if (this.f52593c - i != 0) {
            long[] jArr = this.f52591a;
            int i2 = i + 1;
            System.arraycopy(jArr, i, jArr, i2, this.f52593c - i);
            long[] jArr2 = this.f52592b;
            System.arraycopy(jArr2, i, jArr2, i2, this.f52593c - i);
        }
        this.f52591a[i] = j;
        this.f52592b[i] = j2;
        this.f52593c++;
    }
}
