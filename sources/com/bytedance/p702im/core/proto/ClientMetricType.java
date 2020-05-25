package com.bytedance.p702im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ClientMetricType */
public enum ClientMetricType implements WireEnum {
    COUNTER(0),
    TIMER(1);
    
    public static final ProtoAdapter<ClientMetricType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.ClientMetricType$ProtoAdapter_ClientMetricType */
    static final class ProtoAdapter_ClientMetricType extends EnumAdapter<ClientMetricType> {
        ProtoAdapter_ClientMetricType() {
            super(ClientMetricType.class);
        }

        /* access modifiers changed from: protected */
        public final ClientMetricType fromValue(int i) {
            return ClientMetricType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ClientMetricType();
    }

    public static ClientMetricType fromValue(int i) {
        switch (i) {
            case 0:
                return COUNTER;
            case 1:
                return TIMER;
            default:
                return null;
        }
    }

    private ClientMetricType(int i) {
        this.value = i;
    }
}
