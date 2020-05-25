package com.bytedance.android.livesdk.gift.dialog.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.event.C5163ai;
import com.bytedance.android.livesdk.chatroom.p307c.C5035a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.p379a.C7492c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.j */
final /* synthetic */ class C7271j implements OnClickListener {

    /* renamed from: a */
    private final C7267i f19778a;

    C7271j(C7267i iVar) {
        this.f19778a = iVar;
    }

    public final void onClick(View view) {
        C7267i iVar = this.f19778a;
        if (iVar.f19768k != null && !iVar.f19768k.f20514b && iVar.f19772o) {
            if (iVar.f19759b == 5) {
                C4495a.m10823a().mo10301a((Object) new C5163ai(0));
                iVar.f19758a.mo13536a(new C7289a(1, null));
            } else if (iVar.f19759b == 3) {
                C5035a.m11518a(iVar.itemView.getContext(), (C7492c) iVar.f19768k);
                iVar.f19758a.mo13536a(new C7289a(1, null));
            } else {
                iVar.f19770m.mo13485a();
                iVar.f19770m.setVisibility(8);
                iVar.f19758a.mo13536a(new C7289a(6, iVar.f19768k));
                if (iVar.f19768k != null && (iVar.f19768k.f20516d instanceof C7505d)) {
                    Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
                    C7505d dVar = (C7505d) iVar.f19768k.f20516d;
                    if (dVar != null) {
                        HashMap hashMap = new HashMap();
                        if (currentRoom != null) {
                            hashMap.put("anchor_id", String.valueOf(currentRoom.getOwnerUserId()));
                            hashMap.put("room_id", String.valueOf(currentRoom.getId()));
                        }
                        hashMap.put("gift_id", String.valueOf(dVar.f20543d));
                        hashMap.put("money", String.valueOf(dVar.f20545f));
                        C8049c.m15979a().mo14202a("gift_preview", hashMap, new C8059j(), Room.class);
                    }
                }
            }
        }
    }
}
