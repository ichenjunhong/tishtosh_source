package com.p683ss.video.rtc.interact.video;

/* renamed from: com.ss.video.rtc.interact.video.VideoClient */
public interface VideoClient {
    void prepare(VideoCallback videoCallback);

    void release();

    void start();

    void stop();
}
