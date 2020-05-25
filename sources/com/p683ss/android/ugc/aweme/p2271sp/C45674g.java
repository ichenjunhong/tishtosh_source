package com.p683ss.android.ugc.aweme.p2271sp;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.sp.g */
public final class C45674g extends Instrumentation {

    /* renamed from: a */
    private static Field f115506a;

    /* renamed from: b */
    private Instrumentation f115507b;

    static {
        try {
            Field declaredField = Class.forName("android.content.ContextWrapper").getDeclaredField("mBase");
            f115506a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        } catch (ClassNotFoundException unused2) {
        }
    }

    public C45674g(Instrumentation instrumentation) {
        this.f115507b = instrumentation;
    }

    public final void callActivityOnDestroy(Activity activity) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    public final void callActivityOnPause(Activity activity) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    public final void callActivityOnRestart(Activity activity) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    public final void callActivityOnResume(Activity activity) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    public final void callActivityOnStart(Activity activity) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    public final void callActivityOnStop(Activity activity) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    public final void callActivityOnUserLeaving(Activity activity) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    public final void callApplicationOnCreate(Application application) {
        if (this.f115507b != null) {
            this.f115507b.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        if (this.f115507b != null) {
            this.f115507b.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    public final boolean onException(Object obj, Throwable th) {
        if (this.f115507b != null) {
            return this.f115507b.onException(obj, th);
        }
        return super.onException(obj, th);
    }

    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        try {
            if (f115506a != null) {
                if (!(((Context) f115506a.get(activity)) instanceof C45673f)) {
                    f115506a.set(activity, new C45673f(activity.getBaseContext()));
                }
            }
        } catch (Exception unused) {
        }
        if (this.f115507b != null) {
            this.f115507b.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f115507b == null) {
            return super.newActivity(classLoader, str, intent);
        }
        return this.f115507b.newActivity(classLoader, str, intent);
    }

    public final Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        if (this.f115507b != null) {
            return this.f115507b.newApplication(classLoader, str, context);
        }
        return super.newApplication(classLoader, str, context);
    }

    public final Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws IllegalAccessException, InstantiationException {
        if (this.f115507b != null) {
            return this.f115507b.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
