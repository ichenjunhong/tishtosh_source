package com.ttnet.org.chromium.base;

import com.taobao.android.dexposed.ClassUtils;

public class Logger {
    static int mLevel = 4;

    /* renamed from: d */
    public static void m111346d(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: d */
    public static void m111347d(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    /* renamed from: e */
    public static void m111349e(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: e */
    public static void m111350e(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static int getLogLevel() {
        return mLevel;
    }

    /* renamed from: i */
    public static void m111352i(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: i */
    public static void m111353i(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    /* renamed from: v */
    public static void m111356v(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: v */
    public static void m111357v(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    /* renamed from: w */
    public static void m111359w(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: w */
    public static void m111360w(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    /* renamed from: d */
    public static void m111345d(String str) {
        m111346d("Logger", str);
    }

    /* renamed from: e */
    public static void m111348e(String str) {
        m111349e("Logger", str);
    }

    /* renamed from: i */
    public static void m111351i(String str) {
        m111352i("Logger", str);
    }

    /* renamed from: v */
    public static void m111355v(String str) {
        m111356v("Logger", str);
    }

    /* renamed from: w */
    public static void m111358w(String str) {
        m111359w("Logger", str);
    }

    public static void alertErrorInfo(String str) {
        if (debug()) {
            throw new IllegalStateException(str);
        }
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void throwException(Throwable th) {
        if (th != null && debug()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }

    /* renamed from: st */
    public static void m111354st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                if (i2 > 1) {
                    sb.append("\n");
                }
                sb.append(getSimpleClassName(stackTrace[i2].getClassName()));
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTrace[i2].getMethodName());
            }
            m111356v(str, sb.toString());
        }
    }
}
