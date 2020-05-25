package com.p683ss.video.rtc.interact.utils.log;

/* renamed from: com.ss.video.rtc.interact.utils.log.IInteractLogger */
public interface IInteractLogger {

    /* renamed from: com.ss.video.rtc.interact.utils.log.IInteractLogger$LogLevel */
    public enum LogLevel {
        verbose,
        debug,
        info,
        warning,
        error
    }

    void onLocalLogMessage(LogLevel logLevel, String str, String str2, Throwable th);

    void onLogMessage(LogLevel logLevel, String str, String str2);
}
