package org.greenrobot.eventbus;

import java.util.logging.Level;

/* renamed from: org.greenrobot.eventbus.b */
final class C53754b implements Runnable, C53770l {

    /* renamed from: a */
    private final C53769k f133303a = new C53769k();

    /* renamed from: b */
    private final C53755c f133304b;

    /* renamed from: c */
    private volatile boolean f133305c;

    public final void run() {
        while (true) {
            try {
                C53768j a = this.f133303a.mo112973a(1000);
                if (a == null) {
                    synchronized (this) {
                        a = this.f133303a.mo112972a();
                        if (a == null) {
                            this.f133305c = false;
                            this.f133305c = false;
                            return;
                        }
                    }
                }
                this.f133304b.mo112956a(a);
            } catch (InterruptedException e) {
                try {
                    C53762g gVar = this.f133304b.f133311d;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder();
                    sb.append(Thread.currentThread().getName());
                    sb.append(" was interruppted");
                    gVar.mo112969a(level, sb.toString(), e);
                    return;
                } finally {
                    this.f133305c = false;
                }
            }
        }
    }

    C53754b(C53755c cVar) {
        this.f133304b = cVar;
    }

    /* renamed from: a */
    public final void mo112947a(C53776q qVar, Object obj) {
        C53768j a = C53768j.m114354a(qVar, obj);
        synchronized (this) {
            this.f133303a.mo112974a(a);
            if (!this.f133305c) {
                this.f133305c = true;
                this.f133304b.f133310c.execute(this);
            }
        }
    }
}
