package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C15270b implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: c */
    private static final C15270b f39429c = new C15270b();

    /* renamed from: a */
    final AtomicBoolean f39430a = new AtomicBoolean();

    /* renamed from: b */
    final AtomicBoolean f39431b = new AtomicBoolean();

    /* renamed from: d */
    private final ArrayList<C15271a> f39432d = new ArrayList<>();

    /* renamed from: e */
    private boolean f39433e = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface C15271a {
        /* renamed from: a */
        void mo28197a(boolean z);
    }

    private C15270b() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    /* renamed from: a */
    public static C15270b m31652a() {
        return f39429c;
    }

    /* renamed from: a */
    public static void m31653a(Application application) {
        synchronized (f39429c) {
            if (!f39429c.f39433e) {
                application.registerActivityLifecycleCallbacks(f39429c);
                application.registerComponentCallbacks(f39429c);
                f39429c.f39433e = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo28198a(C15271a aVar) {
        synchronized (f39429c) {
            this.f39432d.add(aVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f39430a.compareAndSet(true, false);
        this.f39431b.set(true);
        if (compareAndSet) {
            m31654a(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f39430a.compareAndSet(true, false);
        this.f39431b.set(true);
        if (compareAndSet) {
            m31654a(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f39430a.compareAndSet(false, true)) {
            this.f39431b.set(true);
            m31654a(true);
        }
    }

    /* renamed from: a */
    private final void m31654a(boolean z) {
        synchronized (f39429c) {
            ArrayList arrayList = this.f39432d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C15271a) obj).mo28197a(z);
            }
        }
    }
}
