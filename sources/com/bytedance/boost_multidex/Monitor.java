package com.bytedance.boost_multidex;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Monitor {
    private static Monitor sMonitor;
    private ScheduledExecutorService mExecutor = _lancet.m18398x62f20904(1);
    private String mProcessName;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool */
        static ScheduledExecutorService m18398x62f20904(int i) {
            return (ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(i).mo49847a());
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (C18973a.m46144a(str)) {
                    C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                    StringBuilder sb = new StringBuilder();
                    C47964c.m103778e();
                    sb.append(C47964c.m103775a());
                    sb.append("/lib");
                    sb.append(str);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        C18973a.m46142a(str, 2);
                        System.load(sb2);
                        C18973a.m46141a(uptimeMillis, str);
                        return;
                    }
                    C18973a.m46142a(str, 3);
                }
            } catch (Throwable unused) {
            }
            C11511a.m23578a(str);
            C18973a.m46141a(uptimeMillis, str);
        }
    }

    static Monitor get() {
        return sMonitor;
    }

    static void init(Monitor monitor) {
        if (monitor == null) {
            monitor = new Monitor();
        }
        sMonitor = monitor;
    }

    /* access modifiers changed from: protected */
    public void doAfterInstall(final Runnable runnable) {
        Looper.myQueue().addIdleHandler(new IdleHandler() {
            public boolean queueIdle() {
                Monitor.this.getExecutor().schedule(runnable, 5000, TimeUnit.MILLISECONDS);
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void doBeforeHandleOpt() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public ScheduledExecutorService getExecutor() {
        return this.mExecutor;
    }

    /* access modifiers changed from: protected */
    public String getProcessName() {
        return this.mProcessName;
    }

    /* access modifiers changed from: protected */
    public boolean isEnableNativeCheckSum() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void logErrorAfterInstall(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void logInfo(String str) {
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str) {
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void reportAfterInstall(long j, long j2, long j3, String str) {
    }

    public Monitor setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.mExecutor = scheduledExecutorService;
        return this;
    }

    public Monitor setProcessName(String str) {
        this.mProcessName = str;
        return this;
    }
}
