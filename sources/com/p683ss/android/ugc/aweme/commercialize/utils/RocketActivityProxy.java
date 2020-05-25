package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.base.C11081c;
import com.bytedance.ies.uikit.base.C11081c.C11082a;
import com.bytedance.ies.uikit.base.C11081c.C11084c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy */
public final class RocketActivityProxy {

    /* renamed from: a */
    public static final RocketActivityProxy f69466a = new RocketActivityProxy();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy$ActivityProxy */
    public static final class ActivityProxy extends AbsActivity {

        /* renamed from: a */
        public static final ActivityProxy f69467a = new ActivityProxy();

        private ActivityProxy() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy$a */
    public static final /* synthetic */ class C26320a extends C52710j implements C52671b<Activity, C52860x> {
        public C26320a(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyPause";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(ActivityProxy.class);
        }

        public final String getSignature() {
            return "proxyPause(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C52711k.m112240b(activity, "p1");
            C52711k.m112240b(activity, "activity");
            C11082a b = C11081c.m22430b();
            if (b != null) {
                b.mo20105b(activity);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy$b */
    public static final /* synthetic */ class C26321b extends C52710j implements C52671b<Activity, C52860x> {
        public C26321b(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyResume";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(ActivityProxy.class);
        }

        public final String getSignature() {
            return "proxyResume(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C52711k.m112240b(activity, "p1");
            C52711k.m112240b(activity, "activity");
            C11082a b = C11081c.m22430b();
            if (b != null) {
                b.mo20104a(activity);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy$c */
    public static final /* synthetic */ class C26322c extends C52710j implements C52671b<Activity, C52860x> {
        public C26322c(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyStart";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(ActivityProxy.class);
        }

        public final String getSignature() {
            return "proxyStart(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C52711k.m112240b(activity, "p1");
            C52711k.m112240b(activity, "activity");
            if (AbsActivity.mStartNum == 0) {
                C11084c d = C11081c.m22432d();
                if (d != null) {
                    d.mo20107a(false);
                }
            }
            AbsActivity.mStartNum++;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy$d */
    public static final /* synthetic */ class C26323d extends C52710j implements C52671b<Activity, C52860x> {
        public C26323d(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyStop";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(ActivityProxy.class);
        }

        public final String getSignature() {
            return "proxyStop(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C52711k.m112240b(activity, "p1");
            C52711k.m112240b(activity, "activity");
            int i = AbsActivity.mStartNum - 1;
            AbsActivity.mStartNum = i;
            if (i == 0) {
                C11084c d = C11081c.m22432d();
                if (d != null) {
                    d.mo20107a(true);
                }
            }
            return C52860x.f131107a;
        }
    }

    private RocketActivityProxy() {
    }

    /* renamed from: a */
    public static void m63709a(Activity activity, C52671b<? super Activity, C52860x> bVar) {
        if (!(activity instanceof AbsActivity) && activity != null) {
            Class cls = activity.getClass();
            if (cls != null) {
                String canonicalName = cls.getCanonicalName();
                if (canonicalName != null && C52830p.m112411b(canonicalName, "com.rocket.", false, 2, null)) {
                    bVar.invoke(activity);
                }
            }
        }
    }
}
