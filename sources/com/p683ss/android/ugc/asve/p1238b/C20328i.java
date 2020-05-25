package com.p683ss.android.ugc.asve.p1238b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.i */
public enum C20328i {
    AS_SERVER_LOCATION_CHINA(0),
    AS_SERVER_LOCATION_OVERSEA(1),
    AS_SERVER_LOCATION_US(2),
    AS_SERVER_LOCATION_SEA(3);
    
    public static final C20329a Companion = null;

    /* renamed from: b */
    private final int f55823b;

    /* renamed from: com.ss.android.ugc.asve.b.i$a */
    public static final class C20329a {
        private C20329a() {
        }

        public /* synthetic */ C20329a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C20328i m50104a(int i) {
            switch (i) {
                case 0:
                    return C20328i.AS_SERVER_LOCATION_CHINA;
                case 1:
                    return C20328i.AS_SERVER_LOCATION_OVERSEA;
                case 2:
                    return C20328i.AS_SERVER_LOCATION_US;
                case 3:
                    return C20328i.AS_SERVER_LOCATION_SEA;
                default:
                    return C20328i.AS_SERVER_LOCATION_CHINA;
            }
        }
    }

    public static final C20328i fromOrdinal(int i) {
        return C20329a.m50104a(i);
    }

    public final int getValue() {
        return this.f55823b;
    }

    static {
        Companion = new C20329a(null);
    }

    public static final int toIntValue(C20328i iVar) {
        C52711k.m112240b(iVar, "aSMonitorServerLocation");
        switch (C20330j.f55824a[iVar.ordinal()]) {
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

    private C20328i(int i) {
        this.f55823b = i;
    }
}
