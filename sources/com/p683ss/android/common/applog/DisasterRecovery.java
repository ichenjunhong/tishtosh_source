package com.p683ss.android.common.applog;

import com.bytedance.common.utility.C9374b;
import com.bytedance.common.utility.C9431p;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.common.applog.DisasterRecovery */
public class DisasterRecovery {
    private volatile ConcurrentHashMap<String, RecoveryInfo> mSendInfos = new ConcurrentHashMap<>();

    /* renamed from: com.ss.android.common.applog.DisasterRecovery$RecoveryInfo */
    class RecoveryInfo {
        int mHasSendtimes;
        long mLastSendTime;
        long mLastSuccessSendTime;
        long mLimitSendTimes;
        long mScanInterval;

        public RecoveryInfo(long j, long j2, long j3, int i) {
            this.mLastSendTime = j;
            this.mScanInterval = j2;
            this.mLimitSendTimes = j3;
            this.mHasSendtimes = i;
        }
    }

    public void handleSuccess(String str) {
        if (!C9431p.m18664a(str) && this.mSendInfos.containsKey(str)) {
            RecoveryInfo recoveryInfo = (RecoveryInfo) this.mSendInfos.get(str);
            if (recoveryInfo.mScanInterval != 120000) {
                recoveryInfo.mScanInterval = 120000;
            }
            if (System.currentTimeMillis() - recoveryInfo.mLastSuccessSendTime > 120000) {
                recoveryInfo.mLimitSendTimes++;
                recoveryInfo.mLastSuccessSendTime = System.currentTimeMillis();
            }
        }
    }

    public boolean isCanSend(String str) {
        if (C9431p.m18664a(str) || !this.mSendInfos.containsKey(str)) {
            return true;
        }
        RecoveryInfo recoveryInfo = (RecoveryInfo) this.mSendInfos.get(str);
        if (System.currentTimeMillis() - recoveryInfo.mLastSendTime > recoveryInfo.mScanInterval) {
            recoveryInfo.mHasSendtimes = 1;
            recoveryInfo.mLastSendTime = System.currentTimeMillis();
            return true;
        } else if (((long) recoveryInfo.mHasSendtimes) >= recoveryInfo.mLimitSendTimes) {
            return false;
        } else {
            recoveryInfo.mHasSendtimes++;
            return true;
        }
    }

    public void registerUrl(String str) {
        if (!C9431p.m18664a(str) && !this.mSendInfos.containsKey(str)) {
            RecoveryInfo recoveryInfo = new RecoveryInfo(System.currentTimeMillis(), 120000, 12, 0);
            this.mSendInfos.put(str, recoveryInfo);
        }
    }

    public void handleException(String str, Throwable th) {
        if (th instanceof C9374b) {
            int responseCode = ((C9374b) th).getResponseCode();
            if (responseCode >= 500 && responseCode < 600 && this.mSendInfos.containsKey(str)) {
                RecoveryInfo recoveryInfo = (RecoveryInfo) this.mSendInfos.get(str);
                if (recoveryInfo.mLimitSendTimes > 2) {
                    recoveryInfo.mLimitSendTimes = 2;
                } else if (recoveryInfo.mLimitSendTimes > 0) {
                    recoveryInfo.mLimitSendTimes = 0;
                } else {
                    recoveryInfo.mScanInterval = 900000;
                }
            }
        }
    }
}
