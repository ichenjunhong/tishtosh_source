package com.p683ss.android.ugc.asve.p1238b;

import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.k */
public enum C20331k {
    AS_CAMERA_LENS_BACK,
    AS_CAMERA_LENS_FRONT,
    AS_CAMERA_LENS_WIDE;
    
    public static final C20332a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.b.k$a */
    public static final class C20332a {
        private C20332a() {
        }

        public /* synthetic */ C20332a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C20331k m50105a(int i) {
            switch (i) {
                case 0:
                    return C20331k.AS_CAMERA_LENS_BACK;
                case 1:
                    return C20331k.AS_CAMERA_LENS_FRONT;
                case 2:
                    return C20331k.AS_CAMERA_LENS_WIDE;
                default:
                    return C20331k.AS_CAMERA_LENS_BACK;
            }
        }
    }

    static {
        Companion = new C20332a(null);
    }

    public static final C20331k fromOrdinal(int i) {
        return C20332a.m50105a(i);
    }

    public static final int toIntValue(C20331k kVar) {
        C52711k.m112240b(kVar, "asCameraLensFacing");
        switch (C20333l.f55826a[kVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                throw new C52775l();
        }
    }
}
