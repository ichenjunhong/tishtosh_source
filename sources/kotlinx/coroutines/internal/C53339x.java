package kotlinx.coroutines.internal;

import java.lang.Comparable;
import kotlinx.coroutines.internal.C53340y;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.x */
public final class C53339x<T extends C53340y & Comparable<? super T>> {

    /* renamed from: a */
    public T[] f131970a;
    public volatile int size;

    /* renamed from: a */
    public final boolean mo110926a() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized T mo110928b() {
        return mo110931d();
    }

    /* renamed from: d */
    public final T mo110931d() {
        T[] tArr = this.f131970a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final synchronized T mo110930c() {
        if (this.size <= 0) {
            return null;
        }
        return mo110925a(0);
    }

    /* renamed from: a */
    public final synchronized boolean mo110927a(T t) {
        C52711k.m112240b(t, "node");
        boolean z = false;
        if (t.mo110854b() == null) {
            return false;
        }
        int c = t.mo110855c();
        if (c >= 0) {
            z = true;
        }
        if (z) {
            mo110925a(c);
            return true;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final void mo110929b(int i) {
        while (i > 0) {
            T[] tArr = this.f131970a;
            if (tArr == null) {
                C52711k.m112234a();
            }
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            if (t == null) {
                C52711k.m112234a();
            }
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i];
            if (t2 == null) {
                C52711k.m112234a();
            }
            if (comparable.compareTo(t2) > 0) {
                m113372a(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private final void m113373c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < this.size) {
                T[] tArr = this.f131970a;
                if (tArr == null) {
                    C52711k.m112234a();
                }
                int i3 = i2 + 1;
                if (i3 < this.size) {
                    T t = tArr[i3];
                    if (t == null) {
                        C52711k.m112234a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        C52711k.m112234a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                if (t3 == null) {
                    C52711k.m112234a();
                }
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i2];
                if (t4 == null) {
                    C52711k.m112234a();
                }
                if (comparable2.compareTo(t4) > 0) {
                    m113372a(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final T mo110925a(int i) {
        boolean z;
        boolean z2 = false;
        if (this.size > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            T[] tArr = this.f131970a;
            if (tArr == null) {
                C52711k.m112234a();
            }
            this.size--;
            if (i < this.size) {
                m113372a(i, this.size);
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t == null) {
                        C52711k.m112234a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        C52711k.m112234a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        m113372a(i, i2);
                        mo110929b(i2);
                    }
                }
                m113373c(i);
            }
            T t3 = tArr[this.size];
            if (t3 == null) {
                C52711k.m112234a();
            }
            if (t3.mo110854b() == this) {
                z2 = true;
            }
            if (z2) {
                t3.mo110853a(null);
                t3.mo110852a(-1);
                tArr[this.size] = null;
                return t3;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    private final void m113372a(int i, int i2) {
        T[] tArr = this.f131970a;
        if (tArr == null) {
            C52711k.m112234a();
        }
        T t = tArr[i2];
        if (t == null) {
            C52711k.m112234a();
        }
        T t2 = tArr[i];
        if (t2 == null) {
            C52711k.m112234a();
        }
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo110852a(i);
        t2.mo110852a(i2);
    }
}
