package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ax */
public final class C4854ax extends C10782e<C4855a, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ax$a */
    static final class C4855a {
        @C17952c(mo34828a = "sec_anchor_id")

        /* renamed from: a */
        String f13079a;
        @C17952c(mo34828a = "enter_from")

        /* renamed from: b */
        String f13080b;

        C4855a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        C4855a aVar = (C4855a) obj;
        C8612a aVar2 = (C8612a) C4116c.m10249a(C8612a.class);
        if (aVar2 != null) {
            Room currentRoom = TTLiveSDKContext.getLiveService().mo15050c().getCurrentRoom();
            if (currentRoom != null) {
                C4116c.m10249a(C8612a.class);
                currentRoom.author().getSecUid();
                currentRoom.getId();
                new C4856ay(fVar, aVar2, aVar);
            }
        }
        return null;
    }
}
