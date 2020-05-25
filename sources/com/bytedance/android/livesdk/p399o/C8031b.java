package com.bytedance.android.livesdk.p399o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b */
public final class C8031b {

    /* renamed from: a */
    public static C8031b f21976a;

    /* renamed from: b */
    private Map<String, String> f21977b = new HashMap();

    private C8031b() {
    }

    /* renamed from: a */
    public static synchronized C8031b m15946a() {
        C8031b bVar;
        synchronized (C8031b.class) {
            if (f21976a == null) {
                f21976a = new C8031b();
            }
            bVar = f21976a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo14191a(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(str);
        this.f21977b.put(sb.toString(), str2);
    }
}
