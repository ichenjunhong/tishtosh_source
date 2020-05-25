package com.p683ss.android.ugc.aweme.utils;

import com.C2240a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.utils.at */
public final class C47684at {
    /* renamed from: b */
    public static String m103200b(File... fileArr) throws Exception {
        return m103199a((double) m103198a(fileArr));
    }

    /* renamed from: a */
    private static String m103199a(double d) {
        return C2240a.m6772a("%.2fMB", new Object[]{Double.valueOf(d / 1048576.0d)});
    }

    /* renamed from: a */
    public static long m103198a(File... fileArr) throws Exception {
        long j = 0;
        for (File listFiles : fileArr) {
            try {
                File[] listFiles2 = listFiles.listFiles();
                long j2 = j;
                int i = 0;
                while (i < listFiles2.length) {
                    try {
                        if (listFiles2[i].isDirectory()) {
                            j2 += m103198a(listFiles2[i]);
                        } else {
                            j2 += listFiles2[i].length();
                        }
                        i++;
                    } catch (Exception unused) {
                    }
                }
                j = j2;
            } catch (Exception unused2) {
            }
        }
        return j;
    }
}
