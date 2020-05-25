package com.p683ss.android.ugc.p2425e;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import java.io.File;

/* renamed from: com.ss.android.ugc.e.b */
public final class C48551b {

    /* renamed from: a */
    static final char[] f121990a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static String m105020b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C9395d.m18571a(str));
        sb.append(".mp3");
        return sb.toString();
    }

    /* renamed from: c */
    private static void m105021c(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
                return;
            }
            m105021c(file.getParent());
            file.mkdir();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m105019a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static File m105018a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            m105021c(file.getPath());
        }
        return file;
    }
}
