package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35890a;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;

/* renamed from: com.ss.android.ugc.aweme.utils.ah */
public final class C47667ah {

    /* renamed from: a */
    private static volatile boolean f120143a;

    /* renamed from: b */
    private static volatile boolean f120144b;

    /* renamed from: c */
    private static Object f120145c = new Object();

    /* renamed from: a */
    public static boolean m103178a(Context context) {
        m103179b(context);
        return f120143a;
    }

    /* renamed from: b */
    public static void m103179b(Context context) {
        boolean z;
        if (!f120144b && context != null) {
            synchronized (f120145c) {
                if (!f120144b) {
                    String b = C35890a.m81059b(context);
                    StringBuilder sb = new StringBuilder("keva_new_user_repo_");
                    sb.append(b);
                    Keva repo = Keva.getRepo(sb.toString());
                    if (!repo.getBoolean("is_new_user", true) || !C22574a.m55736c()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f120143a = z;
                    f120144b = true;
                    repo.storeBoolean("is_new_user", false);
                }
            }
        }
    }
}
