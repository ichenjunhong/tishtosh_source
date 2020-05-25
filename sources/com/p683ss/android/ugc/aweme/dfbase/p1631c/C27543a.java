package com.p683ss.android.ugc.aweme.dfbase.p1631c;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.dfbase.c.a */
public final class C27543a {
    /* renamed from: b */
    public static String m66207b() {
        return m66205a(m66206a(Environment.getDataDirectory()));
    }

    /* renamed from: a */
    public static int m66204a() {
        try {
            if ((C11010c.m22280a().getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static String m66208c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return m66205a(m66206a(Environment.getExternalStorageDirectory()));
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    private static String m66205a(long[] jArr) {
        if (jArr == null || jArr.length != 2) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jArr[0]);
        sb.append(" / ");
        sb.append(jArr[1]);
        return sb.toString();
    }

    /* renamed from: a */
    private static long[] m66206a(File file) {
        try {
            long[] jArr = new long[2];
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                jArr[0] = statFs.getAvailableBytes();
                jArr[1] = statFs.getTotalBytes();
            } else {
                long blockSize = (long) statFs.getBlockSize();
                long blockCount = (long) statFs.getBlockCount();
                jArr[0] = ((long) statFs.getAvailableBlocks()) * blockSize;
                jArr[1] = blockSize * blockCount;
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }
}
