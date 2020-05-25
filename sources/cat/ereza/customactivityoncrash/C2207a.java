package cat.ereza.customactivityoncrash;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;

/* renamed from: cat.ereza.customactivityoncrash.a */
public final class C2207a {

    /* renamed from: a */
    public static Application f7033a;

    /* renamed from: b */
    public static WeakReference<Activity> f7034b = new WeakReference<>(null);

    /* renamed from: c */
    public static boolean f7035c = false;

    /* renamed from: d */
    public static boolean f7036d = true;

    /* renamed from: e */
    public static boolean f7037e = true;

    /* renamed from: f */
    public static boolean f7038f = true;

    /* renamed from: g */
    public static int f7039g = 2131952803;

    /* renamed from: h */
    public static Class<? extends Activity> f7040h = null;

    /* renamed from: i */
    public static Class<? extends Activity> f7041i = null;

    /* renamed from: j */
    public static C2210a f7042j = null;

    /* renamed from: cat.ereza.customactivityoncrash.a$a */
    public interface C2210a extends Serializable {
        void onCloseAppFromErrorActivity();

        void onLaunchErrorActivity();

        void onRestartAppFromErrorActivity();
    }

    /* renamed from: a */
    public static void m6677a() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    /* renamed from: a */
    public static void m6681a(Class<? extends Activity> cls) {
        f7040h = cls;
    }

    /* renamed from: a */
    public static String m6675a(Intent intent) {
        return intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
    }

    /* renamed from: b */
    public static Class<? extends Activity> m6684b(Intent intent) {
        Serializable serializableExtra = intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS");
        if (serializableExtra == null || !(serializableExtra instanceof Class)) {
            return null;
        }
        return (Class) serializableExtra;
    }

    /* renamed from: c */
    static Class<? extends Activity> m6685c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            try {
                return Class.forName(launchIntentForPackage.getComponent().getClassName());
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private static String m6687e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: b */
    static Class<? extends Activity> m6683b(Context context) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            try {
                return Class.forName(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    static Class<? extends Activity> m6686d(Context context) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            try {
                return Class.forName(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m6676a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(charAt));
        sb.append(str.substring(1));
        return sb.toString();
    }

    /* renamed from: a */
    public static void m6680a(Context context) {
        if (context != null) {
            try {
                final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                    if (defaultUncaughtExceptionHandler != null) {
                        defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os");
                    }
                    f7033a = (Application) context.getApplicationContext();
                    Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                        public final void uncaughtException(Thread thread, Throwable th) {
                            boolean z;
                            long j = C35807d.m80935a(C2207a.f7033a, "custom_activity_on_crash", 0).getLong("last_crash_timestamp", -1);
                            long time = new Date().getTime();
                            if (j > time || time - j >= 2000) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                Application application = C2207a.f7033a;
                                C35807d.m80935a(application, "custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", new Date().getTime()).commit();
                                if (C2207a.f7040h == null) {
                                    Class<DefaultErrorActivity> d = C2207a.m6686d(C2207a.f7033a);
                                    if (d == null) {
                                        d = DefaultErrorActivity.class;
                                    }
                                    C2207a.f7040h = d;
                                }
                                if (C2207a.m6682a(th, C2207a.f7040h)) {
                                    if (defaultUncaughtExceptionHandler != null) {
                                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                                        return;
                                    }
                                } else if (C2207a.f7036d || !C2207a.f7035c) {
                                    Intent intent = new Intent(C2207a.f7033a, C2207a.f7040h);
                                    StringWriter stringWriter = new StringWriter();
                                    C17840a.m43751a(th, new PrintWriter(stringWriter));
                                    String stringWriter2 = stringWriter.toString();
                                    if (stringWriter2.length() > 131071) {
                                        String str = " [stack trace too large]";
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(stringWriter2.substring(0, 131071 - str.length()));
                                        sb.append(str);
                                        stringWriter2 = sb.toString();
                                    }
                                    if (C2207a.f7038f && C2207a.f7041i == null) {
                                        Application application2 = C2207a.f7033a;
                                        Class<? extends Activity> b = C2207a.m6683b((Context) application2);
                                        if (b == null) {
                                            b = C2207a.m6685c(application2);
                                        }
                                        C2207a.f7041i = b;
                                    } else if (!C2207a.f7038f) {
                                        C2207a.f7041i = null;
                                    }
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", stringWriter2);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS", C2207a.f7041i);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", C2207a.f7037e);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER", C2207a.f7042j);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", C2207a.f7039g);
                                    intent.setFlags(268468224);
                                    if (C2207a.f7042j != null) {
                                        C2207a.f7042j.onLaunchErrorActivity();
                                    }
                                    C2207a.f7033a.startActivity(intent);
                                }
                            } else if (defaultUncaughtExceptionHandler != null) {
                                defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                                return;
                            }
                            Activity activity = (Activity) C2207a.f7034b.get();
                            if (activity != null) {
                                activity.finish();
                                C2207a.f7034b.clear();
                            }
                            C2207a.m6677a();
                        }
                    });
                    if (VERSION.SDK_INT >= 14) {
                        f7033a.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {

                            /* renamed from: a */
                            int f7044a;

                            public final void onActivityDestroyed(Activity activity) {
                            }

                            public final void onActivityPaused(Activity activity) {
                            }

                            public final void onActivityResumed(Activity activity) {
                            }

                            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            public final void onActivityStarted(Activity activity) {
                                boolean z = true;
                                this.f7044a++;
                                if (this.f7044a != 0) {
                                    z = false;
                                }
                                C2207a.f7035c = z;
                            }

                            public final void onActivityStopped(Activity activity) {
                                boolean z = true;
                                this.f7044a--;
                                if (this.f7044a != 0) {
                                    z = false;
                                }
                                C2207a.f7035c = z;
                            }

                            public final void onActivityCreated(Activity activity, Bundle bundle) {
                                if (activity.getClass() != C2207a.f7040h) {
                                    C2207a.f7034b = new WeakReference<>(activity);
                                }
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static String m6674a(Context context, DateFormat dateFormat) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            TextUtils.equals(packageName, C11010c.m22280a().getPackageName());
            ZipFile zipFile = new ZipFile(packageManager.getApplicationInfo(packageName, 0).sourceDir);
            String format = dateFormat.format(new Date(zipFile.getEntry("classes.dex").getTime()));
            zipFile.close();
            return format;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: a */
    public static String m6673a(Context context, Intent intent) {
        String str;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        String a = m6674a(context, (DateFormat) simpleDateFormat);
        String e = m6687e(context);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("Build version: ");
        sb.append(e);
        sb.append(" \n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("Build date: ");
        sb3.append(a);
        sb3.append(" \n");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("Current date: ");
        sb5.append(simpleDateFormat.format(date));
        sb5.append(" \n");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb6);
        sb7.append("Device: ");
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        if (str3.startsWith(str2)) {
            str = m6676a(str3);
        } else {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(m6676a(str2));
            sb8.append(" ");
            sb8.append(str3);
            str = sb8.toString();
        }
        sb7.append(str);
        sb7.append(" \n \n");
        String sb9 = sb7.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append(sb9);
        sb10.append("Stack trace:  \n");
        String sb11 = sb10.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb11);
        sb12.append(m6675a(intent));
        return sb12.toString();
    }

    /* renamed from: a */
    public static void m6679a(Activity activity, C2210a aVar) {
        if (aVar != null) {
            aVar.onCloseAppFromErrorActivity();
        }
        activity.finish();
        m6677a();
    }

    /* renamed from: a */
    public static boolean m6682a(Throwable th, Class<? extends Activity> cls) {
        StackTraceElement[] stackTrace;
        do {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if ((stackTraceElement.getClassName().equals("android.app.ActivityThread") && stackTraceElement.getMethodName().equals("handleBindApplication")) || stackTraceElement.getClassName().equals(cls.getName())) {
                    return true;
                }
            }
            th = th.getCause();
        } while (th != null);
        return false;
    }

    /* renamed from: a */
    public static void m6678a(Activity activity, Intent intent, C2210a aVar) {
        intent.addFlags(268468224);
        if (aVar != null) {
            aVar.onRestartAppFromErrorActivity();
        }
        activity.finish();
        activity.startActivity(intent);
        m6677a();
    }
}
