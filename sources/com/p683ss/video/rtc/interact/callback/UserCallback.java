package com.p683ss.video.rtc.interact.callback;

import android.view.View;

/* renamed from: com.ss.video.rtc.interact.callback.UserCallback */
public interface UserCallback {
    void onAudioVolumeIndication(String[] strArr, int[] iArr, int i);

    void onFirstLocalAudioFrame(int i);

    void onFirstRemoteAudioFrame(String str, int i);

    void onFirstRemoteVideoFrame(String str, View view, int i);

    void onTalkStateUpdated(String[] strArr, boolean[] zArr);

    void onUserEnableAudio(String str, boolean z);

    void onUserEnableLocalAudio(String str, boolean z);

    void onUserEnableLocalVideo(String str, boolean z);

    void onUserEnableVideo(String str, boolean z);

    void onUserJoined(String str, int i);

    void onUserLeaved(String str, int i);

    void onUserMuteAudio(String str, boolean z);
}
