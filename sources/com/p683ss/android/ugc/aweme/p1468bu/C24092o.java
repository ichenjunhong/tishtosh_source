package com.p683ss.android.ugc.aweme.p1468bu;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.bu.o */
final class C24092o {

    /* renamed from: a */
    private final Map<String, WeakReference<ExecutorService>> f63949a = new HashMap();

    /* renamed from: b */
    private Map<C24093p, AtomicInteger> f63950b = new HashMap();

    C24092o() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : this.f63949a.entrySet()) {
            String str = (String) entry.getKey();
            if (((WeakReference) entry.getValue()).get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) ((WeakReference) entry.getValue()).get();
                sb.append("pool=");
                sb.append(str);
                sb.append(", core.size=");
                sb.append(threadPoolExecutor.getCorePoolSize());
                sb.append(", pool.size=");
                sb.append(threadPoolExecutor.getPoolSize());
                sb.append(", largest.pool.size=");
                sb.append(threadPoolExecutor.getLargestPoolSize());
                sb.append(", queue.size=");
                sb.append(threadPoolExecutor.getQueue().size());
                sb.append(", task.count=");
                sb.append(threadPoolExecutor.getTaskCount());
                sb.append(", task.completed.count=");
                sb.append(threadPoolExecutor.getCompletedTaskCount());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49849a(C24093p pVar, ExecutorService executorService, boolean z) {
        if (z) {
            this.f63949a.put(pVar.name(), new WeakReference(executorService));
            return;
        }
        if (this.f63950b.get(pVar) == null) {
            this.f63950b.put(pVar, new AtomicInteger(0));
        }
        Map<String, WeakReference<ExecutorService>> map = this.f63949a;
        StringBuilder sb = new StringBuilder();
        sb.append(pVar.name());
        sb.append("_");
        sb.append(((AtomicInteger) this.f63950b.get(pVar)).incrementAndGet());
        map.put(sb.toString(), new WeakReference(executorService));
    }
}
