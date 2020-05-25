package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.bytedance.jedi.arch.C11930q;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1703e;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p076d.C1768m;
import p064c.p065a.p090h.C2150a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class LifecycleAwareObserver<T> extends AtomicReference<C1690c> implements C0183j, C1674ab<T>, C1690c {

    /* renamed from: a */
    private C0184k f31463a;

    /* renamed from: b */
    private C1674ab<T> f31464b;

    /* renamed from: c */
    private T f31465c;

    /* renamed from: d */
    private T f31466d;

    /* renamed from: e */
    private final AtomicBoolean f31467e;

    /* renamed from: f */
    private final boolean f31468f;

    /* renamed from: g */
    private final boolean f31469g;

    /* renamed from: com.bytedance.jedi.arch.internal.LifecycleAwareObserver$a */
    public static final class C11875a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifecycleAwareObserver f31470a;

        public C11875a(LifecycleAwareObserver lifecycleAwareObserver) {
            this.f31470a = lifecycleAwareObserver;
        }

        public final void run() {
            this.f31470a.requireOwner().getLifecycle().mo324a(this.f31470a);
            this.f31470a.requireSourceObserver().onSubscribe(this.f31470a);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.LifecycleAwareObserver$b */
    static final class C11876b<T> implements C1710e<T> {

        /* renamed from: a */
        final /* synthetic */ C52671b f31471a;

        C11876b(C52671b bVar) {
            this.f31471a = bVar;
        }

        public final void accept(T t) {
            this.f31471a.invoke(t);
        }
    }

    public final void onComplete() {
        requireSourceObserver().onComplete();
    }

    public final boolean isDisposed() {
        if (((C1690c) get()) == C11879b.f31478a) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        C1690c cVar = (C1690c) get();
        C1690c cVar2 = C11879b.f31478a;
        if (cVar != cVar2) {
            C1690c cVar3 = (C1690c) getAndSet(cVar2);
            if (!(cVar3 == cVar2 || cVar3 == null)) {
                cVar3.dispose();
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        requireOwner().getLifecycle().mo325b(this);
        if (!isDisposed()) {
            dispose();
        }
        this.f31463a = null;
        this.f31464b = null;
    }

    public final C0184k requireOwner() {
        C0184k kVar = this.f31463a;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("cannot access owner after destroy".toString());
    }

    public final C1674ab<T> requireSourceObserver() {
        C1674ab<T> abVar = this.f31464b;
        if (abVar != null) {
            return abVar;
        }
        throw new IllegalArgumentException("cannot access observer after destroy".toString());
    }

    public final void onError(Throwable th) {
        C52711k.m112240b(th, "e");
        if (!isDisposed()) {
            lazySet(C11879b.f31478a);
            requireSourceObserver().onError(th);
        }
    }

    public final void onNext(T t) {
        if (this.f31469g) {
            requireSourceObserver().onNext(t);
        } else if (this.f31467e.get()) {
            requireSourceObserver().onNext(t);
        } else {
            this.f31465c = t;
        }
        this.f31466d = t;
    }

    @C0200t(mo345a = C0177a.ON_ANY)
    public final void onLifecycleEvent(C0184k kVar) {
        boolean z;
        T t;
        C52711k.m112240b(kVar, "realOwner");
        C0176h lifecycle = kVar.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "realOwner.lifecycle");
        if (lifecycle.mo323a().isAtLeast(C0178b.STARTED)) {
            if (kVar instanceof C11930q) {
                z = ((C11930q) kVar).mo22644a();
            } else {
                z = true;
            }
            if (!this.f31467e.getAndSet(true) && !isDisposed()) {
                if (z || !this.f31468f || this.f31466d == null) {
                    t = this.f31465c;
                } else {
                    t = this.f31466d;
                }
                this.f31465c = null;
                if (t != null) {
                    onNext(t);
                }
            }
            return;
        }
        this.f31467e.set(false);
    }

    public final void onSubscribe(C1690c cVar) {
        boolean z;
        C52711k.m112240b(cVar, "d");
        AtomicReference atomicReference = this;
        if (!compareAndSet(null, cVar)) {
            cVar.dispose();
            if (((C1690c) atomicReference.get()) != C11879b.f31478a) {
                C2150a.m6492a((Throwable) new C1703e("Disposable already set!"));
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (C11894g.m24248b()) {
                requireOwner().getLifecycle().mo324a(this);
                requireSourceObserver().onSubscribe(this);
                return;
            }
            C11894g.f31507a.post(new C11875a(this));
        }
    }

    public LifecycleAwareObserver(C0184k kVar, boolean z, boolean z2, C52671b<? super T, C52860x> bVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(bVar, "onNext");
        this.f31468f = z;
        this.f31469g = z2;
        this.f31463a = kVar;
        this.f31464b = new C1768m(new C11876b(bVar), C1723a.f5847f, C1723a.f5844c, C1723a.m6037b());
        this.f31467e = new AtomicBoolean(false);
    }

    public /* synthetic */ LifecycleAwareObserver(C0184k kVar, boolean z, boolean z2, C52671b bVar, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        this(kVar, z, z2, bVar);
    }
}
