package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.n */
public final class C33513n {
    /* renamed from: a */
    public static boolean m76798a(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.RECORD_AUDIO", context.getApplicationInfo().processName) == 0) {
            return true;
        }
        return false;
    }
}
