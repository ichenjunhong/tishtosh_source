package kotlinx.coroutines.p2679b;

import kotlinx.coroutines.C53203ai;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.b.k */
public final class C53244k extends C53242i {

    /* renamed from: a */
    public final Runnable f131859a;

    public final void run() {
        try {
            this.f131859a.run();
        } finally {
            this.f131858g.mo110822a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        sb.append(C53203ai.m113030b(this.f131859a));
        sb.append('@');
        sb.append(C53203ai.m113029a((Object) this.f131859a));
        sb.append(", ");
        sb.append(this.f131857f);
        sb.append(", ");
        sb.append(this.f131858g);
        sb.append(']');
        return sb.toString();
    }

    public C53244k(Runnable runnable, long j, C53243j jVar) {
        C52711k.m112240b(runnable, "block");
        C52711k.m112240b(jVar, "taskContext");
        super(j, jVar);
        this.f131859a = runnable;
    }
}
