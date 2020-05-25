package com.bytedance.crash.p555n;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C9616k;
import java.io.File;

/* renamed from: com.bytedance.crash.n.m */
public final class C9705m {

    /* renamed from: a */
    private static String f26433a;

    /* renamed from: b */
    private static File f26434b;

    /* renamed from: c */
    private static File f26435c;

    /* renamed from: a */
    public static File m19390a() {
        if (f26434b == null) {
            return m19396c(C9616k.m19154f());
        }
        return f26434b;
    }

    /* renamed from: b */
    public static String m19395b() {
        StringBuilder sb = new StringBuilder("anr_");
        sb.append(C9616k.m19152d());
        return sb.toString();
    }

    /* renamed from: a */
    public static File m19392a(File file) {
        return new File(file, "dump.zip");
    }

    /* renamed from: b */
    public static File m19394b(File file) {
        return new File(file, "funnel.txt");
    }

    /* renamed from: c */
    public static File m19397c(File file) {
        return new File(file, "flog.txt");
    }

    /* renamed from: d */
    public static File m19399d(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: e */
    public static File m19401e(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: f */
    public static File m19402f(File file) {
        return new File(file, "maps.txt");
    }

    /* renamed from: g */
    public static File m19404g(File file) {
        return new File(file, "callback.json");
    }

    /* renamed from: h */
    public static File m19405h(File file) {
        return new File(file, "upload.json");
    }

    /* renamed from: i */
    public static File m19406i(File file) {
        return new File(file, "logcat.txt");
    }

    /* renamed from: j */
    public static File m19407j(File file) {
        return new File(file, "fds.txt");
    }

    /* renamed from: k */
    public static File m19408k(File file) {
        return new File(file, "threads.txt");
    }

    /* renamed from: l */
    public static File m19409l(File file) {
        return new File(file, "meminfo.txt");
    }

    /* renamed from: b */
    public static File m19393b(Context context) {
        return new File(m19403f(context), "CrashLogSimple");
    }

    /* renamed from: e */
    public static File m19400e(Context context) {
        return new File(m19403f(context), "alogCrash");
    }

    /* renamed from: a */
    public static File m19391a(Context context) {
        return new File(m19403f(context), "CrashLogJava");
    }

    /* renamed from: c */
    public static File m19396c(Context context) {
        if (f26434b == null) {
            if (context == null) {
                context = C9616k.m19154f();
            }
            f26434b = new File(m19403f(context), "CrashLogNative");
        }
        return f26434b;
    }

    /* renamed from: d */
    public static File m19398d(Context context) {
        if (f26435c == null) {
            f26435c = new File(m19403f(context), "ExternalLog");
        }
        return f26435c;
    }

    /* renamed from: f */
    public static String m19403f(Context context) {
        if (TextUtils.isEmpty(f26433a)) {
            try {
                f26433a = context.getFilesDir().getAbsolutePath();
            } catch (Exception unused) {
                f26433a = "/sdcard/";
            }
        }
        return f26433a;
    }
}
