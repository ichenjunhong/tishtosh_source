package com.p683ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.LogReport */
public final class LogReport {
    private static volatile LogReport mInstance;
    private long mByteLogReport = NativeFunctions.nativeGetByteLogReport();

    private LogReport() {
    }

    public static void Release() {
        synchronized (LogReport.class) {
            mInstance = null;
        }
    }

    public static LogReport instance() {
        if (mInstance == null) {
            synchronized (LogReport.class) {
                if (mInstance == null) {
                    mInstance = new LogReport();
                }
            }
        }
        return mInstance;
    }

    public final void reportSDKSelfError(String str) {
        NativeFunctions.nativeReportSDKSelfError(this.mByteLogReport, str);
    }

    public final void reportRtcCamera(String str, boolean z, String str2) {
        NativeFunctions.nativeReportRtcCamera(this.mByteLogReport, str, z, str2);
    }

    public final void sdkAPICall(int i, String str, String str2) {
        NativeFunctions.nativeSdkAPICall(this.mByteLogReport, i, str, str2);
    }

    public final void sdkAPICallBack(int i, String str, String str2) {
        NativeFunctions.nativeSdkAPICallBack(this.mByteLogReport, i, str, str2);
    }
}
