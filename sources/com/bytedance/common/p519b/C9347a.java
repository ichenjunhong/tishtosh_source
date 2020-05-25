package com.bytedance.common.p519b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/* renamed from: com.bytedance.common.b.a */
public final class C9347a extends Observable implements ActivityLifecycleCallbacks, C9382a {

    /* renamed from: b */
    private static C9347a f25583b = null;

    /* renamed from: e */
    private static int f25584e = 0;

    /* renamed from: f */
    private static boolean f25585f = true;

    /* renamed from: a */
    public boolean f25586a;

    /* renamed from: c */
    private WeakReference<Activity> f25587c;

    /* renamed from: d */
    private Runnable f25588d = new Runnable() {
        public final void run() {
            if (C9347a.this.f25586a) {
                C9347a.this.f25586a = false;
            }
        }
    };

    /* renamed from: g */
    private C9381g f25589g = new C9381g(this);

    /* renamed from: h */
    private final List<ActivityLifecycleCallbacks> f25590h = new ArrayList();

    /* renamed from: b */
    public static boolean m18520b() {
        return f25585f;
    }

    private C9347a() {
    }

    /* renamed from: a */
    public static synchronized C9347a m18519a() {
        C9347a aVar;
        synchronized (C9347a.class) {
            if (f25583b == null) {
                f25583b = new C9347a();
            }
            aVar = f25583b;
        }
        return aVar;
    }

    /* renamed from: c */
    private Object[] m18521c() {
        Object[] objArr;
        synchronized (this.f25590h) {
            if (this.f25590h.size() > 0) {
                objArr = this.f25590h.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    public final void handleMsg(Message message) {
        if (message.what == 1 && f25585f) {
            setChanged();
            notifyObservers(Boolean.valueOf(f25585f));
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        Object[] c = m18521c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f25586a) {
            this.f25589g.postDelayed(this.f25588d, 30000);
        }
        Object[] c = m18521c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f25587c = new WeakReference<>(activity);
        if (!this.f25586a) {
            this.f25586a = true;
        }
        this.f25589g.removeCallbacks(this.f25588d);
        Object[] c = m18521c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        Object[] c = m18521c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        this.f25589g.removeMessages(1);
        if (f25584e == 0) {
            f25585f = false;
        }
        f25584e++;
    }

    public final void onActivityStopped(Activity activity) {
        Object[] c = m18521c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        int i = f25584e - 1;
        f25584e = i;
        if (i == 0) {
            f25585f = true;
            this.f25589g.sendEmptyMessageDelayed(1, 30000);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f25585f = false;
        Object[] c = m18521c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] c = m18521c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }
}
