package p2628d.p2631c;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2628d.C52848o.C52850b;
import p2628d.p2631c.p2632a.C52600a;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52617e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.c.g */
public final class C52635g<T> implements C52617e, C52625c<T> {

    /* renamed from: a */
    public static final C52636a f130922a = new C52636a(null);

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater<C52635g<?>, Object> f130923d = AtomicReferenceFieldUpdater.newUpdater(C52635g.class, Object.class, "b");

    /* renamed from: b */
    private volatile Object f130924b;

    /* renamed from: c */
    private final C52625c<T> f130925c;

    /* renamed from: d.c.g$a */
    static final class C52636a {
        private C52636a() {
        }

        public /* synthetic */ C52636a(C52707g gVar) {
            this();
        }
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final C52628e getContext() {
        return this.f130925c.getContext();
    }

    public final C52617e getCallerFrame() {
        C52625c<T> cVar = this.f130925c;
        if (!(cVar instanceof C52617e)) {
            cVar = null;
        }
        return (C52617e) cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeContinuation for ");
        sb.append(this.f130925c);
        return sb.toString();
    }

    /* renamed from: a */
    public final Object mo110263a() {
        Object obj = this.f130924b;
        if (obj == C52600a.UNDECIDED) {
            if (f130923d.compareAndSet(this, C52600a.UNDECIDED, C52601b.m112157a())) {
                return C52601b.m112157a();
            }
            obj = this.f130924b;
        }
        if (obj == C52600a.RESUMED) {
            return C52601b.m112157a();
        }
        if (!(obj instanceof C52850b)) {
            return obj;
        }
        throw ((C52850b) obj).exception;
    }

    public C52635g(C52625c<? super T> cVar) {
        C52711k.m112240b(cVar, "delegate");
        this(cVar, C52600a.UNDECIDED);
    }

    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.f130924b;
            if (obj2 == C52600a.UNDECIDED) {
                if (f130923d.compareAndSet(this, C52600a.UNDECIDED, obj)) {
                    return;
                }
            } else if (obj2 != C52601b.m112157a()) {
                throw new IllegalStateException("Already resumed");
            } else if (f130923d.compareAndSet(this, C52601b.m112157a(), C52600a.RESUMED)) {
                this.f130925c.resumeWith(obj);
                return;
            }
        }
    }

    private C52635g(C52625c<? super T> cVar, Object obj) {
        C52711k.m112240b(cVar, "delegate");
        this.f130925c = cVar;
        this.f130924b = obj;
    }
}
