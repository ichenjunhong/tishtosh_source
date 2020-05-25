package com.p683ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.util.i */
public final class C47625i {
    /* renamed from: a */
    public static void m103103a(String str) {
        C32458a.m75144a(str);
    }

    /* renamed from: a */
    public static void m103104a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder("  logFile is null :");
                sb.append(str);
                C32458a.m75144a(sb.toString());
                return;
            }
            File file = new File(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("   filePath:");
            sb2.append(file.getAbsolutePath());
            sb2.append("         exist:");
            sb2.append(file.exists());
            sb2.append("        fileSize:");
            sb2.append(file.length());
            C32458a.m75144a(sb2.toString());
        } catch (Exception unused) {
        }
    }
}
