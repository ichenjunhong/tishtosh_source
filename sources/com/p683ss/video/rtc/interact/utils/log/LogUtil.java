package com.p683ss.video.rtc.interact.utils.log;

import com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel;

/* renamed from: com.ss.video.rtc.interact.utils.log.LogUtil */
public class LogUtil {
    static IInteractLogger sLogger;

    public static void setLogger(IInteractLogger iInteractLogger) {
        sLogger = iInteractLogger;
    }

    /* renamed from: d */
    public static void m110870d(String str, String str2) {
        if (sLogger != null) {
            sLogger.onLogMessage(LogLevel.debug, str, str2);
        }
    }

    /* renamed from: e */
    public static void m110871e(String str, String str2) {
        if (sLogger != null) {
            sLogger.onLogMessage(LogLevel.error, str, str2);
        }
    }

    /* renamed from: i */
    public static void m110872i(String str, String str2) {
        if (sLogger != null) {
            sLogger.onLogMessage(LogLevel.info, str, str2);
        }
    }

    /* renamed from: v */
    public static void m110873v(String str, String str2) {
        if (sLogger != null) {
            sLogger.onLogMessage(LogLevel.verbose, str, str2);
        }
    }

    /* renamed from: w */
    public static void m110874w(String str, String str2) {
        if (sLogger != null) {
            sLogger.onLogMessage(LogLevel.warning, str, str2);
        }
    }

    public static void localLog(LogLevel logLevel, String str, String str2, Throwable th) {
        if (sLogger != null) {
            sLogger.onLocalLogMessage(logLevel, str, str2, th);
        }
    }
}
