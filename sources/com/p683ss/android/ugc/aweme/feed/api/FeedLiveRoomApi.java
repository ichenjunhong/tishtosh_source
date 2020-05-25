package com.p683ss.android.ugc.aweme.feed.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.live.C36173w;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi */
public final class FeedLiveRoomApi {

    /* renamed from: a */
    private static final RoomApi f78679a;

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi$RoomApi */
    public interface RoomApi {
        @C12706h(mo23876a = "webcast/d/topview_room/")
        C12690b<C4175b<Room, Extra>> queryRoomInfo(@C12724z(mo23894a = "uid") long j, @C12724z(mo23894a = "sec_uid") String str);
    }

    static {
        IRetrofitFactory createIRetrofitFactorybyMonsterPlugin = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin();
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C36173w.m81665a().getILiveAllService().mo74804a());
        f78679a = (RoomApi) createIRetrofitFactorybyMonsterPlugin.createBuilder(sb.toString()).mo19925a().mo19930a(RoomApi.class);
    }

    /* renamed from: a */
    public static C12690b<C4175b<Room, Extra>> m70740a(long j, String str) {
        return f78679a.queryRoomInfo(j, str);
    }
}
