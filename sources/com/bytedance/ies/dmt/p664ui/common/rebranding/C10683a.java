package com.bytedance.ies.dmt.p664ui.common.rebranding;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a */
public final class C10683a {

    /* renamed from: a */
    private static final HashMap<Class, C10684a> f28440a = new HashMap<>();

    /* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a$a */
    public static class C10684a {

        /* renamed from: a */
        public boolean f28441a = true;

        /* renamed from: b */
        public int f28442b = -1;

        public C10684a(int i) {
            this.f28442b = i;
        }
    }

    /* renamed from: a */
    public static void m21510a() {
        synchronized (f28440a) {
            for (Entry value : f28440a.entrySet()) {
                C10684a aVar = (C10684a) value.getValue();
                if (aVar != null) {
                    aVar.f28441a = false;
                    aVar.f28442b = -1;
                }
            }
        }
    }

    /* renamed from: a */
    public static C10684a m21509a(Class cls) {
        C10684a aVar;
        synchronized (f28440a) {
            aVar = (C10684a) f28440a.get(cls);
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m21511a(Class cls, C10684a aVar) {
        synchronized (f28440a) {
            f28440a.put(cls, aVar);
        }
    }
}
