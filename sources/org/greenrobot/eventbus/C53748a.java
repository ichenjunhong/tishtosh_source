package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.a */
final class C53748a implements Runnable, C53770l {

    /* renamed from: a */
    private final C53769k f133292a = new C53769k();

    /* renamed from: b */
    private final C53755c f133293b;

    public final void run() {
        C53768j a = this.f133292a.mo112972a();
        if (a != null) {
            this.f133293b.mo112956a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }

    C53748a(C53755c cVar) {
        this.f133293b = cVar;
    }

    /* renamed from: a */
    public final void mo112947a(C53776q qVar, Object obj) {
        this.f133292a.mo112974a(C53768j.m114354a(qVar, obj));
        this.f133293b.f133310c.execute(this);
    }
}
