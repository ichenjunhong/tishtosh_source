package com.bytedance.apm.p489l;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p486i.C9052c;
import com.bytedance.apm.p501q.C9180b;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.f */
public final class C9109f extends C9081a {

    /* renamed from: a */
    private boolean f24908a;

    /* renamed from: b */
    private long f24909b;

    /* renamed from: g */
    private long f24910g;

    /* renamed from: h */
    private long f24911h;

    /* renamed from: i */
    private long f24912i;

    /* renamed from: j */
    private long f24913j;

    /* renamed from: k */
    private C9052c f24914k;

    /* renamed from: l */
    private long f24915l = 120;

    /* renamed from: m */
    private long f24916m;

    /* renamed from: n */
    private volatile boolean f24917n;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return this.f24915l * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16220b() {
        super.mo16220b();
        m18060b(null);
        if (!C8976c.m17747c()) {
            m18059a();
        }
        this.f24911h = C9180b.m18222e();
    }

    /* renamed from: a */
    private void m18059a() {
        try {
            if (VERSION.SDK_INT >= 16) {
                if (this.f24908a) {
                    Resources resources = C8976c.m17736a().getResources();
                    Field declaredField = Class.forName("android.content.res.ResourcesImpl").getDeclaredField("sPreloadedDrawables");
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    if (VERSION.SDK_INT <= 17) {
                        LongSparseArray longSparseArray = (LongSparseArray) declaredField.get(resources);
                        if (longSparseArray != null) {
                            longSparseArray.clear();
                        }
                        return;
                    }
                    LongSparseArray[] longSparseArrayArr = (LongSparseArray[]) declaredField.get(resources);
                    if (longSparseArrayArr != null) {
                        for (LongSparseArray longSparseArray2 : longSparseArrayArr) {
                            if (longSparseArray2 != null) {
                                longSparseArray2.clear();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: f */
    public final void mo16225f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        try {
            MemoryInfo a = C9180b.m18211a(Process.myPid(), C8976c.m17736a());
            if (a != null) {
                int i = a.dalvikPss;
                if (i > 0) {
                    boolean z = !ActivityLifeObserver.getInstance().isV2Foreground();
                    int i2 = a.nativePss;
                    int totalPss = a.getTotalPss();
                    JSONObject jSONObject = new JSONObject();
                    long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                    m18060b(jSONObject);
                    if (z) {
                        str = "dalvik_pss_background";
                    } else {
                        str = "dalvik_pss_foreground";
                    }
                    jSONObject.put(str, ((long) i) * 1024);
                    if (z) {
                        str2 = "native_pss_background";
                    } else {
                        str2 = "native_pss_foreground";
                    }
                    jSONObject.put(str2, ((long) i2) * 1024);
                    if (z) {
                        str3 = "total_pss_background";
                    } else {
                        str3 = "total_pss_foreground";
                    }
                    jSONObject.put(str3, ((long) totalPss) * 1024);
                    if (z) {
                        str4 = "java_heap_background";
                    } else {
                        str4 = "java_heap_foreground";
                    }
                    jSONObject.put(str4, freeMemory);
                    if (freeMemory > 0) {
                        double doubleValue = new BigDecimal(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()).divide(new BigDecimal(this.f24911h), 4, 4).doubleValue();
                        if (z) {
                            str7 = "java_heap_background_used_rate";
                        } else {
                            str7 = "java_heap_foreground_used_rate";
                        }
                        jSONObject.put(str7, doubleValue);
                        if (doubleValue > 0.8d) {
                            jSONObject.put("reach_top_java", 1);
                            m18059a();
                        }
                    }
                    if (VERSION.SDK_INT >= 23) {
                        String memoryStat = a.getMemoryStat("summary.graphics");
                        if (!TextUtils.isEmpty(memoryStat)) {
                            if (z) {
                                str6 = "graphics_background";
                            } else {
                                str6 = "graphics_foreground";
                            }
                            jSONObject.put(str6, ((long) Integer.parseInt(memoryStat)) * 1024);
                        }
                    }
                    if (z) {
                        str5 = "vm_size_background";
                    } else {
                        str5 = "vm_size_foreground";
                    }
                    jSONObject.put(str5, C9180b.m18220d() * 1024);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("process_name", C8976c.m17745b());
                    jSONObject2.put("is_main_process", C8976c.m17747c());
                    jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
                    C9024f fVar = new C9024f("memory", "mem_monitor", false, jSONObject, jSONObject2, null);
                    m17983a(fVar);
                }
            }
        } catch (JSONException unused) {
        } catch (Exception unused2) {
        }
    }

    public C9109f(C9052c cVar) {
        this.f24914k = cVar;
        this.f24812e = "memory";
    }

    /* renamed from: b */
    private void m18060b(JSONObject jSONObject) {
        if (VERSION.SDK_INT >= 23) {
            long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
            long parseLong2 = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
            long parseLong3 = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
            long parseLong4 = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
            if (jSONObject != null) {
                try {
                    jSONObject.put("gc_count", parseLong - this.f24909b);
                    jSONObject.put("gc_time", parseLong2 - this.f24910g);
                    jSONObject.put("block_gc_count", parseLong3 - this.f24912i);
                    jSONObject.put("block_gc_time", parseLong4 - this.f24913j);
                } catch (JSONException unused) {
                }
            }
            this.f24909b = parseLong;
            this.f24910g = parseLong2;
            this.f24912i = parseLong3;
            this.f24913j = parseLong4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("collect_interval", 120);
        if (optLong > 0) {
            this.f24915l = optLong;
        }
        this.f24908a = jSONObject.optBoolean("enable_clear_memory");
        this.f24916m = jSONObject.optLong("memory_reachtop_check_interval", 30);
        this.f24916m = Math.max(30, this.f24916m);
        if (!this.f24917n) {
            this.f24917n = true;
            ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a())).scheduleWithFixedDelay(new Runnable() {
                public final void run() {
                    new BigDecimal(Runtime.getRuntime().totalMemory()).divide(new BigDecimal(Runtime.getRuntime().maxMemory()), 4, 4).doubleValue();
                }
            }, this.f24916m, this.f24916m, TimeUnit.SECONDS);
        }
    }
}
