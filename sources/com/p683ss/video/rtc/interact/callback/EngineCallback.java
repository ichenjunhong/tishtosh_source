package com.p683ss.video.rtc.interact.callback;

import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.interact.callback.EngineCallback */
public interface EngineCallback {
    void onAudioVolumeIndication(String[] strArr, int[] iArr, int i);

    void onConnectionInterrupted();

    void onConnectionLost();

    void onDestroyFailed(int i, String str);

    void onDestroySuccess();

    void onError(String str);

    void onFirstLocalAudioFrame(int i);

    void onFirstRemoteAudioFrame(String str, int i);

    void onFirstRemoteVideoFrame(String str, View view, int i);

    void onInitFailed(int i, String str);

    void onInitSuccess();

    void onLogReport(String str, JSONObject jSONObject);

    void onNetworkQuality(String str, int i, int i2);

    void onPublishStreamRetrySuccess(String str);

    void onPublishStreamTempDisconnect(String str);

    void onPullStreamRetrySuccess(String str);

    void onPullStreamTempDisconnect(String str);

    void onPushStreamQuality(long j, long j2);

    void onReconnected(int i);

    void onStartFailed(int i, String str);

    void onStartSuccess(int i);

    void onStopFailed(int i, String str);

    void onStopSuccess();

    void onStreamDelay(int i);

    void onStreamPublishSucceed();

    void onTalkStateUpdated(String[] strArr, boolean[] zArr);

    void onUserEnableAudio(String str, boolean z);

    void onUserEnableLocalAudio(String str, boolean z);

    void onUserEnableLocalVideo(String str, boolean z);

    void onUserEnableVideo(String str, boolean z);

    void onUserJoined(String str, int i);

    void onUserLeaved(String str, int i);

    void onUserMuteAudio(String str, boolean z);

    void onWarn(String str);
}
