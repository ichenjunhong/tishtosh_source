package com.p683ss.ugc.live.p2595a.p2596a.p2601e;

import java.io.File;

/* renamed from: com.ss.ugc.live.a.a.e.b */
public final class C51586b {
    /* renamed from: a */
    public static String m110734a(String str) {
        if (C51587c.m110737a(str) || str.endsWith(File.separator)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: b */
    public static File m110736b(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".tmp");
            return new File(sb.toString());
        }
        throw new IllegalArgumentException("file is null");
    }

    /* renamed from: a */
    public static void m110735a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                file.delete();
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m110735a(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        }
    }
}
