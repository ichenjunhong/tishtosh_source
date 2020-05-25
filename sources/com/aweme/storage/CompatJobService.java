package com.aweme.storage;

import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

public class CompatJobService extends JobService {

    /* renamed from: a */
    public static volatile boolean f7902a;

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* renamed from: a */
    static void m7451a(Context context) {
        if (!f7902a) {
            f7902a = true;
            Builder builder = new Builder(1193041, new ComponentName(context, CompatJobService.class));
            builder.setMinimumLatency(0);
            builder.setOverrideDeadline(3000);
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
        }
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        C0013i.m18a((Callable<TResult>) new Callable<String>() {
            public final /* synthetic */ Object call() throws Exception {
                C2553c.m7474d(CompatJobService.this);
                return null;
            }
        }, (Executor) C24076h.m58902c()).mo30c(new C0011g<String, String>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                C2553c.m7475e(CompatJobService.this);
                return null;
            }
        }, C0013i.f25b).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C0011g<String, C0013i<String>>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                CompatJobService.this.jobFinished(jobParameters, false);
                CompatJobService.f7902a = false;
                return null;
            }
        });
        return true;
    }
}
