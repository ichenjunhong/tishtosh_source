package com.google.android.gms.internal.ads;

public enum ase implements ayc {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3);
    

    /* renamed from: d */
    private static final ayd<ase> f41297d = null;

    /* renamed from: e */
    private final int f41299e;

    public final int zzac() {
        return this.f41299e;
    }

    public static ase zzh(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENCRYPTION_METHOD;
            case 1:
                return BITSLICER;
            case 2:
                return TINK_HYBRID;
            case 3:
                return UNENCRYPTED;
            default:
                return null;
        }
    }

    public static aye zzad() {
        return aua.f41353a;
    }

    private ase(int i) {
        this.f41299e = i;
    }

    static {
        f41297d = new asz();
    }
}
