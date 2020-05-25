package com.p683ss.android.ugc.aweme.promote;

import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.promote.c */
public final class C40741c {

    /* renamed from: a */
    public static PromoteProgramDialog f103790a;

    /* renamed from: b */
    private static SharedPreferences f103791b;

    /* renamed from: a */
    public static SharedPreferences m90140a() {
        if (f103791b == null) {
            f103791b = C35807d.m80935a(AwemeApplication.m56199a(), "aweme-promote-dialog", 0);
        }
        return f103791b;
    }
}
