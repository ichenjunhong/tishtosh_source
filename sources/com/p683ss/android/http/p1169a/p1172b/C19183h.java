package com.p683ss.android.http.p1169a.p1172b;

import com.p683ss.android.http.p1169a.p1174d.C19188b;

/* renamed from: com.ss.android.http.a.b.h */
public final class C19183h {

    /* renamed from: a */
    public final int f52879a;

    /* renamed from: b */
    public final int f52880b;

    /* renamed from: c */
    public int f52881c;

    /* renamed from: a */
    public final boolean mo39142a() {
        if (this.f52881c >= this.f52880b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C19188b bVar = new C19188b(16);
        bVar.mo39149a('[');
        bVar.mo39151a(Integer.toString(this.f52879a));
        bVar.mo39149a('>');
        bVar.mo39151a(Integer.toString(this.f52881c));
        bVar.mo39149a('>');
        bVar.mo39151a(Integer.toString(this.f52880b));
        bVar.mo39149a(']');
        return bVar.toString();
    }

    /* renamed from: a */
    public final void mo39141a(int i) {
        if (i < this.f52879a) {
            throw new IndexOutOfBoundsException();
        } else if (i <= this.f52880b) {
            this.f52881c = i;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public C19183h(int i, int i2) {
        if (i2 >= 0) {
            this.f52879a = 0;
            this.f52880b = i2;
            this.f52881c = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
    }
}
