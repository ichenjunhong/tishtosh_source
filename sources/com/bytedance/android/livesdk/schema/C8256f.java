package com.bytedance.android.livesdk.schema;

import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.livesdk.schema.f */
final /* synthetic */ class C8256f implements C2205y {

    /* renamed from: a */
    private final RoomActionHandler f22570a;

    /* renamed from: b */
    private final long f22571b;

    C8256f(RoomActionHandler roomActionHandler, long j) {
        this.f22570a = roomActionHandler;
        this.f22571b = j;
    }

    public final void subscribe(C2204x xVar) {
        this.f22570a.lambda$handle$0$RoomActionHandler(this.f22571b, xVar);
    }
}
