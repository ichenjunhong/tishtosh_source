package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;

final class bla extends Handler implements Runnable {

    /* renamed from: a */
    private final blb f42835a;

    /* renamed from: b */
    private final bky f42836b;

    /* renamed from: c */
    private final int f42837c;

    /* renamed from: d */
    private volatile Thread f42838d;

    /* renamed from: e */
    private final /* synthetic */ bkx f42839e;

    public bla(bkx bkx, Looper looper, blb blb, bky bky, int i) {
        this.f42839e = bkx;
        super(looper);
        this.f42835a = blb;
        this.f42836b = bky;
    }

    /* renamed from: a */
    public final void mo30322a() {
        this.f42835a.mo30278a();
        if (this.f42838d != null) {
            this.f42838d.interrupt();
        }
    }

    public final void run() {
        try {
            this.f42838d = Thread.currentThread();
            if (this.f42837c > 0) {
                Thread.sleep((long) this.f42837c);
            }
            if (!this.f42835a.mo30279b()) {
                this.f42835a.mo30280c();
            }
            sendEmptyMessage(0);
        } catch (IOException e) {
            obtainMessage(1, e).sendToTarget();
        } catch (InterruptedException unused) {
            blg.m36001b(this.f42835a.mo30279b());
            sendEmptyMessage(0);
        } catch (Exception e2) {
            obtainMessage(1, new blc(e2)).sendToTarget();
        } catch (Error e3) {
            obtainMessage(2, e3).sendToTarget();
            throw e3;
        }
    }

    public final void handleMessage(Message message) {
        if (message.what != 2) {
            this.f42839e.f42828c = false;
            this.f42839e.f42827b = null;
            if (this.f42835a.mo30279b()) {
                this.f42836b.mo30277b(this.f42835a);
                return;
            }
            switch (message.what) {
                case 0:
                    this.f42836b.mo30275a(this.f42835a);
                    return;
                case 1:
                    this.f42836b.mo30276a(this.f42835a, (IOException) message.obj);
                    break;
            }
            return;
        }
        throw ((Error) message.obj);
    }
}
