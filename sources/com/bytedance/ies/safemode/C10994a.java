package com.bytedance.ies.safemode;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.safemode.a */
public final class C10994a implements ActivityLifecycleCallbacks, UncaughtExceptionHandler {

    /* renamed from: a */
    public static final C10994a f29527a = new C10994a();

    /* renamed from: b */
    public UncaughtExceptionHandler f29528b;

    /* renamed from: c */
    public Application f29529c;

    /* renamed from: d */
    private LinkedList<WeakReference<Activity>> f29530d = new LinkedList<>();

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    private void m22260a() {
        Iterator it = new ArrayList(this.f29530d).iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity != null && !(activity instanceof SafeModeActivity) && !activity.isFinishing()) {
                try {
                    activity.finish();
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Crash happened during finishing activity: ");
                    sb.append(th.getMessage());
                    sb.append(" from activity: ");
                    sb.append(activity.getLocalClassName());
                    C10999e.m22265a(sb.toString());
                }
            }
        }
        this.f29530d.clear();
    }

    public final void onActivityDestroyed(Activity activity) {
        if (!(activity instanceof SafeModeActivity)) {
            Iterator descendingIterator = this.f29530d.descendingIterator();
            while (descendingIterator.hasNext()) {
                if (((WeakReference) descendingIterator.next()).get() == activity) {
                    descendingIterator.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m22261a(Thread thread, Throwable th) {
        if (this.f29528b != null && th != null) {
            this.f29528b.uncaughtException(thread, th);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!(activity instanceof SafeModeActivity)) {
            this.f29530d.add(new WeakReference(activity));
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29529c.getPackageName());
        sb.append(":safemode");
        String sb2 = sb.toString();
        List<RunningAppProcessInfo> a = C11000f.m22266a(this.f29529c);
        int myPid = Process.myPid();
        String packageName = this.f29529c.getPackageName();
        boolean z3 = false;
        String str = packageName;
        boolean z4 = false;
        for (RunningAppProcessInfo runningAppProcessInfo : a) {
            if (sb2.equals(runningAppProcessInfo.processName)) {
                z4 = true;
            }
            if (runningAppProcessInfo.pid == myPid) {
                str = runningAppProcessInfo.processName;
            }
        }
        if (!z4) {
            if (!str.equals(this.f29529c.getPackageName())) {
                m22261a(thread, th);
                return;
            }
            C10996b a2 = C10996b.m22262a(this.f29529c);
            long currentTimeMillis = System.currentTimeMillis();
            if (!a2.f29538g || !a2.f29542k || currentTimeMillis - a2.f29543l > ((Long) a2.f29536e.mo19823a(Long.valueOf(8000))).longValue()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int intValue = ((Integer) a2.f29533b.mo19823a(Integer.valueOf(0))).intValue();
                if (currentTimeMillis - ((Long) a2.f29534c.mo19823a(Long.valueOf(0))).longValue() >= ((Long) a2.f29537f.mo19823a(Long.valueOf(FbUploadTokenTime.group0))).longValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    intValue = 0;
                }
                int i = intValue + 1;
                a2.f29533b.mo19824b(Integer.valueOf(i));
                a2.f29534c.mo19824b(Long.valueOf(currentTimeMillis));
                if (th != null) {
                    StringBuilder sb3 = new StringBuilder("Find boot crash: ");
                    sb3.append(th.getMessage());
                    sb3.append(", current crash times: ");
                    sb3.append(i);
                    C52711k.m112240b(sb3.toString(), "text");
                    C52711k.m112240b(th, "throwable");
                }
                int intValue2 = ((Integer) a2.f29535d.mo19823a(Integer.valueOf(3))).intValue();
                if (i >= intValue2) {
                    StringBuilder sb4 = new StringBuilder("Crash times reach threshold: ");
                    sb4.append(intValue2);
                    sb4.append(", get into safe mode.");
                    C10999e.m22265a(sb4.toString());
                    Runnable runnable = a2.f29540i;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Application application = this.f29529c;
                    Application application2 = this.f29529c;
                    C52711k.m112240b(application2, "context");
                    Intent addFlags = new Intent(application2, SafeModeActivity.class).addFlags(268435456).addFlags(32768);
                    C52711k.m112236a((Object) addFlags, "Intent(context, SafeMode…FLAG_ACTIVITY_CLEAR_TASK)");
                    application.startActivity(addFlags);
                    z3 = true;
                }
                m22260a();
            } else {
                a2.f29533b.mo19824b(Integer.valueOf(0));
            }
            if (z3) {
                C11000f.m22267a();
            } else {
                m22261a(thread, th);
            }
        }
    }
}
