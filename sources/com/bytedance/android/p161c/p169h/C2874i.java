package com.bytedance.android.p161c.p169h;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.android.c.h.i */
public final class C2874i {

    /* renamed from: a */
    static ExecutorService f8544a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(4).mo49846a((ThreadFactory) new C2876a()).mo49847a());

    /* renamed from: com.bytedance.android.c.h.i$a */
    static class C2876a implements ThreadFactory {

        /* renamed from: a */
        private volatile int f8545a;

        private C2876a() {
        }

        public final Thread newThread(Runnable runnable) {
            int i;
            synchronized (this) {
                i = this.f8545a;
                this.f8545a = i + 1;
            }
            StringBuilder sb = new StringBuilder("so-decompress-");
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }
}
