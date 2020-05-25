package com.p683ss.caijing.globaliap.p2563f;

import com.p683ss.caijing.globaliap.C51222b;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.f.c */
public final class C51284c {

    /* renamed from: a */
    public static C51222b f128051a;

    /* renamed from: a */
    public static void m110260a(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(":");
            sb.append((String) map.get(str2));
        }
        if (f128051a != null) {
            f128051a.mo10221a(str, map);
        }
    }
}
