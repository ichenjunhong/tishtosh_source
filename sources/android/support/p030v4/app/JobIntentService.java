package android.support.p030v4.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.app.JobIntentService */
public abstract class JobIntentService extends Service {
    static final HashMap<ComponentName, C0602h> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<C0597d> mCompatQueue;
    C0602h mCompatWorkEnqueuer;
    C0594a mCurProcessor;
    boolean mDestroyed;
    public boolean mInterruptIfStopped;
    C0595b mJobImpl;
    public boolean mStopped;

    /* renamed from: android.support.v4.app.JobIntentService$a */
    final class C0594a extends AsyncTask<Void, Void, Void> {
        C0594a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            while (true) {
                C0598e dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.mo2076a());
                dequeueWork.mo2077b();
            }
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$b */
    interface C0595b {
        /* renamed from: a */
        IBinder mo2070a();

        /* renamed from: b */
        C0598e mo2071b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$c */
    static final class C0596c extends C0602h {

        /* renamed from: a */
        boolean f2141a;

        /* renamed from: b */
        boolean f2142b;

        /* renamed from: f */
        private final Context f2143f;

        /* renamed from: g */
        private final WakeLock f2144g;

        /* renamed from: h */
        private final WakeLock f2145h;

        /* renamed from: a */
        public final void mo2072a() {
            synchronized (this) {
                this.f2141a = false;
            }
        }

        /* renamed from: b */
        public final void mo2074b() {
            synchronized (this) {
                if (!this.f2142b) {
                    this.f2142b = true;
                    this.f2145h.acquire(600000);
                    this.f2144g.release();
                }
            }
        }

        /* renamed from: c */
        public final void mo2075c() {
            synchronized (this) {
                if (this.f2142b) {
                    if (this.f2141a) {
                        this.f2144g.acquire(60000);
                    }
                    this.f2142b = false;
                    this.f2145h.release();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2073a(Intent intent) {
            ComponentName componentName;
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2156c);
            Context context = this.f2143f;
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent2)) {
                componentName = context.startService(intent2);
            } else {
                componentName = null;
            }
            if (componentName != null) {
                synchronized (this) {
                    if (!this.f2141a) {
                        this.f2141a = true;
                        if (!this.f2142b) {
                            this.f2144g.acquire(60000);
                        }
                    }
                }
            }
        }

        C0596c(Context context, ComponentName componentName) {
            super(context, componentName);
            this.f2143f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            this.f2144g = powerManager.newWakeLock(1, sb.toString());
            this.f2144g.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            this.f2145h = powerManager.newWakeLock(1, sb2.toString());
            this.f2145h.setReferenceCounted(false);
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$d */
    final class C0597d implements C0598e {

        /* renamed from: a */
        final Intent f2146a;

        /* renamed from: b */
        final int f2147b;

        /* renamed from: a */
        public final Intent mo2076a() {
            return this.f2146a;
        }

        /* renamed from: b */
        public final void mo2077b() {
            JobIntentService.this.stopSelf(this.f2147b);
        }

        C0597d(Intent intent, int i) {
            this.f2146a = intent;
            this.f2147b = i;
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$e */
    interface C0598e {
        /* renamed from: a */
        Intent mo2076a();

        /* renamed from: b */
        void mo2077b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$f */
    static final class C0599f extends JobServiceEngine implements C0595b {

        /* renamed from: a */
        final JobIntentService f2149a;

        /* renamed from: b */
        final Object f2150b = new Object();

        /* renamed from: c */
        JobParameters f2151c;

        /* renamed from: android.support.v4.app.JobIntentService$f$a */
        final class C0600a implements C0598e {

            /* renamed from: a */
            final JobWorkItem f2152a;

            /* renamed from: a */
            public final Intent mo2076a() {
                return this.f2152a.getIntent();
            }

            /* renamed from: b */
            public final void mo2077b() {
                synchronized (C0599f.this.f2150b) {
                    if (C0599f.this.f2151c != null) {
                        C0599f.this.f2151c.completeWork(this.f2152a);
                    }
                }
            }

            C0600a(JobWorkItem jobWorkItem) {
                this.f2152a = jobWorkItem;
            }
        }

        /* renamed from: a */
        public final IBinder mo2070a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2149a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new android.support.p030v4.app.JobIntentService.C0599f.C0600a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.support.p030v4.app.JobIntentService.C0598e mo2071b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2150b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2151c     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f2151c     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                android.support.v4.app.JobIntentService r2 = r3.f2149a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                android.support.v4.app.JobIntentService$f$a r0 = new android.support.v4.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.JobIntentService.C0599f.mo2071b():android.support.v4.app.JobIntentService$e");
        }

        C0599f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2149a = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f2151c = jobParameters;
            this.f2149a.ensureProcessorRunningLocked(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f2149a.doStopCurrentWork();
            synchronized (this.f2150b) {
                this.f2151c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$g */
    static final class C0601g extends C0602h {

        /* renamed from: a */
        private final JobInfo f2154a;

        /* renamed from: b */
        private final JobScheduler f2155b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2073a(Intent intent) {
            this.f2155b.enqueue(this.f2154a, new JobWorkItem(intent));
        }

        C0601g(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            mo2080a(i);
            this.f2154a = new Builder(i, this.f2156c).setOverrideDeadline(0).build();
            this.f2155b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$h */
    static abstract class C0602h {

        /* renamed from: c */
        final ComponentName f2156c;

        /* renamed from: d */
        boolean f2157d;

        /* renamed from: e */
        int f2158e;

        /* renamed from: a */
        public void mo2072a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo2073a(Intent intent);

        /* renamed from: b */
        public void mo2074b() {
        }

        /* renamed from: c */
        public void mo2075c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2080a(int i) {
            if (!this.f2157d) {
                this.f2157d = true;
                this.f2158e = i;
            } else if (this.f2158e != i) {
                StringBuilder sb = new StringBuilder("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.f2158e);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        C0602h(Context context, ComponentName componentName) {
            this.f2156c = componentName;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public JobIntentService() {
        if (VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean doStopCurrentWork() {
        if (this.mCurProcessor != null) {
            this.mCurProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mCompatQueue != null) {
            synchronized (this.mCompatQueue) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo2075c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public C0598e dequeueWork() {
        if (this.mJobImpl != null) {
            return this.mJobImpl.mo2071b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            C0598e eVar = (C0598e) this.mCompatQueue.remove(0);
            return eVar;
        }
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.mJobImpl = new C0599f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    /* access modifiers changed from: 0000 */
    public void processorFinished() {
        if (this.mCompatQueue != null) {
            synchronized (this.mCompatQueue) {
                this.mCurProcessor = null;
                if (this.mCompatQueue != null && this.mCompatQueue.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.mo2075c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        if (this.mJobImpl != null) {
            return this.mJobImpl.mo2070a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new C0594a();
            if (this.mCompatWorkEnqueuer != null && z) {
                this.mCompatWorkEnqueuer.mo2074b();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo2072a();
        synchronized (this.mCompatQueue) {
            ArrayList<C0597d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0597d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public static void enqueueWork(Context context, Class cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                C0602h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.mo2080a(i);
                workEnqueuer.mo2073a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    static C0602h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        C0602h hVar;
        C0602h hVar2 = (C0602h) sClassWorkEnqueuer.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (VERSION.SDK_INT < 26) {
            hVar = new C0596c(context, componentName);
        } else if (z) {
            hVar = new C0601g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0602h hVar3 = hVar;
        sClassWorkEnqueuer.put(componentName, hVar3);
        return hVar3;
    }
}
