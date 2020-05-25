package com.p683ss.video.rtc.interact.audio;

/* renamed from: com.ss.video.rtc.interact.audio.AudioClientFactory */
public interface AudioClientFactory {
    AudioClient create();

    void destroy(AudioClient audioClient);
}
