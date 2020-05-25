package com.bytedance.android.live.livepullstream.p249a;

import android.content.Context;
import android.os.Bundle;
import android.view.TextureView;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.room.C4181b;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.p160b.C2831a;
import com.bytedance.android.p160b.C2831a.C2832a;
import com.bytedance.android.p160b.C2833b;

/* renamed from: com.bytedance.android.live.livepullstream.a.d */
public interface C4139d extends C2952b {
    C2831a createRoomPlayer(String str, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context, String str2);

    C2831a createRoomPlayer(String str, String str2, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context);

    C2831a ensureRoomPlayer(long j, String str, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context, String str2, String str3);

    C2831a ensureRoomPlayer(long j, String str, String str2, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context, String str3);

    C4134a getCpuInfoFetcher();

    C4181b getDnsOptimizer();

    C4136b getGpuInfoFetcher();

    C4189h getLivePlayController();

    C4138c getLivePlayerLog();

    String getProjectKey();

    void recycleRoomPlayer(String str);

    void stopRoomPlayer(String str, boolean z);

    C2833b warmUp(long j, Bundle bundle, Context context);

    C2833b warmUp(Room room, Context context);
}
