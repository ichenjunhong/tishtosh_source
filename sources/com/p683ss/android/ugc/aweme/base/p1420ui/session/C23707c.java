package com.p683ss.android.ugc.aweme.base.p1420ui.session;

import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.c */
public class C23707c {

    /* renamed from: b */
    private static C23707c f63226b;

    /* renamed from: a */
    HashMap<String, C23705a> f63227a = new HashMap<>();

    private C23707c() {
    }

    /* renamed from: a */
    public static C23707c m58177a() {
        if (f63226b == null) {
            synchronized (C23707c.class) {
                if (f63226b == null) {
                    f63226b = new C23707c();
                }
            }
        }
        return f63226b;
    }

    /* renamed from: a */
    public final synchronized void mo49141a(C23705a aVar) {
        this.f63227a.values().remove(aVar);
    }

    /* renamed from: b */
    public final synchronized <T> C23705a<T> mo49142b(String str, Class<T> cls) {
        return (C23705a) this.f63227a.get(str);
    }

    /* renamed from: a */
    public final synchronized <T> C23705a<T> mo49140a(String str, Class<T> cls) {
        if (!this.f63227a.containsKey(str)) {
            this.f63227a.put(str, new C23705a());
        }
        return (C23705a) this.f63227a.get(str);
    }
}
