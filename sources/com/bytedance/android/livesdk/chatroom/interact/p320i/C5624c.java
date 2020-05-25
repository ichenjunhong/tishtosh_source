package com.bytedance.android.livesdk.chatroom.interact.p320i;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.i.c */
final /* synthetic */ class C5624c implements OnClickListener {

    /* renamed from: a */
    private final C5623b f14735a;

    /* renamed from: b */
    private final Room f14736b;

    /* renamed from: c */
    private final C5382c f14737c;

    /* renamed from: d */
    private final int f14738d;

    C5624c(C5623b bVar, Room room, C5382c cVar, int i) {
        this.f14735a = bVar;
        this.f14736b = room;
        this.f14737c = cVar;
        this.f14738d = i;
    }

    public final void onClick(View view) {
        C5623b bVar = this.f14735a;
        bVar.f14721a.mo11117a(this.f14736b, bVar.f14722b, bVar.f14724d, this.f14737c, this.f14738d);
    }
}
