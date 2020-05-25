package com.p683ss.android.ttve.editorInfo;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ttve.editorInfo.a */
public class C20084a {

    /* renamed from: a */
    public static ConcurrentHashMap<String, Object> f55215a = null;

    /* renamed from: b */
    private static final String f55216b = "a";

    /* renamed from: a */
    public static Map<String, Object> m49601a() {
        if (f55215a == null) {
            return null;
        }
        f55215a.put("te_os", Integer.valueOf(1));
        f55215a.put("te_system", Integer.valueOf(VERSION.SDK_INT));
        f55215a.put("te_user_device", Build.MODEL);
        f55215a.put("te_ve_version", "6.7.0.110");
        f55215a.put("te_effect_version", "6.7.0_rel_13_MT_202005061117_907c653ac2");
        return f55215a;
    }
}
