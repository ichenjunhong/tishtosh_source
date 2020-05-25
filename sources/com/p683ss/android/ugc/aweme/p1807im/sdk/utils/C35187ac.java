package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ac */
public final class C35187ac {
    /* renamed from: a */
    public static void m79437a(Context context, Intent intent) {
        if (context != null) {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                C9432q.m18672a(context, (int) R.string.bon);
            }
        }
    }

    /* renamed from: a */
    public static void m79438a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder("tel:");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        intent.addFlags(268435456);
        m79437a(context, intent);
    }
}
