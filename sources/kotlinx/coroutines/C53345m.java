package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p2628d.p2631c.C52625c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.m */
public final class C53345m extends C53354t {

    /* renamed from: a */
    static final AtomicIntegerFieldUpdater f131978a = AtomicIntegerFieldUpdater.newUpdater(C53345m.class, "handled");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f131979c = AtomicIntegerFieldUpdater.newUpdater(C53345m.class, "resumed");
    private volatile int handled;
    private volatile int resumed;

    /* renamed from: a */
    public final boolean mo110939a() {
        return f131979c.compareAndSet(this, 0, 1);
    }

    public C53345m(C52625c<?> cVar, Throwable th, boolean z) {
        C52711k.m112240b(cVar, "continuation");
        if (th == null) {
            StringBuilder sb = new StringBuilder("Continuation ");
            sb.append(cVar);
            sb.append(" was cancelled normally");
            th = new CancellationException(sb.toString());
        }
        super(th);
        this.resumed = 0;
        this.handled = z ? 1 : 0;
    }
}
