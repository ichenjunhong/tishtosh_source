package p2628d;

import java.io.Serializable;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.r */
final class C52854r<T> implements C52668f<T>, Serializable {

    /* renamed from: a */
    private C52670a<? extends T> f131100a;

    /* renamed from: b */
    private volatile Object f131101b;

    /* renamed from: c */
    private final Object f131102c;

    private final Object writeReplace() {
        return new C52637d(getValue());
    }

    public final boolean isInitialized() {
        if (this.f131101b != C52858v.f131106a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public final T getValue() {
        T t;
        T t2 = this.f131101b;
        if (t2 != C52858v.f131106a) {
            return t2;
        }
        synchronized (this.f131102c) {
            t = this.f131101b;
            if (t == C52858v.f131106a) {
                C52670a<? extends T> aVar = this.f131100a;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                t = aVar.invoke();
                this.f131101b = t;
                this.f131100a = null;
            }
        }
        return t;
    }

    private C52854r(C52670a<? extends T> aVar, Object obj) {
        C52711k.m112240b(aVar, "initializer");
        this.f131100a = aVar;
        this.f131101b = C52858v.f131106a;
        if (obj == 0) {
            obj = this;
        }
        this.f131102c = obj;
    }

    public /* synthetic */ C52854r(C52670a aVar, Object obj, int i, C52707g gVar) {
        this(aVar, null);
    }
}
