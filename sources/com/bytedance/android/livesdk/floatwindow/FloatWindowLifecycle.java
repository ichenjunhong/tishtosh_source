package com.bytedance.android.livesdk.floatwindow;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

public class FloatWindowLifecycle extends BroadcastReceiver implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final C7172c f19469a;

    /* renamed from: b */
    public int f19470b;

    /* renamed from: c */
    public boolean f19471c;

    /* renamed from: d */
    private final boolean f19472d;

    /* renamed from: e */
    private final Class[] f19473e;

    /* renamed from: f */
    private final Handler f19474f = new Handler();

    /* renamed from: g */
    private int f19475g;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        this.f19475g++;
    }

    public void onActivityStopped(Activity activity) {
        this.f19475g--;
        if (this.f19475g == 0) {
            this.f19469a.mo13319a();
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f19470b--;
        this.f19474f.postDelayed(new Runnable() {
            public final void run() {
                if (FloatWindowLifecycle.this.f19470b == 0) {
                    FloatWindowLifecycle.this.f19471c = true;
                    FloatWindowLifecycle.this.f19469a.mo13319a();
                }
            }
        }, 300);
    }

    public void onActivityResumed(Activity activity) {
        this.f19470b++;
        if (this.f19473e != null) {
            Class[] clsArr = this.f19473e;
            int length = clsArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    boolean z = this.f19472d;
                    break;
                } else if (clsArr[i].isInstance(activity)) {
                    boolean z2 = this.f19472d;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (this.f19471c) {
            this.f19471c = false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            if ("homekey".equals(intent.getStringExtra("reason"))) {
                this.f19469a.mo13319a();
            }
        }
    }

    public FloatWindowLifecycle(Context context, boolean z, Class[] clsArr, C7172c cVar) {
        this.f19472d = z;
        this.f19473e = clsArr;
        this.f19469a = cVar;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        context.registerReceiver(this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }
}
