package p2628d;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.q */
final class C52852q<T> implements C52668f<T>, Serializable {

    /* renamed from: a */
    public static final C52853a f131095a = new C52853a(null);

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater<C52852q<?>, Object> f131096e = AtomicReferenceFieldUpdater.newUpdater(C52852q.class, Object.class, "c");

    /* renamed from: b */
    private volatile C52670a<? extends T> f131097b;

    /* renamed from: c */
    private volatile Object f131098c = C52858v.f131106a;

    /* renamed from: d */
    private final Object f131099d = C52858v.f131106a;

    /* renamed from: d.q$a */
    public static final class C52853a {
        private C52853a() {
        }

        public /* synthetic */ C52853a(C52707g gVar) {
            this();
        }
    }

    private final Object writeReplace() {
        return new C52637d(getValue());
    }

    public final boolean isInitialized() {
        if (this.f131098c != C52858v.f131106a) {
            return true;
        }
        return false;
    }

    public final T getValue() {
        T t = this.f131098c;
        if (t != C52858v.f131106a) {
            return t;
        }
        C52670a<? extends T> aVar = this.f131097b;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (f131096e.compareAndSet(this, C52858v.f131106a, invoke)) {
                this.f131097b = null;
                return invoke;
            }
        }
        return this.f131098c;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public C52852q(C52670a<? extends T> aVar) {
        C52711k.m112240b(aVar, "initializer");
        this.f131097b = aVar;
    }
}
