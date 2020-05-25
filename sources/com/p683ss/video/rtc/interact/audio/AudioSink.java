package com.p683ss.video.rtc.interact.audio;

import java.nio.ByteBuffer;

/* renamed from: com.ss.video.rtc.interact.audio.AudioSink */
public interface AudioSink {
    boolean autoPlay();

    int getBitWidth();

    int getChannelCount();

    int getIntervalMs();

    int getSampleRate();

    void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);
}
