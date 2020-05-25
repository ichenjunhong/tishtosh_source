package com.bytedance.ies.bullet.p653ui.common.p657d;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.d */
public enum C10582d {
    IMMERSIVE(1),
    GRADUAL_CHANGE(2),
    NORMAL(3);
    
    public static final C10583a Companion = null;

    /* renamed from: b */
    private final int f28125b;

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.d$a */
    public static final class C10583a {
        private C10583a() {
        }

        public /* synthetic */ C10583a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C10582d m21364a(int i) {
            C10582d[] values;
            for (C10582d dVar : C10582d.values()) {
                if (i == dVar.getVALUE()) {
                    return dVar;
                }
            }
            return null;
        }
    }

    public final int getVALUE() {
        return this.f28125b;
    }

    static {
        Companion = new C10583a(null);
    }

    private C10582d(int i) {
        this.f28125b = i;
    }
}
