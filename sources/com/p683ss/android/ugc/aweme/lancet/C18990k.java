package com.p683ss.android.ugc.aweme.lancet;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C22835a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.lancet.k */
public final class C18990k {
    /* renamed from: a */
    public static void m46166a(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("aweme://user/profile/")) {
            Uri parse = Uri.parse(str);
            List pathSegments = parse.getPathSegments();
            if (pathSegments != null && pathSegments.size() >= 2) {
                C22835a.f61198c.mo47680a((String) pathSegments.get(1), parse, false);
            }
        }
    }
}
