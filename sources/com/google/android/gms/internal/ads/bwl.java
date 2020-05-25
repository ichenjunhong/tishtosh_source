package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bwl implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Activity f44138a;

    /* renamed from: b */
    public Context f44139b;

    /* renamed from: c */
    final Object f44140c = new Object();

    /* renamed from: d */
    boolean f44141d = true;

    /* renamed from: e */
    boolean f44142e = false;

    /* renamed from: f */
    final List<bwn> f44143f = new ArrayList();

    /* renamed from: g */
    public boolean f44144g = false;

    /* renamed from: h */
    public long f44145h;

    /* renamed from: i */
    private final List<bxa> f44146i = new ArrayList();

    /* renamed from: j */
    private Runnable f44147j;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    public final void mo30819a(bwn bwn) {
        synchronized (this.f44140c) {
            this.f44143f.add(bwn);
        }
    }

    public final void onActivityStarted(Activity activity) {
        mo30818a(activity);
    }

    public final void onActivityResumed(Activity activity) {
        mo30818a(activity);
        this.f44142e = false;
        boolean z = !this.f44141d;
        this.f44141d = true;
        if (this.f44147j != null) {
            acd.f40245a.removeCallbacks(this.f44147j);
        }
        synchronized (this.f44140c) {
            Iterator it = this.f44146i.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (z) {
                for (bwn a : this.f44143f) {
                    try {
                        a.mo28615a(true);
                    } catch (Exception e) {
                        afc.m32793b("", e);
                    }
                }
            } else {
                abv.m32792b("App is still foreground.");
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        mo30818a(activity);
        synchronized (this.f44140c) {
            Iterator it = this.f44146i.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.f44142e = true;
        if (this.f44147j != null) {
            acd.f40245a.removeCallbacks(this.f44147j);
        }
        Handler handler = acd.f40245a;
        bwm bwm = new bwm(this);
        this.f44147j = bwm;
        handler.postDelayed(bwm, this.f44145h);
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f44140c) {
            if (this.f44138a != null) {
                if (this.f44138a.equals(activity)) {
                    this.f44138a = null;
                }
                Iterator it = this.f44146i.iterator();
                while (it.hasNext()) {
                    try {
                        if (((bxa) it.next()).mo30840a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C14963ax.m30834d().mo28588a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        afc.m32793b("", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo30818a(Activity activity) {
        synchronized (this.f44140c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f44138a = activity;
            }
        }
    }
}
