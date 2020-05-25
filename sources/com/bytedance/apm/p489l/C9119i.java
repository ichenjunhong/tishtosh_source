package com.bytedance.apm.p489l;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9024f;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.i */
public final class C9119i extends C9081a {

    /* renamed from: a */
    private static final int f24967a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static boolean f24968b = false;

    /* renamed from: g */
    private static int f24969g = 300;

    /* renamed from: i */
    private static boolean f24970i = false;

    /* renamed from: j */
    private static boolean f24971j = false;

    /* renamed from: h */
    private long f24972h;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return this.f24972h;
    }

    /* renamed from: e */
    public final void mo16224e() {
        super.mo16224e();
        f24968b = true;
    }

    public C9119i() {
        this.f24972h = 600000;
        this.f24812e = "thread";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo16225f() {
        super.mo16225f();
        if (f24970i && f24971j && System.currentTimeMillis() - C8976c.m17755k() > 1200000) {
            m18089a(null, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        boolean z;
        super.mo16219a(jSONObject);
        boolean z2 = false;
        if (jSONObject.optInt("enable_thread_collect", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        f24970i = z;
        if (jSONObject.optInt("enable_upload", 0) == 1) {
            z2 = true;
        }
        f24971j = z2;
        f24969g = jSONObject.optInt("thread_count_threshold", 300);
        this.f24972h = jSONObject.optLong("collect_interval", 10) * 60000;
    }

    /* renamed from: a */
    public static int m18089a(String str, boolean z) {
        int i;
        try {
            i = new File("/proc/self/task/").listFiles().length;
        } catch (Throwable unused) {
            i = 0;
        }
        if (i == 0) {
            return 0;
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        int activeCount = threadGroup.activeCount();
        if (z || activeCount < f24969g || !f24968b) {
            try {
                C9014a.m17825a().mo16336a(new C9024f("thread", null, null, m18090a(str, i, activeCount, null)));
            } catch (Exception unused2) {
            }
            return (i << 16) + activeCount;
        }
        Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
        int enumerate = threadGroup.enumerate(threadArr);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < enumerate; i2++) {
            String name = threadArr[i2].getName();
            if (!TextUtils.isEmpty(name)) {
                sb.append(name);
                sb.append(",");
            }
        }
        try {
            C9014a.m17825a().mo16336a(new C9024f("thread", null, null, m18090a(str, i, enumerate, sb.toString())));
        } catch (Throwable unused3) {
        }
        return (i << 16) + enumerate;
    }

    /* renamed from: a */
    private static JSONObject m18090a(String str, int i, int i2, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("total_thread_count", i);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("java_thread_count", i2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("scene", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("thread_detail", str2);
        }
        jSONObject.put("is_main_process", C8976c.m17747c());
        jSONObject.put("cpu_count", f24967a);
        jSONObject.put("process_name", C8976c.m17745b());
        return jSONObject;
    }
}
