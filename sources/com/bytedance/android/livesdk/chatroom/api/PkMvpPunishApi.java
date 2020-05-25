package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface PkMvpPunishApi {

    /* renamed from: a */
    public static final C4985a f13368a = C4985a.f13369a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.PkMvpPunishApi$a */
    public static final class C4985a {

        /* renamed from: a */
        static final /* synthetic */ C4985a f13369a = new C4985a();

        private C4985a() {
        }
    }

    @C12706h(mo23876a = "/webcast/linkmic/battle/control_punish/")
    C2201v<Void> controlPunishEffect(@C12724z(mo23894a = "control_type") int i, @C12724z(mo23894a = "from_user_id") Long l, @C12724z(mo23894a = "from_user_type") Integer num, @C12724z(mo23894a = "from_room_id") Long l2, @C12724z(mo23894a = "punish_effect_id") Long l3, @C12724z(mo23894a = "channel_id") Long l4, @C12724z(mo23894a = "battle_id") Long l5, @C12724z(mo23894a = "end_reason") Integer num2);
}
