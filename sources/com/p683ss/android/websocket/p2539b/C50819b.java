package com.p683ss.android.websocket.p2539b;

/* renamed from: com.ss.android.websocket.b.b */
public final class C50819b {

    /* renamed from: a */
    public C50820a f127687a;

    /* renamed from: b */
    public long f127688b;

    /* renamed from: com.ss.android.websocket.b.b$a */
    public enum C50820a {
        OPENING,
        CONNECTED,
        CLOSING,
        RETRY_WAITING,
        CLOSED
    }

    /* renamed from: a */
    public final C50819b mo99522a(C50820a aVar) {
        this.f127687a = aVar;
        return this;
    }

    public C50819b(C50820a aVar, long j) {
        this.f127687a = aVar;
        this.f127688b = j;
    }
}
