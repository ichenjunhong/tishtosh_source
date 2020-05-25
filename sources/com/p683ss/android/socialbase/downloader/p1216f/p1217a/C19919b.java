package com.p683ss.android.socialbase.downloader.p1216f.p1217a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;

/* renamed from: com.ss.android.socialbase.downloader.f.a.b */
public final class C19919b {

    /* renamed from: a */
    public static final Handler f54728a;

    /* renamed from: b */
    public static long f54729b;

    /* renamed from: c */
    public static long f54730c;

    /* renamed from: d */
    private static final HandlerThread f54731d;

    static {
        HandlerThread handlerThread = new HandlerThread("Downloader-preconnecter");
        f54731d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(f54731d.getLooper());
        f54728a = handler;
        handler.post(new Runnable() {
            public final void run() {
                Process.setThreadPriority(10);
            }
        });
    }
}
