package com.p683ss.android.ugc.aweme.lego;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35892c;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lego.b */
public final class C35883b {

    /* renamed from: a */
    public static final C35883b f92090a = new C35883b();

    /* renamed from: b */
    private static ExecutorService f92091b;

    /* renamed from: c */
    private static final ExecutorService f92092c;

    /* renamed from: d */
    private static final ExecutorService f92093d;

    /* renamed from: e */
    private static final HandlerThread f92094e = new HandlerThread("LegoHandler");

    /* renamed from: f */
    private static Handler f92095f = new Handler(f92094e.getLooper());

    /* renamed from: g */
    private static final C35892c f92096g = new C35892c();

    private C35883b() {
    }

    /* renamed from: a */
    public static ExecutorService m81028a() {
        return f92091b;
    }

    /* renamed from: b */
    public static Handler m81030b() {
        return f92095f;
    }

    /* renamed from: c */
    public static C35892c m81031c() {
        return f92096g;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f92091b = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 90, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f92092c = threadPoolExecutor2;
        ExecutorService c = C24076h.m58902c();
        C52711k.m112236a((Object) c, "ThreadPoolHelper.getIOExecutor()");
        f92093d = c;
        ExecutorService executorService = f92091b;
        if (executorService != null) {
            ((ThreadPoolExecutor) executorService).allowCoreThreadTimeOut(true);
            f92094e.start();
            Process.setThreadPriority(f92094e.getThreadId(), -20);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
    }

    /* renamed from: a */
    public static ExecutorService m81029a(C35897g gVar) {
        C52711k.m112240b(gVar, "requestType");
        if (gVar == C35897g.P0) {
            return f92093d;
        }
        return f92092c;
    }
}
