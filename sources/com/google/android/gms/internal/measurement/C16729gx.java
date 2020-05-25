package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.measurement.gx */
public enum C16729gx {
    DOUBLE(0, C16731gz.SCALAR, C16750hm.DOUBLE),
    FLOAT(1, C16731gz.SCALAR, C16750hm.FLOAT),
    INT64(2, C16731gz.SCALAR, C16750hm.LONG),
    UINT64(3, C16731gz.SCALAR, C16750hm.LONG),
    INT32(4, C16731gz.SCALAR, C16750hm.INT),
    FIXED64(5, C16731gz.SCALAR, C16750hm.LONG),
    FIXED32(6, C16731gz.SCALAR, C16750hm.INT),
    BOOL(7, C16731gz.SCALAR, C16750hm.BOOLEAN),
    STRING(8, C16731gz.SCALAR, C16750hm.STRING),
    f47043j(9, C16731gz.SCALAR, C16750hm.zzbzn),
    BYTES(10, C16731gz.SCALAR, C16750hm.BYTE_STRING),
    UINT32(11, C16731gz.SCALAR, C16750hm.INT),
    ENUM(12, C16731gz.SCALAR, C16750hm.ENUM),
    SFIXED32(13, C16731gz.SCALAR, C16750hm.INT),
    SFIXED64(14, C16731gz.SCALAR, C16750hm.LONG),
    SINT32(15, C16731gz.SCALAR, C16750hm.INT),
    SINT64(16, C16731gz.SCALAR, C16750hm.LONG),
    GROUP(17, C16731gz.SCALAR, C16750hm.zzbzn),
    DOUBLE_LIST(18, C16731gz.VECTOR, C16750hm.DOUBLE),
    FLOAT_LIST(19, C16731gz.VECTOR, C16750hm.FLOAT),
    INT64_LIST(20, C16731gz.VECTOR, C16750hm.LONG),
    UINT64_LIST(21, C16731gz.VECTOR, C16750hm.LONG),
    INT32_LIST(22, C16731gz.VECTOR, C16750hm.INT),
    FIXED64_LIST(23, C16731gz.VECTOR, C16750hm.LONG),
    FIXED32_LIST(24, C16731gz.VECTOR, C16750hm.INT),
    BOOL_LIST(25, C16731gz.VECTOR, C16750hm.BOOLEAN),
    STRING_LIST(26, C16731gz.VECTOR, C16750hm.STRING),
    MESSAGE_LIST(27, C16731gz.VECTOR, C16750hm.zzbzn),
    BYTES_LIST(28, C16731gz.VECTOR, C16750hm.BYTE_STRING),
    UINT32_LIST(29, C16731gz.VECTOR, C16750hm.INT),
    ENUM_LIST(30, C16731gz.VECTOR, C16750hm.ENUM),
    SFIXED32_LIST(31, C16731gz.VECTOR, C16750hm.INT),
    SFIXED64_LIST(32, C16731gz.VECTOR, C16750hm.LONG),
    SINT32_LIST(33, C16731gz.VECTOR, C16750hm.INT),
    SINT64_LIST(34, C16731gz.VECTOR, C16750hm.LONG),
    DOUBLE_LIST_PACKED(35, C16731gz.PACKED_VECTOR, C16750hm.DOUBLE),
    FLOAT_LIST_PACKED(36, C16731gz.PACKED_VECTOR, C16750hm.FLOAT),
    INT64_LIST_PACKED(37, C16731gz.PACKED_VECTOR, C16750hm.LONG),
    UINT64_LIST_PACKED(38, C16731gz.PACKED_VECTOR, C16750hm.LONG),
    INT32_LIST_PACKED(39, C16731gz.PACKED_VECTOR, C16750hm.INT),
    FIXED64_LIST_PACKED(40, C16731gz.PACKED_VECTOR, C16750hm.LONG),
    FIXED32_LIST_PACKED(41, C16731gz.PACKED_VECTOR, C16750hm.INT),
    BOOL_LIST_PACKED(42, C16731gz.PACKED_VECTOR, C16750hm.BOOLEAN),
    UINT32_LIST_PACKED(43, C16731gz.PACKED_VECTOR, C16750hm.INT),
    ENUM_LIST_PACKED(44, C16731gz.PACKED_VECTOR, C16750hm.ENUM),
    SFIXED32_LIST_PACKED(45, C16731gz.PACKED_VECTOR, C16750hm.INT),
    SFIXED64_LIST_PACKED(46, C16731gz.PACKED_VECTOR, C16750hm.LONG),
    SINT32_LIST_PACKED(47, C16731gz.PACKED_VECTOR, C16750hm.INT),
    SINT64_LIST_PACKED(48, C16731gz.PACKED_VECTOR, C16750hm.LONG),
    GROUP_LIST(49, C16731gz.VECTOR, C16750hm.zzbzn),
    MAP(50, C16731gz.MAP, C16750hm.VOID);
    

    /* renamed from: ac */
    private static final C16729gx[] f47032ac = null;

    /* renamed from: ad */
    private static final Type[] f47033ad = null;

    /* renamed from: X */
    private final C16750hm f47060X;

    /* renamed from: Y */
    private final int f47061Y;

    /* renamed from: Z */
    private final C16731gz f47062Z;

    /* renamed from: aa */
    private final Class<?> f47063aa;

    /* renamed from: ab */
    private final boolean f47064ab;

    private C16729gx(int i, C16731gz gzVar, C16750hm hmVar) {
        this.f47061Y = i;
        this.f47062Z = gzVar;
        this.f47060X = hmVar;
        switch (C16730gy.f47065a[gzVar.ordinal()]) {
            case 1:
                this.f47063aa = hmVar.zzwy();
                break;
            case 2:
                this.f47063aa = hmVar.zzwy();
                break;
            default:
                this.f47063aa = null;
                break;
        }
        boolean z = false;
        if (gzVar == C16731gz.SCALAR) {
            switch (C16730gy.f47066b[hmVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.f47064ab = z;
    }

    /* renamed from: id */
    public final int mo32217id() {
        return this.f47061Y;
    }

    static {
        int i;
        f47033ad = new Type[0];
        C16729gx[] values = values();
        f47032ac = new C16729gx[values.length];
        for (C16729gx gxVar : values) {
            f47032ac[gxVar.f47061Y] = gxVar;
        }
    }
}
