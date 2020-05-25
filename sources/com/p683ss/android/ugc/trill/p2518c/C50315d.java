package com.p683ss.android.ugc.trill.p2518c;

import android.content.ContentResolver;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18969a;

/* renamed from: com.ss.android.ugc.trill.c.d */
final class C50315d {
    /* renamed from: a */
    static String m108593a(ContentResolver contentResolver, String str) {
        if (!TextUtils.equals(str, "android_id")) {
            return System.getString(contentResolver, str);
        }
        if (TextUtils.isEmpty(C18969a.f52270a)) {
            C18969a.f52270a = System.getString(contentResolver, str);
        }
        return C18969a.f52270a;
    }
}
