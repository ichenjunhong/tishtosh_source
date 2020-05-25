package com.bytedance.common.wschannel.p529c;

/* renamed from: com.bytedance.common.wschannel.c.b */
public final class C9458b {

    /* renamed from: a */
    public final C9457a f25741a;

    /* renamed from: b */
    public final C9459c f25742b;

    /* renamed from: c */
    public final int f25743c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectEvent{mType=");
        sb.append(this.f25741a);
        sb.append(", connectionState=");
        sb.append(this.f25742b);
        sb.append(", mChannelId=");
        sb.append(this.f25743c);
        sb.append('}');
        return sb.toString();
    }

    public C9458b(C9459c cVar, C9457a aVar, int i) {
        this.f25742b = cVar;
        this.f25741a = aVar;
        this.f25743c = i;
    }
}
