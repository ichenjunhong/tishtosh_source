package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p244c.C4017b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2142f;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p089g.C2146a;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.v */
final class C4044v<T> extends AtomicInteger implements C4017b<T> {

    /* renamed from: a */
    final AtomicReference<C1690c> f11181a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C1690c> f11182b = new AtomicReference<>();

    /* renamed from: c */
    private final C4015c f11183c = new C4015c();

    /* renamed from: d */
    private final C2142f f11184d;

    /* renamed from: e */
    private final C1674ab<? super T> f11185e;

    public final void dispose() {
        C4020d.m10135a(this.f11182b);
        C4020d.m10135a(this.f11181a);
    }

    public final boolean isDisposed() {
        if (this.f11181a.get() == C4020d.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (!isDisposed()) {
            this.f11181a.lazySet(C4020d.DISPOSED);
            C4020d.m10135a(this.f11182b);
            C1674ab<? super T> abVar = this.f11185e;
            C4015c cVar = this.f11183c;
            if (getAndIncrement() == 0) {
                Throwable a = cVar.mo9412a();
                if (a != null) {
                    abVar.onError(a);
                    return;
                }
                abVar.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f11181a.lazySet(C4020d.DISPOSED);
            C4020d.m10135a(this.f11182b);
            C1674ab<? super T> abVar = this.f11185e;
            C4015c cVar = this.f11183c;
            if (!cVar.mo9413a(th)) {
                C2150a.m6492a(th);
            } else if (getAndIncrement() == 0) {
                abVar.onError(cVar.mo9412a());
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
            c.a.ab<? super T> r0 = r5.f11185e
            com.bytedance.android.live.core.rxutils.autodispose.c r1 = r5.f11183c
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
            java.util.concurrent.atomic.AtomicReference<c.a.b.c> r6 = r5.f11181a
            com.bytedance.android.live.core.rxutils.autodispose.d r0 = com.bytedance.android.live.core.rxutils.autodispose.C4020d.DISPOSED
            r6.lazySet(r0)
            java.util.concurrent.atomic.AtomicReference<c.a.b.c> r6 = r5.f11182b
            com.bytedance.android.live.core.rxutils.autodispose.C4020d.m10135a(r6)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.rxutils.autodispose.C4044v.onNext(java.lang.Object):void");
    }

    public final void onSubscribe(C1690c cVar) {
        C40451 r0 = new C2146a() {
            public final void onComplete() {
                C4044v.this.f11182b.lazySet(C4020d.DISPOSED);
                C4020d.m10135a(C4044v.this.f11181a);
            }

            public final void onError(Throwable th) {
                C4044v.this.f11182b.lazySet(C4020d.DISPOSED);
                C4044v.this.onError(th);
            }
        };
        if (C4035n.m10164a(this.f11182b, r0, getClass())) {
            this.f11185e.onSubscribe(this);
            this.f11184d.mo6175a(r0);
            C4035n.m10164a(this.f11181a, cVar, getClass());
        }
    }

    C4044v(C2142f fVar, C1674ab<? super T> abVar) {
        this.f11184d = fVar;
        this.f11185e = abVar;
    }
}
