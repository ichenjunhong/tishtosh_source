package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C17005ay;
import com.google.android.gms.measurement.internal.C17008ba;
import com.google.android.gms.measurement.internal.C17074dm;
import com.google.android.gms.measurement.internal.C17075dn;
import com.google.android.gms.measurement.internal.C17079dr;
import com.google.android.gms.measurement.internal.C17092ed;
import com.google.android.gms.measurement.internal.C17128m;
import com.google.android.gms.measurement.internal.C17133r;

public final class AppMeasurementService extends Service implements C17079dr {

    /* renamed from: a */
    private C17074dm<AppMeasurementService> f47852a;

    /* renamed from: a */
    private final C17074dm<AppMeasurementService> m41133a() {
        if (this.f47852a == null) {
            this.f47852a = new C17074dm<>(this);
        }
        return this.f47852a;
    }

    public final void onCreate() {
        super.onCreate();
        m41133a().mo33060a();
    }

    public final void onDestroy() {
        m41133a().mo33063b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C17074dm a = m41133a();
        C17133r q = C17005ay.m41256a((Context) a.f48199a, (C17128m) null).mo32854q();
        if (intent == null) {
            q.f48448e.mo33376a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            q.f48453j.mo33378a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a.mo33061a((Runnable) new C17075dn(a, i2, q, intent));
            }
        }
        return 2;
    }

    public final IBinder onBind(Intent intent) {
        C17074dm a = m41133a();
        if (intent == null) {
            a.mo33065c().f48445b.mo33376a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C17008ba(C17092ed.m41559a((Context) a.f48199a));
        }
        a.mo33065c().f48448e.mo33377a("onBind received unknown action", action);
        return null;
    }

    public final boolean onUnbind(Intent intent) {
        return m41133a().mo33062a(intent);
    }

    public final void onRebind(Intent intent) {
        m41133a().mo33064b(intent);
    }

    /* renamed from: a */
    public final boolean mo32820a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo32818a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo32819a(Intent intent) {
        AppMeasurementReceiver.m2041a(intent);
    }
}
