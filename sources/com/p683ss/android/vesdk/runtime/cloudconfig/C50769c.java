package com.p683ss.android.vesdk.runtime.cloudconfig;

import android.content.Context;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.vesdk.runtime.VERuntime;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.vesdk.runtime.cloudconfig.c */
public final class C50769c {

    /* renamed from: a */
    public static final C50770d f127522a = new C50770d();

    /* renamed from: b */
    public static int f127523b = 0;

    /* renamed from: c */
    private static C50768b f127524c = new C50767a();

    /* renamed from: a */
    public static void m109875a() {
        if (VERuntime.m109853a().f127473a != null) {
            m109876a(m109874a(VERuntime.m109853a().f127473a));
            return;
        }
        throw new IllegalStateException("Must call VideoSdkCore.init() before.");
    }

    /* renamed from: a */
    private static void m109876a(Map<String, String> map) {
        if (f127524c != null) {
            f127524c.mo99455a(map, f127522a);
            return;
        }
        throw new IllegalStateException("CompileTimeBUG: Injector == null. VECloudConfig won't be initialized!. Consider specify an IInjector instance before compile code.");
    }

    /* renamed from: a */
    private static Map<String, String> m109874a(Context context) {
        HashMap hashMap = new HashMap();
        for (Entry entry : C35807d.m80935a(context, "ShortVideoConfig", 0).getAll().entrySet()) {
            if (((String) entry.getKey()).startsWith("PerfConfig_")) {
                hashMap.put(((String) entry.getKey()).substring(11), (String) entry.getValue());
            }
        }
        return hashMap;
    }
}
