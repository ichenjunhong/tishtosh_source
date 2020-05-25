package com.bytedance.common.wschannel;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;

/* renamed from: com.bytedance.common.wschannel.b */
final class C9447b implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f25724a;

    /* renamed from: c */
    private static C9381g f25725c = new C9381g(Looper.getMainLooper(), new C9382a() {
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: b */
    public C9450a f25726b;

    /* renamed from: d */
    private Runnable f25727d = new Runnable() {
        public final void run() {
            if (C9447b.f25724a) {
                C9447b.f25724a = false;
                if (C9447b.this.f25726b != null) {
                    C9447b.this.f25726b.mo17122b();
                }
            }
        }
    };

    /* renamed from: com.bytedance.common.wschannel.b$a */
    public interface C9450a {
        /* renamed from: a */
        void mo17121a();

        /* renamed from: b */
        void mo17122b();
    }

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

    C9447b() {
    }

    public final void onActivityPaused(Activity activity) {
        if (f25724a) {
            f25725c.postDelayed(this.f25727d, 3000);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f25724a) {
            f25724a = true;
            if (this.f25726b != null) {
                this.f25726b.mo17121a();
            }
        }
        f25725c.removeCallbacks(this.f25727d);
    }
}
