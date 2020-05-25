package com.tencent.wcdb.support;

/* renamed from: com.tencent.wcdb.support.a */
public final class C51787a {

    /* renamed from: a */
    private boolean f129187a;

    /* renamed from: b */
    private C51788a f129188b;

    /* renamed from: c */
    private boolean f129189c;

    /* renamed from: com.tencent.wcdb.support.a$a */
    public interface C51788a {
        /* renamed from: b */
        void mo107159b();
    }

    /* renamed from: b */
    private boolean m111078b() {
        boolean z;
        synchronized (this) {
            z = this.f129187a;
        }
        return z;
    }

    /* renamed from: c */
    private void m111079c() {
        while (this.f129189c) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo107262a() {
        if (m111078b()) {
            throw new OperationCanceledException();
        }
    }

    /* renamed from: a */
    public final void mo107263a(C51788a aVar) {
        synchronized (this) {
            m111079c();
            if (this.f129188b != aVar) {
                this.f129188b = aVar;
                if (this.f129187a) {
                    if (aVar != null) {
                        aVar.mo107159b();
                    }
                }
            }
        }
    }
}
