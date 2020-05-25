package com.p683ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.utils.al */
public final class C47671al {

    /* renamed from: a */
    public static final C47671al f120149a = new C47671al();

    private C47671al() {
    }

    /* renamed from: a */
    public static final boolean m103181a() {
        if (TextUtils.equals(Build.MODEL, "Redmi 6A") || TextUtils.equals(Build.MODEL, "Redmi 6")) {
            return true;
        }
        return false;
    }
}
