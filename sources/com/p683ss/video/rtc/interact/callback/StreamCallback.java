package com.p683ss.video.rtc.interact.callback;

/* renamed from: com.ss.video.rtc.interact.callback.StreamCallback */
public interface StreamCallback {
    void onPublishStreamRetrySuccess(String str);

    void onPublishStreamTempDisconnect(String str);

    void onPullStreamRetrySuccess(String str);

    void onPullStreamTempDisconnect(String str);
}
