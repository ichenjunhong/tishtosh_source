package com.p683ss.android.ugc.awemepushlib.p2408c;

import android.os.Build;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.awemepushlib.c.b */
public final class C48433b {

    /* renamed from: a */
    private static int f121795a = -1;

    /* renamed from: b */
    private static int f121796b = -1;

    /* renamed from: c */
    private static final Pattern f121797c = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: a */
    public static boolean m104800a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo")) {
            return true;
        }
        return false;
    }
}
