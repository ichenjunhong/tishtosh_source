package com.p683ss.video.rtc.interact.callback;

import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.interact.callback.QualityCallback */
public interface QualityCallback {
    void onConnectionInterrupted();

    void onConnectionLost();

    void onLogMonitor(String str, JSONObject jSONObject);

    void onNetworkQuality(String str, int i, int i2);

    void onPushStreamQuality(long j, long j2);

    void onReconnected(int i);

    void onStreamDelay(int i);

    void onStreamPublishSucceed();
}
