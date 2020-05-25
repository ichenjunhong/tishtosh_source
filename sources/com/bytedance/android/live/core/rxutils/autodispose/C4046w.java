package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p244c.C4018c;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1683ag;
import p064c.p065a.C2142f;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p089g.C2146a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.w */
final class C4046w<T> implements C4018c<T> {

    /* renamed from: a */
    final AtomicReference<C1690c> f11187a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C1690c> f11188b = new AtomicReference<>();

    /* renamed from: c */
    private final C2142f f11189c;

    /* renamed from: d */
    private final C1683ag<? super T> f11190d;

    public final void dispose() {
        C4020d.m10135a(this.f11188b);
        C4020d.m10135a(this.f11187a);
    }

    public final boolean isDisposed() {
        if (this.f11187a.get() == C4020d.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f11187a.lazySet(C4020d.DISPOSED);
            C4020d.m10135a(this.f11188b);
            this.f11190d.onError(th);
        }
    }

    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.f11187a.lazySet(C4020d.DISPOSED);
            C4020d.m10135a(this.f11188b);
            this.f11190d.onSuccess(t);
        }
    }

    public final void onSubscribe(C1690c cVar) {
        C40471 r0 = new C2146a() {
            public final void onComplete() {
                C4046w.this.f11188b.lazySet(C4020d.DISPOSED);
                C4020d.m10135a(C4046w.this.f11187a);
            }

            public final void onError(Throwable th) {
                C4046w.this.f11188b.lazySet(C4020d.DISPOSED);
                C4046w.this.onError(th);
            }
        };
        if (C4035n.m10164a(this.f11188b, r0, getClass())) {
            this.f11190d.onSubscribe(this);
            this.f11189c.mo6175a(r0);
            C4035n.m10164a(this.f11187a, cVar, getClass());
        }
    }

    C4046w(C2142f fVar, C1683ag<? super T> agVar) {
        this.f11189c = fVar;
        this.f11190d = agVar;
    }
}
