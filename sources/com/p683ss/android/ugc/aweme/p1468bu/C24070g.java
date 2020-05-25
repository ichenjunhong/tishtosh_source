package com.p683ss.android.ugc.aweme.p1468bu;

import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bu.g */
final class C24070g {

    /* renamed from: a */
    static ExecutorService f63888a;

    /* renamed from: b */
    Object f63889b;

    /* renamed from: c */
    public Map<C24061c, Object> f63890c;

    /* renamed from: d */
    public ReentrantLock f63891d;

    /* renamed from: com.ss.android.ugc.aweme.bu.g$a */
    static class C24074a {

        /* renamed from: a */
        public static C24070g f63908a = new C24070g();
    }

    /* renamed from: com.ss.android.ugc.aweme.bu.g$b */
    class C24075b implements Runnable {
        public final void run() {
            if (C24076h.m58901b().mo49828c()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList<C24061c> arrayList = new ArrayList<>();
                C24070g.this.f63891d.lock();
                try {
                    if (C24070g.this.f63890c.size() <= 0) {
                        C24070g.this.f63891d.unlock();
                        return;
                    }
                    Iterator it = C24070g.this.f63890c.entrySet().iterator();
                    while (it.hasNext()) {
                        C24061c cVar = (C24061c) ((Entry) it.next()).getKey();
                        if (uptimeMillis - cVar.f63864c >= C24076h.m58897a().f63923f) {
                            arrayList.add(cVar);
                            it.remove();
                        }
                    }
                    C24070g.this.f63891d.unlock();
                    for (C24061c cVar2 : arrayList) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String a = C24094q.m58937a((Object) cVar2.f63862a);
                            if (!C24076h.m58899a(a)) {
                                jSONObject.put("task_name", a);
                                jSONObject.put("pool_type", cVar2.f63863b.f63852a.name());
                                jSONObject.put("pool_size", cVar2.f63863b.getPoolSize());
                                jSONObject.put("queue_size", cVar2.f63863b.getQueue().size());
                                jSONObject.put("duration", uptimeMillis - cVar2.f63864c);
                                if (cVar2.f63865d != null) {
                                    jSONObject.put("task_stack", C24094q.m58939a(cVar2.f63865d.getStackTrace()));
                                }
                                C24076h.m58901b().mo49827c(jSONObject);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    arrayList.clear();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    C24070g.this.f63891d.unlock();
                    throw th;
                }
            }
        }

        C24075b() {
        }
    }

    /* renamed from: a */
    static C24070g m58893a() {
        return C24074a.f63908a;
    }

    private C24070g() {
        this.f63889b = new Object();
        this.f63891d = new ReentrantLock();
        this.f63890c = new WeakHashMap();
        ExecutorService a = C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49845a("TaskMonitor").mo49847a());
        f63888a = a;
        ((ScheduledExecutorService) a).scheduleAtFixedRate(new C24075b(), C24076h.m58897a().f63923f, C24076h.m58897a().f63923f, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49837a(C24061c cVar) {
        if (C24076h.m58901b().mo49828c()) {
            this.f63891d.lock();
            try {
                this.f63890c.remove(cVar);
            } finally {
                this.f63891d.unlock();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49838a(final Runnable runnable, final ThreadPoolExecutor threadPoolExecutor) {
        if (C24076h.m58901b().mo49830d()) {
            final Exception exc = new Exception();
            f63888a.execute(new Runnable() {
                public final void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (runnable instanceof C24061c) {
                            jSONObject.put("task_name", ((C24061c) runnable).f63862a);
                        } else {
                            jSONObject.put("task_name", runnable);
                        }
                        if (threadPoolExecutor instanceof C24057a) {
                            jSONObject.put("pool_type", ((C24057a) threadPoolExecutor).f63852a.name());
                            jSONObject.put("pool_size", threadPoolExecutor.getPoolSize());
                            jSONObject.put("task_stack", C24094q.m58938a((Throwable) exc));
                        }
                    } catch (Exception unused) {
                    }
                    C24076h.m58901b().mo49829d(jSONObject);
                }
            });
        }
    }

    /* renamed from: a */
    public static JSONObject m58894a(WeakReference<Object> weakReference, String str, int i, int i2, long j) {
        Object obj = weakReference.get();
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String a = C24094q.m58937a(obj);
            if (C24076h.m58899a(a)) {
                return null;
            }
            jSONObject.put("task_name", a);
            jSONObject.put("pool_type", str);
            jSONObject.put("pool_size", i);
            jSONObject.put("queue_size", i2);
            jSONObject.put("duration", j);
            return jSONObject;
        } catch (Exception unused) {
        }
    }
}
