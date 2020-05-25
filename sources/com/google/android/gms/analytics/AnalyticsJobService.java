package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C16568bl;
import com.google.android.gms.internal.measurement.C16578bv;
import com.google.android.gms.internal.measurement.C16580bx;
import com.google.android.gms.internal.measurement.C16582bz;
import com.google.android.gms.internal.measurement.C16862t;

public final class AnalyticsJobService extends JobService implements C16582bz {

    /* renamed from: a */
    private C16578bv<AnalyticsJobService> f38936a;

    /* renamed from: a */
    private final C16578bv<AnalyticsJobService> m31219a() {
        if (this.f38936a == null) {
            this.f38936a = new C16578bv<>(this);
        }
        return this.f38936a;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        m31219a().mo31851a();
    }

    public final void onDestroy() {
        m31219a().mo31853b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m31219a().mo31850a(intent, i, i2);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C16578bv a = m31219a();
        C16568bl a2 = C16862t.m40963a((Context) a.f46587b).mo32518a();
        String string = jobParameters.getExtras().getString("action");
        a2.mo32490a("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            a.mo31852a((Runnable) new C16580bx(a, a2, jobParameters));
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo27807a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo27806a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
