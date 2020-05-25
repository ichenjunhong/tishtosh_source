package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.ac */
public final class C22921ac {

    /* renamed from: a */
    public static final C22923b f61249a = new C22923b(null);

    /* renamed from: com.ss.android.ugc.aweme.app.ac$a */
    public static final class C22922a implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        private int f61250a;

        /* renamed from: b */
        private final String f61251b;

        /* renamed from: c */
        private final String f61252c;

        public final void onActivityDestroyed(Activity activity) {
        }

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

        public C22922a(String str, String str2) {
            C52711k.m112240b(str, "className");
            C52711k.m112240b(str2, "toast");
            this.f61251b = str;
            this.f61252c = str2;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity == null || !TextUtils.equals(activity.getClass().getName(), this.f61251b)) {
                this.f61250a++;
                if (this.f61250a > 5) {
                    AwemeApplication.f61139b.unregisterActivityLifecycleCallbacks(this);
                }
                return;
            }
            C10691a.m21552c(C11010c.m22280a(), this.f61252c, 1).mo19066a();
            AwemeApplication.f61139b.unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ac$b */
    public static final class C22923b {
        private C22923b() {
        }

        public /* synthetic */ C22923b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m56373a(String str, String str2) {
            C52711k.m112240b(str, "className");
            C52711k.m112240b(str2, "toast");
            AwemeApplication.f61139b.registerActivityLifecycleCallbacks(new C22922a(str, str2));
        }
    }
}
