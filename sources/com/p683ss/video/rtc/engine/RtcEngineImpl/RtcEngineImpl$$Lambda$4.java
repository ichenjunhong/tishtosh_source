package com.p683ss.video.rtc.engine.RtcEngineImpl;

import com.p683ss.video.rtc.engine.VideoCanvas;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$4 */
final /* synthetic */ class RtcEngineImpl$$Lambda$4 implements Runnable {
    private final C51644RtcEngineImpl arg$1;
    private final VideoCanvas arg$2;

    RtcEngineImpl$$Lambda$4(C51644RtcEngineImpl rtcEngineImpl, VideoCanvas videoCanvas) {
        this.arg$1 = rtcEngineImpl;
        this.arg$2 = videoCanvas;
    }

    public final void run() {
        this.arg$1.lambda$setupRemoteVideo$4$RtcEngineImpl(this.arg$2);
    }
}
