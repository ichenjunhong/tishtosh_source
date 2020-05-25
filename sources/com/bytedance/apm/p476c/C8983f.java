package com.bytedance.apm.p476c;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p497o.C9154c;
import com.bytedance.apm.p498p.p499a.C9165b;
import com.bytedance.common.p520c.C9355c;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.services.apm.api.C13223f;
import com.taobao.android.dexposed.ClassUtils;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.f */
public class C8983f {

    /* renamed from: a */
    C9154c f24455a;

    /* renamed from: b */
    public volatile boolean f24456b;

    /* renamed from: c */
    public long f24457c = 2500;

    /* renamed from: d */
    public long f24458d = 5000;

    /* renamed from: e */
    public final String f24459e = C8983f.class.getName();

    /* renamed from: f */
    public C8980c f24460f;

    /* renamed from: g */
    final Runnable f24461g = new Runnable() {
        public final void run() {
            if (C8983f.this.f24460f != null) {
                try {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (!stackTrace[0].getClassName().startsWith(C8983f.this.f24459e)) {
                        if (C8976c.m17751g() && stackTrace != null) {
                            StringBuilder sb = new StringBuilder("main thread task execute more than ");
                            sb.append(C8983f.this.f24457c);
                            sb.append("ms");
                            new TimeoutException(sb.toString()).setStackTrace(stackTrace);
                        }
                        StringBuilder sb2 = new StringBuilder(stackTrace.length * 30);
                        int i = 0;
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            i++;
                            StringBuilder sb3 = new StringBuilder("\tat ");
                            sb3.append(stackTraceElement.getClassName());
                            sb2.append(sb3.toString());
                            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb2.append(stackTraceElement.getMethodName());
                            sb2.append("(");
                            sb2.append(stackTraceElement.getFileName());
                            sb2.append(":");
                            sb2.append(stackTraceElement.getLineNumber());
                            sb2.append(")\n");
                            if (i > 40) {
                                break;
                            }
                        }
                        C8983f.this.f24460f.f24447e = sb2.toString();
                    }
                } catch (Throwable th) {
                    C9220a.m18312a(th, "block_deal_exception");
                }
            }
        }
    };

    /* renamed from: h */
    final Runnable f24462h = new Runnable() {
        public final void run() {
            try {
                if (C8983f.this.f24460f != null) {
                    C8983f.this.f24460f.f24449g = C8983f.this.mo16277a();
                    C8983f.this.f24460f.f24450h = ApmDelegate.m17947a().mo16437f();
                    C8983f.this.f24460f.f24451i = C8983f.m17782b();
                    C8983f.this.f24460f.f24445c = true;
                }
            } catch (Throwable th) {
                C9220a.m18312a(th, "serious_block_deal_exception");
            }
        }
    };

    /* renamed from: i */
    private C13223f f24463i;

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo16280d() {
        if (this.f24458d < this.f24457c) {
            this.f24458d = this.f24457c + 50;
        }
    }

    /* renamed from: a */
    public final JSONObject mo16277a() {
        if (this.f24463i == null) {
            this.f24463i = (C13223f) C12401c.m24975a(C13223f.class);
        }
        if (this.f24463i != null) {
            return this.f24463i.mo17361a();
        }
        return null;
    }

    C8983f() {
    }

    /* renamed from: b */
    public static JSONObject m17782b() {
        try {
            JSONObject jSONObject = new JSONObject();
            Context a = C8976c.m17736a();
            if (a != null) {
                ActivityManager activityManager = (ActivityManager) a.getSystemService("activity");
                MemoryInfo memoryInfo = new MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                jSONObject.put("availMem", memoryInfo.availMem);
                jSONObject.put("lowMemory", memoryInfo.lowMemory);
                jSONObject.put("threshold", memoryInfo.threshold);
                jSONObject.put("totalMem", C9355c.m18536a(memoryInfo));
            }
            Runtime runtime = Runtime.getRuntime();
            jSONObject.put("max_memory", runtime.maxMemory());
            jSONObject.put("free_memory", runtime.freeMemory());
            jSONObject.put("total_memory", runtime.totalMemory());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo16279c() {
        try {
            if (this.f24455a.mo16532b() && this.f24460f != null && this.f24460f.f24443a >= 0) {
                if (this.f24460f.f24444b == -1) {
                    this.f24460f.f24444b = SystemClock.uptimeMillis();
                    this.f24455a.mo16531b(this.f24461g);
                    this.f24455a.mo16531b(this.f24462h);
                    if (this.f24460f.f24444b - this.f24460f.f24443a > this.f24457c) {
                        m17784c(this.f24460f);
                        m17783b(this.f24460f.mo16275a());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m17783b(final C8980c cVar) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                if (cVar != null) {
                    boolean z = false;
                    if (cVar.f24444b == -1) {
                        cVar.f24444b = SystemClock.uptimeMillis();
                    }
                    if (cVar.f24446d || cVar.f24447e == null) {
                        cVar.f24447e = "InvalidStack.TimeOutGetStackTrace: 卡顿发生有效，但抓取堆栈线程的调度延时，导致抓取堆栈无效.\n";
                    }
                    if (cVar.f24444b - cVar.f24443a > C8983f.this.f24458d && !cVar.f24445c) {
                        cVar.f24449g = C8983f.this.mo16277a();
                        cVar.f24451i = C8983f.m17782b();
                        cVar.f24450h = ApmDelegate.m17947a().mo16437f();
                        cVar.f24445c = true;
                        z = true;
                    }
                    try {
                        JSONObject a = C8983f.m17781a(cVar);
                        a.put("event_type", "lag");
                        a.put("filters", ApmDelegate.m17947a().mo16434c("block_monitor"));
                        C9014a.m17825a().mo16336a((C9028d) new C9022d("block_monitor", a));
                        if (cVar.f24445c && C8983f.this.f24456b) {
                            JSONObject a2 = C8983f.m17781a(cVar);
                            a2.put("event_type", "serious_lag");
                            a2.put("block_looper_info", cVar.f24449g);
                            a2.put("block_cpu_info", cVar.f24450h);
                            a2.put("block_memory_info", cVar.f24451i);
                            a2.put("block_error_info", z);
                            C9014a.m17825a().mo16336a((C9028d) new C9022d("serious_block_monitor", a2));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo16278a(long j) {
        if (j < 70) {
            j = 2500;
        }
        this.f24457c = j;
        mo16280d();
    }

    /* renamed from: c */
    private static void m17784c(C8980c cVar) {
        String c = C9165b.m18189c();
        if (TextUtils.isEmpty(c)) {
            cVar.f24448f = ActivityLifeObserver.getInstance().getTopActivityClassName();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(",");
        sb.append(ActivityLifeObserver.getInstance().getTopActivityClassName());
        cVar.f24448f = sb.toString();
    }

    /* renamed from: a */
    public static JSONObject m17781a(C8980c cVar) throws JSONException {
        long j = cVar.f24444b - cVar.f24443a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stack", cVar.f24447e);
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", C8976c.m17747c());
        jSONObject.put("process_name", C8976c.m17745b());
        jSONObject.put("block_duration", j);
        jSONObject.put("last_scene", cVar.f24448f);
        return jSONObject;
    }
}
