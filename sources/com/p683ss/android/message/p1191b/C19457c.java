package com.p683ss.android.message.p1191b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.message.b.c */
public final class C19457c {

    /* renamed from: a */
    public static final C19459a f53778a;

    /* renamed from: com.ss.android.message.b.c$a */
    public static class C19459a {
        private C19459a() {
        }

        /* renamed from: a */
        public void mo40593a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.set(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.message.b.c$b */
    static class C19460b extends C19459a {
        private C19460b() {
            super();
        }

        /* renamed from: a */
        public final void mo40593a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
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
            f53778a = new C19460b();
        } else {
            f53778a = new C19459a();
        }
    }
}
