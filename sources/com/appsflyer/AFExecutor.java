package com.appsflyer;

import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {

    /* renamed from: ˋ */
    private static AFExecutor f7691;

    /* renamed from: ˊ */
    private ScheduledExecutorService f7692;

    /* renamed from: ˎ */
    private Executor f7693;

    class _lancet {
        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool */
        static ExecutorService m7248x638be38b(int i) {
            return C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(i).mo49847a());
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool */
        static ScheduledExecutorService m7249x62f20904(int i) {
            return (ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(i).mo49847a());
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor */
        static ExecutorService m7250x6416be54() {
            return C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
        }
    }

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f7691 == null) {
            f7691 = new AFExecutor();
        }
        return f7691;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo6915() {
        try {
            m7245(this.f7692);
            if (this.f7693 instanceof ThreadPoolExecutor) {
                m7245((ThreadPoolExecutor) this.f7693);
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("failed to stop Executors", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final ScheduledThreadPoolExecutor mo6914() {
        boolean z;
        if (this.f7692 == null || this.f7692.isShutdown() || this.f7692.isTerminated()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f7692 = _lancet.m7249x62f20904(2);
        }
        return (ScheduledThreadPoolExecutor) this.f7692;
    }

    public Executor getThreadPoolExecutor() {
        boolean z;
        if (this.f7693 == null || ((this.f7693 instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) this.f7693).isShutdown() || ((ThreadPoolExecutor) this.f7693).isTerminated() || ((ThreadPoolExecutor) this.f7693).isTerminating()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (VERSION.SDK_INT < 11) {
                return _lancet.m7250x6416be54();
            }
            this.f7693 = _lancet.m7248x638be38b(2);
        }
        return this.f7693;
    }

    /* renamed from: ॱ */
    private static void m7245(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
