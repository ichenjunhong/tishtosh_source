package com.p683ss.android.ugc.aweme.p1335aj;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.aj.a */
public final class C22548a {

    /* renamed from: a */
    public static boolean f60686a;

    /* renamed from: b */
    public static Boolean f60687b;

    /* renamed from: a */
    public static String m55711a() {
        return "tt_tiktok";
    }

    /* renamed from: b */
    public static boolean m55712b() {
        String p = C11010c.m22295p();
        if (TextUtils.equals(p, "local_test") || TextUtils.equals(p, "daily_monkey_test")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static File m55710a(Context context) {
        File b = C48016e.m103941b(context);
        if (!C48016e.m103957g()) {
            b = context.getCacheDir();
        }
        if (b == null) {
            return null;
        }
        File file = new File(b, "jacoco");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
