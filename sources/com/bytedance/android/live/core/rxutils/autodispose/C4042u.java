package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p244c.C4016a;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C2142f;
import p064c.p065a.C2196q;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p089g.C2146a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.u */
final class C4042u<T> implements C4016a<T> {

    /* renamed from: a */
    final AtomicReference<C1690c> f11176a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C1690c> f11177b = new AtomicReference<>();

    /* renamed from: c */
    private final C2142f f11178c;

    /* renamed from: d */
    private final C2196q<? super T> f11179d;

    public final void dispose() {
        C4020d.m10135a(this.f11177b);
        C4020d.m10135a(this.f11176a);
    }

    public final boolean isDisposed() {
        if (this.f11176a.get() == C4020d.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (!isDisposed()) {
            this.f11176a.lazySet(C4020d.DISPOSED);
            C4020d.m10135a(this.f11177b);
            this.f11179d.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f11176a.lazySet(C4020d.DISPOSED);
            C4020d.m10135a(this.f11177b);
            this.f11179d.onError(th);
        }
    }

    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.f11176a.lazySet(C4020d.DISPOSED);
            C4020d.m10135a(this.f11177b);
            this.f11179d.onSuccess(t);
        }
    }

    public final void onSubscribe(C1690c cVar) {
        C40431 r0 = new C2146a() {
            public final void onComplete() {
                C4042u.this.f11177b.lazySet(C4020d.DISPOSED);
                C4020d.m10135a(C4042u.this.f11176a);
            }

            public final void onError(Throwable th) {
                C4042u.this.f11177b.lazySet(C4020d.DISPOSED);
                C4042u.this.onError(th);
            }
        };
        if (C4035n.m10164a(this.f11177b, r0, getClass())) {
            this.f11179d.onSubscribe(this);
            this.f11178c.mo6175a(r0);
            C4035n.m10164a(this.f11176a, cVar, getClass());
        }
    }

    C4042u(C2142f fVar, C2196q<? super T> qVar) {
        this.f11178c = fVar;
        this.f11179d = qVar;
    }
}
