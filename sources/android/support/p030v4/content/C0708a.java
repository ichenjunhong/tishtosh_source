package android.support.p030v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p030v4.p038f.C0802p;
import android.support.p030v4.p040os.C0964d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.content.a */
public abstract class C0708a<D> extends C0729f<D> {

    /* renamed from: a */
    volatile C0709a f2491a;

    /* renamed from: b */
    volatile C0709a f2492b;

    /* renamed from: c */
    long f2493c;

    /* renamed from: d */
    long f2494d;

    /* renamed from: e */
    Handler f2495e;

    /* renamed from: f */
    private final Executor f2496f;

    /* renamed from: android.support.v4.content.a$a */
    final class C0709a extends C0736h<Void, Void, D> implements Runnable {

        /* renamed from: a */
        boolean f2497a;

        /* renamed from: h */
        private final CountDownLatch f2499h = new CountDownLatch(1);

        public final void run() {
            this.f2497a = false;
            C0708a.this.mo2370c();
        }

        C0709a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public D mo2373a(Void... voidArr) {
            try {
                return C0708a.this.mo2371d();
            } catch (C0964d e) {
                if (mo2408a()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo2375b(D d) {
            try {
                C0708a.this.mo2366a(this, d);
            } finally {
                this.f2499h.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo2374a(D d) {
            try {
                C0708a aVar = C0708a.this;
                if (aVar.f2491a != this) {
                    aVar.mo2366a(this, d);
                } else if (aVar.f2534r) {
                    aVar.mo2367a(d);
                } else {
                    aVar.f2537u = false;
                    aVar.f2494d = SystemClock.uptimeMillis();
                    aVar.f2491a = null;
                    aVar.mo2386b(d);
                }
            } finally {
                this.f2499h.countDown();
            }
        }
    }

    /* renamed from: a */
    public void mo2367a(D d) {
    }

    /* renamed from: d */
    public abstract D mo2371d();

    /* renamed from: e */
    public void mo2372e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2365a() {
        super.mo2365a();
        mo2393k();
        this.f2491a = new C0709a<>();
        mo2370c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo2369b() {
        if (this.f2491a == null) {
            return false;
        }
        if (!this.f2533q) {
            this.f2536t = true;
        }
        if (this.f2492b != null) {
            if (this.f2491a.f2497a) {
                this.f2491a.f2497a = false;
                this.f2495e.removeCallbacks(this.f2491a);
            }
            this.f2491a = null;
            return false;
        } else if (this.f2491a.f2497a) {
            this.f2491a.f2497a = false;
            this.f2495e.removeCallbacks(this.f2491a);
            this.f2491a = null;
            return false;
        } else {
            C0709a aVar = this.f2491a;
            aVar.f2560f.set(true);
            boolean cancel = aVar.f2558d.cancel(false);
            if (cancel) {
                this.f2492b = this.f2491a;
                mo2372e();
            }
            this.f2491a = null;
            return cancel;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2370c() {
        if (this.f2492b == null && this.f2491a != null) {
            if (this.f2491a.f2497a) {
                this.f2491a.f2497a = false;
                this.f2495e.removeCallbacks(this.f2491a);
            }
            if (this.f2493c <= 0 || SystemClock.uptimeMillis() >= this.f2494d + this.f2493c) {
                this.f2491a.mo2407a(this.f2496f, null);
            } else {
                this.f2491a.f2497a = true;
                this.f2495e.postAtTime(this.f2491a, this.f2494d + this.f2493c);
            }
        }
    }

    public C0708a(Context context) {
        this(context, C0736h.f2555c);
    }

    private C0708a(Context context, Executor executor) {
        super(context);
        this.f2494d = -10000;
        this.f2496f = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2366a(C0709a aVar, D d) {
        mo2367a(d);
        if (this.f2492b == aVar) {
            if (this.f2537u) {
                mo2398p();
            }
            this.f2494d = SystemClock.uptimeMillis();
            this.f2492b = null;
            mo2370c();
        }
    }

    /* renamed from: a */
    public void mo2368a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo2368a(str, fileDescriptor, printWriter, strArr);
        if (this.f2491a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f2491a);
            printWriter.print(" waiting=");
            printWriter.println(this.f2491a.f2497a);
        }
        if (this.f2492b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f2492b);
            printWriter.print(" waiting=");
            printWriter.println(this.f2492b.f2497a);
        }
        if (this.f2493c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0802p.m2294a(this.f2493c, printWriter, 0);
            printWriter.print(" mLastLoadCompleteTime=");
            long j = this.f2494d;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j == 0) {
                printWriter.print("--");
            } else {
                C0802p.m2294a(j - uptimeMillis, printWriter, 0);
            }
            printWriter.println();
        }
    }
}
