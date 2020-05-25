package com.bytedance.ies.p661d.p662a.p663a;

import android.os.Process;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p661d.p662a.C10627a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ies.d.a.a.a */
final class C10629a extends Thread {

    /* renamed from: a */
    protected static final AtomicInteger f28160a = new AtomicInteger();

    /* renamed from: b */
    volatile boolean f28161b;

    /* renamed from: c */
    private final BlockingQueue<C10627a> f28162c;

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                C10627a aVar = (C10627a) this.f28162c.take();
                String name = Thread.currentThread().getName();
                String str = aVar.mName;
                try {
                    if (!aVar.isCanceled()) {
                        if (!C9431p.m18664a(str) && !C9431p.m18664a(name)) {
                            Thread.currentThread().setName(str);
                        }
                        aVar.run();
                        if (!C9431p.m18664a(str) && !C9431p.m18664a(name)) {
                            Thread.currentThread().setName(name);
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (InterruptedException unused2) {
                if (this.f28161b) {
                    return;
                }
            }
        }
    }

    public C10629a(BlockingQueue<C10627a> blockingQueue) {
        super("ApiDispatcher-Thread");
        this.f28162c = blockingQueue;
    }
}
