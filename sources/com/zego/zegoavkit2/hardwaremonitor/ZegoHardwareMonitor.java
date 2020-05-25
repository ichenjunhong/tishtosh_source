package com.zego.zegoavkit2.hardwaremonitor;

import android.content.Context;
import android.os.Process;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public final class ZegoHardwareMonitor {
    public static double getSystemCPUUsage() {
        return ZegoCPUUtils.getSystemCPUUsage();
    }

    public static double getProcessCPUUsage() {
        return ZegoCPUUtils.getProcessCPUUsage(Process.myPid());
    }

    public static double getMEMTotal(Context context) {
        return (double) ZegoMEMUtils.getMemInfo()[0];
    }

    public static double getMEMUsage(Context context) {
        double d = (double) ZegoMEMUtils.getPSS(context, Process.myPid())[2];
        Double.isNaN(d);
        return d / 1024.0d;
    }

    public static double getSystemMEMUsage(Context context) {
        long[] memInfo = ZegoMEMUtils.getMemInfo();
        double d = (double) memInfo[0];
        double d2 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        for (int i = 1; i < memInfo.length; i++) {
            double d3 = (double) memInfo[i];
            Double.isNaN(d3);
            d2 += d3;
        }
        Double.isNaN(d);
        return d - d2;
    }
}
