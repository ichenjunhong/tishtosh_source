package com.p683ss.android.ugc.aweme.effect;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.io.File;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectCompatJobService */
public class EffectCompatJobService extends JobService {

    /* renamed from: a */
    public static volatile int f76221a = 190806;

    /* renamed from: b */
    public static volatile boolean f76222b;

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m68517a() throws Exception {
        try {
            AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().clearDraftEffectCache();
        } catch (Exception unused) {
        }
        return null;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String effectCacheDir = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().effectCacheDir();
        if (TextUtils.isEmpty(effectCacheDir) || new File(effectCacheDir).list() == null || new File(effectCacheDir).list().length == 0) {
            return false;
        }
        C0013i.m18a(C29202g.f76506a, (Executor) C24076h.m58902c()).mo30c(new C29203h(this, jobParameters), C0013i.f25b);
        return true;
    }
}
