package com.bytedance.ies.bullet.p628b.p633e;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.o */
public final class C10296o {

    /* renamed from: a */
    public static final C10296o f27678a = new C10296o();

    /* renamed from: b */
    private static final Map<String, String> f27679b;

    private C10296o() {
    }

    static {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("com.bytedance.ies.bullet.kit.rn.IRnKitApi", "com.bytedance.ies.bullet.kit.rn.RnKitApi");
        f27679b = linkedHashMap;
    }

    /* renamed from: a */
    public static C10284d<C10294m, C10286e, C10290i, C10288g> m20822a(String str) {
        C52711k.m112240b(str, "clazz");
        try {
            String str2 = (String) f27679b.get(str);
            if (str2 == null) {
                str2 = "";
            }
            Object newInstance = Class.forName(str2).newInstance();
            if (newInstance != null) {
                return (C10284d) newInstance;
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
        } catch (Exception unused) {
            return null;
        }
    }
}
