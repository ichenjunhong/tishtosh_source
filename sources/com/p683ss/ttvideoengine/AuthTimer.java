package com.p683ss.ttvideoengine;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.ttvideoengine.utils.TTHelper;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.AuthTimer */
public class AuthTimer {
    public static String PATTERN_HTTP_DATE = "EEE, dd MMM yyy hh:mm:ss";
    public static String PATTERN_STS_EXPIRED_TIME = "yyyy-MM-dd'T'HH:mm:ssXXX";
    public static String PATTERN_STS_SERVER_TIME = "yyyyMMdd'T'HHmmss'Z'";
    public static AuthTimer mInstance;
    private int TIMEOUT_UPDATE_THRESHOLD_MILLI = 600000;
    private int mContinuousExpCount;
    private Handler mHandler;
    public AuthTimerListener mListener;
    private volatile Map<String, Runnable> mRunnableMap;
    private volatile Map<String, STSAuth> mSTSAuthMap;
    private volatile TimeCalibration mTimeCalibration;

    /* renamed from: com.ss.ttvideoengine.AuthTimer$AuthTimerListener */
    public interface AuthTimerListener {
        void onAuthExpired(AuthTimer authTimer, String str);
    }

    /* renamed from: com.ss.ttvideoengine.AuthTimer$MyRunnable */
    class MyRunnable implements Runnable {
        private String projectTagStr;

        public void run() {
            if (AuthTimer.this.mListener != null) {
                AuthTimer.this.mListener.onAuthExpired(AuthTimer.mInstance, this.projectTagStr);
            }
        }

        public MyRunnable(String str) {
            this.projectTagStr = str;
        }
    }

    /* renamed from: com.ss.ttvideoengine.AuthTimer$STSAuth */
    public static class STSAuth {
        public String AuthAK;
        public String AuthExpiredTime;
        public long AuthExpiredTimeInLong = -1;
        public String AuthSK;
        public String AuthSessionToken;
        public long CurLocalTimeInLong = -1;
        public String CurServerTime;
        public long CurServerTimeInLong = -1;

        public long getServerTime() {
            if (this.CurServerTimeInLong > 0) {
                return (System.currentTimeMillis() - this.CurLocalTimeInLong) + this.CurServerTimeInLong;
            }
            return -1;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("AccessKeyId", this.AuthAK);
                jSONObject.put("SecretAccessKey", this.AuthSK);
                jSONObject.put("SessionToken", this.AuthSessionToken);
                jSONObject.put("ExpiredTime", this.AuthExpiredTime);
                jSONObject.put("CurTime", this.CurServerTime);
            } catch (JSONException e) {
                TTVideoEngineLog.m110645d(e);
            }
            return jSONObject.toString();
        }

        public STSAuth(String str, String str2, String str3, String str4, String str5) {
            this.AuthAK = str;
            this.AuthSK = str2;
            this.AuthSessionToken = str3;
            this.AuthExpiredTime = str4;
            this.AuthExpiredTimeInLong = AuthTimer.getMilliSeconds(this.AuthExpiredTime, AuthTimer.PATTERN_STS_EXPIRED_TIME);
            this.CurServerTime = str5;
            this.CurServerTimeInLong = AuthTimer.getMilliSeconds(str5, AuthTimer.PATTERN_STS_EXPIRED_TIME);
            this.CurLocalTimeInLong = System.currentTimeMillis();
        }
    }

    /* renamed from: com.ss.ttvideoengine.AuthTimer$TimeCalibration */
    public class TimeCalibration {
        public boolean isCalibrated;
        public long localTimeToCali = -1;
        public long serverTimeToCali = -1;

        public long getServerTime() {
            if (this.isCalibrated) {
                return (System.currentTimeMillis() - this.localTimeToCali) + this.serverTimeToCali;
            }
            return -1;
        }

        public TimeCalibration() {
        }

        public String getServerTimeStr(String str) {
            long serverTime = getServerTime();
            if (serverTime == -1) {
                serverTime = System.currentTimeMillis();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.format(Long.valueOf(serverTime));
        }

        public void updateServerTime(long j, long j2) {
            if (j > 0) {
                this.serverTimeToCali = j;
                this.localTimeToCali = j2;
                this.isCalibrated = true;
                StringBuilder sb = new StringBuilder("updateServerTime servertime:");
                sb.append(j);
                sb.append(" localtime:");
                sb.append(j2);
                TTVideoEngineLog.m110644d("AuthTimer", sb.toString());
            }
        }
    }

    public TimeCalibration getTimeCalibration() {
        return this.mTimeCalibration;
    }

    public static AuthTimer getInstance() {
        if (mInstance == null) {
            synchronized (AuthTimer.class) {
                if (mInstance == null) {
                    mInstance = new AuthTimer();
                }
            }
        }
        return mInstance;
    }

    private AuthTimer() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(TTHelper.getLooper());
        }
        this.mTimeCalibration = new TimeCalibration();
        this.mSTSAuthMap = new HashMap();
        this.mRunnableMap = new HashMap();
    }

    public synchronized void cancel() {
        if (this.mHandler != null) {
            for (Runnable removeCallbacks : this.mRunnableMap.values()) {
                this.mHandler.removeCallbacks(removeCallbacks);
            }
        }
    }

    public void setAuthTimerListener(AuthTimerListener authTimerListener) {
        this.mListener = authTimerListener;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public synchronized void updateSTS(String str) {
        postUpdate(str, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.p683ss.ttvideoengine.AuthTimer.STSAuth getAuth(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Map<java.lang.String, com.ss.ttvideoengine.AuthTimer$STSAuth> r0 = r8.mSTSAuthMap     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0035 }
            com.ss.ttvideoengine.AuthTimer$STSAuth r0 = (com.p683ss.ttvideoengine.AuthTimer.STSAuth) r0     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0013
            r8.postUpdate(r9, r1)     // Catch:{ all -> 0x0035 }
            r9 = 0
            monitor-exit(r8)
            return r9
        L_0x0013:
            long r3 = r0.AuthExpiredTimeInLong     // Catch:{ all -> 0x0035 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            long r3 = r0.CurServerTimeInLong     // Catch:{ all -> 0x0035 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            long r3 = r0.AuthExpiredTimeInLong     // Catch:{ all -> 0x0035 }
            long r5 = r0.getServerTime()     // Catch:{ all -> 0x0035 }
            r7 = 0
            long r3 = r3 - r5
            int r5 = r8.TIMEOUT_UPDATE_THRESHOLD_MILLI     // Catch:{ all -> 0x0035 }
            int r5 = r5 + -30000
            long r5 = (long) r5     // Catch:{ all -> 0x0035 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0033
            r8.postUpdate(r9, r1)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r8)
            return r0
        L_0x0035:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.AuthTimer.getAuth(java.lang.String):com.ss.ttvideoengine.AuthTimer$STSAuth");
    }

    public synchronized void setTag(String str) {
        if (!this.mRunnableMap.containsKey(str)) {
            this.mSTSAuthMap.put(str, null);
            MyRunnable myRunnable = new MyRunnable(str);
            this.mRunnableMap.put(str, myRunnable);
            this.mHandler.postDelayed(myRunnable, 0);
        }
    }

    private void postUpdate(String str, long j) {
        Runnable runnable = (Runnable) this.mRunnableMap.get(str);
        if (runnable == null) {
            runnable = new MyRunnable(str);
            this.mRunnableMap.put(str, runnable);
        } else {
            this.mHandler.removeCallbacks(runnable);
        }
        this.mHandler.postDelayed(runnable, j);
    }

    public static long getMilliSeconds(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                return simpleDateFormat.parse(str).getTime();
            } catch (ParseException e) {
                TTVideoEngineLog.m110645d(e);
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setAuth(com.p683ss.ttvideoengine.AuthTimer.STSAuth r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 != 0) goto L_0x0005
            monitor-exit(r8)
            return
        L_0x0005:
            java.util.Map<java.lang.String, com.ss.ttvideoengine.AuthTimer$STSAuth> r0 = r8.mSTSAuthMap     // Catch:{ all -> 0x0081 }
            r0.put(r10, r9)     // Catch:{ all -> 0x0081 }
            long r0 = r9.CurServerTimeInLong     // Catch:{ all -> 0x0081 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x001b
            com.ss.ttvideoengine.AuthTimer$TimeCalibration r0 = r8.mTimeCalibration     // Catch:{ all -> 0x0081 }
            long r4 = r9.CurServerTimeInLong     // Catch:{ all -> 0x0081 }
            long r6 = r9.CurLocalTimeInLong     // Catch:{ all -> 0x0081 }
            r0.updateServerTime(r4, r6)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            if (r11 == 0) goto L_0x001f
            monitor-exit(r8)
            return
        L_0x001f:
            long r0 = r9.AuthExpiredTimeInLong     // Catch:{ all -> 0x0081 }
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x007f
            long r0 = r9.CurServerTimeInLong     // Catch:{ all -> 0x0081 }
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x007f
            long r0 = r9.getServerTime()     // Catch:{ all -> 0x0081 }
            long r4 = r9.AuthExpiredTimeInLong     // Catch:{ all -> 0x0081 }
            r11 = 0
            long r4 = r4 - r0
            int r11 = r8.TIMEOUT_UPDATE_THRESHOLD_MILLI     // Catch:{ all -> 0x0081 }
            long r6 = (long) r11     // Catch:{ all -> 0x0081 }
            long r4 = r4 - r6
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x0048
            int r11 = r8.mContinuousExpCount     // Catch:{ all -> 0x0081 }
            int r11 = r11 + 1
            r8.mContinuousExpCount = r11     // Catch:{ all -> 0x0081 }
            int r11 = r8.mContinuousExpCount     // Catch:{ all -> 0x0081 }
            r2 = 3
            if (r11 <= r2) goto L_0x004b
            monitor-exit(r8)
            return
        L_0x0048:
            r11 = 0
            r8.mContinuousExpCount = r11     // Catch:{ all -> 0x0081 }
        L_0x004b:
            java.lang.String r11 = "AuthTimer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "setAuth mAuthExpiredTimeInLong:"
            r2.<init>(r3)     // Catch:{ all -> 0x0081 }
            long r6 = r9.AuthExpiredTimeInLong     // Catch:{ all -> 0x0081 }
            r2.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = " currentSeverT:"
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            r2.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = " diff:"
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            long r6 = r9.AuthExpiredTimeInLong     // Catch:{ all -> 0x0081 }
            r9 = 0
            long r6 = r6 - r0
            r2.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = " timeToUpdate"
            r2.append(r9)     // Catch:{ all -> 0x0081 }
            r2.append(r4)     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x0081 }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r11, r9)     // Catch:{ all -> 0x0081 }
            r8.postUpdate(r10, r4)     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r8)
            return
        L_0x0081:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.AuthTimer.setAuth(com.ss.ttvideoengine.AuthTimer$STSAuth, java.lang.String, boolean):void");
    }
}
