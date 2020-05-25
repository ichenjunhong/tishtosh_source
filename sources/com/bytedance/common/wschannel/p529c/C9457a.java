package com.bytedance.common.wschannel.p529c;

/* renamed from: com.bytedance.common.wschannel.c.a */
public enum C9457a {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);
    

    /* renamed from: a */
    int f25740a;

    public final int getVal() {
        return this.f25740a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelType{Type=");
        sb.append(this.f25740a);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: of */
    public static C9457a m18765of(int i) {
        if (i == 1) {
            return CHANNEL_SELF;
        }
        return CHANNEL_OK;
    }

    private C9457a(int i) {
        this.f25740a = i;
    }
}
