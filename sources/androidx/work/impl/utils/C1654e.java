package androidx.work.impl.utils;

import androidx.work.C1543i.C1544a;
import androidx.work.impl.C1626f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p056b.C1585h;
import com.C2240a;

/* renamed from: androidx.work.impl.utils.e */
public final class C1654e implements Runnable {

    /* renamed from: a */
    private C1626f f5790a;

    /* renamed from: b */
    private String f5791b;

    public final void run() {
        WorkDatabase workDatabase = this.f5790a.f5704c;
        C1585h g = workDatabase.mo5929g();
        workDatabase.mo246c();
        try {
            if (g.mo5999d(this.f5791b) == C1544a.RUNNING) {
                g.mo5989a(C1544a.ENQUEUED, this.f5791b);
            }
            C2240a.m6772a("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f5791b, Boolean.valueOf(this.f5790a.f5707f.mo5969a(this.f5791b))});
            workDatabase.mo248e();
        } finally {
            workDatabase.mo247d();
        }
    }

    public C1654e(C1626f fVar, String str) {
        this.f5790a = fVar;
        this.f5791b = str;
    }
}
