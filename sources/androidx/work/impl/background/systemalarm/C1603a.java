package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.C1626f;
import androidx.work.impl.p056b.C1578d;
import androidx.work.impl.p056b.C1579e;
import androidx.work.impl.utils.C1633a;
import com.C2240a;

/* renamed from: androidx.work.impl.background.systemalarm.a */
final class C1603a {
    /* renamed from: a */
    static void m5652a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1604b.m5658b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            C2240a.m6772a("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)});
            alarmManager.cancel(service);
        }
    }

    /* renamed from: a */
    public static void m5651a(Context context, C1626f fVar, String str, long j) {
        C1579e j2 = fVar.f5704c.mo5932j();
        C1578d a = j2.mo5979a(str);
        if (a != null) {
            m5652a(context, str, a.f5595b);
            m5653a(context, str, a.f5595b, j);
            return;
        }
        int a2 = new C1633a(context).mo6037a();
        j2.mo5980a(new C1578d(str, a2));
        m5653a(context, str, a2, j);
    }

    /* renamed from: a */
    private static void m5653a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1604b.m5658b(context, str), 1073741824);
        if (alarmManager != null) {
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, j, service);
                return;
            }
            alarmManager.set(0, j, service);
        }
    }
}
