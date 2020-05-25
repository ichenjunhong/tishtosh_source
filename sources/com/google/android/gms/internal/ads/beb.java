package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class beb extends Thread {

    /* renamed from: b */
    private static final boolean f42152b = C15840dr.f44899a;

    /* renamed from: a */
    final C15678b f42153a;

    /* renamed from: c */
    private final BlockingQueue<brw<?>> f42154c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BlockingQueue<brw<?>> f42155d;

    /* renamed from: e */
    private final C16399yi f42156e;

    /* renamed from: f */
    private volatile boolean f42157f;

    /* renamed from: g */
    private final bgc f42158g = new bgc(this);

    public beb(BlockingQueue<brw<?>> blockingQueue, BlockingQueue<brw<?>> blockingQueue2, C16399yi yiVar, C15678b bVar) {
        this.f42154c = blockingQueue;
        this.f42155d = blockingQueue2;
        this.f42156e = yiVar;
        this.f42153a = bVar;
    }

    /* renamed from: a */
    public final void mo30070a() {
        this.f42157f = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f42156e.mo31128a();
        while (true) {
            try {
                brw brw = (brw) this.f42154c.take();
                brw.mo30630b("cache-queue-take");
                auw a = this.f42156e.mo31127a(brw.mo30631c());
                if (a == null) {
                    brw.mo30630b("cache-miss");
                    if (!this.f42158g.m35576b(brw)) {
                        this.f42155d.put(brw);
                    }
                } else if (a.mo29558a()) {
                    brw.mo30630b("cache-hit-expired");
                    brw.mo30627a(a);
                    if (!this.f42158g.m35576b(brw)) {
                        this.f42155d.put(brw);
                    }
                } else {
                    brw.mo30630b("cache-hit");
                    bxw a2 = brw.mo28746a(new bpz(a.f41390a, a.f41396g));
                    brw.mo30630b("cache-hit-parsed");
                    if (a.f41395f < System.currentTimeMillis()) {
                        brw.mo30630b("cache-hit-refresh-needed");
                        brw.mo30627a(a);
                        a2.f44531d = true;
                        if (!this.f42158g.m35576b(brw)) {
                            this.f42153a.mo29910a(brw, a2, new bfb(this, brw));
                        }
                    }
                    this.f42153a.mo29909a(brw, a2);
                }
            } catch (InterruptedException unused) {
                if (this.f42157f) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
