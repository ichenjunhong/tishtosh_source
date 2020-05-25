package kotlinx.coroutines.internal;

import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.b */
public final class C53305b<T> {

    /* renamed from: a */
    private Object[] f131922a = new Object[16];

    /* renamed from: b */
    private int f131923b;

    /* renamed from: c */
    private int f131924c;

    /* renamed from: a */
    public final boolean mo110899a() {
        if (this.f131923b == this.f131924c) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m113295c() {
        int length = this.f131922a.length;
        Object[] objArr = new Object[(length << 1)];
        int length2 = this.f131922a.length - this.f131923b;
        C53304a.m113294a(this.f131922a, this.f131923b, objArr, 0, length2);
        C53304a.m113294a(this.f131922a, 0, objArr, length2, this.f131923b);
        this.f131922a = objArr;
        this.f131923b = 0;
        this.f131924c = length;
    }

    /* renamed from: b */
    public final T mo110900b() {
        if (this.f131923b == this.f131924c) {
            return null;
        }
        T t = this.f131922a[this.f131923b];
        this.f131922a[this.f131923b] = null;
        this.f131923b = (this.f131923b + 1) & (this.f131922a.length - 1);
        if (t != null) {
            return t;
        }
        throw new C52857u("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final void mo110898a(T t) {
        C52711k.m112240b(t, "element");
        this.f131922a[this.f131924c] = t;
        this.f131924c = (this.f131924c + 1) & (this.f131922a.length - 1);
        if (this.f131924c == this.f131923b) {
            m113295c();
        }
    }
}
