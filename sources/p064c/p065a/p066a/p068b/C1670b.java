package p064c.p065a.p066a.p068b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p069b.C1691d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.a.b.b */
final class C1670b extends C1675ac {

    /* renamed from: b */
    private final Handler f5809b;

    /* renamed from: c */
    private final boolean f5810c;

    /* renamed from: c.a.a.b.b$a */
    static final class C1671a extends C1678c {

        /* renamed from: a */
        private final Handler f5811a;

        /* renamed from: b */
        private final boolean f5812b;

        /* renamed from: c */
        private volatile boolean f5813c;

        public final boolean isDisposed() {
            return this.f5813c;
        }

        public final void dispose() {
            this.f5813c = true;
            this.f5811a.removeCallbacksAndMessages(this);
        }

        C1671a(Handler handler, boolean z) {
            this.f5811a = handler;
            this.f5812b = z;
        }

        /* renamed from: a */
        public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f5813c) {
                return C1691d.m6003a();
            } else {
                C1672b bVar = new C1672b(this.f5811a, C2150a.m6489a(runnable));
                Message obtain = Message.obtain(this.f5811a, bVar);
                obtain.obj = this;
                if (this.f5812b) {
                    obtain.setAsynchronous(true);
                }
                this.f5811a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f5813c) {
                    return bVar;
                }
                this.f5811a.removeCallbacks(bVar);
                return C1691d.m6003a();
            }
        }
    }

    /* renamed from: c.a.a.b.b$b */
    static final class C1672b implements C1690c, Runnable {

        /* renamed from: a */
        private final Handler f5814a;

        /* renamed from: b */
        private final Runnable f5815b;

        /* renamed from: c */
        private volatile boolean f5816c;

        public final boolean isDisposed() {
            return this.f5816c;
        }

        public final void dispose() {
            this.f5814a.removeCallbacks(this);
            this.f5816c = true;
        }

        public final void run() {
            try {
                this.f5815b.run();
            } catch (Throwable th) {
                C2150a.m6492a(th);
            }
        }

        C1672b(Handler handler, Runnable runnable) {
            this.f5814a = handler;
            this.f5815b = runnable;
        }
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C1671a(this.f5809b, this.f5810c);
    }

    C1670b(Handler handler, boolean z) {
        this.f5809b = handler;
        this.f5810c = z;
    }

    /* renamed from: a */
    public final C1690c mo6131a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C1672b bVar = new C1672b(this.f5809b, C2150a.m6489a(runnable));
            Message obtain = Message.obtain(this.f5809b, bVar);
            if (this.f5810c) {
                obtain.setAsynchronous(true);
            }
            this.f5809b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
