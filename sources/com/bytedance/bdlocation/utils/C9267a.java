package com.bytedance.bdlocation.utils;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.bytedance.bdlocation.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.bdlocation.utils.a */
public final class C9267a {

    /* renamed from: a */
    public static int f25373a;

    /* renamed from: b */
    public static List<C9269a> f25374b = new ArrayList();

    /* renamed from: c */
    public static ActivityLifecycleCallbacks f25375c = new ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (C9267a.f25373a == 0) {
                C9267a.m18386a(false);
            }
            C9267a.f25373a++;
        }

        public final void onActivityStopped(Activity activity) {
            int i = C9267a.f25373a - 1;
            C9267a.f25373a = i;
            if (i == 0) {
                C9267a.m18386a(true);
            }
        }
    };

    /* renamed from: com.bytedance.bdlocation.utils.a$a */
    public interface C9269a {
        /* renamed from: a */
        void mo16805a(boolean z);
    }

    private C9267a() {
    }

    /* renamed from: a */
    public static void m18386a(boolean z) {
        synchronized (C9267a.class) {
            if (!Util.isEmpty(f25374b)) {
                for (C9269a a : f25374b) {
                    a.mo16805a(z);
                }
            }
        }
    }
}
