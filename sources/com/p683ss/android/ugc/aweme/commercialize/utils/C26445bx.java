package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.C2240a;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.C23060d.C23061a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26460e;
import java.net.URLEncoder;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bx */
public final class C26445bx {
    /* renamed from: a */
    public static void m63936a(Context context, String str) {
        String str2;
        C26460e.m63978a(str);
        C23061a aVar = C23060d.f61431e;
        String str3 = "trigger_by";
        String str4 = "splash";
        String str5 = "%s%s%s=%s";
        Object[] objArr = new Object[4];
        objArr[0] = str;
        if (str.contains("?")) {
            str2 = "&";
        } else {
            str2 = "?";
        }
        objArr[1] = str2;
        objArr[2] = URLEncoder.encode(str3);
        objArr[3] = URLEncoder.encode(str4);
        aVar.mo47789a(context, C2240a.m6772a(str5, objArr), (String) null);
    }
}
