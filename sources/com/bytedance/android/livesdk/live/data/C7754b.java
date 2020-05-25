package com.bytedance.android.livesdk.live.data;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.live.model.C7759c;
import com.bytedance.common.utility.C9414h;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.live.data.b */
final /* synthetic */ class C7754b implements C1710e {

    /* renamed from: a */
    private final RoomStatsViewModel f21317a;

    C7754b(RoomStatsViewModel roomStatsViewModel) {
        this.f21317a = roomStatsViewModel;
    }

    public final void accept(Object obj) {
        RoomStatsViewModel roomStatsViewModel = this.f21317a;
        C4176c cVar = (C4176c) obj;
        if (!C9414h.m18630a(cVar.f11365b)) {
            HashMap hashMap = new HashMap();
            for (C7759c cVar2 : cVar.f11365b) {
                hashMap.put(String.valueOf(cVar2.f21332a), cVar2);
            }
            roomStatsViewModel.f21314a.setValue(hashMap);
        }
    }
}
