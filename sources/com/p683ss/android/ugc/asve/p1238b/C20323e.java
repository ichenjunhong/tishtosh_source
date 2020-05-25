package com.p683ss.android.ugc.asve.p1238b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.e */
public enum C20323e {
    AS_CAMERA_NULL,
    AS_CAMERA_1,
    AS_CAMERA_2,
    AS_CAMERA_CHRY,
    AS_CAMERA_MI,
    AS_CAMERA_OPPO,
    AS_CAMERA_CHRY_CAMKIT,
    AS_CAMERA_VIVO;
    
    public static final C20324a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.b.e$a */
    public static final class C20324a {
        private C20324a() {
        }

        public /* synthetic */ C20324a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C20323e m50102a(int i) {
            switch (i) {
                case 1:
                    return C20323e.AS_CAMERA_1;
                case 2:
                    return C20323e.AS_CAMERA_2;
                case 3:
                    return C20323e.AS_CAMERA_CHRY;
                case 4:
                    return C20323e.AS_CAMERA_MI;
                case 5:
                    return C20323e.AS_CAMERA_OPPO;
                case 6:
                    return C20323e.AS_CAMERA_CHRY_CAMKIT;
                case 7:
                    return C20323e.AS_CAMERA_VIVO;
                default:
                    return C20323e.AS_CAMERA_NULL;
            }
        }
    }

    static {
        Companion = new C20324a(null);
    }

    public static final C20323e fromOrdinal(int i) {
        return C20324a.m50102a(i);
    }

    public static final int toIntValue(C20323e eVar) {
        C52711k.m112240b(eVar, "asCameraType");
        switch (C20325f.f55820a[eVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                throw new IllegalArgumentException();
        }
    }
}
