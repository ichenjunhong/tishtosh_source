package android.support.p030v4.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* renamed from: android.support.v4.app.CoreComponentFactory */
public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: android.support.v4.app.CoreComponentFactory$a */
    public interface C0579a {
        /* renamed from: a */
        Object mo1809a();
    }

    /* renamed from: a */
    private static <T> T m1579a(T t) {
        if (t instanceof C0579a) {
            T a = ((C0579a) t).mo1809a();
            if (a != null) {
                return a;
            }
        }
        return t;
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) m1579a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) m1579a(super.instantiateProvider(classLoader, str));
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) m1579a(super.instantiateActivity(classLoader, str, intent));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) m1579a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) m1579a(super.instantiateService(classLoader, str, intent));
    }
}
