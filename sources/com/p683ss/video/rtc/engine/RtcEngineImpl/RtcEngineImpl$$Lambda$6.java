package com.p683ss.video.rtc.engine.RtcEngineImpl;

import com.p683ss.video.rtc.engine.VideoCanvas;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$6 */
final /* synthetic */ class RtcEngineImpl$$Lambda$6 implements Runnable {
    private final C51644RtcEngineImpl arg$1;
    private final VideoCanvas arg$2;

    RtcEngineImpl$$Lambda$6(C51644RtcEngineImpl rtcEngineImpl, VideoCanvas videoCanvas) {
        this.arg$1 = rtcEngineImpl;
        this.arg$2 = videoCanvas;
    }

    public final void run() {
        this.arg$1.lambda$setupRemoteScreen$6$RtcEngineImpl(this.arg$2);
    }
}
