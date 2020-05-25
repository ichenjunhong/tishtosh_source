package com.p683ss.android.ugc.aweme.app;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.ugc.aweme.app.ad */
public final class C22924ad implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        BlockingQueue queue = threadPoolExecutor.getQueue();
        StringBuilder sb = new StringBuilder("Task ");
        sb.append(runnable.toString());
        sb.append(" rejected from ");
        sb.append(threadPoolExecutor.toString());
        sb.append(" Pending tasks: ");
        sb.append(queue);
        C32458a.m75144a(sb.toString());
    }
}
