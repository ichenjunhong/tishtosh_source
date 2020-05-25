package com.p683ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTImageXInfo */
public class TTImageXInfo {
    public long mErrcode;
    public int mFileIndex = -1;
    public String mMediaInfo;
    public long mProgress;
    public String mStoreUri;

    public TTImageXInfo(String str, long j, int i, String str2) {
        this.mStoreUri = str;
        this.mProgress = j;
        this.mErrcode = j;
        this.mFileIndex = i;
        this.mMediaInfo = str2;
    }
}
