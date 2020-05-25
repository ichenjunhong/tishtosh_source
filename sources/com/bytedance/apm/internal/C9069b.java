package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.C8991d;

/* renamed from: com.bytedance.apm.internal.b */
public final class C9069b {

    /* renamed from: a */
    public final SharedPreferences f24779a;

    /* renamed from: com.bytedance.apm.internal.b$a */
    static class C9071a {

        /* renamed from: a */
        public static final C9069b f24780a = new C9069b();
    }

    /* renamed from: a */
    public static C9069b m17971a() {
        return C9071a.f24780a;
    }

    private C9069b() {
        this.f24779a = C8991d.m17797a(C8976c.m17736a(), "monitor_config");
    }
}
