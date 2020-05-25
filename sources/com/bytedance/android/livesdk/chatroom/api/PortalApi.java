package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5723an;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5702k;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface PortalApi {

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.PortalApi$a */
    public enum C4986a {
        WAIT_REWARD(0),
        RECEIVE_INVITATION(1),
        CLICK_INVITATION(2),
        JUMP_TO_ROOM(3);
        

        /* renamed from: a */
        private int f13371a;

        public final String toString() {
            return String.valueOf(this.f13371a);
        }

        private C4986a(int i) {
            this.f13371a = i;
        }
    }

    @C12706h(mo23876a = "/webcast/gift/portal/ping/")
    C2201v<C4177d<C5702k>> ping(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "portal_id") long j2, @C12724z(mo23894a = "ping_type") C4986a aVar);

    @C12706h(mo23876a = "/webcast/gift/portal/user_portals/")
    C2201v<C4177d<C5723an>> stats(@C12724z(mo23894a = "room_id") long j);
}
