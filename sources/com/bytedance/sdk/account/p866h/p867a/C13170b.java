package com.bytedance.sdk.account.p866h.p867a;

import android.os.Process;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.sdk.account.p866h.p867a.C13173e.C13174a;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.sdk.account.h.a.b */
final class C13170b extends Thread {

    /* renamed from: a */
    volatile boolean f34379a;

    /* renamed from: b */
    private final BlockingQueue<C13173e> f34380b;

    /* renamed from: c */
    private final BlockingQueue<C13173e> f34381c;

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                C13173e eVar = (C13173e) this.f34380b.take();
                C13171c cVar = null;
                if (eVar instanceof C13171c) {
                    cVar = (C13171c) eVar;
                }
                if (cVar != null) {
                    String name = Thread.currentThread().getName();
                    String str = cVar.f34386d;
                    try {
                        if (!cVar.mo24779a()) {
                            if (!C9431p.m18664a(str) && !C9431p.m18664a(name)) {
                                Thread currentThread = Thread.currentThread();
                                StringBuilder sb = new StringBuilder("ApiLocalDispatcher-");
                                sb.append(str);
                                currentThread.setName(sb.toString());
                            }
                            if (C9415i.m18635b()) {
                                this.f34380b.size();
                                this.f34381c.size();
                            }
                            if (cVar.mo24783d() == C13174a.IMMEDIATE) {
                                C9393e.submitRunnable(cVar);
                            } else {
                                cVar.mo24785f();
                                this.f34381c.add(cVar);
                            }
                            if (!C9431p.m18664a(str) && !C9431p.m18664a(name)) {
                                Thread.currentThread().setName(name);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException unused2) {
                if (this.f34379a) {
                    return;
                }
            }
        }
    }

    public C13170b(BlockingQueue<C13173e> blockingQueue, BlockingQueue<C13173e> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f34380b = blockingQueue;
        this.f34381c = blockingQueue2;
    }
}
