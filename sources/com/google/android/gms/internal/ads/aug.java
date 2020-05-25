package com.google.android.gms.internal.ads;

public enum aug implements ayc {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: b */
    private static final ayd<aug> f41357b = null;

    /* renamed from: c */
    private final int f41359c;

    public final int zzac() {
        return this.f41359c;
    }

    public static aug zzi(int i) {
        if (i == 1000) {
            return ENUM_UNKNOWN;
        }
        switch (i) {
            case 0:
                return ENUM_FALSE;
            case 1:
                return ENUM_TRUE;
            case 2:
                return ENUM_FAILURE;
            default:
                return null;
        }
    }

    public static aye zzad() {
        return aux.f41398a;
    }

    private aug(int i) {
        this.f41359c = i;
    }

    static {
        f41357b = new auk();
    }
}
