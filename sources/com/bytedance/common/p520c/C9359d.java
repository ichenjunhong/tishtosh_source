package com.bytedance.common.p520c;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.common.c.d */
public final class C9359d {

    /* renamed from: a */
    public static final C9361a f25597a;

    /* renamed from: com.bytedance.common.c.d$a */
    public static class C9361a {
        private C9361a() {
        }

        /* renamed from: a */
        public void mo16982a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.set(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.common.c.d$b */
    static class C9362b extends C9361a {
        private C9362b() {
            super();
        }

        /* renamed from: a */
        public final void mo16982a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.setExact(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f25597a = new C9362b();
        } else {
            f25597a = new C9361a();
        }
    }
}
