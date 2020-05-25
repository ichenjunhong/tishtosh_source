package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.dp */
public final /* synthetic */ class C17077dp implements Runnable {

    /* renamed from: a */
    private final C17074dm f48205a;

    /* renamed from: b */
    private final C17133r f48206b;

    /* renamed from: c */
    private final JobParameters f48207c;

    public C17077dp(C17074dm dmVar, C17133r rVar, JobParameters jobParameters) {
        this.f48205a = dmVar;
        this.f48206b = rVar;
        this.f48207c = jobParameters;
    }

    public final void run() {
        C17074dm dmVar = this.f48205a;
        C17133r rVar = this.f48206b;
        JobParameters jobParameters = this.f48207c;
        rVar.f48453j.mo33376a("AppMeasurementJobService processed last upload request.");
        ((C17079dr) dmVar.f48199a).mo32818a(jobParameters, false);
    }
}
