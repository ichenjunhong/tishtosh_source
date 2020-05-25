package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kj */
public enum C16832kj {
    DOUBLE(C16837ko.DOUBLE, 1),
    FLOAT(C16837ko.FLOAT, 5),
    INT64(C16837ko.LONG, 0),
    UINT64(C16837ko.LONG, 0),
    INT32(C16837ko.INT, 0),
    FIXED64(C16837ko.LONG, 1),
    FIXED32(C16837ko.INT, 5),
    BOOL(C16837ko.BOOLEAN, 0),
    STRING(C16837ko.STRING, 2),
    GROUP(C16837ko.zzcek, 3),
    zzcdr(C16837ko.zzcek, 2),
    BYTES(C16837ko.BYTE_STRING, 2),
    UINT32(C16837ko.INT, 0),
    ENUM(C16837ko.ENUM, 0),
    SFIXED32(C16837ko.INT, 5),
    SFIXED64(C16837ko.LONG, 1),
    SINT32(C16837ko.INT, 0),
    SINT64(C16837ko.LONG, 0);
    

    /* renamed from: a */
    private final C16837ko f47259a;

    /* renamed from: b */
    private final int f47260b;

    private C16832kj(C16837ko koVar, int i) {
        this.f47259a = koVar;
        this.f47260b = i;
    }

    public final C16837ko zzyv() {
        return this.f47259a;
    }

    public final int zzyw() {
        return this.f47260b;
    }
}
