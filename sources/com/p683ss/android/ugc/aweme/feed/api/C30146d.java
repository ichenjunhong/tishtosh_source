package com.p683ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.p830a.C12686c;

/* renamed from: com.ss.android.ugc.aweme.feed.api.d */
public final class C30146d {

    /* renamed from: a */
    public static volatile long f78686a;

    /* renamed from: b */
    public static volatile String f78687b;

    /* renamed from: a */
    public static boolean m70749a(String str) {
        return str.contains("/aweme/v1/feed/");
    }

    /* renamed from: b */
    public static boolean m70750b(String str) {
        return str.contains("/aweme/v2/feed/");
    }

    /* renamed from: a */
    public static boolean m70748a(C12686c cVar) {
        if (cVar == null) {
            return false;
        }
        String c = cVar.mo23860c();
        if (TextUtils.isEmpty(c) || (!m70749a(c) && !m70750b(c))) {
            return false;
        }
        return true;
    }
}
