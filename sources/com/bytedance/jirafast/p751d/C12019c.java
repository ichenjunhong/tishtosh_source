package com.bytedance.jirafast.p751d;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.jirafast.models.JIRADevice;

/* renamed from: com.bytedance.jirafast.d.c */
public class C12019c {

    /* renamed from: a */
    public static JIRADevice f31793a;

    /* renamed from: a */
    public static String m24431a() {
        return VERSION.RELEASE;
    }

    /* renamed from: b */
    public static String m24432b(Context context) {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSize = (long) statFs.getBlockSize();
        long blockCount = ((long) statFs.getBlockCount()) * blockSize;
        long availableBlocks = blockSize * ((long) statFs.getAvailableBlocks());
        StringBuilder sb = new StringBuilder("SD卡总大小: ");
        sb.append(Formatter.formatFileSize(context, blockCount));
        sb.append("\nsd卡剩余容量: ");
        sb.append(Formatter.formatFileSize(context, availableBlocks));
        return sb.toString();
    }

    /* renamed from: a */
    public static JIRADevice m24430a(Context context) {
        if (f31793a == null) {
            synchronized (C12019c.class) {
                if (f31793a == null) {
                    JIRADevice jIRADevice = new JIRADevice();
                    f31793a = jIRADevice;
                    jIRADevice.f31848a = "Android";
                    f31793a.f31849b = Build.BRAND;
                    f31793a.f31850c = Build.MODEL;
                    if (VERSION.SDK_INT >= 17) {
                        JIRADevice jIRADevice2 = f31793a;
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                        int i = displayMetrics.heightPixels;
                        int i2 = displayMetrics.widthPixels;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        sb.append("*");
                        sb.append(i2);
                        jIRADevice2.f31852e = sb.toString();
                    }
                }
            }
        }
        f31793a.f31851d = m24431a();
        return f31793a;
    }

    /* renamed from: c */
    public static String m24433c(Context context) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        StringBuilder sb = new StringBuilder("最大分配内存: ");
        sb.append(Formatter.formatFileSize(context, maxMemory));
        sb.append("\n当前总分配内存: ");
        sb.append(Formatter.formatFileSize(context, j));
        sb.append("\n剩余内存: ");
        sb.append(Formatter.formatFileSize(context, freeMemory));
        return sb.toString();
    }
}
