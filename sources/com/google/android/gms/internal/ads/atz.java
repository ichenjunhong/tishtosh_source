package com.google.android.gms.internal.ads;

public enum atz implements ayc {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    private static final ayd<atz> f41349a = null;

    /* renamed from: b */
    private final int f41351b;

    public final int zzac() {
        if (this != UNRECOGNIZED) {
            return this.f41351b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static atz zzev(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            case 4:
                return CRUNCHY;
            default:
                return null;
        }
    }

    private atz(int i) {
        this.f41351b = i;
    }

    static {
        f41349a = new aub();
    }
}
