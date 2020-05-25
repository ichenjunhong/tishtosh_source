package p064c.p065a.p072e.p077e.p079b;

import com.C2240a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1663a;
import p064c.p065a.C2149h;
import p064c.p065a.C2158j;
import p064c.p065a.C2167k;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p072e.p073a.C1722f;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.b */
public final class C1799b<T> extends C2149h<T> {

    /* renamed from: a */
    final C2167k<T> f5960a;

    /* renamed from: c */
    final C1663a f5961c;

    /* renamed from: c.a.e.e.b.b$a */
    static abstract class C1801a<T> extends AtomicLong implements C2158j<T>, C53696d {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: a */
        final C53695c<? super T> f5963a;

        /* renamed from: b */
        final C1722f f5964b = new C1722f();

        /* renamed from: a */
        public void mo6273a() {
            mo6275b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo6277c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo6280e() {
        }

        /* renamed from: d */
        public final boolean mo6279d() {
            return this.f5964b.isDisposed();
        }

        public final void cancel() {
            this.f5964b.dispose();
            mo6277c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo6275b() {
            if (!mo6279d()) {
                try {
                    this.f5963a.onComplete();
                } finally {
                    this.f5964b.dispose();
                }
            }
        }

        public String toString() {
            return C2240a.m6772a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* renamed from: b */
        public boolean mo6276b(Throwable th) {
            return mo6278c(th);
        }

        C1801a(C53695c<? super T> cVar) {
            this.f5963a = cVar;
        }

        /* renamed from: a */
        public final void mo6274a(Throwable th) {
            if (!mo6276b(th)) {
                C2150a.m6492a(th);
            }
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a((AtomicLong) this, j);
                mo6280e();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final boolean mo6278c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (mo6279d()) {
                return false;
            }
            try {
                this.f5963a.onError(th);
                this.f5964b.dispose();
                return true;
            } catch (Throwable th2) {
                this.f5964b.dispose();
                throw th2;
            }
        }
    }

    /* renamed from: c.a.e.e.b.b$b */
    static final class C1802b<T> extends C1801a<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: c */
        final C2072c<T> f5965c;

        /* renamed from: d */
        Throwable f5966d;

        /* renamed from: e */
        volatile boolean f5967e;

        /* renamed from: f */
        final AtomicInteger f5968f = new AtomicInteger();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo6280e() {
            m6097f();
        }

        /* renamed from: a */
        public final void mo6273a() {
            this.f5967e = true;
            m6097f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6277c() {
            if (this.f5968f.getAndIncrement() == 0) {
                this.f5965c.clear();
            }
        }

        /* renamed from: f */
        private void m6097f() {
            boolean z;
            if (this.f5968f.getAndIncrement() == 0) {
                C53695c cVar = this.f5963a;
                C2072c<T> cVar2 = this.f5965c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (mo6279d()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z2 = this.f5967e;
                        Object poll = cVar2.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2 || !z) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            Throwable th = this.f5966d;
                            if (th != null) {
                                mo6278c(th);
                                return;
                            } else {
                                mo6275b();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (mo6279d()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z3 = this.f5967e;
                        boolean isEmpty = cVar2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f5966d;
                            if (th2 != null) {
                                mo6278c(th2);
                                return;
                            } else {
                                mo6275b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C2127d.m6416b(this, j2);
                    }
                    i = this.f5968f.addAndGet(-i);
                } while (i != 0);
            }
        }

        /* renamed from: b */
        public final boolean mo6276b(Throwable th) {
            if (this.f5967e || mo6279d()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f5966d = th;
            this.f5967e = true;
            m6097f();
            return true;
        }

        /* renamed from: a */
        public final void mo6282a(T t) {
            if (!this.f5967e && !mo6279d()) {
                if (t == null) {
                    mo6274a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f5965c.offer(t);
                m6097f();
            }
        }

        C1802b(C53695c<? super T> cVar, int i) {
            super(cVar);
            this.f5965c = new C2072c<>(i);
        }
    }

    /* renamed from: c.a.e.e.b.b$c */
    static final class C1803c<T> extends C1807g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final void mo6283f() {
        }

        C1803c(C53695c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: c.a.e.e.b.b$d */
    static final class C1804d<T> extends C1807g<T> {
        private static final long serialVersionUID = 338953216916120960L;

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final void mo6283f() {
            mo6274a(new C1701c("create: could not emit value due to lack of requests"));
        }

        C1804d(C53695c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: c.a.e.e.b.b$e */
    static final class C1805e<T> extends C1801a<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: c */
        final AtomicReference<T> f5969c = new AtomicReference<>();

        /* renamed from: d */
        Throwable f5970d;

        /* renamed from: e */
        volatile boolean f5971e;

        /* renamed from: f */
        final AtomicInteger f5972f = new AtomicInteger();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo6280e() {
            m6105f();
        }

        /* renamed from: a */
        public final void mo6273a() {
            this.f5971e = true;
            m6105f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6277c() {
            if (this.f5972f.getAndIncrement() == 0) {
                this.f5969c.lazySet(null);
            }
        }

        /* renamed from: f */
        private void m6105f() {
            boolean z;
            boolean z2;
            if (this.f5972f.getAndIncrement() == 0) {
                C53695c cVar = this.f5963a;
                AtomicReference<T> atomicReference = this.f5969c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (mo6279d()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z3 = this.f5971e;
                            Object andSet = atomicReference.getAndSet(null);
                            if (andSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3 || !z2) {
                                if (z2) {
                                    break;
                                }
                                cVar.onNext(andSet);
                                j2++;
                            } else {
                                Throwable th = this.f5970d;
                                if (th != null) {
                                    mo6278c(th);
                                    return;
                                } else {
                                    mo6275b();
                                    return;
                                }
                            }
                        }
                    }
                    if (j2 == j) {
                        if (mo6279d()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.f5971e;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f5970d;
                            if (th2 != null) {
                                mo6278c(th2);
                                return;
                            } else {
                                mo6275b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C2127d.m6416b(this, j2);
                    }
                    i = this.f5972f.addAndGet(-i);
                } while (i != 0);
            }
        }

        C1805e(C53695c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public final void mo6282a(T t) {
            if (!this.f5971e && !mo6279d()) {
                if (t == null) {
                    mo6274a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f5969c.set(t);
                m6105f();
            }
        }

        /* renamed from: b */
        public final boolean mo6276b(Throwable th) {
            if (this.f5971e || mo6279d()) {
                return false;
            }
            if (th == null) {
                mo6274a(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f5970d = th;
            this.f5971e = true;
            m6105f();
            return true;
        }
    }

    /* renamed from: c.a.e.e.b.b$f */
    static final class C1806f<T> extends C1801a<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        C1806f(C53695c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public final void mo6282a(T t) {
            long j;
            if (!mo6279d()) {
                if (t != null) {
                    this.f5963a.onNext(t);
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                mo6274a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: c.a.e.e.b.b$g */
    static abstract class C1807g<T> extends C1801a<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public abstract void mo6283f();

        C1807g(C53695c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public final void mo6282a(T t) {
            if (!mo6279d()) {
                if (t == null) {
                    mo6274a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.f5963a.onNext(t);
                    C2127d.m6416b(this, 1);
                } else {
                    mo6283f();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C1801a aVar;
        switch (this.f5961c) {
            case MISSING:
                aVar = new C1806f(cVar);
                break;
            case ERROR:
                aVar = new C1804d(cVar);
                break;
            case DROP:
                aVar = new C1803c(cVar);
                break;
            case LATEST:
                aVar = new C1805e(cVar);
                break;
            default:
                aVar = new C1802b(cVar, m6447a());
                break;
        }
        cVar.onSubscribe(aVar);
        try {
            this.f5960a.mo6463a(aVar);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            aVar.mo6274a(th);
        }
    }

    public C1799b(C2167k<T> kVar, C1663a aVar) {
        this.f5960a = kVar;
        this.f5961c = aVar;
    }
}
