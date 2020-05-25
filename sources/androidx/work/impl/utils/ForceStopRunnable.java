package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.impl.C1626f;
import java.util.concurrent.TimeUnit;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: a */
    private static final long f5743a = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b */
    private final Context f5744b;

    /* renamed from: c */
    private final C1626f f5745c;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    ForceStopRunnable.m5711a(context);
                }
            }
        }
    }

    public final void run() {
        boolean z = false;
        if (this.f5745c.f5708g.mo6066a().getBoolean("reschedule_needed", false)) {
            this.f5745c.mo6029c();
            this.f5745c.f5708g.mo6067a(false);
        } else {
            if (m5710a(this.f5744b, 536870912) == null) {
                m5711a(this.f5744b);
                z = true;
            }
            if (z) {
                this.f5745c.mo6029c();
            }
        }
        C1626f fVar = this.f5745c;
        synchronized (C1626f.f5701l) {
            fVar.f5709h = true;
            if (fVar.f5710i != null) {
                fVar.f5710i.finish();
                fVar.f5710i = null;
            }
        }
    }

    /* renamed from: b */
    private static Intent m5712b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: a */
    static void m5711a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = m5710a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f5743a;
        if (alarmManager != null) {
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, a);
                return;
            }
            alarmManager.set(0, currentTimeMillis, a);
        }
    }

    public ForceStopRunnable(Context context, C1626f fVar) {
        this.f5744b = context.getApplicationContext();
        this.f5745c = fVar;
    }

    /* renamed from: a */
    private static PendingIntent m5710a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m5712b(context), i);
    }
}
