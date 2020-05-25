package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.measurement.az */
public final class C16555az extends C16860r {

    /* renamed from: a */
    public boolean f46498a;

    /* renamed from: c */
    public boolean f46499c;

    /* renamed from: d */
    private final AlarmManager f46500d = ((AlarmManager) mo32506g().getSystemService("alarm"));

    /* renamed from: e */
    private Integer f46501e;

    protected C16555az(C16862t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
        try {
            mo31819c();
            if (C16550au.m39483e() > 0) {
                Context g = mo32506g();
                ActivityInfo receiverInfo = g.getPackageManager().getReceiverInfo(new ComponentName(g, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    mo32493b("Receiver registered for local dispatch.");
                    this.f46498a = true;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public final void mo31818b() {
        mo32516r();
        C15464q.m32130a(this.f46498a, (Object) "Receiver not registered");
        long e = C16550au.m39483e();
        if (e > 0) {
            mo31819c();
            long b = mo32504f().mo28524b() + e;
            this.f46499c = true;
            ((Boolean) C16559bc.f46508F.f46547a).booleanValue();
            if (VERSION.SDK_INT >= 24) {
                mo32493b("Scheduling upload with JobScheduler");
                Context g = mo32506g();
                ComponentName componentName = new ComponentName(g, "com.google.android.gms.analytics.AnalyticsJobService");
                int e2 = m39503e();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo build = new Builder(e2, componentName).setMinimumLatency(e).setOverrideDeadline(e << 1).setExtras(persistableBundle).build();
                mo32490a("Scheduling job. JobID", Integer.valueOf(e2));
                C16587cd.m39600a(g, build, "com.google.android.gms", "DispatchAlarm");
                return;
            }
            mo32493b("Scheduling upload with AlarmManager");
            this.f46500d.setInexactRepeating(2, b, e, m39502d());
        }
    }

    /* renamed from: d */
    private final PendingIntent m39502d() {
        Context g = mo32506g();
        return PendingIntent.getBroadcast(g, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(g, "com.google.android.gms.analytics.AnalyticsReceiver")), 0);
    }

    /* renamed from: c */
    public final void mo31819c() {
        this.f46499c = false;
        this.f46500d.cancel(m39502d());
        if (VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) mo32506g().getSystemService("jobscheduler");
            int e = m39503e();
            mo32490a("Cancelling job. JobID", Integer.valueOf(e));
            jobScheduler.cancel(e);
        }
    }

    /* renamed from: e */
    private final int m39503e() {
        if (this.f46501e == null) {
            String str = "analytics";
            String valueOf = String.valueOf(mo32506g().getPackageName());
            this.f46501e = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f46501e.intValue();
    }
}
