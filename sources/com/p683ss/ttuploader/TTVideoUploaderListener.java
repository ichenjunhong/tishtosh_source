package com.p683ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTVideoUploaderListener */
public interface TTVideoUploaderListener {
    String getStringFromExtern(int i);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, TTVideoInfo tTVideoInfo);

    void onUploadVideoStage(int i, long j);

    int videoUploadCheckNetState(int i, int i2);
}
