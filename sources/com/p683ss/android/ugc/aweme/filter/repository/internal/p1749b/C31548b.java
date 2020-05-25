package com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b;

import android.text.TextUtils;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.b.b */
public final class C31548b {
    /* renamed from: a */
    public static final String m73412a(String str) {
        C52711k.m112240b(str, "filterDir");
        String str2 = "";
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return str2;
            }
            String str3 = str2;
            for (File file2 : listFiles) {
                if (file2 != null && file2.isDirectory()) {
                    String name = file2.getName();
                    File[] listFiles2 = file2.listFiles();
                    if (listFiles2 != null) {
                        int length = listFiles2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            File file3 = listFiles2[i];
                            if (file3 != null && file3.isFile()) {
                                String name2 = file3.getName();
                                StringBuilder sb = new StringBuilder();
                                sb.append(name);
                                sb.append(".png");
                                if (C52711k.m112239a((Object) name2, (Object) sb.toString())) {
                                    str3 = file3.getAbsolutePath();
                                    C52711k.m112236a((Object) str3, "filterPathChild.absolutePath");
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                }
            }
            str2 = str3;
        }
        return str2;
    }

    /* renamed from: b */
    public static final String m73413b(String str) {
        C52711k.m112240b(str, "pngFile");
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            File parentFile = file.getParentFile().getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
                str2 = parentFile.getAbsolutePath();
                C52711k.m112236a((Object) str2, "p.absolutePath");
            }
        }
        return str2;
    }
}
