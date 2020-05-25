package com.p683ss.android.ugc.aweme.p1402b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.p683ss.android.ugc.aweme.C24055bu;

/* renamed from: com.ss.android.ugc.aweme.b.a */
public final class C23343a {

    /* renamed from: a */
    static final C24055bu f62347a = new C24055bu();

    /* renamed from: b */
    public static final C23343a f62348b = new C23343a();

    /* renamed from: c */
    private static final HandlerThread f62349c = new HandlerThread("AsyncInflateHandler");

    /* renamed from: d */
    private static final Handler f62350d = new Handler(f62349c.getLooper());

    private C23343a() {
    }

    /* renamed from: a */
    public static Handler m57406a() {
        return f62350d;
    }

    static {
        f62349c.start();
        Process.setThreadPriority(f62349c.getThreadId(), -20);
    }
}
