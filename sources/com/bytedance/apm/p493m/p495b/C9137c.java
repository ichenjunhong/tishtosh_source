package com.bytedance.apm.p493m.p495b;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.apm.m.b.c */
public final class C9137c {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C9132a> f25007a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static C9136b f25008b;

    /* renamed from: a */
    public static C9136b m18131a() {
        return f25008b;
    }

    /* renamed from: a */
    public static void m18132a(String str, C9132a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            f25007a.put(str, aVar);
        }
    }
}
