package com.appsflyer;

import com.C2240a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {

    /* renamed from: ˏ */
    private static long f7699 = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ˊ */
        private int f7701;

        public final int getLevel() {
            return this.f7701;
        }

        private LogLevel(int i) {
            this.f7701 = i;
        }
    }

    public static void resetDeltaTime() {
        f7699 = System.currentTimeMillis();
    }

    public static void afWarnLog(String str) {
        m7261(str);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    /* renamed from: ˏ */
    static void m7263(String str) {
        AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
        C2537s.m7429().mo7040("F", str);
    }

    public static void afDebugLog(String str) {
        LogLevel.DEBUG.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C2537s.m7429().mo7040("D", m7260(str, true));
    }

    public static void afRDLog(String str) {
        LogLevel.VERBOSE.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C2537s.m7429().mo7040("V", m7260(str, true));
    }

    /* renamed from: ˎ */
    static void m7261(String str) {
        LogLevel.WARNING.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C2537s.m7429().mo7040("W", m7260(str, true));
    }

    /* renamed from: ˋ */
    private static String m7259(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        return C2240a.m6773a(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds)))});
    }

    public static void afErrorLog(String str, Throwable th) {
        m7262(str, th, false);
    }

    public static void afInfoLog(String str, boolean z) {
        LogLevel.INFO.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        if (z) {
            C2537s.m7429().mo7040("I", m7260(str, true));
        }
    }

    /* renamed from: ˎ */
    private static String m7260(String str, boolean z) {
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(m7259(System.currentTimeMillis() - f7699));
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ˎ */
    private static void m7262(String str, Throwable th, boolean z) {
        LogLevel.ERROR.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C2537s.m7429().mo7045(th);
    }
}
