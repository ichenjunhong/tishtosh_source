package com.bytedance.p126ad.symphony.p139i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.common.utility.p523c.C9388b;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.ad.symphony.i.a */
public class C2742a {

    /* renamed from: a */
    public static final Handler f8294a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final HandlerThread f8295b;

    /* renamed from: c */
    private static Handler f8296c = new Handler(f8295b.getLooper());

    /* renamed from: d */
    private static ExecutorService f8297d;

    /* renamed from: a */
    public static Looper m7828a() {
        return f8295b.getLooper();
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ad-symphony-single-thread");
        f8295b = handlerThread;
        handlerThread.start();
    }

    /* renamed from: b */
    private static ExecutorService m7831b() {
        if (f8297d == null) {
            synchronized (C2742a.class) {
                if (f8297d == null) {
                    f8297d = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(2).mo49846a((ThreadFactory) new C9388b("ad-symphony-thread-pool")).mo49847a());
                }
            }
        }
        return f8297d;
    }

    /* renamed from: a */
    public static void m7829a(Runnable runnable) {
        m7831b().execute(runnable);
    }

    /* renamed from: a */
    public static synchronized void m7830a(ExecutorService executorService) {
        synchronized (C2742a.class) {
            if (f8297d != null) {
                new StringBuilder("executor service not none:").append(f8297d);
            } else {
                f8297d = executorService;
            }
        }
    }
}
