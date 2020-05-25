package com.p683ss.android.ugc.aweme.util.crony;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.IntentFilter;
import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.util.crony.a */
public final class C47616a {

    /* renamed from: a */
    static Application f120084a;

    /* renamed from: b */
    static String f120085b;

    /* renamed from: c */
    static C47619c f120086c;

    /* renamed from: b */
    private static void m103094b() {
        f120084a.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
                C47616a.f120085b = null;
            }

            public final void onActivityResumed(Activity activity) {
                C47616a.f120085b = activity.getClass().getCanonicalName();
            }
        });
    }

    /* renamed from: a */
    private static void m103091a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_clipboard");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_clipboard_put");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_activity");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_info");
        f120084a.registerReceiver(new CronyReceiver(), intentFilter);
    }

    /* renamed from: a */
    public static void m103093a(C47619c cVar) {
        f120086c = cVar;
    }

    /* renamed from: a */
    public static void m103092a(Application application) {
        f120084a = application;
        m103091a();
        m103094b();
    }
}
