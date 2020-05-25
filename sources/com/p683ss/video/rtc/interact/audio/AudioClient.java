package com.p683ss.video.rtc.interact.audio;

/* renamed from: com.ss.video.rtc.interact.audio.AudioClient */
public interface AudioClient {
    int getBitWidth();

    int getChannelCount();

    int getSampleRate();

    void prepare(AudioCallback audioCallback);

    void release();

    void start();

    void stop();
}
