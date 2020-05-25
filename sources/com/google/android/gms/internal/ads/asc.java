package com.google.android.gms.internal.ads;

public enum asc implements ayc {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    private static final ayd<asc> f41291a = null;

    /* renamed from: b */
    private final int f41293b;

    public final int zzac() {
        if (this != UNRECOGNIZED) {
            return this.f41293b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static asc zzdy(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
            case 3:
                return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            default:
                return null;
        }
    }

    private asc(int i) {
        this.f41293b = i;
    }

    static {
        f41291a = new asd();
    }
}
