package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;
import android.os.Handler;

/* renamed from: android.arch.lifecycle.w */
public final class C0207w {

    /* renamed from: a */
    public final C0185l f481a;

    /* renamed from: b */
    private final Handler f482b = new Handler();

    /* renamed from: c */
    private C0208a f483c;

    /* renamed from: android.arch.lifecycle.w$a */
    static class C0208a implements Runnable {

        /* renamed from: a */
        final C0177a f484a;

        /* renamed from: b */
        private final C0185l f485b;

        /* renamed from: c */
        private boolean f486c;

        public final void run() {
            if (!this.f486c) {
                this.f485b.mo332a(this.f484a);
                this.f486c = true;
            }
        }

        C0208a(C0185l lVar, C0177a aVar) {
            this.f485b = lVar;
            this.f484a = aVar;
        }
    }

    public C0207w(C0184k kVar) {
        this.f481a = new C0185l(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo356a(C0177a aVar) {
        if (this.f483c != null) {
            this.f483c.run();
        }
        this.f483c = new C0208a(this.f481a, aVar);
        this.f482b.postAtFrontOfQueue(this.f483c);
    }
}
