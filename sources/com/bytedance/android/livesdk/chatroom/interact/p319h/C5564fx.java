package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fx */
final /* synthetic */ class C5564fx implements C1710e {

    /* renamed from: a */
    private final C5556fq f14629a;

    C5564fx(C5556fq fqVar) {
        this.f14629a = fqVar;
    }

    public final void accept(Object obj) {
        C5556fq fqVar = this.f14629a;
        Long l = (Long) obj;
        if (fqVar.mo8518c() != null) {
            fqVar.f14614c.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(l.intValue()));
            if (l.longValue() <= 0) {
                if (fqVar.f14613b) {
                    C8056g gVar = new C8056g();
                    if (fqVar.f14612a.getId() == fqVar.f14614c.f12612c) {
                        gVar.mo14209b(fqVar.f14612a.getOwner().getId());
                        gVar.mo14211c(fqVar.f14614c.f12614e);
                    } else {
                        gVar.mo14209b(fqVar.f14614c.f12614e);
                        gVar.mo14211c(fqVar.f14612a.getOwner().getId());
                    }
                    if (LinkCrossRoomDataHolder.m11103a().f12627r == 0) {
                        gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                    }
                    C8049c.m15979a().mo14203a("punish_end", gVar.mo14212c("time_out").mo14208a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12635z) / 1000)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
                }
                fqVar.f14614c.lambda$put$1$DataCenter("data_pk_state", C4632d.FINISHED);
            }
        }
    }
}
