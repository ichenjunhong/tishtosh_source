package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p014b.C0141e;
import android.arch.p011c.p014b.C0142f.C0143a;
import android.arch.p011c.p014b.C0142f.C0144b;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1532b;
import androidx.work.C1541g;
import androidx.work.C1658j;
import androidx.work.WorkerParameters.C1530a;
import androidx.work.impl.C1622e.C1625a;
import androidx.work.impl.background.p057a.C1602a;
import androidx.work.impl.utils.C1652c;
import androidx.work.impl.utils.C1653d;
import androidx.work.impl.utils.C1654e;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.p059b.C1648a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.work.impl.f */
public final class C1626f extends C1658j {

    /* renamed from: j */
    public static C1626f f5699j;

    /* renamed from: k */
    public static C1626f f5700k;

    /* renamed from: l */
    public static final Object f5701l = new Object();

    /* renamed from: a */
    public Context f5702a;

    /* renamed from: b */
    public C1532b f5703b;

    /* renamed from: c */
    public WorkDatabase f5704c;

    /* renamed from: d */
    public C1648a f5705d;

    /* renamed from: e */
    public List<C1620c> f5706e;

    /* renamed from: f */
    public C1572b f5707f;

    /* renamed from: g */
    public C1652c f5708g;

    /* renamed from: h */
    public boolean f5709h;

    /* renamed from: i */
    public PendingResult f5710i;

    /* renamed from: a */
    public static C1626f m5693a() {
        return C1627g.m5699a();
    }

    /* renamed from: b */
    public static C1626f m5694b() {
        synchronized (f5701l) {
            if (f5699j != null) {
                C1626f fVar = f5699j;
                return fVar;
            }
            C1626f fVar2 = f5700k;
            return fVar2;
        }
    }

    /* renamed from: c */
    public final void mo6029c() {
        if (VERSION.SDK_INT >= 23) {
            JobScheduler jobScheduler = (JobScheduler) this.f5702a.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                if (allPendingJobs != null) {
                    for (JobInfo jobInfo : allPendingJobs) {
                        if (jobInfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                            jobScheduler.cancel(jobInfo.getId());
                        }
                    }
                }
            }
        }
        this.f5704c.mo5929g().mo5995b();
        C1621d.m5689a(this.f5703b, this.f5704c, this.f5706e);
    }

    /* renamed from: a */
    public final void mo6026a(String str) {
        mo6027a(str, null);
    }

    /* renamed from: b */
    public final void mo6028b(String str) {
        this.f5705d.mo6061a(new C1654e(this, str));
    }

    /* renamed from: a */
    public final void mo6027a(String str, C1530a aVar) {
        this.f5705d.mo6061a(new C1653d(this, str, aVar));
    }

    public C1626f(Context context, C1532b bVar, C1648a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(R.bool.n));
    }

    private C1626f(Context context, C1532b bVar, C1648a aVar, boolean z) {
        C0143a aVar2;
        Context applicationContext = context.getApplicationContext();
        if (z) {
            aVar2 = new C0143a(applicationContext, WorkDatabase.class, null).mo250a();
        } else {
            aVar2 = C0141e.m302a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
        }
        C15451 r3 = new C0144b() {
            /* renamed from: a */
            public final void mo253a(C0118b bVar) {
                super.mo253a(bVar);
                bVar.mo176a();
                try {
                    bVar.mo180c("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
                    StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
                    sb.append(System.currentTimeMillis() - WorkDatabase.f5544g);
                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    bVar.mo180c(sb.toString());
                    bVar.mo179c();
                } finally {
                    bVar.mo178b();
                }
            }
        };
        if (aVar2.f357a == null) {
            aVar2.f357a = new ArrayList<>();
        }
        aVar2.f357a.add(r3);
        C0143a a = aVar2.mo251a(C1622e.f5696a).mo251a(new C1625a(applicationContext, 2, 3)).mo251a(C1622e.f5697b);
        a.f358b = false;
        WorkDatabase workDatabase = (WorkDatabase) a.mo252b();
        List<C1620c> asList = Arrays.asList(new C1620c[]{C1621d.m5688a(applicationContext, this), new C1602a(applicationContext, this)});
        C1572b bVar2 = new C1572b(context, bVar, aVar, workDatabase, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.f5702a = applicationContext2;
        this.f5703b = bVar;
        this.f5705d = aVar;
        this.f5704c = workDatabase;
        this.f5706e = asList;
        this.f5707f = bVar2;
        this.f5708g = new C1652c(this.f5702a);
        this.f5709h = false;
        C1541g.f5537a = this.f5703b.f5508c;
        this.f5705d.mo6061a(new ForceStopRunnable(applicationContext2, this));
    }
}
