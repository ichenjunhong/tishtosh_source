package p064c.p065a.p072e.p085h;

import java.util.concurrent.atomic.AtomicLong;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2177l;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;

/* renamed from: c.a.e.h.d */
public abstract class C2115d<T, R> extends AtomicLong implements C2177l<T>, C53696d {
    private static final long serialVersionUID = 7917814472626990048L;

    /* renamed from: b */
    protected final C53695c<? super R> f6861b;

    /* renamed from: c */
    protected C53696d f6862c;

    /* renamed from: d */
    protected R f6863d;

    /* renamed from: e */
    protected long f6864e;

    public void cancel() {
        this.f6862c.cancel();
    }

    public C2115d(C53695c<? super R> cVar) {
        this.f6861b = cVar;
    }

    public void onSubscribe(C53696d dVar) {
        if (C2122f.validate(this.f6862c, dVar)) {
            this.f6862c = dVar;
            this.f6861b.onSubscribe(this);
        }
    }

    public final void request(long j) {
        long j2;
        if (C2122f.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f6861b.onNext(this.f6863d);
                        this.f6861b.onComplete();
                        return;
                    }
                }
            } while (!compareAndSet(j2, C2127d.m6414a(j2, j)));
            this.f6862c.request(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6407a(R r) {
        long j = this.f6864e;
        if (j != 0) {
            C2127d.m6416b(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) == 0) {
                if ((j2 & Long.MAX_VALUE) != 0) {
                    lazySet(-9223372036854775807L);
                    this.f6861b.onNext(r);
                    this.f6861b.onComplete();
                    return;
                }
                this.f6863d = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.f6863d = null;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
