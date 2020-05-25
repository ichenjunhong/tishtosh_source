package com.p683ss.video.rtc.engine.RtcEngineImpl;

import com.p683ss.video.rtc.engine.VideoCanvas;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$9 */
final /* synthetic */ class RtcEngineImpl$$Lambda$9 implements Runnable {
    private final C51644RtcEngineImpl arg$1;
    private final VideoCanvas arg$2;

    RtcEngineImpl$$Lambda$9(C51644RtcEngineImpl rtcEngineImpl, VideoCanvas videoCanvas) {
        this.arg$1 = rtcEngineImpl;
        this.arg$2 = videoCanvas;
    }

    public final void run() {
        this.arg$1.lambda$setupLocalScreen$9$RtcEngineImpl(this.arg$2);
    }
}
