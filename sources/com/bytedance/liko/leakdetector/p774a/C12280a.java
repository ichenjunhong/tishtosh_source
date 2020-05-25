package com.bytedance.liko.leakdetector.p774a;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import com.bytedance.liko.leakdetector.C12279a;
import java.io.File;

/* renamed from: com.bytedance.liko.leakdetector.a.a */
public final class C12280a {

    /* renamed from: a */
    private static boolean f32393a;

    /* renamed from: b */
    private static File m24761b(Context context) {
        File file = new File(context.getFilesDir(), "leakcanary");
        if (m24760a(file)) {
            return file;
        }
        C12279a.m24757a("Could not create heap dump directory in app storage: [${storageDirectory.absolutePath}]");
        return null;
    }

    /* renamed from: c */
    private static boolean m24762c(Context context) {
        boolean z = true;
        if (VERSION.SDK_INT < 23 || f32393a) {
            return true;
        }
        if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        f32393a = z;
        return z;
    }

    /* renamed from: a */
    private static File m24758a(Context context) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        StringBuilder sb = new StringBuilder("leakcanary-");
        sb.append(context.getPackageName());
        File file = new File(externalStoragePublicDirectory, sb.toString());
        if (m24760a(file)) {
            return file;
        }
        C12279a.m24757a("Could not create heap dump directory in externalStorageDirectory: [${externalStorageDirectory.absolutePath}]");
        return null;
    }

    /* renamed from: a */
    private static boolean m24760a(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static File m24759a(boolean z, Context context) {
        File file;
        if (z || !m24762c(context)) {
            file = m24761b(context);
        } else {
            file = m24758a(context);
        }
        if (file != null) {
            return new File(file, ".dump.hporf");
        }
        return null;
    }
}
