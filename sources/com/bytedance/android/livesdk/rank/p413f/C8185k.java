package com.bytedance.android.livesdk.rank.p413f;

import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.view.C8232e.C8236a;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.rank.f.k */
final /* synthetic */ class C8185k implements C8236a {

    /* renamed from: a */
    private final C8183j f22353a;

    C8185k(C8183j jVar) {
        this.f22353a = jVar;
    }

    /* renamed from: a */
    public final long[] mo14354a() {
        C8183j jVar = this.f22353a;
        if ((!((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_NORMAL.mo9431a()).booleanValue() && !((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_FEED_DRAWER.mo9431a()).booleanValue()) || jVar.f22336a == null || C3914u.m9892a(jVar.f22336a.f22413a)) {
            return new long[0];
        }
        ArrayList arrayList = new ArrayList();
        for (C8219f a : jVar.f22336a.f22413a) {
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
