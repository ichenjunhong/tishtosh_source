package com.bytedance.android.livesdk.rank.p413f;

import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.view.C8232e.C8236a;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.rank.f.e */
final /* synthetic */ class C8178e implements C8236a {

    /* renamed from: a */
    private final C8176d f22331a;

    C8178e(C8176d dVar) {
        this.f22331a = dVar;
    }

    /* renamed from: a */
    public final long[] mo14354a() {
        C8176d dVar = this.f22331a;
        if ((!((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_NORMAL.mo9431a()).booleanValue() && !((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_FEED_DRAWER.mo9431a()).booleanValue()) || dVar.f22313a == null || C3914u.m9892a(dVar.f22313a.f22413a)) {
            return new long[0];
        }
        ArrayList arrayList = new ArrayList();
        for (C8219f a : dVar.f22313a.f22413a) {
            long a2 = a.mo14364a();
            if (a2 != 0) {
                arrayList.add(Long.valueOf(a2));
            }
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        return jArr;
    }
}
