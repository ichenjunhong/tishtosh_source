package com.p683ss.video.rtc.interact.video;

/* renamed from: com.ss.video.rtc.interact.video.VideoClientFactory */
public interface VideoClientFactory {
    VideoClient create();

    void destroy(VideoClient videoClient);
}
