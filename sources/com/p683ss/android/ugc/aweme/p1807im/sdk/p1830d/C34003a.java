package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.a */
public final class C34003a implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final C34003a f87925a = new C34003a();

    /* renamed from: b */
    private static WeakReference<Activity> f87926b;

    /* renamed from: c */
    private static WeakReference<Activity> f87927c;

    private C34003a() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        C52711k.m112240b(activity, "activity");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
    }

    public final void onActivityStarted(Activity activity) {
        C52711k.m112240b(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        C52711k.m112240b(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C52711k.m112240b(activity, "activity");
        f87927c = null;
    }

    public final void onActivityResumed(Activity activity) {
        C52711k.m112240b(activity, "activity");
        f87927c = new WeakReference<>(activity);
        f87926b = new WeakReference<>(activity);
    }
}
