package com.bytedance.android.livesdk.chatroom.interact.p320i;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.i.g */
final /* synthetic */ class C5628g implements OnClickListener {

    /* renamed from: a */
    private final C5627f f14751a;

    /* renamed from: b */
    private final Room f14752b;

    C5628g(C5627f fVar, Room room) {
        this.f14751a = fVar;
        this.f14752b = room;
    }

    public final void onClick(View view) {
        C5627f fVar = this.f14751a;
        fVar.f14743a.mo11117a(this.f14752b, fVar.f14744b, fVar.f14745c, null, 0);
    }
}
