package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.internal.measurement.C16587cd;

/* renamed from: com.google.android.gms.measurement.internal.dz */
public final class C17087dz extends C17091ec {

    /* renamed from: a */
    private final AlarmManager f48225a = ((AlarmManager) mo32850m().getSystemService("alarm"));

    /* renamed from: c */
    private final C17119fc f48226c;

    /* renamed from: d */
    private Integer f48227d;

    protected C17087dz(C17092ed edVar) {
        super(edVar);
        this.f48226c = new C17089ea(this, edVar.f48236b, edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32904d() {
        this.f48225a.cancel(m41531w());
        if (VERSION.SDK_INT >= 24) {
            m41529u();
        }
        return false;
    }

    /* renamed from: u */
    private final void m41529u() {
        JobScheduler jobScheduler = (JobScheduler) mo32850m().getSystemService("jobscheduler");
        int v = m41530v();
        mo32854q().f48453j.mo33377a("Cancelling job. JobID", Integer.valueOf(v));
        jobScheduler.cancel(v);
    }

    /* renamed from: a */
    public final void mo33083a(long j) {
        mo33089j();
        Context m = mo32850m();
        if (!C16995ao.m41192a(m)) {
            mo32854q().f48452i.mo33376a("Receiver not registered/enabled");
        }
        if (!C17102em.m41660a(m, false)) {
            mo32854q().f48452i.mo33376a("Service not registered/enabled");
        }
        mo33084e();
        long b = mo32849l().mo28524b() + j;
        if (j < Math.max(0, ((Long) C17122h.f48343G.mo33351b()).longValue()) && !this.f48226c.mo33345b()) {
            mo32854q().f48453j.mo33376a("Scheduling upload with DelayedRunnable");
            this.f48226c.mo33344a(j);
        }
        if (VERSION.SDK_INT >= 24) {
            mo32854q().f48453j.mo33376a("Scheduling upload with JobScheduler");
            Context m2 = mo32850m();
            ComponentName componentName = new ComponentName(m2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v = m41530v();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(v, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            mo32854q().f48453j.mo33377a("Scheduling job. JobID", Integer.valueOf(v));
            C16587cd.m39600a(m2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        mo32854q().f48453j.mo33376a("Scheduling upload with AlarmManager");
        this.f48225a.setInexactRepeating(2, b, Math.max(((Long) C17122h.f48338B.mo33351b()).longValue(), j), m41531w());
    }

    /* renamed from: v */
    private final int m41530v() {
        if (this.f48227d == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo32850m().getPackageName());
            this.f48227d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f48227d.intValue();
    }

    /* renamed from: e */
    public final void mo33084e() {
        mo33089j();
        this.f48225a.cancel(m41531w());
        this.f48226c.mo33346c();
        if (VERSION.SDK_INT >= 24) {
            m41529u();
        }
    }

    /* renamed from: w */
    private final PendingIntent m41531w() {
        Context m = mo32850m();
        return PendingIntent.getBroadcast(m, 0, new Intent().setClassName(m, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C17099ej mo32906f() {
        return super.mo32906f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C17107er mo32908g() {
        return super.mo32908g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C17113ex mo32910h() {
        return super.mo32910h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
