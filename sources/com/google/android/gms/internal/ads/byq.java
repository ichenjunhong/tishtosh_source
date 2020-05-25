package com.google.android.gms.internal.ads;

public enum byq implements ayc {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: d */
    private static final ayd<byq> f44629d = null;

    /* renamed from: e */
    private final int f44631e;

    public final int zzac() {
        return this.f44631e;
    }

    public static byq zzcc(int i) {
        if (i == 1000) {
            return ENUM_UNKNOWN;
        }
        switch (i) {
            case 0:
                return ENUM_FALSE;
            case 1:
                return ENUM_TRUE;
            default:
                return null;
        }
    }

    public static aye zzad() {
        return bys.f44632a;
    }

    private byq(int i) {
        this.f44631e = i;
    }

    static {
        f44629d = new byr();
    }
}
