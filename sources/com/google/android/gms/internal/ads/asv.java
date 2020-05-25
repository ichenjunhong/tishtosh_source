package com.google.android.gms.internal.ads;

public enum asv implements ayc {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    private static final ayd<asv> f41311a = null;

    /* renamed from: b */
    private final int f41313b;

    public final int zzac() {
        if (this != UNRECOGNIZED) {
            return this.f41313b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static asv zzeh(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
            default:
                return null;
        }
    }

    private asv(int i) {
        this.f41313b = i;
    }

    static {
        f41311a = new asw();
    }
}
