package com.bytedance.android.livesdk.chatroom.p306bl;

import com.bytedance.android.livesdk.message.model.C7802ah;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.e */
final /* synthetic */ class C5010e implements Runnable {

    /* renamed from: a */
    private final C5007d f13422a;

    /* renamed from: b */
    private final Room f13423b;

    /* renamed from: c */
    private final C7802ah f13424c;

    C5010e(C5007d dVar, Room room, C7802ah ahVar) {
        this.f13422a = dVar;
        this.f13423b = room;
        this.f13424c = ahVar;
    }

    public final void run() {
        C5007d dVar = this.f13422a;
        Room room = this.f13423b;
        C7802ah ahVar = this.f13424c;
        if (!C5007d.m11500a(room)) {
            dVar.add(ahVar);
        }
        dVar.f13414a = null;
    }
}
