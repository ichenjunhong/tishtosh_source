package com.bytedance.apm.p489l;

import android.app.Activity;
import android.os.Looper;
import android.os.Process;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p480f.C9018b;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p485h.C9041c;
import com.bytedance.apm.p489l.p492b.C9097a;
import com.bytedance.apm.p489l.p492b.C9101b;
import com.bytedance.apm.p489l.p492b.C9102c;
import com.bytedance.apm.p501q.C9180b;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.c */
public final class C9103c extends C9081a {

    /* renamed from: a */
    public double f24869a;

    /* renamed from: b */
    public long f24870b;

    /* renamed from: g */
    public double f24871g;

    /* renamed from: h */
    private C9041c f24872h;

    /* renamed from: i */
    private long f24873i;

    /* renamed from: j */
    private long f24874j;

    /* renamed from: k */
    private double f24875k;

    /* renamed from: l */
    private double f24876l;

    /* renamed from: m */
    private int f24877m;

    /* renamed from: n */
    private int f24878n;

    /* renamed from: o */
    private int f24879o;

    /* renamed from: p */
    private boolean f24880p;

    /* renamed from: q */
    private int f24881q;

    /* renamed from: r */
    private long f24882r;

    /* renamed from: s */
    private long f24883s;

    /* renamed from: t */
    private long f24884t;

    /* renamed from: u */
    private boolean f24885u;

    /* renamed from: v */
    private boolean f24886v;

    /* renamed from: w */
    private List<C9101b> f24887w;

    /* renamed from: x */
    private boolean f24888x;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return this.f24874j * 1000;
    }

    public C9103c() {
        this.f24873i = 300;
        this.f24874j = 60;
        this.f24869a = -1.0d;
        this.f24882r = -1;
        this.f24883s = -1;
        this.f24870b = -1;
        this.f24871g = -1.0d;
        this.f24812e = "cpu";
    }

    /* renamed from: f */
    public final void mo16225f() {
        long j;
        double d;
        double d2;
        double d3;
        long currentTimeMillis = System.currentTimeMillis();
        long b = C9180b.m18214b();
        if (this.f24885u) {
            j = C9180b.m18207a();
        } else {
            j = 0;
        }
        int i = this.f24881q;
        double d4 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        if (i == 1) {
            try {
                Thread.sleep(360);
            } catch (InterruptedException unused) {
            }
            long b2 = C9180b.m18214b();
            if (this.f24885u) {
                long a = C9180b.m18207a() - j;
                if (a > 0) {
                    d4 = (double) ((((float) b2) - ((float) b)) / ((float) a));
                }
            }
            double d5 = (double) b2;
            double d6 = (double) b;
            Double.isNaN(d5);
            Double.isNaN(d6);
            double d7 = (d5 - d6) * 1000.0d;
            double currentTimeMillis2 = (double) (System.currentTimeMillis() - currentTimeMillis);
            Double.isNaN(currentTimeMillis2);
            double d8 = d7 / currentTimeMillis2;
            double a2 = (double) C9180b.m18208a(100);
            Double.isNaN(a2);
            d3 = d8 / a2;
        } else if (this.f24870b > -1) {
            if (this.f24885u) {
                double d9 = (double) (b - this.f24883s);
                Double.isNaN(d9);
                double d10 = d9 * 1.0d;
                double d11 = (double) (j - this.f24882r);
                Double.isNaN(d11);
                d4 = d10 / d11;
            }
            double d12 = (double) b;
            double d13 = (double) this.f24883s;
            Double.isNaN(d12);
            Double.isNaN(d13);
            double d14 = (d12 - d13) * 1000.0d;
            double d15 = (double) (currentTimeMillis - this.f24870b);
            Double.isNaN(d15);
            double d16 = d14 / d15;
            double a3 = (double) C9180b.m18208a(100);
            Double.isNaN(a3);
            d3 = d16 / a3;
        } else {
            d2 = 0.0d;
            d = 0.0d;
            m18038a(currentTimeMillis, d2, d, b, j);
        }
        d = d3;
        d2 = d4;
        m18038a(currentTimeMillis, d2, d, b, j);
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        super.mo16218a(activity);
        this.f24874j = 600;
        this.f24883s = -1;
        this.f24882r = -1;
        this.f24869a = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        this.f24871g = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        this.f24886v = false;
        this.f24888x = false;
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
        super.mo16221b(activity);
        this.f24874j = 120;
        this.f24886v = false;
        this.f24888x = false;
        C9097a a = C9097a.m18023a();
        if (a.f24850e && a.f24851f != null) {
            a.f24851f.post(new Runnable() {
                public final void run() {
                    C9097a.this.mo16469b();
                }
            });
        }
        this.f24880p = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("monitor_interval", 300);
        long optLong2 = jSONObject.optLong("collect_interval", 60);
        boolean z = false;
        this.f24877m = jSONObject.optInt("background_task_enabled", 0);
        this.f24878n = jSONObject.optInt("main_thread_collect_enabled", 0);
        this.f24881q = jSONObject.optInt("enable_cpu_v2", 1);
        this.f24876l = jSONObject.optDouble("max_process_usage", 0.6d);
        this.f24875k = jSONObject.optDouble("max_stat_use_speed", 1.0d);
        this.f24879o = jSONObject.optInt("all_processes_sample_enabled", 0);
        this.f24880p = !this.f24811d;
        if (optLong > 0) {
            this.f24873i = optLong;
        }
        if (optLong2 > 0) {
            this.f24874j = optLong2;
        }
        if (this.f24875k < ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f24876l < ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            this.f24877m = 0;
        }
        File file = new File("/proc/stat");
        if (file.exists() && file.canRead()) {
            z = true;
        }
        this.f24885u = z;
    }

    /* renamed from: a */
    private void m18037a(int i, long j) {
        StackTraceElement[] stackTrace;
        C9102c.m18034a(i, this.f24887w, j - this.f24883s);
        if (this.f24887w.size() == 0 || this.f24887w.size() >= 10) {
            this.f24874j = 600;
            this.f24887w.clear();
            return;
        }
        if (this.f24888x) {
            ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            int activeCount = threadGroup.activeCount();
            Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
            threadGroup.enumerate(threadArr);
            ArrayList<Thread> arrayList = new ArrayList<>();
            JSONObject jSONObject = new JSONObject();
            for (Thread thread : threadArr) {
                if (thread == null) {
                    break;
                }
                ListIterator listIterator = this.f24887w.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    C9101b bVar = (C9101b) listIterator.next();
                    if (bVar.f24866b.equals(thread.getName()) || (thread.getName().length() > 15 && bVar.f24866b.equals(thread.getName().substring(0, 15)))) {
                        arrayList.add(thread);
                    }
                }
                arrayList.add(thread);
            }
            try {
                jSONObject.put("process_id", Process.myPid());
                jSONObject.put("stat_speed", this.f24871g);
                if (this.f24869a != -1.0d) {
                    jSONObject.put("process_usage", this.f24869a);
                }
                JSONObject jSONObject2 = new JSONObject();
                int i2 = 0;
                for (C9101b bVar2 : this.f24887w) {
                    if (bVar2.f24865a != i || this.f24878n <= 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(bVar2.f24866b);
                        sb.append("_");
                        sb.append(i2);
                        jSONObject2.put(sb.toString(), (double) bVar2.f24868d);
                    } else {
                        arrayList.add(Looper.getMainLooper().getThread());
                        StringBuilder sb2 = new StringBuilder("main_");
                        sb2.append(i2);
                        jSONObject2.put(sb2.toString(), (double) bVar2.f24868d);
                    }
                    i2++;
                }
                jSONObject.put("thread_usage", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                StringBuilder sb3 = new StringBuilder();
                for (Thread thread2 : arrayList) {
                    int i3 = 0;
                    for (StackTraceElement stackTraceElement : thread2.getStackTrace()) {
                        i3++;
                        sb3.append("\tat ");
                        sb3.append(stackTraceElement.getClassName());
                        sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb3.append(stackTraceElement.getMethodName());
                        sb3.append("(");
                        sb3.append(stackTraceElement.getFileName());
                        sb3.append(":");
                        sb3.append(stackTraceElement.getLineNumber());
                        sb3.append(")\n");
                        if (i3 > 40) {
                            break;
                        }
                    }
                    jSONObject3.put(thread2.getName(), sb3.toString());
                    sb3.setLength(0);
                }
                jSONObject.put("thread_snapshot", jSONObject3);
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("crash_time", System.currentTimeMillis());
                jSONObject.put("is_main_process", C8976c.m17747c());
                jSONObject.put("process_name", C8976c.m17745b());
                jSONObject.put("event_type", "cpu_trace");
                jSONObject.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
                C9018b.m17833a(jSONObject, "cpu_trace");
            } catch (JSONException unused) {
            }
            if (arrayList.size() == 0 || System.currentTimeMillis() - this.f24884t < 3600000) {
                C9014a.m17825a().mo16336a(new C9022d("cpu_trace", jSONObject));
            } else {
                C9097a.m18023a().mo16468a((List<Thread>) arrayList, jSONObject);
                this.f24884t = System.currentTimeMillis();
            }
            this.f24886v = false;
            this.f24874j = 600;
            this.f24887w.clear();
        }
        this.f24888x = !this.f24888x;
    }

    /* renamed from: a */
    private void m18035a(double d, double d2, long j) {
        if (!C18920g.m46048a(C8976c.m17736a()) && !this.f24880p && this.f24879o <= 0) {
            return;
        }
        if (d < this.f24876l && d2 < this.f24875k) {
            this.f24886v = false;
            this.f24874j = 600;
        } else if (this.f24886v) {
            m18037a(Process.myPid(), j);
        } else if (this.f24869a >= 0.2d || this.f24871g >= this.f24875k) {
            this.f24887w = C9102c.m18033a(Process.myPid());
            if (this.f24887w != null) {
                this.f24886v = true;
                this.f24888x = false;
                this.f24874j = 30;
            }
        } else {
            this.f24874j = 300;
        }
    }

    /* renamed from: a */
    private void m18036a(float f, float f2, float f3, float f4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (f > -1.0f && f2 > -1.0f && this.f24885u) {
                jSONObject.put("app_usage_rate", (double) f);
                jSONObject.put("app_max_usage_rate", (double) f2);
            }
            jSONObject.put("app_stat_speed", (double) f3);
            jSONObject.put("app_max_stat_speed", (double) f4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
            jSONObject2.put("process_name", C8976c.m17745b());
            jSONObject2.put("is_main_process", C8976c.m17747c());
            jSONObject2.put("is_front", !this.f24811d);
            m17983a(new C9024f().mo16354a("cpu").mo16356b("cpu_monitor").mo16355a(jSONObject).mo16357b(jSONObject2));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m18038a(long j, double d, double d2, long j2, long j3) {
        long j4;
        double d3;
        double d4;
        long j5 = j;
        double d5 = d;
        double d6 = d2;
        if (this.f24870b > -1) {
            if (this.f24872h == null) {
                C9041c cVar = new C9041c(j, d, d, d2, d2);
                this.f24872h = cVar;
            } else {
                if (this.f24872h.f24675a == 0) {
                    this.f24872h.f24675a = j5;
                }
                this.f24872h.f24676b++;
                this.f24872h.f24678d += d5;
                if (this.f24872h.f24677c < d5) {
                    this.f24872h.f24677c = d5;
                }
                this.f24872h.f24680f += d6;
                if (this.f24872h.f24679e < d6) {
                    this.f24872h.f24679e = d6;
                }
            }
            if (j5 - this.f24872h.f24675a > this.f24873i * 1000) {
                double d7 = this.f24872h.f24678d;
                double d8 = (double) this.f24872h.f24676b;
                Double.isNaN(d8);
                float f = (float) (d7 / d8);
                float f2 = (float) this.f24872h.f24677c;
                double d9 = this.f24872h.f24680f;
                double d10 = (double) this.f24872h.f24676b;
                Double.isNaN(d10);
                m18036a(f, f2, (float) (d9 / d10), (float) this.f24872h.f24679e);
                this.f24872h.mo16372a();
            }
        }
        if (this.f24877m <= 0 || !this.f24811d) {
            d4 = d6;
            d3 = d5;
            j4 = j5;
        } else {
            d4 = d6;
            d3 = d5;
            j4 = j5;
            m18035a(d, d2, j2);
        }
        this.f24882r = j3;
        this.f24883s = j2;
        this.f24869a = d3;
        this.f24870b = j4;
        this.f24871g = d4;
    }
}
