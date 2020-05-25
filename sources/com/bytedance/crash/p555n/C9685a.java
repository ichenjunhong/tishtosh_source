package com.bytedance.crash.p555n;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p551k.p552a.C9619b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.n.a */
public final class C9685a {

    /* renamed from: a */
    private static String f26411a;

    /* renamed from: b */
    private static Class<?> f26412b;

    /* renamed from: c */
    private static Field f26413c;

    /* renamed from: d */
    private static Field f26414d;

    /* renamed from: e */
    private static boolean f26415e;

    /* renamed from: a */
    private static long m19310a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * 1024;
    }

    /* renamed from: a */
    private static String m19311a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return readLine;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static String m19319d(Context context) {
        Class g = m19322g(context);
        if (f26413c == null && g != null) {
            try {
                f26413c = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f26413c != null) {
            try {
                return String.valueOf(f26413c.get(null));
            } catch (Throwable unused2) {
            }
        }
        return "";
    }

    /* renamed from: e */
    public static int m19320e(Context context) {
        Class g = m19322g(context);
        if (f26414d == null && g != null) {
            try {
                f26414d = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f26414d != null) {
            try {
                return ((Integer) f26414d.get(null)).intValue();
            } catch (Throwable unused2) {
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static Class<?> m19322g(Context context) {
        if (f26412b == null && !f26415e) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getPackageName());
                sb.append(".BuildConfig");
                f26412b = Class.forName(sb.toString());
            } catch (ClassNotFoundException unused) {
            }
            f26415e = true;
        }
        return f26412b;
    }

    /* renamed from: a */
    public static boolean m19315a(Context context) {
        if (context == null) {
            return C9619b.m19170a().f26260p;
        }
        if (C9619b.m19170a().f26260p || m19321f(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m19317b(Context context) {
        String c = m19318c(context);
        if (c != null && c.contains(":")) {
            return false;
        }
        if (c != null && c.equals(context.getPackageName())) {
            return true;
        }
        if (c == null || !c.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m19318c(Context context) {
        if (!TextUtils.isEmpty(f26411a)) {
            return f26411a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        f26411a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a = m19311a();
        f26411a = a;
        if (a == null) {
            return "";
        }
        return f26411a;
    }

    /* renamed from: f */
    private static boolean m19321f(Context context) {
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return false;
            }
            if (VERSION.SDK_INT < 21) {
                List runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && !runningTasks.isEmpty()) {
                    ComponentName componentName = ((RunningTaskInfo) runningTasks.get(0)).topActivity;
                    if (componentName == null || !packageName.equals(componentName.getPackageName())) {
                        return false;
                    }
                    return true;
                }
            } else {
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.importance == 100) {
                            return packageName.equals(runningAppProcessInfo.pkgList[0]);
                        }
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m19313a(JSONObject jSONObject) throws JSONException {
        MemoryInfo memoryInfo = new MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m19310a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m19310a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m19310a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m19310a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m19310a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m19310a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m19310a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m19310a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m19310a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", C9687c.m19323a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m19310a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", C9687c.m19324b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m19310a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m19310a(C9687c.m19325c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static void m19312a(Context context, JSONObject jSONObject) {
        try {
            m19313a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m19316b(jSONObject, activityManager);
            }
            m19314a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m19316b(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", C9701l.m19387a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* renamed from: a */
    private static void m19314a(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        boolean z;
        JSONObject jSONObject2 = new JSONObject();
        String str = "filters";
        String str2 = "native_heap_leak";
        boolean z2 = false;
        if (Debug.getNativeHeapAllocatedSize() > 209715200) {
            z = true;
        } else {
            z = false;
        }
        C9584a.m19013a(jSONObject, str, str2, String.valueOf(z));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        String str3 = "filters";
        String str4 = "java_heap_leak";
        if (((float) (j - freeMemory)) > ((float) maxMemory) * 0.95f) {
            z2 = true;
        }
        C9584a.m19013a(jSONObject, str3, str4, String.valueOf(z2));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }
}
