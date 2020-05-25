package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C1534c;
import androidx.work.C1542h;
import androidx.work.C1543i.C1544a;
import androidx.work.impl.C1547a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p056b.C1578d;
import androidx.work.impl.p056b.C1579e;
import androidx.work.impl.p056b.C1583g;
import androidx.work.impl.utils.C1655f;
import com.C2240a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.b */
public final class C1604b implements C1547a {

    /* renamed from: a */
    private final Context f5651a;

    /* renamed from: b */
    private final Map<String, C1547a> f5652b = new HashMap();

    /* renamed from: c */
    private final Object f5653c = new Object();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6009a() {
        boolean z;
        synchronized (this.f5653c) {
            z = !this.f5652b.isEmpty();
        }
        return z;
    }

    /* renamed from: a */
    static Intent m5654a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    C1604b(Context context) {
        this.f5651a = context;
    }

    /* renamed from: a */
    static Intent m5655a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    static Intent m5658b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m5659c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: a */
    private static boolean m5657a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (int i = 0; i <= 0; i++) {
            if (bundle.get(strArr[0]) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo5939a(String str, boolean z) {
        synchronized (this.f5653c) {
            C1547a aVar = (C1547a) this.f5652b.remove(str);
            if (aVar != null) {
                aVar.mo5939a(str, z);
            }
        }
    }

    /* renamed from: a */
    static Intent m5656a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6008a(Intent intent, int i, C1607e eVar) {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C2240a.m6772a("Handling constraints changed %s", new Object[]{intent});
            C1605c cVar = new C1605c(this.f5651a, i, eVar);
            List<C1583g> a = cVar.f5656c.f5670d.f5704c.mo5929g().mo5992a(cVar.f5656c.f5670d.f5703b.mo5910a());
            Context context = cVar.f5654a;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (C1583g gVar : a) {
                C1534c cVar2 = gVar.f5611j;
                z2 |= cVar2.f5522e;
                z3 |= cVar2.f5520c;
                z4 |= cVar2.f5523f;
                if (cVar2.f5519b != C1542h.NOT_REQUIRED) {
                    z = true;
                } else {
                    z = false;
                }
                z5 |= z;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            cVar.f5657d.mo5966a(a);
            ArrayList<C1583g> arrayList = new ArrayList<>(a.size());
            long currentTimeMillis = System.currentTimeMillis();
            for (C1583g gVar2 : a) {
                String str = gVar2.f5602a;
                if (currentTimeMillis >= gVar2.mo5984c() && (!gVar2.mo5985d() || cVar.f5657d.mo5967a(str))) {
                    arrayList.add(gVar2);
                }
            }
            for (C1583g gVar3 : arrayList) {
                String str2 = gVar3.f5602a;
                Intent b = m5658b(cVar.f5654a, str2);
                C2240a.m6772a("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2});
                cVar.f5656c.mo6013a((Runnable) new C1609a(cVar.f5656c, b, cVar.f5655b));
            }
            cVar.f5657d.mo5965a();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            C2240a.m6772a("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)});
            eVar.f5670d.mo6029c();
        } else {
            if (!m5657a(intent.getExtras(), "KEY_WORKSPEC_ID")) {
                C2240a.m6772a("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"});
                return;
            }
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                C2240a.m6772a("Handling schedule work for %s", new Object[]{string});
                WorkDatabase workDatabase = eVar.f5670d.f5704c;
                workDatabase.mo246c();
                try {
                    C1583g a2 = workDatabase.mo5929g().mo5990a(string);
                    if (a2 == null) {
                        StringBuilder sb = new StringBuilder("Skipping scheduling ");
                        sb.append(string);
                        sb.append(" because it's no longer in the DB");
                    } else if (a2.f5603b != C1544a.ENQUEUED) {
                        StringBuilder sb2 = new StringBuilder("Skipping scheduling ");
                        sb2.append(string);
                        sb2.append(" because it is no longer enqueued");
                    } else {
                        long c = a2.mo5984c();
                        if (!a2.mo5985d()) {
                            C2240a.m6772a("Setting up Alarms for %s", new Object[]{string});
                            C1603a.m5651a(this.f5651a, eVar.f5670d, string, c);
                        } else {
                            C2240a.m6772a("Opportunistically setting an alarm for %s", new Object[]{string});
                            C1603a.m5651a(this.f5651a, eVar.f5670d, string, c);
                            eVar.mo6013a((Runnable) new C1609a(eVar, m5654a(this.f5651a), i));
                        }
                        workDatabase.mo248e();
                    }
                } finally {
                    workDatabase.mo247d();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras = intent.getExtras();
                synchronized (this.f5653c) {
                    String string2 = extras.getString("KEY_WORKSPEC_ID");
                    C2240a.m6772a("Handing delay met for %s", new Object[]{string2});
                    C1606d dVar = new C1606d(this.f5651a, i, string2, eVar);
                    this.f5652b.put(string2, dVar);
                    dVar.f5663f = C1655f.m5766a(dVar.f5658a, C2240a.m6772a("%s (%s)", new Object[]{dVar.f5660c, Integer.valueOf(dVar.f5659b)}));
                    C2240a.m6772a("Acquiring wakelock %s for WorkSpec %s", new Object[]{dVar.f5663f, dVar.f5660c});
                    dVar.f5663f.acquire();
                    C1583g a3 = dVar.f5661d.f5670d.f5704c.mo5929g().mo5990a(dVar.f5660c);
                    if (a3 == null) {
                        dVar.mo6010a();
                    } else {
                        dVar.f5664g = a3.mo5985d();
                        if (!dVar.f5664g) {
                            C2240a.m6772a("No constraints for %s", new Object[]{dVar.f5660c});
                            dVar.mo5963a(Collections.singletonList(dVar.f5660c));
                        } else {
                            dVar.f5662e.mo5966a(Collections.singletonList(a3));
                        }
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                C2240a.m6772a("Handing stopWork work for %s", new Object[]{string3});
                eVar.f5670d.mo6028b(string3);
                Context context2 = this.f5651a;
                C1579e j = eVar.f5670d.f5704c.mo5932j();
                C1578d a4 = j.mo5979a(string3);
                if (a4 != null) {
                    C1603a.m5652a(context2, string3, a4.f5595b);
                    C2240a.m6772a("Removing SystemIdInfo for workSpecId (%s)", new Object[]{string3});
                    j.mo5981b(string3);
                }
                eVar.mo5939a(string3, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string4 = extras2.getString("KEY_WORKSPEC_ID");
                boolean z6 = extras2.getBoolean("KEY_NEEDS_RESCHEDULE");
                C2240a.m6772a("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)});
                mo5939a(string4, z6);
            } else {
                C2240a.m6772a("Ignoring intent %s", new Object[]{intent});
            }
        }
    }
}
