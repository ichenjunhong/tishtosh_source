package com.p683ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.ugc.aweme.base.activity.w */
public final class C23448w {

    /* renamed from: com.ss.android.ugc.aweme.base.activity.w$a */
    static class C23449a implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<C23450b> f62518a;

        C23449a(WeakReference<C23450b> weakReference) {
            this.f62518a = weakReference;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (objArr[0].booleanValue() && this.f62518a.get() != null) {
                    ((C23450b) this.f62518a.get()).mo48612a();
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.w$b */
    public interface C23450b {
        /* renamed from: a */
        void mo48612a();
    }

    /* renamed from: b */
    public static void m57574b(Activity activity) {
        m57573a(activity, C23451x.f62519a);
    }

    /* renamed from: a */
    public static void m57572a(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m57576c(Activity activity) {
        Class[] declaredClasses;
        try {
            Class cls = null;
            for (Class cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[]{null});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m57573a(Activity activity, C23450b bVar) {
        if (VERSION.SDK_INT >= 21) {
            m57575b(activity, bVar);
        } else {
            m57576c(activity);
        }
    }

    /* renamed from: b */
    private static void m57575b(Activity activity, C23450b bVar) {
        Class[] declaredClasses;
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(activity, new Object[0]);
            Class cls = null;
            for (Class cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Object newProxyInstance = Proxy.newProxyInstance(Activity.class.getClassLoader(), new Class[]{cls}, new C23449a(new WeakReference(bVar)));
            Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls, ActivityOptions.class});
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(activity, new Object[]{newProxyInstance, invoke});
        } catch (Throwable unused) {
        }
    }
}
