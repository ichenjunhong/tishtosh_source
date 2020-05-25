package com.google.android.play.core.p1056f;

import com.google.android.play.core.p1051c.C17295h;

/* renamed from: com.google.android.play.core.f.p */
final class C17378p<ResultT> extends C17365d<ResultT> {

    /* renamed from: a */
    private final Object f48893a = new Object();

    /* renamed from: b */
    private final C17375m<ResultT> f48894b = new C17375m<>();

    /* renamed from: c */
    private boolean f48895c;

    /* renamed from: d */
    private ResultT f48896d;

    /* renamed from: e */
    private Exception f48897e;

    C17378p() {
    }

    /* renamed from: e */
    private final void m42544e() {
        C17295h.m42359a(!this.f48895c, (Object) "Task is already complete");
    }

    /* renamed from: f */
    private final void m42545f() {
        synchronized (this.f48893a) {
            if (this.f48895c) {
                this.f48894b.mo33668a((C17365d<ResultT>) this);
            }
        }
    }

    /* renamed from: a */
    public final void mo33671a(Exception exc) {
        C17295h.m42357a(exc, (Object) "Exception must not be null");
        synchronized (this.f48893a) {
            m42544e();
            this.f48895c = true;
            this.f48897e = exc;
        }
        this.f48894b.mo33668a((C17365d<ResultT>) this);
    }

    /* renamed from: a */
    public final void mo33672a(ResultT resultt) {
        synchronized (this.f48893a) {
            m42544e();
            this.f48895c = true;
            this.f48896d = resultt;
        }
        this.f48894b.mo33668a((C17365d<ResultT>) this);
    }

    /* renamed from: a */
    public final boolean mo33658a() {
        boolean z;
        synchronized (this.f48893a) {
            z = this.f48895c;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo33659b() {
        boolean z;
        synchronized (this.f48893a) {
            z = this.f48895c && this.f48897e == null;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo33673b(Exception exc) {
        C17295h.m42357a(exc, (Object) "Exception must not be null");
        synchronized (this.f48893a) {
            if (this.f48895c) {
                return false;
            }
            this.f48895c = true;
            this.f48897e = exc;
            this.f48894b.mo33668a((C17365d<ResultT>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo33674b(ResultT resultt) {
        synchronized (this.f48893a) {
            if (this.f48895c) {
                return false;
            }
            this.f48895c = true;
            this.f48896d = resultt;
            this.f48894b.mo33668a((C17365d<ResultT>) this);
            return true;
        }
    }

    /* renamed from: d */
    public final Exception mo33661d() {
        Exception exc;
        synchronized (this.f48893a) {
            exc = this.f48897e;
        }
        return exc;
    }

    /* renamed from: c */
    public final ResultT mo33660c() {
        ResultT resultt;
        synchronized (this.f48893a) {
            C17295h.m42359a(this.f48895c, (Object) "Task is not yet complete");
            if (this.f48897e == null) {
                resultt = this.f48896d;
            } else {
                throw new C17364c(this.f48897e);
            }
        }
        return resultt;
    }

    /* renamed from: a */
    public final C17365d<ResultT> mo33657a(C17363b<? super ResultT> bVar) {
        this.f48894b.mo33669a((C17373k<ResultT>) new C17372j<ResultT>(C17366e.f48876a, bVar));
        m42545f();
        return this;
    }

    /* renamed from: a */
    public final C17365d<ResultT> mo33656a(C17362a aVar) {
        this.f48894b.mo33669a((C17373k<ResultT>) new C17369g<ResultT>(C17366e.f48876a, aVar));
        m42545f();
        return this;
    }
}
