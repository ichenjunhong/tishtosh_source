package com.p683ss.android.ugc.aweme.effect;

import android.app.job.JobParameters;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.effect.h */
final /* synthetic */ class C29203h implements C0011g {

    /* renamed from: a */
    private final EffectCompatJobService f76507a;

    /* renamed from: b */
    private final JobParameters f76508b;

    C29203h(EffectCompatJobService effectCompatJobService, JobParameters jobParameters) {
        this.f76507a = effectCompatJobService;
        this.f76508b = jobParameters;
    }

    public final Object then(C0013i iVar) {
        EffectCompatJobService effectCompatJobService = this.f76507a;
        JobParameters jobParameters = this.f76508b;
        C36606dx dxVar = (C36606dx) C23393g.m57474a(effectCompatJobService, C36606dx.class);
        dxVar.mo48514b(System.currentTimeMillis());
        dxVar.mo48521d(false);
        effectCompatJobService.jobFinished(jobParameters, false);
        EffectCompatJobService.f76222b = false;
        return null;
    }
}
