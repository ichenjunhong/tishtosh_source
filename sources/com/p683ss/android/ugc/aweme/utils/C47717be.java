package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ttplatformsdk.p1222a.C20055a;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.utils.be */
public final class C47717be {
    /* renamed from: a */
    public static void m103287a() {
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
        String b = C20055a.m49537a(C11010c.m22280a()).mo42109b("enjoy_today_date", "");
        if (TextUtils.isEmpty(b) || !b.equals(format)) {
            C20055a.m49537a(C11010c.m22280a()).mo42108a("enjoy_today_date", format);
        }
    }
}
