package com.google.android.gms.internal.ads;

public enum asr implements ayc {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: b */
    private static final ayd<asr> f41307b = null;

    /* renamed from: c */
    private final int f41309c;

    public final int zzac() {
        if (this != UNRECOGNIZED) {
            return this.f41309c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static asr zzeg(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        switch (i) {
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    private asr(int i) {
        this.f41309c = i;
    }

    static {
        f41307b = new ass();
    }
}
