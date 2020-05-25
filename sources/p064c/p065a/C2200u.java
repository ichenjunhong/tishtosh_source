package p064c.p065a;

import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2134j;

/* renamed from: c.a.u */
public final class C2200u<T> {

    /* renamed from: b */
    public static final C2200u<Object> f7030b = new C2200u<>(null);

    /* renamed from: a */
    final Object f7031a;

    /* renamed from: a */
    public final boolean mo6500a() {
        return C2134j.isError(this.f7031a);
    }

    /* renamed from: b */
    public final boolean mo6501b() {
        Object obj = this.f7031a;
        if (obj == null || C2134j.isError(obj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f7031a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f7031a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (C2134j.isError(obj)) {
            StringBuilder sb = new StringBuilder("OnErrorNotification[");
            sb.append(C2134j.getError(obj));
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("OnNextNotification[");
        sb2.append(this.f7031a);
        sb2.append("]");
        return sb2.toString();
    }

    public C2200u(Object obj) {
        this.f7031a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2200u)) {
            return false;
        }
        return C1745b.m6051a(this.f7031a, ((C2200u) obj).f7031a);
    }
}
