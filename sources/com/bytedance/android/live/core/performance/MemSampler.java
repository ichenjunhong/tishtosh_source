package com.bytedance.android.live.core.performance;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import com.bytedance.android.live.core.p225d.C3837e;
import org.json.JSONObject;

public class MemSampler extends BaseSampler<JSONObject> {
    public void run() {
        JSONObject jSONObject = new JSONObject();
        if (this.f11062d != null && this.f11062d.get() != null) {
            Context context = (Context) this.f11062d.get();
            int myPid = Process.myPid();
            if (context != null) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    try {
                        MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{myPid});
                        jSONObject.put("total_mem", C3973a.m10058a(context));
                        String str = "mem_class";
                        int i = -1;
                        if (context != null) {
                            ActivityManager activityManager2 = (ActivityManager) context.getSystemService("activity");
                            if (activityManager2 != null) {
                                i = activityManager2.getMemoryClass();
                            }
                        }
                        jSONObject.put(str, i);
                        jSONObject.put("uss", processMemoryInfo[0].getTotalPrivateDirty());
                        jSONObject.put("pss", processMemoryInfo[0].getTotalPss());
                        jSONObject.put("rss", processMemoryInfo[0].getTotalSharedDirty());
                        jSONObject.put("dalvikPss", processMemoryInfo[0].dalvikPss);
                        jSONObject.put("dalvikPrivateDirty", processMemoryInfo[0].dalvikPrivateDirty);
                        jSONObject.put("dalvikSharedDirty", processMemoryInfo[0].dalvikSharedDirty);
                        jSONObject.put("nativePss", processMemoryInfo[0].nativePss);
                        jSONObject.put("nativePrivateDirty", processMemoryInfo[0].nativePrivateDirty);
                        jSONObject.put("nativeSharedDirty", processMemoryInfo[0].nativeSharedDirty);
                    } catch (Throwable th) {
                        C3837e.m9748a(th, th.getMessage());
                    }
                }
            }
            mo9360a(jSONObject);
            if (this.f11061c != null) {
                this.f11061c.postDelayed(this, (long) this.f11059a);
            }
        }
    }

    public MemSampler(int i, int i2) {
        super(i, 3000);
    }
}
