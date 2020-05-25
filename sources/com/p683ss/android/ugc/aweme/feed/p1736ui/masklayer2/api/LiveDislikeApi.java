package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.api;

import com.bytedance.android.live.base.model.live.C2981a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.api.LiveDislikeApi */
public interface LiveDislikeApi {
    @C12706h(mo23876a = "/webcast/room/dislike/")
    C2201v<C4177d<C2981a>> dislikeLiveRoom(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "owner_uid") long j2, @C12724z(mo23894a = "request_id") String str, @C12724z(mo23894a = "source") String str2, @C12724z(mo23894a = "enter_from_merge") String str3, @C12724z(mo23894a = "enter_method") String str4);
}
