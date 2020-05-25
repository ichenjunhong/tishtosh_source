package com.bytedance.p502b.p503a.p504a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.b.a.a.b */
final class C9213b {

    /* renamed from: a */
    static Map<Class<?>, C9216e> f25185a = new HashMap();

    /* renamed from: a */
    static boolean m18302a(String str) {
        if (str.startsWith("java.") || str.startsWith("javax.") || str.startsWith("android.")) {
            return true;
        }
        return false;
    }
}
