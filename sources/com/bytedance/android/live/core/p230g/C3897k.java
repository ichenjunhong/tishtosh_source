package com.bytedance.android.live.core.p230g;

import com.C2240a;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.g.k */
public final class C3897k {

    /* renamed from: a */
    private static SimpleDateFormat f10901a = new SimpleDateFormat("HH:mm:ss");

    /* renamed from: b */
    private static SimpleDateFormat f10902b = new SimpleDateFormat("HH:mm:ss SSS");

    /* renamed from: c */
    private static SimpleDateFormat f10903c = new SimpleDateFormat("HH:mm:ss.SSS");

    /* renamed from: a */
    public static String m9852a(String str, Object... objArr) {
        try {
            return C2240a.m6773a(Locale.US, str, objArr);
        } catch (Exception unused) {
            return "";
        }
    }
}
