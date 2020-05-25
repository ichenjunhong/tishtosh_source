package com.p683ss.mediakit.medialoader;

/* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoaderListener */
public interface AVMDLDataLoaderListener {
    String getCheckSumInfo(String str);

    long getInt64Value(int i, long j);

    String getStringValue(int i, long j, String str);

    void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo);
}
