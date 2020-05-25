package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class bnz extends Thread {

    /* renamed from: a */
    volatile boolean f43167a;

    /* renamed from: b */
    private final BlockingQueue<brw<?>> f43168b;

    /* renamed from: c */
    private final bmz f43169c;

    /* renamed from: d */
    private final C16399yi f43170d;

    /* renamed from: e */
    private final C15678b f43171e;

    public bnz(BlockingQueue<brw<?>> blockingQueue, bmz bmz, C16399yi yiVar, C15678b bVar) {
        this.f43168b = blockingQueue;
        this.f43169c = bmz;
        this.f43170d = yiVar;
        this.f43171e = bVar;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                brw brw = (brw) this.f43168b.take();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    brw.mo30630b("network-queue-take");
                    TrafficStats.setThreadStatsTag(brw.f43727c);
                    bpz a = this.f43169c.mo28726a(brw);
                    brw.mo30630b("network-http-complete");
                    if (!a.f43521e || !brw.mo30636f()) {
                        bxw a2 = brw.mo28746a(a);
                        brw.mo30630b("network-parse-complete");
                        if (brw.f43732h && a2.f44529b != null) {
                            this.f43170d.mo31129a(brw.mo30631c(), a2.f44529b);
                            brw.mo30630b("network-cache-written");
                        }
                        brw.mo30635e();
                        this.f43171e.mo29909a(brw, a2);
                        brw.mo30629a(a2);
                    } else {
                        brw.mo30632c("not-modified");
                        brw.mo30637g();
                    }
                } catch (C15812cq e) {
                    e.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.f43171e.mo29911a(brw, e);
                    brw.mo30637g();
                } catch (Exception e2) {
                    new Object[1][0] = e2.toString();
                    C15812cq cqVar = new C15812cq((Throwable) e2);
                    cqVar.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.f43171e.mo29911a(brw, cqVar);
                    brw.mo30637g();
                }
            } catch (InterruptedException unused) {
                if (this.f43167a) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
