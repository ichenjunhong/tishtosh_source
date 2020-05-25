package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.s */
public final class C15528s {

    /* renamed from: a */
    private static final Pattern f40000a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static boolean m32308a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
