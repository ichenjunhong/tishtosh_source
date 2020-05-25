package com.bytedance.android.p161c.p169h;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.android.c.h.b */
public final class C2862b {

    /* renamed from: a */
    public static ExecutorService f8522a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a((ThreadFactory) new C2864a()).mo49847a());

    /* renamed from: com.bytedance.android.c.h.b$a */
    static class C2864a implements ThreadFactory {
        private C2864a() {
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "direct-buffer-clean");
        }
    }
}
