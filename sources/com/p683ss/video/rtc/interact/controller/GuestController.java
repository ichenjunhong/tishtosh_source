package com.p683ss.video.rtc.interact.controller;

import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;

/* renamed from: com.ss.video.rtc.interact.controller.GuestController */
public class GuestController extends BaseController {
    public GuestController(Config config, VideoClientFactory videoClientFactory) {
        this(config, videoClientFactory, null, null, null);
    }

    public GuestController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory) {
        super(config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory);
    }
}
