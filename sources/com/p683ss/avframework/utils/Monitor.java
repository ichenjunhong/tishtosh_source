package com.p683ss.avframework.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.avframework.engine.MediaEngineFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.Monitor */
public class Monitor {
    private static boolean sEnableCPULoadWithTop = false;
    private static boolean sInitLogDone = false;
    private static TEBundle sMonitorDataBase = new TEBundle();

    protected static native void nativeDisableLogFile(boolean z);

    protected static native double nativeGetAppPrecentageOnCPU();

    protected static native long nativeGetAppRSSKB();

    protected static native long nativeGetAppVSSKB();

    protected static native double nativeGetCPUPrecentage();

    protected static native double nativeGetSystemPrecentageOnCPU();

    protected static native double nativeGetUserPrecentageOnCPU();

    protected static native boolean nativeInitLogFile(String str, int i);

    protected static native boolean nativeIsDisableLogFile();

    protected static native void nativeWriteLog(String str, int i, String str2);

    public Monitor() {
        MediaEngineFactory.getVersion();
    }

    protected static boolean isDisableLogFile() {
        return nativeIsDisableLogFile();
    }

    public long getAppRSSKB() {
        return nativeGetAppRSSKB();
    }

    public long getAppVSSKB() {
        return nativeGetAppVSSKB();
    }

    public double getAppPrecentageOnCPU() {
        return nativeGetAppPrecentageOnCPU() * 100.0d;
    }

    public double getCPUPrecentage() {
        return nativeGetCPUPrecentage() * 100.0d;
    }

    public double getSystemPrecentageOnCPU() {
        return nativeGetSystemPrecentageOnCPU() * 100.0d;
    }

    public double getUserPrecentageOnCPU() {
        return nativeGetUserPrecentageOnCPU() * 100.0d;
    }

    protected static void disableLogFile(boolean z) {
        nativeDisableLogFile(z);
    }

    public static void enableCPULoadStaticsWithTop(boolean z) {
        sEnableCPULoadWithTop = z;
    }

    private static TEBundle staticsCPUInfoOnTop(long j) {
        double d;
        double d2;
        double d3;
        double d4;
        int i;
        String[] split;
        String[] split2;
        if (VERSION.SDK_INT < 26 || !sEnableCPULoadWithTop) {
            return null;
        }
        StringBuilder sb = new StringBuilder("top -d 1 -n 1 -p ");
        sb.append(j);
        sb.append(" -o \"PID,%CPU\" |grep '^[1-9]'");
        String sb2 = sb.toString();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            char c = 0;
            Process exec = Runtime.getRuntime().exec(new String[]{"sh", "-c", sb2});
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            d4 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            d3 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            d2 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split3 = readLine.trim().split("\\s+");
                    if (split3 == null || split3.length <= 4) {
                        if (d2 > ProfileUiInitOptimizeEnterThreshold.DEFAULT && split3 != null) {
                            if (split3[0].equals(String.valueOf(j))) {
                                if (split3.length > 1) {
                                    d = Double.valueOf(split3[1]).doubleValue() / d2;
                                }
                                c = 0;
                            }
                        }
                        c = 0;
                    } else {
                        String[] split4 = split3[c].split("%");
                        if (split4 != null && split4.length > 1 && split4[1].equals("cpu")) {
                            double doubleValue = Double.valueOf(split4[0]).doubleValue();
                            if (doubleValue < 100.0d) {
                                i = 1;
                                d2 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                                split = split3[i].split("%");
                                if (d2 > ProfileUiInitOptimizeEnterThreshold.DEFAULT && split != null && split.length > i && split[i].equals("user")) {
                                    d4 = Double.valueOf(split[0]).doubleValue() / d2;
                                }
                                split2 = split3[1].split("%");
                                if (d2 > ProfileUiInitOptimizeEnterThreshold.DEFAULT && split2 != null && split2.length > 1 && split2[1].equals("sys")) {
                                    d3 = Double.valueOf(split2[0]).doubleValue() / d2;
                                }
                                c = 0;
                            } else {
                                d2 = doubleValue;
                            }
                        }
                        i = 1;
                        split = split3[i].split("%");
                        d4 = Double.valueOf(split[0]).doubleValue() / d2;
                        split2 = split3[1].split("%");
                        d3 = Double.valueOf(split2[0]).doubleValue() / d2;
                        c = 0;
                    }
                } catch (IOException | InterruptedException unused) {
                }
            }
            exec.waitFor();
            bufferedReader.close();
        } catch (IOException | InterruptedException unused2) {
            d4 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            d3 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            d2 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        double d5 = d;
        sMonitorDataBase.setDouble("cpu", d2);
        sMonitorDataBase.setDouble("userCpu", d4);
        sMonitorDataBase.setDouble("sysCpu", d3);
        sMonitorDataBase.setDouble("appCpu", d5);
        sMonitorDataBase.setLong("costMs", System.currentTimeMillis() - currentTimeMillis);
        return sMonitorDataBase;
    }

    protected static void initLogFile(Context context, int i) {
        if (context != null) {
            if (sInitLogDone) {
                nativeInitLogFile("", i);
                return;
            }
            String str = null;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                if (!externalFilesDir.exists()) {
                    try {
                        externalFilesDir.createNewFile();
                    } catch (IOException unused) {
                    }
                }
                if (externalFilesDir.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(externalFilesDir.getAbsolutePath());
                    sb.append("/live_core.bin");
                    String sb2 = sb.toString();
                    File file = new File(sb2);
                    if (file.exists()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(externalFilesDir.getAbsolutePath());
                        sb3.append("/live_core.old.bin");
                        try {
                            file.renameTo(new File(sb3.toString()));
                        } catch (Throwable unused2) {
                        }
                        file = new File(sb2);
                    }
                    if (!file.exists()) {
                        try {
                            file.createNewFile();
                        } catch (IOException unused3) {
                        }
                    }
                    str = sb2;
                }
                if (!TextUtils.isEmpty(str)) {
                    sInitLogDone = nativeInitLogFile(str, i);
                }
            }
        }
    }

    public static void writeLog(String str, int i, String str2) {
        nativeWriteLog(str, i, str2);
    }
}
