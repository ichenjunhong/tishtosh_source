package p064c.p065a.p072e.p086i;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53696d;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2127d;

/* renamed from: c.a.e.i.e */
public class C2121e extends AtomicInteger implements C53696d {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: d */
    C53696d f6876d;

    /* renamed from: e */
    long f6877e;

    /* renamed from: f */
    final AtomicReference<C53696d> f6878f = new AtomicReference<>();

    /* renamed from: g */
    final AtomicLong f6879g = new AtomicLong();

    /* renamed from: h */
    final AtomicLong f6880h = new AtomicLong();

    /* renamed from: i */
    final boolean f6881i;

    /* renamed from: j */
    volatile boolean f6882j;

    /* renamed from: k */
    protected boolean f6883k;

    public final boolean isCancelled() {
        return this.f6882j;
    }

    public final boolean isUnbounded() {
        return this.f6883k;
    }

    /* renamed from: a */
    private void m6407a() {
        if (getAndIncrement() == 0) {
            m6408b();
        }
    }

    public void cancel() {
        if (!this.f6882j) {
            this.f6882j = true;
            m6407a();
        }
    }

    /* renamed from: b */
    private void m6408b() {
        C53696d dVar = null;
        long j = 0;
        int i = 1;
        do {
            C53696d dVar2 = (C53696d) this.f6878f.get();
            if (dVar2 != null) {
                dVar2 = (C53696d) this.f6878f.getAndSet(null);
            }
            long j2 = this.f6879g.get();
            if (j2 != 0) {
                j2 = this.f6879g.getAndSet(0);
            }
            long j3 = this.f6880h.get();
            if (j3 != 0) {
                j3 = this.f6880h.getAndSet(0);
            }
            C53696d dVar3 = this.f6876d;
            if (this.f6882j) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.f6876d = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j4 = this.f6877e;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C2127d.m6414a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        long j5 = j4 - j3;
                        if (j5 < 0) {
                            C2122f.reportMoreProduced(j5);
                            j5 = 0;
                        }
                        j4 = j5;
                    }
                    this.f6877e = j4;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.f6881i) {
                        dVar3.cancel();
                    }
                    this.f6876d = dVar2;
                    if (j4 != 0) {
                        j = C2127d.m6414a(j, j4);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j2 == 0)) {
                    j = C2127d.m6414a(j, j2);
                    dVar = dVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            dVar.request(j);
        }
    }

    public C2121e(boolean z) {
        this.f6881i = z;
    }

    public final void produced(long j) {
        if (!this.f6883k) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C2127d.m6415a(this.f6880h, j);
                m6407a();
                return;
            }
            long j2 = this.f6877e;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                long j4 = 0;
                if (j3 < 0) {
                    C2122f.reportMoreProduced(j3);
                } else {
                    j4 = j3;
                }
                this.f6877e = j4;
            }
            if (decrementAndGet() != 0) {
                m6408b();
            }
        }
    }

    public final void request(long j) {
        if (C2122f.validate(j) && !this.f6883k) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C2127d.m6415a(this.f6879g, j);
                m6407a();
                return;
            }
            long j2 = this.f6877e;
            if (j2 != Long.MAX_VALUE) {
                long a = C2127d.m6414a(j2, j);
                this.f6877e = a;
                if (a == Long.MAX_VALUE) {
                    this.f6883k = true;
                }
            }
            C53696d dVar = this.f6876d;
            if (decrementAndGet() != 0) {
                m6408b();
            }
            if (dVar != null) {
                dVar.request(j);
            }
        }
    }

    public final void setSubscription(C53696d dVar) {
        if (this.f6882j) {
            dVar.cancel();
            return;
        }
        C1745b.m6050a(dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            C53696d dVar2 = (C53696d) this.f6878f.getAndSet(dVar);
            if (dVar2 != null && this.f6881i) {
                dVar2.cancel();
            }
            m6407a();
            return;
        }
        C53696d dVar3 = this.f6876d;
        if (dVar3 != null && this.f6881i) {
            dVar3.cancel();
        }
        this.f6876d = dVar;
        long j = this.f6877e;
        if (decrementAndGet() != 0) {
            m6408b();
        }
        if (j != 0) {
            dVar.request(j);
        }
    }
}
