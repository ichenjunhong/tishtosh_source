package androidx.work.impl;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1532b;
import androidx.work.impl.background.systemalarm.C1612f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C1619b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p056b.C1583g;
import androidx.work.impl.p056b.C1585h;
import androidx.work.impl.utils.C1647b;
import java.util.List;

/* renamed from: androidx.work.impl.d */
public final class C1621d {
    /* renamed from: a */
    static C1620c m5688a(Context context, C1626f fVar) {
        C1620c cVar;
        boolean z = false;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 23) {
            cVar = new C1619b(context, fVar);
            C1647b.m5755a(context, SystemJobService.class, true);
        } else {
            try {
                cVar = (C1620c) Class.forName("androidx.work.impl.background.firebase.FirebaseJobScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                z = true;
            } catch (Exception unused) {
                cVar = new C1612f(context);
            }
        }
        z2 = false;
        try {
            C1647b.m5755a(context, Class.forName("androidx.work.impl.background.firebase.FirebaseJobService"), z);
        } catch (ClassNotFoundException unused2) {
        }
        C1647b.m5755a(context, SystemAlarmService.class, z2);
        return cVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m5689a(C1532b bVar, WorkDatabase workDatabase, List<C1620c> list) {
        if (list != null && list.size() != 0) {
            C1585h g = workDatabase.mo5929g();
            workDatabase.mo246c();
            try {
                List<C1583g> a = g.mo5992a(bVar.mo5910a());
                if (a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C1583g gVar : a) {
                        g.mo5997b(gVar.f5602a, currentTimeMillis);
                    }
                }
                workDatabase.mo248e();
                workDatabase.mo247d();
                if (a.size() > 0) {
                    C1583g[] gVarArr = (C1583g[]) a.toArray(new C1583g[0]);
                    for (C1620c a2 : list) {
                        a2.mo6003a(gVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.mo247d();
                throw th;
            }
        }
    }
}
