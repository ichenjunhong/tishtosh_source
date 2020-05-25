package com.p683ss.android.ugc.aweme.feed.interest.view;

import com.C2240a;
import java.lang.Comparable;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.view.b */
public final class C30431b<T extends Comparable<? super T>> {

    /* renamed from: a */
    public T f79547a;

    /* renamed from: b */
    public T f79548b;

    public final String toString() {
        return C2240a.m6772a("[%s, %s]", new Object[]{this.f79547a, this.f79548b});
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        Comparable[] comparableArr = {this.f79547a, this.f79548b};
        for (int i3 = 0; i3 < 2; i3++) {
            Comparable comparable = comparableArr[i3];
            if (comparable == null) {
                i = 0;
            } else {
                i = comparable.hashCode();
            }
            i2 = ((i2 << 5) - i2) ^ i;
        }
        return i2;
    }

    /* renamed from: a */
    public final boolean mo60862a(T t) {
        boolean z;
        boolean z2;
        m71350a(t, "value must not be null", new Object[0]);
        if (t.compareTo(this.f79547a) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (t.compareTo(this.f79548b) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30431b)) {
            return false;
        }
        C30431b bVar = (C30431b) obj;
        if (!this.f79547a.equals(bVar.f79547a) || !this.f79548b.equals(bVar.f79548b)) {
            return false;
        }
        return true;
    }

    public C30431b(T t, T t2) {
        this.f79547a = (Comparable) m71350a(t, "lower must not be null", new Object[0]);
        this.f79548b = (Comparable) m71350a(t2, "upper must not be null", new Object[0]);
        if (t.compareTo(t2) > 0) {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
    }

    /* renamed from: a */
    private static <T> T m71350a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C2240a.m6772a(str, objArr));
    }
}
