package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C16578bv;
import com.google.android.gms.internal.measurement.C16582bz;

public final class AnalyticsService extends Service implements C16582bz {

    /* renamed from: a */
    private C16578bv<AnalyticsService> f38938a;

    /* renamed from: a */
    private final C16578bv<AnalyticsService> m31222a() {
        if (this.f38938a == null) {
            this.f38938a = new C16578bv<>(this);
        }
        return this.f38938a;
    }

    public final void onCreate() {
        super.onCreate();
        m31222a().mo31851a();
    }

    public final void onDestroy() {
        m31222a().mo31853b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m31222a().mo31850a(intent, i, i2);
    }

    public final IBinder onBind(Intent intent) {
        m31222a();
        return null;
    }

    /* renamed from: a */
    public final boolean mo27807a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo27806a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
