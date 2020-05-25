package com.bytedance.android.livesdk;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.live.api.DislikeApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.i */
final /* synthetic */ class C7667i implements OnClickListener {

    /* renamed from: a */
    private final C6752f f21119a;

    /* renamed from: b */
    private final Room f21120b;

    C7667i(C6752f fVar, Room room) {
        this.f21119a = fVar;
        this.f21120b = room;
    }

    public final void onClick(View view) {
        C6752f fVar = this.f21119a;
        Room room = this.f21120b;
        C6764a aVar = fVar.f18472l;
        aVar.mo12899a();
        long id = room.getId();
        aVar.f18522b = ((DislikeApi) C4514j.m10883j().mo10321b().mo9550a(DislikeApi.class)).dislikeRoom(id, room.getOwner().getId(), room.getRequestId(), aVar.f18521a, aVar.f18521a, room.getLog_pb()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8314u<Object>(aVar, id), (C1710e<? super Throwable>) new C8367v<Object>(aVar));
        C6752f.this.mo9206a(aVar.f18522b);
        C8441w.m16641a(fVar.f18465e);
        C8049c.m15979a().mo14203a("live_dislike", new C8059j().mo14218f("core").mo14214b("live_interact").mo14213a("live_detail").mo14215c(CustomActionPushReceiver.f104061f), new C8060k(), Room.class);
    }
}
