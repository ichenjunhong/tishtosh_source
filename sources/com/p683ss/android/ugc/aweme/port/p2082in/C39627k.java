package com.p683ss.android.ugc.aweme.port.p2082in;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.p1057b.p1058a.C17422l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.port.in.k */
final class C39627k {

    /* renamed from: a */
    public boolean f101196a;

    /* renamed from: b */
    public final Set<Activity> f101197b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public int f101198c = 2;

    /* renamed from: d */
    public int f101199d = 0;

    /* renamed from: e */
    public int f101200e = 0;

    /* renamed from: f */
    private final List<Object> f101201f = new ArrayList();

    /* renamed from: g */
    private final List<Object> f101202g = new ArrayList();

    /* renamed from: a */
    public final void mo80695a(int i) {
        this.f101198c = i;
        Iterator it = this.f101201f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C39627k(Application application) {
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityResumed(Activity activity) {
                C39627k.this.mo80696a(new C39626j(activity, 5));
            }

            public final void onActivityStarted(Activity activity) {
                C39627k.this.f101200e++;
                if (C39627k.this.f101200e == 1) {
                    C39627k.this.mo80695a(1);
                }
                C39627k.this.mo80696a(new C39626j(activity, 3));
            }

            public final void onActivityStopped(Activity activity) {
                C39627k.this.f101200e--;
                if (C39627k.this.f101200e == 0) {
                    C39627k.this.mo80695a(2);
                }
            }

            public final void onActivityDestroyed(Activity activity) {
                C39627k.this.f101199d--;
                C39627k.this.mo80696a(new C39626j(activity, 2));
                C39627k.this.f101197b.remove(activity);
                if (C39627k.m88228a(activity)) {
                    C39627k.this.f101196a = false;
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                C39627k.this.f101199d++;
                C39627k.this.mo80696a(new C39626j(activity, 1));
                C39627k.this.f101197b.add(activity);
                if (C39627k.m88228a(activity)) {
                    C39627k.this.f101196a = true;
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m88228a(Activity activity) {
        if (TextUtils.equals(activity.getClass().getSimpleName(), "LiveBgBroadcastActivity") || TextUtils.equals(activity.getClass().getSimpleName(), "LiveBroadcastActivity")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo80696a(C39626j jVar) {
        Iterator it = this.f101202g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final boolean mo80697a(C17422l<Activity> lVar) {
        for (Activity apply : this.f101197b) {
            if (lVar.apply(apply)) {
                return true;
            }
        }
        return false;
    }
}
