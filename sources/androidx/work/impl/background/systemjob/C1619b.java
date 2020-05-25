package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1543i.C1544a;
import androidx.work.impl.C1620c;
import androidx.work.impl.C1626f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p056b.C1578d;
import androidx.work.impl.p056b.C1583g;
import androidx.work.impl.utils.C1633a;
import com.C2240a;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemjob.b */
public final class C1619b implements C1620c {

    /* renamed from: a */
    private final JobScheduler f5692a;

    /* renamed from: b */
    private final C1626f f5693b;

    /* renamed from: c */
    private final C1633a f5694c;

    /* renamed from: d */
    private final C1617a f5695d;

    /* renamed from: a */
    public final void mo6002a(String str) {
        List<JobInfo> allPendingJobs = this.f5692a.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (str.equals(jobInfo.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.f5693b.f5704c.mo5932j().mo5981b(str);
                    this.f5692a.cancel(jobInfo.getId());
                    if (VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6003a(C1583g... gVarArr) {
        int i;
        WorkDatabase workDatabase = this.f5693b.f5704c;
        int length = gVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C1583g gVar = gVarArr[i2];
            workDatabase.mo246c();
            try {
                C1583g a = workDatabase.mo5929g().mo5990a(gVar.f5602a);
                if (a == null) {
                    StringBuilder sb = new StringBuilder("Skipping scheduling ");
                    sb.append(gVar.f5602a);
                    sb.append(" because it's no longer in the DB");
                } else if (a.f5603b != C1544a.ENQUEUED) {
                    StringBuilder sb2 = new StringBuilder("Skipping scheduling ");
                    sb2.append(gVar.f5602a);
                    sb2.append(" because it is no longer enqueued");
                } else {
                    C1578d a2 = workDatabase.mo5932j().mo5979a(gVar.f5602a);
                    if (a2 != null) {
                        i = a2.f5595b;
                    } else {
                        i = this.f5694c.mo6038a(this.f5693b.f5703b.f5509d, this.f5693b.f5703b.f5510e);
                    }
                    if (a2 == null) {
                        this.f5693b.f5704c.mo5932j().mo5980a(new C1578d(gVar.f5602a, i));
                    }
                    m5683a(gVar, i);
                    if (VERSION.SDK_INT == 23) {
                        m5683a(gVar, this.f5694c.mo6038a(this.f5693b.f5703b.f5509d, this.f5693b.f5703b.f5510e));
                    }
                    workDatabase.mo248e();
                }
                i2++;
            } finally {
                workDatabase.mo247d();
            }
        }
    }

    public C1619b(Context context, C1626f fVar) {
        this(context, fVar, (JobScheduler) context.getSystemService("jobscheduler"), new C1617a(context));
    }

    /* renamed from: a */
    private void m5683a(C1583g gVar, int i) {
        JobInfo a = this.f5695d.mo6025a(gVar, i);
        C2240a.m6772a("Scheduling work ID %s Job ID %s", new Object[]{gVar.f5602a, Integer.valueOf(i)});
        this.f5692a.schedule(a);
    }

    private C1619b(Context context, C1626f fVar, JobScheduler jobScheduler, C1617a aVar) {
        this.f5693b = fVar;
        this.f5692a = jobScheduler;
        this.f5694c = new C1633a(context);
        this.f5695d = aVar;
    }
}
