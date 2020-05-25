package com.p683ss.video.rtc.engine.adapter;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.adapter.VideoSinkAdapter$$Lambda$2 */
final /* synthetic */ class VideoSinkAdapter$$Lambda$2 implements Runnable {
    private final VideoSinkAdapter arg$1;
    private final ByteBufferHolder arg$2;
    private final ByteBuffer arg$3;
    private final VideoFrame arg$4;
    private final long arg$5;

    VideoSinkAdapter$$Lambda$2(VideoSinkAdapter videoSinkAdapter, ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, VideoFrame videoFrame, long j) {
        this.arg$1 = videoSinkAdapter;
        this.arg$2 = byteBufferHolder;
        this.arg$3 = byteBuffer;
        this.arg$4 = videoFrame;
        this.arg$5 = j;
    }

    public final void run() {
        this.arg$1.lambda$onVideoFrame$2$VideoSinkAdapter(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
