package com.p683ss.android.ugc.aweme.app;

import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.app.m */
public final class C23128m {
    /* renamed from: a */
    public static int m56685a() {
        return C35807d.m80935a(C11010c.m22280a(), "app_setting", 0).getInt("last_version_code", 0);
    }

    /* renamed from: a */
    public static void m56686a(int i) {
        Editor edit = C35807d.m80935a(C11010c.m22280a(), "app_setting", 0).edit();
        edit.putInt("last_version_code", i);
        C9402b.m18594a(edit);
    }
}
