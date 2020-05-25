package com.p683ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;

/* renamed from: com.ss.android.ugc.aweme.utils.cs */
public final class C47787cs {
    /* renamed from: a */
    public static boolean m103416a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getHost());
            sb.append(parse.getPath());
            String sb2 = sb.toString();
            if (sb2.startsWith("videoRecord/live") || sb2.startsWith("video_record/live") || (parse.getHost().equals("video_record") && TextUtils.equals(parse.getQueryParameter("record_type"), CustomActionPushReceiver.f104061f))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
