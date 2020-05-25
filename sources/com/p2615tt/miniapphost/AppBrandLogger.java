package com.p2615tt.miniapphost;

import android.text.TextUtils;
import com.google.gson.C17978g;
import com.google.gson.C18082l;
import com.google.gson.C18087q;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.tt.miniapphost.AppBrandLogger */
public class AppBrandLogger {
    private static Boolean isGsonSupport = null;
    private static ILogger sFeedbackLogger = null;
    private static ILogger sLogger = null;
    private static boolean sLoggerDisable = true;
    private static boolean sShowMoreLogInfo;

    /* renamed from: com.tt.miniapphost.AppBrandLogger$ILogger */
    public interface ILogger {
        void flush();

        void logD(String str, String str2);

        void logE(String str, String str2);

        void logE(String str, String str2, Throwable th);

        void logI(String str, String str2);

        void logW(String str, String str2);
    }

    public static boolean debug() {
        return sShowMoreLogInfo;
    }

    public static boolean isShowMoreLogInfo() {
        return sShowMoreLogInfo;
    }

    public static void flush() {
        if (sLogger != null) {
            sLogger.flush();
        }
    }

    private static void updateLoggerEnableState() {
        boolean z;
        if (sLogger == null && sFeedbackLogger == null) {
            z = true;
        } else {
            z = false;
        }
        sLoggerDisable = z;
    }

    public static void registerFeedbackLogger(ILogger iLogger) {
        sFeedbackLogger = iLogger;
        updateLoggerEnableState();
    }

    public static void registerLogger(ILogger iLogger) {
        sLogger = iLogger;
        updateLoggerEnableState();
    }

    private static String formatTag(String str) {
        if (str == null) {
            return "tma";
        }
        if (str.startsWith("tma_")) {
            return str;
        }
        StringBuilder sb = new StringBuilder("tma_");
        sb.append(str);
        return sb.toString();
    }

    public static void setShowMoreLogInfo(boolean z) {
        sShowMoreLogInfo = z;
        m111324i("AppBrandLogger", "setShowMoreLogInfo:", Boolean.valueOf(z));
    }

    public static String prettifyJson(String str) {
        if (isGsonSupport == Boolean.FALSE) {
            return str;
        }
        try {
            if (isGsonSupport == null) {
                Class.forName("com.google.gson.f");
                isGsonSupport = Boolean.TRUE;
            }
            str = new C17978g().mo34898b().mo34900d().mo34886a((C18082l) new C18087q().mo35029a(str).mo35009m());
        } catch (ClassNotFoundException unused) {
            isGsonSupport = Boolean.FALSE;
        } catch (Exception unused2) {
        }
        return str;
    }

    private static String createLog(Object[] objArr) {
        boolean z;
        if (objArr == null) {
            return "emptyLog";
        }
        int i = -1;
        StringBuilder sb = new StringBuilder();
        if (sShowMoreLogInfo) {
            String str = "unknown file";
            String str2 = "unknown";
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 2) {
                str = stackTrace[2].getFileName();
                str2 = stackTrace[2].getMethodName();
                i = stackTrace[2].getLineNumber();
            }
            int i2 = 3;
            while (true) {
                if (i2 >= 6 || stackTrace.length <= i2) {
                    z = true;
                } else if (TextUtils.equals(stackTrace[i2].getFileName(), "SandboxLogger.kt")) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            z = true;
            if (z) {
                sb.append(str2);
                sb.append("(");
                sb.append(str);
                sb.append(":");
                sb.append(i);
                sb.append(") ");
            }
        }
        for (Object obj : objArr) {
            sb.append(" ");
            if (obj != null) {
                sb.append(obj);
            } else {
                sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static void m111324i(String str, Object... objArr) {
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            String createLog = createLog(objArr);
            if (sLogger != null) {
                sLogger.logI(formatTag, createLog);
            }
            if (sFeedbackLogger != null) {
                sFeedbackLogger.logI(formatTag, createLog);
            }
        }
    }

    /* renamed from: w */
    public static void m111325w(String str, Object... objArr) {
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            String createLog = createLog(objArr);
            if (sLogger != null) {
                sLogger.logW(formatTag, createLog);
            }
            if (sFeedbackLogger != null) {
                sFeedbackLogger.logW(formatTag, createLog);
            }
        }
    }

    /* renamed from: d */
    public static void m111322d(String str, Object... objArr) {
        if (!sLoggerDisable) {
            if (sShowMoreLogInfo) {
                str = formatTag(str);
                String createLog = createLog(objArr);
                if (sLogger != null) {
                    sLogger.logD(str, createLog);
                }
            }
            if (sFeedbackLogger != null) {
                sFeedbackLogger.logD(formatTag(str), createLog(objArr));
            }
        }
    }

    /* renamed from: e */
    public static void m111323e(String str, Object... objArr) {
        boolean z;
        if (objArr == null || objArr.length <= 0 || !(objArr[objArr.length - 1] instanceof Throwable)) {
            z = false;
        } else {
            z = true;
        }
        if (sLoggerDisable) {
            if (sShowMoreLogInfo) {
                createLog(objArr);
            }
            return;
        }
        String formatTag = formatTag(str);
        String createLog = createLog(objArr);
        if (z) {
            eWithThrowable(formatTag, createLog, objArr[objArr.length - 1]);
            return;
        }
        if (sLogger != null) {
            sLogger.logE(formatTag, createLog);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.logE(formatTag, createLog);
        }
    }

    public static void eWithThrowable(String str, String str2, Throwable th) {
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            if (sLogger != null) {
                sLogger.logE(formatTag, str2, th);
            }
            if (sFeedbackLogger != null) {
                sFeedbackLogger.logE(formatTag, str2, th);
            }
        }
    }

    public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        int i2 = 0;
        if (sLoggerDisable) {
            if (sShowMoreLogInfo) {
                StringBuilder sb = new StringBuilder();
                if (stackTraceElementArr != null) {
                    int length = stackTraceElementArr.length;
                    while (i2 < length) {
                        sb.append(stackTraceElementArr[i2]);
                        sb.append("\n");
                        i2++;
                    }
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (stackTraceElementArr != null) {
            int length2 = stackTraceElementArr.length;
            while (i2 < length2) {
                sb2.append(stackTraceElementArr[i2]);
                sb2.append("\n");
                i2++;
            }
        }
        String sb3 = sb2.toString();
        if (sLogger != null) {
            sLogger.logE(formatTag(str), sb3);
        }
        if (sFeedbackLogger != null) {
            sFeedbackLogger.logE(formatTag(str), sb3);
        }
    }
}
