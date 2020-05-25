package com.bytedance.android.live.base.p192sp;

import android.content.Context;
import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.android.live.base.sp.a */
public final class C3018a {
    /* renamed from: a */
    public static void m8456a(Context context) {
        if (context != null) {
            SharedPreferences a = C35807d.m80935a(context, "ttlive_sdk_shared_pref_cache", 4);
            if (a != null) {
                a.edit().putLong("key_ttlive_sdk_flow_remind", System.currentTimeMillis()).apply();
            }
        }
    }

    /* renamed from: b */
    public static boolean m8457b(Context context) {
        if (context != null) {
            SharedPreferences a = C35807d.m80935a(context, "ttlive_sdk_shared_pref_cache", 4);
            if (a != null) {
                if (((int) ((System.currentTimeMillis() - a.getLong("key_ttlive_sdk_flow_remind", 0)) / FbUploadTokenTime.group0)) <= 30) {
                    return true;
                }
            }
        }
        return false;
    }
}
