package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.C5060b.C5061a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.m */
public final class C5079m extends C5060b {

    /* renamed from: d */
    public boolean f13637d;

    /* renamed from: e */
    private final long f13638e;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C2201v<C4177d<Room>> mo10935c() {
        RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class);
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f13638e));
        hashMap.put("pack_level", "4");
        return roomRetrofitApi.fetchRoom(hashMap);
    }

    public C5079m(C5061a aVar, long j) {
        super(aVar);
        this.f13638e = j;
    }
}
