package com.p683ss.ttvideoengine.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.p683ss.ttvideoengine.TTVideoEngineConfig;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.ttvideoengine.utils.PerformanceUtils */
public class PerformanceUtils {
    public boolean mAboveAndroidO;
    private ActivityManager mActivityManager;
    private RandomAccessFile mAppStatFile;
    public ArrayList<Float> mCpuArrayList;
    public Handler mHandler;
    private Long mLastAppCpuTime;
    private Long mLastCpuTime;
    public ArrayList<Float> mMemArrayList;
    private RandomAccessFile mProcStatFile;
    private GetDataRunnable mRunnable;
    public AtomicBoolean mRunnableRunning = new AtomicBoolean(false);

    /* renamed from: com.ss.ttvideoengine.utils.PerformanceUtils$GetDataRunnable */
    class GetDataRunnable implements Runnable {
        public Context mContext;
        public int mIndex;
        private final int mUpdatePeriod = 3000;

        public void run() {
            EngineThreadPool.addExecuteTask(new Runnable() {
                public void run() {
                    if (PerformanceUtils.this.mRunnableRunning.get()) {
                        synchronized (PerformanceUtils.class) {
                            if (PerformanceUtils.this.mAboveAndroidO) {
                                float _getCpuDataForO = PerformanceUtils.this._getCpuDataForO();
                                if (_getCpuDataForO > 0.0f && PerformanceUtils.this.mCpuArrayList != null) {
                                    PerformanceUtils.this.mCpuArrayList.add(Float.valueOf(_getCpuDataForO));
                                }
                            }
                            if (GetDataRunnable.this.mIndex % 2 == 0) {
                                float _getMemoryData = PerformanceUtils.this._getMemoryData(GetDataRunnable.this.mContext);
                                if (_getMemoryData > 0.0f && PerformanceUtils.this.mMemArrayList != null) {
                                    PerformanceUtils.this.mMemArrayList.add(Float.valueOf(_getMemoryData));
                                }
                            }
                        }
                        GetDataRunnable.this.mIndex++;
                        if (PerformanceUtils.this.mRunnableRunning.get() && PerformanceUtils.this.mHandler != null) {
                            PerformanceUtils.this.mHandler.postDelayed(this, 3000);
                        }
                    }
                }
            });
        }

        public GetDataRunnable(Context context) {
            this.mContext = context;
        }
    }

    public void start() {
        if (TTVideoEngineConfig.openPerformanceUtils) {
            this.mRunnableRunning.set(true);
            if (!this.mAboveAndroidO) {
                _getCPUData();
            }
            if (this.mHandler != null) {
                this.mHandler.post(this.mRunnable);
            }
        }
    }

    public float getMemoryData() {
        float f;
        if (!TTVideoEngineConfig.openPerformanceUtils || this.mMemArrayList == null || this.mMemArrayList.isEmpty()) {
            return -1.0f;
        }
        synchronized (PerformanceUtils.class) {
            float f2 = 0.0f;
            int size = this.mMemArrayList.size();
            for (int i = 0; i < size; i++) {
                f2 += ((Float) this.mMemArrayList.get(i)).floatValue();
            }
            f = f2 / ((float) size);
        }
        return f;
    }

    public void stop() {
        if (TTVideoEngineConfig.openPerformanceUtils) {
            this.mRunnableRunning.set(false);
            if (this.mHandler != null) {
                this.mHandler.removeCallbacks(this.mRunnable);
            }
            if (this.mCpuArrayList != null) {
                this.mCpuArrayList.clear();
            }
            if (this.mMemArrayList != null) {
                this.mMemArrayList.clear();
            }
        }
    }

    public float getCpuData() {
        float f;
        if (!TTVideoEngineConfig.openPerformanceUtils) {
            return -1.0f;
        }
        if (!this.mAboveAndroidO) {
            return _getCPUData();
        }
        if (this.mCpuArrayList == null || this.mCpuArrayList.isEmpty()) {
            return -1.0f;
        }
        synchronized (PerformanceUtils.class) {
            float f2 = 0.0f;
            int size = this.mCpuArrayList.size();
            for (int i = 0; i < size; i++) {
                f2 += ((Float) this.mCpuArrayList.get(i)).floatValue();
            }
            f = f2 / ((float) size);
        }
        return f;
    }

    private float _getCPUData() {
        long parseLong;
        long parseLong2;
        float f = 0.0f;
        try {
            if (this.mProcStatFile != null) {
                if (this.mAppStatFile != null) {
                    this.mProcStatFile.seek(0);
                    this.mAppStatFile.seek(0);
                    String readLine = this.mProcStatFile.readLine();
                    String readLine2 = this.mAppStatFile.readLine();
                    String[] split = readLine.split(" ");
                    String[] split2 = readLine2.split(" ");
                    parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[5]) + Long.parseLong(split[6]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                    parseLong2 = Long.parseLong(split2[13]) + Long.parseLong(split2[14]);
                    if (this.mLastCpuTime == null || this.mLastAppCpuTime != null) {
                        f = 100.0f * (((float) (parseLong2 - this.mLastAppCpuTime.longValue())) / ((float) (parseLong - this.mLastCpuTime.longValue())));
                        this.mLastCpuTime = Long.valueOf(parseLong);
                        this.mLastAppCpuTime = Long.valueOf(parseLong2);
                        return f;
                    }
                    this.mLastCpuTime = Long.valueOf(parseLong);
                    this.mLastAppCpuTime = Long.valueOf(parseLong2);
                    return 0.0f;
                }
            }
            this.mProcStatFile = new RandomAccessFile("/proc/stat", "r");
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/stat");
            this.mAppStatFile = new RandomAccessFile(sb.toString(), "r");
            String readLine3 = this.mProcStatFile.readLine();
            String readLine22 = this.mAppStatFile.readLine();
            String[] split3 = readLine3.split(" ");
            String[] split22 = readLine22.split(" ");
            parseLong = Long.parseLong(split3[2]) + Long.parseLong(split3[3]) + Long.parseLong(split3[4]) + Long.parseLong(split3[5]) + Long.parseLong(split3[6]) + Long.parseLong(split3[7]) + Long.parseLong(split3[8]);
            parseLong2 = Long.parseLong(split22[13]) + Long.parseLong(split22[14]);
            if (this.mLastCpuTime == null) {
            }
            f = 100.0f * (((float) (parseLong2 - this.mLastAppCpuTime.longValue())) / ((float) (parseLong - this.mLastCpuTime.longValue())));
            this.mLastCpuTime = Long.valueOf(parseLong);
            this.mLastAppCpuTime = Long.valueOf(parseLong2);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("getCPUData fail: ");
            sb2.append(e.toString());
            TTVideoEngineLog.m110646e("PerformanceUtils", sb2.toString());
        }
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float _getCpuDataForO() {
        /*
            r7 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0089, all -> 0x007f }
            java.lang.String r2 = "top -n 1"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ IOException -> 0x0089, all -> 0x007f }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            r2 = -1
            r3 = -1
        L_0x001b:
            java.lang.String r4 = r0.readLine()     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            if (r4 == 0) goto L_0x0075
            java.lang.String r4 = r4.trim()     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            if (r5 != 0) goto L_0x001b
            int r5 = r7._getCPUIndex(r4)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            if (r5 == r2) goto L_0x0033
            r3 = r5
            goto L_0x001b
        L_0x0033:
            int r5 = android.os.Process.myPid()     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            boolean r5 = r4.startsWith(r5)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            if (r5 == 0) goto L_0x001b
            if (r3 == r2) goto L_0x001b
            java.lang.String r5 = "\\s+"
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            int r5 = r4.length     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            if (r5 <= r3) goto L_0x001b
            r0 = r4[r3]     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            java.lang.String r2 = "%"
            boolean r2 = r0.endsWith(r2)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            if (r2 == 0) goto L_0x0061
            r2 = 0
            java.lang.String r3 = "%"
            int r3 = r0.lastIndexOf(r3)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = r0.substring(r2, r3)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
        L_0x0061:
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            int r2 = r2.availableProcessors()     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            float r2 = (float) r2
            float r0 = r0 / r2
            if (r1 == 0) goto L_0x0074
            r1.destroy()
        L_0x0074:
            return r0
        L_0x0075:
            if (r1 == 0) goto L_0x008e
            r1.destroy()
            goto L_0x008e
        L_0x007b:
            r0 = move-exception
            goto L_0x0083
        L_0x007d:
            r0 = r1
            goto L_0x0089
        L_0x007f:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0083:
            if (r1 == 0) goto L_0x0088
            r1.destroy()
        L_0x0088:
            throw r0
        L_0x0089:
            if (r0 == 0) goto L_0x008e
            r0.destroy()
        L_0x008e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.utils.PerformanceUtils._getCpuDataForO():float");
    }

    private int _getCPUIndex(String str) {
        if (str.contains("CPU")) {
            String[] split = str.split("\\s+");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains("CPU")) {
                    return i;
                }
            }
        }
        return -1;
    }

    public PerformanceUtils(Context context) {
        if (TTVideoEngineConfig.openPerformanceUtils) {
            this.mHandler = new Handler(Looper.getMainLooper());
            if (VERSION.SDK_INT >= 26) {
                this.mAboveAndroidO = true;
            } else {
                this.mAboveAndroidO = false;
            }
            this.mRunnable = new GetDataRunnable(context);
            if (this.mAboveAndroidO) {
                this.mCpuArrayList = new ArrayList<>();
            }
            this.mMemArrayList = new ArrayList<>();
        }
    }

    public float _getMemoryData(Context context) {
        try {
            if (this.mActivityManager == null) {
                this.mActivityManager = (ActivityManager) context.getSystemService("activity");
            }
            MemoryInfo[] processMemoryInfo = this.mActivityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo.length <= 0) {
                return 0.0f;
            }
            int totalPss = processMemoryInfo[0].getTotalPss();
            if (totalPss >= 0) {
                return ((float) totalPss) / 1024.0f;
            }
            return 0.0f;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("getMemoryData fail: ");
            sb.append(e.toString());
            TTVideoEngineLog.m110646e("PerformanceUtils", sb.toString());
            return 0.0f;
        }
    }
}
