package com.bytedance.common.wschannel.p529c;

/* renamed from: com.bytedance.common.wschannel.c.c */
public enum C9459c {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);
    

    /* renamed from: a */
    final int f25745a;

    public final int getTypeValue() {
        return this.f25745a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionState{State=");
        sb.append(this.f25745a);
        sb.append('}');
        return sb.toString();
    }

    private C9459c(int i) {
        this.f25745a = i;
    }
}
