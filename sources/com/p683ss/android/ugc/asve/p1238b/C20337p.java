package com.p683ss.android.ugc.asve.p1238b;

import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.b.p */
public enum C20337p {
    AS_ENCODE_PROFILE_UNKNOWN,
    AS_ENCODE_PROFILE_BASELINE,
    AS_ENCODE_PROFILE_MAIN,
    AS_ENCODE_PROFILE_HIGH;
    
    public static final C20338a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.b.p$a */
    public static final class C20338a {
        private C20338a() {
        }

        public /* synthetic */ C20338a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C20337p m50107a(int i) {
            switch (i) {
                case 0:
                    return C20337p.AS_ENCODE_PROFILE_UNKNOWN;
                case 1:
                    return C20337p.AS_ENCODE_PROFILE_BASELINE;
                case 2:
                    return C20337p.AS_ENCODE_PROFILE_MAIN;
                case 3:
                    return C20337p.AS_ENCODE_PROFILE_HIGH;
                default:
                    return C20337p.AS_ENCODE_PROFILE_UNKNOWN;
            }
        }
    }

    static {
        Companion = new C20338a(null);
    }

    public static final C20337p fromOrdinal(int i) {
        return C20338a.m50107a(i);
    }

    public static final int toIntValue(C20337p pVar) {
        C52711k.m112240b(pVar, "asEncodeProfile");
        switch (C20339q.f55831a[pVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                throw new C52775l();
        }
    }
}
