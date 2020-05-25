package com.bytedance.android.live.broadcast.bgbroadcast;

import com.bytedance.android.livesdk.chatroom.event.C5204w;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.d */
final /* synthetic */ class C3123d implements C1710e {

    /* renamed from: a */
    private final C3114c f9103a;

    C3123d(C3114c cVar) {
        this.f9103a = cVar;
    }

    public final void accept(Object obj) {
        this.f9103a.onEvent((C5204w) obj);
    }
}
