package com.bytedance.p829r;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.r.c */
public final class C12662c {

    /* renamed from: a */
    static List<C12660a> f33262a = new ArrayList();

    /* renamed from: b */
    private static long f33263b = 1024;

    /* renamed from: c */
    private static volatile C12666f<C12664d> f33264c;

    /* renamed from: b */
    public static List<C12660a> m25459b() {
        return f33262a;
    }

    /* renamed from: a */
    public static boolean m25456a() {
        if (f33264c == null || f33264c.mo23795a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m25454a(C12666f<C12664d> fVar) {
        f33264c = fVar;
    }

    /* renamed from: a */
    public static void m25453a(C12660a aVar) {
        synchronized (f33262a) {
            f33262a.add(aVar);
        }
    }

    /* renamed from: a */
    private static void m25455a(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: h */
    private static File m25465h(Context context) {
        try {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() >= ((C12664d) f33264c.mo23795a()).f33266a) {
                return cacheDir;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static File m25451a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        StringBuilder sb = new StringBuilder();
        sb.append(parentFile.getFreeSpace());
        sb.append(" ");
        sb.append(f33263b);
        if (parentFile.getFreeSpace() < f33263b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    /* renamed from: c */
    private static File m25460c(Context context) {
        File a = m25449a(context);
        if (a == null || !a.exists() || a.getFreeSpace() < ((C12664d) f33264c.mo23795a()).f33268c) {
            return null;
        }
        return a;
    }

    /* renamed from: d */
    private static File m25461d(Context context) {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir == null || !externalFilesDir.exists() || externalFilesDir.getFreeSpace() < ((C12664d) f33264c.mo23795a()).f33267b) {
                    return null;
                }
                return externalFilesDir;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    private static File m25462e(Context context) {
        try {
            File filesDir = context.getFilesDir();
            if (filesDir != null && filesDir.exists() && filesDir.getFreeSpace() >= ((C12664d) f33264c.mo23795a()).f33266a) {
                return filesDir;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: f */
    private static File m25463f(Context context) {
        File b = m25457b(context);
        if (b == null || !b.exists() || b.getFreeSpace() < ((C12664d) f33264c.mo23795a()).f33268c) {
            return null;
        }
        return b;
    }

    /* renamed from: g */
    private static File m25464g(Context context) {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null && externalCacheDir.getFreeSpace() >= ((C12664d) f33264c.mo23795a()).f33267b) {
                    return externalCacheDir;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static File m25449a(Context context) {
        File[] fileArr;
        C12661b a = C12661b.m25446a(context);
        if (a == null || !a.mo23793a() || TextUtils.isEmpty(a.f33260d)) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            try {
                fileArr = context.getExternalFilesDirs(null);
            } catch (Exception unused) {
                fileArr = null;
            }
            File a2 = m25452a(fileArr, context);
            if (a2 != null) {
                return a2;
            }
        }
        try {
            context.getExternalFilesDir(null);
            StringBuilder sb = new StringBuilder();
            sb.append(a.f33260d);
            sb.append("/Android/data/");
            sb.append(context.getPackageName());
            sb.append("/files");
            File file = new File(sb.toString());
            m25455a(file);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static File m25457b(Context context) {
        File[] fileArr;
        C12661b a = C12661b.m25446a(context);
        if (a == null || !a.mo23793a()) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            try {
                fileArr = context.getExternalCacheDirs();
            } catch (Exception unused) {
                fileArr = null;
            }
            File a2 = m25452a(fileArr, context);
            if (a2 != null) {
                return a2;
            }
        }
        try {
            context.getExternalCacheDir();
            StringBuilder sb = new StringBuilder();
            sb.append(a.f33260d);
            sb.append("/Android/data/");
            sb.append(context.getPackageName());
            sb.append("/cache");
            File file = new File(sb.toString());
            m25455a(file);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static File m25450a(Context context, C12665e eVar) {
        if (!m25456a()) {
            return null;
        }
        switch (eVar) {
            case PREFER_SD_CARD:
                File c = m25460c(context);
                if (c == null) {
                    c = m25461d(context);
                }
                if (c != null) {
                    return c;
                }
                break;
            case PREFER_EXTERNAL:
                File d = m25461d(context);
                if (d == null) {
                    d = m25460c(context);
                }
                if (d != null) {
                    return d;
                }
                break;
            case PREFER_PRIVATE:
                File e = m25462e(context);
                if (e == null) {
                    e = m25461d(context);
                }
                if (e != null) {
                    return e;
                }
                break;
        }
        return context.getFilesDir();
    }

    /* renamed from: b */
    public static File m25458b(Context context, C12665e eVar) {
        if (!m25456a()) {
            return null;
        }
        switch (eVar) {
            case PREFER_SD_CARD:
                File f = m25463f(context);
                if (f == null) {
                    f = m25464g(context);
                }
                if (f != null) {
                    return f;
                }
                break;
            case PREFER_EXTERNAL:
                File g = m25464g(context);
                if (g == null) {
                    g = m25463f(context);
                }
                if (g != null) {
                    return g;
                }
                break;
            case PREFER_PRIVATE:
                File h = m25465h(context);
                if (h == null) {
                    h = m25464g(context);
                }
                if (h != null) {
                    return h;
                }
                break;
        }
        return context.getCacheDir();
    }

    /* renamed from: a */
    private static File m25452a(File[] fileArr, Context context) {
        if (fileArr == null) {
            return null;
        }
        C12661b a = C12661b.m25446a(context);
        if (a == null || !a.mo23793a() || TextUtils.isEmpty(a.f33260d)) {
            return null;
        }
        for (File file : fileArr) {
            if (!(file == null || file.getPath() == null || !file.getPath().contains(a.f33260d))) {
                m25455a(file);
                if (file.exists()) {
                    return file;
                }
            }
        }
        return null;
    }
}
