package com.google.android.gms.internal.ads;

public enum ath implements ayc {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    private static final ayd<ath> f41338a = null;

    /* renamed from: b */
    private final int f41340b;

    public final int zzac() {
        if (this != UNRECOGNIZED) {
            return this.f41340b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static ath zzek(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return null;
        }
    }

    private ath(int i) {
        this.f41340b = i;
    }

    static {
        f41338a = new ati();
    }
}
