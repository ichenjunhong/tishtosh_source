package com.p683ss.android.p1147d;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import java.io.File;
import java.util.Set;

/* renamed from: com.ss.android.d.g */
public final class C18945g {
    /* renamed from: b */
    private static void m46119b(String str) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m46119b(listFiles[i].getAbsolutePath());
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static String m46116a(Context context) throws NullPointerException {
        String str;
        if (context != null) {
            try {
                if (context.getCacheDir() != null) {
                    str = context.getCacheDir().getPath();
                } else {
                    StringBuilder sb = new StringBuilder("/data/data/");
                    sb.append(context.getPackageName());
                    sb.append("/cache/");
                    File dir = context.getDir(sb.toString(), 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!C9431p.m18664a(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Cache Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    /* renamed from: a */
    public static void m46117a(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m46119b(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    /* renamed from: a */
    public static long m46115a(File file, boolean z) {
        File[] listFiles;
        long j = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j += m46115a(file2, z);
                } else if (file2.isFile()) {
                    j += file2.length();
                }
            }
            return j;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m46120b(String str, Set<String> set) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m46120b(listFiles[i].getAbsolutePath(), set);
                } else {
                    String name = listFiles[i].getName();
                    if (set == null || !set.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m46118a(String str, Set<String> set) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m46120b(listFiles[i].getAbsolutePath(), set);
                } else if (listFiles[i].isFile()) {
                    String name = listFiles[i].getName();
                    if (set == null || !set.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }
}
