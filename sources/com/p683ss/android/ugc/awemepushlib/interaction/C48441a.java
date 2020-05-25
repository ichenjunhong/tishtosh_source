package com.p683ss.android.ugc.awemepushlib.interaction;

import com.p683ss.android.ugc.awemepushapi.C48426a;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.a */
public final class C48441a {

    /* renamed from: b */
    private static C48441a f121809b;

    /* renamed from: a */
    private C48426a f121810a;

    /* renamed from: a */
    public static C48426a m104825a() {
        return m104827b().f121810a;
    }

    /* renamed from: b */
    private static C48441a m104827b() {
        if (f121809b != null) {
            return f121809b;
        }
        throw new IllegalStateException("请先调用holdService初始化");
    }

    private C48441a(C48426a aVar) {
        this.f121810a = aVar;
    }

    /* renamed from: a */
    static synchronized void m104826a(C48426a aVar) {
        synchronized (C48441a.class) {
            if (aVar == null) {
                throw new IllegalArgumentException("请使用MainInterfaceForPush实例初始化");
            } else if (f121809b == null) {
                f121809b = new C48441a(aVar);
            } else {
                f121809b.f121810a = aVar;
            }
        }
    }
}
