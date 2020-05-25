package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.k */
final class C53769k {

    /* renamed from: a */
    private C53768j f133362a;

    /* renamed from: b */
    private C53768j f133363b;

    C53769k() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C53768j mo112972a() {
        C53768j jVar;
        jVar = this.f133362a;
        if (this.f133362a != null) {
            this.f133362a = this.f133362a.f133361c;
            if (this.f133362a == null) {
                this.f133363b = null;
            }
        }
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C53768j mo112973a(int i) throws InterruptedException {
        if (this.f133362a == null) {
            wait(1000);
        }
        return mo112972a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo112974a(C53768j jVar) {
        if (jVar != null) {
            if (this.f133363b != null) {
                this.f133363b.f133361c = jVar;
                this.f133363b = jVar;
            } else if (this.f133362a == null) {
                this.f133363b = jVar;
                this.f133362a = jVar;
            } else {
                throw new IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }
}
