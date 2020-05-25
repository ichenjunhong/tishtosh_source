package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.d */
public abstract class C53307d<T> extends C53327p {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f131926a = AtomicReferenceFieldUpdater.newUpdater(C53307d.class, Object.class, "_consensus");
    private volatile Object _consensus = C53306c.f131925a;

    /* renamed from: a */
    public abstract Object mo110892a(T t);

    /* renamed from: a */
    public abstract void mo110901a(T t, Object obj);

    /* renamed from: b */
    public final Object mo110902b(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        if (obj2 == C53306c.f131925a) {
            obj2 = mo110892a(obj);
            if (obj2 != C53306c.f131925a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!f131926a.compareAndSet(this, C53306c.f131925a, obj2)) {
                obj2 = this._consensus;
            }
        }
        mo110901a(obj, obj2);
        return obj2;
    }
}
