package com.bytedance.p785o.p797b;

import android.util.Log;
import com.bytedance.p785o.p797b.p798a.C12432c;
import com.bytedance.p785o.p797b.p798a.C12434d;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.o.b.f */
public final class C12441f {

    /* renamed from: a */
    public static final RejectedExecutionHandler f32722a = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (C12432c.f32696c) {
                C12434d dVar = (C12434d) C12432c.f32695b.get(threadPoolExecutor);
                if (dVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("service", "task_reject");
                        jSONObject.put("service_name", "task_reject");
                        jSONObject.put("poolName", dVar.f32705a);
                        jSONObject.put("taskName", runnable.getClass().getName());
                        jSONObject.put("poolType", dVar.f32707c.name());
                        jSONObject.put("poolSize", dVar.mo23484a());
                        jSONObject.put("taskStack", stackTraceString);
                    } catch (JSONException unused) {
                    }
                }
            }
            C12441f.f32727f.execute(runnable);
        }
    };

    /* renamed from: b */
    public static ThreadPoolExecutor f32723b;

    /* renamed from: c */
    public static ThreadPoolExecutor f32724c;

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor f32725d = new ScheduledThreadPoolExecutor(1, new C12435b("platform-schedule", f32731j));

    /* renamed from: e */
    public static ThreadPoolExecutor f32726e;

    /* renamed from: f */
    public static ThreadPoolExecutor f32727f;

    /* renamed from: g */
    public static C12445h f32728g;

    /* renamed from: h */
    private static final int f32729h;

    /* renamed from: i */
    private static final int f32730i;

    /* renamed from: j */
    private static C12445h f32731j = new C12445h() {
        /* renamed from: a */
        public final void mo23493a(Throwable th) {
            if (C12441f.f32728g != null) {
                C12441f.f32728g.mo23493a(th);
            }
        }
    };

    /* renamed from: k */
    private static ThreadPoolExecutor f32732k;

    /* renamed from: a */
    public static ThreadPoolExecutor m25028a() {
        return f32732k;
    }

    static {
        int i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f32729h = availableProcessors;
        if (availableProcessors > 0) {
            i = f32729h;
        } else {
            i = 1;
        }
        f32730i = i;
        C12440e eVar = new C12440e(0, 128, 30, TimeUnit.SECONDS, new SynchronousQueue(), new C12435b("platform-io", f32731j), f32722a);
        f32732k = eVar;
        int min = Math.min(f32730i, 4);
        int i2 = (f32730i * 2) + 1;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        C12440e eVar2 = new C12440e(min, i2, 30, timeUnit, linkedBlockingQueue, new C12435b("platform-default", f32731j), f32722a);
        f32723b = eVar2;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        C12440e eVar3 = new C12440e(0, 3, 15, timeUnit2, linkedBlockingQueue2, new C12428a("platform-background", f32731j), f32722a);
        f32724c = eVar3;
        C12440e eVar4 = new C12440e(1, 1, 30, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C12435b("platform-single", f32731j));
        f32726e = eVar4;
        int i3 = f32730i;
        C12440e eVar5 = new C12440e(i3, i3, 30, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C12435b("platform-fixed", f32731j));
        f32727f = eVar5;
        f32723b.allowCoreThreadTimeOut(true);
        f32724c.allowCoreThreadTimeOut(true);
        try {
            f32725d.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        f32726e.allowCoreThreadTimeOut(true);
        f32727f.allowCoreThreadTimeOut(true);
        C12432c.m25025a(f32732k, "platform-io", C12444g.IO);
        C12432c.m25025a(f32723b, "platform-default", C12444g.DEFAULT);
        C12432c.m25025a(f32724c, "platform-background", C12444g.BACKGROUND);
        C12432c.m25025a(f32725d, "platform-schedule", C12444g.SCHEDULED);
        C12432c.m25025a(f32726e, "platform-single", C12444g.SINGLE);
        C12432c.m25025a(f32727f, "platform-fixed", C12444g.FIXED);
    }
}
