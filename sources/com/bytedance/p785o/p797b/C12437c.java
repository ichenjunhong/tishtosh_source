package com.bytedance.p785o.p797b;

import android.os.SystemClock;
import com.bytedance.p785o.p797b.p798a.C12431b;
import com.bytedance.p785o.p797b.p798a.C12432c;
import com.bytedance.p785o.p797b.p798a.C12434d;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.o.b.c */
public final class C12437c implements Runnable {

    /* renamed from: a */
    private ThreadPoolExecutor f32713a;

    /* renamed from: b */
    private Runnable f32714b;

    /* renamed from: c */
    private long f32715c = SystemClock.elapsedRealtime();

    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f32715c;
        if (j >= 10000) {
            Runnable runnable = this.f32714b;
            ThreadPoolExecutor threadPoolExecutor = this.f32713a;
            if (C12432c.f32696c) {
                int size = threadPoolExecutor.getQueue().size();
                C12434d dVar = (C12434d) C12432c.f32695b.get(threadPoolExecutor);
                if (dVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("service", "task_wait_time_out");
                        jSONObject.put("service_name", "task_wait_time_out");
                        jSONObject.put("queueSize", size);
                        jSONObject.put("duration", j);
                        jSONObject.put("poolName", dVar.f32705a);
                        jSONObject.put("taskName", runnable.getClass().getName());
                        jSONObject.put("poolType", dVar.f32707c.name());
                        jSONObject.put("poolSize", dVar.mo23484a());
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor2 = this.f32713a;
        Runnable runnable2 = this.f32714b;
        if (C12432c.f32696c) {
            C12434d dVar2 = (C12434d) C12432c.f32695b.get(threadPoolExecutor2);
            if (dVar2 != null) {
                String name = Thread.currentThread().getName();
                C12431b bVar = (C12431b) dVar2.f32708d.get(name);
                if (bVar == null) {
                    bVar = new C12431b();
                    bVar.f32693f = name;
                    dVar2.f32708d.put(name, bVar);
                }
                bVar.f32688a = SystemClock.elapsedRealtime();
                bVar.f32689b = SystemClock.currentThreadTimeMillis();
            }
        }
        this.f32714b.run();
        ThreadPoolExecutor threadPoolExecutor3 = this.f32713a;
        Runnable runnable3 = this.f32714b;
        if (C12432c.f32696c) {
            C12434d dVar3 = (C12434d) C12432c.f32695b.get(threadPoolExecutor3);
            if (dVar3 != null) {
                String name2 = Thread.currentThread().getName();
                C12431b bVar2 = (C12431b) dVar3.f32708d.get(name2);
                if (bVar2 == null) {
                    bVar2 = new C12431b();
                    dVar3.f32708d.put(name2, bVar2);
                }
                bVar2.f32690c++;
                bVar2.f32691d += SystemClock.elapsedRealtime() - bVar2.f32688a;
                bVar2.f32692e += SystemClock.currentThreadTimeMillis() - bVar2.f32689b;
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 >= 5000) {
            Runnable runnable4 = this.f32714b;
            ThreadPoolExecutor threadPoolExecutor4 = this.f32713a;
            if (C12432c.f32696c) {
                int size2 = threadPoolExecutor4.getQueue().size();
                C12434d dVar4 = (C12434d) C12432c.f32695b.get(threadPoolExecutor4);
                if (dVar4 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("service", "task_execute_time_out");
                        jSONObject2.put("service_name", "task_execute_time_out");
                        jSONObject2.put("queueSize", size2);
                        jSONObject2.put("duration", elapsedRealtime2);
                        jSONObject2.put("poolName", dVar4.f32705a);
                        jSONObject2.put("taskName", runnable4.getClass().getName());
                        jSONObject2.put("poolType", dVar4.f32707c.name());
                        jSONObject2.put("poolSize", dVar4.mo23484a());
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
    }

    public C12437c(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        this.f32714b = runnable;
        this.f32713a = threadPoolExecutor;
    }
}
