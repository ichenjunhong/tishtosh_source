package com.bytedance.android.livesdk.chatroom.p306bl;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.h */
public final class C5013h {
    /* renamed from: a */
    public static Room m11506a(boolean z, long j, int i) throws Exception {
        C4177d dVar = (C4177d) ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getRoomStats(z, j, i).execute().f33552b;
        if (dVar.extra != null) {
            ((Room) dVar.data).nowTime = dVar.extra.now / 1000;
        }
        return (Room) dVar.data;
    }
}
