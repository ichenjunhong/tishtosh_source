package com.bytedance.realx.base;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.PrintWriter;
import java.io.StringWriter;

public class RXLogging {
    private static Severity loggableSeverity = null;
    private static volatile boolean loggingEnabled = true;

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(NormalGiftView.ALPHA_255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(UnReadVideoExperiment.BROWSE_RECORD_LIST),
        TRACE_TIMER(UnReadVideoExperiment.LIKE_USER_LIST),
        TRACE_STREAM(PreloadTask.BYTE_UNIT_NUMBER),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(VideoCacheReadBuffersizeExperiment.DEFAULT),
        TRACE_ALL(65535);
        
        public final int level;

        private TraceLevel(int i) {
            this.level = i;
        }
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (RXLogging.class) {
            nativeEnableLogToDebugOutput(severity.ordinal());
            loggingEnabled = true;
        }
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        C17840a.m43751a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public static void m25467d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    /* renamed from: e */
    public static void m25468e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    /* renamed from: v */
    public static void m25470v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* renamed from: w */
    public static void m25471w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    /* renamed from: e */
    public static void m25469e(String str, String str2, Throwable th) {
        log(Severity.LS_ERROR, str, str2);
        log(Severity.LS_ERROR, str, th.toString());
        log(Severity.LS_ERROR, str, getStackTraceString(th));
    }

    public static void log(Severity severity, String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        }
    }

    /* renamed from: w */
    public static void m25472w(String str, String str2, Throwable th) {
        log(Severity.LS_WARNING, str, str2);
        log(Severity.LS_WARNING, str, th.toString());
        log(Severity.LS_WARNING, str, getStackTraceString(th));
    }
}
