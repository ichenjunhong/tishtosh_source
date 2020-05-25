package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.appsflyer.n */
final class C2526n implements ActivityLifecycleCallbacks {

    /* renamed from: ॱ */
    private static C2526n f7841;
    /* access modifiers changed from: private */

    /* renamed from: ˊ */
    public C2527a f7842;
    /* access modifiers changed from: private */

    /* renamed from: ˋ */
    public boolean f7843 = true;
    /* access modifiers changed from: private */

    /* renamed from: ˏ */
    public boolean f7844;

    /* renamed from: com.appsflyer.n$a */
    interface C2527a {
        /* renamed from: ˊ */
        void mo6954(WeakReference<Context> weakReference);

        /* renamed from: ॱ */
        void mo6955(Activity activity);
    }

    /* renamed from: com.appsflyer.n$b */
    class C2528b extends AsyncTask<Void, Void, Void> {

        /* renamed from: ˋ */
        private WeakReference<Context> f7845;

        /* renamed from: ˎ */
        private Void m7405() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                AFLogger.afErrorLog("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            if (C2526n.this.f7844 && C2526n.this.f7843) {
                C2526n.this.f7844 = false;
                try {
                    C2526n.this.f7842.mo6954(this.f7845);
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Listener threw exception! ", e2);
                    cancel(true);
                }
            }
            this.f7845.clear();
            return null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m7405();
        }

        public C2528b(WeakReference<Context> weakReference) {
            this.f7845 = weakReference;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    C2526n() {
    }

    /* renamed from: ˊ */
    static C2526n m7396() {
        if (f7841 == null) {
            f7841 = new C2526n();
        }
        return f7841;
    }

    /* renamed from: ˋ */
    public static C2526n m7398() {
        if (f7841 != null) {
            return f7841;
        }
        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
    }

    public final void onActivityResumed(Activity activity) {
        this.f7843 = false;
        boolean z = !this.f7844;
        this.f7844 = true;
        if (z) {
            try {
                this.f7842.mo6955(activity);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f7843 = true;
        try {
            new C2528b(new WeakReference(activity.getApplicationContext())).executeOnExecutor(AFExecutor.getInstance().getThreadPoolExecutor(), new Void[0]);
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
    }

    /* renamed from: ˊ */
    public final void mo7032(Application application, C2527a aVar) {
        this.f7842 = aVar;
        if (VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(f7841);
        }
    }
}
