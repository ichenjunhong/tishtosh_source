package com.p683ss.video.rtc.engine;

import com.p683ss.video.rtc.engine.utils.ByteAudioFrame;

/* renamed from: com.ss.video.rtc.engine.IAudioFrameObserver */
public interface IAudioFrameObserver {
    void onMixedAudioFrame(ByteAudioFrame byteAudioFrame);

    void onPlaybackAudioFrame(ByteAudioFrame byteAudioFrame);

    void onPlaybackAudioFrameBeforeMixing(String str, ByteAudioFrame byteAudioFrame);

    void onRecordAudioFrame(ByteAudioFrame byteAudioFrame);
}
