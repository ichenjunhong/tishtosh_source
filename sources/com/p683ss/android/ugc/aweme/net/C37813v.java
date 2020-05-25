package com.p683ss.android.ugc.aweme.net;

import android.text.TextUtils;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.net.v */
public final class C37813v {
    /* renamed from: a */
    public static String m84416a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ByteString.encodeUtf8(str).md5().hex();
    }
}
