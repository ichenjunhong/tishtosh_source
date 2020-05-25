package com.p683ss.sys.ces.p2581b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.view.Window;
import com.p683ss.p1096a.p1098b.C18485e;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.sys.ces.b.b */
public class C51390b implements ActivityLifecycleCallbacks {

    /* renamed from: b */
    public static WeakReference<Activity> f128490b;

    /* renamed from: c */
    private static volatile C51390b f128491c;

    /* renamed from: a */
    public final C18485e<Activity> f128492a = new C18485e<>();

    /* renamed from: a */
    public static C51390b m110526a() {
        if (f128491c == null) {
            synchronized (C51390b.class) {
                if (f128491c == null) {
                    f128491c = new C51390b();
                }
            }
        }
        return f128491c;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f128492a.contains(activity)) {
            try {
                Window window = activity.getWindow();
                if (window != null) {
                    window.setCallback(new C51392d(window.getCallback()));
                }
            } catch (Throwable unused) {
            }
        }
        this.f128492a.add(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        synchronized (this.f128492a) {
            this.f128492a.remove(activity);
            this.f128492a.notify();
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        f128490b = new WeakReference<>(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
