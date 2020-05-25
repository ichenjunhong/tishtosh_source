package com.p683ss.android.ugc.aweme.setting;

import android.content.Context;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.base.p1417h.C23536a;

/* renamed from: com.ss.android.ugc.aweme.setting.l */
public final class C41632l {
    /* renamed from: a */
    public static boolean m91511a(Context context) {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C23536a.m57711a("aweme_app", "use_dynamic_cover", z);
    }
}
