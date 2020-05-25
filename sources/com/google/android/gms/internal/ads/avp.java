package com.google.android.gms.internal.ads;

public enum avp implements ayc {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    

    /* renamed from: e */
    private static final ayd<avp> f41441e = null;

    /* renamed from: f */
    private final int f41443f;

    public final int zzac() {
        return this.f41443f;
    }

    public static avp zzj(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PROTO;
            case 1:
                return AFMA_SIGNALS;
            case 2:
                return UNITY_SIGNALS;
            case 3:
                return PARTNER_SIGNALS;
            default:
                return null;
        }
    }

    public static aye zzad() {
        return axk.f41518a;
    }

    private avp(int i) {
        this.f41443f = i;
    }

    static {
        f41441e = new awj();
    }
}
