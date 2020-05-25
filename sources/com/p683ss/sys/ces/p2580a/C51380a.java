package com.p683ss.sys.ces.p2580a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.ss.sys.ces.a.a */
public final class C51380a {
    /* renamed from: a */
    public static Activity m110498a() {
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = VERSION.SDK_INT < 19 ? (HashMap) declaredField.get(invoke) : (ArrayMap) declaredField.get(invoke);
            if (map.size() <= 0) {
                return null;
            }
            for (Object next : map.values()) {
                Class cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(next);
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m110499a(Context context) {
        String str;
        try {
            str = context.getPackageName();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: b */
    public static int m110500b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static Application m110501b() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m110502c() {
        String str;
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: c */
    public static String m110503c(Context context) {
        String str;
        try {
            str = context.getFilesDir().getAbsolutePath();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: d */
    public static String m110504d() {
        String str;
        try {
            str = Environment.getDataDirectory().getPath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: d */
    public static String m110505d(Context context) {
        String str;
        String str2 = "";
        try {
            str = context.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
            str = str2;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: e */
    public static synchronized String m110506e(Context context) {
        String jSONArray;
        synchronized (C51380a.class) {
            jSONArray = new JSONArray().toString();
        }
        return jSONArray;
    }
}
