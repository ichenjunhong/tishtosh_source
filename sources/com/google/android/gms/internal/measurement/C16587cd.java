package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.cd */
public final class C16587cd {

    /* renamed from: b */
    private static final Method f46612b = m39601a();

    /* renamed from: c */
    private static final Method f46613c = m39602b();

    /* renamed from: d */
    private static volatile C16589cf f46614d = C16588ce.f46616a;

    /* renamed from: a */
    private final JobScheduler f46615a;

    /* renamed from: a */
    private static Method m39601a() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Method m39602b() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m39603c() {
        if (f46613c != null) {
            try {
                return ((Integer) f46613c.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return 0;
    }

    private C16587cd(JobScheduler jobScheduler) {
        this.f46615a = jobScheduler;
    }

    /* renamed from: a */
    private final int m39599a(JobInfo jobInfo, String str, int i, String str2) {
        if (f46612b != null) {
            try {
                return ((Integer) f46612b.invoke(this.f46615a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.f46615a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m39600a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f46612b == null || !f46614d.mo31865a() || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C16587cd(jobScheduler).m39599a(jobInfo, str, m39603c(), str2);
    }
}
