package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.C5060b.C5061a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.n */
public final class C5080n extends C5060b {

    /* renamed from: d */
    private final long f13639d;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C2201v<C4177d<Room>> mo10935c() {
        return ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).fetchUserRoom(this.f13639d, TTLiveSDKContext.getHostService().mo10315h().mo14522a(this.f13639d));
    }

    public C5080n(C5061a aVar, long j) {
        super(aVar);
        this.f13639d = j;
    }
}
