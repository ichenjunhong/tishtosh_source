package com.bytedance.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.utils.m */
public final class C10166m {
    /* renamed from: a */
    public static Long m20492a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        Long l = null;
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        for (File name : listFiles) {
            try {
                long longValue = Long.valueOf(name.getName()).longValue();
                if (l == null) {
                    l = Long.valueOf(longValue);
                } else if (longValue > l.longValue()) {
                    l = Long.valueOf(longValue);
                }
            } catch (Exception unused) {
            }
        }
        return l;
    }

    /* renamed from: b */
    public static List<Long> m20493b(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File name : listFiles) {
            try {
                arrayList.add(Long.valueOf(Long.valueOf(name.getName()).longValue()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
