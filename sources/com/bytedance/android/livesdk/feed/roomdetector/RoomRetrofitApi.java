package com.bytedance.android.livesdk.feed.roomdetector;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.HashMap;
import p064c.p065a.C2201v;

public interface RoomRetrofitApi {
    @C12706h(mo23876a = "/webcast/room/info/")
    C2201v<C4177d<Room>> fetchRoom(@C12694aa HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/room/ping/audience/")
    C2201v<C4177d<PingResult>> sendPlayingPing(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "only_status") int i);
}
