package p2628d;

import java.io.Serializable;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.y */
public final class C52861y<T> implements C52668f<T>, Serializable {

    /* renamed from: a */
    private C52670a<? extends T> f131108a;

    /* renamed from: b */
    private Object f131109b = C52858v.f131106a;

    private final Object writeReplace() {
        return new C52637d(getValue());
    }

    public final boolean isInitialized() {
        if (this.f131109b != C52858v.f131106a) {
            return true;
        }
        return false;
    }

    public final T getValue() {
        if (this.f131109b == C52858v.f131106a) {
            C52670a<? extends T> aVar = this.f131108a;
            if (aVar == null) {
                C52711k.m112234a();
            }
            this.f131109b = aVar.invoke();
            this.f131108a = null;
        }
        return this.f131109b;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public C52861y(C52670a<? extends T> aVar) {
        C52711k.m112240b(aVar, "initializer");
        this.f131108a = aVar;
    }
}
