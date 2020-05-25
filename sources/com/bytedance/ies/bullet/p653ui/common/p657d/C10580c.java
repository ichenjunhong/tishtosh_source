package com.bytedance.ies.bullet.p653ui.common.p657d;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.c */
public enum C10580c {
    REPORT(1),
    SHARE(2);
    
    public static final C10581a Companion = null;

    /* renamed from: b */
    private final int f28123b;

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.c$a */
    public static final class C10581a {
        private C10581a() {
        }

        public /* synthetic */ C10581a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C10580c m21363a(int i) {
            C10580c[] values;
            for (C10580c cVar : C10580c.values()) {
                if (i == cVar.getVALUE()) {
                    return cVar;
                }
            }
            return null;
        }
    }

    public final int getVALUE() {
        return this.f28123b;
    }

    static {
        Companion = new C10581a(null);
    }

    private C10580c(int i) {
        this.f28123b = i;
    }
}
