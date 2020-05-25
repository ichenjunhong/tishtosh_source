package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.c */
final /* synthetic */ class C5062c implements C1710e {

    /* renamed from: a */
    private final C5060b f13543a;

    C5062c(C5060b bVar) {
        this.f13543a = bVar;
    }

    public final void accept(Object obj) {
        C5060b bVar = this.f13543a;
        C4177d dVar = (C4177d) obj;
        if (bVar.f13540b) {
            if (dVar == null) {
                bVar.mo10933a(0, "invalid room data _ response is null");
                return;
            }
            Room room = (Room) dVar.data;
            bVar.f13541c = room;
            bVar.f13540b = false;
            bVar.f13539a.mo10937a(room);
        }
    }
}
