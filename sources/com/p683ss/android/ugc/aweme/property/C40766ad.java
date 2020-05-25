package com.p683ss.android.ugc.aweme.property;

import com.C2240a;
import com.google.p1057b.p1058a.C17421k;
import java.lang.Comparable;

/* renamed from: com.ss.android.ugc.aweme.property.ad */
public final class C40766ad<T extends Comparable<? super T>> {

    /* renamed from: a */
    public final T f103857a;

    /* renamed from: b */
    public final T f103858b;

    public final String toString() {
        return C2240a.m6772a("[%s, %s]", new Object[]{this.f103857a, this.f103858b});
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        Comparable[] comparableArr = {this.f103857a, this.f103858b};
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
    public final boolean mo83078a(T t) {
        boolean z;
        boolean z2;
        C17421k.m42654a(t, (Object) "value must not be null");
        if (t.compareTo(this.f103857a) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (t.compareTo(this.f103858b) <= 0) {
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
        if (!(obj instanceof C40766ad)) {
            return false;
        }
        C40766ad adVar = (C40766ad) obj;
        if (!this.f103857a.equals(adVar.f103857a) || !this.f103858b.equals(adVar.f103858b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> C40766ad<T> m90178a(T t, T t2) {
        return new C40766ad<>(t, t2);
    }

    private C40766ad(T t, T t2) {
        this.f103857a = (Comparable) C17421k.m42654a(t, (Object) "lower must not be null");
        this.f103858b = (Comparable) C17421k.m42654a(t2, (Object) "upper must not be null");
        if (t.compareTo(t2) > 0) {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
    }
}
