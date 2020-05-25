package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.measurement.C16808jq;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.analytics.l */
public final class C15098l {

    /* renamed from: e */
    private static volatile C15098l f38971e;

    /* renamed from: a */
    public final Context f38972a;

    /* renamed from: b */
    final List<Object> f38973b = new CopyOnWriteArrayList();

    /* renamed from: c */
    final C15099a f38974c = new C15099a();

    /* renamed from: d */
    public UncaughtExceptionHandler f38975d;

    /* renamed from: f */
    private final C15093g f38976f = new C15093g();

    /* renamed from: g */
    private volatile C16808jq f38977g;

    /* renamed from: com.google.android.gms.analytics.l$a */
    class C15099a extends ThreadPoolExecutor {
        public C15099a() {
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new C15100b(null));
            allowCoreThreadTimeOut(true);
        }

        /* access modifiers changed from: protected */
        public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new C15103n(this, runnable, t);
        }
    }

    /* renamed from: com.google.android.gms.analytics.l$b */
    static class C15100b implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f38979a = new AtomicInteger();

        private C15100b() {
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = f38979a.incrementAndGet();
            StringBuilder sb = new StringBuilder(23);
            sb.append("measurement-");
            sb.append(incrementAndGet);
            return new C15101c(runnable, sb.toString());
        }

        /* synthetic */ C15100b(C15102m mVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.analytics.l$c */
    static class C15101c extends Thread {
        C15101c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    private C15098l(Context context) {
        Context applicationContext = context.getApplicationContext();
        C15464q.m32123a(applicationContext);
        this.f38972a = applicationContext;
    }

    /* renamed from: a */
    public static C15098l m31265a(Context context) {
        C15464q.m32123a(context);
        if (f38971e == null) {
            synchronized (C15098l.class) {
                if (f38971e == null) {
                    f38971e = new C15098l(context);
                }
            }
        }
        return f38971e;
    }

    /* renamed from: a */
    public final C16808jq mo27843a() {
        if (this.f38977g == null) {
            synchronized (this) {
                if (this.f38977g == null) {
                    C16808jq jqVar = new C16808jq();
                    PackageManager packageManager = this.f38972a.getPackageManager();
                    String packageName = this.f38972a.getPackageName();
                    jqVar.f47211c = packageName;
                    jqVar.f47212d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f38972a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException unused) {
                        String str2 = "Error retrieving package info: appName set to ";
                        String valueOf = String.valueOf(packageName);
                        if (valueOf.length() != 0) {
                            str2.concat(valueOf);
                        } else {
                            new String(str2);
                        }
                    }
                    jqVar.f47209a = packageName;
                    jqVar.f47210b = str;
                    this.f38977g = jqVar;
                }
            }
        }
        return this.f38977g;
    }

    /* renamed from: b */
    public static void m31266b() {
        if (!(Thread.currentThread() instanceof C15101c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public final <V> Future<V> mo27844a(Callable<V> callable) {
        C15464q.m32123a(callable);
        if (!(Thread.currentThread() instanceof C15101c)) {
            return this.f38974c.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* renamed from: a */
    public final void mo27845a(Runnable runnable) {
        C15464q.m32123a(runnable);
        this.f38974c.submit(runnable);
    }
}
