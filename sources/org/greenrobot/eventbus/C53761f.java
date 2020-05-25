package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: org.greenrobot.eventbus.f */
public final class C53761f extends Handler implements C53770l {

    /* renamed from: a */
    private final C53769k f133349a = new C53769k();

    /* renamed from: b */
    private final int f133350b = 10;

    /* renamed from: c */
    private final C53755c f133351c;

    /* renamed from: d */
    private boolean f133352d;

    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C53768j a = this.f133349a.mo112972a();
                if (a == null) {
                    synchronized (this) {
                        a = this.f133349a.mo112972a();
                        if (a == null) {
                            this.f133352d = false;
                            this.f133352d = false;
                            return;
                        }
                    }
                }
                this.f133351c.mo112956a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f133350b));
            if (sendMessage(obtainMessage())) {
                this.f133352d = true;
                return;
            }
            throw new C53760e("Could not send handler message");
        } catch (Throwable th) {
            this.f133352d = false;
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo112947a(C53776q qVar, Object obj) {
        C53768j a = C53768j.m114354a(qVar, obj);
        synchronized (this) {
            this.f133349a.mo112974a(a);
            if (!this.f133352d) {
                this.f133352d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new C53760e("Could not send handler message");
                }
            }
        }
    }

    protected C53761f(C53755c cVar, Looper looper, int i) {
        super(looper);
        this.f133351c = cVar;
    }
}
