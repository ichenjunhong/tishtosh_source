package com.p683ss.caijing.globaliap.p2559d;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.ss.caijing.globaliap.d.g */
public final class C51265g {

    /* renamed from: a */
    static HashSet<String> f128023a = new HashSet<>();

    /* renamed from: a */
    static void m110204a(String str) {
        f128023a.remove(str);
    }

    /* renamed from: a */
    public static synchronized void m110203a(Context context, String str, String str2, boolean z) {
        synchronized (C51265g.class) {
            if (!f128023a.contains(str2)) {
                new Thread(new C51234b(context, str, str2, z), "cj_bg_check_consume").start();
            }
        }
    }
}
