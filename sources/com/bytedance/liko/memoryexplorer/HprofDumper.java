package com.bytedance.liko.memoryexplorer;

import com.C2240a;
import com.bytedance.liko.memoryexplorer.util.FileUtils;
import com.bytedance.liko.memoryexplorer.util.ProcessUtil;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HprofDumper {
    public static final DateFormat DATE_FORMAT;
    public static String sDate;

    private HprofDumper() {
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        DATE_FORMAT = simpleDateFormat;
        sDate = simpleDateFormat.format(new Date());
    }

    private static File dumpAndPullHprof(MemoryConfig memoryConfig) throws InterruptedException {
        String str = "";
        sDate = DATE_FORMAT.format(new Date());
        if (!memoryConfig.dumpSelf) {
            str = C2240a.m6772a("%s_dump.hprof", new Object[]{sDate});
            StringBuilder sb = new StringBuilder("/data/local/tmp/");
            sb.append(str);
            String sb2 = sb.toString();
            ProcessUtil.executeCommand(C2240a.m6772a(" shell am dumpheap %s %s", new Object[]{memoryConfig.packageName, sb2}));
            Thread.sleep(15000);
            StringBuilder sb3 = new StringBuilder(" pull ");
            sb3.append(sb2);
            sb3.append(" ");
            sb3.append(FileUtils.getHeapDumpDir().getAbsolutePath());
            ProcessUtil.executeCommand(sb3.toString());
        } else {
            Thread.sleep(15000);
            StringBuilder sb4 = new StringBuilder("/sdcard/Android/data/");
            sb4.append(memoryConfig.packageName);
            sb4.append("/memoryexplorer.hprof");
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder(" pull ");
            sb6.append(sb5);
            sb6.append(" ");
            sb6.append(FileUtils.getHeapDumpDir().getAbsolutePath());
            ProcessUtil.executeCommand(sb6.toString());
        }
        Thread.sleep(30000);
        if (memoryConfig.dumpSelf) {
            str = C2240a.m6772a("%s_dump.hprof", new Object[]{sDate});
            new File(FileUtils.getHeapDumpDir().getAbsolutePath(), "/memoryexplorer.hprof").renameTo(new File(FileUtils.getHeapDumpDir().getAbsolutePath(), str));
        }
        try {
            FileUtils.copyFile(new File(FileUtils.getHeapDumpDir().getAbsolutePath(), str), new File(FileUtils.getHeapDumpCacheDir().getAbsolutePath(), str));
        } catch (IOException unused) {
        }
        return new File(FileUtils.getHeapDumpDir().getAbsolutePath(), str);
    }

    static File tryDumpHprof(MemoryConfig memoryConfig, boolean z) throws InterruptedException {
        if (z && memoryConfig.canRunMonkey()) {
            StringBuilder sb = new StringBuilder(" shell dumpsys meminfo ");
            sb.append(memoryConfig.packageName);
            ProcessUtil.executeCommand(sb.toString());
            ProcessUtil.executeCommand(C2240a.m6772a(" shell am start -n %s/%s", new Object[]{memoryConfig.packageName, memoryConfig.mainActivity}));
            Thread.sleep(3000);
        }
        return dumpAndPullHprof(memoryConfig);
    }
}
