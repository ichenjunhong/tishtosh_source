package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

public enum axt {
    DOUBLE(0, axv.SCALAR, ayk.DOUBLE),
    FLOAT(1, axv.SCALAR, ayk.FLOAT),
    INT64(2, axv.SCALAR, ayk.LONG),
    UINT64(3, axv.SCALAR, ayk.LONG),
    INT32(4, axv.SCALAR, ayk.INT),
    FIXED64(5, axv.SCALAR, ayk.LONG),
    FIXED32(6, axv.SCALAR, ayk.INT),
    BOOL(7, axv.SCALAR, ayk.BOOLEAN),
    STRING(8, axv.SCALAR, ayk.STRING),
    MESSAGE(9, axv.SCALAR, ayk.MESSAGE),
    BYTES(10, axv.SCALAR, ayk.BYTE_STRING),
    UINT32(11, axv.SCALAR, ayk.INT),
    ENUM(12, axv.SCALAR, ayk.ENUM),
    SFIXED32(13, axv.SCALAR, ayk.INT),
    SFIXED64(14, axv.SCALAR, ayk.LONG),
    SINT32(15, axv.SCALAR, ayk.INT),
    SINT64(16, axv.SCALAR, ayk.LONG),
    GROUP(17, axv.SCALAR, ayk.MESSAGE),
    DOUBLE_LIST(18, axv.VECTOR, ayk.DOUBLE),
    FLOAT_LIST(19, axv.VECTOR, ayk.FLOAT),
    INT64_LIST(20, axv.VECTOR, ayk.LONG),
    UINT64_LIST(21, axv.VECTOR, ayk.LONG),
    INT32_LIST(22, axv.VECTOR, ayk.INT),
    FIXED64_LIST(23, axv.VECTOR, ayk.LONG),
    FIXED32_LIST(24, axv.VECTOR, ayk.INT),
    BOOL_LIST(25, axv.VECTOR, ayk.BOOLEAN),
    STRING_LIST(26, axv.VECTOR, ayk.STRING),
    MESSAGE_LIST(27, axv.VECTOR, ayk.MESSAGE),
    BYTES_LIST(28, axv.VECTOR, ayk.BYTE_STRING),
    UINT32_LIST(29, axv.VECTOR, ayk.INT),
    ENUM_LIST(30, axv.VECTOR, ayk.ENUM),
    SFIXED32_LIST(31, axv.VECTOR, ayk.INT),
    SFIXED64_LIST(32, axv.VECTOR, ayk.LONG),
    SINT32_LIST(33, axv.VECTOR, ayk.INT),
    SINT64_LIST(34, axv.VECTOR, ayk.LONG),
    DOUBLE_LIST_PACKED(35, axv.PACKED_VECTOR, ayk.DOUBLE),
    FLOAT_LIST_PACKED(36, axv.PACKED_VECTOR, ayk.FLOAT),
    INT64_LIST_PACKED(37, axv.PACKED_VECTOR, ayk.LONG),
    UINT64_LIST_PACKED(38, axv.PACKED_VECTOR, ayk.LONG),
    INT32_LIST_PACKED(39, axv.PACKED_VECTOR, ayk.INT),
    FIXED64_LIST_PACKED(40, axv.PACKED_VECTOR, ayk.LONG),
    FIXED32_LIST_PACKED(41, axv.PACKED_VECTOR, ayk.INT),
    BOOL_LIST_PACKED(42, axv.PACKED_VECTOR, ayk.BOOLEAN),
    UINT32_LIST_PACKED(43, axv.PACKED_VECTOR, ayk.INT),
    ENUM_LIST_PACKED(44, axv.PACKED_VECTOR, ayk.ENUM),
    SFIXED32_LIST_PACKED(45, axv.PACKED_VECTOR, ayk.INT),
    SFIXED64_LIST_PACKED(46, axv.PACKED_VECTOR, ayk.LONG),
    SINT32_LIST_PACKED(47, axv.PACKED_VECTOR, ayk.INT),
    SINT64_LIST_PACKED(48, axv.PACKED_VECTOR, ayk.LONG),
    GROUP_LIST(49, axv.VECTOR, ayk.MESSAGE),
    MAP(50, axv.MAP, ayk.VOID);
    

    /* renamed from: ac */
    private static final axt[] f41558ac = null;

    /* renamed from: ad */
    private static final Type[] f41559ad = null;

    /* renamed from: X */
    private final ayk f41586X;

    /* renamed from: Y */
    private final int f41587Y;

    /* renamed from: Z */
    private final axv f41588Z;

    /* renamed from: aa */
    private final Class<?> f41589aa;

    /* renamed from: ab */
    private final boolean f41590ab;

    private axt(int i, axv axv, ayk ayk) {
        this.f41587Y = i;
        this.f41588Z = axv;
        this.f41586X = ayk;
        switch (axu.f41591a[axv.ordinal()]) {
            case 1:
                this.f41589aa = ayk.zzauc();
                break;
            case 2:
                this.f41589aa = ayk.zzauc();
                break;
            default:
                this.f41589aa = null;
                break;
        }
        boolean z = false;
        if (axv == axv.SCALAR) {
            switch (axu.f41592b[ayk.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.f41590ab = z;
    }

    /* renamed from: id */
    public final int mo29812id() {
        return this.f41587Y;
    }

    static {
        int i;
        f41559ad = new Type[0];
        axt[] values = values();
        f41558ac = new axt[values.length];
        for (axt axt : values) {
            f41558ac[axt.f41587Y] = axt;
        }
    }
}
