package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.db */
final /* synthetic */ class C6521db implements OnClickListener {

    /* renamed from: a */
    private final LinkPKWidget f17833a;

    C6521db(LinkPKWidget linkPKWidget) {
        this.f17833a = linkPKWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkPKWidget linkPKWidget = this.f17833a;
        HashMap hashMap = new HashMap();
        hashMap.put("selection", "reject");
        C4632d dVar = (C4632d) LinkCrossRoomDataHolder.m11103a().get("data_pk_state");
        C8056g gVar = new C8056g();
        if (linkPKWidget.f17152a.f12627r == 0) {
            gVar.mo14206a(linkPKWidget.f17152a.f12616g);
        }
        hashMap.put("connection_type", "manual_pk");
        hashMap.put("is_oncemore", "1");
        C8049c.m15979a().mo14202a("connection_invited", hashMap, Room.class, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other").mo14213a("live_detail"), gVar.mo14209b(linkPKWidget.f17152a.f12614e).mo14211c(linkPKWidget.f17153b.getOwner().getId()).mo14205a(((Integer) C4525b.f12346aO.mo10345a()).intValue()));
        if (dVar == C4632d.PK) {
            C4575an.m10981a((int) R.string.ekn);
        }
        linkPKWidget.f17228l.mo11466d();
        dialogInterface.dismiss();
    }
}
