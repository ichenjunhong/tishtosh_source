package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p244c.C4019d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2142f;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p089g.C2146a;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.x */
final class C4048x<T> extends AtomicInteger implements C4019d<T> {

    /* renamed from: a */
    final AtomicReference<C53696d> f11192a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C1690c> f11193b = new AtomicReference<>();

    /* renamed from: c */
    private final C4015c f11194c = new C4015c();

    /* renamed from: d */
    private final AtomicReference<C53696d> f11195d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicLong f11196e = new AtomicLong();

    /* renamed from: f */
    private final C2142f f11197f;

    /* renamed from: g */
    private final C53695c<? super T> f11198g;

    public final void dispose() {
        cancel();
    }

    public final void cancel() {
        C4020d.m10135a(this.f11193b);
        C4050y.m10171a(this.f11192a);
    }

    public final boolean isDisposed() {
        if (this.f11192a.get() == C4050y.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (!isDisposed()) {
            this.f11192a.lazySet(C4050y.CANCELLED);
            C4020d.m10135a(this.f11193b);
            C53695c<? super T> cVar = this.f11198g;
            C4015c cVar2 = this.f11194c;
            if (getAndIncrement() == 0) {
                Throwable a = cVar2.mo9412a();
                if (a != null) {
                    cVar.onError(a);
                    return;
                }
                cVar.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f11192a.lazySet(C4050y.CANCELLED);
            C4020d.m10135a(this.f11193b);
            C53695c<? super T> cVar = this.f11198g;
            C4015c cVar2 = this.f11194c;
            if (!cVar2.mo9413a(th)) {
                C2150a.m6492a(th);
            } else if (getAndIncrement() == 0) {
                cVar.onError(cVar2.mo9412a());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r6) {
        /*
            r5 = this;
            boolean r0 = r5.isDisposed()
            if (r0 != 0) goto L_0x003e
            org.b.c<? super T> r0 = r5.f11198g
            com.bytedance.android.live.core.rxutils.autodispose.c r1 = r5.f11194c
            int r2 = r5.get()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x002f
            boolean r2 = r5.compareAndSet(r4, r3)
            if (r2 == 0) goto L_0x002f
            r0.onNext(r6)
            int r6 = r5.decrementAndGet()
            if (r6 == 0) goto L_0x002f
            java.lang.Throwable r6 = r1.mo9412a()
            if (r6 == 0) goto L_0x002b
            r0.onError(r6)
            goto L_0x0030
        L_0x002b:
            r0.onComplete()
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x003e
            java.util.concurrent.atomic.AtomicReference<org.b.d> r6 = r5.f11192a
            com.bytedance.android.live.core.rxutils.autodispose.y r0 = com.bytedance.android.live.core.rxutils.autodispose.C4050y.CANCELLED
            r6.lazySet(r0)
            java.util.concurrent.atomic.AtomicReference<c.a.b.c> r6 = r5.f11193b
            com.bytedance.android.live.core.rxutils.autodispose.C4020d.m10135a(r6)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.rxutils.autodispose.C4048x.onNext(java.lang.Object):void");
    }

    public final void onSubscribe(C53696d dVar) {
        boolean z;
        C40491 r0 = new C2146a() {
            public final void onComplete() {
                C4048x.this.f11193b.lazySet(C4020d.DISPOSED);
                C4050y.m10171a(C4048x.this.f11192a);
            }

            public final void onError(Throwable th) {
                C4048x.this.f11193b.lazySet(C4020d.DISPOSED);
                C4048x.this.onError(th);
            }
        };
        if (C4035n.m10164a(this.f11193b, r0, getClass())) {
            this.f11198g.onSubscribe(this);
            this.f11197f.mo6175a(r0);
            AtomicReference<C53696d> atomicReference = this.f11192a;
            Class cls = getClass();
            C4041t.m10170a(dVar, "next is null");
            boolean z2 = false;
            if (!atomicReference.compareAndSet(null, dVar)) {
                dVar.cancel();
                if (atomicReference.get() != C4050y.CANCELLED) {
                    C4035n.m10163a(cls);
                }
                z = false;
            } else {
                z = true;
            }
            if (z) {
                AtomicReference<C53696d> atomicReference2 = this.f11195d;
                AtomicLong atomicLong = this.f11196e;
                C4041t.m10170a(dVar, "s is null");
                if (!atomicReference2.compareAndSet(null, dVar)) {
                    dVar.cancel();
                    if (atomicReference2.get() != C4050y.CANCELLED) {
                        C2150a.m6492a((Throwable) new IllegalStateException("Subscription already set!"));
                    }
                } else {
                    z2 = true;
                }
                if (z2) {
                    long andSet = atomicLong.getAndSet(0);
                    if (andSet != 0) {
                        dVar.request(andSet);
                    }
                }
            }
        }
    }

    public final void request(long j) {
        boolean z;
        AtomicReference<C53696d> atomicReference = this.f11195d;
        AtomicLong atomicLong = this.f11196e;
        C53696d dVar = (C53696d) atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
            return;
        }
        if (j <= 0) {
            StringBuilder sb = new StringBuilder("n > 0 required but it was ");
            sb.append(j);
            C2150a.m6492a((Throwable) new IllegalArgumentException(sb.toString()));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C4033l.m10161a(atomicLong, j);
            C53696d dVar2 = (C53696d) atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }

    C4048x(C2142f fVar, C53695c<? super T> cVar) {
        this.f11197f = fVar;
        this.f11198g = cVar;
    }
}
