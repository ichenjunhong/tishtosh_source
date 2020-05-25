package com.google.android.gms.internal.measurement;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.internal.measurement.bx */
public final /* synthetic */ class C16580bx implements Runnable {

    /* renamed from: a */
    private final C16578bv f46591a;

    /* renamed from: b */
    private final C16568bl f46592b;

    /* renamed from: c */
    private final JobParameters f46593c;

    public C16580bx(C16578bv bvVar, C16568bl blVar, JobParameters jobParameters) {
        this.f46591a = bvVar;
        this.f46592b = blVar;
        this.f46593c = jobParameters;
    }

    public final void run() {
        C16578bv bvVar = this.f46591a;
        C16568bl blVar = this.f46592b;
        JobParameters jobParameters = this.f46593c;
        blVar.mo32493b("AnalyticsJobService processed last dispatch request");
        ((C16582bz) bvVar.f46587b).mo27806a(jobParameters, false);
    }
}
