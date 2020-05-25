package p064c.p065a.p091i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.i.b */
public final class C2153b<T> extends C2152a<T> {

    /* renamed from: a */
    static final C2154a[] f6935a = new C2154a[0];

    /* renamed from: c */
    static final C2154a[] f6936c = new C2154a[0];

    /* renamed from: d */
    final AtomicReference<C2154a<T>[]> f6937d = new AtomicReference<>(f6936c);

    /* renamed from: e */
    Throwable f6938e;

    /* renamed from: c.a.i.b$a */
    static final class C2154a<T> extends AtomicLong implements C53696d {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final C53695c<? super T> f6939a;

        /* renamed from: b */
        final C2153b<T> f6940b;

        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f6940b.mo6459a(this);
            }
        }

        public final void request(long j) {
            long j2;
            if (C2122f.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, C2127d.m6414a(j2, j)));
            }
        }

        C2154a(C53695c<? super T> cVar, C2153b<T> bVar) {
            this.f6939a = cVar;
            this.f6940b = bVar;
        }
    }

    public final void onComplete() {
        C2154a[] aVarArr;
        if (this.f6937d.get() != f6935a) {
            for (C2154a aVar : (C2154a[]) this.f6937d.getAndSet(f6935a)) {
                if (aVar.get() != Long.MIN_VALUE) {
                    aVar.f6939a.onComplete();
                }
            }
        }
    }

    public final void onSubscribe(C53696d dVar) {
        if (this.f6937d.get() == f6935a) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    public final void onError(Throwable th) {
        C2154a[] aVarArr;
        C1745b.m6050a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f6937d.get() == f6935a) {
            C2150a.m6492a(th);
            return;
        }
        this.f6938e = th;
        for (C2154a aVar : (C2154a[]) this.f6937d.getAndSet(f6935a)) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.f6939a.onError(th);
            } else {
                C2150a.m6492a(th);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6459a(C2154a<T> aVar) {
        C2154a<T>[] aVarArr;
        C2154a[] aVarArr2;
        do {
            aVarArr = (C2154a[]) this.f6937d.get();
            if (aVarArr != f6935a && aVarArr != f6936c) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f6936c;
                    } else {
                        C2154a[] aVarArr3 = new C2154a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f6937d.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        boolean z;
        boolean z2;
        C2154a aVar = new C2154a(cVar, this);
        cVar.onSubscribe(aVar);
        while (true) {
            C2154a[] aVarArr = (C2154a[]) this.f6937d.get();
            z = true;
            if (aVarArr != f6935a) {
                int length = aVarArr.length;
                C2154a[] aVarArr2 = new C2154a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                if (this.f6937d.compareAndSet(aVarArr, aVarArr2)) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            if (aVar.get() != Long.MIN_VALUE) {
                z = false;
            }
            if (z) {
                mo6459a(aVar);
            }
        } else {
            Throwable th = this.f6938e;
            if (th != null) {
                cVar.onError(th);
                return;
            }
            cVar.onComplete();
        }
    }

    public final void onNext(T t) {
        C2154a[] aVarArr;
        C1745b.m6050a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C2154a aVar : (C2154a[]) this.f6937d.get()) {
            long j = aVar.get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    aVar.f6939a.onNext(t);
                    C2127d.m6417c(aVar, 1);
                } else {
                    aVar.cancel();
                    aVar.f6939a.onError(new C1701c("Could not emit value due to lack of requests"));
                }
            }
        }
    }
}
