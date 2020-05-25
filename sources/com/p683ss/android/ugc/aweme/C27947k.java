package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26389an;
import com.p683ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy;
import com.p683ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy.ActivityProxy;
import com.p683ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy.C26320a;
import com.p683ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy.C26321b;
import com.p683ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy.C26322c;
import com.p683ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy.C26323d;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.util.C47626j;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.k */
public final class C27947k {

    /* renamed from: i */
    public static WeakReference<Activity> f73366i = new WeakReference<>(null);

    /* renamed from: a */
    public int f73367a;

    /* renamed from: b */
    public volatile boolean f73368b = true;

    /* renamed from: c */
    public long f73369c;

    /* renamed from: d */
    public C27979p f73370d;

    /* renamed from: e */
    public C27949a f73371e;

    /* renamed from: f */
    public volatile boolean f73372f = true;

    /* renamed from: g */
    public long f73373g;

    /* renamed from: h */
    public int f73374h;

    /* renamed from: com.ss.android.ugc.aweme.k$a */
    public interface C27949a {
        /* renamed from: a */
        void mo56360a(Activity activity);

        /* renamed from: b */
        void mo56361b(Activity activity);
    }

    /* renamed from: b */
    public static WeakReference<Activity> m66703b() {
        return f73366i;
    }

    /* renamed from: a */
    public final boolean mo56352a() {
        if (this.f73374h > 0) {
            return true;
        }
        return false;
    }

    public C27947k(Application application) {
        if (application == null) {
            this.f73368b = false;
            return;
        }
        application.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
                if (activity instanceof MainActivity) {
                    C27947k.this.f73374h--;
                }
            }

            public final void onActivityPaused(Activity activity) {
                if (activity != null) {
                    C22464ae.m55520a(activity);
                }
                C27947k.this.f73372f = true;
                C27947k.this.f73373g = System.currentTimeMillis();
                RocketActivityProxy.m63709a(activity, new C26320a(ActivityProxy.f69467a));
            }

            public final void onActivityResumed(Activity activity) {
                if (activity != null) {
                    C22464ae.m55520a(activity);
                    C22464ae.f60517a.addFirst(new WeakReference(activity));
                }
                if (I18nBridgeService.getBridgeService_Monster().needCallbackOnActivityResumed(activity) && C27947k.this.f73370d != null) {
                    C27947k.this.f73370d.mo47074c();
                }
                C27947k.this.f73372f = false;
                C27947k.f73366i = new WeakReference<>(activity);
                RocketActivityProxy.m63709a(activity, new C26321b(ActivityProxy.f69467a));
            }

            public final void onActivityStarted(Activity activity) {
                RocketActivityProxy.m63709a(activity, new C26322c(ActivityProxy.f69467a));
                C27947k.this.f73367a++;
                if (C27947k.this.f73367a == 1) {
                    C27947k.this.f73368b = false;
                    if (C27947k.this.f73370d != null) {
                        C27947k.this.f73370d.mo47070a();
                    }
                    if (C27947k.this.f73371e != null) {
                        C27947k.this.f73371e.mo56360a(activity);
                    }
                    if (C47626j.m103108b() && C47626j.m103108b()) {
                        C47626j.m103105a().mo22735a();
                    }
                }
            }

            public final void onActivityStopped(Activity activity) {
                RocketActivityProxy.m63709a(activity, new C26323d(ActivityProxy.f69467a));
                C27947k.this.f73367a--;
                if (C27947k.this.f73367a == 0) {
                    C27947k.this.f73368b = true;
                    C27947k.this.f73369c = System.currentTimeMillis();
                    if (C27947k.this.f73370d != null) {
                        C27947k.this.f73370d.mo47072b();
                    }
                    if (C27947k.this.f73371e != null) {
                        C27947k.this.f73371e.mo56361b(activity);
                    }
                    if (C47626j.m103108b() && C47626j.m103108b()) {
                        C47626j.m103105a().mo22741b();
                    }
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MainActivity) {
                    C27947k.this.f73374h++;
                }
            }
        });
        if (application != null) {
            C26389an.f69619c.mo54109a(application);
        }
    }
}
