package com.bytedance.ies.p661d.p662a.p663a;

import android.os.Process;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.p661d.p662a.C10627a;
import com.bytedance.ies.p661d.p662a.C10627a.C10628a;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.ies.d.a.a.b */
final class C10630b extends Thread {

    /* renamed from: a */
    volatile boolean f28163a;

    /* renamed from: b */
    private final BlockingQueue<C10627a> f28164b;

    /* renamed from: c */
    private final BlockingQueue<C10627a> f28165c;

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                C10627a aVar = (C10627a) this.f28164b.take();
                String name = Thread.currentThread().getName();
                String str = aVar.mName;
                try {
                    if (!aVar.isCanceled()) {
                        if (!C9431p.m18664a(str) && !C9431p.m18664a(name)) {
                            Thread currentThread = Thread.currentThread();
                            StringBuilder sb = new StringBuilder("ApiLocalDispatcher-");
                            sb.append(str);
                            currentThread.setName(sb.toString());
                        }
                        if (C9415i.m18635b()) {
                            this.f28164b.size();
                            this.f28165c.size();
                        }
                        if (!aVar.run4Local()) {
                            if (aVar.mPriority == C10628a.IMMEDIATE) {
                                C9393e.submitRunnable(aVar);
                            } else {
                                this.f28165c.add(aVar);
                            }
                        }
                        if (!C9431p.m18664a(str) && !C9431p.m18664a(name)) {
                            Thread.currentThread().setName(name);
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (InterruptedException unused2) {
                if (this.f28163a) {
                    return;
                }
            }
        }
    }

    public C10630b(BlockingQueue<C10627a> blockingQueue, BlockingQueue<C10627a> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f28164b = blockingQueue;
        this.f28165c = blockingQueue2;
    }
}
