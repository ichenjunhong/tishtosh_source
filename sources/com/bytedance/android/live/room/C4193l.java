package com.bytedance.android.live.room;

import android.text.Spannable;
import com.bytedance.android.live.room.p254a.C4180a;
import com.bytedance.android.livesdkapi.depend.live.C8661k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.p160b.C2831a.C2832a;

/* renamed from: com.bytedance.android.live.room.l */
public interface C4193l extends C8661k {
    void cacheEndTime(C4189h hVar, long j);

    void cacheObj2Obj(C2832a aVar, C4189h hVar);

    C4180a getCrossRoomGift();

    String getLiveType(Room room);

    C4191j messageManagerHelper();

    Spannable parsePatternAndGetSpannable(C8851g gVar, String str);

    Spannable parsePatternAndGetSpannable(String str, C8851g gVar);

    C4192k roomManager();

    C4180a setCrossRoomGift(C4180a aVar);

    C4195n toolbarManagerHelper();
}
