package com.bytedance.android.livesdk.rank;

import com.bytedance.android.livesdk.chatroom.model.C5762q;
import com.bytedance.android.livesdk.chatroom.model.C5763r;
import com.bytedance.android.livesdk.config.LiveSettingKeys;

/* renamed from: com.bytedance.android.livesdk.rank.m */
public final class C8213m {
    /* renamed from: a */
    public static int m16289a(boolean z) {
        C5762q qVar = (C5762q) LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG.mo9431a();
        if (!z || qVar == null || !qVar.f15152b) {
            return ((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo9431a()).intValue();
        }
        return qVar.f15151a;
    }

    /* renamed from: b */
    public static boolean m16290b(boolean z) {
        if (!z) {
            return z;
        }
        C5763r rVar = (C5763r) LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG.mo9431a();
        if (rVar == null || !rVar.f15152b) {
            return false;
        }
        return true;
    }
}
