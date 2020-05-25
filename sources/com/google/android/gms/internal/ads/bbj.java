package com.google.android.gms.internal.ads;

public enum bbj {
    DOUBLE(bbp.DOUBLE, 1),
    FLOAT(bbp.FLOAT, 5),
    INT64(bbp.LONG, 0),
    UINT64(bbp.LONG, 0),
    INT32(bbp.INT, 0),
    FIXED64(bbp.LONG, 1),
    FIXED32(bbp.INT, 5),
    BOOL(bbp.BOOLEAN, 0),
    STRING(bbp.STRING, 2),
    GROUP(bbp.MESSAGE, 3),
    MESSAGE(bbp.MESSAGE, 2),
    BYTES(bbp.BYTE_STRING, 2),
    UINT32(bbp.INT, 0),
    ENUM(bbp.ENUM, 0),
    SFIXED32(bbp.INT, 5),
    SFIXED64(bbp.LONG, 1),
    SINT32(bbp.INT, 0),
    SINT64(bbp.LONG, 0);
    

    /* renamed from: a */
    private final bbp f41771a;

    /* renamed from: b */
    private final int f41772b;

    private bbj(bbp bbp, int i) {
        this.f41771a = bbp;
        this.f41772b = i;
    }

    public final bbp zzawa() {
        return this.f41771a;
    }

    public final int zzawb() {
        return this.f41772b;
    }
}
