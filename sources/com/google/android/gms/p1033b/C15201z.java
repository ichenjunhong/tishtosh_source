package com.google.android.gms.p1033b;

import com.google.android.gms.common.internal.C15464q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.z */
public final class C15201z<TResult> extends C15179g<TResult> {

    /* renamed from: a */
    private final Object f39239a = new Object();

    /* renamed from: b */
    private final C15199x<TResult> f39240b = new C15199x<>();

    /* renamed from: c */
    private boolean f39241c;

    /* renamed from: d */
    private volatile boolean f39242d;

    /* renamed from: e */
    private TResult f39243e;

    /* renamed from: f */
    private Exception f39244f;

    C15201z() {
    }

    /* renamed from: a */
    public final boolean mo27998a() {
        boolean z;
        synchronized (this.f39239a) {
            z = this.f39241c;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo28001c() {
        return this.f39242d;
    }

    /* renamed from: b */
    public final boolean mo28000b() {
        boolean z;
        synchronized (this.f39239a) {
            z = this.f39241c && !this.f39242d && this.f39244f == null;
        }
        return z;
    }

    /* renamed from: d */
    public final TResult mo28002d() {
        TResult tresult;
        synchronized (this.f39239a) {
            m31420g();
            m31422i();
            if (this.f39244f == null) {
                tresult = this.f39243e;
            } else {
                throw new C15178f(this.f39244f);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo27997a(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f39239a) {
            m31420g();
            m31422i();
            if (cls.isInstance(this.f39244f)) {
                throw ((Throwable) cls.cast(this.f39244f));
            } else if (this.f39244f == null) {
                tresult = this.f39243e;
            } else {
                throw new C15178f(this.f39244f);
            }
        }
        return tresult;
    }

    /* renamed from: e */
    public final Exception mo28003e() {
        Exception exc;
        synchronized (this.f39239a) {
            exc = this.f39244f;
        }
        return exc;
    }

    /* renamed from: a */
    public final C15179g<TResult> mo27996a(Executor executor, C15177e<? super TResult> eVar) {
        this.f39240b.mo28016a((C15198w<TResult>) new C15196u<TResult>(executor, eVar));
        m31423j();
        return this;
    }

    /* renamed from: a */
    public final C15179g<TResult> mo27995a(Executor executor, C15176d dVar) {
        this.f39240b.mo28016a((C15198w<TResult>) new C15194s<TResult>(executor, dVar));
        m31423j();
        return this;
    }

    /* renamed from: a */
    public final C15179g<TResult> mo27991a(C15175c<TResult> cVar) {
        return mo27994a(C15181i.f39203a, cVar);
    }

    /* renamed from: a */
    public final C15179g<TResult> mo27994a(Executor executor, C15175c<TResult> cVar) {
        this.f39240b.mo28016a((C15198w<TResult>) new C15192q<TResult>(executor, cVar));
        m31423j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C15179g<TContinuationResult> mo27990a(C15172a<TResult, TContinuationResult> aVar) {
        return mo27992a(C15181i.f39203a, aVar);
    }

    /* renamed from: a */
    public final <TContinuationResult> C15179g<TContinuationResult> mo27992a(Executor executor, C15172a<TResult, TContinuationResult> aVar) {
        C15201z zVar = new C15201z();
        this.f39240b.mo28016a((C15198w<TResult>) new C15186k<TResult>(executor, aVar, zVar));
        m31423j();
        return zVar;
    }

    /* renamed from: a */
    public final C15179g<TResult> mo27993a(Executor executor, C15174b bVar) {
        this.f39240b.mo28016a((C15198w<TResult>) new C15190o<TResult>(executor, bVar));
        m31423j();
        return this;
    }

    /* renamed from: b */
    public final <TContinuationResult> C15179g<TContinuationResult> mo27999b(Executor executor, C15172a<TResult, C15179g<TContinuationResult>> aVar) {
        C15201z zVar = new C15201z();
        this.f39240b.mo28016a((C15198w<TResult>) new C15188m<TResult>(executor, aVar, zVar));
        m31423j();
        return zVar;
    }

    /* renamed from: a */
    public final void mo28019a(TResult tresult) {
        synchronized (this.f39239a) {
            m31421h();
            this.f39241c = true;
            this.f39243e = tresult;
        }
        this.f39240b.mo28015a((C15179g<TResult>) this);
    }

    /* renamed from: b */
    public final boolean mo28021b(TResult tresult) {
        synchronized (this.f39239a) {
            if (this.f39241c) {
                return false;
            }
            this.f39241c = true;
            this.f39243e = tresult;
            this.f39240b.mo28015a((C15179g<TResult>) this);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo28018a(Exception exc) {
        C15464q.m32124a(exc, (Object) "Exception must not be null");
        synchronized (this.f39239a) {
            m31421h();
            this.f39241c = true;
            this.f39244f = exc;
        }
        this.f39240b.mo28015a((C15179g<TResult>) this);
    }

    /* renamed from: b */
    public final boolean mo28020b(Exception exc) {
        C15464q.m32124a(exc, (Object) "Exception must not be null");
        synchronized (this.f39239a) {
            if (this.f39241c) {
                return false;
            }
            this.f39241c = true;
            this.f39244f = exc;
            this.f39240b.mo28015a((C15179g<TResult>) this);
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo28022f() {
        synchronized (this.f39239a) {
            if (this.f39241c) {
                return false;
            }
            this.f39241c = true;
            this.f39242d = true;
            this.f39240b.mo28015a((C15179g<TResult>) this);
            return true;
        }
    }

    /* renamed from: g */
    private final void m31420g() {
        C15464q.m32130a(this.f39241c, (Object) "Task is not yet complete");
    }

    /* renamed from: h */
    private final void m31421h() {
        C15464q.m32130a(!this.f39241c, (Object) "Task is already complete");
    }

    /* renamed from: i */
    private final void m31422i() {
        if (this.f39242d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m31423j() {
        synchronized (this.f39239a) {
            if (this.f39241c) {
                this.f39240b.mo28015a((C15179g<TResult>) this);
            }
        }
    }
}
