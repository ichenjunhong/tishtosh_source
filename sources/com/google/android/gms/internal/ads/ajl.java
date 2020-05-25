package com.google.android.gms.internal.ads;

public enum ajl implements ayc {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    

    /* renamed from: c */
    private static final ayd<ajl> f40693c = null;

    /* renamed from: d */
    private final int f40695d;

    public final int zzac() {
        return this.f40695d;
    }

    public static ajl zzd(int i) {
        switch (i) {
            case 0:
                return ENUM_SIGNAL_SOURCE_UNKNOWN;
            case 1:
                return ENUM_SIGNAL_SOURCE_DISABLE;
            case 2:
                return ENUM_SIGNAL_SOURCE_ADSHIELD;
            case 3:
                return ENUM_SIGNAL_SOURCE_GASS;
            case 4:
                return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
            default:
                return null;
        }
    }

    public static aye zzad() {
        return alo.f40860a;
    }

    private ajl(int i) {
        this.f40695d = i;
    }

    static {
        f40693c = new akn();
    }
}
