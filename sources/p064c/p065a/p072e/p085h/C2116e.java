package p064c.p065a.p072e.p085h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2177l;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2126c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.h.e */
public final class C2116e<T> extends AtomicInteger implements C2177l<T>, C53696d {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: a */
    final C53695c<? super T> f6865a;

    /* renamed from: b */
    final C2126c f6866b = new C2126c();

    /* renamed from: c */
    final AtomicLong f6867c = new AtomicLong();

    /* renamed from: d */
    final AtomicReference<C53696d> f6868d = new AtomicReference<>();

    /* renamed from: e */
    final AtomicBoolean f6869e = new AtomicBoolean();

    /* renamed from: f */
    volatile boolean f6870f;

    public final void cancel() {
        if (!this.f6870f) {
            C2122f.cancel(this.f6868d);
        }
    }

    public final void onComplete() {
        this.f6870f = true;
        C53695c<? super T> cVar = this.f6865a;
        C2126c cVar2 = this.f6866b;
        if (getAndIncrement() == 0) {
            Throwable terminate = cVar2.terminate();
            if (terminate != null) {
                cVar.onError(terminate);
                return;
            }
            cVar.onComplete();
        }
    }

    public final void onError(Throwable th) {
        this.f6870f = true;
        C53695c<? super T> cVar = this.f6865a;
        C2126c cVar2 = this.f6866b;
        if (!cVar2.addThrowable(th)) {
            C2150a.m6492a(th);
        } else if (getAndIncrement() == 0) {
            cVar.onError(cVar2.terminate());
        }
    }

    public C2116e(C53695c<? super T> cVar) {
        this.f6865a = cVar;
    }

    public final void onNext(T t) {
        C53695c<? super T> cVar = this.f6865a;
        C2126c cVar2 = this.f6866b;
        if (get() == 0 && compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable terminate = cVar2.terminate();
                if (terminate != null) {
                    cVar.onError(terminate);
                    return;
                }
                cVar.onComplete();
            }
        }
    }

    public final void onSubscribe(C53696d dVar) {
        if (this.f6869e.compareAndSet(false, true)) {
            this.f6865a.onSubscribe(this);
            C2122f.deferredSetOnce(this.f6868d, this.f6867c, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void request(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder sb = new StringBuilder("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            onError(new IllegalArgumentException(sb.toString()));
            return;
        }
        C2122f.deferredRequest(this.f6868d, this.f6867c, j);
    }
}
