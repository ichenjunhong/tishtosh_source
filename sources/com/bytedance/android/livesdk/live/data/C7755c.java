package com.bytedance.android.livesdk.live.data;

import java.util.HashMap;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.live.data.c */
final /* synthetic */ class C7755c implements C1710e {

    /* renamed from: a */
    private final RoomStatsViewModel f21318a;

    C7755c(RoomStatsViewModel roomStatsViewModel) {
        this.f21318a = roomStatsViewModel;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.f21318a.f21314a.setValue(new HashMap());
    }
}
