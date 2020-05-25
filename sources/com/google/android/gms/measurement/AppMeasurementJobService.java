package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C17005ay;
import com.google.android.gms.measurement.internal.C17074dm;
import com.google.android.gms.measurement.internal.C17077dp;
import com.google.android.gms.measurement.internal.C17079dr;
import com.google.android.gms.measurement.internal.C17128m;
import com.google.android.gms.measurement.internal.C17133r;

public final class AppMeasurementJobService extends JobService implements C17079dr {

    /* renamed from: a */
    private C17074dm<AppMeasurementJobService> f47850a;

    /* renamed from: a */
    private final C17074dm<AppMeasurementJobService> m41127a() {
        if (this.f47850a == null) {
            this.f47850a = new C17074dm<>(this);
        }
        return this.f47850a;
    }

    /* renamed from: a */
    public final void mo32819a(Intent intent) {
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        m41127a().mo33060a();
    }

    public final void onDestroy() {
        m41127a().mo33063b();
        super.onDestroy();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C17074dm a = m41127a();
        C17133r q = C17005ay.m41256a((Context) a.f48199a, (C17128m) null).mo32854q();
        String string = jobParameters.getExtras().getString("action");
        q.f48453j.mo33377a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a.mo33061a((Runnable) new C17077dp(a, q, jobParameters));
        }
        return true;
    }

    public final boolean onUnbind(Intent intent) {
        return m41127a().mo33062a(intent);
    }

    public final void onRebind(Intent intent) {
        m41127a().mo33064b(intent);
    }

    /* renamed from: a */
    public final boolean mo32820a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo32818a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
