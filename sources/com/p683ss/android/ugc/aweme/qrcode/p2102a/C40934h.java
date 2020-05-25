package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.qrcode.C40938b;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.h */
public final class C40934h extends C40922a {
    public C40934h(C40923a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo83412a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        if (host.contains("amemv.com") || host.contains("douyin.com") || host.contains("tiktok.com") || host.contains("tiktokv.com") || host.contains("musical.ly")) {
            List pathSegments = parse.getPathSegments();
            if (!C9376b.m18558a((Collection<T>) pathSegments) && pathSegments.size() >= 3) {
                if (TextUtils.equals("share", (String) pathSegments.get(0))) {
                    String str2 = (String) pathSegments.get(2);
                    int a = C40938b.m90529a((String) pathSegments.get(1));
                    this.f104146a = C40938b.m90530a(a, str2);
                    return this.f104147b.mo83411a(a, str2, str, i, null);
                }
            }
        }
        return false;
    }
}
