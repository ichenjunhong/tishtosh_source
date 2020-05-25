package com.bytedance.p785o.p786a.p788b.p794b;

import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p795c.C12425e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bytedance.o.a.b.b.a */
public final class C12419a extends C12425e {
    /* renamed from: a */
    public final void mo23473a() {
        super.mo23473a();
    }

    /* renamed from: b */
    public final String mo23475b() {
        return "FinalizeTimeoutPlugin";
    }

    /* renamed from: c */
    public final boolean mo23478c() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo23468a(Thread thread, Throwable th) throws Throwable {
        boolean z;
        if (thread == null || th == null || !thread.getName().equals("FinalizerWatchdogDaemon") || !(th instanceof TimeoutException)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C12409d.m24989a(mo23475b(), "Hint FinalizeTimeout case ,fix it.");
        }
        return z;
    }
}
