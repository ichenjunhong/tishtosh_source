package com.aweme.storage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.aweme.storage.g */
public final class C2563g {
    /* renamed from: a */
    public static List<Entry<String, Long>> m7501a(Context context, List<String> list, List<String> list2) {
        File file;
        File file2;
        if (context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (context.getCacheDir() == null) {
            file = null;
        } else {
            file = context.getCacheDir().getParentFile();
        }
        m7502a(file, hashMap, list, C2561b.p.name(), list2);
        File cacheDir = context.getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(C2561b.p.name());
        sb.append("/cache");
        m7502a(cacheDir, hashMap, list, sb.toString(), list2);
        File filesDir = context.getFilesDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2561b.p.name());
        sb2.append("/files");
        m7502a(filesDir, hashMap, list, sb2.toString(), list2);
        try {
            if (context.getExternalCacheDir() == null) {
                file2 = null;
            } else {
                file2 = context.getExternalCacheDir().getParentFile();
            }
            m7502a(file2, hashMap, list, C2561b.e.name(), list2);
            File externalCacheDir = context.getExternalCacheDir();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C2561b.e.name());
            sb3.append("/cache");
            m7502a(externalCacheDir, hashMap, list, sb3.toString(), list2);
            File externalFilesDir = context.getExternalFilesDir(null);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C2561b.e.name());
            sb4.append("/files");
            m7502a(externalFilesDir, hashMap, list, sb4.toString(), list2);
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, new Comparator<Entry<String, Long>>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Long) ((Entry) obj2).getValue()).compareTo((Long) ((Entry) obj).getValue());
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private static void m7502a(File file, Map<String, Long> map, List<String> list, String str, List<String> list2) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isDirectory() && file2.getAbsolutePath() != null && (list == null || !list.contains(file2.getName()))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(File.separator);
                        sb.append(file2.getName());
                        String sb2 = sb.toString();
                        long a = (C2562f.m7492a(file2.getAbsolutePath()) / 1024) / 1024;
                        if (a >= 10 && !list2.contains(file2.getAbsolutePath())) {
                            map.put(sb2, Long.valueOf(a));
                            StringBuilder sb3 = new StringBuilder("full ");
                            sb3.append(sb2);
                            sb3.append(" ");
                            sb3.append(a);
                        }
                    }
                }
            }
        }
    }
}
