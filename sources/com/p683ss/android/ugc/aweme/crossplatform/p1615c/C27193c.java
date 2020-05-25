package com.p683ss.android.ugc.aweme.crossplatform.p1615c;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.c */
public enum C27193c {
    NONE(0),
    DYNAMIC(1),
    FROCE_DYNAMIC(2);
    
    public static final C27194a Companion = null;

    /* renamed from: b */
    private final int f71773b;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.c$a */
    public static final class C27194a {
        private C27194a() {
        }

        public /* synthetic */ C27194a(C52707g gVar) {
            this();
        }
    }

    public final int getValue() {
        return this.f71773b;
    }

    static {
        Companion = new C27194a(null);
    }

    public static final C27193c parse(int i) {
        switch (i) {
            case 1:
                return DYNAMIC;
            case 2:
                return FROCE_DYNAMIC;
            default:
                return NONE;
        }
    }

    private C27193c(int i) {
        this.f71773b = i;
    }
}
