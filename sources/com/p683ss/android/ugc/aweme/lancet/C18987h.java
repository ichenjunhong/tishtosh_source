package com.p683ss.android.ugc.aweme.lancet;

import android.text.TextUtils;
import com.bytedance.common.utility.p526f.C9409b;

/* renamed from: com.ss.android.ugc.aweme.lancet.h */
public final class C18987h {

    /* renamed from: a */
    public static volatile String f52292a;

    /* renamed from: a */
    public static String m46165a() {
        if (TextUtils.isEmpty(f52292a)) {
            try {
                Object obj = C9409b.m18608a(Class.forName("android.app.ActivityThread")).mo17054b("currentActivityThread").mo17054b("getProcessName").f25654a;
                if (obj != null && (obj instanceof String)) {
                    String str = (String) obj;
                    f52292a = str;
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        return f52292a;
    }
}
