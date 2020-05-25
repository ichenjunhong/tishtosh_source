package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;

/* renamed from: com.bytedance.android.livesdk.viewmodel.e */
public final class C8421e implements C0212b {
    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        if (cls.isAssignableFrom(RoomStatsViewModel.class)) {
            return new RoomStatsViewModel();
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
