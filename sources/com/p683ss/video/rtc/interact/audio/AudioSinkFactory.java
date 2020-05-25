package com.p683ss.video.rtc.interact.audio;

/* renamed from: com.ss.video.rtc.interact.audio.AudioSinkFactory */
public interface AudioSinkFactory {
    AudioSink create();

    void destroy(AudioSink audioSink);
}
