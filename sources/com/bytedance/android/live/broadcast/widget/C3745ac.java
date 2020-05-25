package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.p201c.C3150a;
import com.bytedance.android.live.broadcast.p201c.C3150a.C3154c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.widget.ac */
final /* synthetic */ class C3745ac implements C3154c {

    /* renamed from: a */
    private final C3796v f10612a;

    /* renamed from: b */
    private final C3150a f10613b;

    C3745ac(C3796v vVar, C3150a aVar) {
        this.f10612a = vVar;
        this.f10613b = aVar;
    }

    /* renamed from: a */
    public final void mo8492a(Game game) {
        C3796v vVar = this.f10612a;
        C3150a aVar = this.f10613b;
        vVar.f10736h = game;
        if (game == null) {
            vVar.f10731c.setVisibility(0);
            vVar.f10730b.setVisibility(8);
            vVar.f10729a.setText(R.string.et6);
        } else {
            vVar.f10731c.setVisibility(8);
            vVar.f10730b.setVisibility(0);
            C5213c.m11814a(vVar.f10730b, game.icon);
            vVar.f10729a.setText(game.name);
        }
        aVar.dismiss();
        if (game == null) {
            vVar.f10735g.mo19441a("hotsoon.pref.LAST_SET_GAME", (Object) "").mo19443a();
        } else {
            vVar.f10735g.mo19441a("hotsoon.pref.LAST_SET_GAME", (Object) game.toJsonString()).mo19443a();
        }
    }
}
