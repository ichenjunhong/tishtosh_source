package com.p683ss.video.rtc.engine.RtcEngineImpl;

import com.p683ss.video.rtc.engine.utils.ExtVideoFrame;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$7 */
final /* synthetic */ class RtcEngineImpl$$Lambda$7 implements Runnable {
    private final C51644RtcEngineImpl arg$1;
    private final ExtVideoFrame arg$2;
    private final VideoFrame arg$3;
    private final long arg$4;

    RtcEngineImpl$$Lambda$7(C51644RtcEngineImpl rtcEngineImpl, ExtVideoFrame extVideoFrame, VideoFrame videoFrame, long j) {
        this.arg$1 = rtcEngineImpl;
        this.arg$2 = extVideoFrame;
        this.arg$3 = videoFrame;
        this.arg$4 = j;
    }

    public final void run() {
        this.arg$1.lambda$pushExternalVideoFrame$7$RtcEngineImpl(this.arg$2, this.arg$3, this.arg$4);
    }
}
