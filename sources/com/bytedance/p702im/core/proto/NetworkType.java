package com.bytedance.p702im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.NetworkType */
public enum NetworkType implements WireEnum {
    UNKNOWN(0),
    WIFI(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    MOBILE_4G(4),
    MOBILE_5G(5);
    
    public static final ProtoAdapter<NetworkType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.NetworkType$ProtoAdapter_NetworkType */
    static final class ProtoAdapter_NetworkType extends EnumAdapter<NetworkType> {
        ProtoAdapter_NetworkType() {
            super(NetworkType.class);
        }

        /* access modifiers changed from: protected */
        public final NetworkType fromValue(int i) {
            return NetworkType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_NetworkType();
    }

    public static NetworkType fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WIFI;
            case 2:
                return MOBILE_2G;
            case 3:
                return MOBILE_3G;
            case 4:
                return MOBILE_4G;
            case 5:
                return MOBILE_5G;
            default:
                return null;
        }
    }

    private NetworkType(int i) {
        this.value = i;
    }
}
