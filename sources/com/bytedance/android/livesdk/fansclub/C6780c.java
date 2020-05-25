package com.bytedance.android.livesdk.fansclub;

import android.text.TextUtils;
import com.bytedance.android.livesdk.config.LiveSettingKeys;

/* renamed from: com.bytedance.android.livesdk.fansclub.c */
public final class C6780c {
    /* renamed from: a */
    public static boolean m14218a(boolean z) {
        if (z || TextUtils.isEmpty((CharSequence) LiveSettingKeys.LIVE_FANS_GROUP_URL.mo9431a())) {
            return false;
        }
        return true;
    }
}
