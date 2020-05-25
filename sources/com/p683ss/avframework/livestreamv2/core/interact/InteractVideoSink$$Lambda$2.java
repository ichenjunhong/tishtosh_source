package com.p683ss.avframework.livestreamv2.core.interact;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink$$Lambda$2 */
final /* synthetic */ class InteractVideoSink$$Lambda$2 implements Runnable {
    private final InteractVideoSink arg$1;
    private final int arg$2;
    private final int arg$3;

    InteractVideoSink$$Lambda$2(InteractVideoSink interactVideoSink, int i, int i2) {
        this.arg$1 = interactVideoSink;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$createTexture$2$InteractVideoSink(this.arg$2, this.arg$3);
    }
}
