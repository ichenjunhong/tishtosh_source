package com.bytedance.android.livesdk.chatroom.p306bl;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8844a;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.f */
final /* synthetic */ class C5011f implements Runnable {

    /* renamed from: a */
    private final C5007d f13425a;

    /* renamed from: b */
    private final Room f13426b;

    /* renamed from: c */
    private final C8844a f13427c;

    C5011f(C5007d dVar, Room room, C8844a aVar) {
        this.f13425a = dVar;
        this.f13426b = room;
        this.f13427c = aVar;
    }

    public final void run() {
        this.f13425a.addFollowGuideMessage(this.f13426b, this.f13427c);
    }
}
