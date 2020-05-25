package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C15464q;

@C16299uq
public final class aee {

    /* renamed from: a */
    public Handler f40344a;

    /* renamed from: b */
    private HandlerThread f40345b;

    /* renamed from: c */
    private int f40346c;

    /* renamed from: d */
    private final Object f40347d = new Object();

    /* renamed from: a */
    public final Looper mo28747a() {
        Looper looper;
        synchronized (this.f40347d) {
            if (this.f40346c != 0) {
                C15464q.m32124a(this.f40345b, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f40345b == null) {
                abv.m32494a("Starting the looper thread.");
                this.f40345b = new HandlerThread("LooperProvider");
                this.f40345b.start();
                this.f40344a = new apf(this.f40345b.getLooper());
                abv.m32494a("Looper thread started.");
            } else {
                abv.m32494a("Resuming the looper thread");
                this.f40347d.notifyAll();
            }
            this.f40346c++;
            looper = this.f40345b.getLooper();
        }
        return looper;
    }
}
