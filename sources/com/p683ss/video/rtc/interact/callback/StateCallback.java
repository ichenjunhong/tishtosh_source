package com.p683ss.video.rtc.interact.callback;

/* renamed from: com.ss.video.rtc.interact.callback.StateCallback */
public interface StateCallback {
    void onEndFailed(int i, String str);

    void onEndSuccess();

    void onError(String str);

    void onStartFailed(int i, String str);

    void onStartSuccess(int i);

    void onWarn(String str);
}
