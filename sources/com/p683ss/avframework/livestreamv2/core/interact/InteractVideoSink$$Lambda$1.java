package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.video.rtc.interact.model.CommonType.VideoOutputFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink$$Lambda$1 */
final /* synthetic */ class InteractVideoSink$$Lambda$1 implements Runnable {
    private final InteractVideoSink arg$1;
    private final ByteBuffer arg$2;
    private final int arg$3;
    private final int arg$4;
    private final VideoOutputFormat arg$5;
    private final AtomicBoolean arg$6;

    InteractVideoSink$$Lambda$1(InteractVideoSink interactVideoSink, ByteBuffer byteBuffer, int i, int i2, VideoOutputFormat videoOutputFormat, AtomicBoolean atomicBoolean) {
        this.arg$1 = interactVideoSink;
        this.arg$2 = byteBuffer;
        this.arg$3 = i;
        this.arg$4 = i2;
        this.arg$5 = videoOutputFormat;
        this.arg$6 = atomicBoolean;
    }

    public final void run() {
        this.arg$1.lambda$loadYuvAndDraw$1$InteractVideoSink(this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6);
    }
}
