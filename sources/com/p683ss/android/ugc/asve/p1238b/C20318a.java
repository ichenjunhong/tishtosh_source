package com.p683ss.android.ugc.asve.p1238b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.a */
public enum C20318a {
    AS_HW_CHECK_LEVEL_LEGACY,
    AS_HW_CHECK_LEVEL_LIMITED,
    AS_HW_CHECK_LEVEL_FULL,
    AS_HW_CHECK_LEVEL_3;
    
    public static final C20319a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.b.a$a */
    public static final class C20319a {
        private C20319a() {
        }

        public /* synthetic */ C20319a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C20318a m50100a(int i) {
            switch (i) {
                case 0:
                    return C20318a.AS_HW_CHECK_LEVEL_LEGACY;
                case 1:
                    return C20318a.AS_HW_CHECK_LEVEL_LIMITED;
                case 2:
                    return C20318a.AS_HW_CHECK_LEVEL_FULL;
                case 3:
                    return C20318a.AS_HW_CHECK_LEVEL_3;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    static {
        Companion = new C20319a(null);
    }

    public static final C20318a fromOrdinal(int i) {
        return C20319a.m50100a(i);
    }

    public static final int toIntValue(C20318a aVar) {
        C52711k.m112240b(aVar, "asCameraHardwareSupportLevel");
        switch (C20320b.f55817a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                throw new IllegalArgumentException();
        }
    }
}
