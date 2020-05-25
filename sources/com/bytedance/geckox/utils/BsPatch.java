package com.bytedance.geckox.utils;

import java.io.File;
import java.io.FileNotFoundException;

public class BsPatch {
    private static native int patch(String str, String str2, String str3) throws Exception;

    static {
        C10159g.m20484a("geckox_bspatch");
    }

    /* renamed from: a */
    public static void m20465a(File file, File file2, File file3, String str) throws Exception {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("全量包不存在：");
            sb.append(file.getAbsolutePath());
            throw new FileNotFoundException(sb.toString());
        } else if (file2.exists()) {
            file3.mkdirs();
            File file4 = new File(file3, str);
            file4.delete();
            int patch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
            if (patch != 0) {
                StringBuilder sb2 = new StringBuilder("patch合成失败 code：");
                sb2.append(patch);
                sb2.append(" full:");
                sb2.append(file.getAbsolutePath());
                sb2.append(" patch:");
                sb2.append(file2.getAbsolutePath());
                sb2.append(" dest:");
                sb2.append(file4.getAbsolutePath());
                throw new RuntimeException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("patch包不存在：");
            sb3.append(file2.getAbsolutePath());
            throw new FileNotFoundException(sb3.toString());
        }
    }
}
