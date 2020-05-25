package com.p683ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.FileInputStream;
import java.io.IOException;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.aweme.utils.ax */
public final class C47699ax {
    /* renamed from: a */
    public static final long m103233a(Context context) {
        FileInputStream fileInputStream;
        C52711k.m112240b(context, "c");
        if (VERSION.SDK_INT >= 16) {
            MemoryInfo memoryInfo = new MemoryInfo();
            Object systemService = context.getSystemService("activity");
            if (systemService != null) {
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                return memoryInfo.totalMem;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.ActivityManager");
        }
        long j = -1;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            j = ((long) m103232a("MemTotal", fileInputStream)) * 1024;
            fileInputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        return j;
    }

    /* renamed from: a */
    private static final int m103232a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != ((byte) str.charAt(i3))) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, i2, i4 - i2, C52808d.f131043a));
                                }
                                i2++;
                            }
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
