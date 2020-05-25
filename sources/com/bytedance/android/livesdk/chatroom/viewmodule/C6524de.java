package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.de */
final /* synthetic */ class C6524de implements OnClickListener {

    /* renamed from: a */
    private final LinkPKWidget f17836a;

    /* renamed from: b */
    private final C4632d f17837b;

    C6524de(LinkPKWidget linkPKWidget, C4632d dVar) {
        this.f17836a = linkPKWidget;
        this.f17837b = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkPKWidget linkPKWidget = this.f17836a;
        C4632d dVar = this.f17837b;
        if (linkPKWidget.isViewValid()) {
            if (dVar == C4632d.PK) {
                C4526c<Integer> cVar = C4525b.f12340aI;
                cVar.mo10346a(Integer.valueOf(((Integer) cVar.mo10345a()).intValue() - 1));
                C4525b.f12438l.mo10346a(C4574am.m10979b(System.currentTimeMillis()));
                if (linkPKWidget.f17228l != null) {
                    linkPKWidget.f17228l.mo11461a(true);
                }
            } else {
                if (linkPKWidget.f17154c && dVar == C4632d.PENAL) {
                    C8056g gVar = new C8056g();
                    if (LinkCrossRoomDataHolder.m11103a().f12627r == 0) {
                        gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                    }
                    C8049c.m15979a().mo14203a("punish_end", gVar.mo14212c("disconnect").mo14208a(String.valueOf((System.currentTimeMillis() - linkPKWidget.f17152a.f12635z) / 1000)), linkPKWidget.f17152a.mo10411b(), Room.class);
                }
                linkPKWidget.f17152a.lambda$put$1$DataCenter("data_pk_result", C4631c.RIGHT_WON).lambda$put$1$DataCenter("cmd_stop_interact", Boolean.valueOf(false));
            }
            dialogInterface.dismiss();
        }
    }
}
