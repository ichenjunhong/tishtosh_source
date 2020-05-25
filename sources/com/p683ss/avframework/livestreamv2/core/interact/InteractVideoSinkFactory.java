package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.InteractEngine.SEIListener;
import com.p683ss.video.rtc.interact.video.VideoSink;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoSinkFactory */
class InteractVideoSinkFactory implements VideoSinkFactory {
    private InteractEngineBuilder mBuilder;
    private final InteractEngine mEngine;
    private SEIListener mSEIListener;
    private Map<String, InteractVideoSink> mVideoSinkMap = new ConcurrentHashMap();

    /* access modifiers changed from: 0000 */
    public InteractVideoSink getVideoSink(String str) {
        return (InteractVideoSink) this.mVideoSinkMap.get(str);
    }

    public void destroy(VideoSink videoSink) {
        if (videoSink != null) {
            this.mVideoSinkMap.remove(videoSink.getInteractId());
            ((InteractVideoSink) videoSink).release();
        }
    }

    public VideoSink create(String str, boolean z) {
        InteractVideoSink interactVideoSink = new InteractVideoSink(str, z, this.mEngine, this.mSEIListener);
        this.mVideoSinkMap.put(str, interactVideoSink);
        return interactVideoSink;
    }

    public InteractVideoSinkFactory(InteractEngine interactEngine, SEIListener sEIListener) {
        this.mSEIListener = sEIListener;
        this.mBuilder = interactEngine.getBuilder();
        this.mEngine = interactEngine;
    }
}
