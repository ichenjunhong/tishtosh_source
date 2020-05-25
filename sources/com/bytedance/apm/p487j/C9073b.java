package com.bytedance.apm.p487j;

import android.os.Environment;
import com.bytedance.apm.C8976c;

/* renamed from: com.bytedance.apm.j.b */
public final class C9073b {

    /* renamed from: a */
    private static String f24792a;

    /* renamed from: a */
    public static String m17972a() {
        if (f24792a == null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                sb.append("/Android/data/");
                sb.append(C8976c.m17736a().getPackageName());
                sb.append("/AutomationTestInfo.json");
                f24792a = sb.toString();
            } catch (Exception unused) {
            }
        }
        return f24792a;
    }
}
