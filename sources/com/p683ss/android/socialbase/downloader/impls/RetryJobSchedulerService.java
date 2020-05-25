package com.p683ss.android.socialbase.downloader.impls;

import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;

/* renamed from: com.ss.android.socialbase.downloader.impls.RetryJobSchedulerService */
public class RetryJobSchedulerService extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public void onCreate() {
        super.onCreate();
        C19884b.m48601a((Context) this);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters != null) {
            int jobId = jobParameters.getJobId();
            StringBuilder sb = new StringBuilder("onStartJob, id = ");
            sb.append(jobId);
            C19819a.m48484a("RetrySchedulerService", sb.toString());
            C19983r.m49310c().mo41743a(jobId);
        }
        return false;
    }

    /* renamed from: a */
    static void m49003a(DownloadInfo downloadInfo, long j, boolean z, int i) {
        long j2;
        if (downloadInfo != null && j > 0) {
            Context x = C19884b.m48627x();
            if (x != null) {
                try {
                    JobScheduler jobScheduler = (JobScheduler) x.getSystemService("jobscheduler");
                    if (jobScheduler != null) {
                        try {
                            jobScheduler.cancel(downloadInfo.getId());
                        } catch (Throwable unused) {
                        }
                        int i2 = 2;
                        if (i == 0 || (z && i != 2)) {
                            j = 1000;
                            j2 = 0;
                        } else {
                            j2 = 60000 + j;
                        }
                        Builder minimumLatency = new Builder(downloadInfo.getId(), new ComponentName(x.getPackageName(), RetryJobSchedulerService.class.getName())).setMinimumLatency(j);
                        if (!z) {
                            i2 = 1;
                        }
                        Builder requiresDeviceIdle = minimumLatency.setRequiredNetworkType(i2).setRequiresCharging(false).setRequiresDeviceIdle(false);
                        if (j2 > 0) {
                            requiresDeviceIdle.setOverrideDeadline(j2);
                        }
                        int schedule = jobScheduler.schedule(requiresDeviceIdle.build());
                        if (schedule <= 0) {
                            StringBuilder sb = new StringBuilder("schedule err errCode = ");
                            sb.append(schedule);
                            C19819a.m48486b("RetrySchedulerService", sb.toString());
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
