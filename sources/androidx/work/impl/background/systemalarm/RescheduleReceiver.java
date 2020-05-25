package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.impl.C1626f;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

public class RescheduleReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 23) {
            C1626f a = C1626f.m5693a();
            if (a != null) {
                PendingResult goAsync = goAsync();
                synchronized (C1626f.f5701l) {
                    a.f5710i = goAsync;
                    if (a.f5709h) {
                        a.f5710i.finish();
                        a.f5710i = null;
                    }
                }
            }
        } else {
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent2)) {
                context.startService(intent2);
            }
        }
    }
}
