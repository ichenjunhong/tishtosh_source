package kotlinx.coroutines.p2679b;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.C53255bd;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.b.f */
final class C53239f extends C53255bd implements Executor, C53243j {

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f131849e = AtomicIntegerFieldUpdater.newUpdater(C53239f.class, "inFlightTasks");

    /* renamed from: b */
    public final C53237d f131850b;

    /* renamed from: c */
    public final int f131851c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<Runnable> f131852d = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    private final C53245l f131853f;
    private volatile int inFlightTasks = 0;

    /* renamed from: b */
    public final C53245l mo110823b() {
        return this.f131853f;
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[dispatcher = ");
        sb.append(this.f131850b);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo110822a() {
        Runnable runnable = (Runnable) this.f131852d.poll();
        if (runnable != null) {
            this.f131850b.mo110820a(runnable, this, true);
            return;
        }
        f131849e.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f131852d.poll();
        if (runnable2 != null) {
            m113109a(runnable2, true);
        }
    }

    public final void execute(Runnable runnable) {
        C52711k.m112240b(runnable, "command");
        m113109a(runnable, false);
    }

    /* renamed from: a */
    public final void mo19708a(C52628e eVar, Runnable runnable) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(runnable, "block");
        m113109a(runnable, false);
    }

    /* renamed from: a */
    private final void m113109a(Runnable runnable, boolean z) {
        while (f131849e.incrementAndGet(this) > this.f131851c) {
            this.f131852d.add(runnable);
            if (f131849e.decrementAndGet(this) < this.f131851c) {
                runnable = (Runnable) this.f131852d.poll();
                if (runnable == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f131850b.mo110820a(runnable, this, z);
    }

    public C53239f(C53237d dVar, int i, C53245l lVar) {
        C52711k.m112240b(dVar, "dispatcher");
        C52711k.m112240b(lVar, "taskMode");
        this.f131850b = dVar;
        this.f131851c = i;
        this.f131853f = lVar;
    }
}
