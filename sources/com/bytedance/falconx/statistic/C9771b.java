package com.bytedance.falconx.statistic;

import android.content.Context;
import com.bytedance.falconx.statistic.p563a.C9770a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.falconx.statistic.b */
public class C9771b {

    /* renamed from: a */
    public static String f26588a;

    /* renamed from: b */
    public static String f26589b;

    /* renamed from: c */
    public static String f26590c;

    /* renamed from: f */
    private static volatile C9771b f26591f;

    /* renamed from: d */
    public ThreadPoolExecutor f26592d;

    /* renamed from: e */
    public C9770a f26593e;

    /* renamed from: a */
    public static C9771b m19560a(Context context) {
        if (f26591f == null) {
            synchronized (C9771b.class) {
                if (f26591f == null) {
                    f26591f = new C9771b(context);
                }
            }
        }
        return f26591f;
    }

    private C9771b(final Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("falconx-io-thread");
                thread.setPriority(3);
                return thread;
            }
        });
        this.f26592d = threadPoolExecutor;
        this.f26592d.allowCoreThreadTimeOut(true);
        this.f26592d.execute(new Runnable() {
            public final void run() {
                C9771b.this.f26593e = C9770a.m19558a(context);
            }
        });
    }
}
