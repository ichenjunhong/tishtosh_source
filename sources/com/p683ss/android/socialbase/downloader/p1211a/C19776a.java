package com.p683ss.android.socialbase.downloader.p1211a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.a.a */
public final class C19776a {

    /* renamed from: a */
    public Application f54468a;

    /* renamed from: b */
    public final List<C19778a> f54469b;

    /* renamed from: c */
    public int f54470c;

    /* renamed from: d */
    volatile int f54471d;

    /* renamed from: e */
    public final ActivityLifecycleCallbacks f54472e;

    /* renamed from: com.ss.android.socialbase.downloader.a.a$a */
    public interface C19778a {
        /* renamed from: a */
        void mo41222a();

        /* renamed from: b */
        void mo41223b();
    }

    /* renamed from: com.ss.android.socialbase.downloader.a.a$b */
    static class C19779b {

        /* renamed from: a */
        public static final C19776a f54474a = new C19776a();
    }

    /* renamed from: a */
    public static C19776a m48304a() {
        return C19779b.f54474a;
    }

    private C19776a() {
        this.f54469b = new ArrayList();
        this.f54471d = -1;
        this.f54472e = new ActivityLifecycleCallbacks() {
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityResumed(Activity activity) {
                int i;
                int i2 = C19776a.this.f54470c;
                C19776a aVar = C19776a.this;
                if (activity != null) {
                    i = activity.hashCode();
                } else {
                    i = i2;
                }
                aVar.f54470c = i;
                if (i2 == 0) {
                    C19776a.this.mo41214d();
                }
            }

            public final void onActivityStarted(Activity activity) {
                int i;
                int i2 = C19776a.this.f54470c;
                C19776a aVar = C19776a.this;
                if (activity != null) {
                    i = activity.hashCode();
                } else {
                    i = i2;
                }
                aVar.f54470c = i;
                if (i2 == 0) {
                    C19776a.this.mo41214d();
                }
            }

            public final void onActivityStopped(Activity activity) {
                if (activity != null && activity.hashCode() == C19776a.this.f54470c) {
                    C19776a.this.f54470c = 0;
                    C19776a aVar = C19776a.this;
                    C19819a.m48484a("AppStatusManager", "dispatchAppBackground");
                    aVar.f54471d = 0;
                    Object[] c = aVar.mo41213c();
                    if (c != null) {
                        for (Object obj : c) {
                            ((C19778a) obj).mo41223b();
                        }
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Object[] mo41213c() {
        Object[] objArr;
        synchronized (this.f54469b) {
            if (this.f54469b.size() > 0) {
                objArr = this.f54469b.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    /* renamed from: d */
    public final void mo41214d() {
        C19819a.m48484a("AppStatusManager", "dispatchAppForeground");
        this.f54471d = 1;
        Object[] c = mo41213c();
        if (c != null) {
            for (Object obj : c) {
                ((C19778a) obj).mo41222a();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo41212b() {
        int i = this.f54471d;
        if (i == -1) {
            Activity e = m48305e();
            if (this.f54471d == -1) {
                if (e != null) {
                    this.f54470c = e.hashCode();
                    this.f54471d = 1;
                } else {
                    this.f54471d = 0;
                }
            }
            i = this.f54471d;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static Activity m48305e() {
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map != null) {
                if (map.size() != 0) {
                    Class cls2 = null;
                    Field field = null;
                    for (Object next : map.values()) {
                        if (cls2 == null) {
                            cls2 = next.getClass();
                        }
                        if (field == null) {
                            field = cls2.getDeclaredField("paused");
                        }
                        field.setAccessible(true);
                        if (!field.getBoolean(next)) {
                            Field declaredField2 = cls2.getDeclaredField("activity");
                            declaredField2.setAccessible(true);
                            return (Activity) declaredField2.get(next);
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }
}
