package com.bytedance.apm.agent.tracing;

import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p497o.C9149b;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AutoLaunchTraceHelper {
    private static long sAttachBaseContextEndTime = 0;
    private static long sAttachBaseContextStartTime = 0;
    private static long sConstructorEndTime = 0;
    private static long sConstructorStartTime = 0;
    private static boolean sIsValid = false;
    private static long sLauncherActivityCreateEndTime = 0;
    private static long sLauncherActivityCreateStartTime = 0;
    public static String sLauncherActivityName = null;
    private static long sLauncherActivityOnWindowFocusChangedTime = 0;
    private static long sLauncherActivityResumeEndTime = 0;
    private static long sLauncherActivityResumeStartTime = 0;
    private static long sMaxValidTimeMs = 15000;
    private static long sOnCreateEndTime;
    private static long sOnCreateStartTime;

    public static void launcherActivityOnCreateEnd() {
        if (sLauncherActivityCreateEndTime == 0 && sIsValid) {
            sLauncherActivityCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnResumeEnd() {
        if (sLauncherActivityResumeEndTime == 0 && sIsValid) {
            sLauncherActivityResumeEndTime = System.currentTimeMillis();
        }
    }

    public static void reportStats() {
        try {
            if (C8976c.m17750f() != -1) {
                long j = sLauncherActivityOnWindowFocusChangedTime - sConstructorStartTime;
                if (j > 0) {
                    if (j <= sMaxValidTimeMs) {
                        JSONArray assemblySpan = assemblySpan();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(LeakCanaryFileProvider.f132049i, "launch_stats");
                        jSONObject.put("start", sConstructorStartTime);
                        jSONObject.put("end", sLauncherActivityOnWindowFocusChangedTime);
                        jSONObject.put("spans", assemblySpan);
                        jSONObject.put("launch_mode", C8976c.m17750f());
                        jSONObject.put("collect_from", 1);
                        jSONObject.put("page_name", sLauncherActivityName);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("trace", jSONObject);
                        C8936b.m17660b("start_trace", null, null, jSONObject2);
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static JSONArray assemblySpan() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_name", "base");
        jSONObject.put("span_name", "app_constructor");
        jSONObject.put("start", sConstructorStartTime);
        jSONObject.put("end", sConstructorEndTime);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("module_name", "base");
        jSONObject2.put("span_name", "app_attachBaseContext");
        jSONObject2.put("start", sAttachBaseContextStartTime);
        jSONObject2.put("end", sAttachBaseContextEndTime);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("module_name", "base");
        jSONObject3.put("span_name", "app_onCreate");
        jSONObject3.put("start", sOnCreateStartTime);
        jSONObject3.put("end", sOnCreateEndTime);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("module_name", "base");
        jSONObject4.put("span_name", "activity_onCreate");
        jSONObject4.put("start", sLauncherActivityCreateStartTime);
        jSONObject4.put("end", sLauncherActivityCreateStartTime);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("module_name", "base");
        jSONObject5.put("span_name", "activity_onResume");
        jSONObject5.put("start", sLauncherActivityResumeStartTime);
        jSONObject5.put("end", sLauncherActivityResumeEndTime);
        if (sLauncherActivityOnWindowFocusChangedTime > 0) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("module_name", "base");
            jSONObject6.put("span_name", "activity_onWindowFocusChanged");
            jSONObject6.put("start", sLauncherActivityOnWindowFocusChangedTime);
            jSONArray.put(jSONObject6);
        }
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONArray.put(jSONObject3);
        jSONArray.put(jSONObject4);
        jSONArray.put(jSONObject5);
        return jSONArray;
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void launcherActivityOnCreateStart(String str) {
        if (sLauncherActivityCreateStartTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            sLauncherActivityCreateStartTime = currentTimeMillis;
            if (currentTimeMillis - sOnCreateEndTime < 800) {
                sIsValid = true;
                sLauncherActivityName = str;
            }
        }
    }

    public static void launcherActivityOnResumeStart(String str) {
        if (sLauncherActivityResumeStartTime == 0 && sIsValid) {
            sLauncherActivityResumeStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnWindowFocusChangedStart(String str) {
        if (sLauncherActivityOnWindowFocusChangedTime == 0 && sOnCreateStartTime > 0 && sIsValid) {
            sLauncherActivityOnWindowFocusChangedTime = System.currentTimeMillis();
            sIsValid = false;
        }
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                AutoLaunchTraceHelper.reportStats();
            }
        });
    }

    public static void assignAppTime(long j, long j2, long j3, long j4, long j5, long j6) {
        sConstructorStartTime = j;
        sConstructorEndTime = j2;
        sAttachBaseContextStartTime = j3;
        sAttachBaseContextEndTime = j4;
        sOnCreateStartTime = j5;
        sOnCreateEndTime = j6;
        C8976c.m17746b(j);
    }
}
