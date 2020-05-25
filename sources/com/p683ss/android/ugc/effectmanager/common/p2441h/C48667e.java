package com.p683ss.android.ugc.effectmanager.common.p2441h;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.e */
public final class C48667e {
    /* renamed from: a */
    public static String m105297a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append("effect_version");
        return sb.toString();
    }

    /* renamed from: b */
    public static Pattern m105301b(String str) {
        StringBuilder sb = new StringBuilder("effectchannel");
        sb.append(str);
        sb.append("(.*)");
        return Pattern.compile(sb.toString());
    }

    /* renamed from: b */
    public static String m105300b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(File.separator);
        sb.append("effectchannel");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m105302c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append("category_version");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m105298a(String str, String str2) {
        StringBuilder sb = new StringBuilder("effectchannel");
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m105299a(String str, String str2, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append("effectchannel");
        sb.append(str2);
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(i3);
        return sb.toString();
    }
}
