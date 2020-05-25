package com.twitter.sdk.android.core.internal;

import com.C2240a;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.twitter.sdk.android.core.internal.k */
final /* synthetic */ class C52118k implements Runnable {

    /* renamed from: a */
    private final ExecutorService f129726a;

    /* renamed from: b */
    private final long f129727b;

    /* renamed from: c */
    private final TimeUnit f129728c;

    /* renamed from: d */
    private final String f129729d;

    C52118k(ExecutorService executorService, long j, TimeUnit timeUnit, String str) {
        this.f129726a = executorService;
        this.f129727b = j;
        this.f129728c = timeUnit;
        this.f129729d = str;
    }

    public final void run() {
        ExecutorService executorService = this.f129726a;
        long j = this.f129727b;
        TimeUnit timeUnit = this.f129728c;
        String str = this.f129729d;
        try {
            executorService.shutdown();
            if (!executorService.awaitTermination(j, timeUnit)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" did not shutdown in the allocated time. Requesting immediate shutdown.");
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            C2240a.m6773a(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str});
            executorService.shutdownNow();
        }
    }
}
