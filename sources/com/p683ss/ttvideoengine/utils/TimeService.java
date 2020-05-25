package com.p683ss.ttvideoengine.utils;

import android.content.Context;
import android.os.SystemClock;
import com.p683ss.ttvideoengine.net.NetUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.ttvideoengine.utils.TimeService */
public class TimeService {
    public static int mErrorCount = 0;
    private static boolean mForceUseLocalTime = true;
    public static int mState = 0;
    public static TimeInfo mTimeInfo = new TimeInfo();

    /* renamed from: com.ss.ttvideoengine.utils.TimeService$TimeInfo */
    static class TimeInfo {
        public long mLocalTime = -1;
        public long mNtpTime = -1;

        TimeInfo() {
        }

        public boolean isUpdated() {
            if (this.mNtpTime > 0) {
                return true;
            }
            return false;
        }
    }

    public static boolean isUpdated() {
        synchronized (TimeService.class) {
            if (mTimeInfo == null) {
                return false;
            }
            boolean isUpdated = mTimeInfo.isUpdated();
            return isUpdated;
        }
    }

    public static long currentTimeMillis() {
        if (!mForceUseLocalTime) {
            synchronized (TimeService.class) {
                if (mTimeInfo != null && mTimeInfo.isUpdated()) {
                    long elapsedRealtime = (mTimeInfo.mNtpTime + SystemClock.elapsedRealtime()) - mTimeInfo.mLocalTime;
                    return elapsedRealtime;
                }
            }
        }
        return System.currentTimeMillis();
    }

    public static void setForceUseLocalTime(boolean z) {
        StringBuilder sb = new StringBuilder("force use localtime:");
        sb.append(z);
        TTVideoEngineLog.m110644d("TimeService", sb.toString());
        mForceUseLocalTime = z;
    }

    public static void updateTimeFromNTP(final Context context) {
        if (!mForceUseLocalTime) {
            synchronized (TimeService.class) {
                if (mTimeInfo != null && mTimeInfo.isUpdated()) {
                    return;
                }
                if (context != null && !NetUtils.isNetAvailable(context)) {
                    TTVideoEngineLog.m110644d("TimeService", "network unavailable");
                } else if (mState == 0) {
                    mState = 1;
                    if (mErrorCount <= 6) {
                        EngineThreadPool.addExecuteTask(new Runnable() {
                            public final void run() {
                                SntpClient sntpClient = new SntpClient();
                                boolean requestTime = sntpClient.requestTime("time1.bytedance.com", 10000);
                                synchronized (TimeService.class) {
                                    if (requestTime) {
                                        try {
                                            if (TimeService.mTimeInfo != null) {
                                                TimeService.mTimeInfo.mNtpTime = sntpClient.getNtpTime();
                                                TimeService.mTimeInfo.mLocalTime = sntpClient.getNtpTimeReference();
                                                TimeService.mState = 2;
                                                StringBuilder sb = new StringBuilder("NTP updated time:");
                                                sb.append(TimeService.longToStringWithFormat((TimeService.mTimeInfo.mNtpTime + SystemClock.elapsedRealtime()) - TimeService.mTimeInfo.mLocalTime, "yyyy-MM-dd HH:mm:ss.SSS"));
                                                TTVideoEngineLog.m110644d("TimeService", sb.toString());
                                            }
                                        } finally {
                                        }
                                    } else {
                                        if (context != null && NetUtils.isNetAvailable(context)) {
                                            TimeService.mErrorCount++;
                                        }
                                        StringBuilder sb2 = new StringBuilder("NTP update fail,error count:");
                                        sb2.append(TimeService.mErrorCount);
                                        TTVideoEngineLog.m110644d("TimeService", sb2.toString());
                                        TimeService.mState = 0;
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public static String longToStringWithFormat(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }
}
