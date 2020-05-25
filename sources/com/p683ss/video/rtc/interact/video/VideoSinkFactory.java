package com.p683ss.video.rtc.interact.video;

/* renamed from: com.ss.video.rtc.interact.video.VideoSinkFactory */
public interface VideoSinkFactory {
    VideoSink create(String str, boolean z);

    void destroy(VideoSink videoSink);
}
